---
title: "List authorizationPolicy"
description: "Get the authorizationPolicies from the authorizationPolicy navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List authorizationPolicy
Namespace: microsoft.graph

Get the authorizationPolicies from the authorizationPolicy navigation property.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /policies/authorizationPolicy
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [authorizationPolicy](../resources/authorizationpolicy.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_authorizationpolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta/policies/authorizationPolicy
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.authorizationPolicy)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.authorizationPolicy",
      "id": "43d2e760-e760-43d2-60e7-d24360e7d243",
      "deletedDateTime": "String (timestamp)",
      "description": "String",
      "displayName": "String",
      "allowInvitesFrom": "String",
      "allowedToSignUpEmailBasedSubscriptions": "Boolean",
      "allowedToUseSSPR": "Boolean",
      "allowEmailVerifiedUsersToJoinOrganization": "Boolean",
      "blockMsolPowerShell": "Boolean",
      "defaultUserRolePermissions": {
        "@odata.type": "microsoft.graph.defaultUserRolePermissions"
      },
      "enabledPreviewFeatures": [
        "String"
      ],
      "guestUserRoleId": "Guid",
      "permissionGrantPolicyIdsAssignedToDefaultUserRole": [
        "String"
      ]
    }
  ]
}
```

