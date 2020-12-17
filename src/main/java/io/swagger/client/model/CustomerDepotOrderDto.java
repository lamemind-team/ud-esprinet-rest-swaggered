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
import io.swagger.client.model.Address;
import io.swagger.client.model.CustomerDepotOrderLineDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * CustomerDepotOrderDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T14:59:51.596+01:00")
public class CustomerDepotOrderDto {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("orderDate")
  private OffsetDateTime orderDate = null;

  @SerializedName("esprinetOrderId")
  private String esprinetOrderId = null;

  @SerializedName("orderStatusId")
  private String orderStatusId = null;

  @SerializedName("orderStatusDescription")
  private String orderStatusDescription = null;

  @SerializedName("customerOrderId")
  private String customerOrderId = null;

  @SerializedName("customerComments")
  private String customerComments = null;

  @SerializedName("deliverTo")
  private Address deliverTo = null;

  @SerializedName("isCustomerDeliveryNote")
  private Boolean isCustomerDeliveryNote = null;

  @SerializedName("orderLines")
  private List<CustomerDepotOrderLineDto> orderLines = null;

  @SerializedName("requestedDeliveryDate")
  private OffsetDateTime requestedDeliveryDate = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("orderType")
  private String orderType = null;

  public CustomerDepotOrderDto id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Esprinet-generated order number.
   * @return id
  **/
  @ApiModelProperty(value = "Esprinet-generated order number.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CustomerDepotOrderDto orderDate(OffsetDateTime orderDate) {
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

  public CustomerDepotOrderDto esprinetOrderId(String esprinetOrderId) {
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

  public CustomerDepotOrderDto orderStatusId(String orderStatusId) {
    this.orderStatusId = orderStatusId;
    return this;
  }

   /**
   * Esprinet order status id.
   * @return orderStatusId
  **/
  @ApiModelProperty(value = "Esprinet order status id.")
  public String getOrderStatusId() {
    return orderStatusId;
  }

  public void setOrderStatusId(String orderStatusId) {
    this.orderStatusId = orderStatusId;
  }

  public CustomerDepotOrderDto orderStatusDescription(String orderStatusDescription) {
    this.orderStatusDescription = orderStatusDescription;
    return this;
  }

   /**
   * Esprinet order status description.
   * @return orderStatusDescription
  **/
  @ApiModelProperty(value = "Esprinet order status description.")
  public String getOrderStatusDescription() {
    return orderStatusDescription;
  }

  public void setOrderStatusDescription(String orderStatusDescription) {
    this.orderStatusDescription = orderStatusDescription;
  }

  public CustomerDepotOrderDto customerOrderId(String customerOrderId) {
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

  public CustomerDepotOrderDto customerComments(String customerComments) {
    this.customerComments = customerComments;
    return this;
  }

   /**
   * Customer notes related to the order.
   * @return customerComments
  **/
  @ApiModelProperty(value = "Customer notes related to the order.")
  public String getCustomerComments() {
    return customerComments;
  }

  public void setCustomerComments(String customerComments) {
    this.customerComments = customerComments;
  }

  public CustomerDepotOrderDto deliverTo(Address deliverTo) {
    this.deliverTo = deliverTo;
    return this;
  }

   /**
   * The address where the order items should be delivered to.
   * @return deliverTo
  **/
  @ApiModelProperty(value = "The address where the order items should be delivered to.")
  public Address getDeliverTo() {
    return deliverTo;
  }

  public void setDeliverTo(Address deliverTo) {
    this.deliverTo = deliverTo;
  }

  public CustomerDepotOrderDto isCustomerDeliveryNote(Boolean isCustomerDeliveryNote) {
    this.isCustomerDeliveryNote = isCustomerDeliveryNote;
    return this;
  }

   /**
   * This field controls whether the shipping to the address specified within the order is done as appearing to come from Esprinet (when false) or from the customer who has placed the order (when true). This usually involves putting the customer logos and details in the delivery note which accompanies every shipping. This feature can be used by a retailer who is placing an order for one of its customers and does want the shipping to appear to come from him.
   * @return isCustomerDeliveryNote
  **/
  @ApiModelProperty(required = true, value = "This field controls whether the shipping to the address specified within the order is done as appearing to come from Esprinet (when false) or from the customer who has placed the order (when true). This usually involves putting the customer logos and details in the delivery note which accompanies every shipping. This feature can be used by a retailer who is placing an order for one of its customers and does want the shipping to appear to come from him.")
  public Boolean isIsCustomerDeliveryNote() {
    return isCustomerDeliveryNote;
  }

  public void setIsCustomerDeliveryNote(Boolean isCustomerDeliveryNote) {
    this.isCustomerDeliveryNote = isCustomerDeliveryNote;
  }

  public CustomerDepotOrderDto orderLines(List<CustomerDepotOrderLineDto> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public CustomerDepotOrderDto addOrderLinesItem(CustomerDepotOrderLineDto orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<CustomerDepotOrderLineDto>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

   /**
   * Collection of lines (details) of the order.
   * @return orderLines
  **/
  @ApiModelProperty(value = "Collection of lines (details) of the order.")
  public List<CustomerDepotOrderLineDto> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<CustomerDepotOrderLineDto> orderLines) {
    this.orderLines = orderLines;
  }

  public CustomerDepotOrderDto requestedDeliveryDate(OffsetDateTime requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
    return this;
  }

   /**
   * Date of when the order invoice has been delivered.
   * @return requestedDeliveryDate
  **/
  @ApiModelProperty(value = "Date of when the order invoice has been delivered.")
  public OffsetDateTime getRequestedDeliveryDate() {
    return requestedDeliveryDate;
  }

  public void setRequestedDeliveryDate(OffsetDateTime requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }

  public CustomerDepotOrderDto currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The order currency
   * @return currency
  **/
  @ApiModelProperty(value = "The order currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CustomerDepotOrderDto orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * the order Type
   * @return orderType
  **/
  @ApiModelProperty(value = "the order Type")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDepotOrderDto customerDepotOrderDto = (CustomerDepotOrderDto) o;
    return Objects.equals(this.id, customerDepotOrderDto.id) &&
        Objects.equals(this.orderDate, customerDepotOrderDto.orderDate) &&
        Objects.equals(this.esprinetOrderId, customerDepotOrderDto.esprinetOrderId) &&
        Objects.equals(this.orderStatusId, customerDepotOrderDto.orderStatusId) &&
        Objects.equals(this.orderStatusDescription, customerDepotOrderDto.orderStatusDescription) &&
        Objects.equals(this.customerOrderId, customerDepotOrderDto.customerOrderId) &&
        Objects.equals(this.customerComments, customerDepotOrderDto.customerComments) &&
        Objects.equals(this.deliverTo, customerDepotOrderDto.deliverTo) &&
        Objects.equals(this.isCustomerDeliveryNote, customerDepotOrderDto.isCustomerDeliveryNote) &&
        Objects.equals(this.orderLines, customerDepotOrderDto.orderLines) &&
        Objects.equals(this.requestedDeliveryDate, customerDepotOrderDto.requestedDeliveryDate) &&
        Objects.equals(this.currency, customerDepotOrderDto.currency) &&
        Objects.equals(this.orderType, customerDepotOrderDto.orderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderDate, esprinetOrderId, orderStatusId, orderStatusDescription, customerOrderId, customerComments, deliverTo, isCustomerDeliveryNote, orderLines, requestedDeliveryDate, currency, orderType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDepotOrderDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    esprinetOrderId: ").append(toIndentedString(esprinetOrderId)).append("\n");
    sb.append("    orderStatusId: ").append(toIndentedString(orderStatusId)).append("\n");
    sb.append("    orderStatusDescription: ").append(toIndentedString(orderStatusDescription)).append("\n");
    sb.append("    customerOrderId: ").append(toIndentedString(customerOrderId)).append("\n");
    sb.append("    customerComments: ").append(toIndentedString(customerComments)).append("\n");
    sb.append("    deliverTo: ").append(toIndentedString(deliverTo)).append("\n");
    sb.append("    isCustomerDeliveryNote: ").append(toIndentedString(isCustomerDeliveryNote)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
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

