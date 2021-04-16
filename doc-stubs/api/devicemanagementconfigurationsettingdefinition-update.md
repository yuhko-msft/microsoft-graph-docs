---
title: "Update deviceManagementConfigurationSettingDefinition"
description: "Update the properties of a deviceManagementConfigurationSettingDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementConfigurationSettingDefinition
Namespace: microsoft.graph



Update the properties of a [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) object.

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
PATCH /deviceManagement/configurationSettings/{deviceManagementConfigurationSettingDefinitionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) object.

The following table shows the properties that are required when you update the [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accessTypes|deviceManagementConfigurationSettingAccessTypes|Read/write access mode of the setting. Possible values are: `none`, `add`, `copy`, `delete`, `get`, `replace`, `execute`.|
|applicability|[deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md)|Details which device setting is applicable on|
|baseUri|String|Base CSP Path|
|categoryId|String|Specifies the area group under which the setting is configured in a specified configuration service provider (CSP)|
|description|String|Description of the item|
|displayName|String|Display name of the item|
|helpText|String|Help text of the item|
|infoUrls|String collection|List of links more info for the setting can be found at|
|keywords|String collection|Tokens which to search settings on|
|name|String|Name of the item|
|occurrence|[deviceManagementConfigurationSettingOccurrence](../resources/devicemanagementconfigurationsettingoccurrence.md)|Indicates whether the setting is required or not|
|offsetUri|String|Offset CSP Path from Base|
|rootDefinitionId|String|Root setting definition if the setting is a child setting.|
|settingUsage|deviceManagementConfigurationSettingUsage|Setting type, for example, configuration and compliance. Possible values are: `none`, `configuration`.|
|uxBehavior|deviceManagementConfigurationControlType|Setting control type representation in the UX. Possible values are: `default`, `dropdown`, `smallTextBox`, `largeTextBox`, `toggle`, `multiheaderGrid`, `contextPane`.|
|version|String|Item Version|
|visibility|deviceManagementConfigurationSettingVisibility|Setting visibility scope to UX. Possible values are: `none`, `settingsCatalog`, `template`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementconfigurationsettingdefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/configurationSettings/{deviceManagementConfigurationSettingDefinitionId}
Content-Type: application/json
Content-length: 735

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingDefinition",
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
  "visibility": "String"
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
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingDefinition",
  "id": "0964154a-154a-0964-4a15-64094a156409",
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
  "visibility": "String"
}
```

