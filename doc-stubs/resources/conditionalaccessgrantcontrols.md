---
title: "conditionalAccessGrantControls resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
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
|Relationship|Type|Description|
|:---|:---|:---|
|authenticationStrength|[authenticationStrengthPolicy](../resources/authenticationstrengthpolicy.md)|**TODO: Add Description**|

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
  "operator": "String",
  "builtInControls": [
    "String"
  ],
  "customAuthenticationFactors": [
    "String"
  ],
  "termsOfUse": [
    "String"
  ]
}
```

