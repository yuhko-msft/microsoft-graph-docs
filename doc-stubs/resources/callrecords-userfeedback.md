---
title: "userFeedback resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userFeedback resource type

Namespace: microsoft.graph.callRecords

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|rating|userFeedbackRating|**TODO: Add Description**. Possible values are: `notRated`, `bad`, `poor`, `fair`, `good`, `excellent`, `unknownFutureValue`.|
|text|String|**TODO: Add Description**|
|tokens|[microsoft.graph.callRecords.feedbackTokenSet](../resources/callrecords-feedbacktokenset.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.callRecords.userFeedback"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.callRecords.userFeedback",
  "rating": "String",
  "text": "String",
  "tokens": {
    "@odata.type": "microsoft.graph.callRecords.feedbackTokenSet"
  }
}
```

