
# InsertOrderLineInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productCode** | **String** | Esprinet product code. | 
**quantity** | **Integer** | Amount of items to order. | 
**productGroup** | **Integer** | Depending on the availability of each product at the time of the order, items ordered together may not be shipped together. Usually this allows to improve the service to the customer because the delay of a single item&#39;s delivery does not prevent the other items in the order to be shipped. In cases this behaviour is not wanted (like when multiple items are part of a whole, must be used together and splitting the shipping doesn&#39;t make sense) it is possible to change it by setting an integer value from 1 to 5 in this field. Ordered products with the same value for this field are always shipped together as a whole. |  [optional]
**bid** | [**BID**](BID.md) | The BID structure is optional and represents a voucher for a special discount that a customer may have agreed with a vendor. If specified within the order the validity of all of the BID structure fields is checked against the vendor and if everything is OK order processing goes on with the BID price applied to the specified product. |  [optional]
**customerQuotationId** | **Integer** | The related offer to be applied for this product. |  [optional]
**customerLineId** | **String** | The Customer Line Id |  [optional]



