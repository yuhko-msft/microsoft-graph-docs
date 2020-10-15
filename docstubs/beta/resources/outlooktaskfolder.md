---
title: "outlookTaskFolder resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# outlookTaskFolder resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                                   | Return Type                                                                             | Description                                                                                                 |
| :------------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------- |
| [List outlookTaskFolder](../api/outlooktaskfolder-list.md)                                               | [outlookTaskFolder](outlookTaskFolder.md) collection                                    | List properties and relationships of an outlookTaskFolder object.                                           |
| [Create outlookTaskFolder](../api/outlooktaskfolder-create.md)                                           | [outlookTaskFolder](outlookTaskFolder.md)                                               | Create a new outlookTaskFolder object.                                                                      |
| [Get outlookTaskFolder](../api/outlooktaskfolder-get.md)                                                 | [outlookTaskFolder](outlookTaskFolder.md)                                               | Read properties and relationships of an outlookTaskFolder object.                                           |
| [Update outlookTaskFolder](../api/outlooktaskfolder-update.md)                                           | [outlookTaskFolder](outlookTaskFolder.md)                                               | Update the properties of an outlookTaskFolder object.                                                       |
| [Delete outlookTaskFolder](../api/outlooktaskfolder-delete.md)                                           |                                                                                         | Delete an outlookTaskFolder object.                                                                         |
| [List multiValueExtendedProperties](../api/outlooktaskfolder-list-multivalueextendedproperties.md)       | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Get the multiValueLegacyExtendedProperty objects from a multiValueExtendedProperties navigation property.   |
| [Create multiValueExtendedProperties](../api/outlooktaskfolder-post-multivalueextendedproperties.md)     | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Create a new multiValueLegacyExtendedProperty object.                                                       |
| [Get multiValueExtendedProperties](../api/outlooktaskfolder-get-multivalueextendedproperties.md)         | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Read the properties and relationships of a multiValueLegacyExtendedProperty object.                         |
| [Update multiValueExtendedProperties](../api/outlooktaskfolder-update-multivalueextendedproperties.md)   | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Update the properties of a multiValueLegacyExtendedProperty object.                                         |
| [Delete multiValueExtendedProperties](../api/outlooktaskfolder-delete-multivalueextendedproperties.md)   |                                                                                         | Delete a multiValueLegacyExtendedProperty object.                                                           |
| [List singleValueExtendedProperties](../api/outlooktaskfolder-list-singlevalueextendedproperties.md)     | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Get the singleValueLegacyExtendedProperty objects from a singleValueExtendedProperties navigation property. |
| [Create singleValueExtendedProperties](../api/outlooktaskfolder-post-singlevalueextendedproperties.md)   | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Create a new singleValueLegacyExtendedProperty object.                                                      |
| [Get singleValueExtendedProperties](../api/outlooktaskfolder-get-singlevalueextendedproperties.md)       | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Read the properties and relationships of a singleValueLegacyExtendedProperty object.                        |
| [Update singleValueExtendedProperties](../api/outlooktaskfolder-update-singlevalueextendedproperties.md) | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Update the properties of a singleValueLegacyExtendedProperty object.                                        |
| [Delete singleValueExtendedProperties](../api/outlooktaskfolder-delete-singlevalueextendedproperties.md) |                                                                                         | Delete a singleValueLegacyExtendedProperty object.                                                          |
| [List tasks](../api/outlooktaskfolder-list-tasks.md)                                                     | [outlookTask](../resources/-outlooktask.md)                                             | Get the outlookTask objects from a tasks navigation property.                                               |
| [Create tasks](../api/outlooktaskfolder-post-tasks.md)                                                   | [outlookTask](../resources/-outlooktask.md)                                             | Create a new outlookTask object.                                                                            |
| [Get tasks](../api/outlooktaskfolder-get-tasks.md)                                                       | [outlookTask](../resources/-outlooktask.md)                                             | Read the properties and relationships of an outlookTask object.                                             |
| [Update tasks](../api/outlooktaskfolder-update-tasks.md)                                                 | [outlookTask](../resources/-outlooktask.md)                                             | Update the properties of an outlookTask object.                                                             |
| [Delete tasks](../api/outlooktaskfolder-delete-tasks.md)                                                 |                                                                                         | Delete an outlookTask object.                                                                               |

## Properties

| Property        | Type    | Description |
| :-------------- | :------ | :---------- |
| changeKey       | String  |             |
| id              | String  | Read-only.  |
| isDefaultFolder | Boolean |             |
| name            | String  |             |
| parentGroupKey  | Guid    |             |

## Relationships

| Relationship                  | Type                                                                                              | Description |
| :---------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| multiValueExtendedProperties  | [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection   |             |
| singleValueExtendedProperties | [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection |             |
| tasks                         | [outlookTask](../resources/outlooktask.md) collection                                             |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookTaskFolder",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.outlookTaskFolder",
  "changeKey": "String",
  "id": "String (identifier)",
  "isDefaultFolder": "Boolean",
  "name": "String",
  "parentGroupKey": "Guid"
}
```
