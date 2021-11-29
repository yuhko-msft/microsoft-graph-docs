---
title: "credential resource type"
description: "Base type for all kinds of credentials supported in the industryData API."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# credential resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base type for all kinds of credentials supported in the industryData API.
This is an abstract type.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the credential.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.credential"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.credential",
  "displayName": "String"
}
```

