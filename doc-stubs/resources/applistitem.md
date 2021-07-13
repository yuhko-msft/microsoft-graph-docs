---
title: "appListItem resource type"
description: "Represents an app in the list of managed applications"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# appListItem resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents an app in the list of managed applications

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appId|String|The application or bundle identifier of the application|
|appStoreUrl|String|The Store URL of the application|
|name|String|The application name|
|publisher|String|The publisher of the application|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.appListItem"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.appListItem",
  "appId": "String",
  "appStoreUrl": "String",
  "name": "String",
  "publisher": "String"
}
```

