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
|[Create assignedLicenses](../api/macosvppapp-post-assignedlicenses.md)|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md)|Create a new macOsVppAppAssignedLicense object.|
|[Get assignedLicenses](../api/macosvppapp-get-macosvppappassignedlicense.md)|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md)|Read the properties and relationships of a [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object.|
|[Update assignedLicenses](../api/macosvppapp-update-assignedlicenses.md)|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md)|Update the properties of an assignedLicenses object.|
|[Delete assignedLicenses](../api/macosvppapp-delete-assignedlicenses.md)|None|Delete a [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object.|
|[List assignments](../api/macosvppapp-list-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create assignments](../api/macosvppapp-post-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[Get assignments](../api/macosvppapp-get-mobileappassignment.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Read the properties and relationships of a [mobileAppAssignment](../resources/mobileappassignment.md) object.|
|[Update assignments](../api/macosvppapp-update-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/macosvppapp-delete-assignments.md)|None|Delete a [mobileAppAssignment](../resources/mobileappassignment.md) object.|
|[List categories](../api/macosvppapp-list-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add categories](../api/macosvppapp-post-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Add categories by posting to the categories collection.|
|[Remove categories](../api/macosvppapp-delete-categories.md)|None|Remove a [mobileAppCategory](../resources/mobileappcategory.md) object.|
|[List deviceStatuses](../api/macosvppapp-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create deviceStatuses](../api/macosvppapp-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[Get deviceStatuses](../api/macosvppapp-get-mobileappinstallstatus.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Read the properties and relationships of a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[Update deviceStatuses](../api/macosvppapp-update-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Update the properties of a deviceStatuses object.|
|[Delete deviceStatuses](../api/macosvppapp-delete-devicestatuses.md)|None|Delete a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[List installSummary](../api/macosvppapp-list-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create installSummary](../api/macosvppapp-post-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[Get installSummary](../api/macosvppapp-get-mobileappinstallsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Read the properties and relationships of a [mobileAppInstallSummary](../resources/mobileappinstallsummary.md) object.|
|[Update installSummary](../api/macosvppapp-update-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Update the properties of an installSummary object.|
|[Delete installSummary](../api/macosvppapp-delete-installsummary.md)|None|Delete a [mobileAppInstallSummary](../resources/mobileappinstallsummary.md) object.|
|[List relationships](../api/macosvppapp-list-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create relationships](../api/macosvppapp-post-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[Get relationships](../api/macosvppapp-get-mobileapprelationship.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Read the properties and relationships of a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[Update relationships](../api/macosvppapp-update-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Update the properties of a relationships object.|
|[Delete relationships](../api/macosvppapp-delete-relationships.md)|None|Delete a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[List userStatuses](../api/macosvppapp-list-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userStatuses](../api/macosvppapp-post-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new userAppInstallStatus object.|
|[Get userStatuses](../api/macosvppapp-get-userappinstallstatus.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Read the properties and relationships of a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[Update userStatuses](../api/macosvppapp-update-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Update the properties of a userStatuses object.|
|[Delete userStatuses](../api/macosvppapp-delete-userstatuses.md)|None|Delete a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|

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
|id|String|Key of the entity. Inherited from [mobileApp](../resources/mobileapp.md)|
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
|assignedLicenses|[macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) collection|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.macOsVppApp",
  "baseType": "microsoft.management.services.api.mobileApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOsVppApp",
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
  "releaseDateTime": "String (timestamp)",
  "appStoreUrl": "String",
  "licensingType": {
    "@odata.type": "microsoft.graph.vppLicensingType"
  },
  "vppTokenOrganizationName": "String",
  "vppTokenAccountType": "String",
  "vppTokenAppleId": "String",
  "bundleId": "String",
  "vppTokenId": "String",
  "revokeLicenseActionResults": [
    {
      "@odata.type": "microsoft.graph.macOsVppAppRevokeLicensesActionResult"
    }
  ]
}
```

