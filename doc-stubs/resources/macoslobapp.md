---
title: "macOSLobApp resource type"
description: "Contains properties and inherited properties for the MacOS LOB App."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSLobApp resource type

Namespace: microsoft.graph



Contains properties and inherited properties for the MacOS LOB App.


Inherits from [mobileLobApp](../resources/mobilelobapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSLobApps](../api/macoslobapp-list.md)|[macOSLobApp](../resources/macoslobapp.md) collection|Get a list of the [macOSLobApp](../resources/macoslobapp.md) objects and their properties.|
|[Create macOSLobApp](../api/macoslobapp-create.md)|[macOSLobApp](../resources/macoslobapp.md)|Create a new [macOSLobApp](../resources/macoslobapp.md) object.|
|[Get macOSLobApp](../api/macoslobapp-get.md)|[macOSLobApp](../resources/macoslobapp.md)|Read the properties and relationships of a [macOSLobApp](../resources/macoslobapp.md) object.|
|[Update macOSLobApp](../api/macoslobapp-update.md)|[macOSLobApp](../resources/macoslobapp.md)|Update the properties of a [macOSLobApp](../resources/macoslobapp.md) object.|
|[Delete macOSLobApp](../api/macoslobapp-delete.md)|None|Deletes a [macOSLobApp](../resources/macoslobapp.md) object.|
|[List assignments](../api/macoslobapp-list-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create mobileAppAssignment](../api/macoslobapp-post-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[List categories](../api/macoslobapp-list-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add mobileAppCategory](../api/macoslobapp-post-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Add categories by posting to the categories collection.|
|[List contentVersions](../api/macoslobapp-list-contentversions.md)|[mobileAppContent](../resources/mobileappcontent.md) collection|Get the mobileAppContent resources from the contentVersions navigation property.|
|[Create mobileAppContent](../api/macoslobapp-post-contentversions.md)|[mobileAppContent](../resources/mobileappcontent.md)|Create a new mobileAppContent object.|
|[List deviceStatuses](../api/macoslobapp-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create mobileAppInstallStatus](../api/macoslobapp-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[List mobileAppInstallSummary](../api/macoslobapp-list-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create mobileAppInstallSummary](../api/macoslobapp-post-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[List relationships](../api/macoslobapp-list-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create mobileAppRelationship](../api/macoslobapp-post-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[List userStatuses](../api/macoslobapp-list-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userAppInstallStatus](../api/macoslobapp-post-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new userAppInstallStatus object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|buildNumber|String|The build number of MacOS Line of Business (LoB) app.|
|bundleId|String|The bundle id.|
|childApps|[macOSLobChildApp](../resources/macoslobchildapp.md) collection|The app list in this bundle package|
|committedContentVersion|String|The internal committed content version. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|createdDateTime|DateTimeOffset|The date and time the app was created. Inherited from [mobileApp](../resources/mobileapp.md)|
|dependentAppCount|Int32|The total number of dependencies the child app has. Inherited from [mobileApp](../resources/mobileapp.md)|
|description|String|The description of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|developer|String|The developer of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|displayName|String|The admin provided or imported title of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|fileName|String|The name of the main Lob application file. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|identityVersion|String|The identity version.|
|ignoreVersionDetection|Boolean|A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for macOS Line of Business (LoB) apps that use a self update feature.|
|informationUrl|String|The more information Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|installAsManaged|Boolean|A boolean to control whether the app will be installed as managed (requires macOS 11.0 and other PKG restrictions).|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group. Inherited from [mobileApp](../resources/mobileapp.md)|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin. Inherited from [mobileApp](../resources/mobileapp.md)|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon. Inherited from [mobileApp](../resources/mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified. Inherited from [mobileApp](../resources/mobileapp.md)|
|md5Hash|String collection|The MD5 hash codes|
|md5HashChunkSize|Int32|The chunk size for MD5 hash|
|minimumSupportedOperatingSystem|[macOSMinimumOperatingSystem](../resources/macosminimumoperatingsystem.md)|The value for the minimum applicable operating system.|
|notes|String|Notes for the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|owner|String|The owner of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|privacyInformationUrl|String|The privacy statement Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|publisher|String|The publisher of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|publishingState|mobileAppPublishingState|The publishing state for the app. The app cannot be assigned unless the app is published. Inherited from [mobileApp](../resources/mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|List of scope tag ids for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|size|Int64|The total size, including all uploaded files. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|supersededAppCount|Int32|The total number of apps this app is directly or indirectly superseded by. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersedingAppCount|Int32|The total number of apps this app directly or indirectly supersedes. Inherited from [mobileApp](../resources/mobileapp.md)|
|uploadState|Int32|The upload state. Possible values are: 0 - `Not Ready`, 1 - `Ready`, 2 - `Processing`. Inherited from [mobileApp](../resources/mobileapp.md)|
|versionNumber|String|The version number of MacOS Line of Business (LoB) app.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[mobileAppAssignment](../resources/mobileappassignment.md) collection|The list of group assignments for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|categories|[mobileAppCategory](../resources/mobileappcategory.md) collection|The list of categories for this app. Inherited from [mobileApp](../resources/mobileapp.md)|
|contentVersions|[mobileAppContent](../resources/mobileappcontent.md) collection|The list of content versions for this app. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|deviceStatuses|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|The list of installation states for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|installSummary|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Mobile App Install Summary. Inherited from [mobileApp](../resources/mobileapp.md)|
|relationships|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|The set of direct relationships for this app. Inherited from [mobileApp](../resources/mobileapp.md)|
|userStatuses|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|The list of installation states for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macOSLobApp",
  "baseType": "microsoft.graph.mobileLobApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSLobApp",
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
  "committedContentVersion": "String",
  "fileName": "String",
  "size": "Integer",
  "buildNumber": "String",
  "bundleId": "String",
  "childApps": [
    {
      "@odata.type": "microsoft.graph.macOSLobChildApp"
    }
  ],
  "identityVersion": "String",
  "ignoreVersionDetection": "Boolean",
  "installAsManaged": "Boolean",
  "md5Hash": [
    "String"
  ],
  "md5HashChunkSize": "Integer",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.macOSMinimumOperatingSystem"
  },
  "versionNumber": "String"
}
```

