---
title: "deviceManagementSettingAbstractImplementationConstraint resource type"
description: "Constraint that enforces an AbstractComplex type has or is set to a particular value"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementSettingAbstractImplementationConstraint resource type

Namespace: microsoft.graph



Constraint that enforces an AbstractComplex type has or is set to a particular value


Inherits from [deviceManagementConstraint](../resources/devicemanagementconstraint.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedAbstractImplementationDefinitionIds|String collection|List of value which means not configured for the setting|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementSettingAbstractImplementationConstraint"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementSettingAbstractImplementationConstraint",
  "allowedAbstractImplementationDefinitionIds": [
    "String"
  ]
}
```

