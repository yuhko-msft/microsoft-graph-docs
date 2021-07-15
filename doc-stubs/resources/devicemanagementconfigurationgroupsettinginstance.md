---
title: "deviceManagementConfigurationGroupSettingInstance resource type"
description: "Instance of a GroupSetting"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationGroupSettingInstance resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Instance of a GroupSetting


Inherits from [deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|groupSettingValue|[deviceManagementConfigurationGroupSettingValue](../resources/devicemanagementconfigurationgroupsettingvalue.md)|GroupSetting value|
|settingDefinitionId|String|Setting Definition Id Inherited from [deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md).|
|settingInstanceTemplateReference|[deviceManagementConfigurationSettingInstanceTemplateReference](../resources/devicemanagementconfigurationsettinginstancetemplatereference.md)|Setting Instance Template Reference Inherited from [deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationGroupSettingInstance"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationGroupSettingInstance",
  "settingDefinitionId": "String",
  "settingInstanceTemplateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstanceTemplateReference"
  },
  "groupSettingValue": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationGroupSettingValue"
  }
}
```

