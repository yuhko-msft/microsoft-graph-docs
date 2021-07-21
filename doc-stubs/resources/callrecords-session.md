---
title: "session resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# session resource type

Namespace: microsoft.graph.callRecords

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/callrecords-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sessions](../api/callrecords-session-list.md)|[microsoft.graph.callRecords.session](../resources/callrecords-session.md) collection|Get a list of the [session](../resources/callrecords-session.md) objects and their properties.|
|[Create session](../api/callrecords-session-create.md)|[microsoft.graph.callRecords.session](../resources/callrecords-session.md)|Create a new [session](../resources/callrecords-session.md) object.|
|[Get session](../api/callrecords-session-get.md)|[microsoft.graph.callRecords.session](../resources/callrecords-session.md)|Read the properties and relationships of a [session](../resources/callrecords-session.md) object.|
|[Update session](../api/callrecords-session-update.md)|[microsoft.graph.callRecords.session](../resources/callrecords-session.md)|Update the properties of a [session](../resources/callrecords-session.md) object.|
|[Delete session](../api/callrecords-session-delete.md)|None|Deletes a [session](../resources/callrecords-session.md) object.|
|[List segments](../api/callrecords-session-list-segments.md)|[microsoft.graph.callRecords.segment](../resources/callrecords-segment.md) collection|Get the segment resources from the segments navigation property.|
|[Create segment](../api/callrecords-session-post-segments.md)|[microsoft.graph.callRecords.segment](../resources/callrecords-segment.md)|Create a new segment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|callee|[microsoft.graph.callRecords.endpoint](../resources/callrecords-endpoint.md)|**TODO: Add Description**|
|caller|[microsoft.graph.callRecords.endpoint](../resources/callrecords-endpoint.md)|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|failureInfo|[microsoft.graph.callRecords.failureInfo](../resources/callrecords-failureinfo.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/callrecords-entity.md).|
|modalities|modality collection|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|segments|[microsoft.graph.callRecords.segment](../resources/callrecords-segment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.callRecords.session",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.callRecords.session",
  "id": "String (identifier)",
  "callee": {
    "@odata.type": "microsoft.graph.callRecords.endpoint"
  },
  "caller": {
    "@odata.type": "microsoft.graph.callRecords.endpoint"
  },
  "endDateTime": "String (timestamp)",
  "failureInfo": {
    "@odata.type": "microsoft.graph.callRecords.failureInfo"
  },
  "modalities": [
    "String"
  ],
  "startDateTime": "String (timestamp)"
}
```

