---
title: "outlookTask resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# outlookTask resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [outlookItem](outlookitem.md)

## Methods

| Method                                                                                             | Return Type                                                                             | Description                                                                                                 |
| :------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------- |
| [List outlookTask](../api/outlooktask-list.md)                                                     | [outlookTask](outlookTask.md) collection                                                | List properties and relationships of an outlookTask object.                                                 |
| [Create outlookTask](../api/outlooktask-create.md)                                                 | [outlookTask](outlookTask.md)                                                           | Create a new outlookTask object.                                                                            |
| [Get outlookTask](../api/outlooktask-get.md)                                                       | [outlookTask](outlookTask.md)                                                           | Read properties and relationships of an outlookTask object.                                                 |
| [Update outlookTask](../api/outlooktask-update.md)                                                 | [outlookTask](outlookTask.md)                                                           | Update the properties of an outlookTask object.                                                             |
| [Delete outlookTask](../api/outlooktask-delete.md)                                                 |                                                                                         | Delete an outlookTask object.                                                                               |
| [complete](../api/outlooktask-complete.md)                                                         |                                                                                         |                                                                                                             |
| [List attachments](../api/outlooktask-list-attachments.md)                                         | [attachment](../resources/-attachment.md)                                               | Get the attachment objects from an attachments navigation property.                                         |
| [Create attachments](../api/outlooktask-post-attachments.md)                                       | [attachment](../resources/-attachment.md)                                               | Create a new attachment object.                                                                             |
| [Get attachments](../api/outlooktask-get-attachments.md)                                           | [attachment](../resources/-attachment.md)                                               | Read the properties and relationships of an attachment object.                                              |
| [Update attachments](../api/outlooktask-update-attachments.md)                                     | [attachment](../resources/-attachment.md)                                               | Update the properties of an attachment object.                                                              |
| [Delete attachments](../api/outlooktask-delete-attachments.md)                                     |                                                                                         | Delete an attachment object.                                                                                |
| [List multiValueExtendedProperties](../api/outlooktask-list-multivalueextendedproperties.md)       | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Get the multiValueLegacyExtendedProperty objects from a multiValueExtendedProperties navigation property.   |
| [Create multiValueExtendedProperties](../api/outlooktask-post-multivalueextendedproperties.md)     | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Create a new multiValueLegacyExtendedProperty object.                                                       |
| [Get multiValueExtendedProperties](../api/outlooktask-get-multivalueextendedproperties.md)         | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Read the properties and relationships of a multiValueLegacyExtendedProperty object.                         |
| [Update multiValueExtendedProperties](../api/outlooktask-update-multivalueextendedproperties.md)   | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Update the properties of a multiValueLegacyExtendedProperty object.                                         |
| [Delete multiValueExtendedProperties](../api/outlooktask-delete-multivalueextendedproperties.md)   |                                                                                         | Delete a multiValueLegacyExtendedProperty object.                                                           |
| [List singleValueExtendedProperties](../api/outlooktask-list-singlevalueextendedproperties.md)     | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Get the singleValueLegacyExtendedProperty objects from a singleValueExtendedProperties navigation property. |
| [Create singleValueExtendedProperties](../api/outlooktask-post-singlevalueextendedproperties.md)   | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Create a new singleValueLegacyExtendedProperty object.                                                      |
| [Get singleValueExtendedProperties](../api/outlooktask-get-singlevalueextendedproperties.md)       | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Read the properties and relationships of a singleValueLegacyExtendedProperty object.                        |
| [Update singleValueExtendedProperties](../api/outlooktask-update-singlevalueextendedproperties.md) | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Update the properties of a singleValueLegacyExtendedProperty object.                                        |
| [Delete singleValueExtendedProperties](../api/outlooktask-delete-singlevalueextendedproperties.md) |                                                                                         | Delete a singleValueLegacyExtendedProperty object.                                                          |

## Properties

| Property             | Type                                                       | Description |
| :------------------- | :--------------------------------------------------------- | :---------- |
| assignedTo           | String                                                     |             |
| body                 | [itemBody](../resources/itembody.md)                       |             |
| categories           | String collection                                          |             |
| changeKey            | String                                                     |             |
| completedDateTime    | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| createdDateTime      | DateTimeOffset                                             |             |
| dueDateTime          | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| hasAttachments       | Boolean                                                    |             |
| id                   | String                                                     | Read-only.  |
| importance           | String                                                     |             |
| isReminderOn         | Boolean                                                    |             |
| lastModifiedDateTime | DateTimeOffset                                             |             |
| owner                | String                                                     |             |
| parentFolderId       | String                                                     |             |
| recurrence           | [patternedRecurrence](../resources/patternedrecurrence.md) |             |
| reminderDateTime     | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| sensitivity          | String                                                     |             |
| startDateTime        | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| status               | String                                                     |             |
| subject              | String                                                     |             |

## Relationships

| Relationship                  | Type                                                                                              | Description |
| :---------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| attachments                   | [attachment](../resources/attachment.md) collection                                               |             |
| multiValueExtendedProperties  | [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection   |             |
| singleValueExtendedProperties | [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookTask",
  "baseType": "microsoft.graph.outlookItem",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.outlookTask",
  "assignedTo": "String",
  "body": {"@odata.type": "microsoft.graph.itemBody"},
  "categories": ["String"],
  "changeKey": "String",
  "completedDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "createdDateTime": "DateTimeOffset",
  "dueDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "hasAttachments": "Boolean",
  "id": "String (identifier)",
  "importance": "low | normal | high",
  "isReminderOn": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "owner": "String",
  "parentFolderId": "String",
  "recurrence": {"@odata.type": "microsoft.graph.patternedRecurrence"},
  "reminderDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "sensitivity": "normal | personal | private | confidential",
  "startDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "status": "notStarted | inProgress | completed | waitingOnOthers | deferred",
  "subject": "String"
}
```
