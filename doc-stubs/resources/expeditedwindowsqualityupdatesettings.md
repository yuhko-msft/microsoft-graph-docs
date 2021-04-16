---
title: "expeditedWindowsQualityUpdateSettings resource type"
description: "A complex type to store the expedited quality update settings such as release date and days until forced reboot."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# expeditedWindowsQualityUpdateSettings resource type

Namespace: microsoft.graph



A complex type to store the expedited quality update settings such as release date and days until forced reboot.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|daysUntilForcedReboot|Int32|The number of days after installation that forced reboot will happen.|
|qualityUpdateRelease|String|The release date to identify a quality update.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.expeditedWindowsQualityUpdateSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.expeditedWindowsQualityUpdateSettings",
  "daysUntilForcedReboot": "Integer",
  "qualityUpdateRelease": "String"
}
```

