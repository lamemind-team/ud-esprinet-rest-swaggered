# OrdersApi

All URIs are relative to *https://ws-uat.esprinet.com/b2b/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderDelete**](OrdersApi.md#orderDelete) | **DELETE** /orders/{id} | Delete the order with the given id
[**orderGet**](OrdersApi.md#orderGet) | **GET** /orders/{id} | Get an Order by the Order Id
[**orderLinesDelete**](OrdersApi.md#orderLinesDelete) | **DELETE** /orders/{orderId}/lines/{orderLineId} | Delete the order line with the given order line id of the given order
[**orderPatch**](OrdersApi.md#orderPatch) | **PATCH** /orders/{id} | Unlock the order with the given id
[**orderPost**](OrdersApi.md#orderPost) | **POST** /orders | Creates a new order containing the specified list of products into the Esprinet systems.
[**orderPut**](OrdersApi.md#orderPut) | **PUT** /orders/{id} | Modifies an already existing order into the Esprinet systems.
[**orderTransactionsGetById**](OrdersApi.md#orderTransactionsGetById) | **GET** /orders/transactions/{id} | Return the tracking transaction by the transaction id
[**ordersSearchGet**](OrdersApi.md#ordersSearchGet) | **GET** /orders | Obtains a list of orders, already existing into the Esprinet systems, satisfying the specified search criterias.  The search period should not exceed 30 days
[**ordersSummaryGet**](OrdersApi.md#ordersSummaryGet) | **GET** /orders/summary | Obtains a summary of orders satisfying the specified search criterias.  The search period should not exceed 30 days


<a name="orderDelete"></a>
# **orderDelete**
> OrderTransactionIdOutput orderDelete(id, xConsumerTransactionId)

Delete the order with the given id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String id = "id_example"; // String | order Id (document number)
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    OrderTransactionIdOutput result = apiInstance.orderDelete(id, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#orderDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| order Id (document number) |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**OrderTransactionIdOutput**](OrderTransactionIdOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="orderGet"></a>
# **orderGet**
> GetOrderInfoOutput orderGet(id, xConsumerTransactionId)

Get an Order by the Order Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String id = "id_example"; // String | The complete order Id (type and number)
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    GetOrderInfoOutput result = apiInstance.orderGet(id, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#orderGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The complete order Id (type and number) |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**GetOrderInfoOutput**](GetOrderInfoOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="orderLinesDelete"></a>
# **orderLinesDelete**
> OrderTransactionIdOutput orderLinesDelete(orderId, orderLineId, xConsumerTransactionId)

Delete the order line with the given order line id of the given order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String orderId = "orderId_example"; // String | order Id (document number)
Integer orderLineId = 56; // Integer | order line Id
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    OrderTransactionIdOutput result = apiInstance.orderLinesDelete(orderId, orderLineId, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#orderLinesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| order Id (document number) |
 **orderLineId** | **Integer**| order line Id |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**OrderTransactionIdOutput**](OrderTransactionIdOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="orderPatch"></a>
# **orderPatch**
> OrderTransactionIdOutput orderPatch(id, xConsumerTransactionId)

Unlock the order with the given id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String id = "id_example"; // String | order Id (document number)
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    OrderTransactionIdOutput result = apiInstance.orderPatch(id, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#orderPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| order Id (document number) |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**OrderTransactionIdOutput**](OrderTransactionIdOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="orderPost"></a>
# **orderPost**
> InsertOrderOutput orderPost(insertOrderInput, xConsumerTransactionId)

Creates a new order containing the specified list of products into the Esprinet systems.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
InsertOrderInput insertOrderInput = new InsertOrderInput(); // InsertOrderInput | Input object
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    InsertOrderOutput result = apiInstance.orderPost(insertOrderInput, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#orderPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insertOrderInput** | [**InsertOrderInput**](InsertOrderInput.md)| Input object |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**InsertOrderOutput**](InsertOrderOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="orderPut"></a>
# **orderPut**
> OrderTransactionIdOutput orderPut(id, modifyOrderInput, xConsumerTransactionId)

Modifies an already existing order into the Esprinet systems.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String id = "id_example"; // String | The complete order Id (type and number)
ModifyOrderInput modifyOrderInput = new ModifyOrderInput(); // ModifyOrderInput | Input object
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    OrderTransactionIdOutput result = apiInstance.orderPut(id, modifyOrderInput, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#orderPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The complete order Id (type and number) |
 **modifyOrderInput** | [**ModifyOrderInput**](ModifyOrderInput.md)| Input object |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**OrderTransactionIdOutput**](OrderTransactionIdOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="orderTransactionsGetById"></a>
# **orderTransactionsGetById**
> OrderTransactionOutput orderTransactionsGetById(id, xConsumerTransactionId)

Return the tracking transaction by the transaction id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
Integer id = 56; // Integer | the transaction Id
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    OrderTransactionOutput result = apiInstance.orderTransactionsGetById(id, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#orderTransactionsGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the transaction Id |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**OrderTransactionOutput**](OrderTransactionOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="ordersSearchGet"></a>
# **ordersSearchGet**
> SearchOrdersOutput ordersSearchGet(customerOrderId, fromDate, toDate, filter, currentPage, xConsumerTransactionId)

Obtains a list of orders, already existing into the Esprinet systems, satisfying the specified search criterias.  The search period should not exceed 30 days

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
String customerOrderId = "customerOrderId_example"; // String | customer order id
OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | from date orders
OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | to date orders
String filter = "filter_example"; // String | Filter search by status
Integer currentPage = 56; // Integer | current Page to be display. This optional parameter if valorized must be equal or greater than 1
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    SearchOrdersOutput result = apiInstance.ordersSearchGet(customerOrderId, fromDate, toDate, filter, currentPage, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#ordersSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerOrderId** | **String**| customer order id | [optional]
 **fromDate** | **OffsetDateTime**| from date orders | [optional]
 **toDate** | **OffsetDateTime**| to date orders | [optional]
 **filter** | **String**| Filter search by status | [optional] [enum: All, Processed, UnderApproval, PartiallyDelivered]
 **currentPage** | **Integer**| current Page to be display. This optional parameter if valorized must be equal or greater than 1 | [optional]
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**SearchOrdersOutput**](SearchOrdersOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="ordersSummaryGet"></a>
# **ordersSummaryGet**
> OrdersSummaryOutput ordersSummaryGet(fromDate, toDate, xConsumerTransactionId)

Obtains a summary of orders satisfying the specified search criterias.  The search period should not exceed 30 days

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrdersApi;


OrdersApi apiInstance = new OrdersApi();
OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | from date orders
OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | to date orders
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    OrdersSummaryOutput result = apiInstance.ordersSummaryGet(fromDate, toDate, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#ordersSummaryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **OffsetDateTime**| from date orders |
 **toDate** | **OffsetDateTime**| to date orders |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**OrdersSummaryOutput**](OrdersSummaryOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

