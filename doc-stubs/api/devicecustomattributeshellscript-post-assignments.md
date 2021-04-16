---
title: "Create deviceManagementScriptAssignment"
description: "Create a new deviceManagementScriptAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementScriptAssignment
Namespace: microsoft.graph



Create a new deviceManagementScriptAssignment object.

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
POST /deviceManagement/deviceCustomAttributeShellScripts/{deviceCustomAttributeShellScriptId}/assignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md) object.

The following table shows the properties that are required when you create the [deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The Id of the Azure Active Directory group we are targeting the script to.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementscriptassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceCustomAttributeShellScripts/{deviceCustomAttributeShellScriptId}/assignments
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
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementScriptAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementScriptAssignment",
  "id": "53c05c9d-5c9d-53c0-9d5c-c0539d5cc053",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

