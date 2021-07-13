---
title: "deviceManagementConfigurationSimpleSettingInstance resource type"
description: "Simple setting instance"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSimpleSettingInstance resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Simple setting instance


Inherits from [deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|settingDefinitionId|String|Setting Definition Id Inherited from [deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md).|
|settingInstanceTemplateReference|[deviceManagementConfigurationSettingInstanceTemplateReference](../resources/devicemanagementconfigurationsettinginstancetemplatereference.md)|Setting Instance Template Reference Inherited from [deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md).|
|simpleSettingValue|[deviceManagementConfigurationSimpleSettingValue](../resources/devicemanagementconfigurationsimplesettingvalue.md)|Simple setting instance value|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSimpleSettingInstance"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSimpleSettingInstance",
  "settingDefinitionId": "String",
  "settingInstanceTemplateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstanceTemplateReference"
  },
  "simpleSettingValue": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSimpleSettingValue"
  }
}
```

