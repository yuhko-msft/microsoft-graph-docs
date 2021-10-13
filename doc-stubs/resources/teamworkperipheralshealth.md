---
title: "teamworkPeripheralsHealth resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamworkPeripheralsHealth resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|communicationSpeaker|[teamworkPeripheralHealth](../resources/teamworkperipheralhealth.md)|**TODO: Add Description**|
|contentCamera|[teamworkPeripheralHealth](../resources/teamworkperipheralhealth.md)|**TODO: Add Description**|
|displays|[teamworkPeripheralHealth](../resources/teamworkperipheralhealth.md) collection|**TODO: Add Description**|
|microphone|[teamworkPeripheralHealth](../resources/teamworkperipheralhealth.md)|**TODO: Add Description**|
|roomCamera|[teamworkPeripheralHealth](../resources/teamworkperipheralhealth.md)|**TODO: Add Description**|
|speaker|[teamworkPeripheralHealth](../resources/teamworkperipheralhealth.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamworkPeripheralsHealth"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkPeripheralsHealth",
  "roomCamera": {
    "@odata.type": "microsoft.graph.teamworkPeripheralHealth"
  },
  "contentCamera": {
    "@odata.type": "microsoft.graph.teamworkPeripheralHealth"
  },
  "speaker": {
    "@odata.type": "microsoft.graph.teamworkPeripheralHealth"
  },
  "communicationSpeaker": {
    "@odata.type": "microsoft.graph.teamworkPeripheralHealth"
  },
  "displays": [
    {
      "@odata.type": "microsoft.graph.teamworkPeripheralHealth"
    }
  ],
  "microphone": {
    "@odata.type": "microsoft.graph.teamworkPeripheralHealth"
  }
}
```

