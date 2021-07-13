---
title: "deviceManagementConfigurationChoiceSettingValueTemplate resource type"
description: "Choice Setting Value Template"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationChoiceSettingValueTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Choice Setting Value Template

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|[deviceManagementConfigurationChoiceSettingValueDefaultTemplate](../resources/devicemanagementconfigurationchoicesettingvaluedefaulttemplate.md)|Choice Setting Value Default Template.|
|recommendedValueDefinition|[deviceManagementConfigurationChoiceSettingValueDefinitionTemplate](../resources/devicemanagementconfigurationchoicesettingvaluedefinitiontemplate.md)|Recommended definition override.|
|requiredValueDefinition|[deviceManagementConfigurationChoiceSettingValueDefinitionTemplate](../resources/devicemanagementconfigurationchoicesettingvaluedefinitiontemplate.md)|Required definition override.|
|settingValueTemplateId|String|Setting Value Template Id|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationChoiceSettingValueTemplate"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationChoiceSettingValueTemplate",
  "defaultValue": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationChoiceSettingValueDefaultTemplate"
  },
  "recommendedValueDefinition": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationChoiceSettingValueDefinitionTemplate"
  },
  "requiredValueDefinition": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationChoiceSettingValueDefinitionTemplate"
  },
  "settingValueTemplateId": "String"
}
```

