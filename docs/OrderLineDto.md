
# OrderLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Esprinet-generated order line number. |  [optional]
**esprinetProductCode** | **String** | Esprinet product code. |  [optional]
**customerProductCode** | **String** | Customer product code (if available). |  [optional]
**quantity** | **Integer** | Amount of ordered items. | 
**price** | **Double** | Single item price. The final price including discounts is calculated at runtime by Esprinet systems when the order is confirmed. |  [optional]
**esprinetQuotationId** | **Integer** | The related offerId. |  [optional]
**productGroup** | **String** | Depending on the availability of each product at the time of the order, items ordered together may not be shipped together. Usually this allows to improve the service to the customer because the delay of a single item&#39;s delivery does not prevent the other items in the order to be shipped. In cases this behaviour is not wanted (like when multiple items are part of a whole, must be used together and splitting the shipping doesn&#39;t make sense) it is possible to change it by setting an integer value from 1 to 5 in this field. Ordered products with the same value for this field are always shipped together as a whole. |  [optional]
**bid** | [**BID**](BID.md) | The BID structure is optional and represents a voucher for a special discount that a customer may have agreed with a vendor. If specified within the order the validity of all of the BID structure fields is checked against the vendor and if everything is OK order processing goes on with the BID price applied to the specified product. |  [optional]
**remainingForDelivery** | **Integer** | Amount of remaining items to be delivered. |  [optional]
**reservedQuantity** | **Integer** | Amount of reserved items to be delivered. |  [optional]
**vat** | **Double** | Amount of Vat. | 
**taxes** | **Double** | Total amount of taxes | 
**isUpdatable** | **Boolean** | Indicate if the order line can be updated | 
**deliveryNotes** | [**List&lt;OrderDocument&gt;**](OrderDocument.md) | Get a list of delivery notes ids connected to the order |  [optional]
**invoices** | [**List&lt;OrderDocument&gt;**](OrderDocument.md) | Get a list of invoices ids connected to the order |  [optional]
**orderStatusId** | **String** |  |  [optional]
**customerLineId** | **String** | The Customer Line Id |  [optional]
**expectedArrivals** | [**List&lt;ExpectedArrival&gt;**](ExpectedArrival.md) | The dates on which the next stock of items is expected to be delivered to Esrpinet. |  [optional]
**requestedDeliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The requested delivery date |  [optional]
**activationKeys** | [**List&lt;ActivationKeyDto&gt;**](ActivationKeyDto.md) | Gets the lists of the activation keys (if there are any). |  [optional]



