---
title: "iosVppApp resource type"
description: "Contains properties and inherited properties for iOS Volume-Purchased Program (VPP) Apps."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVppApp resource type

Namespace: microsoft.graph

Contains properties and inherited properties for iOS Volume-Purchased Program (VPP) Apps.


Inherits from [mobileApp](../resources/mobileapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosVppApps](../api/iosvppapp-list.md)|[iosVppApp](../resources/iosvppapp.md) collection|Get a list of the [iosVppApp](../resources/iosvppapp.md) objects and their properties.|
|[Create iosVppApp](../api/iosvppapp-create.md)|[iosVppApp](../resources/iosvppapp.md)|Create a new [iosVppApp](../resources/iosvppapp.md) object.|
|[Get iosVppApp](../api/iosvppapp-get.md)|[iosVppApp](../resources/iosvppapp.md)|Read the properties and relationships of an [iosVppApp](../resources/iosvppapp.md) object.|
|[Update iosVppApp](../api/iosvppapp-update.md)|[iosVppApp](../resources/iosvppapp.md)|Update the properties of an [iosVppApp](../resources/iosvppapp.md) object.|
|[Delete iosVppApp](../api/iosvppapp-delete.md)|None|Deletes an [iosVppApp](../resources/iosvppapp.md) object.|
|[assign](../api/iosvppapp-assign.md)|None|**TODO: Add Description**|
|[revokeAllLicenses](../api/iosvppapp-revokealllicenses.md)|None|Revoke all assigned iOS VPP licenses for given app.|
|[revokeUserLicense](../api/iosvppapp-revokeuserlicense.md)|None|Revoke assigned iOS VPP user license for given app.|
|[revokeDeviceLicense](../api/iosvppapp-revokedevicelicense.md)|None|Revoke assigned iOS VPP device license for given app.|
|[updateRelationships](../api/iosvppapp-updaterelationships.md)|None|**TODO: Add Description**|
|[getRelatedAppStates](../api/iosvppapp-getrelatedappstates.md)|[mobileAppRelationshipState](../resources/mobileapprelationshipstate.md) collection|**TODO: Add Description**|
|[List assignedLicenses](../api/iosvppapp-list-assignedlicenses.md)|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) collection|Get the iosVppAppAssignedLicense resources from the assignedLicenses navigation property.|
|[Create assignedLicenses](../api/iosvppapp-post-assignedlicenses.md)|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|Create a new iosVppAppAssignedLicense object.|
|[Get assignedLicenses](../api/iosvppapp-get-iosvppappassignedlicense.md)|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|Read the properties and relationships of an [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) object.|
|[Update assignedLicenses](../api/iosvppapp-update-assignedlicenses.md)|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|Update the properties of an assignedLicenses object.|
|[Delete assignedLicenses](../api/iosvppapp-delete-assignedlicenses.md)|None|Delete an [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) object.|
|[List assignments](../api/iosvppapp-list-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create assignments](../api/iosvppapp-post-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[Get assignments](../api/iosvppapp-get-mobileappassignment.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Read the properties and relationships of a [mobileAppAssignment](../resources/mobileappassignment.md) object.|
|[Update assignments](../api/iosvppapp-update-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/iosvppapp-delete-assignments.md)|None|Delete a [mobileAppAssignment](../resources/mobileappassignment.md) object.|
|[List categories](../api/iosvppapp-list-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add categories](../api/iosvppapp-post-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Add categories by posting to the categories collection.|
|[Remove categories](../api/iosvppapp-delete-categories.md)|None|Remove a [mobileAppCategory](../resources/mobileappcategory.md) object.|
|[List deviceStatuses](../api/iosvppapp-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create deviceStatuses](../api/iosvppapp-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[Get deviceStatuses](../api/iosvppapp-get-mobileappinstallstatus.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Read the properties and relationships of a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[Update deviceStatuses](../api/iosvppapp-update-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Update the properties of a deviceStatuses object.|
|[Delete deviceStatuses](../api/iosvppapp-delete-devicestatuses.md)|None|Delete a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[List installSummary](../api/iosvppapp-list-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create installSummary](../api/iosvppapp-post-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[Get installSummary](../api/iosvppapp-get-mobileappinstallsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Read the properties and relationships of a [mobileAppInstallSummary](../resources/mobileappinstallsummary.md) object.|
|[Update installSummary](../api/iosvppapp-update-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Update the properties of an installSummary object.|
|[Delete installSummary](../api/iosvppapp-delete-installsummary.md)|None|Delete a [mobileAppInstallSummary](../resources/mobileappinstallsummary.md) object.|
|[List relationships](../api/iosvppapp-list-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create relationships](../api/iosvppapp-post-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[Get relationships](../api/iosvppapp-get-mobileapprelationship.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Read the properties and relationships of a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[Update relationships](../api/iosvppapp-update-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Update the properties of a relationships object.|
|[Delete relationships](../api/iosvppapp-delete-relationships.md)|None|Delete a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[List userStatuses](../api/iosvppapp-list-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userStatuses](../api/iosvppapp-post-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new userAppInstallStatus object.|
|[Get userStatuses](../api/iosvppapp-get-userappinstallstatus.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Read the properties and relationships of a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[Update userStatuses](../api/iosvppapp-update-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Update the properties of a userStatuses object.|
|[Delete userStatuses](../api/iosvppapp-delete-userstatuses.md)|None|Delete a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicableDeviceType|[iosDeviceType](../resources/iosdevicetype.md)|The applicable iOS Device Type.|
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
|revokeLicenseActionResults|[iosVppAppRevokeLicensesActionResult](../resources/iosvppapprevokelicensesactionresult.md) collection|Results of revoke license actions on this app.|
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
|assignedLicenses|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) collection|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.iosVppApp",
  "baseType": "microsoft.management.services.api.mobileApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVppApp",
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
  "applicableDeviceType": {
    "@odata.type": "microsoft.graph.iosDeviceType"
  },
  "vppTokenOrganizationName": "String",
  "vppTokenAccountType": "String",
  "vppTokenAppleId": "String",
  "bundleId": "String",
  "vppTokenId": "String",
  "revokeLicenseActionResults": [
    {
      "@odata.type": "microsoft.graph.iosVppAppRevokeLicensesActionResult"
    }
  ]
}
```

