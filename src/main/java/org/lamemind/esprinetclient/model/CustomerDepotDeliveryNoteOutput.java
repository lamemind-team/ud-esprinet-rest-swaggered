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
import org.lamemind.esprinetclient.model.CustomerDepotDeliveryNoteDto;
import org.lamemind.esprinetclient.model.OperationResult;

/**
 * CustomerDepotDeliveryNoteOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T15:47:59.649+01:00")
public class CustomerDepotDeliveryNoteOutput {
  @SerializedName("customerDepotDeliveryNote")
  private CustomerDepotDeliveryNoteDto customerDepotDeliveryNote = null;

  @SerializedName("operationResult")
  private OperationResult operationResult = null;

  public CustomerDepotDeliveryNoteOutput customerDepotDeliveryNote(CustomerDepotDeliveryNoteDto customerDepotDeliveryNote) {
    this.customerDepotDeliveryNote = customerDepotDeliveryNote;
    return this;
  }

   /**
   * Contains all the available informations about the requested delivery note.
   * @return customerDepotDeliveryNote
  **/
  @ApiModelProperty(value = "Contains all the available informations about the requested delivery note.")
  public CustomerDepotDeliveryNoteDto getCustomerDepotDeliveryNote() {
    return customerDepotDeliveryNote;
  }

  public void setCustomerDepotDeliveryNote(CustomerDepotDeliveryNoteDto customerDepotDeliveryNote) {
    this.customerDepotDeliveryNote = customerDepotDeliveryNote;
  }

  public CustomerDepotDeliveryNoteOutput operationResult(OperationResult operationResult) {
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
    CustomerDepotDeliveryNoteOutput customerDepotDeliveryNoteOutput = (CustomerDepotDeliveryNoteOutput) o;
    return Objects.equals(this.customerDepotDeliveryNote, customerDepotDeliveryNoteOutput.customerDepotDeliveryNote) &&
        Objects.equals(this.operationResult, customerDepotDeliveryNoteOutput.operationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerDepotDeliveryNote, operationResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDepotDeliveryNoteOutput {\n");
    
    sb.append("    customerDepotDeliveryNote: ").append(toIndentedString(customerDepotDeliveryNote)).append("\n");
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
