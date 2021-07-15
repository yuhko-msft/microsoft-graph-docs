---
title: "deviceManagementConfigurationIntegerSettingValueDefinitionTemplate resource type"
description: "Integer Setting Value Definition Template"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationIntegerSettingValueDefinitionTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Integer Setting Value Definition Template

## Properties
|Property|Type|Description|
|:---|:---|:---|
|maxValue|Int32|Integer Setting Maximum Value. Valid values -2147483648 to 2147483647|
|minValue|Int32|Integer Setting Minimum Value. Valid values -2147483648 to 2147483647|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationIntegerSettingValueDefinitionTemplate"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationIntegerSettingValueDefinitionTemplate",
  "maxValue": "Integer",
  "minValue": "Integer"
}
```

