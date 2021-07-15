---
title: "segment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# segment resource type

Namespace: microsoft.graph.callRecords

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/callrecords-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List segments](../api/callrecords-segment-list.md)|[microsoft.graph.callRecords.segment](../resources/callrecords-segment.md) collection|Get a list of the [segment](../resources/callrecords-segment.md) objects and their properties.|
|[Create segment](../api/callrecords-segment-create.md)|[microsoft.graph.callRecords.segment](../resources/callrecords-segment.md)|Create a new [segment](../resources/callrecords-segment.md) object.|
|[Get segment](../api/callrecords-segment-get.md)|[microsoft.graph.callRecords.segment](../resources/callrecords-segment.md)|Read the properties and relationships of a [segment](../resources/callrecords-segment.md) object.|
|[Update segment](../api/callrecords-segment-update.md)|[microsoft.graph.callRecords.segment](../resources/callrecords-segment.md)|Update the properties of a [segment](../resources/callrecords-segment.md) object.|
|[Delete segment](../api/callrecords-segment-delete.md)|None|Deletes a [segment](../resources/callrecords-segment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|callee|[microsoft.graph.callRecords.endpoint](../resources/callrecords-endpoint.md)|**TODO: Add Description**|
|caller|[microsoft.graph.callRecords.endpoint](../resources/callrecords-endpoint.md)|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|failureInfo|[microsoft.graph.callRecords.failureInfo](../resources/callrecords-failureinfo.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/callrecords-entity.md).|
|media|[microsoft.graph.callRecords.media](../resources/callrecords-media.md) collection|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.callRecords.segment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.callRecords.segment",
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
  "media": [
    {
      "@odata.type": "microsoft.graph.callRecords.media"
    }
  ],
  "startDateTime": "String (timestamp)"
}
```

