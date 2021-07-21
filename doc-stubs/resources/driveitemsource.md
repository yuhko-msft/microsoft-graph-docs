---
title: "driveItemSource resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# driveItemSource resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|application|driveItemSourceApplication|**TODO: Add Description**. Possible values are: `teams`, `yammer`, `sharePoint`, `oneDrive`, `stream`, `powerPoint`, `office`, `unknownFutureValue`.|
|externalId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.driveItemSource"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.driveItemSource",
  "application": "String",
  "externalId": "String"
}
```

