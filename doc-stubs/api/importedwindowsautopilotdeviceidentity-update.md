---
title: "Update importedWindowsAutopilotDeviceIdentity"
description: "Update the properties of an importedWindowsAutopilotDeviceIdentity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update importedWindowsAutopilotDeviceIdentity
Namespace: microsoft.graph



Update the properties of an [importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) object.

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
PATCH /deviceManagement/importedWindowsAutopilotDeviceIdentities/{importedWindowsAutopilotDeviceIdentityId}
PATCH /importedWindowsAutopilotDeviceIdentityUpload/deviceIdentities/{importedWindowsAutopilotDeviceIdentityId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) object.

The following table shows the properties that are required when you update the [importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignedUserPrincipalName|String|UPN of the user the device will be assigned|
|groupTag|String|Group Tag of the Windows autopilot device.|
|hardwareIdentifier|Binary|Hardware Blob of the Windows autopilot device.|
|importId|String|The Import Id of the Windows autopilot device.|
|productKey|String|Product Key of the Windows autopilot device.|
|serialNumber|String|Serial number of the Windows autopilot device.|
|state|[importedWindowsAutopilotDeviceIdentityState](../resources/importedwindowsautopilotdeviceidentitystate.md)|Current state of the imported device.|



## Response

If successful, this method returns a `200 OK` response code and an updated [importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_importedwindowsautopilotdeviceidentity"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/importedWindowsAutopilotDeviceIdentities/{importedWindowsAutopilotDeviceIdentityId}
Content-Type: application/json
Content-length: 365

{
  "@odata.type": "#microsoft.graph.importedWindowsAutopilotDeviceIdentity",
  "assignedUserPrincipalName": "String",
  "groupTag": "String",
  "hardwareIdentifier": "Binary",
  "importId": "String",
  "productKey": "String",
  "serialNumber": "String",
  "state": {
    "@odata.type": "microsoft.graph.importedWindowsAutopilotDeviceIdentityState"
  }
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
  "@odata.type": "#microsoft.graph.importedWindowsAutopilotDeviceIdentity",
  "id": "ab4c360f-360f-ab4c-0f36-4cab0f364cab",
  "assignedUserPrincipalName": "String",
  "groupTag": "String",
  "hardwareIdentifier": "Binary",
  "importId": "String",
  "productKey": "String",
  "serialNumber": "String",
  "state": {
    "@odata.type": "microsoft.graph.importedWindowsAutopilotDeviceIdentityState"
  }
}
```

