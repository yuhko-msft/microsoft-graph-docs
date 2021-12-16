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
|analysisDateTime|DateTimeOffset|Time when the analysis took place.|
|detonationChain|String|Full blob of Detonation chain (shared in Name value pair).|
|detonationVerdict|String|Verdict coming from detonation.|
|detonationVerdictReason|String|Detailed verdict reason (if applicable).|
|observable|String|Full blob of observables.|

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
  "observable": "String",
  "analysisDateTime": "String (timestamp)",
  "detonationVerdict": "String",
  "detonationVerdictReason": "String",
  "detonationChain": "String"
}
```

