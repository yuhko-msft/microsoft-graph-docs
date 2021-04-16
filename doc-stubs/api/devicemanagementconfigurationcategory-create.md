---
title: "Create deviceManagementConfigurationCategory"
description: "Create a new deviceManagementConfigurationCategory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementConfigurationCategory
Namespace: microsoft.graph



Create a new [deviceManagementConfigurationCategory](../resources/devicemanagementconfigurationcategory.md) object.

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
POST /deviceManagement/configurationCategories
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationCategory](../resources/devicemanagementconfigurationcategory.md) object.

The following table shows the properties that are required when you create the [deviceManagementConfigurationCategory](../resources/devicemanagementconfigurationcategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|childCategoryIds|String collection|List of child ids of the category.|
|description|String|Description of the item|
|displayName|String|Display name of the item|
|helpText|String|Help text of the item|
|name|String|Name of the item|
|parentCategoryId|String|Parent id of the category.|
|platforms|deviceManagementConfigurationPlatforms|Platforms types, which settings in the category have. Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|rootCategoryId|String|Root id of the category.|
|settingUsage|deviceManagementConfigurationSettingUsage|Indicates that the category contains settings that are used for Compliance or Configuration. Possible values are: `none`, `configuration`.|
|technologies|deviceManagementConfigurationTechnologies|Technologies types, which settings in the category have. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementConfigurationCategory](../resources/devicemanagementconfigurationcategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementconfigurationcategory_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/configurationCategories
Content-Type: application/json
Content-length: 374

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationCategory",
  "childCategoryIds": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "helpText": "String",
  "name": "String",
  "parentCategoryId": "String",
  "platforms": "String",
  "rootCategoryId": "String",
  "settingUsage": "String",
  "technologies": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementConfigurationCategory"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationCategory",
  "id": "0f9268c9-68c9-0f92-c968-920fc968920f",
  "childCategoryIds": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "helpText": "String",
  "name": "String",
  "parentCategoryId": "String",
  "platforms": "String",
  "rootCategoryId": "String",
  "settingUsage": "String",
  "technologies": "String"
}
```

