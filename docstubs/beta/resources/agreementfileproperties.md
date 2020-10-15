---
title: "agreementFileProperties resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# agreementFileProperties resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                     | Return Type                                                      | Description                                                             |
| :------------------------------------------------------------------------- | :--------------------------------------------------------------- | :---------------------------------------------------------------------- |
| [List agreementFileProperties](../api/agreementfileproperties-list.md)     | [agreementFileProperties](agreementFileProperties.md) collection | List properties and relationships of an agreementFileProperties object. |
| [Create agreementFileProperties](../api/agreementfileproperties-create.md) | [agreementFileProperties](agreementFileProperties.md)            | Create a new agreementFileProperties object.                            |
| [Get agreementFileProperties](../api/agreementfileproperties-get.md)       | [agreementFileProperties](agreementFileProperties.md)            | Read properties and relationships of an agreementFileProperties object. |
| [Update agreementFileProperties](../api/agreementfileproperties-update.md) | [agreementFileProperties](agreementFileProperties.md)            | Update the properties of an agreementFileProperties object.             |
| [Delete agreementFileProperties](../api/agreementfileproperties-delete.md) |                                                                  | Delete an agreementFileProperties object.                               |

## Properties

| Property  | Type                                                   | Description |
| :-------- | :----------------------------------------------------- | :---------- |
| fileData  | [agreementFileData](../resources/agreementfiledata.md) |             |
| fileName  | String                                                 |             |
| id        | String                                                 | Read-only.  |
| isDefault | Boolean                                                |             |
| language  | String                                                 |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.agreementFileProperties",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.agreementFileProperties",
  "fileData": {"@odata.type": "microsoft.graph.agreementFileData"},
  "fileName": "String",
  "id": "String (identifier)",
  "isDefault": "Boolean",
  "language": "String"
}
```
