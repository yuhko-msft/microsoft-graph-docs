---
title: "deviceManagementConfigurationChoiceSettingCollectionInstanceTemplate resource type"
description: "Choice Setting Collection Instance Template"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationChoiceSettingCollectionInstanceTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Choice Setting Collection Instance Template


Inherits from [deviceManagementConfigurationSettingInstanceTemplate](../resources/devicemanagementconfigurationsettinginstancetemplate.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowUnmanagedValues|Boolean|Linked policy may append values which are not present in the template.|
|choiceSettingCollectionValueTemplate|[deviceManagementConfigurationChoiceSettingValueTemplate](../resources/devicemanagementconfigurationchoicesettingvaluetemplate.md) collection|Choice Setting Collection Value Template|
|isRequired|Boolean|Indicates if a policy must specify this setting. Inherited from [deviceManagementConfigurationSettingInstanceTemplate](../resources/devicemanagementconfigurationsettinginstancetemplate.md).|
|settingDefinitionId|String|Setting Definition Id Inherited from [deviceManagementConfigurationSettingInstanceTemplate](../resources/devicemanagementconfigurationsettinginstancetemplate.md).|
|settingInstanceTemplateId|String|Setting Instance Template Id Inherited from [deviceManagementConfigurationSettingInstanceTemplate](../resources/devicemanagementconfigurationsettinginstancetemplate.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationChoiceSettingCollectionInstanceTemplate"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationChoiceSettingCollectionInstanceTemplate",
  "isRequired": "Boolean",
  "settingDefinitionId": "String",
  "settingInstanceTemplateId": "String",
  "allowUnmanagedValues": "Boolean",
  "choiceSettingCollectionValueTemplate": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationChoiceSettingValueTemplate"
    }
  ]
}
```

