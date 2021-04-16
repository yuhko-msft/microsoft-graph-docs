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
|[revokeAllLicenses](../api/iosvppapp-revokealllicenses.md)|None|**TODO: Add Description**|
|[revokeDeviceLicense](../api/iosvppapp-revokedevicelicense.md)|None|**TODO: Add Description**|
|[revokeUserLicense](../api/iosvppapp-revokeuserlicense.md)|None|**TODO: Add Description**|
|[List assignedLicenses](../api/iosvppapp-list-assignedlicenses.md)|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) collection|Get the iosVppAppAssignedLicense resources from the assignedLicenses navigation property.|
|[Create iosVppAppAssignedLicense](../api/iosvppapp-post-assignedlicenses.md)|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|Create a new iosVppAppAssignedLicense object.|

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
|assignedLicenses|[iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) collection|The licenses assigned to this app.|
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
  "@odata.type": "microsoft.graph.iosVppApp",
  "baseType": "microsoft.graph.mobileApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVppApp",
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
  "applicableDeviceType": {
    "@odata.type": "microsoft.graph.iosDeviceType"
  },
  "appStoreUrl": "String",
  "bundleId": "String",
  "licensingType": {
    "@odata.type": "microsoft.graph.vppLicensingType"
  },
  "releaseDateTime": "String (timestamp)",
  "revokeLicenseActionResults": [
    {
      "@odata.type": "microsoft.graph.iosVppAppRevokeLicensesActionResult"
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

