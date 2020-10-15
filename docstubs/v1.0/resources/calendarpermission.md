---
title: "calendarPermission resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# calendarPermission resource type

Namespace: microsoft.graph

## Methods

| Method                                                           | Return Type                                            | Description                                                       |
| :--------------------------------------------------------------- | :----------------------------------------------------- | :---------------------------------------------------------------- |
| [List calendarPermission](../api/calendarpermission-list.md)     | [calendarPermission](calendarPermission.md) collection | List properties and relationships of a calendarPermission object. |
| [Create calendarPermission](../api/calendarpermission-create.md) | [calendarPermission](calendarPermission.md)            | Create a new calendarPermission object.                           |
| [Get calendarPermission](../api/calendarpermission-get.md)       | [calendarPermission](calendarPermission.md)            | Read properties and relationships of a calendarPermission object. |
| [Update calendarPermission](../api/calendarpermission-update.md) | [calendarPermission](calendarPermission.md)            | Update the properties of a calendarPermission object.             |
| [Delete calendarPermission](../api/calendarpermission-delete.md) |                                                        | Delete a calendarPermission object.                               |

## Properties

| Property             | Type                                         | Description |
| :------------------- | :------------------------------------------- | :---------- |
| allowedRoles         | String collection                            |             |
| emailAddress         | [emailAddress](../resources/emailaddress.md) |             |
| id                   | String                                       | Read-only.  |
| isInsideOrganization | Boolean                                      |             |
| isRemovable          | Boolean                                      |             |
| role                 | String                                       |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.calendarPermission",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.calendarPermission",
  "allowedRoles": ["none | freeBusyRead | limitedRead | read | write | delegateWithoutPrivateEventAccess | delegateWithPrivateEventAccess | custom"],
  "emailAddress": {"@odata.type": "microsoft.graph.emailAddress"},
  "id": "String (identifier)",
  "isInsideOrganization": "Boolean",
  "isRemovable": "Boolean",
  "role": "none | freeBusyRead | limitedRead | read | write | delegateWithoutPrivateEventAccess | delegateWithPrivateEventAccess | custom"
}
```
