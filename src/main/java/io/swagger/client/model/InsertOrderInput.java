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
import io.swagger.client.model.InsertOrderLineInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InsertOrderInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T14:59:51.596+01:00")
public class InsertOrderInput {
  @SerializedName("customerOrderId")
  private String customerOrderId = null;

  @SerializedName("customerComments")
  private String customerComments = null;

  @SerializedName("orderLines")
  private List<InsertOrderLineInput> orderLines = new ArrayList<InsertOrderLineInput>();

  @SerializedName("deliverTo")
  private Address deliverTo = null;

  @SerializedName("proofOfDeliveryRequired")
  private Boolean proofOfDeliveryRequired = null;

  @SerializedName("customerDeliveryNote")
  private Boolean customerDeliveryNote = null;

  @SerializedName("lockedOnCreation")
  private Boolean lockedOnCreation = null;

  @SerializedName("extraEmailAddresses")
  private List<String> extraEmailAddresses = null;

  @SerializedName("freightForwarding")
  private Boolean freightForwarding = null;

  public InsertOrderInput customerOrderId(String customerOrderId) {
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

  public InsertOrderInput customerComments(String customerComments) {
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

  public InsertOrderInput orderLines(List<InsertOrderLineInput> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public InsertOrderInput addOrderLinesItem(InsertOrderLineInput orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }

   /**
   * Collection of lines (details) of the order.
   * @return orderLines
  **/
  @ApiModelProperty(required = true, value = "Collection of lines (details) of the order.")
  public List<InsertOrderLineInput> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<InsertOrderLineInput> orderLines) {
    this.orderLines = orderLines;
  }

  public InsertOrderInput deliverTo(Address deliverTo) {
    this.deliverTo = deliverTo;
    return this;
  }

   /**
   * The address where the order items should be delivered to.
   * @return deliverTo
  **/
  @ApiModelProperty(required = true, value = "The address where the order items should be delivered to.")
  public Address getDeliverTo() {
    return deliverTo;
  }

  public void setDeliverTo(Address deliverTo) {
    this.deliverTo = deliverTo;
  }

  public InsertOrderInput proofOfDeliveryRequired(Boolean proofOfDeliveryRequired) {
    this.proofOfDeliveryRequired = proofOfDeliveryRequired;
    return this;
  }

   /**
   * This field controls whether it is required (when true) that the customer signs a receipt proving the delivery has taken place or not (when false). Requiring a proof of delivery for an order is a feature that may be subject to an additional fare.
   * @return proofOfDeliveryRequired
  **/
  @ApiModelProperty(required = true, value = "This field controls whether it is required (when true) that the customer signs a receipt proving the delivery has taken place or not (when false). Requiring a proof of delivery for an order is a feature that may be subject to an additional fare.")
  public Boolean isProofOfDeliveryRequired() {
    return proofOfDeliveryRequired;
  }

  public void setProofOfDeliveryRequired(Boolean proofOfDeliveryRequired) {
    this.proofOfDeliveryRequired = proofOfDeliveryRequired;
  }

  public InsertOrderInput customerDeliveryNote(Boolean customerDeliveryNote) {
    this.customerDeliveryNote = customerDeliveryNote;
    return this;
  }

   /**
   * This field controls whether the shipping to the address specified within the order is done as appearing to come from Esprinet (when false) or from the customer who has placed the order (when true). This usually involves putting the customer logos and details in the delivery note which accompanies every shipping. This feature can be used by a retailer who is placing an order for one of its customers and does want the shipping to appear to come from him.
   * @return customerDeliveryNote
  **/
  @ApiModelProperty(required = true, value = "This field controls whether the shipping to the address specified within the order is done as appearing to come from Esprinet (when false) or from the customer who has placed the order (when true). This usually involves putting the customer logos and details in the delivery note which accompanies every shipping. This feature can be used by a retailer who is placing an order for one of its customers and does want the shipping to appear to come from him.")
  public Boolean isCustomerDeliveryNote() {
    return customerDeliveryNote;
  }

  public void setCustomerDeliveryNote(Boolean customerDeliveryNote) {
    this.customerDeliveryNote = customerDeliveryNote;
  }

  public InsertOrderInput lockedOnCreation(Boolean lockedOnCreation) {
    this.lockedOnCreation = lockedOnCreation;
    return this;
  }

   /**
   * This field controls whether the order is created as \&quot;locked\&quot; or not. When an order is created as \&quot;locked\&quot; the products it contains are \&quot;reserved\&quot; by the Esprinet systems (for only a short amount of time) but any further processing is \&quot;freezed\&quot; until the order is \&quot;unlocked\&quot; through a proper invocation of the ModifyOrder method. Restrictions on availability of this feature may apply, depending on contract agreement with Esprinet.
   * @return lockedOnCreation
  **/
  @ApiModelProperty(required = true, value = "This field controls whether the order is created as \"locked\" or not. When an order is created as \"locked\" the products it contains are \"reserved\" by the Esprinet systems (for only a short amount of time) but any further processing is \"freezed\" until the order is \"unlocked\" through a proper invocation of the ModifyOrder method. Restrictions on availability of this feature may apply, depending on contract agreement with Esprinet.")
  public Boolean isLockedOnCreation() {
    return lockedOnCreation;
  }

  public void setLockedOnCreation(Boolean lockedOnCreation) {
    this.lockedOnCreation = lockedOnCreation;
  }

  public InsertOrderInput extraEmailAddresses(List<String> extraEmailAddresses) {
    this.extraEmailAddresses = extraEmailAddresses;
    return this;
  }

  public InsertOrderInput addExtraEmailAddressesItem(String extraEmailAddressesItem) {
    if (this.extraEmailAddresses == null) {
      this.extraEmailAddresses = new ArrayList<String>();
    }
    this.extraEmailAddresses.add(extraEmailAddressesItem);
    return this;
  }

   /**
   * Extra email addresses to send emails to inform the insertion of the new order
   * @return extraEmailAddresses
  **/
  @ApiModelProperty(value = "Extra email addresses to send emails to inform the insertion of the new order")
  public List<String> getExtraEmailAddresses() {
    return extraEmailAddresses;
  }

  public void setExtraEmailAddresses(List<String> extraEmailAddresses) {
    this.extraEmailAddresses = extraEmailAddresses;
  }

  public InsertOrderInput freightForwarding(Boolean freightForwarding) {
    this.freightForwarding = freightForwarding;
    return this;
  }

   /**
   * the Freight Forwarding field.
   * @return freightForwarding
  **/
  @ApiModelProperty(required = true, value = "the Freight Forwarding field.")
  public Boolean isFreightForwarding() {
    return freightForwarding;
  }

  public void setFreightForwarding(Boolean freightForwarding) {
    this.freightForwarding = freightForwarding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertOrderInput insertOrderInput = (InsertOrderInput) o;
    return Objects.equals(this.customerOrderId, insertOrderInput.customerOrderId) &&
        Objects.equals(this.customerComments, insertOrderInput.customerComments) &&
        Objects.equals(this.orderLines, insertOrderInput.orderLines) &&
        Objects.equals(this.deliverTo, insertOrderInput.deliverTo) &&
        Objects.equals(this.proofOfDeliveryRequired, insertOrderInput.proofOfDeliveryRequired) &&
        Objects.equals(this.customerDeliveryNote, insertOrderInput.customerDeliveryNote) &&
        Objects.equals(this.lockedOnCreation, insertOrderInput.lockedOnCreation) &&
        Objects.equals(this.extraEmailAddresses, insertOrderInput.extraEmailAddresses) &&
        Objects.equals(this.freightForwarding, insertOrderInput.freightForwarding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderId, customerComments, orderLines, deliverTo, proofOfDeliveryRequired, customerDeliveryNote, lockedOnCreation, extraEmailAddresses, freightForwarding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertOrderInput {\n");
    
    sb.append("    customerOrderId: ").append(toIndentedString(customerOrderId)).append("\n");
    sb.append("    customerComments: ").append(toIndentedString(customerComments)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    deliverTo: ").append(toIndentedString(deliverTo)).append("\n");
    sb.append("    proofOfDeliveryRequired: ").append(toIndentedString(proofOfDeliveryRequired)).append("\n");
    sb.append("    customerDeliveryNote: ").append(toIndentedString(customerDeliveryNote)).append("\n");
    sb.append("    lockedOnCreation: ").append(toIndentedString(lockedOnCreation)).append("\n");
    sb.append("    extraEmailAddresses: ").append(toIndentedString(extraEmailAddresses)).append("\n");
    sb.append("    freightForwarding: ").append(toIndentedString(freightForwarding)).append("\n");
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

