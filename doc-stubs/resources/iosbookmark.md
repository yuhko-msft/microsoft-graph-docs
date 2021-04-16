---
title: "iosBookmark resource type"
description: "iOS URL bookmark"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosBookmark resource type

Namespace: microsoft.graph



iOS URL bookmark

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bookmarkFolder|String|The folder into which the bookmark should be added in Safari|
|displayName|String|The display name of the bookmark|
|url|String|URL allowed to access|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosBookmark"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosBookmark",
  "bookmarkFolder": "String",
  "displayName": "String",
  "url": "String"
}
```

