---
title: "bitlocker resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# bitlocker resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                         | Return Type                                                   | Description                                                                   |
| :------------------------------------------------------------- | :------------------------------------------------------------ | :---------------------------------------------------------------------------- |
| [List bitlocker](../api/bitlocker-list.md)                     | [bitlocker](bitlocker.md) collection                          | List properties and relationships of a bitlocker object.                      |
| [Create bitlocker](../api/bitlocker-create.md)                 | [bitlocker](bitlocker.md)                                     | Create a new bitlocker object.                                                |
| [Get bitlocker](../api/bitlocker-get.md)                       | [bitlocker](bitlocker.md)                                     | Read properties and relationships of a bitlocker object.                      |
| [Update bitlocker](../api/bitlocker-update.md)                 | [bitlocker](bitlocker.md)                                     | Update the properties of a bitlocker object.                                  |
| [Delete bitlocker](../api/bitlocker-delete.md)                 |                                                               | Delete a bitlocker object.                                                    |
| [List recoveryKeys](../api/bitlocker-list-recoverykeys.md)     | [bitlockerRecoveryKey](../resources/-bitlockerrecoverykey.md) | Get the bitlockerRecoveryKey objects from a recoveryKeys navigation property. |
| [Create recoveryKeys](../api/bitlocker-post-recoverykeys.md)   | [bitlockerRecoveryKey](../resources/-bitlockerrecoverykey.md) | Create a new bitlockerRecoveryKey object.                                     |
| [Get recoveryKeys](../api/bitlocker-get-recoverykeys.md)       | [bitlockerRecoveryKey](../resources/-bitlockerrecoverykey.md) | Read the properties and relationships of a bitlockerRecoveryKey object.       |
| [Update recoveryKeys](../api/bitlocker-update-recoverykeys.md) | [bitlockerRecoveryKey](../resources/-bitlockerrecoverykey.md) | Update the properties of a bitlockerRecoveryKey object.                       |
| [Delete recoveryKeys](../api/bitlocker-delete-recoverykeys.md) |                                                               | Delete a bitlockerRecoveryKey object.                                         |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship | Type                                                                    | Description |
| :----------- | :---------------------------------------------------------------------- | :---------- |
| recoveryKeys | [bitlockerRecoveryKey](../resources/bitlockerrecoverykey.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.bitlocker",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.bitlocker",
}
```
