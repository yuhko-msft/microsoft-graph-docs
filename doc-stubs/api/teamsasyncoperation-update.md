---
title: "Update teamsAsyncOperation"
description: "Update the properties of a teamsAsyncOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update teamsAsyncOperation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [teamsAsyncOperation](../resources/teamsasyncoperation.md) object.

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
PATCH /chats/{chatsId}/operations/{teamsAsyncOperationId}
PATCH /teams/{teamsId}/operations/{teamsAsyncOperationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsAsyncOperation](../resources/teamsasyncoperation.md) object.

The following table shows the properties that are required when you update the [teamsAsyncOperation](../resources/teamsasyncoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|attemptsCount|Int32|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|error|[operationError](../resources/operationerror.md)|**TODO: Add Description**|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description**|
|operationType|teamsAsyncOperationType|**TODO: Add Description**. Possible values are: `invalid`, `cloneTeam`, `archiveTeam`, `unarchiveTeam`, `createTeam`, `unknownFutureValue`, `teamifyGroup`, `createChannel`, `createChat`.|
|status|teamsAsyncOperationStatus|**TODO: Add Description**. Possible values are: `invalid`, `notStarted`, `inProgress`, `succeeded`, `failed`, `unknownFutureValue`.|
|targetResourceId|String|**TODO: Add Description**|
|targetResourceLocation|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [teamsAsyncOperation](../resources/teamsasyncoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_teamsasyncoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/chats/{chatsId}/operations/{teamsAsyncOperationId}
Content-Type: application/json
Content-length: 337

{
  "@odata.type": "#microsoft.graph.teamsAsyncOperation",
  "attemptsCount": "Integer",
  "error": {
    "@odata.type": "microsoft.graph.operationError"
  },
  "lastActionDateTime": "String (timestamp)",
  "operationType": "String",
  "status": "String",
  "targetResourceId": "String",
  "targetResourceLocation": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.teamsAsyncOperation",
  "id": "1200c275-c275-1200-75c2-001275c20012",
  "attemptsCount": "Integer",
  "createdDateTime": "String (timestamp)",
  "error": {
    "@odata.type": "microsoft.graph.operationError"
  },
  "lastActionDateTime": "String (timestamp)",
  "operationType": "String",
  "status": "String",
  "targetResourceId": "String",
  "targetResourceLocation": "String"
}
```

