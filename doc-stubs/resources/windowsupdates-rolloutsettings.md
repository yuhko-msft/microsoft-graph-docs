---
title: "rolloutSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# rolloutSettings resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|devicesPerOffer|Int32|**TODO: Add Description**|
|durationBetweenOffers|String|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsUpdates.rolloutSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.rolloutSettings",
  "startDateTime": "String (timestamp)",
  "durationBetweenOffers": "String",
  "endDateTime": "String (timestamp)",
  "devicesPerOffer": "Integer"
}
```

