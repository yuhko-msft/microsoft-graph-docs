---
title: "Create deviceAndAppManagementRoleAssignment"
description: "Create a new deviceAndAppManagementRoleAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceAndAppManagementRoleAssignment
Namespace: microsoft.graph



Create a new [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object.

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
POST /deviceManagement/roleAssignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object.

The following table shows the properties that are required when you create the [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|Description of the Role Assignment. Inherited from [roleAssignment](../resources/roleassignment.md)|
|displayName|String|The display or friendly name of the role Assignment. Inherited from [roleAssignment](../resources/roleassignment.md)|
|resourceScopes|String collection|List of ids of role scope member security groups.  These are IDs from Azure Active Directory. Inherited from [roleAssignment](../resources/roleassignment.md)|
|scopeMembers|String collection|List of ids of role scope member security groups.  These are IDs from Azure Active Directory. Inherited from [roleAssignment](../resources/roleassignment.md)|
|scopeType|roleAssignmentScopeType|Specifies the type of scope for a Role Assignment. Default type 'ResourceScope' allows assignment of ResourceScopes. For 'AllDevices', 'AllLicensedUsers', and 'AllDevicesAndLicensedUsers', the ResourceScopes property should be left empty. Inherited from [roleAssignment](../resources/roleassignment.md). Possible values are: `resourceScope`, `allDevices`, `allLicensedUsers`, `allDevicesAndLicensedUsers`.|
|members|String collection|The list of ids of role member security groups. These are IDs from Azure Active Directory.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceandappmanagementroleassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/roleAssignments
Content-Type: application/json
Content-length: 280

{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementRoleAssignment",
  "description": "String",
  "displayName": "String",
  "resourceScopes": [
    "String"
  ],
  "scopeMembers": [
    "String"
  ],
  "scopeType": "String",
  "members": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceAndAppManagementRoleAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementRoleAssignment",
  "id": "b6fd471c-471c-b6fd-1c47-fdb61c47fdb6",
  "description": "String",
  "displayName": "String",
  "resourceScopes": [
    "String"
  ],
  "scopeMembers": [
    "String"
  ],
  "scopeType": "String",
  "members": [
    "String"
  ]
}
```

