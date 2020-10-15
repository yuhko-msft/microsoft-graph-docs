---
title: "Update userConfiguration"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update userConfiguration

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a userConfiguration object.

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

In the request body, supply JSON representation of the [userConfiguration](../resources/-userconfiguration.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a userConfiguration object.

| Property   | Type   | Description |
| :--------- | :----- | :---------- |
| binaryData | Binary |             |
| id         | String | Read-only.  |

## Response

If successful, this method returns a `200 OK` response code and a userConfiguration object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_userconfiguration"
}
-->

```http
PATCH https://graph.microsoft.com/beta/users/{id}/mailFolders/{id}/userConfigurations/{id}

Content-Type: application/json
Content-Length: 86

{
  "@odata.type": "#microsoft.graph.userConfiguration",
  "binaryData": "Binary"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.userConfiguration"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.userConfiguration",
  "binaryData": "Binary",
  "id": "String(identifier)"
}
}

```
