---
title: "managedDeviceEncryptionState resource type"
description: "Encryption report per device"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDeviceEncryptionState resource type

Namespace: microsoft.graph



Encryption report per device


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceEncryptionStates](../api/manageddeviceencryptionstate-list.md)|[managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md) collection|Get a list of the [managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md) objects and their properties.|
|[Create managedDeviceEncryptionState](../api/manageddeviceencryptionstate-create.md)|[managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md)|Create a new [managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md) object.|
|[Get managedDeviceEncryptionState](../api/manageddeviceencryptionstate-get.md)|[managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md)|Read the properties and relationships of a [managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md) object.|
|[Update managedDeviceEncryptionState](../api/manageddeviceencryptionstate-update.md)|[managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md)|Update the properties of a [managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md) object.|
|[Delete managedDeviceEncryptionState](../api/manageddeviceencryptionstate-delete.md)|None|Deletes a [managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advancedBitLockerStates|advancedBitLockerState|Advanced BitLocker State. Possible values are: `success`, `noUserConsent`, `osVolumeUnprotected`, `osVolumeTpmRequired`, `osVolumeTpmOnlyRequired`, `osVolumeTpmPinRequired`, `osVolumeTpmStartupKeyRequired`, `osVolumeTpmPinStartupKeyRequired`, `osVolumeEncryptionMethodMismatch`, `recoveryKeyBackupFailed`, `fixedDriveNotEncrypted`, `fixedDriveEncryptionMethodMismatch`, `loggedOnUserNonAdmin`, `windowsRecoveryEnvironmentNotConfigured`, `tpmNotAvailable`, `tpmNotReady`, `networkError`.|
|deviceName|String|Device name|
|deviceType|deviceTypes|Platform of the device. Possible values are: `desktop`, `windowsRT`, `winMO6`, `nokia`, `windowsPhone`, `mac`, `winCE`, `winEmbedded`, `iPhone`, `iPad`, `iPod`, `android`, `iSocConsumer`, `unix`, `macMDM`, `holoLens`, `surfaceHub`, `androidForWork`, `androidEnterprise`, `blackberry`, `palm`, `unknown`.|
|encryptionPolicySettingState|complianceStatus|Encryption policy setting state. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|encryptionReadinessState|encryptionReadinessState|Encryption readiness state. Possible values are: `notReady`, `ready`.|
|encryptionState|encryptionState|Device encryption state. Possible values are: `notEncrypted`, `encrypted`.|
|fileVaultStates|fileVaultState|FileVault State. Possible values are: `success`, `driveEncryptedByUser`, `userDeferredEncryption`, `escrowNotEnabled`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|osVersion|String|Operating system version of the device|
|policyDetails|[encryptionReportPolicyDetails](../resources/encryptionreportpolicydetails.md) collection|Policy Details|
|tpmSpecificationVersion|String|Device TPM Version|
|userPrincipalName|String|User name|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedDeviceEncryptionState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedDeviceEncryptionState",
  "id": "String (identifier)",
  "advancedBitLockerStates": "String",
  "deviceName": "String",
  "deviceType": "String",
  "encryptionPolicySettingState": "String",
  "encryptionReadinessState": "String",
  "encryptionState": "String",
  "fileVaultStates": "String",
  "osVersion": "String",
  "policyDetails": [
    {
      "@odata.type": "microsoft.graph.encryptionReportPolicyDetails"
    }
  ],
  "tpmSpecificationVersion": "String",
  "userPrincipalName": "String"
}
```

