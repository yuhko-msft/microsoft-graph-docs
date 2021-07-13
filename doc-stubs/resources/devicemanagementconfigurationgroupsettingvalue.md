---
title: "deviceManagementConfigurationGroupSettingValue resource type"
description: "Value of the GroupSetting"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationGroupSettingValue resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Value of the GroupSetting


Inherits from [deviceManagementConfigurationSettingValue](../resources/devicemanagementconfigurationsettingvalue.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|children|[deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md) collection|Collection of child setting instances contained within this GroupSetting|
|settingValueTemplateReference|[deviceManagementConfigurationSettingValueTemplateReference](../resources/devicemanagementconfigurationsettingvaluetemplatereference.md)|Setting value template reference Inherited from [deviceManagementConfigurationSettingValue](../resources/devicemanagementconfigurationsettingvalue.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationGroupSettingValue"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationGroupSettingValue",
  "settingValueTemplateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingValueTemplateReference"
  },
  "children": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationChoiceSettingCollectionInstance"
    }
  ]
}
```

