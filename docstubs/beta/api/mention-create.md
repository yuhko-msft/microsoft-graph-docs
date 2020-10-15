---
title: "Create mention"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create mention

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new mention object.

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

In the request body, supply JSON representation of the [mention](../resources/-mention.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a mention object.

| Property              | Type                                         | Description |
| :-------------------- | :------------------------------------------- | :---------- |
| application           | String                                       |             |
| clientReference       | String                                       |             |
| createdBy             | [emailAddress](../resources/emailaddress.md) |             |
| createdDateTime       | DateTimeOffset                               |             |
| deepLink              | String                                       |             |
| id                    | String                                       | Read-only.  |
| mentioned             | [emailAddress](../resources/emailaddress.md) |             |
| mentionText           | String                                       |             |
| serverCreatedDateTime | DateTimeOffset                               |             |

## Response

If successful, this method returns a `201 Created` response code and a mention object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_mention"
}
-->

```http
POST https://graph.microsoft.com/beta/users/{id}/messages/{id}/mentions/{id}

Content-Type: application/json
Content-Length: 498

{
  "@odata.type": "#microsoft.graph.mention",
  "application": "String",
  "clientReference": "String",
  "createdBy": {
    "@odata.type": "#microsoft.graph.emailAddress",
    "address": "String",
    "name": "String"
  },
  "createdDateTime": "DateTimeOffset",
  "deepLink": "String",
  "mentionText": "String",
  "mentioned": {
    "@odata.type": "#microsoft.graph.emailAddress",
    "address": "String",
    "name": "String"
  },
  "serverCreatedDateTime": "DateTimeOffset"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.mention"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.mention",
  "application": "String",
  "clientReference": "String",
  "createdBy": {
    "@odata.type": "#microsoft.graph.emailAddress",
    "address": "String",
    "name": "String"
  },
  "createdDateTime": "DateTimeOffset",
  "deepLink": "String",
  "id": "String(identifier)",
  "mentionText": "String",
  "mentioned": {
    "@odata.type": "#microsoft.graph.emailAddress",
    "address": "String",
    "name": "String"
  },
  "serverCreatedDateTime": "DateTimeOffset"
}
}

```
