package com.algolia.codegen.cts.manager;

import com.algolia.codegen.exceptions.GeneratorException;
import com.algolia.codegen.utils.*;
import java.util.*;
import org.openapitools.codegen.SupportingFile;

public class JavaCTSManager implements CTSManager {

  private final String client;

  public JavaCTSManager(String client) {
    this.client = client;
  }

  @Override
  public void addSupportingFiles(List<SupportingFile> supportingFiles) {
    supportingFiles.add(new SupportingFile("build.mustache", "", "build.gradle"));
  }

  @Override
  public void addDataToBundle(Map<String, Object> bundle) throws GeneratorException {
    bundle.put("packageVersion", Helpers.getClientConfigField("java", "packageVersion"));
    bundle.put("import", Helpers.camelize(this.client).toLowerCase());
  }
}
