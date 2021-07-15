---
title: "Create deviceAndAppManagementRoleDefinition"
description: "Create a new deviceAndAppManagementRoleDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceAndAppManagementRoleDefinition
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.

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
POST ** Collection URI for microsoft.graph.deviceAndAppManagementRoleDefinition not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.

The following table shows the properties that are required when you create the [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|Description of the Role definition. Inherited from [roleDefinition](../resources/roledefinition.md)|
|displayName|String|Display Name of the Role definition. Inherited from [roleDefinition](../resources/roledefinition.md)|
|isBuiltIn|Boolean|Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition. Inherited from [roleDefinition](../resources/roledefinition.md)|
|isBuiltInRoleDefinition|Boolean|Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition. Inherited from [roleDefinition](../resources/roledefinition.md)|
|permissions|[rolePermission](../resources/rolepermission.md) collection|List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission. Inherited from [roleDefinition](../resources/roledefinition.md)|
|rolePermissions|[rolePermission](../resources/rolepermission.md) collection|List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission. Inherited from [roleDefinition](../resources/roledefinition.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [roleDefinition](../resources/roledefinition.md)|



## Response

If successful, this method returns a `201 Created` response code and a [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceandappmanagementroledefinition_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.deviceAndAppManagementRoleDefinition not found
Content-Type: application/json
Content-length: 440

{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementRoleDefinition",
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
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceAndAppManagementRoleDefinition"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementRoleDefinition",
  "id": "5e9612e1-12e1-5e96-e112-965ee112965e",
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

