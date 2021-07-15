---
title: "deviceManagementConfigurationSettingInstanceTemplate resource type"
description: "Setting Instance Template"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSettingInstanceTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Setting Instance Template
This is an abstract type.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|isRequired|Boolean|Indicates if a policy must specify this setting.|
|settingDefinitionId|String|Setting Definition Id|
|settingInstanceTemplateId|String|Setting Instance Template Id|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstanceTemplate"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingInstanceTemplate",
  "isRequired": "Boolean",
  "settingDefinitionId": "String",
  "settingInstanceTemplateId": "String"
}
```

