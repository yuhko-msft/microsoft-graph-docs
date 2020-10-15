---
title: "serviceprincipal : getUserOwnedObjects"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# serviceprincipal : getUserOwnedObjects

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

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

In the request body, supply JSON representation of the parameters.

<!-- Actions and Functions -->

The following table shows the parameters that can be used with this method.

| Parameter | Type   | Description |
| :-------- | :----- | :---------- |
| userId    | String |             |
| type      | String |             |

<!-- CRUD Methods -->

## Response

If successful, this method returns a `200 Ok` response code and a directoryObject object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "serviceprincipal_getuserownedobjects"
}
-->

```http
POST https://graph.microsoft.com/beta/me/manager/getUserOwnedObjects

Content-Type: application/json
Content-Length: 97

{
  "@odata.type": "#microsoft.graph.directoryObject",
  "deletedDateTime": "DateTimeOffset"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.directoryObject"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.directoryObject",
  "deletedDateTime": "DateTimeOffset",
  "id": "String(identifier)"
}
}

```
