---
title: "submissionResult resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# submissionResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|group|submissionResultGroup|**TODO: Add Description**. The possible values are: `none`, `underInvestigation`, `simulatedThreat`, `allowedBySecOps`, `allowedByThirdPartyFilters`.|
|info|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.submissionResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.submissionResult",
  "group": "String",
  "info": "String"
}
```

