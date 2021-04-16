---
title: "Create roleDefinition"
description: "Create a new roleDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create roleDefinition
Namespace: microsoft.graph



Create a new [roleDefinition](../resources/roledefinition.md) object.

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
POST /deviceManagement/roleDefinitions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [roleDefinition](../resources/roledefinition.md) object.

The following table shows the properties that are required when you create the [roleDefinition](../resources/roledefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|Description of the Role definition.|
|displayName|String|Display Name of the Role definition.|
|isBuiltIn|Boolean|Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.|
|isBuiltInRoleDefinition|Boolean|Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.|
|permissions|[rolePermission](../resources/rolepermission.md) collection|List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.|
|rolePermissions|[rolePermission](../resources/rolepermission.md) collection|List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|



## Response

If successful, this method returns a `201 Created` response code and a [roleDefinition](../resources/roledefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_roledefinition_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/roleDefinitions
Content-Type: application/json
Content-length: 418

{
  "@odata.type": "#microsoft.graph.roleDefinition",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

