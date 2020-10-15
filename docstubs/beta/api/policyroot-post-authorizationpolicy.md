---
title: "Create authorizationPolicy"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create authorizationPolicy

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new authorizationPolicy object.

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

In the request body, supply JSON representation of the [authorizationPolicy](../resources/-authorizationpolicy.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an authorizationPolicy object.

| Property                                          | Type                                                                     | Description |
| :------------------------------------------------ | :----------------------------------------------------------------------- | :---------- |
| allowedToSignUpEmailBasedSubscriptions            | Boolean                                                                  |             |
| allowedToUseSSPR                                  | Boolean                                                                  |             |
| allowEmailVerifiedUsersToJoinOrganization         | Boolean                                                                  |             |
| allowInvitesFrom                                  | String                                                                   |             |
| blockMsolPowerShell                               | Boolean                                                                  |             |
| defaultUserRolePermissions                        | [defaultUserRolePermissions](../resources/defaultuserrolepermissions.md) |             |
| enabledPreviewFeatures                            | String collection                                                        |             |
| guestUserRoleId                                   | Guid                                                                     |             |
| permissionGrantPolicyIdsAssignedToDefaultUserRole | String collection                                                        |             |

## Response

If successful, this method returns a `201 Created` response code and an authorizationPolicy object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_authorizationpolicy"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 860

[
  {
    "@odata.type": "#microsoft.graph.authorizationPolicy",
    "allowEmailVerifiedUsersToJoinOrganization": "Boolean",
    "allowInvitesFrom": "String",
    "allowedToSignUpEmailBasedSubscriptions": "Boolean",
    "allowedToUseSSPR": "Boolean",
    "blockMsolPowerShell": "Boolean",
    "defaultUserRolePermissions": {
      "@odata.type": "#microsoft.graph.defaultUserRolePermissions",
      "allowedToCreateApps": "Boolean",
      "allowedToCreateSecurityGroups": "Boolean",
      "allowedToReadOtherUsers": "Boolean"
    },
    "deletedDateTime": "DateTimeOffset",
    "description": "String",
    "displayName": "String",
    "enabledPreviewFeatures": [
      "String"
    ],
    "guestUserRoleId": "Guid",
    "id": "String(identifier)",
    "permissionGrantPolicyIdsAssignedToDefaultUserRole": [
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
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.authorizationPolicy",
    "allowEmailVerifiedUsersToJoinOrganization": "Boolean",
    "allowInvitesFrom": "String",
    "allowedToSignUpEmailBasedSubscriptions": "Boolean",
    "allowedToUseSSPR": "Boolean",
    "blockMsolPowerShell": "Boolean",
    "defaultUserRolePermissions": {
      "@odata.type": "#microsoft.graph.defaultUserRolePermissions",
      "allowedToCreateApps": "Boolean",
      "allowedToCreateSecurityGroups": "Boolean",
      "allowedToReadOtherUsers": "Boolean"
    },
    "deletedDateTime": "DateTimeOffset",
    "description": "String",
    "displayName": "String",
    "enabledPreviewFeatures": [
      "String"
    ],
    "guestUserRoleId": "Guid",
    "id": "String(identifier)",
    "permissionGrantPolicyIdsAssignedToDefaultUserRole": [
      "String"
    ]
  }
]
}

```
