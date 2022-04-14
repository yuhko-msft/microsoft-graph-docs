---
title: "allScopeSensitivityLabels resource type"
description: "Namespace: microsoft.graph.allScopeSensitivityLabels"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# allScopeSensitivityLabels resource type

Namespace: microsoft.graph.allScopeSensitivityLabels

The derived type when all sensitivity labels from any resource app are pre-approved for consent. When this type is used, if the client application requests more sensitivity labels after the policy is created, the policy will still apply.

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties
|Property|Type|Description|
|:---|:---|:---|
|labelKind|labelKind|It indicates what kind of sensitivity label has been icnluded. Possible values: `all` for all sensitivity labels are allowed, or `enumerated` for a selected set of sensitivity labels from a signle resource application are allowed.  Required.|
> **Note:** Chat resource **does not** support sensitivityLabels yet. Please set labelKind to `all` for all sensitivity labels are allowed.

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.allScopeSensitivityLabels"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.allScopeSensitivityLabels",
  "labelKind": "String"
}
```

