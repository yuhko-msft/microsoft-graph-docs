---
title: "List deviceHealthScriptDeviceStates"
description: "Get a list of the deviceHealthScriptDeviceState objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List deviceHealthScriptDeviceStates
Namespace: microsoft.graph



Get a list of the [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) objects and their properties.

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
GET /deviceManagement/deviceHealthScripts/{deviceHealthScriptId}/deviceRunStates
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

If successful, this method returns a `200 OK` response code and a collection of [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_devicehealthscriptdevicestate"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/deviceHealthScripts/{deviceHealthScriptId}/deviceRunStates
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceHealthScriptDeviceState)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

