# CustomerDepotApi

All URIs are relative to *https://ws-uat.esprinet.com/b2b/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerDepotDeliveryNotesGetById**](CustomerDepotApi.md#customerDepotDeliveryNotesGetById) | **GET** /customerDepot/deliverynotes/{id} | Get the customer depot delivery note by Id
[**customerDepotDeliveryNotesSearch**](CustomerDepotApi.md#customerDepotDeliveryNotesSearch) | **GET** /customerDepot/deliverynotes | Get all delivery notes of the customer depot
[**customerDepotOrdersGetById**](CustomerDepotApi.md#customerDepotOrdersGetById) | **GET** /customerDepot/orders/{id} | Get the customer depot order by Id
[**customerDepotOrdersSearch**](CustomerDepotApi.md#customerDepotOrdersSearch) | **GET** /customerDepot/orders | Get all orders of the customer depot.
[**customerDepotProductsGetById**](CustomerDepotApi.md#customerDepotProductsGetById) | **GET** /customerDepot/products/{id} | Get the product of the customer with the given product Id stored in the Esprinet depot
[**customerDepotProductsGetByPage**](CustomerDepotApi.md#customerDepotProductsGetByPage) | **GET** /customerDepot/products/all | Get all products of the customer stored in the Esprinet depot
[**customerDepotProductsSearch**](CustomerDepotApi.md#customerDepotProductsSearch) | **GET** /customerDepot/products | Get the product of the customer with the given customer or esprinet product Id stored in the Esprinet depot
[**ordersPost**](CustomerDepotApi.md#ordersPost) | **POST** /customerDepot/orders | Creates a new order containing the specified list of products into the Esprinet systems.


<a name="customerDepotDeliveryNotesGetById"></a>
# **customerDepotDeliveryNotesGetById**
> CustomerDepotDeliveryNoteOutput customerDepotDeliveryNotesGetById(id, xConsumerTransactionId)

Get the customer depot delivery note by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerDepotApi;


CustomerDepotApi apiInstance = new CustomerDepotApi();
String id = "id_example"; // String | the delivery note id
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CustomerDepotDeliveryNoteOutput result = apiInstance.customerDepotDeliveryNotesGetById(id, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDepotApi#customerDepotDeliveryNotesGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| the delivery note id |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CustomerDepotDeliveryNoteOutput**](CustomerDepotDeliveryNoteOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerDepotDeliveryNotesSearch"></a>
# **customerDepotDeliveryNotesSearch**
> CustomerDepotDeliveryNotesOutput customerDepotDeliveryNotesSearch(fromDate, toDate, filter, currentPage, xConsumerTransactionId)

Get all delivery notes of the customer depot

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerDepotApi;


CustomerDepotApi apiInstance = new CustomerDepotApi();
OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | Filter from date
OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | Filter to date
String filter = "filter_example"; // String | Filter search by status
Integer currentPage = 56; // Integer | The current page
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CustomerDepotDeliveryNotesOutput result = apiInstance.customerDepotDeliveryNotesSearch(fromDate, toDate, filter, currentPage, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDepotApi#customerDepotDeliveryNotesSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **OffsetDateTime**| Filter from date | [optional]
 **toDate** | **OffsetDateTime**| Filter to date | [optional]
 **filter** | **String**| Filter search by status | [optional] [enum: All, NotYetInvoiced, DeliveryInProgress, DeliveryFailed]
 **currentPage** | **Integer**| The current page | [optional]
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CustomerDepotDeliveryNotesOutput**](CustomerDepotDeliveryNotesOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerDepotOrdersGetById"></a>
# **customerDepotOrdersGetById**
> CustomerDepotOrderOutput customerDepotOrdersGetById(id, xConsumerTransactionId)

Get the customer depot order by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerDepotApi;


CustomerDepotApi apiInstance = new CustomerDepotApi();
String id = "id_example"; // String | The order Id
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CustomerDepotOrderOutput result = apiInstance.customerDepotOrdersGetById(id, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDepotApi#customerDepotOrdersGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The order Id |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CustomerDepotOrderOutput**](CustomerDepotOrderOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerDepotOrdersSearch"></a>
# **customerDepotOrdersSearch**
> CustomerDepotOrdersOutput customerDepotOrdersSearch(customerOrderId, fromDate, toDate, filter, currentPage, xConsumerTransactionId)

Get all orders of the customer depot.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerDepotApi;


CustomerDepotApi apiInstance = new CustomerDepotApi();
String customerOrderId = "customerOrderId_example"; // String | The customer order Id
OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | Filter from date
OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | Filter to date
String filter = "filter_example"; // String | Filter search by status
Integer currentPage = 56; // Integer | The current page
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CustomerDepotOrdersOutput result = apiInstance.customerDepotOrdersSearch(customerOrderId, fromDate, toDate, filter, currentPage, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDepotApi#customerDepotOrdersSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerOrderId** | **String**| The customer order Id | [optional]
 **fromDate** | **OffsetDateTime**| Filter from date | [optional]
 **toDate** | **OffsetDateTime**| Filter to date | [optional]
 **filter** | **String**| Filter search by status | [optional] [enum: All, Processed, UnderApproval, PartiallyDelivered]
 **currentPage** | **Integer**| The current page | [optional]
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CustomerDepotOrdersOutput**](CustomerDepotOrdersOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerDepotProductsGetById"></a>
# **customerDepotProductsGetById**
> CustomerDepotProductOutput customerDepotProductsGetById(id, xConsumerTransactionId)

Get the product of the customer with the given product Id stored in the Esprinet depot

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerDepotApi;


CustomerDepotApi apiInstance = new CustomerDepotApi();
String id = "id_example"; // String | The product Id
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CustomerDepotProductOutput result = apiInstance.customerDepotProductsGetById(id, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDepotApi#customerDepotProductsGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The product Id |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CustomerDepotProductOutput**](CustomerDepotProductOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerDepotProductsGetByPage"></a>
# **customerDepotProductsGetByPage**
> CustomerDepotProductsOutput customerDepotProductsGetByPage(currentPage, xConsumerTransactionId)

Get all products of the customer stored in the Esprinet depot

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerDepotApi;


CustomerDepotApi apiInstance = new CustomerDepotApi();
Integer currentPage = 56; // Integer | The current page
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CustomerDepotProductsOutput result = apiInstance.customerDepotProductsGetByPage(currentPage, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDepotApi#customerDepotProductsGetByPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currentPage** | **Integer**| The current page | [optional]
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CustomerDepotProductsOutput**](CustomerDepotProductsOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerDepotProductsSearch"></a>
# **customerDepotProductsSearch**
> CustomerDepotProductOutput customerDepotProductsSearch(esprinetProductCode, customerProductCode, xConsumerTransactionId)

Get the product of the customer with the given customer or esprinet product Id stored in the Esprinet depot

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerDepotApi;


CustomerDepotApi apiInstance = new CustomerDepotApi();
String esprinetProductCode = "esprinetProductCode_example"; // String | The esprinet product code
String customerProductCode = "customerProductCode_example"; // String | The customer product code
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CustomerDepotProductOutput result = apiInstance.customerDepotProductsSearch(esprinetProductCode, customerProductCode, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDepotApi#customerDepotProductsSearch");
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

[**CustomerDepotProductOutput**](CustomerDepotProductOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="ordersPost"></a>
# **ordersPost**
> CustomerDepotOrderInsertOutput ordersPost(orderInput, xConsumerTransactionId)

Creates a new order containing the specified list of products into the Esprinet systems.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerDepotApi;


CustomerDepotApi apiInstance = new CustomerDepotApi();
CustomerDepotOrderInput orderInput = new CustomerDepotOrderInput(); // CustomerDepotOrderInput | Input object
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    CustomerDepotOrderInsertOutput result = apiInstance.ordersPost(orderInput, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDepotApi#ordersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderInput** | [**CustomerDepotOrderInput**](CustomerDepotOrderInput.md)| Input object |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**CustomerDepotOrderInsertOutput**](CustomerDepotOrderInsertOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

