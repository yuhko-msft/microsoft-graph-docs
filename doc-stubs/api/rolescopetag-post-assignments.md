---
title: "Create roleScopeTagAutoAssignment"
description: "Create a new roleScopeTagAutoAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create roleScopeTagAutoAssignment
Namespace: microsoft.graph



Create a new roleScopeTagAutoAssignment object.

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
POST /deviceManagement/roleAssignments/{deviceAndAppManagementRoleAssignmentId}/roleScopeTags/{roleScopeTagId}/assignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md) object.

The following table shows the properties that are required when you create the [roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The auto-assignment target for the specific Role Scope Tag.|



## Response

If successful, this method returns a `201 Created` response code and a [roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_rolescopetagautoassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/roleAssignments/{deviceAndAppManagementRoleAssignmentId}/roleScopeTags/{roleScopeTagId}/assignments
Content-Type: application/json
Content-length: 166

{
  "@odata.type": "#microsoft.graph.roleScopeTagAutoAssignment",
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
  "@odata.type": "microsoft.graph.roleScopeTagAutoAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.roleScopeTagAutoAssignment",
  "id": "6c329d95-9d95-6c32-959d-326c959d326c",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

