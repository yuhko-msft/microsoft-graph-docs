---
title: "Create agreementAcceptances"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create agreementAcceptances

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new agreementAcceptance object.

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

In the request body, supply JSON representation of the [agreementAcceptance](../resources/-agreementacceptance.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an agreementAcceptance object.

| Property           | Type           | Description |
| :----------------- | :------------- | :---------- |
| agreementFileId    | String         |             |
| agreementId        | String         |             |
| deviceDisplayName  | String         |             |
| deviceId           | String         |             |
| deviceOSType       | String         |             |
| deviceOSVersion    | String         |             |
| expirationDateTime | DateTimeOffset |             |
| id                 | String         | Read-only.  |
| recordedDateTime   | DateTimeOffset |             |
| state              | String         |             |
| userDisplayName    | String         |             |
| userEmail          | String         |             |
| userId             | String         |             |
| userPrincipalName  | String         |             |

## Response

If successful, this method returns a `201 Created` response code and an agreementAcceptance object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_agreementacceptances"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 533

[
  {
    "@odata.type": "#microsoft.graph.agreementAcceptance",
    "agreementFileId": "String",
    "agreementId": "String",
    "deviceDisplayName": "String",
    "deviceId": "String",
    "deviceOSType": "String",
    "deviceOSVersion": "String",
    "expirationDateTime": "DateTimeOffset",
    "id": "String(identifier)",
    "recordedDateTime": "DateTimeOffset",
    "state": "String",
    "userDisplayName": "String",
    "userEmail": "String",
    "userId": "String",
    "userPrincipalName": "String"
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
    "@odata.type": "#microsoft.graph.agreementAcceptance",
    "agreementFileId": "String",
    "agreementId": "String",
    "deviceDisplayName": "String",
    "deviceId": "String",
    "deviceOSType": "String",
    "deviceOSVersion": "String",
    "expirationDateTime": "DateTimeOffset",
    "id": "String(identifier)",
    "recordedDateTime": "DateTimeOffset",
    "state": "String",
    "userDisplayName": "String",
    "userEmail": "String",
    "userId": "String",
    "userPrincipalName": "String"
  }
]
}

```
