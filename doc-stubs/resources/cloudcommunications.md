---
title: "cloudCommunications resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudCommunications resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get cloudCommunications](../api/cloudcommunications-get.md)|[cloudCommunications](../resources/cloudcommunications.md)|Read the properties and relationships of a [cloudCommunications](../resources/cloudcommunications.md) object.|
|[Update cloudCommunications](../api/cloudcommunications-update.md)|[cloudCommunications](../resources/cloudcommunications.md)|Update the properties of a [cloudCommunications](../resources/cloudcommunications.md) object.|
|[getPresencesByUserId](../api/cloudcommunications-getpresencesbyuserid.md)|[presence](../resources/presence.md) collection|**TODO: Add Description**|
|[List callRecords](../api/cloudcommunications-list-callrecords.md)|[callRecord](../resources/callrecord.md) collection|Get the callRecord resources from the callRecords navigation property.|
|[Create callRecord](../api/cloudcommunications-post-callrecords.md)|[callRecord](../resources/callrecord.md)|Create a new callRecord object.|
|[List calls](../api/cloudcommunications-list-calls.md)|[call](../resources/call.md) collection|Get the call resources from the calls navigation property.|
|[Create call](../api/cloudcommunications-post-calls.md)|[call](../resources/call.md)|Create a new call object.|
|[List onlineMeetings](../api/cloudcommunications-list-onlinemeetings.md)|[onlineMeeting](../resources/onlinemeeting.md) collection|Get the onlineMeeting resources from the onlineMeetings navigation property.|
|[Create onlineMeeting](../api/cloudcommunications-post-onlinemeetings.md)|[onlineMeeting](../resources/onlinemeeting.md)|Create a new onlineMeeting object.|
|[List presences](../api/cloudcommunications-list-presences.md)|[presence](../resources/presence.md) collection|Get the presence resources from the presences navigation property.|
|[Create presence](../api/cloudcommunications-post-presences.md)|[presence](../resources/presence.md)|Create a new presence object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|callRecords|[callRecord](../resources/callrecord.md) collection|**TODO: Add Description**|
|calls|[call](../resources/call.md) collection|**TODO: Add Description**|
|onlineMeetings|[onlineMeeting](../resources/onlinemeeting.md) collection|**TODO: Add Description**|
|presences|[presence](../resources/presence.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudCommunications",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudCommunications",
  "id": "String (identifier)"
}
```

