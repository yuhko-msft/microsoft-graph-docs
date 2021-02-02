---
title: "deviceManagementConfigurationIntegerSettingValueTemplate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationIntegerSettingValueTemplate resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementConfigurationSimpleSettingValueTemplate](../resources/devicemanagementconfigurationsimplesettingvaluetemplate.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|[deviceManagementConfigurationIntegerSettingValueDefaultTemplate](../resources/intune-devicemanagementconfigurationintegersettingvaluedefaulttemplate.md)|**TODO: Add Description**|
|recommendedValueDefinition|[deviceManagementConfigurationIntegerSettingValueDefinitionTemplate](../resources/intune-devicemanagementconfigurationintegersettingvaluedefinitiontemplate.md)|**TODO: Add Description**|
|requiredValueDefinition|[deviceManagementConfigurationIntegerSettingValueDefinitionTemplate](../resources/intune-devicemanagementconfigurationintegersettingvaluedefinitiontemplate.md)|**TODO: Add Description**|
|settingValueTemplateId|String|**TODO: Add Description** Inherited from [deviceManagementConfigurationSimpleSettingValueTemplate](../resources/intune-devicemanagementconfigurationsimplesettingvaluetemplate.md)|

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

