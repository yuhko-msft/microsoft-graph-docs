---
title: "Update extensionProperties"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update extensionProperties

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an extensionProperty object.

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

In the request body, supply JSON representation of the [extensionProperty](../resources/-extensionproperty.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an extensionProperty object.

| Property               | Type              | Description |
| :--------------------- | :---------------- | :---------- |
| appDisplayName         | String            |             |
| dataType               | String            |             |
| isSyncedFromOnPremises | Boolean           |             |
| name                   | String            |             |
| targetObjects          | String collection |             |

## Response

If successful, this method returns a `200 OK` response code and an extensionProperty object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_extensionproperties"
}
-->

```http
PATCH https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 319

[
  {
    "@odata.type": "#microsoft.graph.extensionProperty",
    "appDisplayName": "String",
    "dataType": "String",
    "deletedDateTime": "DateTimeOffset",
    "id": "String(identifier)",
    "isSyncedFromOnPremises": "Boolean",
    "name": "String",
    "targetObjects": [
      "String"
    ]
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
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.extensionProperty",
    "appDisplayName": "String",
    "dataType": "String",
    "deletedDateTime": "DateTimeOffset",
    "id": "String(identifier)",
    "isSyncedFromOnPremises": "Boolean",
    "name": "String",
    "targetObjects": [
      "String"
    ]
  }
]
}

```
