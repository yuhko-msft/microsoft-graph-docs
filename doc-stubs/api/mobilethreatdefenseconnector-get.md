---
title: "Get mobileThreatDefenseConnector"
description: "Read the properties and relationships of a mobileThreatDefenseConnector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get mobileThreatDefenseConnector
Namespace: microsoft.graph



Read the properties and relationships of a [mobileThreatDefenseConnector](../resources/mobilethreatdefenseconnector.md) object.

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
GET /deviceManagement/mobileThreatDefenseConnectors/{mobileThreatDefenseConnectorId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [mobileThreatDefenseConnector](../resources/mobilethreatdefenseconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_mobilethreatdefenseconnector"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/mobileThreatDefenseConnectors/{mobileThreatDefenseConnectorId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mobileThreatDefenseConnector"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

