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
 * CustomerDepotOrderLineInputDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T14:59:51.596+01:00")
public class CustomerDepotOrderLineInputDto {
  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("configuration")
  private String _configuration = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public CustomerDepotOrderLineInputDto productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * CustomerDepot product code.
   * @return productCode
  **/
  @ApiModelProperty(required = true, value = "CustomerDepot product code.")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public CustomerDepotOrderLineInputDto _configuration(String _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Configuration code.
   * @return _configuration
  **/
  @ApiModelProperty(value = "Configuration code.")
  public String getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(String _configuration) {
    this._configuration = _configuration;
  }

  public CustomerDepotOrderLineInputDto quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Amount of items to order.
   * minimum: 1
   * maximum: 2147483647
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Amount of items to order.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDepotOrderLineInputDto customerDepotOrderLineInputDto = (CustomerDepotOrderLineInputDto) o;
    return Objects.equals(this.productCode, customerDepotOrderLineInputDto.productCode) &&
        Objects.equals(this._configuration, customerDepotOrderLineInputDto._configuration) &&
        Objects.equals(this.quantity, customerDepotOrderLineInputDto.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, _configuration, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDepotOrderLineInputDto {\n");
    
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

