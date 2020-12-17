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
import org.lamemind.esprinetclient.model.OperationResult;

/**
 * InsertOrderOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T15:47:59.649+01:00")
public class InsertOrderOutput {
  @SerializedName("esprinetOrderId")
  private String esprinetOrderId = null;

  @SerializedName("operationResult")
  private OperationResult operationResult = null;

  public InsertOrderOutput esprinetOrderId(String esprinetOrderId) {
    this.esprinetOrderId = esprinetOrderId;
    return this;
  }

   /**
   * Contains the generated Order Id.
   * @return esprinetOrderId
  **/
  @ApiModelProperty(value = "Contains the generated Order Id.")
  public String getEsprinetOrderId() {
    return esprinetOrderId;
  }

  public void setEsprinetOrderId(String esprinetOrderId) {
    this.esprinetOrderId = esprinetOrderId;
  }

  public InsertOrderOutput operationResult(OperationResult operationResult) {
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
    InsertOrderOutput insertOrderOutput = (InsertOrderOutput) o;
    return Objects.equals(this.esprinetOrderId, insertOrderOutput.esprinetOrderId) &&
        Objects.equals(this.operationResult, insertOrderOutput.operationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esprinetOrderId, operationResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertOrderOutput {\n");
    
    sb.append("    esprinetOrderId: ").append(toIndentedString(esprinetOrderId)).append("\n");
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

