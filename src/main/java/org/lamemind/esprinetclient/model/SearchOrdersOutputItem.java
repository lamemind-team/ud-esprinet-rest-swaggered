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
import org.lamemind.esprinetclient.model.OrderDeliveryTotals;
import org.threeten.bp.OffsetDateTime;

/**
 * SearchOrdersOutputItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T15:47:59.649+01:00")
public class SearchOrdersOutputItem {
  @SerializedName("orderDate")
  private OffsetDateTime orderDate = null;

  @SerializedName("esprinetOrderId")
  private String esprinetOrderId = null;

  @SerializedName("customerOrderId")
  private String customerOrderId = null;

  @SerializedName("orderDeliveryTotals")
  private OrderDeliveryTotals orderDeliveryTotals = null;

  public SearchOrdersOutputItem orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Date of when the order has been created.
   * @return orderDate
  **/
  @ApiModelProperty(required = true, value = "Date of when the order has been created.")
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public SearchOrdersOutputItem esprinetOrderId(String esprinetOrderId) {
    this.esprinetOrderId = esprinetOrderId;
    return this;
  }

   /**
   * Esprinet-generated order id.
   * @return esprinetOrderId
  **/
  @ApiModelProperty(value = "Esprinet-generated order id.")
  public String getEsprinetOrderId() {
    return esprinetOrderId;
  }

  public void setEsprinetOrderId(String esprinetOrderId) {
    this.esprinetOrderId = esprinetOrderId;
  }

  public SearchOrdersOutputItem customerOrderId(String customerOrderId) {
    this.customerOrderId = customerOrderId;
    return this;
  }

   /**
   * Customer-generated order id.
   * @return customerOrderId
  **/
  @ApiModelProperty(value = "Customer-generated order id.")
  public String getCustomerOrderId() {
    return customerOrderId;
  }

  public void setCustomerOrderId(String customerOrderId) {
    this.customerOrderId = customerOrderId;
  }

  public SearchOrdersOutputItem orderDeliveryTotals(OrderDeliveryTotals orderDeliveryTotals) {
    this.orderDeliveryTotals = orderDeliveryTotals;
    return this;
  }

   /**
   * Contains some summary informations about the delivery status of all the products contained in the order.
   * @return orderDeliveryTotals
  **/
  @ApiModelProperty(value = "Contains some summary informations about the delivery status of all the products contained in the order.")
  public OrderDeliveryTotals getOrderDeliveryTotals() {
    return orderDeliveryTotals;
  }

  public void setOrderDeliveryTotals(OrderDeliveryTotals orderDeliveryTotals) {
    this.orderDeliveryTotals = orderDeliveryTotals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchOrdersOutputItem searchOrdersOutputItem = (SearchOrdersOutputItem) o;
    return Objects.equals(this.orderDate, searchOrdersOutputItem.orderDate) &&
        Objects.equals(this.esprinetOrderId, searchOrdersOutputItem.esprinetOrderId) &&
        Objects.equals(this.customerOrderId, searchOrdersOutputItem.customerOrderId) &&
        Objects.equals(this.orderDeliveryTotals, searchOrdersOutputItem.orderDeliveryTotals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderDate, esprinetOrderId, customerOrderId, orderDeliveryTotals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOrdersOutputItem {\n");
    
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    esprinetOrderId: ").append(toIndentedString(esprinetOrderId)).append("\n");
    sb.append("    customerOrderId: ").append(toIndentedString(customerOrderId)).append("\n");
    sb.append("    orderDeliveryTotals: ").append(toIndentedString(orderDeliveryTotals)).append("\n");
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

