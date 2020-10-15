---
title: "informationProtectionLabel resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# informationProtectionLabel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                              | Return Type                                                            | Description                                                                |
| :-------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------- | :------------------------------------------------------------------------- |
| [List informationProtectionLabel](../api/informationprotectionlabel-list.md)                        | [informationProtectionLabel](informationProtectionLabel.md) collection | List properties and relationships of an informationProtectionLabel object. |
| [Create informationProtectionLabel](../api/informationprotectionlabel-create.md)                    | [informationProtectionLabel](informationProtectionLabel.md)            | Create a new informationProtectionLabel object.                            |
| [Get informationProtectionLabel](../api/informationprotectionlabel-get.md)                          | [informationProtectionLabel](informationProtectionLabel.md)            | Read properties and relationships of an informationProtectionLabel object. |
| [Update informationProtectionLabel](../api/informationprotectionlabel-update.md)                    | [informationProtectionLabel](informationProtectionLabel.md)            | Update the properties of an informationProtectionLabel object.             |
| [Delete informationProtectionLabel](../api/informationprotectionlabel-delete.md)                    |                                                                        | Delete an informationProtectionLabel object.                               |
| [evaluateApplication](../api/informationprotectionlabel-evaluateApplication.md)                     |                                                                        |                                                                            |
| [evaluateClassificationResults](../api/informationprotectionlabel-evaluateClassificationResults.md) |                                                                        |                                                                            |
| [evaluateRemoval](../api/informationprotectionlabel-evaluateRemoval.md)                             |                                                                        |                                                                            |
| [extractLabel](../api/informationprotectionlabel-extractLabel.md)                                   | informationProtectionContentLabel                                      |                                                                            |

## Properties

| Property    | Type                                                     | Description |
| :---------- | :------------------------------------------------------- | :---------- |
| color       | String                                                   |             |
| description | String                                                   |             |
| id          | String                                                   | Read-only.  |
| isActive    | Boolean                                                  |             |
| name        | String                                                   |             |
| parent      | [parentLabelDetails](../resources/parentlabeldetails.md) |             |
| sensitivity | Int32                                                    |             |
| tooltip     | String                                                   |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.informationProtectionLabel",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.informationProtectionLabel",
  "color": "String",
  "description": "String",
  "id": "String (identifier)",
  "isActive": "Boolean",
  "name": "String",
  "parent": {"@odata.type": "microsoft.graph.parentLabelDetails"},
  "sensitivity": "Int32",
  "tooltip": "String"
}
```
