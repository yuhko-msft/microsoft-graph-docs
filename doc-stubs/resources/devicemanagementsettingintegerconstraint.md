---
title: "deviceManagementSettingIntegerConstraint resource type"
description: "Constraint enforcing the permitted value range for an integer setting"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementSettingIntegerConstraint resource type

Namespace: microsoft.graph



Constraint enforcing the permitted value range for an integer setting


Inherits from [deviceManagementConstraint](../resources/devicemanagementconstraint.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|maximumValue|Int32|The maximum permitted value|
|minimumValue|Int32|The minimum permitted value|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementSettingIntegerConstraint"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementSettingIntegerConstraint",
  "maximumValue": "Integer",
  "minimumValue": "Integer"
}
```

