
# ModifyOrderLineInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The id of the order line to modify.  &lt;remarks&gt;  Evaluate to 0 to add a new line.  Evaluate to a specific {Esprinet.WebServices.Dtos.Order.OrderLineDto.Id} to update or delete an existing order line.  &lt;/remarks&gt; | 
**productCode** | **String** | The Esprinet product code to be added to the line subject of modification.  &lt;remarks&gt;  Evaluate only when appending a new line.  &lt;/remarks&gt; |  [optional]
**quantity** | **Integer** | Order line quantity.  &lt;remarks&gt;  Evaluate to 0 to delete the specified order line.  Evaluate to a quantity greater than 0 to modify the ordered quantity of the order line.  &lt;/remarks&gt; | 



