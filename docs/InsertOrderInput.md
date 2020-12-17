
# InsertOrderInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerOrderId** | **String** | Customer-generated order id. |  [optional]
**customerComments** | **String** | Customer notes related to the order. |  [optional]
**orderLines** | [**List&lt;InsertOrderLineInput&gt;**](InsertOrderLineInput.md) | Collection of lines (details) of the order. | 
**deliverTo** | [**Address**](Address.md) | The address where the order items should be delivered to. | 
**proofOfDeliveryRequired** | **Boolean** | This field controls whether it is required (when true) that the customer signs a receipt proving the delivery has taken place or not (when false). Requiring a proof of delivery for an order is a feature that may be subject to an additional fare. | 
**customerDeliveryNote** | **Boolean** | This field controls whether the shipping to the address specified within the order is done as appearing to come from Esprinet (when false) or from the customer who has placed the order (when true). This usually involves putting the customer logos and details in the delivery note which accompanies every shipping. This feature can be used by a retailer who is placing an order for one of its customers and does want the shipping to appear to come from him. | 
**lockedOnCreation** | **Boolean** | This field controls whether the order is created as \&quot;locked\&quot; or not. When an order is created as \&quot;locked\&quot; the products it contains are \&quot;reserved\&quot; by the Esprinet systems (for only a short amount of time) but any further processing is \&quot;freezed\&quot; until the order is \&quot;unlocked\&quot; through a proper invocation of the ModifyOrder method. Restrictions on availability of this feature may apply, depending on contract agreement with Esprinet. | 
**extraEmailAddresses** | **List&lt;String&gt;** | Extra email addresses to send emails to inform the insertion of the new order |  [optional]
**freightForwarding** | **Boolean** | the Freight Forwarding field. | 



