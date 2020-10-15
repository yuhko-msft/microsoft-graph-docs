---
title: "Add tokenIssuancePolicies"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Add tokenIssuancePolicies

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add tokenIssuancePolicy by posting to the tokenIssuancePolicy collection.

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

In the request body, supply JSON representation of the [tokenIssuancePolicy](../resources/-tokenissuancepolicy.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a tokenIssuancePolicy object.

| Property | Type | Description |
| :------- | :--- | :---------- |

## Response

If successful, this method returns a `201 Created` response code and a tokenIssuancePolicy object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "add_tokenissuancepolicies"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 294

[
  {
    "@odata.type": "#microsoft.graph.tokenIssuancePolicy",
    "definition": [
      "String"
    ],
    "deletedDateTime": "DateTimeOffset",
    "description": "String",
    "displayName": "String",
    "id": "String(identifier)",
    "isOrganizationDefault": "Boolean"
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
    "@odata.type": "#microsoft.graph.tokenIssuancePolicy",
    "definition": [
      "String"
    ],
    "deletedDateTime": "DateTimeOffset",
    "description": "String",
    "displayName": "String",
    "id": "String(identifier)",
    "isOrganizationDefault": "Boolean"
  }
]
}

```
