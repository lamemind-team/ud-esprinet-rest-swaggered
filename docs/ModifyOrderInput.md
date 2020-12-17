
# ModifyOrderInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerOrderId** | **String** | The new Customer Order Id ({Esprinet.WebServices.Dtos.Order.OrderDto.CustomerOrderId}).  &lt;remarks&gt;Evaluate only when a customer order id update is required, leave blank or null otherwise.&lt;/remarks&gt; |  [optional]
**unlock** | **Boolean** | Whether a contextual order unlock is requested.  &lt;remarks&gt;Evaluate to true only if a contextual unlock is required, false otherwise.&lt;/remarks&gt; | 
**orderLines** | [**List&lt;ModifyOrderLineInput&gt;**](ModifyOrderLineInput.md) | Collection of optional line modifications. |  [optional]



