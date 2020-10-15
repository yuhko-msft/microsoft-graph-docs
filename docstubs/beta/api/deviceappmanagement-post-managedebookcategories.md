---
title: "Create managedEBookCategories"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create managedEBookCategories

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new managedEBookCategory object.

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

In the request body, supply JSON representation of the [managedEBookCategory](../resources/intune-managedebookcategory.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a managedEBookCategory object.

| Property             | Type           | Description                                                   |
| :------------------- | :------------- | :------------------------------------------------------------ |
| displayName          | String         | The name of the eBook category.                               |
| id                   | String         | The key of the entity. Read-only.                             |
| lastModifiedDateTime | DateTimeOffset | The date and time the ManagedEBookCategory was last modified. |

## Response

If successful, this method returns a `201 Created` response code and a managedEBookCategory object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_managedebookcategories"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 184

[
  {
    "@odata.type": "#microsoft.graph.managedEBookCategory",
    "displayName": "String",
    "id": "String(identifier)",
    "lastModifiedDateTime": "DateTimeOffset"
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
    "@odata.type": "#microsoft.graph.managedEBookCategory",
    "displayName": "String",
    "id": "String(identifier)",
    "lastModifiedDateTime": "DateTimeOffset"
  }
]
}

```
