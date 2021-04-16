---
title: "Update deviceManagementScriptAssignment"
description: "Update the properties of a deviceManagementScriptAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementScriptAssignment
Namespace: microsoft.graph



Update the properties of a [deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md) object.

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
PATCH /deviceManagement/deviceShellScripts/{deviceShellScriptId}/assignments/{deviceManagementScriptAssignmentId}
PATCH /deviceManagement/deviceManagementScripts/{deviceManagementScriptId}/assignments/{deviceManagementScriptAssignmentId}
PATCH /deviceManagement/deviceCustomAttributeShellScripts/{deviceCustomAttributeShellScriptId}/assignments/{deviceManagementScriptAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md) object.

The following table shows the properties that are required when you update the [deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The Id of the Azure Active Directory group we are targeting the script to.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementscriptassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceShellScripts/{deviceShellScriptId}/assignments/{deviceManagementScriptAssignmentId}
Content-Type: application/json
Content-length: 172

{
  "@odata.type": "#microsoft.graph.deviceManagementScriptAssignment",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
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
  "@odata.type": "#microsoft.graph.deviceManagementScriptAssignment",
  "id": "53c05c9d-5c9d-53c0-9d5c-c0539d5cc053",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

