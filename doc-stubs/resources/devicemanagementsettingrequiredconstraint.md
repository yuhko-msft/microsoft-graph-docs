---
title: "deviceManagementSettingRequiredConstraint resource type"
description: "Constraint that enforces a particular required setting that is not null/undefined/empty string/not configured"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementSettingRequiredConstraint resource type

Namespace: microsoft.graph



Constraint that enforces a particular required setting that is not null/undefined/empty string/not configured


Inherits from [deviceManagementConstraint](../resources/devicemanagementconstraint.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|notConfiguredValue|String|List of value which means not configured for the setting|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementSettingRequiredConstraint"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementSettingRequiredConstraint",
  "notConfiguredValue": "String"
}
```

