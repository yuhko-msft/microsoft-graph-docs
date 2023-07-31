---
title: "scopeSensitivityLabels resource type"
description: "A scopeSensitivityLabels describes when consent is allowed for what sensitivity labels are specified in the policy"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# scopeSensitivityLabels resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A scopeSensitivityLabels describes a sensitivity level **ONLY** for the group. It allows you to protect sensitive organizational data. Learn about [sensitivity labels](/microsoft-365/compliance/sensitivity-labels)
A scopeSensitivityLabels type describes a sensitivity level **ONLY** for the group. It allows you to protect sensitive organizational data based on sensitivity labels. This is an abstract base type and cannot be used directly. Instead, use one of the following derived types:
* [allscopesensitivitylabels](allscopesensitivitylabels.md) for indicating all sensitivity labels are pre-approved
* [enumeratedscopesensitivitylabels](enumeratedscopesensitivitylabels.md) for indicating that only the specified sensitivity labels have been pre-approved

## Properties
|Property|Type|Description|
|:---|:---|:---|
|labelKind|String|Indicates what kind of sensitivity label has been included. Possible values: `all` for all sensitivity labels are allowed, or `enumerated` for a selected set of sensitivity labels from a single resource application are allowed.  Required.|

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

