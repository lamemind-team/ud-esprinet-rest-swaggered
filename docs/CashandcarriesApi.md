# CashandcarriesApi

All URIs are relative to *https://ws-uat.esprinet.com/b2b/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cashAndCarryAvailabilityGet**](CashandcarriesApi.md#cashAndCarryAvailabilityGet) | **GET** /cashandcarries/products/availability | Get a Product Availability Info by the Esprinet or Customer product code for all the Cash And Carries
[**cashAndCarryAvailabilityGetByCash**](CashandcarriesApi.md#cashAndCarryAvailabilityGetByCash) | **GET** /cashandcarries/{cashId}/products/availability | Get a Product Availability Info by the Esprinet or Customer product code for  the chosen Cash And Carry
[**cashAndCarryPricingGet**](CashandcarriesApi.md#cashAndCarryPricingGet) | **GET** /cashandcarries/products/pricing | Get a Product Pricing Info by the Esprinet or Customer product code for all the Cash And Carries
[**cashAndCarryPricingGetByCash**](CashandcarriesApi.md#cashAndCarryPricingGetByCash) | **GET** /cashandcarries/{cashId}/products/pricing | Get a Product Pricing Info by the Esprinet or Customer product code for  the chosen Cash And Carry


<a name="cashAndCarryAvailabilityGet"></a>
# **cashAndCarryAvailabilityGet**
> CashAndCarriesProductAvailabilityByCodeOutput cashAndCarryAvailabilityGet(esprinetProductCode, customerProductCode, xConsumerTransactionId)

Get a Product Availability Info by the Esprinet or Customer product code for all the Cash And Carries

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CashandcarriesApi;


CashandcarriesApi apiInstance = new CashandcarriesApi();
String esprinetProductCode = "esprinetProductCode_example"; // String | The esprinet product code
String customerProductCode = "customerProductCode_example"; // String | The customer product code
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CashAndCarriesProductAvailabilityByCodeOutput result = apiInstance.cashAndCarryAvailabilityGet(esprinetProductCode, customerProductCode, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashandcarriesApi#cashAndCarryAvailabilityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **esprinetProductCode** | **String**| The esprinet product code | [optional]
 **customerProductCode** | **String**| The customer product code | [optional]
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CashAndCarriesProductAvailabilityByCodeOutput**](CashAndCarriesProductAvailabilityByCodeOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cashAndCarryAvailabilityGetByCash"></a>
# **cashAndCarryAvailabilityGetByCash**
> CashAndCarryProductAvailabilityByCodeOutput cashAndCarryAvailabilityGetByCash(cashId, esprinetProductCode, customerProductCode, xConsumerTransactionId)

Get a Product Availability Info by the Esprinet or Customer product code for  the chosen Cash And Carry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CashandcarriesApi;


CashandcarriesApi apiInstance = new CashandcarriesApi();
String cashId = "cashId_example"; // String | The Cash And Carry id
String esprinetProductCode = "esprinetProductCode_example"; // String | The esprinet product code
String customerProductCode = "customerProductCode_example"; // String | The customer product code
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CashAndCarryProductAvailabilityByCodeOutput result = apiInstance.cashAndCarryAvailabilityGetByCash(cashId, esprinetProductCode, customerProductCode, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashandcarriesApi#cashAndCarryAvailabilityGetByCash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashId** | **String**| The Cash And Carry id |
 **esprinetProductCode** | **String**| The esprinet product code | [optional]
 **customerProductCode** | **String**| The customer product code | [optional]
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CashAndCarryProductAvailabilityByCodeOutput**](CashAndCarryProductAvailabilityByCodeOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cashAndCarryPricingGet"></a>
# **cashAndCarryPricingGet**
> CashAndCarriesProductPricingByCodeOutput cashAndCarryPricingGet(esprinetProductCode, customerProductCode, xConsumerTransactionId)

Get a Product Pricing Info by the Esprinet or Customer product code for all the Cash And Carries

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CashandcarriesApi;


CashandcarriesApi apiInstance = new CashandcarriesApi();
String esprinetProductCode = "esprinetProductCode_example"; // String | The esprinet product code
String customerProductCode = "customerProductCode_example"; // String | The customer product code
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CashAndCarriesProductPricingByCodeOutput result = apiInstance.cashAndCarryPricingGet(esprinetProductCode, customerProductCode, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashandcarriesApi#cashAndCarryPricingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **esprinetProductCode** | **String**| The esprinet product code | [optional]
 **customerProductCode** | **String**| The customer product code | [optional]
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CashAndCarriesProductPricingByCodeOutput**](CashAndCarriesProductPricingByCodeOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cashAndCarryPricingGetByCash"></a>
# **cashAndCarryPricingGetByCash**
> CashAndCarriesProductPricingByCodeOutput cashAndCarryPricingGetByCash(cashId, esprinetProductCode, customerProductCode, xConsumerTransactionId)

Get a Product Pricing Info by the Esprinet or Customer product code for  the chosen Cash And Carry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CashandcarriesApi;


CashandcarriesApi apiInstance = new CashandcarriesApi();
String cashId = "cashId_example"; // String | The Cash And Carry id
String esprinetProductCode = "esprinetProductCode_example"; // String | The esprinet product code
String customerProductCode = "customerProductCode_example"; // String | The customer product code
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CashAndCarriesProductPricingByCodeOutput result = apiInstance.cashAndCarryPricingGetByCash(cashId, esprinetProductCode, customerProductCode, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashandcarriesApi#cashAndCarryPricingGetByCash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashId** | **String**| The Cash And Carry id |
 **esprinetProductCode** | **String**| The esprinet product code | [optional]
 **customerProductCode** | **String**| The customer product code | [optional]
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CashAndCarriesProductPricingByCodeOutput**](CashAndCarriesProductPricingByCodeOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

