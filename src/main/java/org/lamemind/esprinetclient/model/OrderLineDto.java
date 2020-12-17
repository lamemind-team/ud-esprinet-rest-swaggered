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
import org.lamemind.esprinetclient.model.ActivationKeyDto;
import org.lamemind.esprinetclient.model.BID;
import org.lamemind.esprinetclient.model.ExpectedArrival;
import org.lamemind.esprinetclient.model.OrderDocument;
import org.threeten.bp.OffsetDateTime;

/**
 * OrderLineDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T15:47:59.649+01:00")
public class OrderLineDto {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("esprinetProductCode")
  private String esprinetProductCode = null;

  @SerializedName("customerProductCode")
  private String customerProductCode = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("esprinetQuotationId")
  private Integer esprinetQuotationId = null;

  @SerializedName("productGroup")
  private String productGroup = null;

  @SerializedName("bid")
  private BID bid = null;

  @SerializedName("remainingForDelivery")
  private Integer remainingForDelivery = null;

  @SerializedName("reservedQuantity")
  private Integer reservedQuantity = null;

  @SerializedName("vat")
  private Double vat = null;

  @SerializedName("taxes")
  private Double taxes = null;

  @SerializedName("isUpdatable")
  private Boolean isUpdatable = null;

  @SerializedName("deliveryNotes")
  private List<OrderDocument> deliveryNotes = null;

  @SerializedName("invoices")
  private List<OrderDocument> invoices = null;

  @SerializedName("orderStatusId")
  private String orderStatusId = null;

  @SerializedName("customerLineId")
  private String customerLineId = null;

  @SerializedName("expectedArrivals")
  private List<ExpectedArrival> expectedArrivals = null;

  @SerializedName("requestedDeliveryDate")
  private OffsetDateTime requestedDeliveryDate = null;

  @SerializedName("activationKeys")
  private List<ActivationKeyDto> activationKeys = null;

  public OrderLineDto id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Esprinet-generated order line number.
   * @return id
  **/
  @ApiModelProperty(value = "Esprinet-generated order line number.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderLineDto esprinetProductCode(String esprinetProductCode) {
    this.esprinetProductCode = esprinetProductCode;
    return this;
  }

   /**
   * Esprinet product code.
   * @return esprinetProductCode
  **/
  @ApiModelProperty(value = "Esprinet product code.")
  public String getEsprinetProductCode() {
    return esprinetProductCode;
  }

  public void setEsprinetProductCode(String esprinetProductCode) {
    this.esprinetProductCode = esprinetProductCode;
  }

  public OrderLineDto customerProductCode(String customerProductCode) {
    this.customerProductCode = customerProductCode;
    return this;
  }

   /**
   * Customer product code (if available).
   * @return customerProductCode
  **/
  @ApiModelProperty(value = "Customer product code (if available).")
  public String getCustomerProductCode() {
    return customerProductCode;
  }

  public void setCustomerProductCode(String customerProductCode) {
    this.customerProductCode = customerProductCode;
  }

  public OrderLineDto quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Amount of ordered items.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Amount of ordered items.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderLineDto price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Single item price. The final price including discounts is calculated at runtime by Esprinet systems when the order is confirmed.
   * @return price
  **/
  @ApiModelProperty(value = "Single item price. The final price including discounts is calculated at runtime by Esprinet systems when the order is confirmed.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public OrderLineDto esprinetQuotationId(Integer esprinetQuotationId) {
    this.esprinetQuotationId = esprinetQuotationId;
    return this;
  }

   /**
   * The related offerId.
   * @return esprinetQuotationId
  **/
  @ApiModelProperty(value = "The related offerId.")
  public Integer getEsprinetQuotationId() {
    return esprinetQuotationId;
  }

  public void setEsprinetQuotationId(Integer esprinetQuotationId) {
    this.esprinetQuotationId = esprinetQuotationId;
  }

  public OrderLineDto productGroup(String productGroup) {
    this.productGroup = productGroup;
    return this;
  }

   /**
   * Depending on the availability of each product at the time of the order, items ordered together may not be shipped together. Usually this allows to improve the service to the customer because the delay of a single item&#39;s delivery does not prevent the other items in the order to be shipped. In cases this behaviour is not wanted (like when multiple items are part of a whole, must be used together and splitting the shipping doesn&#39;t make sense) it is possible to change it by setting an integer value from 1 to 5 in this field. Ordered products with the same value for this field are always shipped together as a whole.
   * @return productGroup
  **/
  @ApiModelProperty(value = "Depending on the availability of each product at the time of the order, items ordered together may not be shipped together. Usually this allows to improve the service to the customer because the delay of a single item's delivery does not prevent the other items in the order to be shipped. In cases this behaviour is not wanted (like when multiple items are part of a whole, must be used together and splitting the shipping doesn't make sense) it is possible to change it by setting an integer value from 1 to 5 in this field. Ordered products with the same value for this field are always shipped together as a whole.")
  public String getProductGroup() {
    return productGroup;
  }

  public void setProductGroup(String productGroup) {
    this.productGroup = productGroup;
  }

  public OrderLineDto bid(BID bid) {
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

  public OrderLineDto remainingForDelivery(Integer remainingForDelivery) {
    this.remainingForDelivery = remainingForDelivery;
    return this;
  }

   /**
   * Amount of remaining items to be delivered.
   * @return remainingForDelivery
  **/
  @ApiModelProperty(value = "Amount of remaining items to be delivered.")
  public Integer getRemainingForDelivery() {
    return remainingForDelivery;
  }

  public void setRemainingForDelivery(Integer remainingForDelivery) {
    this.remainingForDelivery = remainingForDelivery;
  }

  public OrderLineDto reservedQuantity(Integer reservedQuantity) {
    this.reservedQuantity = reservedQuantity;
    return this;
  }

   /**
   * Amount of reserved items to be delivered.
   * @return reservedQuantity
  **/
  @ApiModelProperty(value = "Amount of reserved items to be delivered.")
  public Integer getReservedQuantity() {
    return reservedQuantity;
  }

  public void setReservedQuantity(Integer reservedQuantity) {
    this.reservedQuantity = reservedQuantity;
  }

  public OrderLineDto vat(Double vat) {
    this.vat = vat;
    return this;
  }

   /**
   * Amount of Vat.
   * @return vat
  **/
  @ApiModelProperty(required = true, value = "Amount of Vat.")
  public Double getVat() {
    return vat;
  }

  public void setVat(Double vat) {
    this.vat = vat;
  }

  public OrderLineDto taxes(Double taxes) {
    this.taxes = taxes;
    return this;
  }

   /**
   * Total amount of taxes
   * @return taxes
  **/
  @ApiModelProperty(required = true, value = "Total amount of taxes")
  public Double getTaxes() {
    return taxes;
  }

  public void setTaxes(Double taxes) {
    this.taxes = taxes;
  }

  public OrderLineDto isUpdatable(Boolean isUpdatable) {
    this.isUpdatable = isUpdatable;
    return this;
  }

   /**
   * Indicate if the order line can be updated
   * @return isUpdatable
  **/
  @ApiModelProperty(required = true, value = "Indicate if the order line can be updated")
  public Boolean isIsUpdatable() {
    return isUpdatable;
  }

  public void setIsUpdatable(Boolean isUpdatable) {
    this.isUpdatable = isUpdatable;
  }

  public OrderLineDto deliveryNotes(List<OrderDocument> deliveryNotes) {
    this.deliveryNotes = deliveryNotes;
    return this;
  }

  public OrderLineDto addDeliveryNotesItem(OrderDocument deliveryNotesItem) {
    if (this.deliveryNotes == null) {
      this.deliveryNotes = new ArrayList<OrderDocument>();
    }
    this.deliveryNotes.add(deliveryNotesItem);
    return this;
  }

   /**
   * Get a list of delivery notes ids connected to the order
   * @return deliveryNotes
  **/
  @ApiModelProperty(value = "Get a list of delivery notes ids connected to the order")
  public List<OrderDocument> getDeliveryNotes() {
    return deliveryNotes;
  }

  public void setDeliveryNotes(List<OrderDocument> deliveryNotes) {
    this.deliveryNotes = deliveryNotes;
  }

  public OrderLineDto invoices(List<OrderDocument> invoices) {
    this.invoices = invoices;
    return this;
  }

  public OrderLineDto addInvoicesItem(OrderDocument invoicesItem) {
    if (this.invoices == null) {
      this.invoices = new ArrayList<OrderDocument>();
    }
    this.invoices.add(invoicesItem);
    return this;
  }

   /**
   * Get a list of invoices ids connected to the order
   * @return invoices
  **/
  @ApiModelProperty(value = "Get a list of invoices ids connected to the order")
  public List<OrderDocument> getInvoices() {
    return invoices;
  }

  public void setInvoices(List<OrderDocument> invoices) {
    this.invoices = invoices;
  }

  public OrderLineDto orderStatusId(String orderStatusId) {
    this.orderStatusId = orderStatusId;
    return this;
  }

   /**
   * Get orderStatusId
   * @return orderStatusId
  **/
  @ApiModelProperty(value = "")
  public String getOrderStatusId() {
    return orderStatusId;
  }

  public void setOrderStatusId(String orderStatusId) {
    this.orderStatusId = orderStatusId;
  }

  public OrderLineDto customerLineId(String customerLineId) {
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

  public OrderLineDto expectedArrivals(List<ExpectedArrival> expectedArrivals) {
    this.expectedArrivals = expectedArrivals;
    return this;
  }

  public OrderLineDto addExpectedArrivalsItem(ExpectedArrival expectedArrivalsItem) {
    if (this.expectedArrivals == null) {
      this.expectedArrivals = new ArrayList<ExpectedArrival>();
    }
    this.expectedArrivals.add(expectedArrivalsItem);
    return this;
  }

   /**
   * The dates on which the next stock of items is expected to be delivered to Esrpinet.
   * @return expectedArrivals
  **/
  @ApiModelProperty(value = "The dates on which the next stock of items is expected to be delivered to Esrpinet.")
  public List<ExpectedArrival> getExpectedArrivals() {
    return expectedArrivals;
  }

  public void setExpectedArrivals(List<ExpectedArrival> expectedArrivals) {
    this.expectedArrivals = expectedArrivals;
  }

  public OrderLineDto requestedDeliveryDate(OffsetDateTime requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
    return this;
  }

   /**
   * The requested delivery date
   * @return requestedDeliveryDate
  **/
  @ApiModelProperty(value = "The requested delivery date")
  public OffsetDateTime getRequestedDeliveryDate() {
    return requestedDeliveryDate;
  }

  public void setRequestedDeliveryDate(OffsetDateTime requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }

  public OrderLineDto activationKeys(List<ActivationKeyDto> activationKeys) {
    this.activationKeys = activationKeys;
    return this;
  }

  public OrderLineDto addActivationKeysItem(ActivationKeyDto activationKeysItem) {
    if (this.activationKeys == null) {
      this.activationKeys = new ArrayList<ActivationKeyDto>();
    }
    this.activationKeys.add(activationKeysItem);
    return this;
  }

   /**
   * Gets the lists of the activation keys (if there are any).
   * @return activationKeys
  **/
  @ApiModelProperty(value = "Gets the lists of the activation keys (if there are any).")
  public List<ActivationKeyDto> getActivationKeys() {
    return activationKeys;
  }

  public void setActivationKeys(List<ActivationKeyDto> activationKeys) {
    this.activationKeys = activationKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineDto orderLineDto = (OrderLineDto) o;
    return Objects.equals(this.id, orderLineDto.id) &&
        Objects.equals(this.esprinetProductCode, orderLineDto.esprinetProductCode) &&
        Objects.equals(this.customerProductCode, orderLineDto.customerProductCode) &&
        Objects.equals(this.quantity, orderLineDto.quantity) &&
        Objects.equals(this.price, orderLineDto.price) &&
        Objects.equals(this.esprinetQuotationId, orderLineDto.esprinetQuotationId) &&
        Objects.equals(this.productGroup, orderLineDto.productGroup) &&
        Objects.equals(this.bid, orderLineDto.bid) &&
        Objects.equals(this.remainingForDelivery, orderLineDto.remainingForDelivery) &&
        Objects.equals(this.reservedQuantity, orderLineDto.reservedQuantity) &&
        Objects.equals(this.vat, orderLineDto.vat) &&
        Objects.equals(this.taxes, orderLineDto.taxes) &&
        Objects.equals(this.isUpdatable, orderLineDto.isUpdatable) &&
        Objects.equals(this.deliveryNotes, orderLineDto.deliveryNotes) &&
        Objects.equals(this.invoices, orderLineDto.invoices) &&
        Objects.equals(this.orderStatusId, orderLineDto.orderStatusId) &&
        Objects.equals(this.customerLineId, orderLineDto.customerLineId) &&
        Objects.equals(this.expectedArrivals, orderLineDto.expectedArrivals) &&
        Objects.equals(this.requestedDeliveryDate, orderLineDto.requestedDeliveryDate) &&
        Objects.equals(this.activationKeys, orderLineDto.activationKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, esprinetProductCode, customerProductCode, quantity, price, esprinetQuotationId, productGroup, bid, remainingForDelivery, reservedQuantity, vat, taxes, isUpdatable, deliveryNotes, invoices, orderStatusId, customerLineId, expectedArrivals, requestedDeliveryDate, activationKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    esprinetProductCode: ").append(toIndentedString(esprinetProductCode)).append("\n");
    sb.append("    customerProductCode: ").append(toIndentedString(customerProductCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    esprinetQuotationId: ").append(toIndentedString(esprinetQuotationId)).append("\n");
    sb.append("    productGroup: ").append(toIndentedString(productGroup)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    remainingForDelivery: ").append(toIndentedString(remainingForDelivery)).append("\n");
    sb.append("    reservedQuantity: ").append(toIndentedString(reservedQuantity)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    isUpdatable: ").append(toIndentedString(isUpdatable)).append("\n");
    sb.append("    deliveryNotes: ").append(toIndentedString(deliveryNotes)).append("\n");
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
    sb.append("    orderStatusId: ").append(toIndentedString(orderStatusId)).append("\n");
    sb.append("    customerLineId: ").append(toIndentedString(customerLineId)).append("\n");
    sb.append("    expectedArrivals: ").append(toIndentedString(expectedArrivals)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
    sb.append("    activationKeys: ").append(toIndentedString(activationKeys)).append("\n");
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
