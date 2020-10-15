---
title: "agreementFileLocalization resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# agreementFileLocalization resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [agreementFileProperties](agreementfileproperties.md)

## Methods

| Method                                                                         | Return Type                                                          | Description                                                               |
| :----------------------------------------------------------------------------- | :------------------------------------------------------------------- | :------------------------------------------------------------------------ |
| [List agreementFileLocalization](../api/agreementfilelocalization-list.md)     | [agreementFileLocalization](agreementFileLocalization.md) collection | List properties and relationships of an agreementFileLocalization object. |
| [Create agreementFileLocalization](../api/agreementfilelocalization-create.md) | [agreementFileLocalization](agreementFileLocalization.md)            | Create a new agreementFileLocalization object.                            |
| [Get agreementFileLocalization](../api/agreementfilelocalization-get.md)       | [agreementFileLocalization](agreementFileLocalization.md)            | Read properties and relationships of an agreementFileLocalization object. |
| [Update agreementFileLocalization](../api/agreementfilelocalization-update.md) | [agreementFileLocalization](agreementFileLocalization.md)            | Update the properties of an agreementFileLocalization object.             |
| [Delete agreementFileLocalization](../api/agreementfilelocalization-delete.md) |                                                                      | Delete an agreementFileLocalization object.                               |

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
  "@odata.type": "microsoft.graph.agreementFileLocalization",
  "baseType": "microsoft.graph.agreementFileProperties",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.agreementFileLocalization",
  "fileData": {"@odata.type": "microsoft.graph.agreementFileData"},
  "fileName": "String",
  "id": "String (identifier)",
  "isDefault": "Boolean",
  "language": "String"
}
```
