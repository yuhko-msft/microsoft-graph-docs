---
title: "group resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# group resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                             | Return Type                                                                         | Description                                                                                  |
| :--------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------- |
| [List group](../api/group-list.md)                                                 | [group](group.md) collection                                                        | List properties and relationships of a group object.                                         |
| [Create group](../api/group-create.md)                                             | [group](group.md)                                                                   | Create a new group object.                                                                   |
| [Get group](../api/group-get.md)                                                   | [group](group.md)                                                                   | Read properties and relationships of a group object.                                         |
| [Update group](../api/group-update.md)                                             | [group](group.md)                                                                   | Update the properties of a group object.                                                     |
| [Delete group](../api/group-delete.md)                                             |                                                                                     | Delete a group object.                                                                       |
| [assignLicense](../api/group-assignLicense.md)                                     | [group](../resources/-group.md)                                                     |                                                                                              |
| [checkGrantedPermissionsForApp](../api/group-checkGrantedPermissionsForApp.md)     |                                                                                     |                                                                                              |
| [checkMemberGroups](../api/group-checkMemberGroups.md)                             |                                                                                     |                                                                                              |
| [checkMemberObjects](../api/group-checkMemberObjects.md)                           |                                                                                     |                                                                                              |
| [getByIds](../api/group-getByIds.md)                                               |                                                                                     |                                                                                              |
| [getMemberGroups](../api/group-getMemberGroups.md)                                 |                                                                                     |                                                                                              |
| [getMemberObjects](../api/group-getMemberObjects.md)                               |                                                                                     |                                                                                              |
| [getUserOwnedObjects](../api/group-getUserOwnedObjects.md)                         | [directoryObject](../resources/-directoryobject.md)                                 |                                                                                              |
| [grantResourceSpecificConsent](../api/group-grantResourceSpecificConsent.md)       |                                                                                     |                                                                                              |
| [restore](../api/group-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md)                                 |                                                                                              |
| [revokeResourceSpecificConsent](../api/group-revokeResourceSpecificConsent.md)     |                                                                                     |                                                                                              |
| [validateProperties](../api/group-validateProperties.md)                           |                                                                                     |                                                                                              |
| [delta](../api/group-delta.md)                                                     |                                                                                     |                                                                                              |
| [linkCount](../api/group-linkCount.md)                                             | Int64                                                                               |                                                                                              |
| [List appRoleAssignments](../api/group-list-approleassignments.md)                 | [appRoleAssignment](../resources/-approleassignment.md)                             | Get the appRoleAssignment objects from an appRoleAssignments navigation property.            |
| [Create appRoleAssignments](../api/group-post-approleassignments.md)               | [appRoleAssignment](../resources/-approleassignment.md)                             | Create a new appRoleAssignment object.                                                       |
| [Get appRoleAssignments](../api/group-get-approleassignments.md)                   | [appRoleAssignment](../resources/-approleassignment.md)                             | Read the properties and relationships of an appRoleAssignment object.                        |
| [Update appRoleAssignments](../api/group-update-approleassignments.md)             | [appRoleAssignment](../resources/-approleassignment.md)                             | Update the properties of an appRoleAssignment object.                                        |
| [Delete appRoleAssignments](../api/group-delete-approleassignments.md)             |                                                                                     | Delete an appRoleAssignment object.                                                          |
| [List createdOnBehalfOf](../api/group-list-createdonbehalfof.md)                   | [directoryObject](../resources/-directoryobject.md)                                 | Get the directoryObject objects from a createdOnBehalfOf navigation property.                |
| [Add createdOnBehalfOf](../api/group-post-createdonbehalfof.md)                    | [directoryObject](../resources/-directoryobject.md)                                 | Add directoryObject by posting to the directoryObject collection.                            |
| [Get createdOnBehalfOf](../api/group-get-createdonbehalfof.md)                     | [directoryObject](../resources/-directoryobject.md)                                 | Read the properties and relationships of a directoryObject object.                           |
| [Update createdOnBehalfOf](../api/group-update-createdonbehalfof.md)               | [directoryObject](../resources/-directoryobject.md)                                 | Update the properties of a directoryObject object.                                           |
| [Remove createdOnBehalfOf](../api/group-delete-createdonbehalfof.md)               |                                                                                     | Remove a directoryObject object.                                                             |
| [List endpoints](../api/group-list-endpoints.md)                                   | [endpoint](../resources/-endpoint.md)                                               | Get the endpoint objects from an endpoints navigation property.                              |
| [Create endpoints](../api/group-post-endpoints.md)                                 | [endpoint](../resources/-endpoint.md)                                               | Create a new endpoint object.                                                                |
| [Get endpoints](../api/group-get-endpoints.md)                                     | [endpoint](../resources/-endpoint.md)                                               | Read the properties and relationships of an endpoint object.                                 |
| [Update endpoints](../api/group-update-endpoints.md)                               | [endpoint](../resources/-endpoint.md)                                               | Update the properties of an endpoint object.                                                 |
| [Delete endpoints](../api/group-delete-endpoints.md)                               |                                                                                     | Delete an endpoint object.                                                                   |
| [List memberOf](../api/group-list-memberof.md)                                     | [directoryObject](../resources/-directoryobject.md)                                 | Get the directoryObject objects from a memberOf navigation property.                         |
| [Add memberOf](../api/group-post-memberof.md)                                      | [directoryObject](../resources/-directoryobject.md)                                 | Add directoryObject by posting to the directoryObject collection.                            |
| [Get memberOf](../api/group-get-memberof.md)                                       | [directoryObject](../resources/-directoryobject.md)                                 | Read the properties and relationships of a directoryObject object.                           |
| [Update memberOf](../api/group-update-memberof.md)                                 | [directoryObject](../resources/-directoryobject.md)                                 | Update the properties of a directoryObject object.                                           |
| [Remove memberOf](../api/group-delete-memberof.md)                                 |                                                                                     | Remove a directoryObject object.                                                             |
| [List members](../api/group-list-members.md)                                       | [directoryObject](../resources/-directoryobject.md)                                 | Get the directoryObject objects from a members navigation property.                          |
| [Add members](../api/group-post-members.md)                                        | [directoryObject](../resources/-directoryobject.md)                                 | Add directoryObject by posting to the directoryObject collection.                            |
| [Get members](../api/group-get-members.md)                                         | [directoryObject](../resources/-directoryobject.md)                                 | Read the properties and relationships of a directoryObject object.                           |
| [Update members](../api/group-update-members.md)                                   | [directoryObject](../resources/-directoryobject.md)                                 | Update the properties of a directoryObject object.                                           |
| [Remove members](../api/group-delete-members.md)                                   |                                                                                     | Remove a directoryObject object.                                                             |
| [List membersWithLicenseErrors](../api/group-list-memberswithlicenseerrors.md)     | [directoryObject](../resources/-directoryobject.md)                                 | Get the directoryObject objects from a membersWithLicenseErrors navigation property.         |
| [Add membersWithLicenseErrors](../api/group-post-memberswithlicenseerrors.md)      | [directoryObject](../resources/-directoryobject.md)                                 | Add directoryObject by posting to the directoryObject collection.                            |
| [Get membersWithLicenseErrors](../api/group-get-memberswithlicenseerrors.md)       | [directoryObject](../resources/-directoryobject.md)                                 | Read the properties and relationships of a directoryObject object.                           |
| [Update membersWithLicenseErrors](../api/group-update-memberswithlicenseerrors.md) | [directoryObject](../resources/-directoryobject.md)                                 | Update the properties of a directoryObject object.                                           |
| [Remove membersWithLicenseErrors](../api/group-delete-memberswithlicenseerrors.md) |                                                                                     | Remove a directoryObject object.                                                             |
| [List owners](../api/group-list-owners.md)                                         | [directoryObject](../resources/-directoryobject.md)                                 | Get the directoryObject objects from an owners navigation property.                          |
| [Add owners](../api/group-post-owners.md)                                          | [directoryObject](../resources/-directoryobject.md)                                 | Add directoryObject by posting to the directoryObject collection.                            |
| [Get owners](../api/group-get-owners.md)                                           | [directoryObject](../resources/-directoryobject.md)                                 | Read the properties and relationships of a directoryObject object.                           |
| [Update owners](../api/group-update-owners.md)                                     | [directoryObject](../resources/-directoryobject.md)                                 | Update the properties of a directoryObject object.                                           |
| [Remove owners](../api/group-delete-owners.md)                                     |                                                                                     | Remove a directoryObject object.                                                             |
| [List permissionGrants](../api/group-list-permissiongrants.md)                     | [resourceSpecificPermissionGrant](../resources/-resourcespecificpermissiongrant.md) | Get the resourceSpecificPermissionGrant objects from a permissionGrants navigation property. |
| [Create permissionGrants](../api/group-post-permissiongrants.md)                   | [resourceSpecificPermissionGrant](../resources/-resourcespecificpermissiongrant.md) | Create a new resourceSpecificPermissionGrant object.                                         |
| [Get permissionGrants](../api/group-get-permissiongrants.md)                       | [resourceSpecificPermissionGrant](../resources/-resourcespecificpermissiongrant.md) | Read the properties and relationships of a resourceSpecificPermissionGrant object.           |
| [Update permissionGrants](../api/group-update-permissiongrants.md)                 | [resourceSpecificPermissionGrant](../resources/-resourcespecificpermissiongrant.md) | Update the properties of a resourceSpecificPermissionGrant object.                           |
| [Delete permissionGrants](../api/group-delete-permissiongrants.md)                 |                                                                                     | Delete a resourceSpecificPermissionGrant object.                                             |
| [List settings](../api/group-list-settings.md)                                     | [directorySetting](../resources/-directorysetting.md)                               | Get the directorySetting objects from a settings navigation property.                        |
| [Create settings](../api/group-post-settings.md)                                   | [directorySetting](../resources/-directorysetting.md)                               | Create a new directorySetting object.                                                        |
| [Get settings](../api/group-get-settings.md)                                       | [directorySetting](../resources/-directorysetting.md)                               | Read the properties and relationships of a directorySetting object.                          |
| [Update settings](../api/group-update-settings.md)                                 | [directorySetting](../resources/-directorysetting.md)                               | Update the properties of a directorySetting object.                                          |
| [Delete settings](../api/group-delete-settings.md)                                 |                                                                                     | Delete a directorySetting object.                                                            |
| [List transitiveMemberOf](../api/group-list-transitivememberof.md)                 | [directoryObject](../resources/-directoryobject.md)                                 | Get the directoryObject objects from a transitiveMemberOf navigation property.               |
| [Add transitiveMemberOf](../api/group-post-transitivememberof.md)                  | [directoryObject](../resources/-directoryobject.md)                                 | Add directoryObject by posting to the directoryObject collection.                            |
| [Get transitiveMemberOf](../api/group-get-transitivememberof.md)                   | [directoryObject](../resources/-directoryobject.md)                                 | Read the properties and relationships of a directoryObject object.                           |
| [Update transitiveMemberOf](../api/group-update-transitivememberof.md)             | [directoryObject](../resources/-directoryobject.md)                                 | Update the properties of a directoryObject object.                                           |
| [Remove transitiveMemberOf](../api/group-delete-transitivememberof.md)             |                                                                                     | Remove a directoryObject object.                                                             |
| [List transitiveMembers](../api/group-list-transitivemembers.md)                   | [directoryObject](../resources/-directoryobject.md)                                 | Get the directoryObject objects from a transitiveMembers navigation property.                |
| [Add transitiveMembers](../api/group-post-transitivemembers.md)                    | [directoryObject](../resources/-directoryobject.md)                                 | Add directoryObject by posting to the directoryObject collection.                            |
| [Get transitiveMembers](../api/group-get-transitivemembers.md)                     | [directoryObject](../resources/-directoryobject.md)                                 | Read the properties and relationships of a directoryObject object.                           |
| [Update transitiveMembers](../api/group-update-transitivemembers.md)               | [directoryObject](../resources/-directoryobject.md)                                 | Update the properties of a directoryObject object.                                           |
| [Remove transitiveMembers](../api/group-delete-transitivemembers.md)               |                                                                                     | Remove a directoryObject object.                                                             |

## Properties

| Property                      | Type                                                                                  | Description |
| :---------------------------- | :------------------------------------------------------------------------------------ | :---------- |
| assignedLabels                | [assignedLabel](../resources/assignedlabel.md) collection                             |             |
| assignedLicenses              | [assignedLicense](../resources/assignedlicense.md) collection                         |             |
| classification                | String                                                                                |             |
| createdByAppId                | String                                                                                |             |
| createdDateTime               | DateTimeOffset                                                                        |             |
| deletedDateTime               | DateTimeOffset                                                                        |             |
| description                   | String                                                                                |             |
| displayName                   | String                                                                                |             |
| expirationDateTime            | DateTimeOffset                                                                        |             |
| groupTypes                    | String collection                                                                     |             |
| hasMembersWithLicenseErrors   | Boolean                                                                               |             |
| id                            | String                                                                                | Read-only.  |
| infoCatalogs                  | String collection                                                                     |             |
| isAssignableToRole            | Boolean                                                                               |             |
| licenseProcessingState        | [licenseProcessingState](../resources/licenseprocessingstate.md)                      |             |
| mail                          | String                                                                                |             |
| mailEnabled                   | Boolean                                                                               |             |
| mailNickname                  | String                                                                                |             |
| mdmAppId                      | String                                                                                |             |
| membershipRule                | String                                                                                |             |
| membershipRuleProcessingState | String                                                                                |             |
| onPremisesDomainName          | String                                                                                |             |
| onPremisesLastSyncDateTime    | DateTimeOffset                                                                        |             |
| onPremisesNetBiosName         | String                                                                                |             |
| onPremisesProvisioningErrors  | [onPremisesProvisioningError](../resources/onpremisesprovisioningerror.md) collection |             |
| onPremisesSamAccountName      | String                                                                                |             |
| onPremisesSecurityIdentifier  | String                                                                                |             |
| onPremisesSyncEnabled         | Boolean                                                                               |             |
| preferredDataLocation         | String                                                                                |             |
| preferredLanguage             | String                                                                                |             |
| proxyAddresses                | String collection                                                                     |             |
| renewedDateTime               | DateTimeOffset                                                                        |             |
| resourceBehaviorOptions       | String collection                                                                     |             |
| resourceProvisioningOptions   | String collection                                                                     |             |
| securityEnabled               | Boolean                                                                               |             |
| securityIdentifier            | String                                                                                |             |
| theme                         | String                                                                                |             |
| visibility                    | String                                                                                |             |

## Relationships

| Relationship             | Type                                                                                          | Description |
| :----------------------- | :-------------------------------------------------------------------------------------------- | :---------- |
| appRoleAssignments       | [appRoleAssignment](../resources/approleassignment.md) collection                             |             |
| createdOnBehalfOf        | [directoryObject](../resources/directoryobject.md)                                            |             |
| endpoints                | [endpoint](../resources/endpoint.md) collection                                               |             |
| memberOf                 | [directoryObject](../resources/directoryobject.md) collection                                 |             |
| members                  | [directoryObject](../resources/directoryobject.md) collection                                 |             |
| membersWithLicenseErrors | [directoryObject](../resources/directoryobject.md) collection                                 |             |
| owners                   | [directoryObject](../resources/directoryobject.md) collection                                 |             |
| permissionGrants         | [resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) collection |             |
| settings                 | [directorySetting](../resources/directorysetting.md) collection                               |             |
| transitiveMemberOf       | [directoryObject](../resources/directoryobject.md) collection                                 |             |
| transitiveMembers        | [directoryObject](../resources/directoryobject.md) collection                                 |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.group",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.group",
  "assignedLabels": [{"@odata.type": "microsoft.graph.assignedLabel"}],
  "assignedLicenses": [{"@odata.type": "microsoft.graph.assignedLicense"}],
  "classification": "String",
  "createdByAppId": "String",
  "createdDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "expirationDateTime": "DateTimeOffset",
  "groupTypes": ["String"],
  "hasMembersWithLicenseErrors": "Boolean",
  "id": "String (identifier)",
  "infoCatalogs": ["String"],
  "isAssignableToRole": "Boolean",
  "licenseProcessingState": {"@odata.type": "microsoft.graph.licenseProcessingState"},
  "mail": "String",
  "mailEnabled": "Boolean",
  "mailNickname": "String",
  "mdmAppId": "String",
  "membershipRule": "String",
  "membershipRuleProcessingState": "String",
  "onPremisesDomainName": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesNetBiosName": "String",
  "onPremisesProvisioningErrors": [{"@odata.type": "microsoft.graph.onPremisesProvisioningError"}],
  "onPremisesSamAccountName": "String",
  "onPremisesSecurityIdentifier": "String",
  "onPremisesSyncEnabled": "Boolean",
  "preferredDataLocation": "String",
  "preferredLanguage": "String",
  "proxyAddresses": ["String"],
  "renewedDateTime": "DateTimeOffset",
  "resourceBehaviorOptions": ["String"],
  "resourceProvisioningOptions": ["String"],
  "securityEnabled": "Boolean",
  "securityIdentifier": "String",
  "theme": "String",
  "visibility": "String"
}
```
