
# CustomerDepotDeliveryNoteDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**esprinetDeliveryNoteId** | **String** | The id of the delivery note. |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the delivery note was issued. | 
**deliverTo** | [**Address**](Address.md) | The address where the order shall be delivered to. |  [optional]
**shippingInfo** | [**ShippingInfoDto**](ShippingInfoDto.md) | Shipping information related to this order line. |  [optional]
**deliveryNoteLines** | [**List&lt;CustomerDepotDeliveryNoteLineDto&gt;**](CustomerDepotDeliveryNoteLineDto.md) |  |  [optional]
**esprinetDeliveryNoteNumber** | **String** |  |  [optional]
**shippingCost** | **Double** |  |  [optional]
**invoiceNumber** | **String** |  |  [optional]
**invoiceDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**customerDeliveryNoteId** | **String** |  |  [optional]



