---
title: "Update deviceRegistrationPolicy"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update deviceRegistrationPolicy

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a deviceRegistrationPolicy object.

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

In the request body, supply JSON representation of the [deviceRegistrationPolicy](../resources/-deviceregistrationpolicy.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a deviceRegistrationPolicy object.

| Property                     | Type                                                                   | Description |
| :--------------------------- | :--------------------------------------------------------------------- | :---------- |
| azureADJoin                  | [azureAdJoinPolicy](../resources/azureadjoinpolicy.md)                 |             |
| azureADRegistration          | [azureADRegistrationPolicy](../resources/azureadregistrationpolicy.md) |             |
| description                  | String                                                                 |             |
| displayName                  | String                                                                 |             |
| id                           | String                                                                 | Read-only.  |
| multiFactorAuthConfiguration | String                                                                 |             |
| userDeviceQuota              | Int32                                                                  |             |

## Response

If successful, this method returns a `200 OK` response code and a deviceRegistrationPolicy object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_deviceregistrationpolicy"
}
-->

```http
PATCH https://graph.microsoft.com/beta/deviceRegistrationPolicy

Content-Type: application/json
Content-Length: 704

{
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
  "multiFactorAuthConfiguration": "String",
  "userDeviceQuota": "Int32"
}

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
