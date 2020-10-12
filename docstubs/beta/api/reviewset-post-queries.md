---
title: "Create queries"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create queries

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new reviewSetQuery object.

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

In the request body, supply JSON representation of the [reviewSetQuery](../resources/-reviewsetquery.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a reviewSetQuery object.

| Property             | Type                                       | Description |
| :------------------- | :----------------------------------------- | :---------- |
| createdBy            | [identitySet](../resources/identityset.md) |             |
| createdDateTime      | DateTimeOffset                             |             |
| displayName          | String                                     |             |
| id                   | String                                     | Read-only.  |
| lastModifiedBy       | [identitySet](../resources/identityset.md) |             |
| lastModifiedDateTime | DateTimeOffset                             |             |
| query                | String                                     |             |

## Response

If successful, this method returns a `201 Created` response code and a reviewSetQuery object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_queries"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 1329

[
  {
    "@odata.type": "#microsoft.graph.reviewSetQuery",
    "createdBy": {
      "@odata.type": "#microsoft.graph.identitySet",
      "application": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      },
      "device": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      },
      "user": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      }
    },
    "createdDateTime": "DateTimeOffset",
    "displayName": "String",
    "id": "String(identifier)",
    "lastModifiedBy": {
      "@odata.type": "#microsoft.graph.identitySet",
      "application": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      },
      "device": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      },
      "user": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      }
    },
    "lastModifiedDateTime": "DateTimeOffset",
    "query": "String"
  }
]

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "$(this.ReturnTypeFullName)"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.reviewSetQuery",
    "createdBy": {
      "@odata.type": "#microsoft.graph.identitySet",
      "application": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      },
      "device": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      },
      "user": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      }
    },
    "createdDateTime": "DateTimeOffset",
    "displayName": "String",
    "id": "String(identifier)",
    "lastModifiedBy": {
      "@odata.type": "#microsoft.graph.identitySet",
      "application": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      },
      "device": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      },
      "user": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      }
    },
    "lastModifiedDateTime": "DateTimeOffset",
    "query": "String"
  }
]
}

```
