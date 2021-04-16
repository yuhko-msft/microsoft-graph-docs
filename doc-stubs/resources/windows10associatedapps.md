---
title: "windows10AssociatedApps resource type"
description: "Windows 10 Associated Application definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10AssociatedApps resource type

Namespace: microsoft.graph



Windows 10 Associated Application definition.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appType|windows10AppType|Application type. Possible values are: `desktop`, `universal`.|
|identifier|String|Identifier.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windows10AssociatedApps"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10AssociatedApps",
  "appType": "String",
  "identifier": "String"
}
```

