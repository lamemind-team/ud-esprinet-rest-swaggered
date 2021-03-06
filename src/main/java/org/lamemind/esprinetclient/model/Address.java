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

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-17T15:47:59.649+01:00")
public class Address {
  @SerializedName("name")
  private String name = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("zipCode")
  private String zipCode = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("province")
  private String province = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("altPhoneNumber")
  private String altPhoneNumber = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("deliveryNoteCopyRecipient")
  private String deliveryNoteCopyRecipient = null;

  @SerializedName("glnCode")
  private String glnCode = null;

  public Address name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the person the address references to.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the person the address references to.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Street name and number property.
   * @return street
  **/
  @ApiModelProperty(required = true, value = "Street name and number property.")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Zip code property.
   * @return zipCode
  **/
  @ApiModelProperty(required = true, value = "Zip code property.")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City property.
   * @return city
  **/
  @ApiModelProperty(required = true, value = "City property.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address province(String province) {
    this.province = province;
    return this;
  }

   /**
   * Province property.
   * @return province
  **/
  @ApiModelProperty(required = true, value = "Province property.")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country property.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country property.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number of the person the address references to.
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "Phone number of the person the address references to.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Address altPhoneNumber(String altPhoneNumber) {
    this.altPhoneNumber = altPhoneNumber;
    return this;
  }

   /**
   * Alternate phone number of the person the address references to.
   * @return altPhoneNumber
  **/
  @ApiModelProperty(value = "Alternate phone number of the person the address references to.")
  public String getAltPhoneNumber() {
    return altPhoneNumber;
  }

  public void setAltPhoneNumber(String altPhoneNumber) {
    this.altPhoneNumber = altPhoneNumber;
  }

  public Address email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the person the address references to.
   * @return email
  **/
  @ApiModelProperty(value = "Email address of the person the address references to.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Address deliveryNoteCopyRecipient(String deliveryNoteCopyRecipient) {
    this.deliveryNoteCopyRecipient = deliveryNoteCopyRecipient;
    return this;
  }

   /**
   * DeliveryNoteCopyRecipient mail address of the person the address references to.
   * @return deliveryNoteCopyRecipient
  **/
  @ApiModelProperty(value = "DeliveryNoteCopyRecipient mail address of the person the address references to.")
  public String getDeliveryNoteCopyRecipient() {
    return deliveryNoteCopyRecipient;
  }

  public void setDeliveryNoteCopyRecipient(String deliveryNoteCopyRecipient) {
    this.deliveryNoteCopyRecipient = deliveryNoteCopyRecipient;
  }

  public Address glnCode(String glnCode) {
    this.glnCode = glnCode;
    return this;
  }

   /**
   * GLN property.
   * @return glnCode
  **/
  @ApiModelProperty(value = "GLN property.")
  public String getGlnCode() {
    return glnCode;
  }

  public void setGlnCode(String glnCode) {
    this.glnCode = glnCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.name, address.name) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.zipCode, address.zipCode) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.province, address.province) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.phoneNumber, address.phoneNumber) &&
        Objects.equals(this.altPhoneNumber, address.altPhoneNumber) &&
        Objects.equals(this.email, address.email) &&
        Objects.equals(this.deliveryNoteCopyRecipient, address.deliveryNoteCopyRecipient) &&
        Objects.equals(this.glnCode, address.glnCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, street, zipCode, city, province, country, phoneNumber, altPhoneNumber, email, deliveryNoteCopyRecipient, glnCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    altPhoneNumber: ").append(toIndentedString(altPhoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    deliveryNoteCopyRecipient: ").append(toIndentedString(deliveryNoteCopyRecipient)).append("\n");
    sb.append("    glnCode: ").append(toIndentedString(glnCode)).append("\n");
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

