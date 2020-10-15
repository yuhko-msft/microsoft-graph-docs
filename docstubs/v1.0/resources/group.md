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

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                             | Return Type                                             | Description                                                                          |
| :--------------------------------------------------------------------------------- | :------------------------------------------------------ | :----------------------------------------------------------------------------------- |
| [List group](../api/group-list.md)                                                 | [group](group.md) collection                            | List properties and relationships of a group object.                                 |
| [Create group](../api/group-create.md)                                             | [group](group.md)                                       | Create a new group object.                                                           |
| [Get group](../api/group-get.md)                                                   | [group](group.md)                                       | Read properties and relationships of a group object.                                 |
| [Update group](../api/group-update.md)                                             | [group](group.md)                                       | Update the properties of a group object.                                             |
| [Delete group](../api/group-delete.md)                                             |                                                         | Delete a group object.                                                               |
| [assignLicense](../api/group-assignLicense.md)                                     | [group](../resources/-group.md)                         |                                                                                      |
| [checkMemberGroups](../api/group-checkMemberGroups.md)                             |                                                         |                                                                                      |
| [checkMemberObjects](../api/group-checkMemberObjects.md)                           |                                                         |                                                                                      |
| [getAvailableExtensionProperties](../api/group-getAvailableExtensionProperties.md) |                                                         |                                                                                      |
| [getByIds](../api/group-getByIds.md)                                               |                                                         |                                                                                      |
| [getMemberGroups](../api/group-getMemberGroups.md)                                 |                                                         |                                                                                      |
| [getMemberObjects](../api/group-getMemberObjects.md)                               |                                                         |                                                                                      |
| [restore](../api/group-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md)     |                                                                                      |
| [validateProperties](../api/group-validateProperties.md)                           |                                                         |                                                                                      |
| [delta](../api/group-delta.md)                                                     |                                                         |                                                                                      |
| [List appRoleAssignments](../api/group-list-approleassignments.md)                 | [appRoleAssignment](../resources/-approleassignment.md) | Get the appRoleAssignment objects from an appRoleAssignments navigation property.    |
| [Create appRoleAssignments](../api/group-post-approleassignments.md)               | [appRoleAssignment](../resources/-approleassignment.md) | Create a new appRoleAssignment object.                                               |
| [Get appRoleAssignments](../api/group-get-approleassignments.md)                   | [appRoleAssignment](../resources/-approleassignment.md) | Read the properties and relationships of an appRoleAssignment object.                |
| [Update appRoleAssignments](../api/group-update-approleassignments.md)             | [appRoleAssignment](../resources/-approleassignment.md) | Update the properties of an appRoleAssignment object.                                |
| [Delete appRoleAssignments](../api/group-delete-approleassignments.md)             |                                                         | Delete an appRoleAssignment object.                                                  |
| [List createdOnBehalfOf](../api/group-list-createdonbehalfof.md)                   | [directoryObject](../resources/-directoryobject.md)     | Get the directoryObject objects from a createdOnBehalfOf navigation property.        |
| [Add createdOnBehalfOf](../api/group-post-createdonbehalfof.md)                    | [directoryObject](../resources/-directoryobject.md)     | Add directoryObject by posting to the directoryObject collection.                    |
| [Get createdOnBehalfOf](../api/group-get-createdonbehalfof.md)                     | [directoryObject](../resources/-directoryobject.md)     | Read the properties and relationships of a directoryObject object.                   |
| [Update createdOnBehalfOf](../api/group-update-createdonbehalfof.md)               | [directoryObject](../resources/-directoryobject.md)     | Update the properties of a directoryObject object.                                   |
| [Remove createdOnBehalfOf](../api/group-delete-createdonbehalfof.md)               |                                                         | Remove a directoryObject object.                                                     |
| [List memberOf](../api/group-list-memberof.md)                                     | [directoryObject](../resources/-directoryobject.md)     | Get the directoryObject objects from a memberOf navigation property.                 |
| [Add memberOf](../api/group-post-memberof.md)                                      | [directoryObject](../resources/-directoryobject.md)     | Add directoryObject by posting to the directoryObject collection.                    |
| [Get memberOf](../api/group-get-memberof.md)                                       | [directoryObject](../resources/-directoryobject.md)     | Read the properties and relationships of a directoryObject object.                   |
| [Update memberOf](../api/group-update-memberof.md)                                 | [directoryObject](../resources/-directoryobject.md)     | Update the properties of a directoryObject object.                                   |
| [Remove memberOf](../api/group-delete-memberof.md)                                 |                                                         | Remove a directoryObject object.                                                     |
| [List members](../api/group-list-members.md)                                       | [directoryObject](../resources/-directoryobject.md)     | Get the directoryObject objects from a members navigation property.                  |
| [Add members](../api/group-post-members.md)                                        | [directoryObject](../resources/-directoryobject.md)     | Add directoryObject by posting to the directoryObject collection.                    |
| [Get members](../api/group-get-members.md)                                         | [directoryObject](../resources/-directoryobject.md)     | Read the properties and relationships of a directoryObject object.                   |
| [Update members](../api/group-update-members.md)                                   | [directoryObject](../resources/-directoryobject.md)     | Update the properties of a directoryObject object.                                   |
| [Remove members](../api/group-delete-members.md)                                   |                                                         | Remove a directoryObject object.                                                     |
| [List membersWithLicenseErrors](../api/group-list-memberswithlicenseerrors.md)     | [directoryObject](../resources/-directoryobject.md)     | Get the directoryObject objects from a membersWithLicenseErrors navigation property. |
| [Add membersWithLicenseErrors](../api/group-post-memberswithlicenseerrors.md)      | [directoryObject](../resources/-directoryobject.md)     | Add directoryObject by posting to the directoryObject collection.                    |
| [Get membersWithLicenseErrors](../api/group-get-memberswithlicenseerrors.md)       | [directoryObject](../resources/-directoryobject.md)     | Read the properties and relationships of a directoryObject object.                   |
| [Update membersWithLicenseErrors](../api/group-update-memberswithlicenseerrors.md) | [directoryObject](../resources/-directoryobject.md)     | Update the properties of a directoryObject object.                                   |
| [Remove membersWithLicenseErrors](../api/group-delete-memberswithlicenseerrors.md) |                                                         | Remove a directoryObject object.                                                     |
| [List owners](../api/group-list-owners.md)                                         | [directoryObject](../resources/-directoryobject.md)     | Get the directoryObject objects from an owners navigation property.                  |
| [Add owners](../api/group-post-owners.md)                                          | [directoryObject](../resources/-directoryobject.md)     | Add directoryObject by posting to the directoryObject collection.                    |
| [Get owners](../api/group-get-owners.md)                                           | [directoryObject](../resources/-directoryobject.md)     | Read the properties and relationships of a directoryObject object.                   |
| [Update owners](../api/group-update-owners.md)                                     | [directoryObject](../resources/-directoryobject.md)     | Update the properties of a directoryObject object.                                   |
| [Remove owners](../api/group-delete-owners.md)                                     |                                                         | Remove a directoryObject object.                                                     |
| [List settings](../api/group-list-settings.md)                                     | [groupSetting](../resources/-groupsetting.md)           | Get the groupSetting objects from a settings navigation property.                    |
| [Create settings](../api/group-post-settings.md)                                   | [groupSetting](../resources/-groupsetting.md)           | Create a new groupSetting object.                                                    |
| [Get settings](../api/group-get-settings.md)                                       | [groupSetting](../resources/-groupsetting.md)           | Read the properties and relationships of a groupSetting object.                      |
| [Update settings](../api/group-update-settings.md)                                 | [groupSetting](../resources/-groupsetting.md)           | Update the properties of a groupSetting object.                                      |
| [Delete settings](../api/group-delete-settings.md)                                 |                                                         | Delete a groupSetting object.                                                        |
| [List transitiveMemberOf](../api/group-list-transitivememberof.md)                 | [directoryObject](../resources/-directoryobject.md)     | Get the directoryObject objects from a transitiveMemberOf navigation property.       |
| [Add transitiveMemberOf](../api/group-post-transitivememberof.md)                  | [directoryObject](../resources/-directoryobject.md)     | Add directoryObject by posting to the directoryObject collection.                    |
| [Get transitiveMemberOf](../api/group-get-transitivememberof.md)                   | [directoryObject](../resources/-directoryobject.md)     | Read the properties and relationships of a directoryObject object.                   |
| [Update transitiveMemberOf](../api/group-update-transitivememberof.md)             | [directoryObject](../resources/-directoryobject.md)     | Update the properties of a directoryObject object.                                   |
| [Remove transitiveMemberOf](../api/group-delete-transitivememberof.md)             |                                                         | Remove a directoryObject object.                                                     |
| [List transitiveMembers](../api/group-list-transitivemembers.md)                   | [directoryObject](../resources/-directoryobject.md)     | Get the directoryObject objects from a transitiveMembers navigation property.        |
| [Add transitiveMembers](../api/group-post-transitivemembers.md)                    | [directoryObject](../resources/-directoryobject.md)     | Add directoryObject by posting to the directoryObject collection.                    |
| [Get transitiveMembers](../api/group-get-transitivemembers.md)                     | [directoryObject](../resources/-directoryobject.md)     | Read the properties and relationships of a directoryObject object.                   |
| [Update transitiveMembers](../api/group-update-transitivemembers.md)               | [directoryObject](../resources/-directoryobject.md)     | Update the properties of a directoryObject object.                                   |
| [Remove transitiveMembers](../api/group-delete-transitivemembers.md)               |                                                         | Remove a directoryObject object.                                                     |

## Properties

| Property                      | Type                                                                                  | Description |
| :---------------------------- | :------------------------------------------------------------------------------------ | :---------- |
| assignedLabels                | [assignedLabel](../resources/assignedlabel.md) collection                             |             |
| assignedLicenses              | [assignedLicense](../resources/assignedlicense.md) collection                         |             |
| classification                | String                                                                                |             |
| createdDateTime               | DateTimeOffset                                                                        |             |
| deletedDateTime               | DateTimeOffset                                                                        |             |
| description                   | String                                                                                |             |
| displayName                   | String                                                                                |             |
| expirationDateTime            | DateTimeOffset                                                                        |             |
| groupTypes                    | String collection                                                                     |             |
| hasMembersWithLicenseErrors   | Boolean                                                                               |             |
| id                            | String                                                                                | Read-only.  |
| licenseProcessingState        | [licenseProcessingState](../resources/licenseprocessingstate.md)                      |             |
| mail                          | String                                                                                |             |
| mailEnabled                   | Boolean                                                                               |             |
| mailNickname                  | String                                                                                |             |
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
| securityEnabled               | Boolean                                                                               |             |
| securityIdentifier            | String                                                                                |             |
| theme                         | String                                                                                |             |
| visibility                    | String                                                                                |             |

## Relationships

| Relationship             | Type                                                              | Description |
| :----------------------- | :---------------------------------------------------------------- | :---------- |
| appRoleAssignments       | [appRoleAssignment](../resources/approleassignment.md) collection |             |
| createdOnBehalfOf        | [directoryObject](../resources/directoryobject.md)                |             |
| memberOf                 | [directoryObject](../resources/directoryobject.md) collection     |             |
| members                  | [directoryObject](../resources/directoryobject.md) collection     |             |
| membersWithLicenseErrors | [directoryObject](../resources/directoryobject.md) collection     |             |
| owners                   | [directoryObject](../resources/directoryobject.md) collection     |             |
| settings                 | [groupSetting](../resources/groupsetting.md) collection           |             |
| transitiveMemberOf       | [directoryObject](../resources/directoryobject.md) collection     |             |
| transitiveMembers        | [directoryObject](../resources/directoryobject.md) collection     |             |

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
  "createdDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "expirationDateTime": "DateTimeOffset",
  "groupTypes": ["String"],
  "hasMembersWithLicenseErrors": "Boolean",
  "id": "String (identifier)",
  "licenseProcessingState": {"@odata.type": "microsoft.graph.licenseProcessingState"},
  "mail": "String",
  "mailEnabled": "Boolean",
  "mailNickname": "String",
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
  "securityEnabled": "Boolean",
  "securityIdentifier": "String",
  "theme": "String",
  "visibility": "String"
}
```
