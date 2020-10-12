---
title: "Get ediscoveryCase"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get ediscoveryCase

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships an ediscoveryCase object.

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

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

| Name          | Description               |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Request Body

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an ediscoveryCase object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_ediscoverycase"
}
-->

```http
GET https://graph.microsoft.com/beta/compliance/ediscovery/cases/{id}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.compliance.ediscovery.contract.ediscoveryCase"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.ediscoveryCase",
  "closedBy": {
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
  "closedDateTime": "DateTimeOffset",
  "createdDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "externalId": "String",
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
  "status": "String"
}
}

```
