---
title: "domain : verify"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# domain : verify

Namespace: microsoft.graph

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

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 Ok` response code and a domain object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "domain_verify"
}
-->

```http
POST https://graph.microsoft.com/v1.0/domains/{id}/verify

Content-Type: application/json
Content-Length: 614

{
  "@odata.type": "#microsoft.graph.domain",
  "authenticationType": "String",
  "availabilityStatus": "String",
  "isAdminManaged": "Boolean",
  "isDefault": "Boolean",
  "isInitial": "Boolean",
  "isRoot": "Boolean",
  "isVerified": "Boolean",
  "manufacturer": "String",
  "model": "String",
  "passwordNotificationWindowInDays": "Int32",
  "passwordValidityPeriodInDays": "Int32",
  "state": {
    "@odata.type": "#microsoft.graph.domainState",
    "lastActionDateTime": "DateTimeOffset",
    "operation": "String",
    "status": "String"
  },
  "supportedServices": [
    "String"
  ]
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.domain"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.domain",
  "authenticationType": "String",
  "availabilityStatus": "String",
  "id": "String(identifier)",
  "isAdminManaged": "Boolean",
  "isDefault": "Boolean",
  "isInitial": "Boolean",
  "isRoot": "Boolean",
  "isVerified": "Boolean",
  "manufacturer": "String",
  "model": "String",
  "passwordNotificationWindowInDays": "Int32",
  "passwordValidityPeriodInDays": "Int32",
  "state": {
    "@odata.type": "#microsoft.graph.domainState",
    "lastActionDateTime": "DateTimeOffset",
    "operation": "String",
    "status": "String"
  },
  "supportedServices": [
    "String"
  ]
}
}

```
