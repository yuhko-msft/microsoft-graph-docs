---
title: "team resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# team resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teams](../api/team-list.md)|[team](../resources/team.md) collection|Get a list of the [team](../resources/team.md) objects and their properties.|
|[Create team](../api/team-post-teams.md)|[team](../resources/team.md)|Create a new [team](../resources/team.md) object.|
|[Get team](../api/team-get.md)|[team](../resources/team.md)|Read the properties and relationships of a [team](../resources/team.md) object.|
|[Update team](../api/team-update.md)|[team](../resources/team.md)|Update the properties of a [team](../resources/team.md) object.|
|[Delete team](../api/team-delete.md)|None|Deletes a [team](../resources/team.md) object.|
|[clone](../api/team-clone.md)|None|**TODO: Add Description**|
|[archive](../api/team-archive.md)|None|**TODO: Add Description**|
|[unarchive](../api/team-unarchive.md)|None|**TODO: Add Description**|
|[completeMigration](../api/team-completemigration.md)|None|**TODO: Add Description**|
|[sendActivityNotification](../api/team-sendactivitynotification.md)|None|**TODO: Add Description**|
|[allMessages](../api/team-allmessages.md)|[chatMessage](../resources/chatmessage.md) collection|**TODO: Add Description**|
|[getAllMessages](../api/team-getallmessages.md)|[chatMessage](../resources/chatmessage.md) collection|**TODO: Add Description**|
|[List channels](../api/team-list-channels.md)|[channel](../resources/channel.md) collection|Get the channel resources from the channels navigation property.|
|[Create channel](../api/team-post-channels.md)|[channel](../resources/channel.md)|Create a new channel object.|
|[List group](../api/team-list-group.md)|[group](../resources/group.md) collection|Get the group resources from the group navigation property.|
|[Add group](../api/team-post-group.md)|[group](../resources/group.md)|Add group by posting to the group collection.|
|[List installedApps](../api/team-list-installedapps.md)|[teamsAppInstallation](../resources/teamsappinstallation.md) collection|Get the teamsAppInstallation resources from the installedApps navigation property.|
|[Create teamsAppInstallation](../api/team-post-installedapps.md)|[teamsAppInstallation](../resources/teamsappinstallation.md)|Create a new teamsAppInstallation object.|
|[List members](../api/team-list-members.md)|[conversationMember](../resources/conversationmember.md) collection|Get the conversationMember resources from the members navigation property.|
|[Create conversationMember](../api/team-post-members.md)|[conversationMember](../resources/conversationmember.md)|Create a new conversationMember object.|
|[List operations](../api/team-list-operations.md)|[teamsAsyncOperation](../resources/teamsasyncoperation.md) collection|Get the teamsAsyncOperation resources from the operations navigation property.|
|[Create teamsAsyncOperation](../api/team-post-operations.md)|[teamsAsyncOperation](../resources/teamsasyncoperation.md)|Create a new teamsAsyncOperation object.|
|[List owners](../api/team-list-owners.md)|[user](../resources/user.md) collection|Get the user resources from the owners navigation property.|
|[Add user](../api/team-post-owners.md)|[user](../resources/user.md)|Add owners by posting to the owners collection.|
|[List permissionGrants](../api/team-list-permissiongrants.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) collection|Get the resourceSpecificPermissionGrant resources from the permissionGrants navigation property.|
|[Create resourceSpecificPermissionGrant](../api/team-post-permissiongrants.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md)|Create a new resourceSpecificPermissionGrant object.|
|[List profilePhoto](../api/team-list-photo.md)|[profilePhoto](../resources/profilephoto.md) collection|Get the profilePhoto resources from the photo navigation property.|
|[Create profilePhoto](../api/team-post-photo.md)|[profilePhoto](../resources/profilephoto.md)|Create a new profilePhoto object.|
|[List channel](../api/team-list-primarychannel.md)|[channel](../resources/channel.md) collection|Get the channel resources from the primaryChannel navigation property.|
|[Create channel](../api/team-post-primarychannel.md)|[channel](../resources/channel.md)|Create a new channel object.|
|[List schedule](../api/team-list-schedule.md)|[schedule](../resources/schedule.md) collection|Get the schedule resources from the schedule navigation property.|
|[Create schedule](../api/team-post-schedule.md)|[schedule](../resources/schedule.md)|Create a new schedule object.|
|[List tags](../api/team-list-tags.md)|[teamworkTag](../resources/teamworktag.md) collection|Get the teamworkTag resources from the tags navigation property.|
|[Create teamworkTag](../api/team-post-tags.md)|[teamworkTag](../resources/teamworktag.md)|Create a new teamworkTag object.|
|[List teamsTemplate](../api/team-list-template.md)|[teamsTemplate](../resources/teamstemplate.md) collection|Get the teamsTemplate resources from the template navigation property.|
|[Add teamsTemplate](../api/team-post-template.md)|[teamsTemplate](../resources/teamstemplate.md)|Add template by posting to the template collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|classification|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|discoverySettings|[teamDiscoverySettings](../resources/teamdiscoverysettings.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|funSettings|[teamFunSettings](../resources/teamfunsettings.md)|**TODO: Add Description**|
|guestSettings|[teamGuestSettings](../resources/teamguestsettings.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|internalId|String|**TODO: Add Description**|
|isArchived|Boolean|**TODO: Add Description**|
|isMembershipLimitedToOwners|Boolean|**TODO: Add Description**|
|memberSettings|[teamMemberSettings](../resources/teammembersettings.md)|**TODO: Add Description**|
|messagingSettings|[teamMessagingSettings](../resources/teammessagingsettings.md)|**TODO: Add Description**|
|specialization|teamSpecialization|**TODO: Add Description**. Possible values are: `none`, `educationStandard`, `educationClass`, `educationProfessionalLearningCommunity`, `educationStaff`, `healthcareStandard`, `healthcareCareCoordination`, `unknownFutureValue`.|
|visibility|teamVisibilityType|**TODO: Add Description**. Possible values are: `private`, `public`, `hiddenMembership`, `unknownFutureValue`.|
|webUrl|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|channels|[channel](../resources/channel.md) collection|**TODO: Add Description**|
|group|[group](../resources/group.md)|**TODO: Add Description**|
|installedApps|[teamsAppInstallation](../resources/teamsappinstallation.md) collection|**TODO: Add Description**|
|members|[conversationMember](../resources/conversationmember.md) collection|**TODO: Add Description**|
|operations|[teamsAsyncOperation](../resources/teamsasyncoperation.md) collection|**TODO: Add Description**|
|owners|[user](../resources/user.md) collection|**TODO: Add Description**|
|permissionGrants|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) collection|**TODO: Add Description**|
|photo|[profilePhoto](../resources/profilephoto.md)|**TODO: Add Description**|
|primaryChannel|[channel](../resources/channel.md)|**TODO: Add Description**|
|schedule|[schedule](../resources/schedule.md)|**TODO: Add Description**|
|tags|[teamworkTag](../resources/teamworktag.md) collection|**TODO: Add Description**|
|template|[teamsTemplate](../resources/teamstemplate.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.team",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.team",
  "id": "String (identifier)",
  "classification": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "discoverySettings": {
    "@odata.type": "microsoft.graph.teamDiscoverySettings"
  },
  "displayName": "String",
  "funSettings": {
    "@odata.type": "microsoft.graph.teamFunSettings"
  },
  "guestSettings": {
    "@odata.type": "microsoft.graph.teamGuestSettings"
  },
  "internalId": "String",
  "isArchived": "Boolean",
  "isMembershipLimitedToOwners": "Boolean",
  "memberSettings": {
    "@odata.type": "microsoft.graph.teamMemberSettings"
  },
  "messagingSettings": {
    "@odata.type": "microsoft.graph.teamMessagingSettings"
  },
  "specialization": "String",
  "visibility": "String",
  "webUrl": "String"
}
```

