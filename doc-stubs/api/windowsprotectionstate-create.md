---
title: "Create windowsProtectionState"
description: "Create a new windowsProtectionState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsProtectionState
Namespace: microsoft.graph



Create a new [windowsProtectionState](../resources/windowsprotectionstate.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST ** Collection URI for microsoft.graph.windowsProtectionState not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsProtectionState](../resources/windowsprotectionstate.md) object.

The following table shows the properties that are required when you create the [windowsProtectionState](../resources/windowsprotectionstate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|antiMalwareVersion|String|Current anti malware version|
|deviceState|windowsDeviceHealthState|Computer's state (like clean or pending full scan or pending reboot etc). Possible values are: `clean`, `fullScanPending`, `rebootPending`, `manualStepsPending`, `offlineScanPending`, `critical`.|
|engineVersion|String|Current endpoint protection engine's version|
|fullScanOverdue|Boolean|Full scan overdue or not?|
|fullScanRequired|Boolean|Full scan required or not?|
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



## Response

If successful, this method returns a `201 Created` response code and a [windowsProtectionState](../resources/windowsprotectionstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsprotectionstate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsProtectionState not found
Content-Type: application/json
Content-length: 840

{
  "@odata.type": "#microsoft.graph.windowsProtectionState",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsProtectionState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsProtectionState",
  "id": "961f1d92-1d92-961f-921d-1f96921d1f96",
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

