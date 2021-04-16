---
title: "deviceManagementConfigurationStringSettingValueDefinition resource type"
description: "String constraints"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationStringSettingValueDefinition resource type

Namespace: microsoft.graph



String constraints


Inherits from [deviceManagementConfigurationSettingValueDefinition](../resources/devicemanagementconfigurationsettingvaluedefinition.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|format|deviceManagementConfigurationStringFormat|Pre-defined format of the string. Possible values are: `none`, `email`, `guid`, `ip`, `base64`, `url`, `version`, `xml`, `date`, `time`, `binary`, `regEx`, `json`, `dateTime`, `surfaceHub`.|
|inputValidationSchema|String|Regular expression or any xml or json schema that the input string should match|
|isSecret|Boolean|Specifies whether the setting needs to be treated as a secret. Settings marked as yes will be encrypted in transit and at rest and will be displayed as asterisks when represented in the UX.|
|maximumLength|Int64|Maximum length of string. Valid values 0 to 87516|
|minimumLength|Int64|Minimum length of string. Valid values 0 to 87516|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationStringSettingValueDefinition"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationStringSettingValueDefinition",
  "format": "String",
  "inputValidationSchema": "String",
  "isSecret": "Boolean",
  "maximumLength": "Integer",
  "minimumLength": "Integer"
}
```

