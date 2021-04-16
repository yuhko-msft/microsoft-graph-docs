---
title: "Add privilegedRoleAssignment"
description: "Add assignments by posting to the assignments collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add privilegedRoleAssignment
Namespace: microsoft.graph



Add assignments by posting to the assignments collection.

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
POST /privilegedRoles/{privilegedRolesId}/assignments/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [privilegedRoleAssignment](../resources/privilegedroleassignment.md) object.

The following table shows the properties that are required when you create the [privilegedRoleAssignment](../resources/privilegedroleassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|isElevated|Boolean|**TODO: Add Description**|
|resultMessage|String|**TODO: Add Description**|
|roleId|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and a [privilegedRoleAssignment](../resources/privilegedroleassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_privilegedroleassignment_from_privilegedroleassignments"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/privilegedRoles/{privilegedRolesId}/assignments/$ref
Content-Type: application/json
Content-length: 217

{
  "@odata.type": "#microsoft.graph.privilegedRoleAssignment",
  "expirationDateTime": "String (timestamp)",
  "isElevated": "Boolean",
  "resultMessage": "String",
  "roleId": "String",
  "userId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.privilegedRoleAssignment"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.privilegedRoleAssignment",
  "id": "b43be327-e327-b43b-27e3-3bb427e33bb4",
  "expirationDateTime": "String (timestamp)",
  "isElevated": "Boolean",
  "resultMessage": "String",
  "roleId": "String",
  "userId": "String"
}
```

