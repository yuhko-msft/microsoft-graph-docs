---
title: "Update deviceHealthScriptDeviceState"
description: "Update the properties of a deviceHealthScriptDeviceState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceHealthScriptDeviceState
Namespace: microsoft.graph



Update the properties of a [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) object.

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
PATCH /deviceManagement/deviceHealthScripts/{deviceHealthScriptId}/deviceRunStates/{deviceHealthScriptDeviceStateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) object.

The following table shows the properties that are required when you update the [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|detectionState|runState|Detection state from the lastest device health script execution. Possible values are: `unknown`, `success`, `fail`, `scriptError`, `pending`, `notApplicable`.|
|expectedStateUpdateDateTime|DateTimeOffset|The next timestamp of when the device health script is expected to execute|
|lastStateUpdateDateTime|DateTimeOffset|The last timestamp of when the device health script executed|
|lastSyncDateTime|DateTimeOffset|The last time that Intune Managment Extension synced with Intune|
|postRemediationDetectionScriptError|String|Error from the detection script after remediation|
|postRemediationDetectionScriptOutput|String|Detection script output after remediation|
|preRemediationDetectionScriptError|String|Error from the detection script before remediation|
|preRemediationDetectionScriptOutput|String|Output of the detection script before remediation|
|remediationScriptError|String|Error output of the remediation script|
|remediationState|remediationState|Remediation state from the lastest device health script execution. Possible values are: `unknown`, `skipped`, `success`, `remediationFailed`, `scriptError`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicehealthscriptdevicestate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceHealthScripts/{deviceHealthScriptId}/deviceRunStates/{deviceHealthScriptDeviceStateId}
Content-Type: application/json
Content-length: 535

{
  "@odata.type": "#microsoft.graph.deviceHealthScriptDeviceState",
  "detectionState": "String",
  "expectedStateUpdateDateTime": "String (timestamp)",
  "lastStateUpdateDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "postRemediationDetectionScriptError": "String",
  "postRemediationDetectionScriptOutput": "String",
  "preRemediationDetectionScriptError": "String",
  "preRemediationDetectionScriptOutput": "String",
  "remediationScriptError": "String",
  "remediationState": "String"
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
  "@odata.type": "#microsoft.graph.deviceHealthScriptDeviceState",
  "id": "be76455e-455e-be76-5e45-76be5e4576be",
  "detectionState": "String",
  "expectedStateUpdateDateTime": "String (timestamp)",
  "lastStateUpdateDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "postRemediationDetectionScriptError": "String",
  "postRemediationDetectionScriptOutput": "String",
  "preRemediationDetectionScriptError": "String",
  "preRemediationDetectionScriptOutput": "String",
  "remediationScriptError": "String",
  "remediationState": "String"
}
```

