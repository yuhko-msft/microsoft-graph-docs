---
title: "directoryRoleTemplate resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# directoryRoleTemplate resource type

Namespace: microsoft.graph

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                             | Return Type                                                  | Description                                                          |
| :------------------------------------------------------------------------------------------------- | :----------------------------------------------------------- | :------------------------------------------------------------------- |
| [List directoryRoleTemplate](../api/directoryroletemplate-list.md)                                 | [directoryRoleTemplate](directoryRoleTemplate.md) collection | List properties and relationships of a directoryRoleTemplate object. |
| [Create directoryRoleTemplate](../api/directoryroletemplate-create.md)                             | [directoryRoleTemplate](directoryRoleTemplate.md)            | Create a new directoryRoleTemplate object.                           |
| [Get directoryRoleTemplate](../api/directoryroletemplate-get.md)                                   | [directoryRoleTemplate](directoryRoleTemplate.md)            | Read properties and relationships of a directoryRoleTemplate object. |
| [Update directoryRoleTemplate](../api/directoryroletemplate-update.md)                             | [directoryRoleTemplate](directoryRoleTemplate.md)            | Update the properties of a directoryRoleTemplate object.             |
| [Delete directoryRoleTemplate](../api/directoryroletemplate-delete.md)                             |                                                              | Delete a directoryRoleTemplate object.                               |
| [checkMemberGroups](../api/directoryroletemplate-checkMemberGroups.md)                             |                                                              |                                                                      |
| [checkMemberObjects](../api/directoryroletemplate-checkMemberObjects.md)                           |                                                              |                                                                      |
| [getAvailableExtensionProperties](../api/directoryroletemplate-getAvailableExtensionProperties.md) |                                                              |                                                                      |
| [getByIds](../api/directoryroletemplate-getByIds.md)                                               |                                                              |                                                                      |
| [getMemberGroups](../api/directoryroletemplate-getMemberGroups.md)                                 |                                                              |                                                                      |
| [getMemberObjects](../api/directoryroletemplate-getMemberObjects.md)                               |                                                              |                                                                      |
| [restore](../api/directoryroletemplate-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md)          |                                                                      |
| [validateProperties](../api/directoryroletemplate-validateProperties.md)                           |                                                              |                                                                      |

## Properties

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| deletedDateTime | DateTimeOffset |             |
| description     | String         |             |
| displayName     | String         |             |
| id              | String         | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.directoryRoleTemplate",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.directoryRoleTemplate",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)"
}
```
