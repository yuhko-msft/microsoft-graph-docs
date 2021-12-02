---
title: "Create unifiedRoleAssignmentMultiple"
description: "Create a new unifiedRoleAssignmentMultiple object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unifiedRoleAssignmentMultiple
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) object.

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
POST /rbacApplicationMultiple/roleAssignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) object.

You can specify the following properties when creating an **unifiedRoleAssignmentMultiple**.

|Property|Type|Description|
|:---|:---|:---|
|roleDefinitionId|String|**TODO: Add Description** Required.|
|condition|String|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|principalIds|String collection|**TODO: Add Description** Optional.|
|directoryScopeIds|String collection|**TODO: Add Description** Optional.|
|appScopeIds|String collection|**TODO: Add Description** Optional.|



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
POST https://graph.microsoft.com/beta/rbacApplicationMultiple/roleAssignments
Content-Type: application/json
Content-length: 322

{
  "@odata.type": "#Microsoft.EnterpriseRbac.unifiedRoleAssignmentMultiple",
  "roleDefinitionId": "String",
  "condition": "String",
  "displayName": "String",
  "description": "String",
  "principalIds": [
    "String"
  ],
  "directoryScopeIds": [
    "String"
  ],
  "appScopeIds": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.EnterpriseRbac.unifiedRoleAssignmentMultiple"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.EnterpriseRbac.unifiedRoleAssignmentMultiple",
  "id": "63701c34-1c34-6370-341c-7063341c7063",
  "roleDefinitionId": "String",
  "condition": "String",
  "displayName": "String",
  "description": "String",
  "principalIds": [
    "String"
  ],
  "directoryScopeIds": [
    "String"
  ],
  "appScopeIds": [
    "String"
  ]
}
```

