---
title: "Create deviceManagementScriptDeviceState"
description: "Create a new deviceManagementScriptDeviceState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementScriptDeviceState
Namespace: microsoft.graph



Create a new deviceManagementScriptDeviceState object.

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
POST /deviceManagement/deviceManagementScripts/{deviceManagementScriptId}/deviceRunStates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) object.

The following table shows the properties that are required when you create the [deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|errorCode|Int32|Error code corresponding to erroneous execution of the device management script.|
|errorDescription|String|Error description corresponding to erroneous execution of the device management script.|
|lastStateUpdateDateTime|DateTimeOffset|Latest time the device management script executes.|
|resultMessage|String|Details of execution output.|
|runState|runState|State of latest run of the device management script. Possible values are: `unknown`, `success`, `fail`, `scriptError`, `pending`, `notApplicable`.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementscriptdevicestate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceManagementScripts/{deviceManagementScriptId}/deviceRunStates
Content-Type: application/json
Content-length: 242

{
  "@odata.type": "#microsoft.graph.deviceManagementScriptDeviceState",
  "errorCode": "Integer",
  "errorDescription": "String",
  "lastStateUpdateDateTime": "String (timestamp)",
  "resultMessage": "String",
  "runState": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementScriptDeviceState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementScriptDeviceState",
  "id": "4d93c2d5-c2d5-4d93-d5c2-934dd5c2934d",
  "errorCode": "Integer",
  "errorDescription": "String",
  "lastStateUpdateDateTime": "String (timestamp)",
  "resultMessage": "String",
  "runState": "String"
}
```

