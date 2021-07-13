---
title: "edgeSearchEngine resource type"
description: "Allows IT admins to set a predefined default search engine for MDM-Controlled devices."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# edgeSearchEngine resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Allows IT admins to set a predefined default search engine for MDM-Controlled devices.


Inherits from [edgeSearchEngineBase](../resources/edgesearchenginebase.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|edgeSearchEngineType|edgeSearchEngineType|Allows IT admins to set a predefined default search engine for MDM-Controlled devices. Possible values are: `default`, `bing`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.edgeSearchEngine"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.edgeSearchEngine",
  "edgeSearchEngineType": "String"
}
```

