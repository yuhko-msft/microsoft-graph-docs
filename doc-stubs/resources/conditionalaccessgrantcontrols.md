---
title: "conditionalAccessGrantControls resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# conditionalAccessGrantControls resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|builtInControls|conditionalAccessGrantControl collection|**TODO: Add Description**|
|customAuthenticationFactors|String collection|**TODO: Add Description**|
|operator|String|**TODO: Add Description**|
|termsOfUse|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.conditionalAccessGrantControls"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.conditionalAccessGrantControls",
  "builtInControls": [
    "String"
  ],
  "customAuthenticationFactors": [
    "String"
  ],
  "operator": "String",
  "termsOfUse": [
    "String"
  ]
}
```

