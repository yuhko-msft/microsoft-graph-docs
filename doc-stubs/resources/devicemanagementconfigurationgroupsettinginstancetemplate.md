---
title: "deviceManagementConfigurationGroupSettingInstanceTemplate resource type"
description: "Group Setting Instance Template"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationGroupSettingInstanceTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Group Setting Instance Template


Inherits from [deviceManagementConfigurationSettingInstanceTemplate](../resources/devicemanagementconfigurationsettinginstancetemplate.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|groupSettingValueTemplate|[deviceManagementConfigurationGroupSettingValueTemplate](../resources/devicemanagementconfigurationgroupsettingvaluetemplate.md)|Group Setting Value Template|
|isRequired|Boolean|Indicates if a policy must specify this setting. Inherited from [deviceManagementConfigurationSettingInstanceTemplate](../resources/devicemanagementconfigurationsettinginstancetemplate.md).|
|settingDefinitionId|String|Setting Definition Id Inherited from [deviceManagementConfigurationSettingInstanceTemplate](../resources/devicemanagementconfigurationsettinginstancetemplate.md).|
|settingInstanceTemplateId|String|Setting Instance Template Id Inherited from [deviceManagementConfigurationSettingInstanceTemplate](../resources/devicemanagementconfigurationsettinginstancetemplate.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationGroupSettingInstanceTemplate"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationGroupSettingInstanceTemplate",
  "isRequired": "Boolean",
  "settingDefinitionId": "String",
  "settingInstanceTemplateId": "String",
  "groupSettingValueTemplate": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationGroupSettingValueTemplate"
  }
}
```

