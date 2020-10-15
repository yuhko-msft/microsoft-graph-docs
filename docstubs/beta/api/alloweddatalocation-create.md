---
title: "Create allowedDataLocation"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create allowedDataLocation

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new allowedDataLocation object.

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

In the request body, supply JSON representation of the [allowedDataLocation](../resources/-alloweddatalocation.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an allowedDataLocation object.

| Property  | Type    | Description |
| :-------- | :------ | :---------- |
| appId     | String  |             |
| domain    | String  |             |
| id        | String  | Read-only.  |
| isDefault | Boolean |             |
| location  | String  |             |

## Response

If successful, this method returns a `201 Created` response code and an allowedDataLocation object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_alloweddatalocation"
}
-->

```http
POST https://graph.microsoft.com/beta/allowedDataLocations/{id}

Content-Type: application/json
Content-Length: 158

{
  "@odata.type": "#microsoft.graph.allowedDataLocation",
  "appId": "String",
  "domain": "String",
  "isDefault": "Boolean",
  "location": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.allowedDataLocation"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.allowedDataLocation",
  "appId": "String",
  "domain": "String",
  "id": "String(identifier)",
  "isDefault": "Boolean",
  "location": "String"
}
}

```
