---
title: "scopeSensitivityLabels resource type"
description: "**TODO: Add Description**"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# scopeSensitivityLabels resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|labelKind|labelKind|It indicates what kind of sensitivity label has been icnluded. Possible values: `all` for all sensitivity labels are allowed, or `enumerated` for a selected set of sensitivity labels from a signle resource application are allowed.  Required.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.scopeSensitivityLabels"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.scopeSensitivityLabels",
  "labelKind": "String"
}
```

