---
title: "participantEndpoint resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# participantEndpoint resource type

Namespace: microsoft.graph.callRecords

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [endpoint](../resources/callrecords-endpoint.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|feedback|[microsoft.graph.callRecords.userFeedback](../resources/callrecords-userfeedback.md)|**TODO: Add Description**|
|identity|[microsoft.graph.identitySet](../resources/callrecords-identityset.md)|**TODO: Add Description**|
|userAgent|[microsoft.graph.callRecords.userAgent](../resources/callrecords-useragent.md)|**TODO: Add Description** Inherited from [endpoint](../resources/callrecords-endpoint.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.callRecords.participantEndpoint"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.callRecords.participantEndpoint",
  "userAgent": {
    "@odata.type": "microsoft.graph.callRecords.userAgent"
  },
  "feedback": {
    "@odata.type": "microsoft.graph.callRecords.userFeedback"
  },
  "identity": {
    "@odata.type": "microsoft.graph.identitySet"
  }
}
```

