---
title: "Update deviceAndAppManagementRoleDefinition"
description: "Update the properties of a deviceAndAppManagementRoleDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceAndAppManagementRoleDefinition
Namespace: microsoft.graph

Update the properties of a [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH ** Entity URI for microsoft.graph.deviceAndAppManagementRoleDefinition not found
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
|displayName|String|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|description|String|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|permissions|[rolePermission](../resources/intune-rolepermission.md) collection|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|rolePermissions|[rolePermission](../resources/intune-rolepermission.md) collection|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|isBuiltInRoleDefinition|Boolean|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|isBuiltIn|Boolean|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [roleDefinition](../resources/intune-roledefinition.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceAndAppManagementRoleDefinition](../resources/deviceandappmanagementroledefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_deviceandappmanagementroledefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.deviceAndAppManagementRoleDefinition not found
Content-Type: application/json
Content-length: 440

{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementRoleDefinition",
  "displayName": "String",
  "description": "String",
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
  "isBuiltInRoleDefinition": "Boolean",
  "isBuiltIn": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
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
  "@odata.type": "#microsoft.graph.deviceAndAppManagementRoleDefinition",
  "id": "69c692ac-92ac-69c6-ac92-c669ac92c669",
  "displayName": "String",
  "description": "String",
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
  "isBuiltInRoleDefinition": "Boolean",
  "isBuiltIn": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```

