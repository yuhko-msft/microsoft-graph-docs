---
title: "bitLockerRecoveryOptions resource type"
description: "BitLocker Recovery Options."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bitLockerRecoveryOptions resource type

Namespace: microsoft.graph



BitLocker Recovery Options.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blockDataRecoveryAgent|Boolean|Indicates whether to block certificate-based data recovery agent.|
|enableBitLockerAfterRecoveryInformationToStore|Boolean|Indicates whether or not to enable BitLocker until recovery information is stored in AD DS.|
|enableRecoveryInformationSaveToStore|Boolean|Indicates whether or not to allow BitLocker recovery information to store in AD DS.|
|hideRecoveryOptions|Boolean|Indicates whether or not to allow showing recovery options in BitLocker Setup Wizard for fixed or system disk.|
|recoveryInformationToStore|bitLockerRecoveryInformationType|Configure what pieces of BitLocker recovery information are stored to AD DS. Possible values are: `passwordAndKey`, `passwordOnly`.|
|recoveryKeyUsage|configurationUsage|Indicates whether users are allowed or required to generate a 256-bit recovery key for fixed or system disk. Possible values are: `blocked`, `required`, `allowed`, `notConfigured`.|
|recoveryPasswordUsage|configurationUsage|Indicates whether users are allowed or required to generate a 48-digit recovery password for fixed or system disk. Possible values are: `blocked`, `required`, `allowed`, `notConfigured`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.bitLockerRecoveryOptions"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bitLockerRecoveryOptions",
  "blockDataRecoveryAgent": "Boolean",
  "enableBitLockerAfterRecoveryInformationToStore": "Boolean",
  "enableRecoveryInformationSaveToStore": "Boolean",
  "hideRecoveryOptions": "Boolean",
  "recoveryInformationToStore": "String",
  "recoveryKeyUsage": "String",
  "recoveryPasswordUsage": "String"
}
```

