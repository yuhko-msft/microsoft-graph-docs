---
title: "deviceManagementConfigurationChoiceSettingValueTemplate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationChoiceSettingValueTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|[deviceManagementConfigurationChoiceSettingValueDefaultTemplate](../resources/intune-devicemanagementconfigurationchoicesettingvaluedefaulttemplate.md)|**TODO: Add Description**|
|recommendedValueDefinition|[deviceManagementConfigurationChoiceSettingValueDefinitionTemplate](../resources/intune-devicemanagementconfigurationchoicesettingvaluedefinitiontemplate.md)|**TODO: Add Description**|
|requiredValueDefinition|[deviceManagementConfigurationChoiceSettingValueDefinitionTemplate](../resources/intune-devicemanagementconfigurationchoicesettingvaluedefinitiontemplate.md)|**TODO: Add Description**|
|settingValueTemplateId|String|**TODO: Add Description**|

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

