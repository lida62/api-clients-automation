// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.insights;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** ObjectData */
public class ObjectData {

  @JsonProperty("price")
  private Price price;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("discount")
  private Discount discount;

  public ObjectData setPrice(Price price) {
    this.price = price;
    return this;
  }

  /** Get price */
  @javax.annotation.Nullable
  public Price getPrice() {
    return price;
  }

  public ObjectData setQuantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of the purchased or added-to-cart item. The total value of a purchase is the sum
   * of `quantity` multiplied with the `price` for each purchased item.
   */
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public ObjectData setDiscount(Discount discount) {
    this.discount = discount;
    return this;
  }

  /** Get discount */
  @javax.annotation.Nullable
  public Discount getDiscount() {
    return discount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectData objectData = (ObjectData) o;
    return (
      Objects.equals(this.price, objectData.price) &&
      Objects.equals(this.quantity, objectData.quantity) &&
      Objects.equals(this.discount, objectData.discount)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, quantity, discount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectData {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
