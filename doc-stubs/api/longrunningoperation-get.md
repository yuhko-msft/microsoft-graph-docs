---
title: "Get longRunningOperation"
description: "Read the properties and relationships of a longRunningOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get longRunningOperation
Namespace: microsoft.graph



Read the properties and relationships of a [longRunningOperation](../resources/longrunningoperation.md) object.

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
GET /me/authentication/operations/{longRunningOperationId}
GET /users/{usersId}/authentication/operations/{longRunningOperationId}
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

If successful, this method returns a `200 OK` response code and a [longRunningOperation](../resources/longrunningoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_longrunningoperation"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/authentication/operations/{longRunningOperationId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.longRunningOperation"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.longRunningOperation",
    "id": "c20b89e0-89e0-c20b-e089-0bc2e0890bc2",
    "createdDateTime": "String (timestamp)",
    "lastActionDateTime": "String (timestamp)",
    "resourceLocation": "String",
    "status": "String",
    "statusDetail": "String"
  }
}
```

