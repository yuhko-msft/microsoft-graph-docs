---
title: "Get privilegedRoleAssignment"
description: "Read the properties and relationships of a privilegedRoleAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get privilegedRoleAssignment
Namespace: microsoft.graph



Read the properties and relationships of a [privilegedRoleAssignment](../resources/privilegedroleassignment.md) object.

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
GET /privilegedRoleAssignments/{privilegedRoleAssignmentsId}
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

If successful, this method returns a `200 OK` response code and a [privilegedRoleAssignment](../resources/privilegedroleassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_privilegedroleassignment"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/privilegedRoleAssignments/{privilegedRoleAssignmentsId}
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.privilegedRoleAssignment",
    "id": "b43be327-e327-b43b-27e3-3bb427e33bb4",
    "expirationDateTime": "String (timestamp)",
    "isElevated": "Boolean",
    "resultMessage": "String",
    "roleId": "String",
    "userId": "String"
  }
}
```

