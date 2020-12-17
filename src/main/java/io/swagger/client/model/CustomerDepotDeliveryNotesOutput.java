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
import io.swagger.client.model.CustomerDepotDeliveryNoteDto;
import io.swagger.client.model.OperationResult;
import io.swagger.client.model.PagingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomerDepotDeliveryNotesOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T14:59:51.596+01:00")
public class CustomerDepotDeliveryNotesOutput {
  @SerializedName("customerDepotDeliveryNotes")
  private List<CustomerDepotDeliveryNoteDto> customerDepotDeliveryNotes = null;

  @SerializedName("pagingInfo")
  private PagingInfo pagingInfo = null;

  @SerializedName("operationResult")
  private OperationResult operationResult = null;

  public CustomerDepotDeliveryNotesOutput customerDepotDeliveryNotes(List<CustomerDepotDeliveryNoteDto> customerDepotDeliveryNotes) {
    this.customerDepotDeliveryNotes = customerDepotDeliveryNotes;
    return this;
  }

  public CustomerDepotDeliveryNotesOutput addCustomerDepotDeliveryNotesItem(CustomerDepotDeliveryNoteDto customerDepotDeliveryNotesItem) {
    if (this.customerDepotDeliveryNotes == null) {
      this.customerDepotDeliveryNotes = new ArrayList<CustomerDepotDeliveryNoteDto>();
    }
    this.customerDepotDeliveryNotes.add(customerDepotDeliveryNotesItem);
    return this;
  }

   /**
   * Contains all the available informations about the requested delivery notes.
   * @return customerDepotDeliveryNotes
  **/
  @ApiModelProperty(value = "Contains all the available informations about the requested delivery notes.")
  public List<CustomerDepotDeliveryNoteDto> getCustomerDepotDeliveryNotes() {
    return customerDepotDeliveryNotes;
  }

  public void setCustomerDepotDeliveryNotes(List<CustomerDepotDeliveryNoteDto> customerDepotDeliveryNotes) {
    this.customerDepotDeliveryNotes = customerDepotDeliveryNotes;
  }

  public CustomerDepotDeliveryNotesOutput pagingInfo(PagingInfo pagingInfo) {
    this.pagingInfo = pagingInfo;
    return this;
  }

   /**
   * Gets or sets the paging information.
   * @return pagingInfo
  **/
  @ApiModelProperty(value = "Gets or sets the paging information.")
  public PagingInfo getPagingInfo() {
    return pagingInfo;
  }

  public void setPagingInfo(PagingInfo pagingInfo) {
    this.pagingInfo = pagingInfo;
  }

  public CustomerDepotDeliveryNotesOutput operationResult(OperationResult operationResult) {
    this.operationResult = operationResult;
    return this;
  }

   /**
   * Contains information about the result of this service call.
   * @return operationResult
  **/
  @ApiModelProperty(required = true, value = "Contains information about the result of this service call.")
  public OperationResult getOperationResult() {
    return operationResult;
  }

  public void setOperationResult(OperationResult operationResult) {
    this.operationResult = operationResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDepotDeliveryNotesOutput customerDepotDeliveryNotesOutput = (CustomerDepotDeliveryNotesOutput) o;
    return Objects.equals(this.customerDepotDeliveryNotes, customerDepotDeliveryNotesOutput.customerDepotDeliveryNotes) &&
        Objects.equals(this.pagingInfo, customerDepotDeliveryNotesOutput.pagingInfo) &&
        Objects.equals(this.operationResult, customerDepotDeliveryNotesOutput.operationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerDepotDeliveryNotes, pagingInfo, operationResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDepotDeliveryNotesOutput {\n");
    
    sb.append("    customerDepotDeliveryNotes: ").append(toIndentedString(customerDepotDeliveryNotes)).append("\n");
    sb.append("    pagingInfo: ").append(toIndentedString(pagingInfo)).append("\n");
    sb.append("    operationResult: ").append(toIndentedString(operationResult)).append("\n");
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

