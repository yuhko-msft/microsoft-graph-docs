---
title: "Add deviceManagementScriptRunSummary"
description: "Add runSummary by posting to the runSummary collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add deviceManagementScriptRunSummary
Namespace: microsoft.graph



Add runSummary by posting to the runSummary collection.

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
POST /deviceManagement/deviceShellScripts/{deviceShellScriptId}/runSummary/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) object.

The following table shows the properties that are required when you create the [deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|errorDeviceCount|Int32|Error device count.|
|errorUserCount|Int32|Error user count.|
|successDeviceCount|Int32|Success device count.|
|successUserCount|Int32|Success user count.|



## Response

If successful, this method returns a `204 No Content` response code and a [deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementscriptrunsummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceShellScripts/{deviceShellScriptId}/runSummary/$ref
Content-Type: application/json
Content-length: 210

{
  "@odata.type": "#microsoft.graph.deviceManagementScriptRunSummary",
  "errorDeviceCount": "Integer",
  "errorUserCount": "Integer",
  "successDeviceCount": "Integer",
  "successUserCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementScriptRunSummary"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementScriptRunSummary",
  "id": "1c5024d9-24d9-1c50-d924-501cd924501c",
  "errorDeviceCount": "Integer",
  "errorUserCount": "Integer",
  "successDeviceCount": "Integer",
  "successUserCount": "Integer"
}
```

