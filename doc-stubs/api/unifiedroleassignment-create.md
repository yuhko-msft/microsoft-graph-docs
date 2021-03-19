---
title: "Create unifiedRoleAssignment"
description: "Create a new unifiedRoleAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unifiedRoleAssignment
Namespace: microsoft.graph



Create a new [unifiedRoleAssignment](../resources/unifiedroleassignment.md) object.

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
POST /rbacApplication/roleAssignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRoleAssignment](../resources/unifiedroleassignment.md) object.

The following table shows the properties that are required when you create the [unifiedRoleAssignment](../resources/unifiedroleassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appScopeId|String|**TODO: Add Description**|
|condition|String|**TODO: Add Description**|
|directoryScopeId|String|**TODO: Add Description**|
|principalId|String|**TODO: Add Description**|
|roleDefinitionId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [unifiedRoleAssignment](../resources/unifiedroleassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_unifiedroleassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/rbacApplication/roleAssignments
Content-Type: application/json
Content-length: 210

{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignment",
  "appScopeId": "String",
  "condition": "String",
  "directoryScopeId": "String",
  "principalId": "String",
  "roleDefinitionId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unifiedRoleAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignment",
  "id": "460ecff0-cff0-460e-f0cf-0e46f0cf0e46",
  "appScopeId": "String",
  "condition": "String",
  "directoryScopeId": "String",
  "principalId": "String",
  "roleDefinitionId": "String"
}
```

