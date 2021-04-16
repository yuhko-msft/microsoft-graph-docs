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



Update the properties of a [mobileThreatDefenseConnector](../resources/mobilethreatdefenseconnector.md) object.

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
In the request body, supply a JSON representation of the [mobileThreatDefenseConnector](../resources/mobilethreatdefenseconnector.md) object.

The following table shows the properties that are required when you update the [mobileThreatDefenseConnector](../resources/mobilethreatdefenseconnector.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|allowPartnerToCollectIOSApplicationMetadata|Boolean|For IOS devices, allows the admin to configure whether the data sync partner may also collect metadata about installed applications from Intune|
|androidDeviceBlockedOnMissingPartnerData|Boolean|For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant|
|androidEnabled|Boolean|For Android, set whether data from the data sync partner should be used during compliance evaluations|
|androidMobileApplicationManagementEnabled|Boolean|For Android, set whether data from the data sync partner should be used during Mobile Application Management (MAM) evaluations. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation.|
|iosDeviceBlockedOnMissingPartnerData|Boolean|For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant|
|iosEnabled|Boolean|For IOS, get or set whether data from the data sync partner should be used during compliance evaluations|
|iosMobileApplicationManagementEnabled|Boolean|For IOS, get or set whether data from the data sync partner should be used during Mobile Application Management (MAM) evaluations. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation.|
|lastHeartbeatDateTime|DateTimeOffset|DateTime of last Heartbeat recieved from the Data Sync Partner|
|macDeviceBlockedOnMissingPartnerData|Boolean|For Mac, get or set whether Intune must receive data from the data sync partner prior to marking a device compliant|
|macEnabled|Boolean|For Mac, get or set whether data from the data sync partner should be used during compliance evaluations|
|partnerState|mobileThreatPartnerTenantState|Data Sync Partner state for this account. Possible values are: `unavailable`, `available`, `enabled`, `unresponsive`.|
|partnerUnresponsivenessThresholdInDays|Int32|Get or Set days the per tenant tolerance to unresponsiveness for this partner integration|
|partnerUnsupportedOsVersionBlocked|Boolean|Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Data Sync Partner|
|windowsDeviceBlockedOnMissingPartnerData|Boolean|For Windows, set whether Intune must receive data from the data sync partner prior to marking a device compliant|
|windowsEnabled|Boolean|For Windows, get or set whether data from the data sync partner should be used during compliance evaluations|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileThreatDefenseConnector](../resources/mobilethreatdefenseconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mobilethreatdefenseconnector"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/mobileThreatDefenseConnectors/{mobileThreatDefenseConnectorId}
Content-Type: application/json
Content-length: 776

{
  "@odata.type": "#microsoft.graph.mobileThreatDefenseConnector",
  "allowPartnerToCollectIOSApplicationMetadata": "Boolean",
  "androidDeviceBlockedOnMissingPartnerData": "Boolean",
  "androidEnabled": "Boolean",
  "androidMobileApplicationManagementEnabled": "Boolean",
  "iosDeviceBlockedOnMissingPartnerData": "Boolean",
  "iosEnabled": "Boolean",
  "iosMobileApplicationManagementEnabled": "Boolean",
  "lastHeartbeatDateTime": "String (timestamp)",
  "macDeviceBlockedOnMissingPartnerData": "Boolean",
  "macEnabled": "Boolean",
  "partnerState": "String",
  "partnerUnresponsivenessThresholdInDays": "Integer",
  "partnerUnsupportedOsVersionBlocked": "Boolean",
  "windowsDeviceBlockedOnMissingPartnerData": "Boolean",
  "windowsEnabled": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
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
  "id": "1a9c1e17-1e17-1a9c-171e-9c1a171e9c1a",
  "allowPartnerToCollectIOSApplicationMetadata": "Boolean",
  "androidDeviceBlockedOnMissingPartnerData": "Boolean",
  "androidEnabled": "Boolean",
  "androidMobileApplicationManagementEnabled": "Boolean",
  "iosDeviceBlockedOnMissingPartnerData": "Boolean",
  "iosEnabled": "Boolean",
  "iosMobileApplicationManagementEnabled": "Boolean",
  "lastHeartbeatDateTime": "String (timestamp)",
  "macDeviceBlockedOnMissingPartnerData": "Boolean",
  "macEnabled": "Boolean",
  "partnerState": "String",
  "partnerUnresponsivenessThresholdInDays": "Integer",
  "partnerUnsupportedOsVersionBlocked": "Boolean",
  "windowsDeviceBlockedOnMissingPartnerData": "Boolean",
  "windowsEnabled": "Boolean"
}
```

