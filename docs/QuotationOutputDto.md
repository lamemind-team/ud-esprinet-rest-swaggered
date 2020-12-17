
# QuotationOutputDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**validUntil** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**customerQuotationReference** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  | 
**orderId** | **String** |  |  [optional]
**products** | [**List&lt;QuotationProductDto&gt;**](QuotationProductDto.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
APPROVED | &quot;Approved&quot;
ORDERED | &quot;Ordered&quot;
EXPIRED | &quot;Expired&quot;
REJECTED | &quot;Rejected&quot;
CANCELLED | &quot;Cancelled&quot;



