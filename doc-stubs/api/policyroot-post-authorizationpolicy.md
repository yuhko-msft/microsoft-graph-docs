---
title: "Create authorizationPolicy"
description: "Create a new authorizationPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create authorizationPolicy
Namespace: microsoft.graph



Create a new authorizationPolicy object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
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
POST /policies/authorizationPolicy
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [authorizationPolicy](../resources/authorizationpolicy.md) object.

The following table shows the properties that are required when you create the [authorizationPolicy](../resources/authorizationpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|description|String|**TODO: Add Description** Inherited from [policyBase](../resources/policybase.md)|
|displayName|String|**TODO: Add Description** Inherited from [policyBase](../resources/policybase.md)|
|allowedToSignUpEmailBasedSubscriptions|Boolean|**TODO: Add Description**|
|allowedToUseSSPR|Boolean|**TODO: Add Description**|
|allowEmailVerifiedUsersToJoinOrganization|Boolean|**TODO: Add Description**|
|allowInvitesFrom|allowInvitesFrom|**TODO: Add Description**. Possible values are: `none`, `adminsAndGuestInviters`, `adminsGuestInvitersAndAllMembers`, `everyone`, `unknownFutureValue`.|
|blockMsolPowerShell|Boolean|**TODO: Add Description**|
|defaultUserRolePermissions|[defaultUserRolePermissions](../resources/defaultuserrolepermissions.md)|**TODO: Add Description**|
|enabledPreviewFeatures|String collection|**TODO: Add Description**|
|guestUserRoleId|Guid|**TODO: Add Description**|
|permissionGrantPolicyIdsAssignedToDefaultUserRole|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [authorizationPolicy](../resources/authorizationpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_authorizationpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/policies/authorizationPolicy
Content-Type: application/json
Content-length: 645

{
  "@odata.type": "#microsoft.graph.authorizationPolicy",
  "deletedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "allowedToSignUpEmailBasedSubscriptions": "Boolean",
  "allowedToUseSSPR": "Boolean",
  "allowEmailVerifiedUsersToJoinOrganization": "Boolean",
  "allowInvitesFrom": "String",
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
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.authorizationPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.authorizationPolicy",
  "id": "4ae0f460-f460-4ae0-60f4-e04a60f4e04a",
  "deletedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "allowedToSignUpEmailBasedSubscriptions": "Boolean",
  "allowedToUseSSPR": "Boolean",
  "allowEmailVerifiedUsersToJoinOrganization": "Boolean",
  "allowInvitesFrom": "String",
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
```

