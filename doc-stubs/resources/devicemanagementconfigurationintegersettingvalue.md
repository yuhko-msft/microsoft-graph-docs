---
title: "deviceManagementConfigurationIntegerSettingValue resource type"
description: "Simple setting value"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationIntegerSettingValue resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Simple setting value


Inherits from [deviceManagementConfigurationSimpleSettingValue](../resources/devicemanagementconfigurationsimplesettingvalue.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|settingValueTemplateReference|[deviceManagementConfigurationSettingValueTemplateReference](../resources/devicemanagementconfigurationsettingvaluetemplatereference.md)|Setting value template reference Inherited from [deviceManagementConfigurationSettingValue](../resources/devicemanagementconfigurationsettingvalue.md).|
|value|Int32|Value of the integer setting.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationIntegerSettingValue"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationIntegerSettingValue",
  "settingValueTemplateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingValueTemplateReference"
  },
  "value": "Integer"
}
```

