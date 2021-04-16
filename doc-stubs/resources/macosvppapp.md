---
title: "macOsVppApp resource type"
description: "Contains properties and inherited properties for MacOS Volume-Purchased Program (VPP) Apps."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOsVppApp resource type

Namespace: microsoft.graph



Contains properties and inherited properties for MacOS Volume-Purchased Program (VPP) Apps.


Inherits from [mobileApp](../resources/mobileapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOsVppApps](../api/macosvppapp-list.md)|[macOsVppApp](../resources/macosvppapp.md) collection|Get a list of the [macOsVppApp](../resources/macosvppapp.md) objects and their properties.|
|[Create macOsVppApp](../api/macosvppapp-create.md)|[macOsVppApp](../resources/macosvppapp.md)|Create a new [macOsVppApp](../resources/macosvppapp.md) object.|
|[Get macOsVppApp](../api/macosvppapp-get.md)|[macOsVppApp](../resources/macosvppapp.md)|Read the properties and relationships of a [macOsVppApp](../resources/macosvppapp.md) object.|
|[Update macOsVppApp](../api/macosvppapp-update.md)|[macOsVppApp](../resources/macosvppapp.md)|Update the properties of a [macOsVppApp](../resources/macosvppapp.md) object.|
|[Delete macOsVppApp](../api/macosvppapp-delete.md)|None|Deletes a [macOsVppApp](../resources/macosvppapp.md) object.|
|[assign](../api/macosvppapp-assign.md)|None|**TODO: Add Description**|
|[updateRelationships](../api/macosvppapp-updaterelationships.md)|None|**TODO: Add Description**|
|[getRelatedAppStates](../api/macosvppapp-getrelatedappstates.md)|[mobileAppRelationshipState](../resources/mobileapprelationshipstate.md) collection|**TODO: Add Description**|
|[List assignedLicenses](../api/macosvppapp-list-assignedlicenses.md)|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) collection|Get the macOsVppAppAssignedLicense resources from the assignedLicenses navigation property.|
|[Create macOsVppAppAssignedLicense](../api/macosvppapp-post-assignedlicenses.md)|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md)|Create a new macOsVppAppAssignedLicense object.|
|[List assignments](../api/macosvppapp-list-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create mobileAppAssignment](../api/macosvppapp-post-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[List categories](../api/macosvppapp-list-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add mobileAppCategory](../api/macosvppapp-post-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Add categories by posting to the categories collection.|
|[List deviceStatuses](../api/macosvppapp-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create mobileAppInstallStatus](../api/macosvppapp-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[List mobileAppInstallSummary](../api/macosvppapp-list-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create mobileAppInstallSummary](../api/macosvppapp-post-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[List relationships](../api/macosvppapp-list-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create mobileAppRelationship](../api/macosvppapp-post-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[List userStatuses](../api/macosvppapp-list-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userAppInstallStatus](../api/macosvppapp-post-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new userAppInstallStatus object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appStoreUrl|String|The store URL.|
|bundleId|String|The Identity Name.|
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
|licensingType|[vppLicensingType](../resources/vpplicensingtype.md)|The supported License Type.|
|notes|String|Notes for the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|owner|String|The owner of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|privacyInformationUrl|String|The privacy statement Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|publisher|String|The publisher of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|publishingState|mobileAppPublishingState|The publishing state for the app. The app cannot be assigned unless the app is published. Inherited from [mobileApp](../resources/mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|releaseDateTime|DateTimeOffset|The VPP application release date and time.|
|revokeLicenseActionResults|[macOsVppAppRevokeLicensesActionResult](../resources/macosvppapprevokelicensesactionresult.md) collection|Results of revoke license actions on this app.|
|roleScopeTagIds|String collection|List of scope tag ids for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersededAppCount|Int32|The total number of apps this app is directly or indirectly superseded by. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersedingAppCount|Int32|The total number of apps this app directly or indirectly supersedes. Inherited from [mobileApp](../resources/mobileapp.md)|
|totalLicenseCount|Int32|The total number of VPP licenses.|
|uploadState|Int32|The upload state. Possible values are: 0 - `Not Ready`, 1 - `Ready`, 2 - `Processing`. Inherited from [mobileApp](../resources/mobileapp.md)|
|usedLicenseCount|Int32|The number of VPP licenses in use.|
|vppTokenAccountType|vppTokenAccountType|The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: `business`, `education`. Possible values are: `business`, `education`.|
|vppTokenAppleId|String|The Apple Id associated with the given Apple Volume Purchase Program Token.|
|vppTokenId|String|Identifier of the VPP token associated with this app.|
|vppTokenOrganizationName|String|The organization associated with the Apple Volume Purchase Program Token|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignedLicenses|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) collection|The licenses assigned to this app.|
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
  "@odata.type": "microsoft.graph.macOsVppApp",
  "baseType": "microsoft.graph.mobileApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOsVppApp",
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
  "appStoreUrl": "String",
  "bundleId": "String",
  "licensingType": {
    "@odata.type": "microsoft.graph.vppLicensingType"
  },
  "releaseDateTime": "String (timestamp)",
  "revokeLicenseActionResults": [
    {
      "@odata.type": "microsoft.graph.macOsVppAppRevokeLicensesActionResult"
    }
  ],
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer",
  "vppTokenAccountType": "String",
  "vppTokenAppleId": "String",
  "vppTokenId": "String",
  "vppTokenOrganizationName": "String"
}
```

