---
title: "bitLockerSystemDrivePolicy resource type"
description: "BitLocker Encryption Base Policies."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bitLockerSystemDrivePolicy resource type

Namespace: microsoft.graph



BitLocker Encryption Base Policies.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|encryptionMethod|bitLockerEncryptionMethod|Select the encryption method for operating system drives. Possible values are: `aesCbc128`, `aesCbc256`, `xtsAes128`, `xtsAes256`.|
|minimumPinLength|Int32|Indicates the minimum length of startup pin. Valid values 4 to 20|
|prebootRecoveryEnableMessageAndUrl|Boolean|Enable pre-boot recovery message and Url. If requireStartupAuthentication is false, this value does not affect.|
|prebootRecoveryMessage|String|Defines a custom recovery message.|
|prebootRecoveryUrl|String|Defines a custom recovery URL.|
|recoveryOptions|[bitLockerRecoveryOptions](../resources/bitlockerrecoveryoptions.md)|Allows to recover BitLocker encrypted operating system drives in the absence of the required startup key information. This policy setting is applied when you turn on BitLocker.|
|startupAuthenticationBlockWithoutTpmChip|Boolean|Indicates whether to allow BitLocker without a compatible TPM (requires a password or a startup key on a USB flash drive).|
|startupAuthenticationRequired|Boolean|Require additional authentication at startup.|
|startupAuthenticationTpmKeyUsage|configurationUsage|Indicates if TPM startup key is allowed/required/disallowed. Possible values are: `blocked`, `required`, `allowed`, `notConfigured`.|
|startupAuthenticationTpmPinAndKeyUsage|configurationUsage|Indicates if TPM startup pin key and key are allowed/required/disallowed. Possible values are: `blocked`, `required`, `allowed`, `notConfigured`.|
|startupAuthenticationTpmPinUsage|configurationUsage|Indicates if TPM startup pin is allowed/required/disallowed. Possible values are: `blocked`, `required`, `allowed`, `notConfigured`.|
|startupAuthenticationTpmUsage|configurationUsage|Indicates if TPM startup is allowed/required/disallowed. Possible values are: `blocked`, `required`, `allowed`, `notConfigured`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.bitLockerSystemDrivePolicy"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bitLockerSystemDrivePolicy",
  "encryptionMethod": "String",
  "minimumPinLength": "Integer",
  "prebootRecoveryEnableMessageAndUrl": "Boolean",
  "prebootRecoveryMessage": "String",
  "prebootRecoveryUrl": "String",
  "recoveryOptions": {
    "@odata.type": "microsoft.graph.bitLockerRecoveryOptions"
  },
  "startupAuthenticationBlockWithoutTpmChip": "Boolean",
  "startupAuthenticationRequired": "Boolean",
  "startupAuthenticationTpmKeyUsage": "String",
  "startupAuthenticationTpmPinAndKeyUsage": "String",
  "startupAuthenticationTpmPinUsage": "String",
  "startupAuthenticationTpmUsage": "String"
}
```

