---
title: "deviceManagementConfigurationSettingGroupInstance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSettingGroupInstance resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|settingDefinitionId|String|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingInstance](../resources/intune-devicemanagementconfigurationsettinginstance.md)|
|settingGroupValue|[deviceManagementConfigurationSettingInstance](../resources/intune-devicemanagementconfigurationsettinginstance.md) collection|**TODO: Add Description**|
|settingInstanceTemplateReference|[deviceManagementConfigurationSettingInstanceTemplateReference](../resources/intune-devicemanagementconfigurationsettinginstancetemplatereference.md)|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingInstance](../resources/intune-devicemanagementconfigurationsettinginstance.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingGroupInstance"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingGroupInstance",
  "settingDefinitionId": "String",
  "settingInstanceTemplateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstanceTemplateReference"
  },
  "settingGroupValue": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationChoiceSettingInstance"
    }
  ]
}
```

