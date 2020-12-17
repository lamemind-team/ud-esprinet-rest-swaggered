
# OrderTransactionOutput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The Transaction Date | 
**esprinetOrderId** | **String** | The esprinet order id reference |  [optional]
**commitStatus** | [**CommitStatusEnum**](#CommitStatusEnum) | Inidicate if the transaction has been completed | 
**transactionId** | **Integer** | Contains the generated transaction Id. | 
**operationResult** | [**OperationResult**](OperationResult.md) | Contains information about the result of this service call. | 


<a name="CommitStatusEnum"></a>
## Enum: CommitStatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
APPLIEDWITHREJECTIONS | &quot;AppliedWithRejections&quot;
REJECTED | &quot;Rejected&quot;
OK | &quot;Ok&quot;



