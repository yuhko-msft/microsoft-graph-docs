---
title: "Create unifiedRoleAssignment"
description: "Create a new unifiedRoleAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unifiedRoleAssignment
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new unifiedRoleAssignment object.

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

You can specify the following properties when creating an **unifiedRoleAssignment**.

|Property|Type|Description|
|:---|:---|:---|
|roleDefinitionId|String|**TODO: Add Description** Optional.|
|condition|String|**TODO: Add Description** Optional.|
|principalId|String|**TODO: Add Description** Optional.|
|directoryScopeId|String|**TODO: Add Description** Optional.|
|appScopeId|String|**TODO: Add Description** Optional.|
|resourceScope|String|**TODO: Add Description** Optional.|
|principalOrganizationId|String|**TODO: Add Description** Optional.|



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
POST https://graph.microsoft.com/beta/rbacApplication/roleAssignments
Content-Type: application/json
Content-length: 289

{
  "@odata.type": "#Microsoft.EnterpriseRbac.unifiedRoleAssignment",
  "roleDefinitionId": "String",
  "condition": "String",
  "principalId": "String",
  "directoryScopeId": "String",
  "appScopeId": "String",
  "resourceScope": "String",
  "principalOrganizationId": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.EnterpriseRbac.unifiedRoleAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.EnterpriseRbac.unifiedRoleAssignment",
  "id": "9541afff-afff-9541-ffaf-4195ffaf4195",
  "roleDefinitionId": "String",
  "condition": "String",
  "principalId": "String",
  "directoryScopeId": "String",
  "appScopeId": "String",
  "resourceScope": "String",
  "principalOrganizationId": "String"
}
```

