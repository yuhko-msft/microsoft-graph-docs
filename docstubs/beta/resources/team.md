---
title: "team resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# team resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                        | Return Type                                                   | Description                                                                     |
| :------------------------------------------------------------ | :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [List team](../api/team-list.md)                              | [team](team.md) collection                                    | List properties and relationships of a team object.                             |
| [Create team](../api/team-create.md)                          | [team](team.md)                                               | Create a new team object.                                                       |
| [Get team](../api/team-get.md)                                | [team](team.md)                                               | Read properties and relationships of a team object.                             |
| [Update team](../api/team-update.md)                          | [team](team.md)                                               | Update the properties of a team object.                                         |
| [Delete team](../api/team-delete.md)                          |                                                               | Delete a team object.                                                           |
| [List channels](../api/team-list-channels.md)                 | [channel](../resources/-channel.md)                           | Get the channel objects from a channels navigation property.                    |
| [Create channels](../api/team-post-channels.md)               | [channel](../resources/-channel.md)                           | Create a new channel object.                                                    |
| [Get channels](../api/team-get-channels.md)                   | [channel](../resources/-channel.md)                           | Read the properties and relationships of a channel object.                      |
| [Update channels](../api/team-update-channels.md)             | [channel](../resources/-channel.md)                           | Update the properties of a channel object.                                      |
| [Delete channels](../api/team-delete-channels.md)             |                                                               | Delete a channel object.                                                        |
| [List group](../api/team-list-group.md)                       | [group](../resources/-group.md)                               | Get the group objects from a group navigation property.                         |
| [Add group](../api/team-post-group.md)                        | [group](../resources/-group.md)                               | Add group by posting to the group collection.                                   |
| [Get group](../api/team-get-group.md)                         | [group](../resources/-group.md)                               | Read the properties and relationships of a group object.                        |
| [Update group](../api/team-update-group.md)                   | [group](../resources/-group.md)                               | Update the properties of a group object.                                        |
| [Remove group](../api/team-delete-group.md)                   |                                                               | Remove a group object.                                                          |
| [List installedApps](../api/team-list-installedapps.md)       | [teamsAppInstallation](../resources/-teamsappinstallation.md) | Get the teamsAppInstallation objects from an installedApps navigation property. |
| [Create installedApps](../api/team-post-installedapps.md)     | [teamsAppInstallation](../resources/-teamsappinstallation.md) | Create a new teamsAppInstallation object.                                       |
| [Get installedApps](../api/team-get-installedapps.md)         | [teamsAppInstallation](../resources/-teamsappinstallation.md) | Read the properties and relationships of a teamsAppInstallation object.         |
| [Update installedApps](../api/team-update-installedapps.md)   | [teamsAppInstallation](../resources/-teamsappinstallation.md) | Update the properties of a teamsAppInstallation object.                         |
| [Delete installedApps](../api/team-delete-installedapps.md)   |                                                               | Delete a teamsAppInstallation object.                                           |
| [List members](../api/team-list-members.md)                   | [conversationMember](../resources/-conversationmember.md)     | Get the conversationMember objects from a members navigation property.          |
| [Create members](../api/team-post-members.md)                 | [conversationMember](../resources/-conversationmember.md)     | Create a new conversationMember object.                                         |
| [Get members](../api/team-get-members.md)                     | [conversationMember](../resources/-conversationmember.md)     | Read the properties and relationships of a conversationMember object.           |
| [Update members](../api/team-update-members.md)               | [conversationMember](../resources/-conversationmember.md)     | Update the properties of a conversationMember object.                           |
| [Delete members](../api/team-delete-members.md)               |                                                               | Delete a conversationMember object.                                             |
| [List operations](../api/team-list-operations.md)             | [teamsAsyncOperation](../resources/-teamsasyncoperation.md)   | Get the teamsAsyncOperation objects from an operations navigation property.     |
| [Create operations](../api/team-post-operations.md)           | [teamsAsyncOperation](../resources/-teamsasyncoperation.md)   | Create a new teamsAsyncOperation object.                                        |
| [Get operations](../api/team-get-operations.md)               | [teamsAsyncOperation](../resources/-teamsasyncoperation.md)   | Read the properties and relationships of a teamsAsyncOperation object.          |
| [Update operations](../api/team-update-operations.md)         | [teamsAsyncOperation](../resources/-teamsasyncoperation.md)   | Update the properties of a teamsAsyncOperation object.                          |
| [Delete operations](../api/team-delete-operations.md)         |                                                               | Delete a teamsAsyncOperation object.                                            |
| [List owners](../api/team-list-owners.md)                     | [user](../resources/-user.md)                                 | Get the user objects from an owners navigation property.                        |
| [Add owners](../api/team-post-owners.md)                      | [user](../resources/-user.md)                                 | Add user by posting to the user collection.                                     |
| [Get owners](../api/team-get-owners.md)                       | [user](../resources/-user.md)                                 | Read the properties and relationships of a user object.                         |
| [Update owners](../api/team-update-owners.md)                 | [user](../resources/-user.md)                                 | Update the properties of a user object.                                         |
| [Remove owners](../api/team-delete-owners.md)                 |                                                               | Remove a user object.                                                           |
| [List photo](../api/team-list-photo.md)                       | [profilePhoto](../resources/-profilephoto.md)                 | Get the profilePhoto objects from a photo navigation property.                  |
| [Create photo](../api/team-post-photo.md)                     | [profilePhoto](../resources/-profilephoto.md)                 | Create a new profilePhoto object.                                               |
| [Get photo](../api/team-get-photo.md)                         | [profilePhoto](../resources/-profilephoto.md)                 | Read the properties and relationships of a profilePhoto object.                 |
| [Update photo](../api/team-update-photo.md)                   | [profilePhoto](../resources/-profilephoto.md)                 | Update the properties of a profilePhoto object.                                 |
| [Delete photo](../api/team-delete-photo.md)                   |                                                               | Delete a profilePhoto object.                                                   |
| [List primaryChannel](../api/team-list-primarychannel.md)     | [channel](../resources/-channel.md)                           | Get the channel objects from a primaryChannel navigation property.              |
| [Create primaryChannel](../api/team-post-primarychannel.md)   | [channel](../resources/-channel.md)                           | Create a new channel object.                                                    |
| [Get primaryChannel](../api/team-get-primarychannel.md)       | [channel](../resources/-channel.md)                           | Read the properties and relationships of a channel object.                      |
| [Update primaryChannel](../api/team-update-primarychannel.md) | [channel](../resources/-channel.md)                           | Update the properties of a channel object.                                      |
| [Delete primaryChannel](../api/team-delete-primarychannel.md) |                                                               | Delete a channel object.                                                        |
| [List template](../api/team-list-template.md)                 | [teamsTemplate](../resources/-teamstemplate.md)               | Get the teamsTemplate objects from a template navigation property.              |
| [Add template](../api/team-post-template.md)                  | [teamsTemplate](../resources/-teamstemplate.md)               | Add teamsTemplate by posting to the teamsTemplate collection.                   |
| [Get template](../api/team-get-template.md)                   | [teamsTemplate](../resources/-teamstemplate.md)               | Read the properties and relationships of a teamsTemplate object.                |
| [Update template](../api/team-update-template.md)             | [teamsTemplate](../resources/-teamstemplate.md)               | Update the properties of a teamsTemplate object.                                |
| [Remove template](../api/team-delete-template.md)             |                                                               | Remove a teamsTemplate object.                                                  |

## Properties

| Property                    | Type                                                           | Description |
| :-------------------------- | :------------------------------------------------------------- | :---------- |
| classification              | String                                                         |             |
| createdDateTime             | DateTimeOffset                                                 |             |
| description                 | String                                                         |             |
| discoverySettings           | [teamDiscoverySettings](../resources/teamdiscoverysettings.md) |             |
| displayName                 | String                                                         |             |
| funSettings                 | [teamFunSettings](../resources/teamfunsettings.md)             |             |
| guestSettings               | [teamGuestSettings](../resources/teamguestsettings.md)         |             |
| id                          | String                                                         | Read-only.  |
| internalId                  | String                                                         |             |
| isArchived                  | Boolean                                                        |             |
| isMembershipLimitedToOwners | Boolean                                                        |             |
| memberSettings              | [teamMemberSettings](../resources/teammembersettings.md)       |             |
| messagingSettings           | [teamMessagingSettings](../resources/teammessagingsettings.md) |             |
| specialization              | String                                                         |             |
| visibility                  | String                                                         |             |
| webUrl                      | String                                                         |             |

## Relationships

| Relationship   | Type                                                                    | Description |
| :------------- | :---------------------------------------------------------------------- | :---------- |
| channels       | [channel](../resources/channel.md) collection                           |             |
| group          | [group](../resources/group.md)                                          |             |
| installedApps  | [teamsAppInstallation](../resources/teamsappinstallation.md) collection |             |
| members        | [conversationMember](../resources/conversationmember.md) collection     |             |
| operations     | [teamsAsyncOperation](../resources/teamsasyncoperation.md) collection   |             |
| owners         | [user](../resources/user.md) collection                                 |             |
| photo          | [profilePhoto](../resources/profilephoto.md)                            |             |
| primaryChannel | [channel](../resources/channel.md)                                      |             |
| template       | [teamsTemplate](../resources/teamstemplate.md)                          |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.team",
  "baseType": "microsoft.graph.entity",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.team",
  "classification": "String",
  "createdDateTime": "DateTimeOffset",
  "description": "String",
  "discoverySettings": {"@odata.type": "microsoft.graph.teamDiscoverySettings"},
  "displayName": "String",
  "funSettings": {"@odata.type": "microsoft.graph.teamFunSettings"},
  "guestSettings": {"@odata.type": "microsoft.graph.teamGuestSettings"},
  "id": "String (identifier)",
  "internalId": "String",
  "isArchived": "Boolean",
  "isMembershipLimitedToOwners": "Boolean",
  "memberSettings": {"@odata.type": "microsoft.graph.teamMemberSettings"},
  "messagingSettings": {"@odata.type": "microsoft.graph.teamMessagingSettings"},
  "specialization": "none | educationStandard | educationClass | educationProfessionalLearningCommunity | educationStaff | healthcareStandard | healthcareCareCoordination | unknownFutureValue",
  "visibility": "private | public | hiddenMembership | unknownFutureValue",
  "webUrl": "String"
}
```
