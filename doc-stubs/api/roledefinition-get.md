---
title: "Get roleDefinition"
description: "Read the properties and relationships of a roleDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get roleDefinition
Namespace: microsoft.graph



Read the properties and relationships of a [roleDefinition](../resources/roledefinition.md) object.

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
GET /deviceManagement/roleDefinitions/{roleDefinitionId}
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

If successful, this method returns a `200 OK` response code and a [roleDefinition](../resources/roledefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_roledefinition"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/roleDefinitions/{roleDefinitionId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.roleDefinition"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.roleDefinition",
    "id": "5e0a306c-306c-5e0a-6c30-0a5e6c300a5e",
    "description": "String",
    "displayName": "String",
    "isBuiltIn": "Boolean",
    "isBuiltInRoleDefinition": "Boolean",
    "permissions": [
      {
        "@odata.type": "microsoft.graph.rolePermission"
      }
    ],
    "rolePermissions": [
      {
        "@odata.type": "microsoft.graph.rolePermission"
      }
    ],
    "roleScopeTagIds": [
      "String"
    ]
  }
}
```

