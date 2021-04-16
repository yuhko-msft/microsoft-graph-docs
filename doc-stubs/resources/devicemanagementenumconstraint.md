---
title: "deviceManagementEnumConstraint resource type"
description: "Constraint that enforces the setting value is from a permitted set of strings"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementEnumConstraint resource type

Namespace: microsoft.graph



Constraint that enforces the setting value is from a permitted set of strings


Inherits from [deviceManagementConstraint](../resources/devicemanagementconstraint.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|values|[deviceManagementEnumValue](../resources/devicemanagementenumvalue.md) collection|List of valid values for this string|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementEnumConstraint"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementEnumConstraint",
  "values": [
    {
      "@odata.type": "microsoft.graph.deviceManagementEnumValue"
    }
  ]
}
```

