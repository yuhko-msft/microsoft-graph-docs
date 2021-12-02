---
title: "Get unifiedRoleAssignmentMultiple"
description: "Read the properties and relationships of an unifiedRoleAssignmentMultiple object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get unifiedRoleAssignmentMultiple
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) object.

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
GET /rbacApplicationMultiple/roleAssignments/{unifiedRoleAssignmentMultipleId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [unifiedRoleAssignmentMultiple](../resources/unifiedroleassignmentmultiple.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_unifiedroleassignmentmultiple"
}
-->
``` http
GET https://graph.microsoft.com/beta/rbacApplicationMultiple/roleAssignments/{unifiedRoleAssignmentMultipleId}
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

