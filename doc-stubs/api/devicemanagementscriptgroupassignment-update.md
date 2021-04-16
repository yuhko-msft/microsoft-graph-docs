---
title: "Update deviceManagementScriptGroupAssignment"
description: "Update the properties of a deviceManagementScriptGroupAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementScriptGroupAssignment
Namespace: microsoft.graph



Update the properties of a [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) object.

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
PATCH /deviceManagement/deviceShellScripts/{deviceShellScriptId}/groupAssignments/{deviceManagementScriptGroupAssignmentId}
PATCH /deviceManagement/deviceManagementScripts/{deviceManagementScriptId}/groupAssignments/{deviceManagementScriptGroupAssignmentId}
PATCH /deviceManagement/deviceCustomAttributeShellScripts/{deviceCustomAttributeShellScriptId}/groupAssignments/{deviceManagementScriptGroupAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) object.

The following table shows the properties that are required when you update the [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetGroupId|String|The Id of the Azure Active Directory group we are targeting the script to.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementscriptgroupassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceShellScripts/{deviceShellScriptId}/groupAssignments/{deviceManagementScriptGroupAssignmentId}
Content-Type: application/json
Content-length: 109

{
  "@odata.type": "#microsoft.graph.deviceManagementScriptGroupAssignment",
  "targetGroupId": "String"
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
  "@odata.type": "#microsoft.graph.deviceManagementScriptGroupAssignment",
  "id": "9fb26ad4-6ad4-9fb2-d46a-b29fd46ab29f",
  "targetGroupId": "String"
}
```

