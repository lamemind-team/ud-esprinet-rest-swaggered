/*
 * Esprinet Customer Rest Services
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2
 * Contact: dl-ws-integration@esprinet.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QuotationProductDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T14:59:51.596+01:00")
public class QuotationProductDto {
  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("sellPrice")
  private Double sellPrice = null;

  @SerializedName("quotationPrice")
  private Double quotationPrice = null;

  public QuotationProductDto productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @ApiModelProperty(value = "")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public QuotationProductDto quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public QuotationProductDto sellPrice(Double sellPrice) {
    this.sellPrice = sellPrice;
    return this;
  }

   /**
   * Get sellPrice
   * @return sellPrice
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(Double sellPrice) {
    this.sellPrice = sellPrice;
  }

  public QuotationProductDto quotationPrice(Double quotationPrice) {
    this.quotationPrice = quotationPrice;
    return this;
  }

   /**
   * Get quotationPrice
   * @return quotationPrice
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getQuotationPrice() {
    return quotationPrice;
  }

  public void setQuotationPrice(Double quotationPrice) {
    this.quotationPrice = quotationPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotationProductDto quotationProductDto = (QuotationProductDto) o;
    return Objects.equals(this.productCode, quotationProductDto.productCode) &&
        Objects.equals(this.quantity, quotationProductDto.quantity) &&
        Objects.equals(this.sellPrice, quotationProductDto.sellPrice) &&
        Objects.equals(this.quotationPrice, quotationProductDto.quotationPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, quantity, sellPrice, quotationPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotationProductDto {\n");
    
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    quotationPrice: ").append(toIndentedString(quotationPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
