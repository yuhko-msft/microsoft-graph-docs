---
title: "answerVariant resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# answerVariant resource type

Namespace: microsoft.graph.search

An answer variant can be used to to change certain fields of a search answer based on country or platform.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Answer variation description shown on search results page.|
|displayName|String|Answer variation name displayed in search results.|
|webUrl|String|Answer variation url link. When users click this answer variation in search results they will go to this url.|
|languageTags|String collection|List of countries or regions able to view this search answer.|
|platforms|devicePlatformType collection|List of devices and OS able to view this search answer. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|


## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.answerVariant"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.answerVariant",
  "displayName": "String",
  "webUrl": "String",
  "description": "String",
  "languageTag": "String",
  "platform": "String"
}
```

