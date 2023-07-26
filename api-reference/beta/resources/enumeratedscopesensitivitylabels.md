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

The derived type is when only specific sensitivity labels on a resource app are pre-approved for consent. When this type is used, consent is allowed **ONLY** for sensitivity labels that are specified in the policy. If the client application requests more sensitivity labels after the policy is created, the policy will not apply.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|labelKind|labelKind|It indicates what kind of sensitivity label has been included. Possible value: `enumerated` for a selected set of sensitivity labels from a single resource application is allowed.  Required.|
|sensitivityLabels|String collection|The sensitivity labels that are applicable to the scope type and has been pre-approved. It allows you to protect sensitive organizational data. Learn about [sensitivity labels](/microsoft-365/compliance/sensitivity-labels) 

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

