---
title: "androidManagedStoreApp resource type"
description: "Contains properties and inherited properties for Android Managed Store Apps."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidManagedStoreApp resource type

Namespace: microsoft.graph



Contains properties and inherited properties for Android Managed Store Apps.


Inherits from [mobileApp](../resources/mobileapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidManagedStoreApps](../api/androidmanagedstoreapp-list.md)|[androidManagedStoreApp](../resources/androidmanagedstoreapp.md) collection|Get a list of the [androidManagedStoreApp](../resources/androidmanagedstoreapp.md) objects and their properties.|
|[Create androidManagedStoreApp](../api/androidmanagedstoreapp-create.md)|[androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|Create a new [androidManagedStoreApp](../resources/androidmanagedstoreapp.md) object.|
|[Get androidManagedStoreApp](../api/androidmanagedstoreapp-get.md)|[androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|Read the properties and relationships of an [androidManagedStoreApp](../resources/androidmanagedstoreapp.md) object.|
|[Update androidManagedStoreApp](../api/androidmanagedstoreapp-update.md)|[androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|Update the properties of an [androidManagedStoreApp](../resources/androidmanagedstoreapp.md) object.|
|[Delete androidManagedStoreApp](../api/androidmanagedstoreapp-delete.md)|None|Deletes an [androidManagedStoreApp](../resources/androidmanagedstoreapp.md) object.|
|[assign](../api/androidmanagedstoreapp-assign.md)|None|**TODO: Add Description**|
|[updateRelationships](../api/androidmanagedstoreapp-updaterelationships.md)|None|**TODO: Add Description**|
|[getRelatedAppStates](../api/androidmanagedstoreapp-getrelatedappstates.md)|[mobileAppRelationshipState](../resources/mobileapprelationshipstate.md) collection|**TODO: Add Description**|
|[List assignments](../api/androidmanagedstoreapp-list-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create mobileAppAssignment](../api/androidmanagedstoreapp-post-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[List categories](../api/androidmanagedstoreapp-list-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add mobileAppCategory](../api/androidmanagedstoreapp-post-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Add categories by posting to the categories collection.|
|[List deviceStatuses](../api/androidmanagedstoreapp-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create mobileAppInstallStatus](../api/androidmanagedstoreapp-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[List mobileAppInstallSummary](../api/androidmanagedstoreapp-list-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create mobileAppInstallSummary](../api/androidmanagedstoreapp-post-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[List relationships](../api/androidmanagedstoreapp-list-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create mobileAppRelationship](../api/androidmanagedstoreapp-post-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[List userStatuses](../api/androidmanagedstoreapp-list-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userAppInstallStatus](../api/androidmanagedstoreapp-post-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new userAppInstallStatus object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appIdentifier|String|The Identity Name.|
|appStoreUrl|String|The Play for Work Store app URL.|
|appTracks|[androidManagedStoreAppTrack](../resources/androidmanagedstoreapptrack.md) collection|The tracks that are visible to this enterprise.|
|createdDateTime|DateTimeOffset|The date and time the app was created. Inherited from [mobileApp](../resources/mobileapp.md)|
|dependentAppCount|Int32|The total number of dependencies the child app has. Inherited from [mobileApp](../resources/mobileapp.md)|
|description|String|The description of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|developer|String|The developer of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|displayName|String|The admin provided or imported title of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|informationUrl|String|The more information Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group. Inherited from [mobileApp](../resources/mobileapp.md)|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin. Inherited from [mobileApp](../resources/mobileapp.md)|
|isPrivate|Boolean|Indicates whether the app is only available to a given enterprise's users.|
|isSystemApp|Boolean|Indicates whether the app is a preinstalled system app.|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon. Inherited from [mobileApp](../resources/mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified. Inherited from [mobileApp](../resources/mobileapp.md)|
|notes|String|Notes for the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|owner|String|The owner of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|packageId|String|The package identifier.|
|privacyInformationUrl|String|The privacy statement Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|publisher|String|The publisher of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|publishingState|mobileAppPublishingState|The publishing state for the app. The app cannot be assigned unless the app is published. Inherited from [mobileApp](../resources/mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|List of scope tag ids for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersededAppCount|Int32|The total number of apps this app is directly or indirectly superseded by. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersedingAppCount|Int32|The total number of apps this app directly or indirectly supersedes. Inherited from [mobileApp](../resources/mobileapp.md)|
|supportsOemConfig|Boolean|Whether this app supports OEMConfig policy.|
|totalLicenseCount|Int32|The total number of VPP licenses.|
|uploadState|Int32|The upload state. Possible values are: 0 - `Not Ready`, 1 - `Ready`, 2 - `Processing`. Inherited from [mobileApp](../resources/mobileapp.md)|
|usedLicenseCount|Int32|The number of VPP licenses in use.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[mobileAppAssignment](../resources/mobileappassignment.md) collection|The list of group assignments for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|categories|[mobileAppCategory](../resources/mobileappcategory.md) collection|The list of categories for this app. Inherited from [mobileApp](../resources/mobileapp.md)|
|deviceStatuses|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|The list of installation states for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|installSummary|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Mobile App Install Summary. Inherited from [mobileApp](../resources/mobileapp.md)|
|relationships|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|The set of direct relationships for this app. Inherited from [mobileApp](../resources/mobileapp.md)|
|userStatuses|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|The list of installation states for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidManagedStoreApp",
  "baseType": "microsoft.graph.mobileApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidManagedStoreApp",
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
  "uploadState": "Integer",
  "appIdentifier": "String",
  "appStoreUrl": "String",
  "appTracks": [
    {
      "@odata.type": "microsoft.graph.androidManagedStoreAppTrack"
    }
  ],
  "isPrivate": "Boolean",
  "isSystemApp": "Boolean",
  "packageId": "String",
  "supportsOemConfig": "Boolean",
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer"
}
```

