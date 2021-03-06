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
import java.util.ArrayList;
import java.util.List;
import org.lamemind.esprinetclient.model.Address;
import org.lamemind.esprinetclient.model.DeliveryNoteLineDto;
import org.lamemind.esprinetclient.model.ShippingInfoDto;
import org.threeten.bp.OffsetDateTime;

/**
 * DeliveryNoteDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T15:47:59.649+01:00")
public class DeliveryNoteDto {
  @SerializedName("esprinetDeliveryNoteId")
  private String esprinetDeliveryNoteId = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("isProofOfDeliveryRequired")
  private Boolean isProofOfDeliveryRequired = null;

  @SerializedName("deliverTo")
  private Address deliverTo = null;

  @SerializedName("shippingInfo")
  private ShippingInfoDto shippingInfo = null;

  @SerializedName("deliveryNoteLines")
  private List<DeliveryNoteLineDto> deliveryNoteLines = null;

  @SerializedName("esprinetDeliveryNoteNumber")
  private String esprinetDeliveryNoteNumber = null;

  @SerializedName("shippingCost")
  private Double shippingCost = null;

  @SerializedName("invoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("invoiceDate")
  private OffsetDateTime invoiceDate = null;

  @SerializedName("customerDeliveryNoteId")
  private String customerDeliveryNoteId = null;

  @SerializedName("shippedByVendor")
  private Boolean shippedByVendor = null;

  @SerializedName("packageCount")
  private Integer packageCount = null;

  public DeliveryNoteDto esprinetDeliveryNoteId(String esprinetDeliveryNoteId) {
    this.esprinetDeliveryNoteId = esprinetDeliveryNoteId;
    return this;
  }

   /**
   * The id of the delivery note.
   * @return esprinetDeliveryNoteId
  **/
  @ApiModelProperty(value = "The id of the delivery note.")
  public String getEsprinetDeliveryNoteId() {
    return esprinetDeliveryNoteId;
  }

  public void setEsprinetDeliveryNoteId(String esprinetDeliveryNoteId) {
    this.esprinetDeliveryNoteId = esprinetDeliveryNoteId;
  }

  public DeliveryNoteDto date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Date on which the delivery note was issued.
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date on which the delivery note was issued.")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public DeliveryNoteDto isProofOfDeliveryRequired(Boolean isProofOfDeliveryRequired) {
    this.isProofOfDeliveryRequired = isProofOfDeliveryRequired;
    return this;
  }

   /**
   * Whether it is required that the customer signs a receipt proving the delivery has taken place.  Requiring a Proof Of Delivery for an order is an additional service and may be subject to additional fares, calculated per each delivery.
   * @return isProofOfDeliveryRequired
  **/
  @ApiModelProperty(required = true, value = "Whether it is required that the customer signs a receipt proving the delivery has taken place.  Requiring a Proof Of Delivery for an order is an additional service and may be subject to additional fares, calculated per each delivery.")
  public Boolean isIsProofOfDeliveryRequired() {
    return isProofOfDeliveryRequired;
  }

  public void setIsProofOfDeliveryRequired(Boolean isProofOfDeliveryRequired) {
    this.isProofOfDeliveryRequired = isProofOfDeliveryRequired;
  }

  public DeliveryNoteDto deliverTo(Address deliverTo) {
    this.deliverTo = deliverTo;
    return this;
  }

   /**
   * The address where the order shall be delivered to.
   * @return deliverTo
  **/
  @ApiModelProperty(value = "The address where the order shall be delivered to.")
  public Address getDeliverTo() {
    return deliverTo;
  }

  public void setDeliverTo(Address deliverTo) {
    this.deliverTo = deliverTo;
  }

  public DeliveryNoteDto shippingInfo(ShippingInfoDto shippingInfo) {
    this.shippingInfo = shippingInfo;
    return this;
  }

   /**
   * Shipping information related to this order line.
   * @return shippingInfo
  **/
  @ApiModelProperty(value = "Shipping information related to this order line.")
  public ShippingInfoDto getShippingInfo() {
    return shippingInfo;
  }

  public void setShippingInfo(ShippingInfoDto shippingInfo) {
    this.shippingInfo = shippingInfo;
  }

  public DeliveryNoteDto deliveryNoteLines(List<DeliveryNoteLineDto> deliveryNoteLines) {
    this.deliveryNoteLines = deliveryNoteLines;
    return this;
  }

  public DeliveryNoteDto addDeliveryNoteLinesItem(DeliveryNoteLineDto deliveryNoteLinesItem) {
    if (this.deliveryNoteLines == null) {
      this.deliveryNoteLines = new ArrayList<DeliveryNoteLineDto>();
    }
    this.deliveryNoteLines.add(deliveryNoteLinesItem);
    return this;
  }

   /**
   * Get deliveryNoteLines
   * @return deliveryNoteLines
  **/
  @ApiModelProperty(value = "")
  public List<DeliveryNoteLineDto> getDeliveryNoteLines() {
    return deliveryNoteLines;
  }

  public void setDeliveryNoteLines(List<DeliveryNoteLineDto> deliveryNoteLines) {
    this.deliveryNoteLines = deliveryNoteLines;
  }

  public DeliveryNoteDto esprinetDeliveryNoteNumber(String esprinetDeliveryNoteNumber) {
    this.esprinetDeliveryNoteNumber = esprinetDeliveryNoteNumber;
    return this;
  }

   /**
   * Get esprinetDeliveryNoteNumber
   * @return esprinetDeliveryNoteNumber
  **/
  @ApiModelProperty(value = "")
  public String getEsprinetDeliveryNoteNumber() {
    return esprinetDeliveryNoteNumber;
  }

  public void setEsprinetDeliveryNoteNumber(String esprinetDeliveryNoteNumber) {
    this.esprinetDeliveryNoteNumber = esprinetDeliveryNoteNumber;
  }

  public DeliveryNoteDto shippingCost(Double shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

   /**
   * Get shippingCost
   * @return shippingCost
  **/
  @ApiModelProperty(value = "")
  public Double getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(Double shippingCost) {
    this.shippingCost = shippingCost;
  }

  public DeliveryNoteDto invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public DeliveryNoteDto invoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public DeliveryNoteDto customerDeliveryNoteId(String customerDeliveryNoteId) {
    this.customerDeliveryNoteId = customerDeliveryNoteId;
    return this;
  }

   /**
   * Get customerDeliveryNoteId
   * @return customerDeliveryNoteId
  **/
  @ApiModelProperty(value = "")
  public String getCustomerDeliveryNoteId() {
    return customerDeliveryNoteId;
  }

  public void setCustomerDeliveryNoteId(String customerDeliveryNoteId) {
    this.customerDeliveryNoteId = customerDeliveryNoteId;
  }

  public DeliveryNoteDto shippedByVendor(Boolean shippedByVendor) {
    this.shippedByVendor = shippedByVendor;
    return this;
  }

   /**
   * Get shippedByVendor
   * @return shippedByVendor
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isShippedByVendor() {
    return shippedByVendor;
  }

  public void setShippedByVendor(Boolean shippedByVendor) {
    this.shippedByVendor = shippedByVendor;
  }

  public DeliveryNoteDto packageCount(Integer packageCount) {
    this.packageCount = packageCount;
    return this;
  }

   /**
   * Get packageCount
   * @return packageCount
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPackageCount() {
    return packageCount;
  }

  public void setPackageCount(Integer packageCount) {
    this.packageCount = packageCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryNoteDto deliveryNoteDto = (DeliveryNoteDto) o;
    return Objects.equals(this.esprinetDeliveryNoteId, deliveryNoteDto.esprinetDeliveryNoteId) &&
        Objects.equals(this.date, deliveryNoteDto.date) &&
        Objects.equals(this.isProofOfDeliveryRequired, deliveryNoteDto.isProofOfDeliveryRequired) &&
        Objects.equals(this.deliverTo, deliveryNoteDto.deliverTo) &&
        Objects.equals(this.shippingInfo, deliveryNoteDto.shippingInfo) &&
        Objects.equals(this.deliveryNoteLines, deliveryNoteDto.deliveryNoteLines) &&
        Objects.equals(this.esprinetDeliveryNoteNumber, deliveryNoteDto.esprinetDeliveryNoteNumber) &&
        Objects.equals(this.shippingCost, deliveryNoteDto.shippingCost) &&
        Objects.equals(this.invoiceNumber, deliveryNoteDto.invoiceNumber) &&
        Objects.equals(this.invoiceDate, deliveryNoteDto.invoiceDate) &&
        Objects.equals(this.customerDeliveryNoteId, deliveryNoteDto.customerDeliveryNoteId) &&
        Objects.equals(this.shippedByVendor, deliveryNoteDto.shippedByVendor) &&
        Objects.equals(this.packageCount, deliveryNoteDto.packageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esprinetDeliveryNoteId, date, isProofOfDeliveryRequired, deliverTo, shippingInfo, deliveryNoteLines, esprinetDeliveryNoteNumber, shippingCost, invoiceNumber, invoiceDate, customerDeliveryNoteId, shippedByVendor, packageCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryNoteDto {\n");
    
    sb.append("    esprinetDeliveryNoteId: ").append(toIndentedString(esprinetDeliveryNoteId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isProofOfDeliveryRequired: ").append(toIndentedString(isProofOfDeliveryRequired)).append("\n");
    sb.append("    deliverTo: ").append(toIndentedString(deliverTo)).append("\n");
    sb.append("    shippingInfo: ").append(toIndentedString(shippingInfo)).append("\n");
    sb.append("    deliveryNoteLines: ").append(toIndentedString(deliveryNoteLines)).append("\n");
    sb.append("    esprinetDeliveryNoteNumber: ").append(toIndentedString(esprinetDeliveryNoteNumber)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    customerDeliveryNoteId: ").append(toIndentedString(customerDeliveryNoteId)).append("\n");
    sb.append("    shippedByVendor: ").append(toIndentedString(shippedByVendor)).append("\n");
    sb.append("    packageCount: ").append(toIndentedString(packageCount)).append("\n");
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

