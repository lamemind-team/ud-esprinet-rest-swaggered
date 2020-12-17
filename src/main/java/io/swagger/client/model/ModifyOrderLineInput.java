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
 * ModifyOrderLineInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T14:59:51.596+01:00")
public class ModifyOrderLineInput {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public ModifyOrderLineInput id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the order line to modify.  &lt;remarks&gt;  Evaluate to 0 to add a new line.  Evaluate to a specific {Esprinet.WebServices.Dtos.Order.OrderLineDto.Id} to update or delete an existing order line.  &lt;/remarks&gt;
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the order line to modify.  <remarks>  Evaluate to 0 to add a new line.  Evaluate to a specific {Esprinet.WebServices.Dtos.Order.OrderLineDto.Id} to update or delete an existing order line.  </remarks>")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ModifyOrderLineInput productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * The Esprinet product code to be added to the line subject of modification.  &lt;remarks&gt;  Evaluate only when appending a new line.  &lt;/remarks&gt;
   * @return productCode
  **/
  @ApiModelProperty(value = "The Esprinet product code to be added to the line subject of modification.  <remarks>  Evaluate only when appending a new line.  </remarks>")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public ModifyOrderLineInput quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Order line quantity.  &lt;remarks&gt;  Evaluate to 0 to delete the specified order line.  Evaluate to a quantity greater than 0 to modify the ordered quantity of the order line.  &lt;/remarks&gt;
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Order line quantity.  <remarks>  Evaluate to 0 to delete the specified order line.  Evaluate to a quantity greater than 0 to modify the ordered quantity of the order line.  </remarks>")
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
    ModifyOrderLineInput modifyOrderLineInput = (ModifyOrderLineInput) o;
    return Objects.equals(this.id, modifyOrderLineInput.id) &&
        Objects.equals(this.productCode, modifyOrderLineInput.productCode) &&
        Objects.equals(this.quantity, modifyOrderLineInput.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productCode, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyOrderLineInput {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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

