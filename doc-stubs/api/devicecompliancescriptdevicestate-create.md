---
title: "Create deviceComplianceScriptDeviceState"
description: "Create a new deviceComplianceScriptDeviceState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceComplianceScriptDeviceState
Namespace: microsoft.graph



Create a new [deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) object.

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
POST /deviceManagement/deviceComplianceScripts/{deviceComplianceScriptId}/deviceRunStates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) object.

The following table shows the properties that are required when you create the [deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|detectionState|runState|Detection state from the lastest device compliance script execution. Possible values are: `unknown`, `success`, `fail`, `scriptError`, `pending`, `notApplicable`.|
|expectedStateUpdateDateTime|DateTimeOffset|The next timestamp of when the device compliance script is expected to execute|
|lastStateUpdateDateTime|DateTimeOffset|The last timestamp of when the device compliance script executed|
|lastSyncDateTime|DateTimeOffset|The last time that Intune Managment Extension synced with Intune|
|scriptError|String|Error from the detection script|
|scriptOutput|String|Output of the detection script|



## Response

If successful, this method returns a `201 Created` response code and a [deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicecompliancescriptdevicestate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceComplianceScripts/{deviceComplianceScriptId}/deviceRunStates
Content-Type: application/json
Content-length: 316

{
  "@odata.type": "#microsoft.graph.deviceComplianceScriptDeviceState",
  "detectionState": "String",
  "expectedStateUpdateDateTime": "String (timestamp)",
  "lastStateUpdateDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "scriptError": "String",
  "scriptOutput": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceComplianceScriptDeviceState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceComplianceScriptDeviceState",
  "id": "60d0a748-a748-60d0-48a7-d06048a7d060",
  "detectionState": "String",
  "expectedStateUpdateDateTime": "String (timestamp)",
  "lastStateUpdateDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "scriptError": "String",
  "scriptOutput": "String"
}
```

