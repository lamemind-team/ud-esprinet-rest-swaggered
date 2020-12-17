
# OrderDto

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
**lockedOnCreation** | **Boolean** | This field controls whether the order is created as \&quot;locked\&quot; or not. When an order is created as \&quot;locked\&quot; the products it contains are \&quot;reserved\&quot; by the Esprinet systems (for only a short amount of time) but any further processing is \&quot;freezed\&quot; until the order is \&quot;unlocked\&quot; through a proper invocation of the ModifyOrder method. Restrictions on availability of this feature may apply, depending on contract agreement with Esprinet. | 
**orderLines** | [**List&lt;OrderLineDto&gt;**](OrderLineDto.md) | Collection of lines (details) of the order. |  [optional]
**requestedDeliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of when the order invoice has been delivered. |  [optional]
**currency** | **String** | The order currency |  [optional]
**orderType** | **String** | the order Type |  [optional]
**isUpdatable** | **Boolean** | Indicate if the order can be updated | 
**isFreightForwarding** | **Boolean** | the IsFreightForwarding field | 



