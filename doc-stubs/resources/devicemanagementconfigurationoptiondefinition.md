---
title: "deviceManagementConfigurationOptionDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationOptionDefinition resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dependedOnBy|[deviceManagementConfigurationSettingDependedOnBy](../resources/devicemanagementconfigurationsettingdependedonby.md) collection|List of Settings that depends on this option|
|dependentOn|[deviceManagementConfigurationDependentOn](../resources/devicemanagementconfigurationdependenton.md) collection|List of dependent settings for this option|
|description|String|Description of the option|
|displayName|String|Friendly name of the option|
|helpText|String|Help text of the option|
|itemId|String|Identifier of option|
|name|String|Name of the option|
|optionValue|[deviceManagementConfigurationSettingValue](../resources/devicemanagementconfigurationsettingvalue.md)|Value of the option|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationOptionDefinition"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationOptionDefinition",
  "dependedOnBy": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingDependedOnBy"
    }
  ],
  "dependentOn": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationDependentOn"
    }
  ],
  "description": "String",
  "displayName": "String",
  "helpText": "String",
  "itemId": "String",
  "name": "String",
  "optionValue": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingValue"
  }
}
```

