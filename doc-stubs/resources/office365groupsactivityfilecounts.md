---
title: "office365GroupsActivityFileCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365GroupsActivityFileCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365GroupsActivityFileCounts](../api/office365groupsactivityfilecounts-list.md)|[office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md) collection|Get a list of the [office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md) objects and their properties.|
|[Create office365GroupsActivityFileCounts](../api/office365groupsactivityfilecounts-create.md)|[office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md)|Create a new [office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md) object.|
|[Get office365GroupsActivityFileCounts](../api/office365groupsactivityfilecounts-get.md)|[office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md)|Read the properties and relationships of an [office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md) object.|
|[Update office365GroupsActivityFileCounts](../api/office365groupsactivityfilecounts-update.md)|[office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md)|Update the properties of an [office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md) object.|
|[Delete office365GroupsActivityFileCounts](../api/office365groupsactivityfilecounts-delete.md)|None|Deletes an [office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|active|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|total|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365GroupsActivityFileCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365GroupsActivityFileCounts",
  "id": "String (identifier)",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "total": "Integer"
}
```

