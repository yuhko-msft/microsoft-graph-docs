---
title: "deviceManagementConfigurationStringSettingValueTemplate resource type"
description: "String Setting Value Template"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationStringSettingValueTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

String Setting Value Template


Inherits from [deviceManagementConfigurationSimpleSettingValueTemplate](../resources/devicemanagementconfigurationsimplesettingvaluetemplate.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|[deviceManagementConfigurationStringSettingValueDefaultTemplate](../resources/devicemanagementconfigurationstringsettingvaluedefaulttemplate.md)|String Setting Value Default Template.|
|settingValueTemplateId|String|Setting Value Template Id Inherited from [deviceManagementConfigurationSimpleSettingValueTemplate](../resources/devicemanagementconfigurationsimplesettingvaluetemplate.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationStringSettingValueTemplate"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationStringSettingValueTemplate",
  "settingValueTemplateId": "String",
  "defaultValue": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationStringSettingValueDefaultTemplate"
  }
}
```

