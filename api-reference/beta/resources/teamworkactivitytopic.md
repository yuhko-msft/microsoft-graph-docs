---
title: "teamworkActivityTopic resource type"
description: "The location field of an activity notification"
author: "nkramer"
localization_priority: Normal
ms.prod: microsoft-teams
doc_type: resourcePageType
---

# teamworkActivityTopic resource type

Namespace: microsoft.graph

The location field (the second line) of an [activity notification](../api/team-sendactivitynotification.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|source | String | Represents the type of value in the `value` property. Possible values are: `entityUrl`, `text`.|
|value | String | Represents the value of the topic.|
|webUrl |String | Represents a web url to reach the given resource. This is optional if the `type` is of `graphResource` type.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamworkActivityTopic"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkActivityTopic",
  "source": "String",
  "value": "String",
  "webUrl": "String"
}
```
