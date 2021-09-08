---
title: "attackSimulationInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# attackSimulationInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|attackSimDateTime|DateTimeOffset|**TODO: Add Description**|
|attackSimDuration|String|**TODO: Add Description**|
|attackSimId|Guid|**TODO: Add Description**|
|attackSimUserId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.attackSimulationInfo"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.attackSimulationInfo",
  "attackSimId": "Guid",
  "attackSimDateTime": "String (timestamp)",
  "attackSimDuration": "String",
  "attackSimUserId": "String"
}
```

