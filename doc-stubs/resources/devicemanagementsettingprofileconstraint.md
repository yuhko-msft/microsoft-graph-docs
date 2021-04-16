---
title: "deviceManagementSettingProfileConstraint resource type"
description: "Constraint enforcing a given profile metadata"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementSettingProfileConstraint resource type

Namespace: microsoft.graph



Constraint enforcing a given profile metadata


Inherits from [deviceManagementConstraint](../resources/devicemanagementconstraint.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|source|String|The source of the entity|
|types|String collection|A collection of types this entity carries|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementSettingProfileConstraint"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementSettingProfileConstraint",
  "source": "String",
  "types": [
    "String"
  ]
}
```

