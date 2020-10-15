---
title: "Create authenticationMethodsPolicy"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create authenticationMethodsPolicy

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new authenticationMethodsPolicy object.

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

In the request body, supply JSON representation of the [authenticationMethodsPolicy](../resources/-authenticationmethodspolicy.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an authenticationMethodsPolicy object.

| Property                    | Type                                                                                | Description |
| :-------------------------- | :---------------------------------------------------------------------------------- | :---------- |
| convergedPolicyTargetGroup  | String                                                                              |             |
| description                 | String                                                                              |             |
| displayName                 | String                                                                              |             |
| id                          | String                                                                              | Read-only.  |
| lastModifiedDateTime        | DateTimeOffset                                                                      |             |
| policyVersion               | String                                                                              |             |
| reconfirmationInDays        | Int32                                                                               |             |
| registrationAndResetTargets | [registrationAndResetTarget](../resources/registrationandresettarget.md) collection |             |
| registrationEnforcement     | [registrationEnforcement](../resources/registrationenforcement.md)                  |             |

## Response

If successful, this method returns a `201 Created` response code and an authenticationMethodsPolicy object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_authenticationmethodspolicy"
}
-->

```http
POST https://graph.microsoft.com/beta/authenticationMethodsPolicy

Content-Type: application/json
Content-Length: 750

{
  "@odata.type": "#microsoft.graph.authenticationMethodsPolicy",
  "convergedPolicyTargetGroup": "String",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "DateTimeOffset",
  "policyVersion": "String",
  "reconfirmationInDays": "Int32",
  "registrationAndResetTargets": [
    {
      "@odata.type": "#microsoft.graph.registrationAndResetTarget",
      "id": "String(identifier)",
      "minAuthMethodsToRegister": "Int32",
      "minAuthMethodsToReset": "Int32",
      "targetType": "String"
    }
  ],
  "registrationEnforcement": {
    "@odata.type": "#microsoft.graph.registrationEnforcement",
    "isAllowedToSkipRegistration": "Boolean",
    "registrationSkipDurationInDays": "Int32"
  }
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.authMethodPolicy.authenticationMethodsPolicy"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.authenticationMethodsPolicy",
  "convergedPolicyTargetGroup": "String",
  "description": "String",
  "displayName": "String",
  "id": "String(identifier)",
  "lastModifiedDateTime": "DateTimeOffset",
  "policyVersion": "String",
  "reconfirmationInDays": "Int32",
  "registrationAndResetTargets": [
    {
      "@odata.type": "#microsoft.graph.registrationAndResetTarget",
      "id": "String(identifier)",
      "minAuthMethodsToRegister": "Int32",
      "minAuthMethodsToReset": "Int32",
      "targetType": "String"
    }
  ],
  "registrationEnforcement": {
    "@odata.type": "#microsoft.graph.registrationEnforcement",
    "isAllowedToSkipRegistration": "Boolean",
    "registrationSkipDurationInDays": "Int32"
  }
}
}

```
