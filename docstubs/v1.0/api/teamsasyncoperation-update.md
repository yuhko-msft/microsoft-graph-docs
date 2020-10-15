---
title: "Update teamsAsyncOperation"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update teamsAsyncOperation

Namespace: microsoft.graph

Update the properties of a teamsAsyncOperation object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [teamsAsyncOperation](../resources/-teamsasyncoperation.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a teamsAsyncOperation object.

| Property               | Type                                             | Description |
| :--------------------- | :----------------------------------------------- | :---------- |
| attemptsCount          | Int32                                            |             |
| createdDateTime        | DateTimeOffset                                   |             |
| error                  | [operationError](../resources/operationerror.md) |             |
| id                     | String                                           | Read-only.  |
| lastActionDateTime     | DateTimeOffset                                   |             |
| operationType          | String                                           |             |
| status                 | String                                           |             |
| targetResourceId       | String                                           |             |
| targetResourceLocation | String                                           |             |

## Response

If successful, this method returns a `200 OK` response code and a teamsAsyncOperation object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_teamsasyncoperation"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0/teams/{id}/operations/{id}

Content-Type: application/json
Content-Length: 298

{
  "@odata.type": "#microsoft.graph.teamsAsyncOperation",
  "attemptsCount": "Int32",
  "createdDateTime": "DateTimeOffset",
  "lastActionDateTime": "DateTimeOffset",
  "operationType": "String",
  "status": "String",
  "targetResourceId": "String",
  "targetResourceLocation": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.teamsAsyncOperation"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.teamsAsyncOperation",
  "attemptsCount": "Int32",
  "createdDateTime": "DateTimeOffset",
  "id": "String(identifier)",
  "lastActionDateTime": "DateTimeOffset",
  "operationType": "String",
  "status": "String",
  "targetResourceId": "String",
  "targetResourceLocation": "String"
}
}

```
