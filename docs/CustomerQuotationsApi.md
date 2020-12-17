# CustomerQuotationsApi

All URIs are relative to *https://ws-uat.esprinet.com/b2b/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quotationGet**](CustomerQuotationsApi.md#quotationGet) | **GET** /customerQuotations/{id} | Gets the quotation previously inserted by Id
[**quotationPost**](CustomerQuotationsApi.md#quotationPost) | **POST** /customerQuotations | Creates a new quotation request containing the specified list of products into the Esprinet systems.


<a name="quotationGet"></a>
# **quotationGet**
> QuotationOutput quotationGet(id, xConsumerTransactionId)

Gets the quotation previously inserted by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerQuotationsApi;


CustomerQuotationsApi apiInstance = new CustomerQuotationsApi();
Integer id = 56; // Integer | The quotation id
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    QuotationOutput result = apiInstance.quotationGet(id, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerQuotationsApi#quotationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The quotation id |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**QuotationOutput**](QuotationOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="quotationPost"></a>
# **quotationPost**
> QuotationInputResponse quotationPost(quotation, xConsumerTransactionId)

Creates a new quotation request containing the specified list of products into the Esprinet systems.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerQuotationsApi;


CustomerQuotationsApi apiInstance = new CustomerQuotationsApi();
QuotationsInput quotation = new QuotationsInput(); // QuotationsInput | Input object
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    QuotationInputResponse result = apiInstance.quotationPost(quotation, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerQuotationsApi#quotationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotation** | [**QuotationsInput**](QuotationsInput.md)| Input object |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**QuotationInputResponse**](QuotationInputResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

