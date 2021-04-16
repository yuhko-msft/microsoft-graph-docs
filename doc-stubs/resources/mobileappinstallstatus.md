---
title: "mobileAppInstallStatus resource type"
description: "Contains properties for the installation state of a mobile app for a device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppInstallStatus resource type

Namespace: microsoft.graph



Contains properties for the installation state of a mobile app for a device.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileAppInstallStatus](../api/mobileappinstallstatus-list.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get a list of the [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) objects and their properties.|
|[Create mobileAppInstallStatus](../api/mobileappinstallstatus-create.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[Get mobileAppInstallStatus](../api/mobileappinstallstatus-get.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Read the properties and relationships of a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[Update mobileAppInstallStatus](../api/mobileappinstallstatus-update.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Update the properties of a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[Delete mobileAppInstallStatus](../api/mobileappinstallstatus-delete.md)|None|Deletes a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[List mobileApp](../api/mobileappinstallstatus-list-app.md)|[mobileApp](../resources/mobileapp.md) collection|Get the mobileApp resources from the app navigation property.|
|[Add mobileApp](../api/mobileappinstallstatus-post-app.md)|[mobileApp](../resources/mobileapp.md)|Add app by posting to the app collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceId|String|Device ID|
|deviceName|String|Device name|
|displayVersion|String|Human readable version of the application|
|errorCode|Int32|The error code for install or uninstall failures.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|installState|resultantAppState|The install state of the app. Possible values are: `notApplicable`, `installed`, `failed`, `notInstalled`, `uninstallFailed`, `pendingInstall`, `unknown`.|
|installStateDetail|resultantAppStateDetail|The install state detail of the app. Possible values are: `processorArchitectureNotApplicable`, `minimumDiskSpaceNotMet`, `minimumOsVersionNotMet`, `minimumPhysicalMemoryNotMet`, `minimumLogicalProcessorCountNotMet`, `minimumCpuSpeedNotMet`, `platformNotApplicable`, `fileSystemRequirementNotMet`, `registryRequirementNotMet`, `powerShellScriptRequirementNotMet`, `noAdditionalDetails`, `dependencyFailedToInstall`, `dependencyWithRequirementsNotMet`, `dependencyPendingReboot`, `dependencyWithAutoInstallDisabled`, `iosAppStoreUpdateFailedToInstall`, `vppAppHasUpdateAvailable`, `userRejectedUpdate`, `seeInstallErrorCode`, `autoInstallDisabled`, `managedAppNoLongerPresent`, `userRejectedInstall`, `userIsNotLoggedIntoAppStore`, `seeUninstallErrorCode`, `pendingReboot`, `installingDependencies`, `contentDownloaded`.|
|lastSyncDateTime|DateTimeOffset|Last sync date time|
|mobileAppInstallStatusValue|resultantAppState|The install state of the app. Possible values are: `notApplicable`, `installed`, `failed`, `notInstalled`, `uninstallFailed`, `pendingInstall`, `unknown`.|
|osDescription|String|OS Description|
|osVersion|String|OS Version|
|userName|String|Device User Name|
|userPrincipalName|String|User Principal Name|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|app|[mobileApp](../resources/mobileapp.md)|The navigation link to the mobile app.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppInstallStatus",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppInstallStatus",
  "id": "String (identifier)",
  "deviceId": "String",
  "deviceName": "String",
  "displayVersion": "String",
  "errorCode": "Integer",
  "installState": "String",
  "installStateDetail": "String",
  "lastSyncDateTime": "String (timestamp)",
  "mobileAppInstallStatusValue": "String",
  "osDescription": "String",
  "osVersion": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```

