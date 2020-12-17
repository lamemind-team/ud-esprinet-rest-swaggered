
# DeliveryNoteDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**esprinetDeliveryNoteId** | **String** | The id of the delivery note. |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the delivery note was issued. | 
**isProofOfDeliveryRequired** | **Boolean** | Whether it is required that the customer signs a receipt proving the delivery has taken place.  Requiring a Proof Of Delivery for an order is an additional service and may be subject to additional fares, calculated per each delivery. | 
**deliverTo** | [**Address**](Address.md) | The address where the order shall be delivered to. |  [optional]
**shippingInfo** | [**ShippingInfoDto**](ShippingInfoDto.md) | Shipping information related to this order line. |  [optional]
**deliveryNoteLines** | [**List&lt;DeliveryNoteLineDto&gt;**](DeliveryNoteLineDto.md) |  |  [optional]
**esprinetDeliveryNoteNumber** | **String** |  |  [optional]
**shippingCost** | **Double** |  |  [optional]
**invoiceNumber** | **String** |  |  [optional]
**invoiceDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**customerDeliveryNoteId** | **String** |  |  [optional]
**shippedByVendor** | **Boolean** |  | 
**packageCount** | **Integer** |  | 



