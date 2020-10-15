---
title: "domainDnsRecord resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# domainDnsRecord resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                     | Return Type                                      | Description                                                    |
| :--------------------------------------------------------- | :----------------------------------------------- | :------------------------------------------------------------- |
| [List domainDnsRecord](../api/domaindnsrecord-list.md)     | [domainDnsRecord](domainDnsRecord.md) collection | List properties and relationships of a domainDnsRecord object. |
| [Create domainDnsRecord](../api/domaindnsrecord-create.md) | [domainDnsRecord](domainDnsRecord.md)            | Create a new domainDnsRecord object.                           |
| [Get domainDnsRecord](../api/domaindnsrecord-get.md)       | [domainDnsRecord](domainDnsRecord.md)            | Read properties and relationships of a domainDnsRecord object. |
| [Update domainDnsRecord](../api/domaindnsrecord-update.md) | [domainDnsRecord](domainDnsRecord.md)            | Update the properties of a domainDnsRecord object.             |
| [Delete domainDnsRecord](../api/domaindnsrecord-delete.md) |                                                  | Delete a domainDnsRecord object.                               |

## Properties

| Property         | Type    | Description |
| :--------------- | :------ | :---------- |
| id               | String  | Read-only.  |
| isOptional       | Boolean |             |
| label            | String  |             |
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
  "@odata.type": "microsoft.graph.domainDnsRecord",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.domainDnsRecord",
  "id": "String (identifier)",
  "isOptional": "Boolean",
  "label": "String",
  "recordType": "String",
  "supportedService": "String",
  "ttl": "Int32"
}
```
