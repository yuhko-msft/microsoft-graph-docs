---
title: "qualityUpdateReference resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# qualityUpdateReference resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A reference to specific quality update content.


Inherits from [windowsUpdateReference](../resources/windowsupdates-windowsupdatereference.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|classification|qualityUpdateClassification|Specifies the classification of the referenced content. Possible values are: `all`, `security`, `nonSecurity`.|
|releaseDate|DateTimeOffset|Specifies a quality update in the given servicingChannel with the given classification by date (i.e. the last update published on the specified date). Default value is security.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsUpdates.qualityUpdateReference"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.qualityUpdateReference",
  "classification": "String",
  "releaseDate": "String (timestamp)"
}
```

