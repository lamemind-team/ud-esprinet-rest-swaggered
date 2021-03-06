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
import org.lamemind.esprinetclient.model.BID;

/**
 * InsertOrderLineInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T15:47:59.649+01:00")
public class InsertOrderLineInput {
  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("productGroup")
  private Integer productGroup = null;

  @SerializedName("bid")
  private BID bid = null;

  @SerializedName("customerQuotationId")
  private Integer customerQuotationId = null;

  @SerializedName("customerLineId")
  private String customerLineId = null;

  public InsertOrderLineInput productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Esprinet product code.
   * @return productCode
  **/
  @ApiModelProperty(required = true, value = "Esprinet product code.")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public InsertOrderLineInput quantity(Integer quantity) {
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

  public InsertOrderLineInput productGroup(Integer productGroup) {
    this.productGroup = productGroup;
    return this;
  }

   /**
   * Depending on the availability of each product at the time of the order, items ordered together may not be shipped together. Usually this allows to improve the service to the customer because the delay of a single item&#39;s delivery does not prevent the other items in the order to be shipped. In cases this behaviour is not wanted (like when multiple items are part of a whole, must be used together and splitting the shipping doesn&#39;t make sense) it is possible to change it by setting an integer value from 1 to 5 in this field. Ordered products with the same value for this field are always shipped together as a whole.
   * @return productGroup
  **/
  @ApiModelProperty(value = "Depending on the availability of each product at the time of the order, items ordered together may not be shipped together. Usually this allows to improve the service to the customer because the delay of a single item's delivery does not prevent the other items in the order to be shipped. In cases this behaviour is not wanted (like when multiple items are part of a whole, must be used together and splitting the shipping doesn't make sense) it is possible to change it by setting an integer value from 1 to 5 in this field. Ordered products with the same value for this field are always shipped together as a whole.")
  public Integer getProductGroup() {
    return productGroup;
  }

  public void setProductGroup(Integer productGroup) {
    this.productGroup = productGroup;
  }

  public InsertOrderLineInput bid(BID bid) {
    this.bid = bid;
    return this;
  }

   /**
   * The BID structure is optional and represents a voucher for a special discount that a customer may have agreed with a vendor. If specified within the order the validity of all of the BID structure fields is checked against the vendor and if everything is OK order processing goes on with the BID price applied to the specified product.
   * @return bid
  **/
  @ApiModelProperty(value = "The BID structure is optional and represents a voucher for a special discount that a customer may have agreed with a vendor. If specified within the order the validity of all of the BID structure fields is checked against the vendor and if everything is OK order processing goes on with the BID price applied to the specified product.")
  public BID getBid() {
    return bid;
  }

  public void setBid(BID bid) {
    this.bid = bid;
  }

  public InsertOrderLineInput customerQuotationId(Integer customerQuotationId) {
    this.customerQuotationId = customerQuotationId;
    return this;
  }

   /**
   * The related offer to be applied for this product.
   * @return customerQuotationId
  **/
  @ApiModelProperty(value = "The related offer to be applied for this product.")
  public Integer getCustomerQuotationId() {
    return customerQuotationId;
  }

  public void setCustomerQuotationId(Integer customerQuotationId) {
    this.customerQuotationId = customerQuotationId;
  }

  public InsertOrderLineInput customerLineId(String customerLineId) {
    this.customerLineId = customerLineId;
    return this;
  }

   /**
   * The Customer Line Id
   * @return customerLineId
  **/
  @ApiModelProperty(value = "The Customer Line Id")
  public String getCustomerLineId() {
    return customerLineId;
  }

  public void setCustomerLineId(String customerLineId) {
    this.customerLineId = customerLineId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertOrderLineInput insertOrderLineInput = (InsertOrderLineInput) o;
    return Objects.equals(this.productCode, insertOrderLineInput.productCode) &&
        Objects.equals(this.quantity, insertOrderLineInput.quantity) &&
        Objects.equals(this.productGroup, insertOrderLineInput.productGroup) &&
        Objects.equals(this.bid, insertOrderLineInput.bid) &&
        Objects.equals(this.customerQuotationId, insertOrderLineInput.customerQuotationId) &&
        Objects.equals(this.customerLineId, insertOrderLineInput.customerLineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, quantity, productGroup, bid, customerQuotationId, customerLineId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertOrderLineInput {\n");
    
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    productGroup: ").append(toIndentedString(productGroup)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    customerQuotationId: ").append(toIndentedString(customerQuotationId)).append("\n");
    sb.append("    customerLineId: ").append(toIndentedString(customerLineId)).append("\n");
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

