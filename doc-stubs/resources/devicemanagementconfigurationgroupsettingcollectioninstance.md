---
title: "deviceManagementConfigurationGroupSettingCollectionInstance resource type"
description: "Instance of a GroupSettingCollection"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationGroupSettingCollectionInstance resource type

Namespace: microsoft.graph



Instance of a GroupSettingCollection


Inherits from [deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|groupSettingCollectionValue|[deviceManagementConfigurationGroupSettingValue](../resources/devicemanagementconfigurationgroupsettingvalue.md) collection|A collection of GroupSetting values|
|settingDefinitionId|String|Setting Definition Id Inherited from [deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationGroupSettingCollectionInstance"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationGroupSettingCollectionInstance",
  "settingDefinitionId": "String",
  "groupSettingCollectionValue": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationGroupSettingValue"
    }
  ]
}
```

