---
title: "answerVariant resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# answerVariant resource type

Namespace: microsoft.graph

An Answer Variant can be used to to change certain fields of the answer depending on country or platform

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Answer variation description|
|displayName|String|Answer variation display name|
|webUrl|String|Answer variation URL|
|languageTags|String collection|List of countries or regions able to view this bookmark|
|platforms|devicePlatformType collection|List of devices and OS able to view this bookmark. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|


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

