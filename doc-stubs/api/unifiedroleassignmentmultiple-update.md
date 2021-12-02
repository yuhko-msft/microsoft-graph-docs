---
title: "Update unifiedRoleAssignmentMultiple"
description: "Update the properties of an unifiedRoleAssignmentMultiple object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update unifiedRoleAssignmentMultiple
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) object.

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
PATCH /rbacApplicationMultiple/roleAssignments/{unifiedRoleAssignmentMultipleId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


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

If successful, this method returns a `200 OK` response code and an updated [unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_unifiedroleassignmentmultiple"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/rbacApplicationMultiple/roleAssignments/{unifiedRoleAssignmentMultipleId}
Content-Type: application/json
Content-length: 313

{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignmentMultiple",
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignmentMultiple",
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

