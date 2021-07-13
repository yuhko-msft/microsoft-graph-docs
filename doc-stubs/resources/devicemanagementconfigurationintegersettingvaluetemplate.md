---
title: "deviceManagementConfigurationIntegerSettingValueTemplate resource type"
description: "Integer Setting Value Template"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationIntegerSettingValueTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Integer Setting Value Template


Inherits from [deviceManagementConfigurationSimpleSettingValueTemplate](../resources/devicemanagementconfigurationsimplesettingvaluetemplate.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|[deviceManagementConfigurationIntegerSettingValueDefaultTemplate](../resources/devicemanagementconfigurationintegersettingvaluedefaulttemplate.md)|Integer Setting Value Default Template.|
|recommendedValueDefinition|[deviceManagementConfigurationIntegerSettingValueDefinitionTemplate](../resources/devicemanagementconfigurationintegersettingvaluedefinitiontemplate.md)|Recommended value definition.|
|requiredValueDefinition|[deviceManagementConfigurationIntegerSettingValueDefinitionTemplate](../resources/devicemanagementconfigurationintegersettingvaluedefinitiontemplate.md)|Required value definition.|
|settingValueTemplateId|String|Setting Value Template Id Inherited from [deviceManagementConfigurationSimpleSettingValueTemplate](../resources/devicemanagementconfigurationsimplesettingvaluetemplate.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationIntegerSettingValueTemplate"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationIntegerSettingValueTemplate",
  "settingValueTemplateId": "String",
  "defaultValue": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationIntegerSettingValueDefaultTemplate"
  },
  "recommendedValueDefinition": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationIntegerSettingValueDefinitionTemplate"
  },
  "requiredValueDefinition": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationIntegerSettingValueDefinitionTemplate"
  }
}
```

