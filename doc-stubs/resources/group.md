---
title: "group resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# group resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [directoryObject](../resources/directoryobject.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groups](../api/group-list.md)|[group](../resources/group.md) collection|Get a list of the [group](../resources/group.md) objects and their properties.|
|[Create group](../api/group-post-groups.md)|[group](../resources/group.md)|Create a new [group](../resources/group.md) object.|
|[Get group](../api/group-get.md)|[group](../resources/group.md)|Read the properties and relationships of a [group](../resources/group.md) object.|
|[Update group](../api/group-update.md)|[group](../resources/group.md)|Update the properties of a [group](../resources/group.md) object.|
|[Delete group](../api/group-delete.md)|None|Deletes a [group](../resources/group.md) object.|
|[checkGrantedPermissionsForApp](../api/group-checkgrantedpermissionsforapp.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) collection|**TODO: Add Description**|
|[List permissionGrants](../api/group-list-permissiongrants.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) collection|Get the resourceSpecificPermissionGrant resources from the permissionGrants navigation property.|
|[Create permissionGrants](../api/group-post-permissiongrants.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md)|Create a new resourceSpecificPermissionGrant object.|
|[Get permissionGrants](../api/group-get-resourcespecificpermissiongrant.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md)|Read the properties and relationships of a [resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) object.|
|[Update permissionGrants](../api/group-update-permissiongrants.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md)|Update the properties of a permissionGrants object.|
|[Delete permissionGrants](../api/group-delete-permissiongrants.md)|None|Delete a [resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowExternalSenders|Boolean|**TODO: Add Description**|
|assignedLabels|[assignedLabel](../resources/assignedlabel.md) collection|**TODO: Add Description**|
|assignedLicenses|[assignedLicense](../resources/assignedlicense.md) collection|**TODO: Add Description**|
|autoSubscribeNewMembers|Boolean|**TODO: Add Description**|
|classification|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|groupTypes|String collection|**TODO: Add Description**|
|hasMembersWithLicenseErrors|Boolean|**TODO: Add Description**|
|hideFromAddressLists|Boolean|**TODO: Add Description**|
|hideFromOutlookClients|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isArchived|Boolean|**TODO: Add Description**|
|isSubscribedByMail|Boolean|**TODO: Add Description**|
|licenseProcessingState|[licenseProcessingState](../resources/licenseprocessingstate.md)|**TODO: Add Description**|
|mail|String|**TODO: Add Description**|
|mailEnabled|Boolean|**TODO: Add Description**|
|mailNickname|String|**TODO: Add Description**|
|membershipRule|String|**TODO: Add Description**|
|membershipRuleProcessingState|String|**TODO: Add Description**|
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
|securityEnabled|Boolean|**TODO: Add Description**|
|securityIdentifier|String|**TODO: Add Description**|
|theme|String|**TODO: Add Description**|
|unseenCount|Int32|**TODO: Add Description**|
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
|settings|[groupSetting](../resources/groupsetting.md) collection|**TODO: Add Description**|
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
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "expirationDateTime": "String (timestamp)",
  "hasMembersWithLicenseErrors": "Boolean",
  "groupTypes": [
    "String"
  ],
  "licenseProcessingState": {
    "@odata.type": "microsoft.graph.licenseProcessingState"
  },
  "mail": "String",
  "mailEnabled": "Boolean",
  "mailNickname": "String",
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
  "securityEnabled": "Boolean",
  "securityIdentifier": "String",
  "theme": "String",
  "visibility": "String",
  "allowExternalSenders": "Boolean",
  "autoSubscribeNewMembers": "Boolean",
  "isSubscribedByMail": "Boolean",
  "unseenCount": "Integer",
  "hideFromOutlookClients": "Boolean",
  "hideFromAddressLists": "Boolean",
  "isArchived": "Boolean"
}
```

