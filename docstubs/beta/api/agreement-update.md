---
title: "Update agreement"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update agreement

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an agreement object.

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

If successful, this method returns a `200 OK` response code and an agreement object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_agreement"
}
-->

```http
PATCH https://graph.microsoft.com/beta/agreements/{id}

Content-Type: application/json
Content-Length: 380

{
  "@odata.type": "#microsoft.graph.agreement",
  "displayName": "String",
  "isPerDeviceAcceptanceRequired": "Boolean",
  "isViewingBeforeAcceptanceRequired": "Boolean",
  "termsExpiration": {
    "@odata.type": "#microsoft.graph.termsExpiration",
    "frequency": "Duration",
    "startDateTime": "DateTimeOffset"
  },
  "userReacceptRequiredFrequency": "Duration"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.azure.termsOfUse.agreement"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
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
}

```
