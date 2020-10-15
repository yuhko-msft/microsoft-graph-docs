---
title: "calendar resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# calendar resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                          | Return Type                                                                             | Description                                                                                                 |
| :---------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------- |
| [List calendar](../api/calendar-list.md)                                                        | [calendar](calendar.md) collection                                                      | List properties and relationships of a calendar object.                                                     |
| [Create calendar](../api/calendar-create.md)                                                    | [calendar](calendar.md)                                                                 | Create a new calendar object.                                                                               |
| [Get calendar](../api/calendar-get.md)                                                          | [calendar](calendar.md)                                                                 | Read properties and relationships of a calendar object.                                                     |
| [Update calendar](../api/calendar-update.md)                                                    | [calendar](calendar.md)                                                                 | Update the properties of a calendar object.                                                                 |
| [Delete calendar](../api/calendar-delete.md)                                                    |                                                                                         | Delete a calendar object.                                                                                   |
| [getSchedule](../api/calendar-getSchedule.md)                                                   |                                                                                         |                                                                                                             |
| [allowedCalendarSharingRoles](../api/calendar-allowedCalendarSharingRoles.md)                   |                                                                                         |                                                                                                             |
| [List calendarPermissions](../api/calendar-list-calendarpermissions.md)                         | [calendarPermission](../resources/-calendarpermission.md)                               | Get the calendarPermission objects from a calendarPermissions navigation property.                          |
| [Create calendarPermissions](../api/calendar-post-calendarpermissions.md)                       | [calendarPermission](../resources/-calendarpermission.md)                               | Create a new calendarPermission object.                                                                     |
| [Get calendarPermissions](../api/calendar-get-calendarpermissions.md)                           | [calendarPermission](../resources/-calendarpermission.md)                               | Read the properties and relationships of a calendarPermission object.                                       |
| [Update calendarPermissions](../api/calendar-update-calendarpermissions.md)                     | [calendarPermission](../resources/-calendarpermission.md)                               | Update the properties of a calendarPermission object.                                                       |
| [Delete calendarPermissions](../api/calendar-delete-calendarpermissions.md)                     |                                                                                         | Delete a calendarPermission object.                                                                         |
| [List calendarView](../api/calendar-list-calendarview.md)                                       | [event](../resources/-event.md)                                                         | Get the event objects from a calendarView navigation property.                                              |
| [Create calendarView](../api/calendar-post-calendarview.md)                                     | [event](../resources/-event.md)                                                         | Create a new event object.                                                                                  |
| [Get calendarView](../api/calendar-get-calendarview.md)                                         | [event](../resources/-event.md)                                                         | Read the properties and relationships of an event object.                                                   |
| [Update calendarView](../api/calendar-update-calendarview.md)                                   | [event](../resources/-event.md)                                                         | Update the properties of an event object.                                                                   |
| [Delete calendarView](../api/calendar-delete-calendarview.md)                                   |                                                                                         | Delete an event object.                                                                                     |
| [List events](../api/calendar-list-events.md)                                                   | [event](../resources/-event.md)                                                         | Get the event objects from an events navigation property.                                                   |
| [Create events](../api/calendar-post-events.md)                                                 | [event](../resources/-event.md)                                                         | Create a new event object.                                                                                  |
| [Get events](../api/calendar-get-events.md)                                                     | [event](../resources/-event.md)                                                         | Read the properties and relationships of an event object.                                                   |
| [Update events](../api/calendar-update-events.md)                                               | [event](../resources/-event.md)                                                         | Update the properties of an event object.                                                                   |
| [Delete events](../api/calendar-delete-events.md)                                               |                                                                                         | Delete an event object.                                                                                     |
| [List multiValueExtendedProperties](../api/calendar-list-multivalueextendedproperties.md)       | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Get the multiValueLegacyExtendedProperty objects from a multiValueExtendedProperties navigation property.   |
| [Create multiValueExtendedProperties](../api/calendar-post-multivalueextendedproperties.md)     | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Create a new multiValueLegacyExtendedProperty object.                                                       |
| [Get multiValueExtendedProperties](../api/calendar-get-multivalueextendedproperties.md)         | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Read the properties and relationships of a multiValueLegacyExtendedProperty object.                         |
| [Update multiValueExtendedProperties](../api/calendar-update-multivalueextendedproperties.md)   | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Update the properties of a multiValueLegacyExtendedProperty object.                                         |
| [Delete multiValueExtendedProperties](../api/calendar-delete-multivalueextendedproperties.md)   |                                                                                         | Delete a multiValueLegacyExtendedProperty object.                                                           |
| [List singleValueExtendedProperties](../api/calendar-list-singlevalueextendedproperties.md)     | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Get the singleValueLegacyExtendedProperty objects from a singleValueExtendedProperties navigation property. |
| [Create singleValueExtendedProperties](../api/calendar-post-singlevalueextendedproperties.md)   | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Create a new singleValueLegacyExtendedProperty object.                                                      |
| [Get singleValueExtendedProperties](../api/calendar-get-singlevalueextendedproperties.md)       | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Read the properties and relationships of a singleValueLegacyExtendedProperty object.                        |
| [Update singleValueExtendedProperties](../api/calendar-update-singlevalueextendedproperties.md) | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Update the properties of a singleValueLegacyExtendedProperty object.                                        |
| [Delete singleValueExtendedProperties](../api/calendar-delete-singlevalueextendedproperties.md) |                                                                                         | Delete a singleValueLegacyExtendedProperty object.                                                          |

## Properties

| Property                      | Type                                         | Description |
| :---------------------------- | :------------------------------------------- | :---------- |
| allowedOnlineMeetingProviders | String collection                            |             |
| calendarGroupId               | String                                       |             |
| canEdit                       | Boolean                                      |             |
| canShare                      | Boolean                                      |             |
| canViewPrivateItems           | Boolean                                      |             |
| changeKey                     | String                                       |             |
| color                         | String                                       |             |
| defaultOnlineMeetingProvider  | String                                       |             |
| hexColor                      | String                                       |             |
| id                            | String                                       | Read-only.  |
| isDefaultCalendar             | Boolean                                      |             |
| isRemovable                   | Boolean                                      |             |
| isShared                      | Boolean                                      |             |
| isSharedWithMe                | Boolean                                      |             |
| isTallyingResponses           | Boolean                                      |             |
| name                          | String                                       |             |
| owner                         | [emailAddress](../resources/emailaddress.md) |             |

## Relationships

| Relationship                  | Type                                                                                              | Description |
| :---------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| calendarPermissions           | [calendarPermission](../resources/calendarpermission.md) collection                               |             |
| calendarView                  | [event](../resources/event.md) collection                                                         |             |
| events                        | [event](../resources/event.md) collection                                                         |             |
| multiValueExtendedProperties  | [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection   |             |
| singleValueExtendedProperties | [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.calendar",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.calendar",
  "allowedOnlineMeetingProviders": ["unknown | skypeForBusiness | skypeForConsumer | teamsForBusiness"],
  "calendarGroupId": "String",
  "canEdit": "Boolean",
  "canShare": "Boolean",
  "canViewPrivateItems": "Boolean",
  "changeKey": "String",
  "color": "lightBlue | lightGreen | auto | lightOrange | lightGray | lightYellow | lightTeal | lightPink | lightBrown | lightRed | maxColor",
  "defaultOnlineMeetingProvider": "unknown | skypeForBusiness | skypeForConsumer | teamsForBusiness",
  "hexColor": "String",
  "id": "String (identifier)",
  "isDefaultCalendar": "Boolean",
  "isRemovable": "Boolean",
  "isShared": "Boolean",
  "isSharedWithMe": "Boolean",
  "isTallyingResponses": "Boolean",
  "name": "String",
  "owner": {"@odata.type": "microsoft.graph.emailAddress"}
}
```
