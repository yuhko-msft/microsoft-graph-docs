---
title: "agreementFile resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# agreementFile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [agreementFileProperties](agreementfileproperties.md)

## Methods

| Method                                                               | Return Type                                                             | Description                                                                         |
| :------------------------------------------------------------------- | :---------------------------------------------------------------------- | :---------------------------------------------------------------------------------- |
| [List agreementFile](../api/agreementfile-list.md)                   | [agreementFile](agreementFile.md) collection                            | List properties and relationships of an agreementFile object.                       |
| [Create agreementFile](../api/agreementfile-create.md)               | [agreementFile](agreementFile.md)                                       | Create a new agreementFile object.                                                  |
| [Get agreementFile](../api/agreementfile-get.md)                     | [agreementFile](agreementFile.md)                                       | Read properties and relationships of an agreementFile object.                       |
| [Update agreementFile](../api/agreementfile-update.md)               | [agreementFile](agreementFile.md)                                       | Update the properties of an agreementFile object.                                   |
| [Delete agreementFile](../api/agreementfile-delete.md)               |                                                                         | Delete an agreementFile object.                                                     |
| [List localizations](../api/agreementfile-list-localizations.md)     | [agreementFileLocalization](../resources/-agreementfilelocalization.md) | Get the agreementFileLocalization objects from a localizations navigation property. |
| [Create localizations](../api/agreementfile-post-localizations.md)   | [agreementFileLocalization](../resources/-agreementfilelocalization.md) | Create a new agreementFileLocalization object.                                      |
| [Get localizations](../api/agreementfile-get-localizations.md)       | [agreementFileLocalization](../resources/-agreementfilelocalization.md) | Read the properties and relationships of an agreementFileLocalization object.       |
| [Update localizations](../api/agreementfile-update-localizations.md) | [agreementFileLocalization](../resources/-agreementfilelocalization.md) | Update the properties of an agreementFileLocalization object.                       |
| [Delete localizations](../api/agreementfile-delete-localizations.md) |                                                                         | Delete an agreementFileLocalization object.                                         |

## Properties

| Property  | Type                                                   | Description |
| :-------- | :----------------------------------------------------- | :---------- |
| fileData  | [agreementFileData](../resources/agreementfiledata.md) |             |
| fileName  | String                                                 |             |
| id        | String                                                 | Read-only.  |
| isDefault | Boolean                                                |             |
| language  | String                                                 |             |

## Relationships

| Relationship  | Type                                                                              | Description |
| :------------ | :-------------------------------------------------------------------------------- | :---------- |
| localizations | [agreementFileLocalization](../resources/agreementfilelocalization.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.agreementFile",
  "baseType": "microsoft.graph.agreementFileProperties",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.agreementFile",
  "fileData": {"@odata.type": "microsoft.graph.agreementFileData"},
  "fileName": "String",
  "id": "String (identifier)",
  "isDefault": "Boolean",
  "language": "String"
}
```
