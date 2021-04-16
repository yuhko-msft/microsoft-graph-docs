---
title: "meetingAttendanceReport resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# meetingAttendanceReport resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List meetingAttendanceReports](../api/meetingattendancereport-list.md)|[meetingAttendanceReport](../resources/meetingattendancereport.md) collection|Get a list of the [meetingAttendanceReport](../resources/meetingattendancereport.md) objects and their properties.|
|[Create meetingAttendanceReport](../api/meetingattendancereport-create.md)|[meetingAttendanceReport](../resources/meetingattendancereport.md)|Create a new [meetingAttendanceReport](../resources/meetingattendancereport.md) object.|
|[Get meetingAttendanceReport](../api/meetingattendancereport-get.md)|[meetingAttendanceReport](../resources/meetingattendancereport.md)|Read the properties and relationships of a [meetingAttendanceReport](../resources/meetingattendancereport.md) object.|
|[Update meetingAttendanceReport](../api/meetingattendancereport-update.md)|[meetingAttendanceReport](../resources/meetingattendancereport.md)|Update the properties of a [meetingAttendanceReport](../resources/meetingattendancereport.md) object.|
|[Delete meetingAttendanceReport](../api/meetingattendancereport-delete.md)|None|Deletes a [meetingAttendanceReport](../resources/meetingattendancereport.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|attendanceRecords|[attendanceRecord](../resources/attendancerecord.md) collection|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.meetingAttendanceReport",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.meetingAttendanceReport",
  "id": "String (identifier)",
  "attendanceRecords": [
    {
      "@odata.type": "microsoft.graph.attendanceRecord"
    }
  ]
}
```

