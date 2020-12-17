
# CustomerDepotOrderLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Esprinet-generated order line number. |  [optional]
**productCode** | **String** | Product code. |  [optional]
**_configuration** | **String** | Configuration code. |  [optional]
**esprinetProductCode** | **String** | Esprinet product code. |  [optional]
**customerProductCode** | **String** | Customer product code (if available). |  [optional]
**quantity** | **Integer** | Amount of ordered items. | 
**productGroup** | **String** | Depending on the availability of each product at the time of the order, items ordered together may not be shipped together. Usually this allows to improve the service to the customer because the delay of a single item&#39;s delivery does not prevent the other items in the order to be shipped. In cases this behaviour is not wanted (like when multiple items are part of a whole, must be used together and splitting the shipping doesn&#39;t make sense) it is possible to change it by setting an integer value from 1 to 5 in this field. Ordered products with the same value for this field are always shipped together as a whole. |  [optional]
**remainingForDelivery** | **Integer** | Amount of remaining items to be delivered. |  [optional]
**reservedQuantity** | **Integer** | Amount of reserved items to be delivered. |  [optional]
**deliveryNotes** | [**List&lt;OrderDocument&gt;**](OrderDocument.md) | Get a list of delivery notes ids connected to the order |  [optional]
**orderStatusId** | **String** |  |  [optional]



