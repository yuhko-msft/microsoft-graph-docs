---
title: "directory resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# directory resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                       | Return Type                                               | Description                                                                         |
| :--------------------------------------------------------------------------- | :-------------------------------------------------------- | :---------------------------------------------------------------------------------- |
| [List directory](../api/directory-list.md)                                   | [directory](directory.md) collection                      | List properties and relationships of a directory object.                            |
| [Create directory](../api/directory-create.md)                               | [directory](directory.md)                                 | Create a new directory object.                                                      |
| [Get directory](../api/directory-get.md)                                     | [directory](directory.md)                                 | Read properties and relationships of a directory object.                            |
| [Update directory](../api/directory-update.md)                               | [directory](directory.md)                                 | Update the properties of a directory object.                                        |
| [Delete directory](../api/directory-delete.md)                               |                                                           | Delete a directory object.                                                          |
| [List administrativeUnits](../api/directory-list-administrativeunits.md)     | [administrativeUnit](../resources/-administrativeunit.md) | Get the administrativeUnit objects from an administrativeUnits navigation property. |
| [Create administrativeUnits](../api/directory-post-administrativeunits.md)   | [administrativeUnit](../resources/-administrativeunit.md) | Create a new administrativeUnit object.                                             |
| [Get administrativeUnits](../api/directory-get-administrativeunits.md)       | [administrativeUnit](../resources/-administrativeunit.md) | Read the properties and relationships of an administrativeUnit object.              |
| [Update administrativeUnits](../api/directory-update-administrativeunits.md) | [administrativeUnit](../resources/-administrativeunit.md) | Update the properties of an administrativeUnit object.                              |
| [Delete administrativeUnits](../api/directory-delete-administrativeunits.md) |                                                           | Delete an administrativeUnit object.                                                |
| [List deletedItems](../api/directory-list-deleteditems.md)                   | [directoryObject](../resources/-directoryobject.md)       | Get the directoryObject objects from a deletedItems navigation property.            |
| [Create deletedItems](../api/directory-post-deleteditems.md)                 | [directoryObject](../resources/-directoryobject.md)       | Create a new directoryObject object.                                                |
| [Get deletedItems](../api/directory-get-deleteditems.md)                     | [directoryObject](../resources/-directoryobject.md)       | Read the properties and relationships of a directoryObject object.                  |
| [Update deletedItems](../api/directory-update-deleteditems.md)               | [directoryObject](../resources/-directoryobject.md)       | Update the properties of a directoryObject object.                                  |
| [Delete deletedItems](../api/directory-delete-deleteditems.md)               |                                                           | Delete a directoryObject object.                                                    |
| [List groupProxies](../api/directory-list-groupproxies.md)                   | groupProxy                                                | Get the groupProxy objects from a groupProxies navigation property.                 |
| [Create groupProxies](../api/directory-post-groupproxies.md)                 | groupProxy                                                | Create a new groupProxy object.                                                     |
| [Get groupProxies](../api/directory-get-groupproxies.md)                     | groupProxy                                                | Read the properties and relationships of a groupProxy object.                       |
| [Update groupProxies](../api/directory-update-groupproxies.md)               | groupProxy                                                | Update the properties of a groupProxy object.                                       |
| [Delete groupProxies](../api/directory-delete-groupproxies.md)               |                                                           | Delete a groupProxy object.                                                         |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship        | Type                                                                | Description |
| :------------------ | :------------------------------------------------------------------ | :---------- |
| administrativeUnits | [administrativeUnit](../resources/administrativeunit.md) collection |             |
| deletedItems        | [directoryObject](../resources/directoryobject.md) collection       |             |
| groupProxies        | [groupProxy](../resources/groupproxy.md) collection                 |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.directory",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.directory",
}
```
