---
title: "deviceManagementConfigurationSettingGroupCollectionInstance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSettingGroupCollectionInstance resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|settingDefinitionId|String|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingInstance](../resources/intune-devicemanagementconfigurationsettinginstance.md)|
|settingGroupCollectionValue|[deviceManagementConfigurationSettingGroupInstance](../resources/intune-devicemanagementconfigurationsettinggroupinstance.md) collection|**TODO: Add Description**|
|settingInstanceTemplateReference|[deviceManagementConfigurationSettingInstanceTemplateReference](../resources/intune-devicemanagementconfigurationsettinginstancetemplatereference.md)|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingInstance](../resources/intune-devicemanagementconfigurationsettinginstance.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingGroupCollectionInstance"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingGroupCollectionInstance",
  "settingDefinitionId": "String",
  "settingInstanceTemplateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstanceTemplateReference"
  },
  "settingGroupCollectionValue": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingGroupInstance"
    }
  ]
}
```

