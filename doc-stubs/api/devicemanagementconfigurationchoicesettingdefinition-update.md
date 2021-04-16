---
title: "Update deviceManagementConfigurationChoiceSettingDefinition"
description: "Update the properties of a deviceManagementConfigurationChoiceSettingDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementConfigurationChoiceSettingDefinition
Namespace: microsoft.graph



Update the properties of a [deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /deviceManagementConfigurationChoiceSettingDefinition
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md) object.

The following table shows the properties that are required when you update the [deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accessTypes|deviceManagementConfigurationSettingAccessTypes|Read/write access mode of the setting Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `none`, `add`, `copy`, `delete`, `get`, `replace`, `execute`.|
|applicability|[deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md)|Details which device setting is applicable on Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|baseUri|String|Base CSP Path Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|categoryId|String|Specifies the area group under which the setting is configured in a specified configuration service provider (CSP) Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|description|String|Description of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|displayName|String|Display name of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|helpText|String|Help text of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|infoUrls|String collection|List of links more info for the setting can be found at Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|keywords|String collection|Tokens which to search settings on Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|name|String|Name of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|occurrence|[deviceManagementConfigurationSettingOccurrence](../resources/devicemanagementconfigurationsettingoccurrence.md)|Indicates whether the setting is required or not Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|offsetUri|String|Offset CSP Path from Base Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|rootDefinitionId|String|Root setting definition if the setting is a child setting. Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|settingUsage|deviceManagementConfigurationSettingUsage|Setting type, for example, configuration and compliance Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `none`, `configuration`.|
|uxBehavior|deviceManagementConfigurationControlType|Setting control type representation in the UX Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `default`, `dropdown`, `smallTextBox`, `largeTextBox`, `toggle`, `multiheaderGrid`, `contextPane`.|
|version|String|Item Version Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|visibility|deviceManagementConfigurationSettingVisibility|Setting visibility scope to UX Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `none`, `settingsCatalog`, `template`.|
|defaultOptionId|String|Default option for choice setting|
|options|[deviceManagementConfigurationOptionDefinition](../resources/devicemanagementconfigurationoptiondefinition.md) collection|Options for the setting that can be selected|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementconfigurationchoicesettingdefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagementConfigurationChoiceSettingDefinition
Content-Type: application/json
Content-length: 895

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationChoiceSettingDefinition",
  "accessTypes": "String",
  "applicability": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingApplicability"
  },
  "baseUri": "String",
  "categoryId": "String",
  "description": "String",
  "displayName": "String",
  "helpText": "String",
  "infoUrls": [
    "String"
  ],
  "keywords": [
    "String"
  ],
  "name": "String",
  "occurrence": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingOccurrence"
  },
  "offsetUri": "String",
  "rootDefinitionId": "String",
  "settingUsage": "String",
  "uxBehavior": "String",
  "version": "String",
  "visibility": "String",
  "defaultOptionId": "String",
  "options": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationOptionDefinition"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationChoiceSettingDefinition",
  "id": "89eb5e58-5e58-89eb-585e-eb89585eeb89",
  "accessTypes": "String",
  "applicability": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingApplicability"
  },
  "baseUri": "String",
  "categoryId": "String",
  "description": "String",
  "displayName": "String",
  "helpText": "String",
  "infoUrls": [
    "String"
  ],
  "keywords": [
    "String"
  ],
  "name": "String",
  "occurrence": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingOccurrence"
  },
  "offsetUri": "String",
  "rootDefinitionId": "String",
  "settingUsage": "String",
  "uxBehavior": "String",
  "version": "String",
  "visibility": "String",
  "defaultOptionId": "String",
  "options": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationOptionDefinition"
    }
  ]
}
```

