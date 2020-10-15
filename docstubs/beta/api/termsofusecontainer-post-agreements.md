---
title: "Create agreements"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create agreements

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new agreement object.

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

In the request body, supply JSON representation of the [agreement](../resources/-agreement.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an agreement object.

| Property                          | Type                                               | Description |
| :-------------------------------- | :------------------------------------------------- | :---------- |
| displayName                       | String                                             |             |
| id                                | String                                             | Read-only.  |
| isPerDeviceAcceptanceRequired     | Boolean                                            |             |
| isViewingBeforeAcceptanceRequired | Boolean                                            |             |
| termsExpiration                   | [termsExpiration](../resources/termsexpiration.md) |             |
| userReacceptRequiredFrequency     | Duration                                           |             |

## Response

If successful, this method returns a `201 Created` response code and an agreement object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_agreements"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 443

[
  {
    "@odata.type": "#microsoft.graph.agreement",
    "displayName": "String",
    "id": "String(identifier)",
    "isPerDeviceAcceptanceRequired": "Boolean",
    "isViewingBeforeAcceptanceRequired": "Boolean",
    "termsExpiration": {
      "@odata.type": "#microsoft.graph.termsExpiration",
      "frequency": "Duration",
      "startDateTime": "DateTimeOffset"
    },
    "userReacceptRequiredFrequency": "Duration"
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
    "@odata.type": "#microsoft.graph.agreement",
    "displayName": "String",
    "id": "String(identifier)",
    "isPerDeviceAcceptanceRequired": "Boolean",
    "isViewingBeforeAcceptanceRequired": "Boolean",
    "termsExpiration": {
      "@odata.type": "#microsoft.graph.termsExpiration",
      "frequency": "Duration",
      "startDateTime": "DateTimeOffset"
    },
    "userReacceptRequiredFrequency": "Duration"
  }
]
}

```
