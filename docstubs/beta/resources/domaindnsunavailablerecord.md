---
title: "domainDnsUnavailableRecord resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# domainDnsUnavailableRecord resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [domainDnsRecord](domaindnsrecord.md)

## Methods

| Method                                                                           | Return Type                                                            | Description                                                               |
| :------------------------------------------------------------------------------- | :--------------------------------------------------------------------- | :------------------------------------------------------------------------ |
| [List domainDnsUnavailableRecord](../api/domaindnsunavailablerecord-list.md)     | [domainDnsUnavailableRecord](domainDnsUnavailableRecord.md) collection | List properties and relationships of a domainDnsUnavailableRecord object. |
| [Create domainDnsUnavailableRecord](../api/domaindnsunavailablerecord-create.md) | [domainDnsUnavailableRecord](domainDnsUnavailableRecord.md)            | Create a new domainDnsUnavailableRecord object.                           |
| [Get domainDnsUnavailableRecord](../api/domaindnsunavailablerecord-get.md)       | [domainDnsUnavailableRecord](domainDnsUnavailableRecord.md)            | Read properties and relationships of a domainDnsUnavailableRecord object. |
| [Update domainDnsUnavailableRecord](../api/domaindnsunavailablerecord-update.md) | [domainDnsUnavailableRecord](domainDnsUnavailableRecord.md)            | Update the properties of a domainDnsUnavailableRecord object.             |
| [Delete domainDnsUnavailableRecord](../api/domaindnsunavailablerecord-delete.md) |                                                                        | Delete a domainDnsUnavailableRecord object.                               |

## Properties

| Property         | Type    | Description |
| :--------------- | :------ | :---------- |
| description      | String  |             |
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
  "@odata.type": "microsoft.graph.domainDnsUnavailableRecord",
  "baseType": "microsoft.graph.domainDnsRecord",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.domainDnsUnavailableRecord",
  "description": "String",
  "id": "String (identifier)",
  "isOptional": "Boolean",
  "label": "String",
  "recordType": "String",
  "supportedService": "String",
  "ttl": "Int32"
}
```
