---
title: "bitlockerRecoveryKey resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# bitlockerRecoveryKey resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                               | Return Type                                                | Description                                                         |
| :------------------------------------------------------------------- | :--------------------------------------------------------- | :------------------------------------------------------------------ |
| [List bitlockerRecoveryKey](../api/bitlockerrecoverykey-list.md)     | [bitlockerRecoveryKey](bitlockerRecoveryKey.md) collection | List properties and relationships of a bitlockerRecoveryKey object. |
| [Create bitlockerRecoveryKey](../api/bitlockerrecoverykey-create.md) | [bitlockerRecoveryKey](bitlockerRecoveryKey.md)            | Create a new bitlockerRecoveryKey object.                           |
| [Get bitlockerRecoveryKey](../api/bitlockerrecoverykey-get.md)       | [bitlockerRecoveryKey](bitlockerRecoveryKey.md)            | Read properties and relationships of a bitlockerRecoveryKey object. |
| [Update bitlockerRecoveryKey](../api/bitlockerrecoverykey-update.md) | [bitlockerRecoveryKey](bitlockerRecoveryKey.md)            | Update the properties of a bitlockerRecoveryKey object.             |
| [Delete bitlockerRecoveryKey](../api/bitlockerrecoverykey-delete.md) |                                                            | Delete a bitlockerRecoveryKey object.                               |

## Properties

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| createdDateTime | DateTimeOffset |             |
| deviceId        | String         |             |
| id              | String         | Read-only.  |
| key             | String         |             |
| volumeType      | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.bitlockerRecoveryKey",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.bitlockerRecoveryKey",
  "createdDateTime": "DateTimeOffset",
  "deviceId": "String",
  "id": "String (identifier)",
  "key": "String",
  "volumeType": "operatingSystemVolume | fixedDataVolume | removableDataVolume | unknownFutureValue"
}
```
