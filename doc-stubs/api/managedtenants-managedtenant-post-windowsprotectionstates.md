---
title: "Create windowsProtectionState"
description: "Create a new windowsProtectionState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsProtectionState
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new windowsProtectionState object.

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
POST /tenantRelationships/managedTenants/windowsProtectionStates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsProtectionState](../resources/managedtenants-windowsprotectionstate.md) object.

The following table shows the properties that are required when you create the [windowsProtectionState](../resources/managedtenants-windowsprotectionstate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/managedtenants-entity.md)|
|antiMalwareVersion|String|**TODO: Add Description**|
|attentionRequired|Boolean|**TODO: Add Description**|
|deviceDeleted|Boolean|**TODO: Add Description**|
|devicePropertyRefreshDateTime|DateTimeOffset|**TODO: Add Description**|
|engineVersion|String|**TODO: Add Description**|
|fullScanOverdue|Boolean|**TODO: Add Description**|
|fullScanRequired|Boolean|**TODO: Add Description**|
|lastFullScanDateTime|DateTimeOffset|**TODO: Add Description**|
|lastFullScanSignatureVersion|String|**TODO: Add Description**|
|lastQuickScanDateTime|DateTimeOffset|**TODO: Add Description**|
|lastQuickScanSignatureVersion|String|**TODO: Add Description**|
|lastRefreshedDateTime|DateTimeOffset|**TODO: Add Description**|
|lastReportedDateTime|DateTimeOffset|**TODO: Add Description**|
|malwareProtectionEnabled|Boolean|**TODO: Add Description**|
|managedDeviceHealthState|String|**TODO: Add Description**|
|managedDeviceId|String|**TODO: Add Description**|
|managedDeviceName|String|**TODO: Add Description**|
|networkInspectionSystemEnabled|Boolean|**TODO: Add Description**|
|quickScanOverdue|Boolean|**TODO: Add Description**|
|realTimeProtectionEnabled|Boolean|**TODO: Add Description**|
|rebootRequired|Boolean|**TODO: Add Description**|
|signatureUpdateOverdue|Boolean|**TODO: Add Description**|
|signatureVersion|String|**TODO: Add Description**|
|tenantDisplayName|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [windowsProtectionState](../resources/managedtenants-windowsprotectionstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsprotectionstate_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/tenantRelationships/managedTenants/windowsProtectionStates
Content-Type: application/json
Content-length: 1062

{
  "@odata.type": "#microsoft.graph.managedTenants.windowsProtectionState",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedTenants.windowsProtectionState",
  "id": "4e419184-9184-4e41-8491-414e8491414e",
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
```

