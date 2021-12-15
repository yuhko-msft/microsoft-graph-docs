---
title: "attackSimulationInfo resource type"
description: "If one email is attack simulation email, the email threat submission will contain attack simulation information."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# attackSimulationInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

If one email is attack simulation email, the email threat submission will contain attack simulation information.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|attackSimDateTime|DateTimeOffset|The attack simulation date time.|
|attackSimDurationTime|Duration|The attack simulation duration time.|
|attackSimId|Guid|The attack simulation activity id.|
|attackSimUserId|String|The attack simulation user id.|

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
  "attackSimDurationTime": "String (duration)",
  "attackSimUserId": "String"
}
```

