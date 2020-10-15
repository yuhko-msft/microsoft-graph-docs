---
title: "Create directoryRoleTemplate"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create directoryRoleTemplate

Namespace: microsoft.graph

Create a new directoryRoleTemplate object.

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

In the request body, supply JSON representation of the [directoryRoleTemplate](../resources/-directoryroletemplate.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a directoryRoleTemplate object.

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| description | String |             |
| displayName | String |             |

## Response

If successful, this method returns a `201 Created` response code and a directoryRoleTemplate object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_directoryroletemplate"
}
-->

```http
POST https://graph.microsoft.com/v1.0/directoryRoleTemplates/{id}

Content-Type: application/json
Content-Length: 159

{
  "@odata.type": "#microsoft.graph.directoryRoleTemplate",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.directoryRoleTemplate"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.directoryRoleTemplate",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String(identifier)"
}
}

```
