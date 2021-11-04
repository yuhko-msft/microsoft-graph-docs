---
title: "plannerExternalSource resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# plannerExternalSource resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contextScenarioId|String|**TODO: Add Description**|
|displayLinkType|plannerExternalTaskSourceType|**TODO: Add Description**. The possible values are: `none`, `default`, `unknownFutureValue`.|
|displayNameSegments|String collection|**TODO: Add Description**|
|externalContextId|String|**TODO: Add Description**|
|externalObjectId|String|**TODO: Add Description**|
|externalObjectVersion|String|**TODO: Add Description**|
|ownerAppId|String|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.plannerExternalSource"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.plannerExternalSource",
  "externalObjectId": "String",
  "externalContextId": "String",
  "contextScenarioId": "String",
  "externalObjectVersion": "String",
  "webUrl": "String",
  "ownerAppId": "String",
  "displayLinkType": "String",
  "displayNameSegments": [
    "String"
  ]
}
```

