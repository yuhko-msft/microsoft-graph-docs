---
title: "deviceManagementSettingEnrollmentTypeConstraint resource type"
description: "Constraint that enforces the enrollment types applied to a setting"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementSettingEnrollmentTypeConstraint resource type

Namespace: microsoft.graph



Constraint that enforces the enrollment types applied to a setting


Inherits from [deviceManagementConstraint](../resources/devicemanagementconstraint.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|enrollmentTypes|String collection|List of enrollment types|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementSettingEnrollmentTypeConstraint"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementSettingEnrollmentTypeConstraint",
  "enrollmentTypes": [
    "String"
  ]
}
```

