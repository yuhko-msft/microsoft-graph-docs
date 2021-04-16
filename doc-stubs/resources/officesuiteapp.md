---
title: "officeSuiteApp resource type"
description: "Contains properties and inherited properties for the Office365 Suite App."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# officeSuiteApp resource type

Namespace: microsoft.graph



Contains properties and inherited properties for the Office365 Suite App.


Inherits from [mobileApp](../resources/mobileapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List officeSuiteApps](../api/officesuiteapp-list.md)|[officeSuiteApp](../resources/officesuiteapp.md) collection|Get a list of the [officeSuiteApp](../resources/officesuiteapp.md) objects and their properties.|
|[Create officeSuiteApp](../api/officesuiteapp-create.md)|[officeSuiteApp](../resources/officesuiteapp.md)|Create a new [officeSuiteApp](../resources/officesuiteapp.md) object.|
|[Get officeSuiteApp](../api/officesuiteapp-get.md)|[officeSuiteApp](../resources/officesuiteapp.md)|Read the properties and relationships of an [officeSuiteApp](../resources/officesuiteapp.md) object.|
|[Update officeSuiteApp](../api/officesuiteapp-update.md)|[officeSuiteApp](../resources/officesuiteapp.md)|Update the properties of an [officeSuiteApp](../resources/officesuiteapp.md) object.|
|[Delete officeSuiteApp](../api/officesuiteapp-delete.md)|None|Deletes an [officeSuiteApp](../resources/officesuiteapp.md) object.|
|[assign](../api/officesuiteapp-assign.md)|None|**TODO: Add Description**|
|[updateRelationships](../api/officesuiteapp-updaterelationships.md)|None|**TODO: Add Description**|
|[getRelatedAppStates](../api/officesuiteapp-getrelatedappstates.md)|[mobileAppRelationshipState](../resources/mobileapprelationshipstate.md) collection|**TODO: Add Description**|
|[List assignments](../api/officesuiteapp-list-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create mobileAppAssignment](../api/officesuiteapp-post-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[List categories](../api/officesuiteapp-list-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get the mobileAppCategory resources from the categories navigation property.|
|[Add mobileAppCategory](../api/officesuiteapp-post-categories.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Add categories by posting to the categories collection.|
|[List deviceStatuses](../api/officesuiteapp-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create mobileAppInstallStatus](../api/officesuiteapp-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[List mobileAppInstallSummary](../api/officesuiteapp-list-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md) collection|Get the mobileAppInstallSummary resources from the installSummary navigation property.|
|[Create mobileAppInstallSummary](../api/officesuiteapp-post-installsummary.md)|[mobileAppInstallSummary](../resources/mobileappinstallsummary.md)|Create a new mobileAppInstallSummary object.|
|[List relationships](../api/officesuiteapp-list-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create mobileAppRelationship](../api/officesuiteapp-post-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[List userStatuses](../api/officesuiteapp-list-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userAppInstallStatus](../api/officesuiteapp-post-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new userAppInstallStatus object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|autoAcceptEula|Boolean|The value to accept the EULA automatically on the enduser's device.|
|createdDateTime|DateTimeOffset|The date and time the app was created. Inherited from [mobileApp](../resources/mobileapp.md)|
|dependentAppCount|Int32|The total number of dependencies the child app has. Inherited from [mobileApp](../resources/mobileapp.md)|
|description|String|The description of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|developer|String|The developer of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|displayName|String|The admin provided or imported title of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|excludedApps|[excludedApps](../resources/excludedapps.md)|The property to represent the apps which are excluded from the selected Office365 Product Id.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|informationUrl|String|The more information Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|installProgressDisplayLevel|officeSuiteInstallProgressDisplayLevel|To specify the level of display for the Installation Progress Setup UI on the Device. Possible values are: `none`, `full`.|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group. Inherited from [mobileApp](../resources/mobileapp.md)|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin. Inherited from [mobileApp](../resources/mobileapp.md)|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon. Inherited from [mobileApp](../resources/mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified. Inherited from [mobileApp](../resources/mobileapp.md)|
|localesToInstall|String collection|The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/en-us/library/cc179219(v=office.16).aspx|
|notes|String|Notes for the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|officeConfigurationXml|Binary|The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app.|
|officePlatformArchitecture|windowsArchitecture|The property to represent the Office365 app suite version. Possible values are: `none`, `x86`, `x64`, `arm`, `neutral`, `arm64`.|
|owner|String|The owner of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|privacyInformationUrl|String|The privacy statement Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|productIds|officeProductId collection|The Product Ids that represent the Office365 Suite SKU.|
|publisher|String|The publisher of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|publishingState|mobileAppPublishingState|The publishing state for the app. The app cannot be assigned unless the app is published. Inherited from [mobileApp](../resources/mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|List of scope tag ids for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|shouldUninstallOlderVersionsOfOffice|Boolean|The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not.|
|supersededAppCount|Int32|The total number of apps this app is directly or indirectly superseded by. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersedingAppCount|Int32|The total number of apps this app directly or indirectly supersedes. Inherited from [mobileApp](../resources/mobileapp.md)|
|targetVersion|String|The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices.|
|updateChannel|officeUpdateChannel|The property to represent the Office365 Update Channel. Possible values are: `none`, `current`, `deferred`, `firstReleaseCurrent`, `firstReleaseDeferred`, `monthlyEnterprise`.|
|updateVersion|String|The property to represent the update version in which the specific target version is available for the Office365 app suite.|
|uploadState|Int32|The upload state. Possible values are: 0 - `Not Ready`, 1 - `Ready`, 2 - `Processing`. Inherited from [mobileApp](../resources/mobileapp.md)|
|useSharedComputerActivation|Boolean|The property to represent that whether the shared computer activation is used not for Office365 app suite.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
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
  "@odata.type": "microsoft.graph.officeSuiteApp",
  "baseType": "microsoft.graph.mobileApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.officeSuiteApp",
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
  "autoAcceptEula": "Boolean",
  "excludedApps": {
    "@odata.type": "microsoft.graph.excludedApps"
  },
  "installProgressDisplayLevel": "String",
  "localesToInstall": [
    "String"
  ],
  "officeConfigurationXml": "Binary",
  "officePlatformArchitecture": "String",
  "productIds": [
    "String"
  ],
  "shouldUninstallOlderVersionsOfOffice": "Boolean",
  "targetVersion": "String",
  "updateChannel": "String",
  "updateVersion": "String",
  "useSharedComputerActivation": "Boolean"
}
```

