---
title: "Update deviceManagementScriptUserState"
description: "Update the properties of a deviceManagementScriptUserState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementScriptUserState
Namespace: microsoft.graph



Update the properties of a [deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) object.

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
PATCH /deviceManagement/deviceShellScripts/{deviceShellScriptId}/userRunStates/{deviceManagementScriptUserStateId}
PATCH /deviceManagement/deviceManagementScripts/{deviceManagementScriptId}/userRunStates/{deviceManagementScriptUserStateId}
PATCH /deviceManagement/deviceCustomAttributeShellScripts/{deviceCustomAttributeShellScriptId}/userRunStates/{deviceManagementScriptUserStateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) object.

The following table shows the properties that are required when you update the [deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|errorDeviceCount|Int32|Error device count for specific user.|
|successDeviceCount|Int32|Success device count for specific user.|
|userPrincipalName|String|User principle name of specific user.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementscriptuserstate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceShellScripts/{deviceShellScriptId}/userRunStates/{deviceManagementScriptUserStateId}
Content-Type: application/json
Content-length: 177

{
  "@odata.type": "#microsoft.graph.deviceManagementScriptUserState",
  "errorDeviceCount": "Integer",
  "successDeviceCount": "Integer",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.deviceManagementScriptUserState",
  "id": "5508bb16-bb16-5508-16bb-085516bb0855",
  "errorDeviceCount": "Integer",
  "successDeviceCount": "Integer",
  "userPrincipalName": "String"
}
```

