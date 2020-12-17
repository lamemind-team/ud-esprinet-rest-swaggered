
# ShippingInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shipperCode** | **String** | Identifies the shipping entity. |  [optional]
**shipperDescription** | **String** | A description for the shipping entity. |  [optional]
**shippingStatusCode** | **String** | Identifies the shipping status for a specific order line. |  [optional]
**shippingStatusDescription** | **String** | A description of the shipping status for a specific order line. |  [optional]
**shippingStatusDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date which the above ShippingStatus refers to. |  [optional]
**trackingNumber** | **String** | A specific number that allows to track, on the shipper&#39;s systems, the location of the shipping package. |  [optional]
**wayBill** | **String** | The shipping way billing info. |  [optional]
**carrierTrackingLink** | **String** | a list of direct links on the carrier&#39;s tracking system. |  [optional]



