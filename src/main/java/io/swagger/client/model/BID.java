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
import org.threeten.bp.OffsetDateTime;

/**
 * BID
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T14:59:51.596+01:00")
public class BID {
  @SerializedName("bidEmissionDate")
  private OffsetDateTime bidEmissionDate = null;

  @SerializedName("bidCustomerName")
  private String bidCustomerName = null;

  @SerializedName("bidNumber")
  private String bidNumber = null;

  @SerializedName("bidPrice")
  private Double bidPrice = null;

  public BID bidEmissionDate(OffsetDateTime bidEmissionDate) {
    this.bidEmissionDate = bidEmissionDate;
    return this;
  }

   /**
   * BID emission date.
   * @return bidEmissionDate
  **/
  @ApiModelProperty(required = true, value = "BID emission date.")
  public OffsetDateTime getBidEmissionDate() {
    return bidEmissionDate;
  }

  public void setBidEmissionDate(OffsetDateTime bidEmissionDate) {
    this.bidEmissionDate = bidEmissionDate;
  }

  public BID bidCustomerName(String bidCustomerName) {
    this.bidCustomerName = bidCustomerName;
    return this;
  }

   /**
   * BID customer name.
   * @return bidCustomerName
  **/
  @ApiModelProperty(required = true, value = "BID customer name.")
  public String getBidCustomerName() {
    return bidCustomerName;
  }

  public void setBidCustomerName(String bidCustomerName) {
    this.bidCustomerName = bidCustomerName;
  }

  public BID bidNumber(String bidNumber) {
    this.bidNumber = bidNumber;
    return this;
  }

   /**
   * BID unique identifier.
   * @return bidNumber
  **/
  @ApiModelProperty(required = true, value = "BID unique identifier.")
  public String getBidNumber() {
    return bidNumber;
  }

  public void setBidNumber(String bidNumber) {
    this.bidNumber = bidNumber;
  }

  public BID bidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * BID special product price.
   * @return bidPrice
  **/
  @ApiModelProperty(required = true, value = "BID special product price.")
  public Double getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BID BID = (BID) o;
    return Objects.equals(this.bidEmissionDate, BID.bidEmissionDate) &&
        Objects.equals(this.bidCustomerName, BID.bidCustomerName) &&
        Objects.equals(this.bidNumber, BID.bidNumber) &&
        Objects.equals(this.bidPrice, BID.bidPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidEmissionDate, bidCustomerName, bidNumber, bidPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BID {\n");
    
    sb.append("    bidEmissionDate: ").append(toIndentedString(bidEmissionDate)).append("\n");
    sb.append("    bidCustomerName: ").append(toIndentedString(bidCustomerName)).append("\n");
    sb.append("    bidNumber: ").append(toIndentedString(bidNumber)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
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
