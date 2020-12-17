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
import io.swagger.client.model.OperationResult;
import java.io.IOException;

/**
 * OrderTransactionIdOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T14:59:51.596+01:00")
public class OrderTransactionIdOutput {
  @SerializedName("transactionId")
  private Integer transactionId = null;

  @SerializedName("operationResult")
  private OperationResult operationResult = null;

  public OrderTransactionIdOutput transactionId(Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Contains the generated transaction Id.
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "Contains the generated transaction Id.")
  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }

  public OrderTransactionIdOutput operationResult(OperationResult operationResult) {
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
    OrderTransactionIdOutput orderTransactionIdOutput = (OrderTransactionIdOutput) o;
    return Objects.equals(this.transactionId, orderTransactionIdOutput.transactionId) &&
        Objects.equals(this.operationResult, orderTransactionIdOutput.operationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, operationResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderTransactionIdOutput {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

