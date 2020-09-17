---
title: "manageddevice : requestRemoteAssistance"
description: "Request remote assistance"
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# manageddevice : requestRemoteAssistance

Namespace: microsoft.graph

Request remote assistance

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
/users/{id}/managedDevices/{id}/requestRemoteAssistance
/deviceManagement/managedDevices/{id}/requestRemoteAssistance
/deviceManagement/detectedApps/{id}/managedDevices/{id}/requestRemoteAssistance

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `204 No Content` response code.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "manageddevice_requestremoteassistance"
}
-->

```http
POST https://graph.microsoft.com/v1.0/users/{id}/managedDevices/{id}/requestRemoteAssistance

```

### Response

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "$(this.ReturnTypeFullName)"
}
-->

```http
HTTP 1.1 204 No Content

```