---
title: "identityMatchingSettings resource type"
description: "Settings for how identities are matched across external systems."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# identityMatchingSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Settings for how identities are matched across external systems.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|externalIdMatchingStyle|identityMatchingStyle|Settings for how identities are matched across external systems. The possible values are: `globallyUnique`, `uniquePerSourceSystem`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.identityMatchingSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.identityMatchingSettings",
  "externalIdMatchingStyle": "String"
}
```

