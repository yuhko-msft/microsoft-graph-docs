---
title: "translationPreferences resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# translationPreferences resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|languageOverrides|[translationLanguageOverride](../resources/translationlanguageoverride.md) collection|**TODO: Add Description**|
|translationBehavior|translationBehavior|**TODO: Add Description**. Possible values are: `Ask`, `Yes`, `No`.|
|untranslatedLanguages|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.translationPreferences"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.translationPreferences",
  "languageOverrides": [
    {
      "@odata.type": "microsoft.graph.translationLanguageOverride"
    }
  ],
  "translationBehavior": "String",
  "untranslatedLanguages": [
    "String"
  ]
}
```

