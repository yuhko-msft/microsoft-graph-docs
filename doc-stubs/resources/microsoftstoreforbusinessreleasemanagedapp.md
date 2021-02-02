---
title: "microsoftStoreForBusinessReleaseManagedApp resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftStoreForBusinessReleaseManagedApp resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftStoreForBusinessReleaseManagedApps](../api/microsoftstoreforbusinessreleasemanagedapp-list.md)|[microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) collection|Get a list of the [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) objects and their properties.|
|[Create microsoftStoreForBusinessReleaseManagedApp](../api/microsoftstoreforbusinessreleasemanagedapp-create.md)|[microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md)|Create a new [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) object.|
|[Get microsoftStoreForBusinessReleaseManagedApp](../api/microsoftstoreforbusinessreleasemanagedapp-get.md)|[microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md)|Read the properties and relationships of a [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) object.|
|[Update microsoftStoreForBusinessReleaseManagedApp](../api/microsoftstoreforbusinessreleasemanagedapp-update.md)|[microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md)|Update the properties of a [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) object.|
|[Delete microsoftStoreForBusinessReleaseManagedApp](../api/microsoftstoreforbusinessreleasemanagedapp-delete.md)|None|Deletes a [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) object.|
|[List assignments](../api/microsoftstoreforbusinessreleasemanagedapp-list-assignments.md)|[mobileAppAssignment](../resources/intune-mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create mobileAppAssignment](../api/microsoftstoreforbusinessreleasemanagedapp-post-assignments.md)|[mobileAppAssignment](../resources/intune-mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[List categories](../api/microsoftstoreforbusinessreleasemanagedapp-list-categories.md)|[mobileAppCategory](../resources/intune-mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add mobileAppCategory](../api/microsoftstoreforbusinessreleasemanagedapp-post-categories.md)|[mobileAppCategory](../resources/intune-mobileappcategory.md)|Add categories by posting to the categories collection.|
|[List containedApps](../api/microsoftstoreforbusinessreleasemanagedapp-list-containedapps.md)|[mobileContainedApp](../resources/intune-mobilecontainedapp.md) collection|Get the mobileContainedApp resources from the containedApps navigation property.|
|[Create mobileContainedApp](../api/microsoftstoreforbusinessreleasemanagedapp-post-containedapps.md)|[mobileContainedApp](../resources/intune-mobilecontainedapp.md)|Create a new mobileContainedApp object.|
|[List deviceStatuses](../api/microsoftstoreforbusinessreleasemanagedapp-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create mobileAppInstallStatus](../api/microsoftstoreforbusinessreleasemanagedapp-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[List mobileAppInstallSummary](../api/microsoftstoreforbusinessreleasemanagedapp-list-installsummary.md)|[mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create mobileAppInstallSummary](../api/microsoftstoreforbusinessreleasemanagedapp-post-installsummary.md)|[mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[List relationships](../api/microsoftstoreforbusinessreleasemanagedapp-list-relationships.md)|[mobileAppRelationship](../resources/intune-mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create mobileAppRelationship](../api/microsoftstoreforbusinessreleasemanagedapp-post-relationships.md)|[mobileAppRelationship](../resources/intune-mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[List microsoftStoreForBusinessReleaseManagedAppTemplate](../api/microsoftstoreforbusinessreleasemanagedapp-list-template.md)|[microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md) collection|Get the microsoftStoreForBusinessReleaseManagedAppTemplate resources from the template navigation property.|
|[Add microsoftStoreForBusinessReleaseManagedAppTemplate](../api/microsoftstoreforbusinessreleasemanagedapp-post-template.md)|[microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md)|Add template by posting to the template collection.|
|[List userStatuses](../api/microsoftstoreforbusinessreleasemanagedapp-list-userstatuses.md)|[userAppInstallStatus](../resources/intune-userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userAppInstallStatus](../api/microsoftstoreforbusinessreleasemanagedapp-post-userstatuses.md)|[userAppInstallStatus](../resources/intune-userappinstallstatus.md)|Create a new userAppInstallStatus object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|dependentAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|description|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|developer|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|displayName|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|informationUrl|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|isAssigned|Boolean|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|isFeatured|Boolean|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|largeIcon|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|licenseType|microsoftStoreForBusinessLicenseType|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md). Possible values are: `offline`, `online`.|
|licensingType|[vppLicensingType](../resources/intune-vpplicensingtype.md)|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|
|notes|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|owner|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|packageIdentityName|String|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|
|privacyInformationUrl|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|productKey|String|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|
|publisher|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|publishingState|mobileAppPublishingState|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|selectedChannelAndReleaseExpirationDateTime|DateTimeOffset|**TODO: Add Description**|
|selectedChannelAndReleaseId|String|**TODO: Add Description**|
|selectedPackageIds|String collection|**TODO: Add Description**|
|supersededAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|supersedingAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|totalLicenseCount|Int32|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|
|uploadState|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|usedLicenseCount|Int32|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[mobileAppAssignment](../resources/intune-mobileappassignment.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|categories|[mobileAppCategory](../resources/intune-mobileappcategory.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|containedApps|[mobileContainedApp](../resources/intune-mobilecontainedapp.md) collection|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|
|deviceStatuses|[mobileAppInstallStatus](../resources/intune-mobileappinstallstatus.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|installSummary|[mobileAppInstallSummary](../resources/intune-mobileappinstallsummary.md)|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|relationships|[mobileAppRelationship](../resources/intune-mobileapprelationship.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|
|template|[microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md)|**TODO: Add Description**|
|userStatuses|[userAppInstallStatus](../resources/intune-userappinstallstatus.md) collection|**TODO: Add Description** Inherited from [mobileApp](../resources/mobileapp.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftStoreForBusinessReleaseManagedApp",
  "baseType": "microsoft.graph.microsoftStoreForBusinessApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessReleaseManagedApp",
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
  "usedLicenseCount": "Integer",
  "totalLicenseCount": "Integer",
  "productKey": "String",
  "licenseType": "String",
  "packageIdentityName": "String",
  "licensingType": {
    "@odata.type": "microsoft.graph.vppLicensingType"
  },
  "selectedChannelAndReleaseId": "String",
  "selectedPackageIds": [
    "String"
  ],
  "selectedChannelAndReleaseExpirationDateTime": "String (timestamp)"
}
```

