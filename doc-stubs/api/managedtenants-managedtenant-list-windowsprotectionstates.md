---
title: "List windowsProtectionStates"
description: "Get the windowsProtectionState resources from the windowsProtectionStates navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List windowsProtectionStates
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the windowsProtectionState resources from the windowsProtectionStates navigation property.

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
GET /tenantRelationships/managedTenants/windowsProtectionStates
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

If successful, this method returns a `200 OK` response code and a collection of [windowsProtectionState](../resources/windowsprotectionstate.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_windowsprotectionstate"
}
-->
``` http
GET https://graph.microsoft.com/beta/tenantRelationships/managedTenants/windowsProtectionStates
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.managedTenants.windowsProtectionState)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
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
  ]
}
```

