---
title: "iosWebContentFilterAutoFilter resource type"
description: "Represents an iOS Web Content Filter setting type, which enables iOS automatic filter feature and allows for additional URL access control. When constructed with no property values, the iOS device will enable the automatic filter regardless."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosWebContentFilterAutoFilter resource type

Namespace: microsoft.graph



Represents an iOS Web Content Filter setting type, which enables iOS automatic filter feature and allows for additional URL access control. When constructed with no property values, the iOS device will enable the automatic filter regardless.


Inherits from [iosWebContentFilterBase](../resources/ioswebcontentfilterbase.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedUrls|String collection|Additional URLs allowed for access|
|blockedUrls|String collection|Additional URLs blocked for access|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosWebContentFilterAutoFilter"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosWebContentFilterAutoFilter",
  "allowedUrls": [
    "String"
  ],
  "blockedUrls": [
    "String"
  ]
}
```

