
# DeliveryNoteLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**esprinetLineNumber** | **Integer** |  | 
**esprinetProductCode** | **String** | Esprinet product code. |  [optional]
**customerProductCode** | **String** | Customer product code (if available). |  [optional]
**quantity** | **Integer** | Amount of ordered items. | 
**price** | **Double** | Single item price. The final price including discounts is calculated at runtime by Esprinet systems when the order is confirmed. |  [optional]
**vat** | **Double** | Amount of Vat. | 
**taxes** | **Double** | Total amount of taxes | 
**serialNumbers** | **List&lt;String&gt;** |  |  [optional]



