
# CustomerDepotOrderDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Esprinet-generated order number. |  [optional]
**orderDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of when the order has been created. | 
**esprinetOrderId** | **String** | Esprinet-generated order id. |  [optional]
**orderStatusId** | **String** | Esprinet order status id. |  [optional]
**orderStatusDescription** | **String** | Esprinet order status description. |  [optional]
**customerOrderId** | **String** | Customer-generated order id. |  [optional]
**customerComments** | **String** | Customer notes related to the order. |  [optional]
**deliverTo** | [**Address**](Address.md) | The address where the order items should be delivered to. |  [optional]
**isCustomerDeliveryNote** | **Boolean** | This field controls whether the shipping to the address specified within the order is done as appearing to come from Esprinet (when false) or from the customer who has placed the order (when true). This usually involves putting the customer logos and details in the delivery note which accompanies every shipping. This feature can be used by a retailer who is placing an order for one of its customers and does want the shipping to appear to come from him. | 
**orderLines** | [**List&lt;CustomerDepotOrderLineDto&gt;**](CustomerDepotOrderLineDto.md) | Collection of lines (details) of the order. |  [optional]
**requestedDeliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of when the order invoice has been delivered. |  [optional]
**currency** | **String** | The order currency |  [optional]
**orderType** | **String** | the order Type |  [optional]



