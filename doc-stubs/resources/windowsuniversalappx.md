---
title: "windowsUniversalAppX resource type"
description: "Contains properties and inherited properties for Windows Universal AppX Line Of Business apps."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsUniversalAppX resource type

Namespace: microsoft.graph



Contains properties and inherited properties for Windows Universal AppX Line Of Business apps.


Inherits from [mobileLobApp](../resources/mobilelobapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsUniversalAppXes](../api/windowsuniversalappx-list.md)|[windowsUniversalAppX](../resources/windowsuniversalappx.md) collection|Get a list of the [windowsUniversalAppX](../resources/windowsuniversalappx.md) objects and their properties.|
|[Create windowsUniversalAppX](../api/windowsuniversalappx-create.md)|[windowsUniversalAppX](../resources/windowsuniversalappx.md)|Create a new [windowsUniversalAppX](../resources/windowsuniversalappx.md) object.|
|[Get windowsUniversalAppX](../api/windowsuniversalappx-get.md)|[windowsUniversalAppX](../resources/windowsuniversalappx.md)|Read the properties and relationships of a [windowsUniversalAppX](../resources/windowsuniversalappx.md) object.|
|[Update windowsUniversalAppX](../api/windowsuniversalappx-update.md)|[windowsUniversalAppX](../resources/windowsuniversalappx.md)|Update the properties of a [windowsUniversalAppX](../resources/windowsuniversalappx.md) object.|
|[Delete windowsUniversalAppX](../api/windowsuniversalappx-delete.md)|None|Deletes a [windowsUniversalAppX](../resources/windowsuniversalappx.md) object.|
|[List committedContainedApps](../api/windowsuniversalappx-list-committedcontainedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|Get the mobileContainedApp resources from the committedContainedApps navigation property.|
|[Add mobileContainedApp](../api/windowsuniversalappx-post-committedcontainedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Add committedContainedApps by posting to the committedContainedApps collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicableArchitectures|windowsArchitecture|The Windows architecture(s) for which this app can run on. Possible values are: `none`, `x86`, `x64`, `arm`, `neutral`, `arm64`.|
|applicableDeviceTypes|windowsDeviceType|The Windows device type(s) for which this app can run on. Possible values are: `none`, `desktop`, `mobile`, `holographic`, `team`.|
|committedContentVersion|String|The internal committed content version. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|createdDateTime|DateTimeOffset|The date and time the app was created. Inherited from [mobileApp](../resources/mobileapp.md)|
|dependentAppCount|Int32|The total number of dependencies the child app has. Inherited from [mobileApp](../resources/mobileapp.md)|
|description|String|The description of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|developer|String|The developer of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|displayName|String|The admin provided or imported title of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|fileName|String|The name of the main Lob application file. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|identityName|String|The Identity Name.|
|identityPublisherHash|String|The Identity Publisher Hash.|
|identityResourceIdentifier|String|The Identity Resource Identifier.|
|identityVersion|String|The identity version.|
|informationUrl|String|The more information Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group. Inherited from [mobileApp](../resources/mobileapp.md)|
|isBundle|Boolean|Whether or not the app is a bundle.|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin. Inherited from [mobileApp](../resources/mobileapp.md)|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon. Inherited from [mobileApp](../resources/mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified. Inherited from [mobileApp](../resources/mobileapp.md)|
|minimumSupportedOperatingSystem|[windowsMinimumOperatingSystem](../resources/windowsminimumoperatingsystem.md)|The value for the minimum applicable operating system.|
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

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[mobileAppAssignment](../resources/mobileappassignment.md) collection|The list of group assignments for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|categories|[mobileAppCategory](../resources/mobileappcategory.md) collection|The list of categories for this app. Inherited from [mobileApp](../resources/mobileapp.md)|
|committedContainedApps|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|The collection of contained apps in the committed mobileAppContent of a windowsUniversalAppX app.|
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
  "@odata.type": "microsoft.graph.windowsUniversalAppX",
  "baseType": "microsoft.graph.mobileLobApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUniversalAppX",
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
  "applicableArchitectures": "String",
  "applicableDeviceTypes": "String",
  "identityName": "String",
  "identityPublisherHash": "String",
  "identityResourceIdentifier": "String",
  "identityVersion": "String",
  "isBundle": "Boolean",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.windowsMinimumOperatingSystem"
  }
}
```

