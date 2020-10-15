---
title: "Update deviceManagement"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update deviceManagement

Namespace: microsoft.graph

Update the properties of a deviceManagement object.

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

In the request body, supply JSON representation of the [deviceManagement](../resources/intune-devicemanagement.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a deviceManagement object.

| Property          | Type   | Description                                         |
| :---------------- | :----- | :-------------------------------------------------- |
| id                | String | Unique Identifier for the device Read-only.         |
| subscriptionState | String | Tenant mobile device management subscription state. |

## Response

If successful, this method returns a `200 OK` response code and a deviceManagement object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_devicemanagement"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0/deviceManagement

Content-Type: application/json
Content-Length: 92

{
  "@odata.type": "#microsoft.graph.deviceManagement",
  "subscriptionState": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.deviceManagement"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.deviceManagement",
  "id": "String(identifier)",
  "subscriptionState": "String"
}
}

```
