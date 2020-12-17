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


package org.lamemind.esprinetclient.model;

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
 * ProductPricingByCodeDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T15:47:59.649+01:00")
public class ProductPricingByCodeDto {
  @SerializedName("sellPrice")
  private Double sellPrice = null;

  @SerializedName("sellPriceWithoutPromos")
  private Double sellPriceWithoutPromos = null;

  @SerializedName("fees")
  private Double fees = null;

  @SerializedName("allowsReverseCharge")
  private Boolean allowsReverseCharge = null;

  @SerializedName("esprinetProductCode")
  private String esprinetProductCode = null;

  @SerializedName("vendorProductCode")
  private String vendorProductCode = null;

  @SerializedName("customerProductCode")
  private String customerProductCode = null;

  @SerializedName("rotationClass")
  private String rotationClass = null;

  public ProductPricingByCodeDto sellPrice(Double sellPrice) {
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

  public ProductPricingByCodeDto sellPriceWithoutPromos(Double sellPriceWithoutPromos) {
    this.sellPriceWithoutPromos = sellPriceWithoutPromos;
    return this;
  }

   /**
   * Get sellPriceWithoutPromos
   * @return sellPriceWithoutPromos
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getSellPriceWithoutPromos() {
    return sellPriceWithoutPromos;
  }

  public void setSellPriceWithoutPromos(Double sellPriceWithoutPromos) {
    this.sellPriceWithoutPromos = sellPriceWithoutPromos;
  }

  public ProductPricingByCodeDto fees(Double fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getFees() {
    return fees;
  }

  public void setFees(Double fees) {
    this.fees = fees;
  }

  public ProductPricingByCodeDto allowsReverseCharge(Boolean allowsReverseCharge) {
    this.allowsReverseCharge = allowsReverseCharge;
    return this;
  }

   /**
   * Get allowsReverseCharge
   * @return allowsReverseCharge
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAllowsReverseCharge() {
    return allowsReverseCharge;
  }

  public void setAllowsReverseCharge(Boolean allowsReverseCharge) {
    this.allowsReverseCharge = allowsReverseCharge;
  }

  public ProductPricingByCodeDto esprinetProductCode(String esprinetProductCode) {
    this.esprinetProductCode = esprinetProductCode;
    return this;
  }

   /**
   * Get esprinetProductCode
   * @return esprinetProductCode
  **/
  @ApiModelProperty(value = "")
  public String getEsprinetProductCode() {
    return esprinetProductCode;
  }

  public void setEsprinetProductCode(String esprinetProductCode) {
    this.esprinetProductCode = esprinetProductCode;
  }

  public ProductPricingByCodeDto vendorProductCode(String vendorProductCode) {
    this.vendorProductCode = vendorProductCode;
    return this;
  }

   /**
   * Get vendorProductCode
   * @return vendorProductCode
  **/
  @ApiModelProperty(value = "")
  public String getVendorProductCode() {
    return vendorProductCode;
  }

  public void setVendorProductCode(String vendorProductCode) {
    this.vendorProductCode = vendorProductCode;
  }

  public ProductPricingByCodeDto customerProductCode(String customerProductCode) {
    this.customerProductCode = customerProductCode;
    return this;
  }

   /**
   * Get customerProductCode
   * @return customerProductCode
  **/
  @ApiModelProperty(value = "")
  public String getCustomerProductCode() {
    return customerProductCode;
  }

  public void setCustomerProductCode(String customerProductCode) {
    this.customerProductCode = customerProductCode;
  }

  public ProductPricingByCodeDto rotationClass(String rotationClass) {
    this.rotationClass = rotationClass;
    return this;
  }

   /**
   * Get rotationClass
   * @return rotationClass
  **/
  @ApiModelProperty(value = "")
  public String getRotationClass() {
    return rotationClass;
  }

  public void setRotationClass(String rotationClass) {
    this.rotationClass = rotationClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPricingByCodeDto productPricingByCodeDto = (ProductPricingByCodeDto) o;
    return Objects.equals(this.sellPrice, productPricingByCodeDto.sellPrice) &&
        Objects.equals(this.sellPriceWithoutPromos, productPricingByCodeDto.sellPriceWithoutPromos) &&
        Objects.equals(this.fees, productPricingByCodeDto.fees) &&
        Objects.equals(this.allowsReverseCharge, productPricingByCodeDto.allowsReverseCharge) &&
        Objects.equals(this.esprinetProductCode, productPricingByCodeDto.esprinetProductCode) &&
        Objects.equals(this.vendorProductCode, productPricingByCodeDto.vendorProductCode) &&
        Objects.equals(this.customerProductCode, productPricingByCodeDto.customerProductCode) &&
        Objects.equals(this.rotationClass, productPricingByCodeDto.rotationClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellPrice, sellPriceWithoutPromos, fees, allowsReverseCharge, esprinetProductCode, vendorProductCode, customerProductCode, rotationClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPricingByCodeDto {\n");
    
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    sellPriceWithoutPromos: ").append(toIndentedString(sellPriceWithoutPromos)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    allowsReverseCharge: ").append(toIndentedString(allowsReverseCharge)).append("\n");
    sb.append("    esprinetProductCode: ").append(toIndentedString(esprinetProductCode)).append("\n");
    sb.append("    vendorProductCode: ").append(toIndentedString(vendorProductCode)).append("\n");
    sb.append("    customerProductCode: ").append(toIndentedString(customerProductCode)).append("\n");
    sb.append("    rotationClass: ").append(toIndentedString(rotationClass)).append("\n");
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

