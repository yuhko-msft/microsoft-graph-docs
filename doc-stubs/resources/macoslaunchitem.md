---
title: "macOSLaunchItem resource type"
description: "Represents an app in the list of macOS launch items"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSLaunchItem resource type

Namespace: microsoft.graph



Represents an app in the list of macOS launch items

## Properties
|Property|Type|Description|
|:---|:---|:---|
|hide|Boolean|Whether or not to hide the item from the Users and Groups List.|
|path|String|Path to the launch item.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.macOSLaunchItem"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSLaunchItem",
  "hide": "Boolean",
  "path": "String"
}
```

