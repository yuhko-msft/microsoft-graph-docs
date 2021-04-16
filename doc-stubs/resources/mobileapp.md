---
title: "mobileApp resource type"
description: "An abstract class containing the base properties for Intune mobile apps."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileApp resource type

Namespace: microsoft.graph



An abstract class containing the base properties for Intune mobile apps.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileApps](../api/mobileapp-list.md)|[mobileApp](../resources/mobileapp.md) collection|Get a list of the [mobileApp](../resources/mobileapp.md) objects and their properties.|
|[Create mobileApp](../api/mobileapp-create.md)|[mobileApp](../resources/mobileapp.md)|Create a new [mobileApp](../resources/mobileapp.md) object.|
|[Get mobileApp](../api/mobileapp-get.md)|[mobileApp](../resources/mobileapp.md)|Read the properties and relationships of a [mobileApp](../resources/mobileapp.md) object.|
|[Update mobileApp](../api/mobileapp-update.md)|[mobileApp](../resources/mobileapp.md)|Update the properties of a [mobileApp](../resources/mobileapp.md) object.|
|[Delete mobileApp](../api/mobileapp-delete.md)|None|Deletes a [mobileApp](../resources/mobileapp.md) object.|
|[hasPayloadLinks](../api/mobileapp-haspayloadlinks.md)|[hasPayloadLinkResultItem](../resources/haspayloadlinkresultitem.md) collection|**TODO: Add Description**|
|[updateRelationships](../api/mobileapp-updaterelationships.md)|None|**TODO: Add Description**|
|[validateXml](../api/mobileapp-validatexml.md)|String|**TODO: Add Description**|
|[getMobileAppCount](../api/mobileapp-getmobileappcount.md)|Int64|**TODO: Add Description**|
|[getRelatedAppStates](../api/mobileapp-getrelatedappstates.md)|[mobileAppRelationshipState](../resources/mobileapprelationshipstate.md) collection|**TODO: Add Description**|
|[getTopMobileApps](../api/mobileapp-gettopmobileapps.md)|[mobileApp](../resources/mobileapp.md) collection|**TODO: Add Description**|
|[List deviceStatuses](../api/mobileapp-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create mobileAppInstallStatus](../api/mobileapp-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[List mobileAppInstallSummary](../api/mobileapp-list-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create mobileAppInstallSummary](../api/mobileapp-post-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[List relationships](../api/mobileapp-list-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create mobileAppRelationship](../api/mobileapp-post-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[List userStatuses](../api/mobileapp-list-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userAppInstallStatus](../api/mobileapp-post-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new userAppInstallStatus object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the app was created.|
|dependentAppCount|Int32|The total number of dependencies the child app has.|
|description|String|The description of the app.|
|developer|String|The developer of the app.|
|displayName|String|The admin provided or imported title of the app.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|informationUrl|String|The more information Url.|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group.|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin.|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon.|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified.|
|notes|String|Notes for the app.|
|owner|String|The owner of the app.|
|privacyInformationUrl|String|The privacy statement Url.|
|publisher|String|The publisher of the app.|
|publishingState|mobileAppPublishingState|The publishing state for the app. The app cannot be assigned unless the app is published. Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|List of scope tag ids for this mobile app.|
|supersededAppCount|Int32|The total number of apps this app is directly or indirectly superseded by.|
|supersedingAppCount|Int32|The total number of apps this app directly or indirectly supersedes.|
|uploadState|Int32|The upload state. Possible values are: 0 - `Not Ready`, 1 - `Ready`, 2 - `Processing`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[mobileAppAssignment](../resources/mobileappassignment.md) collection|The list of group assignments for this mobile app.|
|categories|[mobileAppCategory](../resources/mobileappcategory.md) collection|The list of categories for this app.|
|deviceStatuses|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|The list of installation states for this mobile app.|
|installSummary|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Mobile App Install Summary.|
|relationships|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|The set of direct relationships for this app.|
|userStatuses|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|The list of installation states for this mobile app.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileApp",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileApp",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "dependentAppCount": "Integer",
  "description": "String",
  "developer": "String",
  "displayName": "String",
  "informationUrl": "String",
  "isAssigned": "Boolean",
  "isFeatured": "Boolean",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "notes": "String",
  "owner": "String",
  "privacyInformationUrl": "String",
  "publisher": "String",
  "publishingState": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "supersededAppCount": "Integer",
  "supersedingAppCount": "Integer",
  "uploadState": "Integer"
}
```

