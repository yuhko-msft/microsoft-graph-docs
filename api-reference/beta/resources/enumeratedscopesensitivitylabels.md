---
title: "enumeratedScopeSensitivityLabels resource type"
description: "**TODO: Add Description**"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# enumeratedScopeSensitivityLabels resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description need Teams help**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|labelKind|labelKind|It indicates what kind of sensitivity label has been icnluded. Possible values: `all` for all sensitivity labels are allowed, or `enumerated` for a selected set of sensitivity labels from a signle resource application are allowed.  Required.|
|sensitivityLabels|String collection|The sensitivity labels that are applicable to the scope type and has been pre-approved. Sensitivity label is a pre-existing things, defined at tenant level. It is exposed to customer through informationProtection/policy/label API. Required.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.enumeratedScopeSensitivityLabels"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.enumeratedScopeSensitivityLabels",
  "labelKind": "String",
  "sensitivityLabels": [
    "String"
  ]
}
```

