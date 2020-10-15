---
title: "extensionProperty resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# extensionProperty resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                 | Return Type                                          | Description                                                       |
| :--------------------------------------------------------------------- | :--------------------------------------------------- | :---------------------------------------------------------------- |
| [List extensionProperty](../api/extensionproperty-list.md)             | [extensionProperty](extensionProperty.md) collection | List properties and relationships of an extensionProperty object. |
| [Create extensionProperty](../api/extensionproperty-create.md)         | [extensionProperty](extensionProperty.md)            | Create a new extensionProperty object.                            |
| [Get extensionProperty](../api/extensionproperty-get.md)               | [extensionProperty](extensionProperty.md)            | Read properties and relationships of an extensionProperty object. |
| [Update extensionProperty](../api/extensionproperty-update.md)         | [extensionProperty](extensionProperty.md)            | Update the properties of an extensionProperty object.             |
| [Delete extensionProperty](../api/extensionproperty-delete.md)         |                                                      | Delete an extensionProperty object.                               |
| [checkMemberGroups](../api/extensionproperty-checkMemberGroups.md)     |                                                      |                                                                   |
| [checkMemberObjects](../api/extensionproperty-checkMemberObjects.md)   |                                                      |                                                                   |
| [getByIds](../api/extensionproperty-getByIds.md)                       |                                                      |                                                                   |
| [getMemberGroups](../api/extensionproperty-getMemberGroups.md)         |                                                      |                                                                   |
| [getMemberObjects](../api/extensionproperty-getMemberObjects.md)       |                                                      |                                                                   |
| [getUserOwnedObjects](../api/extensionproperty-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md)  |                                                                   |
| [restore](../api/extensionproperty-restore.md)                         | [directoryObject](../resources/-directoryobject.md)  |                                                                   |
| [validateProperties](../api/extensionproperty-validateProperties.md)   |                                                      |                                                                   |

## Properties

| Property               | Type              | Description |
| :--------------------- | :---------------- | :---------- |
| appDisplayName         | String            |             |
| dataType               | String            |             |
| deletedDateTime        | DateTimeOffset    |             |
| id                     | String            | Read-only.  |
| isSyncedFromOnPremises | Boolean           |             |
| name                   | String            |             |
| targetObjects          | String collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.extensionProperty",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.extensionProperty",
  "appDisplayName": "String",
  "dataType": "String",
  "deletedDateTime": "DateTimeOffset",
  "id": "String (identifier)",
  "isSyncedFromOnPremises": "Boolean",
  "name": "String",
  "targetObjects": ["String"]
}
```
