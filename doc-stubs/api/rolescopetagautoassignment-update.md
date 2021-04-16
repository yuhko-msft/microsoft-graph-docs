---
title: "Update roleScopeTagAutoAssignment"
description: "Update the properties of a roleScopeTagAutoAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update roleScopeTagAutoAssignment
Namespace: microsoft.graph



Update the properties of a [roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md) object.

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
PATCH /deviceManagement/roleAssignments/{deviceAndAppManagementRoleAssignmentId}/roleScopeTags/{roleScopeTagId}/assignments/{roleScopeTagAutoAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md) object.

The following table shows the properties that are required when you update the [roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The auto-assignment target for the specific Role Scope Tag.|



## Response

If successful, this method returns a `200 OK` response code and an updated [roleScopeTagAutoAssignment](../resources/rolescopetagautoassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_rolescopetagautoassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/roleAssignments/{deviceAndAppManagementRoleAssignmentId}/roleScopeTags/{roleScopeTagId}/assignments/{roleScopeTagAutoAssignmentId}
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.roleScopeTagAutoAssignment",
  "id": "6c329d95-9d95-6c32-959d-326c959d326c",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

