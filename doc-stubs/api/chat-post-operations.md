---
title: "Create teamsAsyncOperation"
description: "Create a new teamsAsyncOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamsAsyncOperation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new teamsAsyncOperation object.

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
POST /chats/{chatsId}/operations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsAsyncOperation](../resources/teamsasyncoperation.md) object.

You can specify the following properties when creating a **teamsAsyncOperation**.

|Property|Type|Description|
|:---|:---|:---|
|operationType|teamsAsyncOperationType|**TODO: Add Description**. The possible values are: `invalid`, `cloneTeam`, `archiveTeam`, `unarchiveTeam`, `createTeam`, `unknownFutureValue`, `teamifyGroup`, `createChannel`, `createChat`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `teamifyGroup` , `createChannel` , `createChat`. Required.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|status|teamsAsyncOperationStatus|**TODO: Add Description**. The possible values are: `invalid`, `notStarted`, `inProgress`, `succeeded`, `failed`, `unknownFutureValue`. Required.|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|attemptsCount|Int32|**TODO: Add Description** Required.|
|targetResourceId|String|**TODO: Add Description** Optional.|
|targetResourceLocation|String|**TODO: Add Description** Optional.|
|error|[Microsoft.Teams.GraphSvc.operationError](../resources/operationerror.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [teamsAsyncOperation](../resources/teamsasyncoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamsasyncoperation_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/chats/{chatsId}/operations
Content-Type: application/json
Content-length: 346

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamsAsyncOperation",
  "operationType": "String",
  "status": "String",
  "lastActionDateTime": "String (timestamp)",
  "attemptsCount": "Integer",
  "targetResourceId": "String",
  "targetResourceLocation": "String",
  "error": {
    "@odata.type": "microsoft.graph.operationError"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.teamsAsyncOperation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamsAsyncOperation",
  "id": "517e1d3e-1d3e-517e-3e1d-7e513e1d7e51",
  "operationType": "String",
  "createdDateTime": "String (timestamp)",
  "status": "String",
  "lastActionDateTime": "String (timestamp)",
  "attemptsCount": "Integer",
  "targetResourceId": "String",
  "targetResourceLocation": "String",
  "error": {
    "@odata.type": "microsoft.graph.operationError"
  }
}
```

