---
title: "deviceManagementConfigurationGroupSettingCollectionInstanceTemplate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationGroupSettingCollectionInstanceTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [deviceManagementConfigurationSettingInstanceTemplate](../resources/devicemanagementconfigurationsettinginstancetemplate.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowUnmanagedValues|Boolean|**TODO: Add Description**|
|groupSettingCollectionValueTemplate|[deviceManagementConfigurationGroupSettingValueTemplate](../resources/intune-devicemanagementconfigurationgroupsettingvaluetemplate.md) collection|**TODO: Add Description**|
|isRequired|Boolean|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingInstanceTemplate](../resources/intune-devicemanagementconfigurationsettinginstancetemplate.md)|
|settingDefinitionId|String|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingInstanceTemplate](../resources/intune-devicemanagementconfigurationsettinginstancetemplate.md)|
|settingInstanceTemplateId|String|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingInstanceTemplate](../resources/intune-devicemanagementconfigurationsettinginstancetemplate.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationGroupSettingCollectionInstanceTemplate"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationGroupSettingCollectionInstanceTemplate",
  "settingInstanceTemplateId": "String",
  "settingDefinitionId": "String",
  "isRequired": "Boolean",
  "groupSettingCollectionValueTemplate": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationGroupSettingValueTemplate"
    }
  ],
  "allowUnmanagedValues": "Boolean"
}
```

