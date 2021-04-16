---
title: "microsoftStoreForBusinessApp resource type"
description: "Microsoft Store for Business Apps. This class does not support Create, Delete, or Update."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftStoreForBusinessApp resource type

Namespace: microsoft.graph



Microsoft Store for Business Apps. This class does not support Create, Delete, or Update.


Inherits from [mobileApp](../resources/mobileapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftStoreForBusinessApps](../api/microsoftstoreforbusinessapp-list.md)|[microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md) collection|Get a list of the [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md) objects and their properties.|
|[Create microsoftStoreForBusinessApp](../api/microsoftstoreforbusinessapp-create.md)|[microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|Create a new [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md) object.|
|[Get microsoftStoreForBusinessApp](../api/microsoftstoreforbusinessapp-get.md)|[microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|Read the properties and relationships of a [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md) object.|
|[Update microsoftStoreForBusinessApp](../api/microsoftstoreforbusinessapp-update.md)|[microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|Update the properties of a [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md) object.|
|[Delete microsoftStoreForBusinessApp](../api/microsoftstoreforbusinessapp-delete.md)|None|Deletes a [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md) object.|
|[List containedApps](../api/microsoftstoreforbusinessapp-list-containedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|Get the mobileContainedApp resources from the containedApps navigation property.|
|[Create mobileContainedApp](../api/microsoftstoreforbusinessapp-post-containedapps.md)|[mobileContainedApp](../resources/mobilecontainedapp.md)|Create a new mobileContainedApp object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the app was created. Inherited from [mobileApp](../resources/mobileapp.md)|
|dependentAppCount|Int32|The total number of dependencies the child app has. Inherited from [mobileApp](../resources/mobileapp.md)|
|description|String|The description of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|developer|String|The developer of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|displayName|String|The admin provided or imported title of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|informationUrl|String|The more information Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group. Inherited from [mobileApp](../resources/mobileapp.md)|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin. Inherited from [mobileApp](../resources/mobileapp.md)|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon. Inherited from [mobileApp](../resources/mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified. Inherited from [mobileApp](../resources/mobileapp.md)|
|licenseType|microsoftStoreForBusinessLicenseType|The app license type. Possible values are: `offline`, `online`.|
|licensingType|[vppLicensingType](../resources/vpplicensingtype.md)|The supported License Type.|
|notes|String|Notes for the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|owner|String|The owner of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|packageIdentityName|String|The app package identifier|
|privacyInformationUrl|String|The privacy statement Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|productKey|String|The app product key|
|publisher|String|The publisher of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|publishingState|mobileAppPublishingState|The publishing state for the app. The app cannot be assigned unless the app is published. Inherited from [mobileApp](../resources/mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|List of scope tag ids for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersededAppCount|Int32|The total number of apps this app is directly or indirectly superseded by. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersedingAppCount|Int32|The total number of apps this app directly or indirectly supersedes. Inherited from [mobileApp](../resources/mobileapp.md)|
|totalLicenseCount|Int32|The total number of Microsoft Store for Business licenses.|
|uploadState|Int32|The upload state. Possible values are: 0 - `Not Ready`, 1 - `Ready`, 2 - `Processing`. Inherited from [mobileApp](../resources/mobileapp.md)|
|usedLicenseCount|Int32|The number of Microsoft Store for Business licenses in use.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[mobileAppAssignment](../resources/mobileappassignment.md) collection|The list of group assignments for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|categories|[mobileAppCategory](../resources/mobileappcategory.md) collection|The list of categories for this app. Inherited from [mobileApp](../resources/mobileapp.md)|
|containedApps|[mobileContainedApp](../resources/mobilecontainedapp.md) collection|The collection of contained apps in a mobileApp acting as a package.|
|deviceStatuses|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|The list of installation states for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|installSummary|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Mobile App Install Summary. Inherited from [mobileApp](../resources/mobileapp.md)|
|relationships|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|The set of direct relationships for this app. Inherited from [mobileApp](../resources/mobileapp.md)|
|userStatuses|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|The list of installation states for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftStoreForBusinessApp",
  "baseType": "microsoft.graph.mobileApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessApp",
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
  "licenseType": "String",
  "licensingType": {
    "@odata.type": "microsoft.graph.vppLicensingType"
  },
  "packageIdentityName": "String",
  "productKey": "String",
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer"
}
```

