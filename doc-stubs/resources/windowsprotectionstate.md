---
title: "windowsProtectionState resource type"
description: "Device protection status entity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsProtectionState resource type

Namespace: microsoft.graph



Device protection status entity.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsProtectionStates](../api/windowsprotectionstate-list.md)|[windowsProtectionState](../resources/windowsprotectionstate.md) collection|Get a list of the [windowsProtectionState](../resources/windowsprotectionstate.md) objects and their properties.|
|[Create windowsProtectionState](../api/windowsprotectionstate-create.md)|[windowsProtectionState](../resources/windowsprotectionstate.md)|Create a new [windowsProtectionState](../resources/windowsprotectionstate.md) object.|
|[Get windowsProtectionState](../api/windowsprotectionstate-get.md)|[windowsProtectionState](../resources/windowsprotectionstate.md)|Read the properties and relationships of a [windowsProtectionState](../resources/windowsprotectionstate.md) object.|
|[Update windowsProtectionState](../api/windowsprotectionstate-update.md)|[windowsProtectionState](../resources/windowsprotectionstate.md)|Update the properties of a [windowsProtectionState](../resources/windowsprotectionstate.md) object.|
|[Delete windowsProtectionState](../api/windowsprotectionstate-delete.md)|None|Deletes a [windowsProtectionState](../resources/windowsprotectionstate.md) object.|
|[List detectedMalwareState](../api/windowsprotectionstate-list-detectedmalwarestate.md)|[windowsDeviceMalwareState](../resources/windowsdevicemalwarestate.md) collection|Get the windowsDeviceMalwareState resources from the detectedMalwareState navigation property.|
|[Create windowsDeviceMalwareState](../api/windowsprotectionstate-post-detectedmalwarestate.md)|[windowsDeviceMalwareState](../resources/windowsdevicemalwarestate.md)|Create a new windowsDeviceMalwareState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|antiMalwareVersion|String|Current anti malware version|
|deviceState|windowsDeviceHealthState|Computer's state (like clean or pending full scan or pending reboot etc). Possible values are: `clean`, `fullScanPending`, `rebootPending`, `manualStepsPending`, `offlineScanPending`, `critical`.|
|engineVersion|String|Current endpoint protection engine's version|
|fullScanOverdue|Boolean|Full scan overdue or not?|
|fullScanRequired|Boolean|Full scan required or not?|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isVirtualMachine|Boolean|Indicates whether the device is a virtual machine.|
|lastFullScanDateTime|DateTimeOffset|Last quick scan datetime|
|lastFullScanSignatureVersion|String|Last full scan signature version|
|lastQuickScanDateTime|DateTimeOffset|Last quick scan datetime|
|lastQuickScanSignatureVersion|String|Last quick scan signature version|
|lastReportedDateTime|DateTimeOffset|Last device health status reported time|
|malwareProtectionEnabled|Boolean|Anti malware is enabled or not|
|networkInspectionSystemEnabled|Boolean|Network inspection system enabled or not?|
|productStatus|windowsDefenderProductStatus|Product Status of Windows Defender Antivirus. Possible values are: `noStatus`, `serviceNotRunning`, `serviceStartedWithoutMalwareProtection`, `pendingFullScanDueToThreatAction`, `pendingRebootDueToThreatAction`, `pendingManualStepsDueToThreatAction`, `avSignaturesOutOfDate`, `asSignaturesOutOfDate`, `noQuickScanHappenedForSpecifiedPeriod`, `noFullScanHappenedForSpecifiedPeriod`, `systemInitiatedScanInProgress`, `systemInitiatedCleanInProgress`, `samplesPendingSubmission`, `productRunningInEvaluationMode`, `productRunningInNonGenuineMode`, `productExpired`, `offlineScanRequired`, `serviceShutdownAsPartOfSystemShutdown`, `threatRemediationFailedCritically`, `threatRemediationFailedNonCritically`, `noStatusFlagsSet`, `platformOutOfDate`, `platformUpdateInProgress`, `platformAboutToBeOutdated`, `signatureOrPlatformEndOfLifeIsPastOrIsImpending`, `windowsSModeSignaturesInUseOnNonWin10SInstall`.|
|quickScanOverdue|Boolean|Quick scan overdue or not?|
|realTimeProtectionEnabled|Boolean|Real time protection is enabled or not?|
|rebootRequired|Boolean|Reboot required or not?|
|signatureUpdateOverdue|Boolean|Signature out of date or not?|
|signatureVersion|String|Current malware definitions version|
|tamperProtectionEnabled|Boolean|Indicates whether the Windows Defender tamper protection feature is enabled.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|detectedMalwareState|[windowsDeviceMalwareState](../resources/windowsdevicemalwarestate.md) collection|Device malware list|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsProtectionState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsProtectionState",
  "id": "String (identifier)",
  "antiMalwareVersion": "String",
  "deviceState": "String",
  "engineVersion": "String",
  "fullScanOverdue": "Boolean",
  "fullScanRequired": "Boolean",
  "isVirtualMachine": "Boolean",
  "lastFullScanDateTime": "String (timestamp)",
  "lastFullScanSignatureVersion": "String",
  "lastQuickScanDateTime": "String (timestamp)",
  "lastQuickScanSignatureVersion": "String",
  "lastReportedDateTime": "String (timestamp)",
  "malwareProtectionEnabled": "Boolean",
  "networkInspectionSystemEnabled": "Boolean",
  "productStatus": "String",
  "quickScanOverdue": "Boolean",
  "realTimeProtectionEnabled": "Boolean",
  "rebootRequired": "Boolean",
  "signatureUpdateOverdue": "Boolean",
  "signatureVersion": "String",
  "tamperProtectionEnabled": "Boolean"
}
```

