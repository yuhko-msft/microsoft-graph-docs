---
title: "Create deviceManagementConfigurationSettingDefinition"
description: "Create a new deviceManagementConfigurationSettingDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementConfigurationSettingDefinition
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new deviceManagementConfigurationSettingDefinition object.

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
POST /deviceManagement/reusableSettings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md) object.

The following table shows the properties that are required when you create the [deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|applicability|[deviceManagementConfigurationSettingApplicability](../resources/intune-devicemanagementconfigurationsettingapplicability.md)|**TODO: Add Description**|
|accessTypes|deviceManagementConfigurationSettingAccessTypes|**TODO: Add Description**. Possible values are: `none`, `add`, `copy`, `delete`, `get`, `replace`, `execute`.|
|keywords|String collection|**TODO: Add Description**|
|infoUrls|String collection|**TODO: Add Description**|
|occurrence|[deviceManagementConfigurationSettingOccurrence](../resources/intune-devicemanagementconfigurationsettingoccurrence.md)|**TODO: Add Description**|
|baseUri|String|**TODO: Add Description**|
|offsetUri|String|**TODO: Add Description**|
|rootDefinitionId|String|**TODO: Add Description**|
|categoryId|String|**TODO: Add Description**|
|settingUsage|deviceManagementConfigurationSettingUsage|**TODO: Add Description**. Possible values are: `none`, `configuration`.|
|uxBehavior|deviceManagementConfigurationControlType|**TODO: Add Description**. Possible values are: `default`, `dropdown`, `smallTextBox`, `largeTextBox`, `toggle`, `multiheaderGrid`, `contextPane`.|
|visibility|deviceManagementConfigurationSettingVisibility|**TODO: Add Description**. Possible values are: `none`, `settingsCatalog`, `template`.|
|referredSettingInformationList|[deviceManagementConfigurationReferredSettingInformation](../resources/intune-devicemanagementconfigurationreferredsettinginformation.md) collection|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|helpText|String|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|version|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementconfigurationsettingdefinition_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/reusableSettings
Content-Type: application/json
Content-length: 890

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingDefinition",
  "applicability": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingApplicability"
  },
  "accessTypes": "String",
  "keywords": [
    "String"
  ],
  "infoUrls": [
    "String"
  ],
  "occurrence": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingOccurrence"
  },
  "baseUri": "String",
  "offsetUri": "String",
  "rootDefinitionId": "String",
  "categoryId": "String",
  "settingUsage": "String",
  "uxBehavior": "String",
  "visibility": "String",
  "referredSettingInformationList": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationReferredSettingInformation"
    }
  ],
  "description": "String",
  "helpText": "String",
  "name": "String",
  "displayName": "String",
  "version": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingDefinition"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingDefinition",
  "id": "0964154a-154a-0964-4a15-64094a156409",
  "applicability": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingApplicability"
  },
  "accessTypes": "String",
  "keywords": [
    "String"
  ],
  "infoUrls": [
    "String"
  ],
  "occurrence": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingOccurrence"
  },
  "baseUri": "String",
  "offsetUri": "String",
  "rootDefinitionId": "String",
  "categoryId": "String",
  "settingUsage": "String",
  "uxBehavior": "String",
  "visibility": "String",
  "referredSettingInformationList": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationReferredSettingInformation"
    }
  ],
  "description": "String",
  "helpText": "String",
  "name": "String",
  "displayName": "String",
  "version": "String"
}
```

