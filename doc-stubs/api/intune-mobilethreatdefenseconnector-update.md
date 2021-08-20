---
title: "Update mobileThreatDefenseConnector"
description: "Update the properties of a mobileThreatDefenseConnector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mobileThreatDefenseConnector
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /deviceManagement/mobileThreatDefenseConnectors/{mobileThreatDefenseConnectorId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md) object.

The following table shows the properties that are required when you update the [mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastHeartbeatDateTime|DateTimeOffset|**TODO: Add Description**|
|partnerState|mobileThreatPartnerTenantState|**TODO: Add Description**. Possible values are: `unavailable`, `available`, `enabled`, `unresponsive`.|
|androidMobileApplicationManagementEnabled|Boolean|**TODO: Add Description**|
|iosMobileApplicationManagementEnabled|Boolean|**TODO: Add Description**|
|androidEnabled|Boolean|**TODO: Add Description**|
|iosEnabled|Boolean|**TODO: Add Description**|
|windowsEnabled|Boolean|**TODO: Add Description**|
|macEnabled|Boolean|**TODO: Add Description**|
|androidDeviceBlockedOnMissingPartnerData|Boolean|**TODO: Add Description**|
|iosDeviceBlockedOnMissingPartnerData|Boolean|**TODO: Add Description**|
|windowsDeviceBlockedOnMissingPartnerData|Boolean|**TODO: Add Description**|
|macDeviceBlockedOnMissingPartnerData|Boolean|**TODO: Add Description**|
|partnerUnsupportedOsVersionBlocked|Boolean|**TODO: Add Description**|
|partnerUnresponsivenessThresholdInDays|Int32|**TODO: Add Description**|
|allowPartnerToCollectIOSApplicationMetadata|Boolean|**TODO: Add Description**|
|microsoftDefenderForEndpointAttachEnabled|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileThreatDefenseConnector](../resources/intune-mobilethreatdefenseconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mobilethreatdefenseconnector"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/mobileThreatDefenseConnectors/{mobileThreatDefenseConnectorId}
Content-Type: application/json
Content-length: 835

{
  "@odata.type": "#microsoft.graph.mobileThreatDefenseConnector",
  "lastHeartbeatDateTime": "String (timestamp)",
  "partnerState": "String",
  "androidMobileApplicationManagementEnabled": "Boolean",
  "iosMobileApplicationManagementEnabled": "Boolean",
  "androidEnabled": "Boolean",
  "iosEnabled": "Boolean",
  "windowsEnabled": "Boolean",
  "macEnabled": "Boolean",
  "androidDeviceBlockedOnMissingPartnerData": "Boolean",
  "iosDeviceBlockedOnMissingPartnerData": "Boolean",
  "windowsDeviceBlockedOnMissingPartnerData": "Boolean",
  "macDeviceBlockedOnMissingPartnerData": "Boolean",
  "partnerUnsupportedOsVersionBlocked": "Boolean",
  "partnerUnresponsivenessThresholdInDays": "Integer",
  "allowPartnerToCollectIOSApplicationMetadata": "Boolean",
  "microsoftDefenderForEndpointAttachEnabled": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.mobileThreatDefenseConnector",
  "id": "327e5bc3-5bc3-327e-c35b-7e32c35b7e32",
  "lastHeartbeatDateTime": "String (timestamp)",
  "partnerState": "String",
  "androidMobileApplicationManagementEnabled": "Boolean",
  "iosMobileApplicationManagementEnabled": "Boolean",
  "androidEnabled": "Boolean",
  "iosEnabled": "Boolean",
  "windowsEnabled": "Boolean",
  "macEnabled": "Boolean",
  "androidDeviceBlockedOnMissingPartnerData": "Boolean",
  "iosDeviceBlockedOnMissingPartnerData": "Boolean",
  "windowsDeviceBlockedOnMissingPartnerData": "Boolean",
  "macDeviceBlockedOnMissingPartnerData": "Boolean",
  "partnerUnsupportedOsVersionBlocked": "Boolean",
  "partnerUnresponsivenessThresholdInDays": "Integer",
  "allowPartnerToCollectIOSApplicationMetadata": "Boolean",
  "microsoftDefenderForEndpointAttachEnabled": "Boolean"
}
```

