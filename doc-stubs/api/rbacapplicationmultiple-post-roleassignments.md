---
title: "Create unifiedRoleAssignmentMultiple"
description: "Create a new unifiedRoleAssignmentMultiple object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unifiedRoleAssignmentMultiple
Namespace: microsoft.graph



Create a new unifiedRoleAssignmentMultiple object.

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
POST /roleManagement/cloudPC/roleAssignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) object.

The following table shows the properties that are required when you create the [unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appScopeIds|String collection|**TODO: Add Description**|
|condition|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|directoryScopeIds|String collection|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|principalIds|String collection|**TODO: Add Description**|
|roleDefinitionId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_unifiedroleassignmentmultiple_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/roleManagement/cloudPC/roleAssignments
Content-Type: application/json
Content-length: 313

{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignmentMultiple",
  "appScopeIds": [
    "String"
  ],
  "condition": "String",
  "description": "String",
  "directoryScopeIds": [
    "String"
  ],
  "displayName": "String",
  "principalIds": [
    "String"
  ],
  "roleDefinitionId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unifiedRoleAssignmentMultiple"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignmentMultiple",
  "id": "8df96ba2-6ba2-8df9-a26b-f98da26bf98d",
  "appScopeIds": [
    "String"
  ],
  "condition": "String",
  "description": "String",
  "directoryScopeIds": [
    "String"
  ],
  "displayName": "String",
  "principalIds": [
    "String"
  ],
  "roleDefinitionId": "String"
}
```

