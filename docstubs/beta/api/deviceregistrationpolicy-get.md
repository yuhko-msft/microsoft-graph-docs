---
title: "Get deviceRegistrationPolicy"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get deviceRegistrationPolicy

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships a deviceRegistrationPolicy object.

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

If successful, this method returns a `200 OK` response code and a deviceRegistrationPolicy object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_deviceregistrationpolicy"
}
-->

```http
GET https://graph.microsoft.com/beta/deviceRegistrationPolicy

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.deviceRegistrationPolicy.deviceRegistrationPolicy"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.deviceRegistrationPolicy",
  "azureADJoin": {
    "@odata.type": "#microsoft.graph.azureAdJoinPolicy",
    "allowedGroups": [
      "String"
    ],
    "allowedUsers": [
      "String"
    ],
    "appliesTo": "String",
    "isAdminConfigurable": "Boolean"
  },
  "azureADRegistration": {
    "@odata.type": "#microsoft.graph.azureADRegistrationPolicy",
    "allowedGroups": [
      "String"
    ],
    "allowedUsers": [
      "String"
    ],
    "appliesTo": "String",
    "isAdminConfigurable": "Boolean"
  },
  "description": "String",
  "displayName": "String",
  "id": "String(identifier)",
  "multiFactorAuthConfiguration": "String",
  "userDeviceQuota": "Int32"
}
}

```
