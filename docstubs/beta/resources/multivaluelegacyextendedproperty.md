---
title: "multiValueLegacyExtendedProperty resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# multiValueLegacyExtendedProperty resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                       | Return Type                                                                        | Description                                                                     |
| :------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------- | :------------------------------------------------------------------------------ |
| [List multiValueLegacyExtendedProperty](../api/multivaluelegacyextendedproperty-list.md)     | [multiValueLegacyExtendedProperty](multiValueLegacyExtendedProperty.md) collection | List properties and relationships of a multiValueLegacyExtendedProperty object. |
| [Create multiValueLegacyExtendedProperty](../api/multivaluelegacyextendedproperty-create.md) | [multiValueLegacyExtendedProperty](multiValueLegacyExtendedProperty.md)            | Create a new multiValueLegacyExtendedProperty object.                           |
| [Get multiValueLegacyExtendedProperty](../api/multivaluelegacyextendedproperty-get.md)       | [multiValueLegacyExtendedProperty](multiValueLegacyExtendedProperty.md)            | Read properties and relationships of a multiValueLegacyExtendedProperty object. |
| [Update multiValueLegacyExtendedProperty](../api/multivaluelegacyextendedproperty-update.md) | [multiValueLegacyExtendedProperty](multiValueLegacyExtendedProperty.md)            | Update the properties of a multiValueLegacyExtendedProperty object.             |
| [Delete multiValueLegacyExtendedProperty](../api/multivaluelegacyextendedproperty-delete.md) |                                                                                    | Delete a multiValueLegacyExtendedProperty object.                               |

## Properties

| Property | Type              | Description |
| :------- | :---------------- | :---------- |
| id       | String            | Read-only.  |
| value    | String collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.multiValueLegacyExtendedProperty",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.multiValueLegacyExtendedProperty",
  "id": "String (identifier)",
  "value": ["String"]
}
```
