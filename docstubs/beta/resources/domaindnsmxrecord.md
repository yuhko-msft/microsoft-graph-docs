---
title: "domainDnsMxRecord resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# domainDnsMxRecord resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [domainDnsRecord](domaindnsrecord.md)

## Methods

| Method                                                         | Return Type                                          | Description                                                      |
| :------------------------------------------------------------- | :--------------------------------------------------- | :--------------------------------------------------------------- |
| [List domainDnsMxRecord](../api/domaindnsmxrecord-list.md)     | [domainDnsMxRecord](domainDnsMxRecord.md) collection | List properties and relationships of a domainDnsMxRecord object. |
| [Create domainDnsMxRecord](../api/domaindnsmxrecord-create.md) | [domainDnsMxRecord](domainDnsMxRecord.md)            | Create a new domainDnsMxRecord object.                           |
| [Get domainDnsMxRecord](../api/domaindnsmxrecord-get.md)       | [domainDnsMxRecord](domainDnsMxRecord.md)            | Read properties and relationships of a domainDnsMxRecord object. |
| [Update domainDnsMxRecord](../api/domaindnsmxrecord-update.md) | [domainDnsMxRecord](domainDnsMxRecord.md)            | Update the properties of a domainDnsMxRecord object.             |
| [Delete domainDnsMxRecord](../api/domaindnsmxrecord-delete.md) |                                                      | Delete a domainDnsMxRecord object.                               |

## Properties

| Property         | Type    | Description |
| :--------------- | :------ | :---------- |
| id               | String  | Read-only.  |
| isOptional       | Boolean |             |
| label            | String  |             |
| mailExchange     | String  |             |
| preference       | Int32   |             |
| recordType       | String  |             |
| supportedService | String  |             |
| ttl              | Int32   |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.domainDnsMxRecord",
  "baseType": "microsoft.graph.domainDnsRecord",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.domainDnsMxRecord",
  "id": "String (identifier)",
  "isOptional": "Boolean",
  "label": "String",
  "mailExchange": "String",
  "preference": "Int32",
  "recordType": "String",
  "supportedService": "String",
  "ttl": "Int32"
}
```
