---
title: "authorizationPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# authorizationPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [policyBase](policybase.md)

## Methods

| Method                                                                   | Return Type                                              | Description                                                         |
| :----------------------------------------------------------------------- | :------------------------------------------------------- | :------------------------------------------------------------------ |
| [List authorizationPolicy](../api/authorizationpolicy-list.md)           | [authorizationPolicy](authorizationPolicy.md) collection | List properties and relationships of an authorizationPolicy object. |
| [Create authorizationPolicy](../api/authorizationpolicy-create.md)       | [authorizationPolicy](authorizationPolicy.md)            | Create a new authorizationPolicy object.                            |
| [Get authorizationPolicy](../api/authorizationpolicy-get.md)             | [authorizationPolicy](authorizationPolicy.md)            | Read properties and relationships of an authorizationPolicy object. |
| [Update authorizationPolicy](../api/authorizationpolicy-update.md)       | [authorizationPolicy](authorizationPolicy.md)            | Update the properties of an authorizationPolicy object.             |
| [Delete authorizationPolicy](../api/authorizationpolicy-delete.md)       |                                                          | Delete an authorizationPolicy object.                               |
| [checkMemberGroups](../api/authorizationpolicy-checkMemberGroups.md)     |                                                          |                                                                     |
| [checkMemberObjects](../api/authorizationpolicy-checkMemberObjects.md)   |                                                          |                                                                     |
| [getByIds](../api/authorizationpolicy-getByIds.md)                       |                                                          |                                                                     |
| [getMemberGroups](../api/authorizationpolicy-getMemberGroups.md)         |                                                          |                                                                     |
| [getMemberObjects](../api/authorizationpolicy-getMemberObjects.md)       |                                                          |                                                                     |
| [getUserOwnedObjects](../api/authorizationpolicy-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md)      |                                                                     |
| [restore](../api/authorizationpolicy-restore.md)                         | [directoryObject](../resources/-directoryobject.md)      |                                                                     |
| [validateProperties](../api/authorizationpolicy-validateProperties.md)   |                                                          |                                                                     |

## Properties

| Property                                          | Type                                                                     | Description |
| :------------------------------------------------ | :----------------------------------------------------------------------- | :---------- |
| allowEmailVerifiedUsersToJoinOrganization         | Boolean                                                                  |             |
| allowInvitesFrom                                  | String                                                                   |             |
| allowedToSignUpEmailBasedSubscriptions            | Boolean                                                                  |             |
| allowedToUseSSPR                                  | Boolean                                                                  |             |
| blockMsolPowerShell                               | Boolean                                                                  |             |
| defaultUserRolePermissions                        | [defaultUserRolePermissions](../resources/defaultuserrolepermissions.md) |             |
| deletedDateTime                                   | DateTimeOffset                                                           |             |
| description                                       | String                                                                   |             |
| displayName                                       | String                                                                   |             |
| enabledPreviewFeatures                            | String collection                                                        |             |
| guestUserRoleId                                   | Guid                                                                     |             |
| id                                                | String                                                                   | Read-only.  |
| permissionGrantPolicyIdsAssignedToDefaultUserRole | String collection                                                        |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authorizationPolicy",
  "baseType": "microsoft.graph.policyBase",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.authorizationPolicy",
  "allowEmailVerifiedUsersToJoinOrganization": "Boolean",
  "allowInvitesFrom": "none | adminsAndGuestInviters | adminsGuestInvitersAndAllMembers | everyone | unknownFutureValue",
  "allowedToSignUpEmailBasedSubscriptions": "Boolean",
  "allowedToUseSSPR": "Boolean",
  "blockMsolPowerShell": "Boolean",
  "defaultUserRolePermissions": {"@odata.type": "microsoft.graph.defaultUserRolePermissions"},
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "enabledPreviewFeatures": ["String"],
  "guestUserRoleId": "Guid",
  "id": "String (identifier)",
  "permissionGrantPolicyIdsAssignedToDefaultUserRole": ["String"]
}
```
