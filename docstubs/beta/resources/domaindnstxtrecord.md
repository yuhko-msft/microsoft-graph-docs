---
title: "domainDnsTxtRecord resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# domainDnsTxtRecord resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [domainDnsRecord](domaindnsrecord.md)

## Methods

| Method                                                           | Return Type                                            | Description                                                       |
| :--------------------------------------------------------------- | :----------------------------------------------------- | :---------------------------------------------------------------- |
| [List domainDnsTxtRecord](../api/domaindnstxtrecord-list.md)     | [domainDnsTxtRecord](domainDnsTxtRecord.md) collection | List properties and relationships of a domainDnsTxtRecord object. |
| [Create domainDnsTxtRecord](../api/domaindnstxtrecord-create.md) | [domainDnsTxtRecord](domainDnsTxtRecord.md)            | Create a new domainDnsTxtRecord object.                           |
| [Get domainDnsTxtRecord](../api/domaindnstxtrecord-get.md)       | [domainDnsTxtRecord](domainDnsTxtRecord.md)            | Read properties and relationships of a domainDnsTxtRecord object. |
| [Update domainDnsTxtRecord](../api/domaindnstxtrecord-update.md) | [domainDnsTxtRecord](domainDnsTxtRecord.md)            | Update the properties of a domainDnsTxtRecord object.             |
| [Delete domainDnsTxtRecord](../api/domaindnstxtrecord-delete.md) |                                                        | Delete a domainDnsTxtRecord object.                               |

## Properties

| Property         | Type    | Description |
| :--------------- | :------ | :---------- |
| id               | String  | Read-only.  |
| isOptional       | Boolean |             |
| label            | String  |             |
| recordType       | String  |             |
| supportedService | String  |             |
| text             | String  |             |
| ttl              | Int32   |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.domainDnsTxtRecord",
  "baseType": "microsoft.graph.domainDnsRecord",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.domainDnsTxtRecord",
  "id": "String (identifier)",
  "isOptional": "Boolean",
  "label": "String",
  "recordType": "String",
  "supportedService": "String",
  "text": "String",
  "ttl": "Int32"
}
```
