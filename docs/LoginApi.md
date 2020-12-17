# LoginApi

All URIs are relative to *https://ws-uat.esprinet.com/b2b/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginPost**](LoginApi.md#loginPost) | **POST** /login | Performs the logon to the service.


<a name="loginPost"></a>
# **loginPost**
> LoginOutput loginPost(loginInput, xConsumerTransactionId)

Performs the logon to the service.

### Example
```java
// Import classes:
//import org.lamemind.esprinetclient.invoker.ApiException;
//import org.lamemind.esprinetclient.api.LoginApi;


LoginApi apiInstance = new LoginApi();
LoginInput loginInput = new LoginInput(); // LoginInput | Input object
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    LoginOutput result = apiInstance.loginPost(loginInput, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginInput** | [**LoginInput**](LoginInput.md)| Input object |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**LoginOutput**](LoginOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

