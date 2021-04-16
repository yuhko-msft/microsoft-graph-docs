---
title: "timeCardBreak resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# timeCardBreak resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|breakId|String|**TODO: Add Description**|
|end|[timeCardEvent](../resources/timecardevent.md)|**TODO: Add Description**|
|notes|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|start|[timeCardEvent](../resources/timecardevent.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.timeCardBreak"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.timeCardBreak",
  "breakId": "String",
  "end": {
    "@odata.type": "microsoft.graph.timeCardEvent"
  },
  "notes": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "start": {
    "@odata.type": "microsoft.graph.timeCardEvent"
  }
}
```

