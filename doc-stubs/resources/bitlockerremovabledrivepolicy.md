---
title: "bitLockerRemovableDrivePolicy resource type"
description: "BitLocker Removable Drive Policies."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bitLockerRemovableDrivePolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

BitLocker Removable Drive Policies.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blockCrossOrganizationWriteAccess|Boolean|This policy setting determines whether BitLocker protection is required for removable data drives to be writable on a computer.|
|encryptionMethod|bitLockerEncryptionMethod|Select the encryption method for removable drives. Possible values are: `aesCbc128`, `aesCbc256`, `xtsAes128`, `xtsAes256`.|
|requireEncryptionForWriteAccess|Boolean|Indicates whether to block write access to devices configured in another organization. If requireEncryptionForWriteAccess is false, this value does not affect.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.bitLockerRemovableDrivePolicy"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bitLockerRemovableDrivePolicy",
  "blockCrossOrganizationWriteAccess": "Boolean",
  "encryptionMethod": "String",
  "requireEncryptionForWriteAccess": "Boolean"
}
```

