---
title: "calendarGroup resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# calendarGroup resource type

Namespace: microsoft.graph

## Methods

| Method                                                       | Return Type                                  | Description                                                    |
| :----------------------------------------------------------- | :------------------------------------------- | :------------------------------------------------------------- |
| [List calendarGroup](../api/calendargroup-list.md)           | [calendarGroup](calendarGroup.md) collection | List properties and relationships of a calendarGroup object.   |
| [Create calendarGroup](../api/calendargroup-create.md)       | [calendarGroup](calendarGroup.md)            | Create a new calendarGroup object.                             |
| [Get calendarGroup](../api/calendargroup-get.md)             | [calendarGroup](calendarGroup.md)            | Read properties and relationships of a calendarGroup object.   |
| [Update calendarGroup](../api/calendargroup-update.md)       | [calendarGroup](calendarGroup.md)            | Update the properties of a calendarGroup object.               |
| [Delete calendarGroup](../api/calendargroup-delete.md)       |                                              | Delete a calendarGroup object.                                 |
| [List calendars](../api/calendargroup-list-calendars.md)     | [calendar](../resources/-calendar.md)        | Get the calendar objects from a calendars navigation property. |
| [Create calendars](../api/calendargroup-post-calendars.md)   | [calendar](../resources/-calendar.md)        | Create a new calendar object.                                  |
| [Get calendars](../api/calendargroup-get-calendars.md)       | [calendar](../resources/-calendar.md)        | Read the properties and relationships of a calendar object.    |
| [Update calendars](../api/calendargroup-update-calendars.md) | [calendar](../resources/-calendar.md)        | Update the properties of a calendar object.                    |
| [Delete calendars](../api/calendargroup-delete-calendars.md) |                                              | Delete a calendar object.                                      |

## Properties

| Property  | Type   | Description |
| :-------- | :----- | :---------- |
| changeKey | String |             |
| classId   | Guid   |             |
| id        | String | Read-only.  |
| name      | String |             |

## Relationships

| Relationship | Type                                            | Description |
| :----------- | :---------------------------------------------- | :---------- |
| calendars    | [calendar](../resources/calendar.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.calendarGroup",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.calendarGroup",
  "changeKey": "String",
  "classId": "Guid",
  "id": "String (identifier)",
  "name": "String"
}
```
