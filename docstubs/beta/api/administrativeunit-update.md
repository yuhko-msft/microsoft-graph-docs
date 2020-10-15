---
title: "Update administrativeUnit"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update administrativeUnit

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an administrativeUnit object.

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

In the request body, supply JSON representation of the [administrativeUnit](../resources/-administrativeunit.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an administrativeUnit object.

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| description | String |             |
| displayName | String |             |
| visibility  | String |             |

## Response

If successful, this method returns a `200 OK` response code and an administrativeUnit object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_administrativeunit"
}
-->

```http
PATCH https://graph.microsoft.com/beta/administrativeUnits/{id}

Content-Type: application/json
Content-Length: 183

{
  "@odata.type": "#microsoft.graph.administrativeUnit",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "visibility": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.administrativeUnit"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.administrativeUnit",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String(identifier)",
  "visibility": "String"
}
}

```
