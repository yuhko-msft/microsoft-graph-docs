---
title: "domainDnsCnameRecord resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# domainDnsCnameRecord resource type

Namespace: microsoft.graph

Inherits from [domainDnsRecord](domaindnsrecord.md)

## Methods

| Method                                                               | Return Type                                                | Description                                                         |
| :------------------------------------------------------------------- | :--------------------------------------------------------- | :------------------------------------------------------------------ |
| [List domainDnsCnameRecord](../api/domaindnscnamerecord-list.md)     | [domainDnsCnameRecord](domainDnsCnameRecord.md) collection | List properties and relationships of a domainDnsCnameRecord object. |
| [Create domainDnsCnameRecord](../api/domaindnscnamerecord-create.md) | [domainDnsCnameRecord](domainDnsCnameRecord.md)            | Create a new domainDnsCnameRecord object.                           |
| [Get domainDnsCnameRecord](../api/domaindnscnamerecord-get.md)       | [domainDnsCnameRecord](domainDnsCnameRecord.md)            | Read properties and relationships of a domainDnsCnameRecord object. |
| [Update domainDnsCnameRecord](../api/domaindnscnamerecord-update.md) | [domainDnsCnameRecord](domainDnsCnameRecord.md)            | Update the properties of a domainDnsCnameRecord object.             |
| [Delete domainDnsCnameRecord](../api/domaindnscnamerecord-delete.md) |                                                            | Delete a domainDnsCnameRecord object.                               |

## Properties

| Property         | Type    | Description |
| :--------------- | :------ | :---------- |
| canonicalName    | String  |             |
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
  "@odata.type": "microsoft.graph.domainDnsCnameRecord",
  "baseType": "microsoft.graph.domainDnsRecord",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.domainDnsCnameRecord",
  "canonicalName": "String",
  "id": "String (identifier)",
  "isOptional": "Boolean",
  "label": "String",
  "recordType": "String",
  "supportedService": "String",
  "ttl": "Int32"
}
```
