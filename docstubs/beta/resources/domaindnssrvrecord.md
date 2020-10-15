---
title: "domainDnsSrvRecord resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# domainDnsSrvRecord resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [domainDnsRecord](domaindnsrecord.md)

## Methods

| Method                                                           | Return Type                                            | Description                                                       |
| :--------------------------------------------------------------- | :----------------------------------------------------- | :---------------------------------------------------------------- |
| [List domainDnsSrvRecord](../api/domaindnssrvrecord-list.md)     | [domainDnsSrvRecord](domainDnsSrvRecord.md) collection | List properties and relationships of a domainDnsSrvRecord object. |
| [Create domainDnsSrvRecord](../api/domaindnssrvrecord-create.md) | [domainDnsSrvRecord](domainDnsSrvRecord.md)            | Create a new domainDnsSrvRecord object.                           |
| [Get domainDnsSrvRecord](../api/domaindnssrvrecord-get.md)       | [domainDnsSrvRecord](domainDnsSrvRecord.md)            | Read properties and relationships of a domainDnsSrvRecord object. |
| [Update domainDnsSrvRecord](../api/domaindnssrvrecord-update.md) | [domainDnsSrvRecord](domainDnsSrvRecord.md)            | Update the properties of a domainDnsSrvRecord object.             |
| [Delete domainDnsSrvRecord](../api/domaindnssrvrecord-delete.md) |                                                        | Delete a domainDnsSrvRecord object.                               |

## Properties

| Property         | Type    | Description |
| :--------------- | :------ | :---------- |
| id               | String  | Read-only.  |
| isOptional       | Boolean |             |
| label            | String  |             |
| nameTarget       | String  |             |
| port             | Int32   |             |
| priority         | Int32   |             |
| protocol         | String  |             |
| recordType       | String  |             |
| service          | String  |             |
| supportedService | String  |             |
| ttl              | Int32   |             |
| weight           | Int32   |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.domainDnsSrvRecord",
  "baseType": "microsoft.graph.domainDnsRecord",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.domainDnsSrvRecord",
  "id": "String (identifier)",
  "isOptional": "Boolean",
  "label": "String",
  "nameTarget": "String",
  "port": "Int32",
  "priority": "Int32",
  "protocol": "String",
  "recordType": "String",
  "service": "String",
  "supportedService": "String",
  "ttl": "Int32",
  "weight": "Int32"
}
```
