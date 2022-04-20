---
title: "scopeSensitivityLabels resource type"
description: "Allow admins to protect and regulate access to sensitive organizational content."
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# scopeSensitivityLabels resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A scopeSensitivityLabels describes a sensitivity level **ONLY** for the group. It allows you to protect sensitive organizational data. Learn about [sensitivity labels](/microsoft-365/compliance/sensitivity-labels)


## Properties
|Property|Type|Description|
|:---|:---|:---|
|labelKind|labelKind|It indicates what kind of sensitivity label has been icnluded. Possible values: `all` for all sensitivity labels are allowed, or `enumerated` for a selected set of sensitivity labels from a signle resource application are allowed.  Required.|

> **Note:** Chat resource **does not** support scopeSensitivityLabels yet. Please set labelKind to `all` for all sensitivity labels are allowed.

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

