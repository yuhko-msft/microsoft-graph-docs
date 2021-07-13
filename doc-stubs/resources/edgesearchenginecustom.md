---
title: "edgeSearchEngineCustom resource type"
description: "Allows IT admins to set a custom default search engine for MDM-Controlled devices."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# edgeSearchEngineCustom resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Allows IT admins to set a custom default search engine for MDM-Controlled devices.


Inherits from [edgeSearchEngineBase](../resources/edgesearchenginebase.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|edgeSearchEngineOpenSearchXmlUrl|String|Points to a https link containing the OpenSearch xml file that contains, at minimum, the short name and the URL to the search Engine.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.edgeSearchEngineCustom"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.edgeSearchEngineCustom",
  "edgeSearchEngineOpenSearchXmlUrl": "String"
}
```

