---
title: "Update windowsProtectionState"
description: "Update the properties of a windowsProtectionState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsProtectionState
Namespace: microsoft.graph

Update the properties of a windowsProtectionState object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /users/{usersId}/managedDevices/{managedDeviceId}/windowsProtectionState
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsProtectionState](../resources/intune-windowsprotectionstate.md) object.

The following table shows the properties that are required when you create the [windowsProtectionState](../resources/intune-windowsprotectionstate.md).

|Property|Type|Description|
|:---|:---|:---|
|malwareProtectionEnabled|Boolean|**TODO: Add Description**|
|deviceState|windowsDeviceHealthState|**TODO: Add Description**. Possible values are: `clean`, `fullScanPending`, `rebootPending`, `manualStepsPending`, `offlineScanPending`, `critical`.|
|realTimeProtectionEnabled|Boolean|**TODO: Add Description**|
|networkInspectionSystemEnabled|Boolean|**TODO: Add Description**|
|quickScanOverdue|Boolean|**TODO: Add Description**|
|fullScanOverdue|Boolean|**TODO: Add Description**|
|signatureUpdateOverdue|Boolean|**TODO: Add Description**|
|rebootRequired|Boolean|**TODO: Add Description**|
|fullScanRequired|Boolean|**TODO: Add Description**|
|engineVersion|String|**TODO: Add Description**|
|signatureVersion|String|**TODO: Add Description**|
|antiMalwareVersion|String|**TODO: Add Description**|
|lastQuickScanDateTime|DateTimeOffset|**TODO: Add Description**|
|lastFullScanDateTime|DateTimeOffset|**TODO: Add Description**|
|lastQuickScanSignatureVersion|String|**TODO: Add Description**|
|lastFullScanSignatureVersion|String|**TODO: Add Description**|
|lastReportedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsProtectionState](../resources/intune-windowsprotectionstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsprotectionstate"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/users/{usersId}/managedDevices/{managedDeviceId}/windowsProtectionState
Content-Type: application/json
Content-length: 735

{
  "@odata.type": "#microsoft.graph.windowsProtectionState",
  "malwareProtectionEnabled": "Boolean",
  "deviceState": "String",
  "realTimeProtectionEnabled": "Boolean",
  "networkInspectionSystemEnabled": "Boolean",
  "quickScanOverdue": "Boolean",
  "fullScanOverdue": "Boolean",
  "signatureUpdateOverdue": "Boolean",
  "rebootRequired": "Boolean",
  "fullScanRequired": "Boolean",
  "engineVersion": "String",
  "signatureVersion": "String",
  "antiMalwareVersion": "String",
  "lastQuickScanDateTime": "String (timestamp)",
  "lastFullScanDateTime": "String (timestamp)",
  "lastQuickScanSignatureVersion": "String",
  "lastFullScanSignatureVersion": "String",
  "lastReportedDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.windowsProtectionState",
  "malwareProtectionEnabled": "Boolean",
  "deviceState": "String",
  "realTimeProtectionEnabled": "Boolean",
  "networkInspectionSystemEnabled": "Boolean",
  "quickScanOverdue": "Boolean",
  "fullScanOverdue": "Boolean",
  "signatureUpdateOverdue": "Boolean",
  "rebootRequired": "Boolean",
  "fullScanRequired": "Boolean",
  "engineVersion": "String",
  "signatureVersion": "String",
  "antiMalwareVersion": "String",
  "lastQuickScanDateTime": "String (timestamp)",
  "lastFullScanDateTime": "String (timestamp)",
  "lastQuickScanSignatureVersion": "String",
  "lastFullScanSignatureVersion": "String",
  "lastReportedDateTime": "String (timestamp)"
}
```

