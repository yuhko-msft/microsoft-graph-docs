---
title: "Create directoryRole"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create directoryRole

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new directoryRole object.

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

In the request body, supply JSON representation of the [directoryRole](../resources/-directoryrole.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a directoryRole object.

| Property       | Type   | Description |
| :------------- | :----- | :---------- |
| description    | String |             |
| displayName    | String |             |
| roleTemplateId | String |             |

## Response

If successful, this method returns a `201 Created` response code and a directoryRole object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_directoryrole"
}
-->

```http
POST https://graph.microsoft.com/beta/directoryRoles/{id}

Content-Type: application/json
Content-Length: 182

{
  "@odata.type": "#microsoft.graph.directoryRole",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "roleTemplateId": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.directoryRole"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.directoryRole",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String(identifier)",
  "roleTemplateId": "String"
}
}

```
