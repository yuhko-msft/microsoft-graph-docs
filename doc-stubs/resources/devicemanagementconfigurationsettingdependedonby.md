---
title: "deviceManagementConfigurationSettingDependedOnBy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSettingDependedOnBy resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dependedOnBy|String|Identifier of child setting that is dependent on the current setting|
|required|Boolean|Value that determines if the child setting is required based on the parent setting's selection|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingDependedOnBy"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingDependedOnBy",
  "dependedOnBy": "String",
  "required": "Boolean"
}
```

