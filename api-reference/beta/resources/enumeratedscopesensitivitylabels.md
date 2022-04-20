---
title: "enumeratedScopeSensitivityLabels resource type"
description: "microsoft.graph.enumeratedScopeSensitivityLabels"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# enumeratedScopeSensitivityLabels resource type

Namespace: microsoft.graph.enumeratedScopeSensitivityLabels

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The derived type when only sepcific sensitivity labels on a resource app are pre-approved for consent. When this type is used, consent are allowed **ONLY** for sensitivity labels tha are specified in the policy. If the client application requests more sensitivity labels after the policy is created, the policy will not apply.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|labelKind|labelKind|It indicates what kind of sensitivity label has been icnluded. Possible values: `all` for all sensitivity labels are allowed, or `enumerated` for a selected set of sensitivity labels from a signle resource application are allowed.  Required.|
|sensitivityLabels|[scopeSensitivityLabels](../resources/scopesensitivitylabels.md)|The sensitivity labels that are applicable to the scope type and has been pre-approved. It allows you to protect sensitive organizational data. Learn about [sensitivity labels](/microsoft-365/compliance/sensitivity-labels) 
> **Note:** Chat resource **does not** support sensitivityLabels yet. Please set labelKind to `all` for all sensitivity labels are allowed.

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

