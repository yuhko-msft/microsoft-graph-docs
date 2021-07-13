---
title: "group resource type"
description: "Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory entity types."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# group resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory entity types.


Inherits from [directoryObject](../resources/directoryobject.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groups](../api/group-list.md)|[group](../resources/group.md) collection|Get a list of the [group](../resources/group.md) objects and their properties.|
|[Create group](../api/group-post-groups.md)|[group](../resources/group.md)|Create a new [group](../resources/group.md) object.|
|[Get group](../api/group-get.md)|[group](../resources/group.md)|Read the properties and relationships of a [group](../resources/group.md) object.|
|[Update group](../api/group-update.md)|[group](../resources/group.md)|Update the properties of a [group](../resources/group.md) object.|
|[Delete group](../api/group-delete.md)|None|Deletes a [group](../resources/group.md) object.|
|[assignLicense](../api/group-assignlicense.md)|[group](../resources/group.md)|**TODO: Add Description**|
|[checkGrantedPermissionsForApp](../api/group-checkgrantedpermissionsforapp.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) collection|**TODO: Add Description**|
|[validateProperties](../api/group-validateproperties.md)|None|**TODO: Add Description**|
|[addFavorite](../api/group-addfavorite.md)|None|**TODO: Add Description**|
|[removeFavorite](../api/group-removefavorite.md)|None|**TODO: Add Description**|
|[resetUnseenCount](../api/group-resetunseencount.md)|None|**TODO: Add Description**|
|[subscribeByMail](../api/group-subscribebymail.md)|None|**TODO: Add Description**|
|[unsubscribeByMail](../api/group-unsubscribebymail.md)|None|**TODO: Add Description**|
|[evaluateDynamicMembership](../api/group-evaluatedynamicmembership.md)|[evaluateDynamicMembershipResult](../resources/evaluatedynamicmembershipresult.md)|**TODO: Add Description**|
|[evaluateDynamicMembership](../api/group-evaluatedynamicmembership.md)|[evaluateDynamicMembershipResult](../resources/evaluatedynamicmembershipresult.md)|**TODO: Add Description**|
|[renew](../api/group-renew.md)|None|**TODO: Add Description**|
|[checkMemberGroups](../api/group-checkmembergroups.md)|String collection|**TODO: Add Description**|
|[checkMemberObjects](../api/group-checkmemberobjects.md)|String collection|**TODO: Add Description**|
|[getMemberGroups](../api/group-getmembergroups.md)|String collection|**TODO: Add Description**|
|[getMemberObjects](../api/group-getmemberobjects.md)|String collection|**TODO: Add Description**|
|[restore](../api/group-restore.md)|[directoryObject](../resources/directoryobject.md)|**TODO: Add Description**|
|[delta](../api/group-delta.md)|[group](../resources/group.md) collection|**TODO: Add Description**|
|[List acceptedSenders](../api/group-list-acceptedsenders.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the acceptedSenders navigation property.|
|[Create acceptedSenders](../api/group-post-acceptedsenders.md)|[directoryObject](../resources/directoryobject.md)|Create a new directoryObject object.|
|[List appRoleAssignments](../api/group-list-approleassignments.md)|[appRoleAssignment](../resources/approleassignment.md) collection|Get the appRoleAssignment resources from the appRoleAssignments navigation property.|
|[Create appRoleAssignment](../api/group-post-approleassignments.md)|[appRoleAssignment](../resources/approleassignment.md)|Create a new appRoleAssignment object.|
|[List calendar](../api/group-list-calendar.md)|[calendar](../resources/calendar.md) collection|Get the calendar resources from the calendar navigation property.|
|[Create calendar](../api/group-post-calendar.md)|[calendar](../resources/calendar.md)|Create a new calendar object.|
|[List calendarView](../api/group-list-calendarview.md)|[event](../resources/event.md) collection|Get the event resources from the calendarView navigation property.|
|[Create event](../api/group-post-calendarview.md)|[event](../resources/event.md)|Create a new event object.|
|[List conversations](../api/group-list-conversations.md)|[conversation](../resources/conversation.md) collection|Get the conversation resources from the conversations navigation property.|
|[Create conversation](../api/group-post-conversations.md)|[conversation](../resources/conversation.md)|Create a new conversation object.|
|[List createdOnBehalfOf](../api/group-list-createdonbehalfof.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the createdOnBehalfOf navigation property.|
|[Add createdOnBehalfOf](../api/group-post-createdonbehalfof.md)|[directoryObject](../resources/directoryobject.md)|Add createdOnBehalfOf by posting to the createdOnBehalfOf collection.|
|[List drive](../api/group-list-drive.md)|[drive](../resources/drive.md) collection|Get the drive resources from the drive navigation property.|
|[Create drive](../api/group-post-drive.md)|[drive](../resources/drive.md)|Create a new drive object.|
|[List drives](../api/group-list-drives.md)|[drive](../resources/drive.md) collection|Get the drive resources from the drives navigation property.|
|[Create drive](../api/group-post-drives.md)|[drive](../resources/drive.md)|Create a new drive object.|
|[List endpoints](../api/group-list-endpoints.md)|[endpoint](../resources/endpoint.md) collection|Get the endpoint resources from the endpoints navigation property.|
|[Create endpoint](../api/group-post-endpoints.md)|[endpoint](../resources/endpoint.md)|Create a new endpoint object.|
|[List events](../api/group-list-events.md)|[event](../resources/event.md) collection|Get the event resources from the events navigation property.|
|[Create event](../api/group-post-events.md)|[event](../resources/event.md)|Create a new event object.|
|[List extensions](../api/group-list-extensions.md)|[extension](../resources/extension.md) collection|Get the extension resources from the extensions navigation property.|
|[Create extension](../api/group-post-extensions.md)|[extension](../resources/extension.md)|Create a new extension object.|
|[List groupLifecyclePolicies](../api/group-list-grouplifecyclepolicies.md)|[groupLifecyclePolicy](../resources/grouplifecyclepolicy.md) collection|Get the groupLifecyclePolicy resources from the groupLifecyclePolicies navigation property.|
|[Create groupLifecyclePolicy](../api/group-post-grouplifecyclepolicies.md)|[groupLifecyclePolicy](../resources/grouplifecyclepolicy.md)|Create a new groupLifecyclePolicy object.|
|[List memberOf](../api/group-list-memberof.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the memberOf navigation property.|
|[Add memberOf](../api/group-post-memberof.md)|[directoryObject](../resources/directoryobject.md)|Add memberOf by posting to the memberOf collection.|
|[List members](../api/group-list-members.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the members navigation property.|
|[Add members](../api/group-post-members.md)|[directoryObject](../resources/directoryobject.md)|Add members by posting to the members collection.|
|[List membersWithLicenseErrors](../api/group-list-memberswithlicenseerrors.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the membersWithLicenseErrors navigation property.|
|[Add membersWithLicenseErrors](../api/group-post-memberswithlicenseerrors.md)|[directoryObject](../resources/directoryobject.md)|Add membersWithLicenseErrors by posting to the membersWithLicenseErrors collection.|
|[List onenote](../api/group-list-onenote.md)|[onenote](../resources/onenote.md) collection|Get the onenote resources from the onenote navigation property.|
|[Create onenote](../api/group-post-onenote.md)|[onenote](../resources/onenote.md)|Create a new onenote object.|
|[List owners](../api/group-list-owners.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the owners navigation property.|
|[Add owners](../api/group-post-owners.md)|[directoryObject](../resources/directoryobject.md)|Add owners by posting to the owners collection.|
|[List permissionGrants](../api/group-list-permissiongrants.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) collection|Get the resourceSpecificPermissionGrant resources from the permissionGrants navigation property.|
|[Create resourceSpecificPermissionGrant](../api/group-post-permissiongrants.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md)|Create a new resourceSpecificPermissionGrant object.|
|[List profilePhoto](../api/group-list-photo.md)|[profilePhoto](../resources/profilephoto.md) collection|Get the profilePhoto resources from the photo navigation property.|
|[Create profilePhoto](../api/group-post-photo.md)|[profilePhoto](../resources/profilephoto.md)|Create a new profilePhoto object.|
|[List photos](../api/group-list-photos.md)|[profilePhoto](../resources/profilephoto.md) collection|Get the profilePhoto resources from the photos navigation property.|
|[Create profilePhoto](../api/group-post-photos.md)|[profilePhoto](../resources/profilephoto.md)|Create a new profilePhoto object.|
|[List plannerGroup](../api/group-list-planner.md)|[plannerGroup](../resources/plannergroup.md) collection|Get the plannerGroup resources from the planner navigation property.|
|[Create plannerGroup](../api/group-post-planner.md)|[plannerGroup](../resources/plannergroup.md)|Create a new plannerGroup object.|
|[List rejectedSenders](../api/group-list-rejectedsenders.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the rejectedSenders navigation property.|
|[Create rejectedSenders](../api/group-post-rejectedsenders.md)|[directoryObject](../resources/directoryobject.md)|Create a new directoryObject object.|
|[List settings](../api/group-list-settings.md)|[directorySetting](../resources/directorysetting.md) collection|Get the directorySetting resources from the settings navigation property.|
|[Create directorySetting](../api/group-post-settings.md)|[directorySetting](../resources/directorysetting.md)|Create a new directorySetting object.|
|[List sites](../api/group-list-sites.md)|[site](../resources/site.md) collection|Get the site resources from the sites navigation property.|
|[Create site](../api/group-post-sites.md)|[site](../resources/site.md)|Create a new site object.|
|[List team](../api/group-list-team.md)|[team](../resources/team.md) collection|Get the team resources from the team navigation property.|
|[Create team](../api/group-post-team.md)|[team](../resources/team.md)|Create a new team object.|
|[List threads](../api/group-list-threads.md)|[conversationThread](../resources/conversationthread.md) collection|Get the conversationThread resources from the threads navigation property.|
|[Create conversationThread](../api/group-post-threads.md)|[conversationThread](../resources/conversationthread.md)|Create a new conversationThread object.|
|[List transitiveMemberOf](../api/group-list-transitivememberof.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the transitiveMemberOf navigation property.|
|[Add transitiveMemberOf](../api/group-post-transitivememberof.md)|[directoryObject](../resources/directoryobject.md)|Add transitiveMemberOf by posting to the transitiveMemberOf collection.|
|[List transitiveMembers](../api/group-list-transitivemembers.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the transitiveMembers navigation property.|
|[Add transitiveMembers](../api/group-post-transitivemembers.md)|[directoryObject](../resources/directoryobject.md)|Add transitiveMembers by posting to the transitiveMembers collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessType|groupAccessType|**TODO: Add Description**. Possible values are: `none`, `private`, `secret`, `public`.|
|allowExternalSenders|Boolean|**TODO: Add Description**|
|assignedLabels|[assignedLabel](../resources/assignedlabel.md) collection|**TODO: Add Description**|
|assignedLicenses|[assignedLicense](../resources/assignedlicense.md) collection|**TODO: Add Description**|
|autoSubscribeNewMembers|Boolean|**TODO: Add Description**|
|classification|String|**TODO: Add Description**|
|createdByAppId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md).|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|groupTypes|String collection|**TODO: Add Description**|
|hasMembersWithLicenseErrors|Boolean|**TODO: Add Description**|
|hideFromAddressLists|Boolean|**TODO: Add Description**|
|hideFromOutlookClients|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|infoCatalogs|String collection|**TODO: Add Description**|
|isArchived|Boolean|**TODO: Add Description**|
|isAssignableToRole|Boolean|**TODO: Add Description**|
|isFavorite|Boolean|**TODO: Add Description**|
|isSubscribedByMail|Boolean|**TODO: Add Description**|
|licenseProcessingState|[licenseProcessingState](../resources/licenseprocessingstate.md)|**TODO: Add Description**|
|mail|String|**TODO: Add Description**|
|mailEnabled|Boolean|**TODO: Add Description**|
|mailNickname|String|**TODO: Add Description**|
|mdmAppId|String|**TODO: Add Description**|
|membershipRule|String|**TODO: Add Description**|
|membershipRuleProcessingState|String|**TODO: Add Description**|
|membershipRuleProcessingStatus|[membershipRuleProcessingStatus](../resources/membershipruleprocessingstatus.md)|**TODO: Add Description**|
|onPremisesDomainName|String|**TODO: Add Description**|
|onPremisesLastSyncDateTime|DateTimeOffset|**TODO: Add Description**|
|onPremisesNetBiosName|String|**TODO: Add Description**|
|onPremisesProvisioningErrors|[onPremisesProvisioningError](../resources/onpremisesprovisioningerror.md) collection|**TODO: Add Description**|
|onPremisesSamAccountName|String|**TODO: Add Description**|
|onPremisesSecurityIdentifier|String|**TODO: Add Description**|
|onPremisesSyncEnabled|Boolean|**TODO: Add Description**|
|preferredDataLocation|String|**TODO: Add Description**|
|preferredLanguage|String|**TODO: Add Description**|
|proxyAddresses|String collection|**TODO: Add Description**|
|renewedDateTime|DateTimeOffset|**TODO: Add Description**|
|resourceBehaviorOptions|String collection|**TODO: Add Description**|
|resourceProvisioningOptions|String collection|**TODO: Add Description**|
|securityEnabled|Boolean|**TODO: Add Description**|
|securityIdentifier|String|**TODO: Add Description**|
|theme|String|**TODO: Add Description**|
|unseenConversationsCount|Int32|**TODO: Add Description**|
|unseenCount|Int32|**TODO: Add Description**|
|unseenMessagesCount|Int32|**TODO: Add Description**|
|visibility|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|acceptedSenders|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|appRoleAssignments|[appRoleAssignment](../resources/approleassignment.md) collection|**TODO: Add Description**|
|calendar|[calendar](../resources/calendar.md)|**TODO: Add Description**|
|calendarView|[event](../resources/event.md) collection|**TODO: Add Description**|
|conversations|[conversation](../resources/conversation.md) collection|**TODO: Add Description**|
|createdOnBehalfOf|[directoryObject](../resources/directoryobject.md)|**TODO: Add Description**|
|drive|[drive](../resources/drive.md)|**TODO: Add Description**|
|drives|[drive](../resources/drive.md) collection|**TODO: Add Description**|
|endpoints|[endpoint](../resources/endpoint.md) collection|**TODO: Add Description**|
|events|[event](../resources/event.md) collection|**TODO: Add Description**|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description**|
|groupLifecyclePolicies|[groupLifecyclePolicy](../resources/grouplifecyclepolicy.md) collection|**TODO: Add Description**|
|memberOf|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|members|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|membersWithLicenseErrors|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|onenote|[onenote](../resources/onenote.md)|**TODO: Add Description**|
|owners|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|permissionGrants|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) collection|**TODO: Add Description**|
|photo|[profilePhoto](../resources/profilephoto.md)|**TODO: Add Description**|
|photos|[profilePhoto](../resources/profilephoto.md) collection|**TODO: Add Description**|
|planner|[plannerGroup](../resources/plannergroup.md)|**TODO: Add Description**|
|rejectedSenders|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|settings|[directorySetting](../resources/directorysetting.md) collection|**TODO: Add Description**|
|sites|[site](../resources/site.md) collection|**TODO: Add Description**|
|team|[team](../resources/team.md)|**TODO: Add Description**|
|threads|[conversationThread](../resources/conversationthread.md) collection|**TODO: Add Description**|
|transitiveMemberOf|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|transitiveMembers|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.group",
  "baseType": "microsoft.graph.directoryObject",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.group",
  "id": "String (identifier)",
  "deletedDateTime": "String (timestamp)",
  "assignedLabels": [
    {
      "@odata.type": "microsoft.graph.assignedLabel"
    }
  ],
  "assignedLicenses": [
    {
      "@odata.type": "microsoft.graph.assignedLicense"
    }
  ],
  "classification": "String",
  "createdByAppId": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "expirationDateTime": "String (timestamp)",
  "groupTypes": [
    "String"
  ],
  "hasMembersWithLicenseErrors": "Boolean",
  "infoCatalogs": [
    "String"
  ],
  "isAssignableToRole": "Boolean",
  "licenseProcessingState": {
    "@odata.type": "microsoft.graph.licenseProcessingState"
  },
  "mail": "String",
  "mailEnabled": "Boolean",
  "mailNickname": "String",
  "mdmAppId": "String",
  "membershipRule": "String",
  "membershipRuleProcessingState": "String",
  "onPremisesDomainName": "String",
  "onPremisesLastSyncDateTime": "String (timestamp)",
  "onPremisesNetBiosName": "String",
  "onPremisesProvisioningErrors": [
    {
      "@odata.type": "microsoft.graph.onPremisesProvisioningError"
    }
  ],
  "onPremisesSamAccountName": "String",
  "onPremisesSecurityIdentifier": "String",
  "onPremisesSyncEnabled": "Boolean",
  "preferredDataLocation": "String",
  "preferredLanguage": "String",
  "proxyAddresses": [
    "String"
  ],
  "renewedDateTime": "String (timestamp)",
  "resourceBehaviorOptions": [
    "String"
  ],
  "resourceProvisioningOptions": [
    "String"
  ],
  "securityEnabled": "Boolean",
  "securityIdentifier": "String",
  "theme": "String",
  "visibility": "String",
  "accessType": "String",
  "allowExternalSenders": "Boolean",
  "autoSubscribeNewMembers": "Boolean",
  "hideFromAddressLists": "Boolean",
  "hideFromOutlookClients": "Boolean",
  "isFavorite": "Boolean",
  "isSubscribedByMail": "Boolean",
  "unseenConversationsCount": "Integer",
  "unseenCount": "Integer",
  "unseenMessagesCount": "Integer",
  "membershipRuleProcessingStatus": {
    "@odata.type": "microsoft.graph.membershipRuleProcessingStatus"
  },
  "isArchived": "Boolean"
}
```

