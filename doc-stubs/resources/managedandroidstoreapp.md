---
title: "managedAndroidStoreApp resource type"
description: "Contains properties and inherited properties for Android store apps that you can manage with an Intune app protection policy."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAndroidStoreApp resource type

Namespace: microsoft.graph

Contains properties and inherited properties for Android store apps that you can manage with an Intune app protection policy.


Inherits from [managedApp](../resources/managedapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedAndroidStoreApps](../api/managedandroidstoreapp-list.md)|[managedAndroidStoreApp](../resources/managedandroidstoreapp.md) collection|Get a list of the [managedAndroidStoreApp](../resources/managedandroidstoreapp.md) objects and their properties.|
|[Create managedAndroidStoreApp](../api/managedandroidstoreapp-create.md)|[managedAndroidStoreApp](../resources/managedandroidstoreapp.md)|Create a new [managedAndroidStoreApp](../resources/managedandroidstoreapp.md) object.|
|[Get managedAndroidStoreApp](../api/managedandroidstoreapp-get.md)|[managedAndroidStoreApp](../resources/managedandroidstoreapp.md)|Read the properties and relationships of a [managedAndroidStoreApp](../resources/managedandroidstoreapp.md) object.|
|[Update managedAndroidStoreApp](../api/managedandroidstoreapp-update.md)|[managedAndroidStoreApp](../resources/managedandroidstoreapp.md)|Update the properties of a [managedAndroidStoreApp](../resources/managedandroidstoreapp.md) object.|
|[Delete managedAndroidStoreApp](../api/managedandroidstoreapp-delete.md)|None|Deletes a [managedAndroidStoreApp](../resources/managedandroidstoreapp.md) object.|
|[List assignments](../api/managedandroidstoreapp-list-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create assignments](../api/managedandroidstoreapp-post-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[Get assignments](../api/managedandroidstoreapp-get-mobileappassignment.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Read the properties and relationships of a [mobileAppAssignment](../resources/mobileappassignment.md) object.|
|[Update assignments](../api/managedandroidstoreapp-update-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/managedandroidstoreapp-delete-assignments.md)|None|Delete a [mobileAppAssignment](../resources/mobileappassignment.md) object.|
|[List categories](../api/managedandroidstoreapp-list-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add categories](../api/managedandroidstoreapp-post-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Add categories by posting to the categories collection.|
|[Remove categories](../api/managedandroidstoreapp-delete-categories.md)|None|Remove a [mobileAppCategory](../resources/mobileappcategory.md) object.|
|[List deviceStatuses](../api/managedandroidstoreapp-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create deviceStatuses](../api/managedandroidstoreapp-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[Get deviceStatuses](../api/managedandroidstoreapp-get-mobileappinstallstatus.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Read the properties and relationships of a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[Update deviceStatuses](../api/managedandroidstoreapp-update-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Update the properties of a deviceStatuses object.|
|[Delete deviceStatuses](../api/managedandroidstoreapp-delete-devicestatuses.md)|None|Delete a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[List installSummary](../api/managedandroidstoreapp-list-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create installSummary](../api/managedandroidstoreapp-post-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[Get installSummary](../api/managedandroidstoreapp-get-mobileappinstallsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Read the properties and relationships of a [mobileAppInstallSummary](../resources/mobileappinstallsummary.md) object.|
|[Update installSummary](../api/managedandroidstoreapp-update-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Update the properties of an installSummary object.|
|[Delete installSummary](../api/managedandroidstoreapp-delete-installsummary.md)|None|Delete a [mobileAppInstallSummary](../resources/mobileappinstallsummary.md) object.|
|[List relationships](../api/managedandroidstoreapp-list-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create relationships](../api/managedandroidstoreapp-post-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[Get relationships](../api/managedandroidstoreapp-get-mobileapprelationship.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Read the properties and relationships of a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[Update relationships](../api/managedandroidstoreapp-update-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Update the properties of a relationships object.|
|[Delete relationships](../api/managedandroidstoreapp-delete-relationships.md)|None|Delete a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[List userStatuses](../api/managedandroidstoreapp-list-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userStatuses](../api/managedandroidstoreapp-post-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new userAppInstallStatus object.|
|[Get userStatuses](../api/managedandroidstoreapp-get-userappinstallstatus.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Read the properties and relationships of a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[Update userStatuses](../api/managedandroidstoreapp-update-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Update the properties of a userStatuses object.|
|[Delete userStatuses](../api/managedandroidstoreapp-delete-userstatuses.md)|None|Delete a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appAvailability|managedAppAvailability|The Application's availability. Inherited from [managedApp](../resources/managedapp.md). Possible values are: `global`, `lineOfBusiness`.|
|appStoreUrl|String|The Android AppStoreUrl.|
|createdDateTime|DateTimeOffset|The date and time the app was created. Inherited from [mobileApp](../resources/mobileapp.md)|
|dependentAppCount|Int32|The total number of dependencies the child app has. Inherited from [mobileApp](../resources/mobileapp.md)|
|description|String|The description of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|developer|String|The developer of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|displayName|String|The admin provided or imported title of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|id|String|Key of the entity. Inherited from [mobileApp](../resources/mobileapp.md)|
|informationUrl|String|The more information Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group. Inherited from [mobileApp](../resources/mobileapp.md)|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin. Inherited from [mobileApp](../resources/mobileapp.md)|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon. Inherited from [mobileApp](../resources/mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified. Inherited from [mobileApp](../resources/mobileapp.md)|
|minimumSupportedOperatingSystem|[androidMinimumOperatingSystem](../resources/androidminimumoperatingsystem.md)|The value for the minimum supported operating system.|
|notes|String|Notes for the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|owner|String|The owner of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|packageId|String|The app's package ID.|
|privacyInformationUrl|String|The privacy statement Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|publisher|String|The publisher of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|publishingState|mobileAppPublishingState|The publishing state for the app. The app cannot be assigned unless the app is published. Inherited from [mobileApp](../resources/mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|List of scope tag ids for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersededAppCount|Int32|The total number of apps this app is directly or indirectly superseded by. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersedingAppCount|Int32|The total number of apps this app directly or indirectly supersedes. Inherited from [mobileApp](../resources/mobileapp.md)|
|uploadState|Int32|The upload state. Possible values are: 0 - `Not Ready`, 1 - `Ready`, 2 - `Processing`. Inherited from [mobileApp](../resources/mobileapp.md)|
|version|String|The Application's version. Inherited from [managedApp](../resources/managedapp.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[mobileAppAssignment](../resources/mobileappassignment.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|categories|[mobileAppCategory](../resources/mobileappcategory.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|deviceStatuses|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|installSummary|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|relationships|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|userStatuses|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedAndroidStoreApp",
  "baseType": "microsoft.management.services.api.managedApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAndroidStoreApp",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "publisher": "String",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "isFeatured": "Boolean",
  "privacyInformationUrl": "String",
  "informationUrl": "String",
  "owner": "String",
  "developer": "String",
  "notes": "String",
  "uploadState": "Integer",
  "publishingState": "String",
  "isAssigned": "Boolean",
  "roleScopeTagIds": [
    "String"
  ],
  "dependentAppCount": "Integer",
  "supersedingAppCount": "Integer",
  "supersededAppCount": "Integer",
  "appAvailability": "String",
  "version": "String",
  "packageId": "String",
  "appStoreUrl": "String",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.androidMinimumOperatingSystem"
  }
}
```

