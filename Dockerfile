ARG DART_VERSION
ARG GO_VERSION
ARG NODE_VERSION
ARG PHP_VERSION
ARG PYTHON_VERSION

FROM dart:${DART_VERSION} AS dart-builder
FROM golang:${GO_VERSION}-bullseye AS go-builder
FROM python:${PYTHON_VERSION}-bullseye AS python-builder
FROM php:${PHP_VERSION}-bullseye AS builder

ENV DOCKER=true

# use bash for subsequent commands
SHELL ["/bin/bash", "--login", "-c"]

# Global
RUN apt-get update && apt-get install -y --no-install-recommends \
    curl zip unzip git openssh-server \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

# JavaScript
COPY .nvmrc .nvmrc
RUN curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.5/install.sh | bash && source ~/.profile \
    && nvm install \
    && npm install -g yarn

# Python
COPY --from=python-builder /usr/local/bin/ /usr/local/bin/
COPY --from=python-builder /usr/local/lib/ /usr/local/lib/
RUN echo "export PATH=$PATH:/usr/local/bin/python" >> ~/.profile \
    && echo "export PATH=$PATH:/usr/local/bin/pip" >> ~/.profile \
    && pip install --upgrade pip pipx && pipx ensurepath \
    && pipx install poetry

# Go
COPY --from=go-builder /usr/local/go/ /usr/local/go/
RUN echo "export PATH=$PATH:/usr/local/go/bin" >> ~/.profile

# Dart
COPY --from=dart-builder /usr/lib/dart/ /usr/lib/dart/
RUN echo "export PATH=/usr/lib/dart/bin:/root/.pub-cache/bin:$PATH" >> ~/.profile && source ~/.profile \
    && dart pub global activate melos

# PHP
COPY --from=composer:latest /usr/bin/composer /usr/local/bin/composer

# SDKMAN
RUN curl -s "https://get.sdkman.io" | bash
RUN echo "source $HOME/.sdkman/bin/sdkman-init.sh" >> ~/.profile && source ~/.profile

# Java
ARG JAVA_VERSION
RUN sdk install java ${JAVA_VERSION}-tem
ADD https://github.com/google/google-java-format/releases/download/v1.18.1/google-java-format-1.18.1-all-deps.jar /tmp/java-formatter.jar

# Scala
RUN sdk install sbt

# Ruby with RVM, because it's too difficult with the image, dependencies are splattered everywhere
ARG RUBY_VERSION
RUN wget -O ruby.tar.gz https://github.com/postmodern/ruby-install/releases/download/v0.9.2/ruby-install-0.9.2.tar.gz \
    && tar -xzvf ruby.tar.gz && cd ruby && make install && ruby-install ruby ${RUBY_VERSION} && gem install bundler

WORKDIR /app

CMD bash
