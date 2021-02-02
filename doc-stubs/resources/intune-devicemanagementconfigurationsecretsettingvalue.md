---
title: "deviceManagementConfigurationSecretSettingValue resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSecretSettingValue resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementConfigurationSimpleSettingValue](../resources/devicemanagementconfigurationsimplesettingvalue.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|settingValueTemplateReference|[deviceManagementConfigurationSettingValueTemplateReference](../resources/intune-devicemanagementconfigurationsettingvaluetemplatereference.md)|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingValue](../resources/intune-devicemanagementconfigurationsettingvalue.md)|
|value|String|**TODO: Add Description**|
|valueState|deviceManagementConfigurationSecretSettingValueState|**TODO: Add Description**. Possible values are: `invalid`, `notEncrypted`, `encryptedValueToken`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSecretSettingValue"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSecretSettingValue",
  "settingValueTemplateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingValueTemplateReference"
  },
  "value": "String",
  "valueState": "String"
}
```

