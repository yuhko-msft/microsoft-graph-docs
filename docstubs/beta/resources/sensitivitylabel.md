---
title: "sensitivityLabel resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# sensitivityLabel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                          | Return Type                                                           | Description                                                            |
| :-------------------------------------------------------------- | :-------------------------------------------------------------------- | :--------------------------------------------------------------------- |
| [List sensitivityLabel](../api/sensitivitylabel-list.md)        | [sensitivityLabel](sensitivityLabel.md) collection                    | List properties and relationships of a sensitivityLabel object.        |
| [Create sensitivityLabel](../api/sensitivitylabel-create.md)    | [sensitivityLabel](sensitivityLabel.md)                               | Create a new sensitivityLabel object.                                  |
| [Get sensitivityLabel](../api/sensitivitylabel-get.md)          | [sensitivityLabel](sensitivityLabel.md)                               | Read properties and relationships of a sensitivityLabel object.        |
| [Update sensitivityLabel](../api/sensitivitylabel-update.md)    | [sensitivityLabel](sensitivityLabel.md)                               | Update the properties of a sensitivityLabel object.                    |
| [Delete sensitivityLabel](../api/sensitivitylabel-delete.md)    |                                                                       | Delete a sensitivityLabel object.                                      |
| [evaluate](../api/sensitivitylabel-evaluate.md)                 | [evaluateLabelJobResponse](../resources/-evaluatelabeljobresponse.md) |                                                                        |
| [List sublabels](../api/sensitivitylabel-list-sublabels.md)     | [sensitivityLabel](../resources/-sensitivitylabel.md)                 | Get the sensitivityLabel objects from a sublabels navigation property. |
| [Create sublabels](../api/sensitivitylabel-post-sublabels.md)   | [sensitivityLabel](../resources/-sensitivitylabel.md)                 | Create a new sensitivityLabel object.                                  |
| [Get sublabels](../api/sensitivitylabel-get-sublabels.md)       | [sensitivityLabel](../resources/-sensitivitylabel.md)                 | Read the properties and relationships of a sensitivityLabel object.    |
| [Update sublabels](../api/sensitivitylabel-update-sublabels.md) | [sensitivityLabel](../resources/-sensitivitylabel.md)                 | Update the properties of a sensitivityLabel object.                    |
| [Delete sublabels](../api/sensitivitylabel-delete-sublabels.md) |                                                                       | Delete a sensitivityLabel object.                                      |

## Properties

| Property                    | Type                                                          | Description |
| :-------------------------- | :------------------------------------------------------------ | :---------- |
| applicableTo                | String                                                        |             |
| applicationMode             | String                                                        |             |
| assignedPolicies            | [labelPolicy](../resources/labelpolicy.md) collection         |             |
| autoLabeling                | [autoLabeling](../resources/autolabeling.md)                  |             |
| description                 | String                                                        |             |
| displayName                 | String                                                        |             |
| id                          | String                                                        | Read-only.  |
| isDefault                   | Boolean                                                       |             |
| isEndpointProtectionEnabled | Boolean                                                       |             |
| labelActions                | [labelActionBase](../resources/labelactionbase.md) collection |             |
| name                        | String                                                        |             |
| priority                    | Int32                                                         |             |
| toolTip                     | String                                                        |             |

## Relationships

| Relationship | Type                                                            | Description |
| :----------- | :-------------------------------------------------------------- | :---------- |
| sublabels    | [sensitivityLabel](../resources/sensitivitylabel.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sensitivityLabel",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.sensitivityLabel",
  "applicableTo": "email | site | unifiedGroup | unknownFutureValue",
  "applicationMode": "manual | automatic | recommended",
  "assignedPolicies": [{"@odata.type": "microsoft.graph.labelPolicy"}],
  "autoLabeling": {"@odata.type": "microsoft.graph.autoLabeling"},
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "isDefault": "Boolean",
  "isEndpointProtectionEnabled": "Boolean",
  "labelActions": [{"@odata.type": "microsoft.graph.labelActionBase"}],
  "name": "String",
  "priority": "Int32",
  "toolTip": "String"
}
```
