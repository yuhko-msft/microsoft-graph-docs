---
title: "Get windowsProtectionState"
description: "Read the properties and relationships of a windowsProtectionState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windowsProtectionState
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [windowsProtectionState](../resources/managedtenants-windowsprotectionstate.md) object.

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
GET /tenantRelationships/managedTenants/windowsProtectionStates/{windowsProtectionStateId}
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

If successful, this method returns a `200 OK` response code and a [windowsProtectionState](../resources/managedtenants-windowsprotectionstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windowsprotectionstate"
}
-->
``` http
GET https://graph.microsoft.com/beta/tenantRelationships/managedTenants/windowsProtectionStates/{windowsProtectionStateId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedTenants.windowsProtectionState"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.managedTenants.windowsProtectionState",
    "id": "900997e8-97e8-9009-e897-0990e8970990",
    "antiMalwareVersion": "String",
    "attentionRequired": "Boolean",
    "deviceDeleted": "Boolean",
    "devicePropertyRefreshDateTime": "String (timestamp)",
    "engineVersion": "String",
    "fullScanOverdue": "Boolean",
    "fullScanRequired": "Boolean",
    "lastFullScanDateTime": "String (timestamp)",
    "lastFullScanSignatureVersion": "String",
    "lastQuickScanDateTime": "String (timestamp)",
    "lastQuickScanSignatureVersion": "String",
    "lastRefreshedDateTime": "String (timestamp)",
    "lastReportedDateTime": "String (timestamp)",
    "malwareProtectionEnabled": "Boolean",
    "managedDeviceHealthState": "String",
    "managedDeviceId": "String",
    "managedDeviceName": "String",
    "networkInspectionSystemEnabled": "Boolean",
    "quickScanOverdue": "Boolean",
    "realTimeProtectionEnabled": "Boolean",
    "rebootRequired": "Boolean",
    "signatureUpdateOverdue": "Boolean",
    "signatureVersion": "String",
    "tenantDisplayName": "String",
    "tenantId": "String"
  }
}
```

