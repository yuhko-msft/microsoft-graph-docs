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
|displayName|String|**TODO: Add Description** Inherited from [roleAssignment](../resources/intune-roleassignment.md)|
|description|String|**TODO: Add Description** Inherited from [roleAssignment](../resources/intune-roleassignment.md)|
|scopeMembers|String collection|**TODO: Add Description** Inherited from [roleAssignment](../resources/intune-roleassignment.md)|
|scopeType|roleAssignmentScopeType|**TODO: Add Description** Inherited from [roleAssignment](../resources/intune-roleassignment.md). Possible values are: `resourceScope`, `allDevices`, `allLicensedUsers`, `allDevicesAndLicensedUsers`.|
|resourceScopes|String collection|**TODO: Add Description** Inherited from [roleAssignment](../resources/intune-roleassignment.md)|
|members|String collection|**TODO: Add Description**|
|scopeTags|String collection|**TODO: Add Description**|



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
POST https://graph.microsoft.com/beta/deviceManagement/roleAssignments
Content-Type: application/json
Content-length: 318

{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementRoleAssignment",
  "displayName": "String",
  "description": "String",
  "scopeMembers": [
    "String"
  ],
  "scopeType": "String",
  "resourceScopes": [
    "String"
  ],
  "members": [
    "String"
  ],
  "scopeTags": [
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
  "id": "1b6130d6-30d6-1b61-d630-611bd630611b",
  "displayName": "String",
  "description": "String",
  "scopeMembers": [
    "String"
  ],
  "scopeType": "String",
  "resourceScopes": [
    "String"
  ],
  "members": [
    "String"
  ],
  "scopeTags": [
    "String"
  ]
}
```

