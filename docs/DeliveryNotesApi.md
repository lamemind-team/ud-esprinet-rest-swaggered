# DeliveryNotesApi

All URIs are relative to *https://ws-uat.esprinet.com/b2b/api/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deliveryNoteGet**](DeliveryNotesApi.md#deliveryNoteGet) | **GET** /deliveryNotes/{id} | Get a Delivery Note By Document Number
[**deliveryNotesSearchGet**](DeliveryNotesApi.md#deliveryNotesSearchGet) | **GET** /deliveryNotes | Get a all the delivery notes by the inserted criterias


<a name="deliveryNoteGet"></a>
# **deliveryNoteGet**
> GetDeliveryNoteOutput deliveryNoteGet(id, xConsumerTransactionId)

Get a Delivery Note By Document Number

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeliveryNotesApi;


DeliveryNotesApi apiInstance = new DeliveryNotesApi();
String id = "id_example"; // String | The delivery note document number
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    GetDeliveryNoteOutput result = apiInstance.deliveryNoteGet(id, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryNotesApi#deliveryNoteGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The delivery note document number |
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**GetDeliveryNoteOutput**](GetDeliveryNoteOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deliveryNotesSearchGet"></a>
# **deliveryNotesSearchGet**
> SearchDeliveryNotesOutput deliveryNotesSearchGet(documentNumber, fromDate, toDate, filter, currentPage, xConsumerTransactionId)

Get a all the delivery notes by the inserted criterias

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeliveryNotesApi;


DeliveryNotesApi apiInstance = new DeliveryNotesApi();
String documentNumber = "documentNumber_example"; // String | The delivery note document number
OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | delivery notes date from
OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | delivery notes date to
String filter = "filter_example"; // String | Filter search by status
Integer currentPage = 56; // Integer | current Page to be display. This optional parameter if valorized must be equal or greater than 1
String xConsumerTransactionId = "xConsumerTransactionId_example"; // String | Identifies the transaction at the consumer/client side (Optional).
try {
    SearchDeliveryNotesOutput result = apiInstance.deliveryNotesSearchGet(documentNumber, fromDate, toDate, filter, currentPage, xConsumerTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryNotesApi#deliveryNotesSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentNumber** | **String**| The delivery note document number | [optional]
 **fromDate** | **OffsetDateTime**| delivery notes date from | [optional]
 **toDate** | **OffsetDateTime**| delivery notes date to | [optional]
 **filter** | **String**| Filter search by status | [optional] [enum: All, NotYetInvoiced, DeliveryInProgress, DeliveryFailed]
 **currentPage** | **Integer**| current Page to be display. This optional parameter if valorized must be equal or greater than 1 | [optional]
 **xConsumerTransactionId** | **String**| Identifies the transaction at the consumer/client side (Optional). | [optional]

### Return type

[**SearchDeliveryNotesOutput**](SearchDeliveryNotesOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

