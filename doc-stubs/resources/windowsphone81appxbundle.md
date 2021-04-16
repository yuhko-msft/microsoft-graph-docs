---
title: "windowsPhone81AppXBundle resource type"
description: "Contains properties and inherited properties for Windows Phone 8.1 AppX Bundle Line Of Business apps."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsPhone81AppXBundle resource type

Namespace: microsoft.graph



Contains properties and inherited properties for Windows Phone 8.1 AppX Bundle Line Of Business apps.


Inherits from [windowsPhone81AppX](../resources/windowsphone81appx.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsPhone81AppXBundle](../api/windowsphone81appxbundle-list.md)|[windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md) collection|Get a list of the [windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md) objects and their properties.|
|[Create windowsPhone81AppXBundle](../api/windowsphone81appxbundle-create.md)|[windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md)|Create a new [windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md) object.|
|[Get windowsPhone81AppXBundle](../api/windowsphone81appxbundle-get.md)|[windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md)|Read the properties and relationships of a [windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md) object.|
|[Update windowsPhone81AppXBundle](../api/windowsphone81appxbundle-update.md)|[windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md)|Update the properties of a [windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md) object.|
|[Delete windowsPhone81AppXBundle](../api/windowsphone81appxbundle-delete.md)|None|Deletes a [windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md) object.|
|[List assignments](../api/windowsphone81appxbundle-list-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create mobileAppAssignment](../api/windowsphone81appxbundle-post-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[List categories](../api/windowsphone81appxbundle-list-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add mobileAppCategory](../api/windowsphone81appxbundle-post-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Add categories by posting to the categories collection.|
|[List contentVersions](../api/windowsphone81appxbundle-list-contentversions.md)|[mobileAppContent](../resources/mobileappcontent.md) collection|Get the mobileAppContent resources from the contentVersions navigation property.|
|[Create mobileAppContent](../api/windowsphone81appxbundle-post-contentversions.md)|[mobileAppContent](../resources/mobileappcontent.md)|Create a new mobileAppContent object.|
|[List deviceStatuses](../api/windowsphone81appxbundle-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create mobileAppInstallStatus](../api/windowsphone81appxbundle-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[List mobileAppInstallSummary](../api/windowsphone81appxbundle-list-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create mobileAppInstallSummary](../api/windowsphone81appxbundle-post-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[List relationships](../api/windowsphone81appxbundle-list-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create mobileAppRelationship](../api/windowsphone81appxbundle-post-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[List userStatuses](../api/windowsphone81appxbundle-list-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userAppInstallStatus](../api/windowsphone81appxbundle-post-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new userAppInstallStatus object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicableArchitectures|windowsArchitecture|The Windows architecture(s) for which this app can run on. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md). Possible values are: `none`, `x86`, `x64`, `arm`, `neutral`, `arm64`.|
|appXPackageInformationList|[windowsPackageInformation](../resources/windowspackageinformation.md) collection|The list of AppX Package Information.|
|committedContentVersion|String|The internal committed content version. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|createdDateTime|DateTimeOffset|The date and time the app was created. Inherited from [mobileApp](../resources/mobileapp.md)|
|dependentAppCount|Int32|The total number of dependencies the child app has. Inherited from [mobileApp](../resources/mobileapp.md)|
|description|String|The description of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|developer|String|The developer of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|displayName|String|The admin provided or imported title of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|fileName|String|The name of the main Lob application file. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|identityName|String|The Identity Name. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|identityPublisherHash|String|The Identity Publisher Hash. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|identityResourceIdentifier|String|The Identity Resource Identifier. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|identityVersion|String|The identity version. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|informationUrl|String|The more information Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group. Inherited from [mobileApp](../resources/mobileapp.md)|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin. Inherited from [mobileApp](../resources/mobileapp.md)|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon. Inherited from [mobileApp](../resources/mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified. Inherited from [mobileApp](../resources/mobileapp.md)|
|minimumSupportedOperatingSystem|[windowsMinimumOperatingSystem](../resources/windowsminimumoperatingsystem.md)|The value for the minimum applicable operating system. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|notes|String|Notes for the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|owner|String|The owner of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|phoneProductIdentifier|String|The Phone Product Identifier. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|phonePublisherId|String|The Phone Publisher Id. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
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
  "@odata.type": "microsoft.graph.windowsPhone81AppXBundle",
  "baseType": "microsoft.graph.windowsPhone81AppX",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsPhone81AppXBundle",
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
  "identityName": "String",
  "identityPublisherHash": "String",
  "identityResourceIdentifier": "String",
  "identityVersion": "String",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.windowsMinimumOperatingSystem"
  },
  "phoneProductIdentifier": "String",
  "phonePublisherId": "String",
  "appXPackageInformationList": [
    {
      "@odata.type": "microsoft.graph.windowsPackageInformation"
    }
  ]
}
```

