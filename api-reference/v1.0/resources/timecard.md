---
title: "timecard resource type"
description: "A timecard entry in the schedule."
author: "akumar39"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: resourcePageType_
---

# timecard resource type

Namespace: microsoft.graph

A timecard entry in the schedule.

## Methods

| Method       | Return Type  |Description|
|:---------------|:--------|:----------|
|[List](../api/timecard-list.md) | [timecard](timecard.md) collection | Get the list of **timecard** objects in this schedule.|
|[Create](../api/timecard-create.md) | [timecard](timecard.md) | Create a new **timecard** object.|
|[Get](../api/timecard-get.md) | [timecard](timecard.md) | Get a **timecard** object by ID.|
|[Put](../api/timecard-put.md) | [timecard](timecard.md) | Replace a **timecard** object.|
|[Patch](../api/timecard-patch.md) | [timecard](timecard.md) | Replace a **timecard** object.|
|[Delete](../api/timecard-delete.md) | None | Delete a **timecard** object from the schedule.|

## Properties
|Name          |Type           |Description                                                                                                                                      |
|--------------|---------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
| id			|`string`      |ID of the **timecard**.|
| userId 			|`string`      |ID of the user assigned to the **timecard**. Required.|
| sharedtimecard 	| [timecardItem](timecarditem.md)  |The shared version of this **timecard** that is viewable by both employees and managers. Required.|
| drafttimecard		| [timecardItem](timecarditem.md)        |The draft version of this **timecard** that is viewable by managers. Required.|
| createdDateTime		|`Datetimecardset`        |The time stamp at which this **timecard** was first created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. |
| lastModifiedDateTime		|`Datetimecardset`        |The time stamp at which this **timecard** was last updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. |
| lastModifiedBy		| [identitySet](identityset.md)        |The identity that last updated this **timecard**. |
| isStagedForDeletion | `Edm.Boolean` | Indicates whether the **timecard** is staged for deletion |

|Property               |Type           |Description                                                                |
|-----------------------|---------------|---------------------------------------------------------------------------|
| id			        |`string`  |Id of the `timeCard`|
| userId			        |`string` |User ID to which the `timeCard` belongs to |
| state 		        |`timeCardState`  | The current state of the `timeCard` during its life cycle  |
| clockIn       |`timeCardEvent`    | The clock-in event of the `timeCard` |
| clockOut			        |`timeCardEvent`  |The clock-out event of the `timeCard` |
| notes			        |`microsoft.graph.itemBody`  |Notes about the `timeCard` |
| breaks 	|`Collection(timeCardBreak)`    |The list of breaks associated with the `timeCard`|
| originalEntry| `timeCardEntry` | The original `timeCardEntry` of the `timeCard`, before user edits |
| confirmedBy |`confirmedBy`    | Indicate if this `timeCard` entry is confirmed |
|createdDateTime|`Edm.dateTimeOffset`| The timestamp in which the `timeCard` was created |
|createdBy|`IdentitySet`| Identity of the person who created the entity |
|lastModifiedDateTime|`dateTimeOffset`| The timestamp in which the `timeCard` was last modified|
|lastModifiedBy| `IdentitySet`| Identity of the person who last modified the entity|

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.timecard",
   "baseType":"microsoft.graph.changeTrackedEntity"
}-->

```json
{
  "userId": "string (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": {"@odata.type":"microsoft.graph.identitySet"},
  "sharedtimecard": {"@odata.type":"microsoft.graph.timecardItem"},
  "drafttimecard": {"@odata.type":"microsoft.graph.timecardItem"}
}
```


<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "timecard resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": []
}
-->
