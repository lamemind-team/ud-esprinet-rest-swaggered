
# CustomerDepotOrderInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerOrderId** | **String** | Customer-generated order id. |  [optional]
**orderLines** | [**List&lt;CustomerDepotOrderLineInputDto&gt;**](CustomerDepotOrderLineInputDto.md) | Collection of lines (details) of the order. | 
**deliverTo** | [**Address**](Address.md) | The address where the order items should be delivered to. | 
**invoiceTo** | [**Address**](Address.md) | The billing Address. |  [optional]
**cup** | **String** | The Cup field. |  [optional]
**cig** | **String** | The Cig field. |  [optional]
**invoiceComments** | **String** | The InvoiceComments field. |  [optional]
**deliveryNoteComments** | **String** | The DeliveryNoteComments field. |  [optional]
**shipmentPurpose** | **String** | The ShipmentPurpose field. | 
**extraEmailAddresses** | **List&lt;String&gt;** | Extra email addresses to send emails to inform the insertion of the new order |  [optional]



