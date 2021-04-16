---
title: "mobileAppRelationshipState resource type"
description: "Describes the installation status details of the child app in the context of UPN and device id."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppRelationshipState resource type

Namespace: microsoft.graph



Describes the installation status details of the child app in the context of UPN and device id.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceId|String|The corresponding device id.|
|errorCode|Int32|The error code for install or uninstall failures of target app.|
|installState|resultantAppState|The install state of the app of target app. Possible values are: `notApplicable`, `installed`, `failed`, `notInstalled`, `uninstallFailed`, `pendingInstall`, `unknown`.|
|installStateDetail|resultantAppStateDetail|The install state detail of the app. Possible values are: `processorArchitectureNotApplicable`, `minimumDiskSpaceNotMet`, `minimumOsVersionNotMet`, `minimumPhysicalMemoryNotMet`, `minimumLogicalProcessorCountNotMet`, `minimumCpuSpeedNotMet`, `platformNotApplicable`, `fileSystemRequirementNotMet`, `registryRequirementNotMet`, `powerShellScriptRequirementNotMet`, `noAdditionalDetails`, `dependencyFailedToInstall`, `dependencyWithRequirementsNotMet`, `dependencyPendingReboot`, `dependencyWithAutoInstallDisabled`, `iosAppStoreUpdateFailedToInstall`, `vppAppHasUpdateAvailable`, `userRejectedUpdate`, `seeInstallErrorCode`, `autoInstallDisabled`, `managedAppNoLongerPresent`, `userRejectedInstall`, `userIsNotLoggedIntoAppStore`, `seeUninstallErrorCode`, `pendingReboot`, `installingDependencies`, `contentDownloaded`.|
|sourceIds|String collection|The collection of source mobile app's ids.|
|targetDisplayName|String|The related target app's display name.|
|targetId|String|The related target app's id.|
|targetLastSyncDateTime|DateTimeOffset|The last sync time of the target app.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.mobileAppRelationshipState"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppRelationshipState",
  "deviceId": "String",
  "errorCode": "Integer",
  "installState": "String",
  "installStateDetail": "String",
  "sourceIds": [
    "String"
  ],
  "targetDisplayName": "String",
  "targetId": "String",
  "targetLastSyncDateTime": "String (timestamp)"
}
```

