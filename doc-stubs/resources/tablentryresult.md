---
title: "tablEntryResult resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# tablEntryResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|entryType|String|**TODO: Add Description**|
|expirationDate|String|**TODO: Add Description**|
|identity|String|**TODO: Add Description**|
|tablResult|tablResult|**TODO: Add Description**. The possible values are: `failed`, `success`, `skipped`, `unknownFutureValue`.|
|value|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.tablEntryResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.tablEntryResult",
  "identity": "String",
  "value": "String",
  "entryType": "String",
  "expirationDate": "String",
  "tablResult": "String"
}
```

