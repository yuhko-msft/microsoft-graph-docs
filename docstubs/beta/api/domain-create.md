---
title: "Create domain"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create domain

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new domain object.

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

In the request body, supply JSON representation of the [domain](../resources/-domain.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a domain object.

| Property                         | Type                                       | Description |
| :------------------------------- | :----------------------------------------- | :---------- |
| authenticationType               | String                                     |             |
| availabilityStatus               | String                                     |             |
| id                               | String                                     | Read-only.  |
| isAdminManaged                   | Boolean                                    |             |
| isDefault                        | Boolean                                    |             |
| isInitial                        | Boolean                                    |             |
| isRoot                           | Boolean                                    |             |
| isVerified                       | Boolean                                    |             |
| passwordNotificationWindowInDays | Int32                                      |             |
| passwordValidityPeriodInDays     | Int32                                      |             |
| state                            | [domainState](../resources/domainstate.md) |             |
| supportedServices                | String collection                          |             |

## Response

If successful, this method returns a `201 Created` response code and a domain object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_domain"
}
-->

```http
POST https://graph.microsoft.com/beta/domains/{id}

Content-Type: application/json
Content-Length: 563

{
  "@odata.type": "#microsoft.graph.domain",
  "authenticationType": "String",
  "availabilityStatus": "String",
  "isAdminManaged": "Boolean",
  "isDefault": "Boolean",
  "isInitial": "Boolean",
  "isRoot": "Boolean",
  "isVerified": "Boolean",
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
HTTP 1.1 201 Created

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
