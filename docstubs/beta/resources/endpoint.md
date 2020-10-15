---
title: "endpoint resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# endpoint resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                        | Return Type                                         | Description                                              |
| :------------------------------------------------------------ | :-------------------------------------------------- | :------------------------------------------------------- |
| [List endpoint](../api/endpoint-list.md)                      | [endpoint](endpoint.md) collection                  | List properties and relationships of an endpoint object. |
| [Create endpoint](../api/endpoint-create.md)                  | [endpoint](endpoint.md)                             | Create a new endpoint object.                            |
| [Get endpoint](../api/endpoint-get.md)                        | [endpoint](endpoint.md)                             | Read properties and relationships of an endpoint object. |
| [Update endpoint](../api/endpoint-update.md)                  | [endpoint](endpoint.md)                             | Update the properties of an endpoint object.             |
| [Delete endpoint](../api/endpoint-delete.md)                  |                                                     | Delete an endpoint object.                               |
| [checkMemberGroups](../api/endpoint-checkMemberGroups.md)     |                                                     |                                                          |
| [checkMemberObjects](../api/endpoint-checkMemberObjects.md)   |                                                     |                                                          |
| [getByIds](../api/endpoint-getByIds.md)                       |                                                     |                                                          |
| [getMemberGroups](../api/endpoint-getMemberGroups.md)         |                                                     |                                                          |
| [getMemberObjects](../api/endpoint-getMemberObjects.md)       |                                                     |                                                          |
| [getUserOwnedObjects](../api/endpoint-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md) |                                                          |
| [restore](../api/endpoint-restore.md)                         | [directoryObject](../resources/-directoryobject.md) |                                                          |
| [validateProperties](../api/endpoint-validateProperties.md)   |                                                     |                                                          |

## Properties

| Property           | Type           | Description |
| :----------------- | :------------- | :---------- |
| capability         | String         |             |
| deletedDateTime    | DateTimeOffset |             |
| id                 | String         | Read-only.  |
| providerId         | String         |             |
| providerName       | String         |             |
| providerResourceId | String         |             |
| uri                | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.endpoint",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.endpoint",
  "capability": "String",
  "deletedDateTime": "DateTimeOffset",
  "id": "String (identifier)",
  "providerId": "String",
  "providerName": "String",
  "providerResourceId": "String",
  "uri": "String"
}
```
