---
title: "Get agreementAcceptance"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get agreementAcceptance

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships an agreementAcceptance object.

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

If successful, this method returns a `200 OK` response code and an agreementAcceptance object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_agreementacceptance"
}
-->

```http
GET https://graph.microsoft.com/beta/agreementAcceptances/{id}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.azure.termsOfUse.agreementAcceptance"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
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
}

```
