---
title: "bitLockerFixedDrivePolicy resource type"
description: "BitLocker Fixed Drive Policies."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bitLockerFixedDrivePolicy resource type

Namespace: microsoft.graph



BitLocker Fixed Drive Policies.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|encryptionMethod|bitLockerEncryptionMethod|Select the encryption method for fixed drives. Possible values are: `aesCbc128`, `aesCbc256`, `xtsAes128`, `xtsAes256`.|
|recoveryOptions|[bitLockerRecoveryOptions](../resources/bitlockerrecoveryoptions.md)|This policy setting allows you to control how BitLocker-protected fixed data drives are recovered in the absence of the required credentials. This policy setting is applied when you turn on BitLocker.|
|requireEncryptionForWriteAccess|Boolean|This policy setting determines whether BitLocker protection is required for fixed data drives to be writable on a computer.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.bitLockerFixedDrivePolicy"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bitLockerFixedDrivePolicy",
  "encryptionMethod": "String",
  "recoveryOptions": {
    "@odata.type": "microsoft.graph.bitLockerRecoveryOptions"
  },
  "requireEncryptionForWriteAccess": "Boolean"
}
```

