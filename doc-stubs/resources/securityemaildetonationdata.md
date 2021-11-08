---
title: "securityEmailDetonationData resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityEmailDetonationData resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|analysisTime|DateTimeOffset|**TODO: Add Description**|
|detonationChain|String|**TODO: Add Description**|
|detonationVerdict|String|**TODO: Add Description**|
|detonationVerdictReason|String|**TODO: Add Description**|
|observables|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.securityEmailDetonationData"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityEmailDetonationData",
  "observables": "String",
  "analysisTime": "String (timestamp)",
  "detonationVerdict": "String",
  "detonationVerdictReason": "String",
  "detonationChain": "String"
}
```

