# ProductsApi

All URIs are relative to *https://ws-uat.esprinet.com/b2b/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productsAvailabilityGet**](ProductsApi.md#productsAvailabilityGet) | **GET** /products/availability | Get a Product Availability Info by the Esprinet or Customer product code
[**productsPricingGet**](ProductsApi.md#productsPricingGet) | **GET** /products/pricing | Get a Product Pricing Info by the Esprinet or Customer product code


<a name="productsAvailabilityGet"></a>
# **productsAvailabilityGet**
> ProductAvailabilityByCodeOutput productsAvailabilityGet(esprinetProductCode, customerProductCode, xConsumerTransactionId)

Get a Product Availability Info by the Esprinet or Customer product code

### Example
```java
// Import classes:
//import org.lamemind.esprinetclient.invoker.ApiException;
//import org.lamemind.esprinetclient.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String esprinetProductCode = "esprinetProductCode_example"; // String | The esprinet product code
String customerProductCode = "customerProductCode_example"; // String | The customer product code
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    ProductAvailabilityByCodeOutput result = apiInstance.productsAvailabilityGet(esprinetProductCode, customerProductCode, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsAvailabilityGet");
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

[**ProductAvailabilityByCodeOutput**](ProductAvailabilityByCodeOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="productsPricingGet"></a>
# **productsPricingGet**
> ProductPricingByCodeOutput productsPricingGet(esprinetProductCode, customerProductCode, xConsumerTransactionId)

Get a Product Pricing Info by the Esprinet or Customer product code

### Example
```java
// Import classes:
//import org.lamemind.esprinetclient.invoker.ApiException;
//import org.lamemind.esprinetclient.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String esprinetProductCode = "esprinetProductCode_example"; // String | The esprinet product code
String customerProductCode = "customerProductCode_example"; // String | The customer product code
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    ProductPricingByCodeOutput result = apiInstance.productsPricingGet(esprinetProductCode, customerProductCode, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsPricingGet");
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

[**ProductPricingByCodeOutput**](ProductPricingByCodeOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

