---
title: "Update deviceManagementComplexSettingDefinition"
description: "Update the properties of a deviceManagementComplexSettingDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementComplexSettingDefinition
Namespace: microsoft.graph



Update the properties of a [deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md) object.

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
PATCH /deviceManagementComplexSettingDefinition
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md) object.

The following table shows the properties that are required when you update the [deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|constraints|[deviceManagementConstraint](../resources/devicemanagementconstraint.md) collection|Collection of constraints for the setting value Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|dependencies|[deviceManagementSettingDependency](../resources/devicemanagementsettingdependency.md) collection|Collection of dependencies on other settings Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|description|String|The setting's description Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|displayName|String|The setting's display name Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|documentationUrl|String|Url to setting documentation Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|headerSubtitle|String|subtitle of the setting header for more details about the category/section Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|headerTitle|String|title of the setting header represents a category/section of a setting/settings Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|isTopLevel|Boolean|If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|keywords|String collection|Keywords associated with the setting Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|placeholderText|String|Placeholder text as an example of valid input Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|valueType|deviceManangementIntentValueType|The data type of the value Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md). Possible values are: `integer`, `boolean`, `string`, `complex`, `collection`, `abstractComplex`.|
|propertyDefinitionIds|String collection|The definitions of each property of the complex setting|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementcomplexsettingdefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagementComplexSettingDefinition
Content-Type: application/json
Content-length: 629

{
  "@odata.type": "#microsoft.graph.deviceManagementComplexSettingDefinition",
  "constraints": [
    {
      "@odata.type": "microsoft.graph.deviceManagementEnumConstraint"
    }
  ],
  "dependencies": [
    {
      "@odata.type": "microsoft.graph.deviceManagementSettingDependency"
    }
  ],
  "description": "String",
  "displayName": "String",
  "documentationUrl": "String",
  "headerSubtitle": "String",
  "headerTitle": "String",
  "isTopLevel": "Boolean",
  "keywords": [
    "String"
  ],
  "placeholderText": "String",
  "valueType": "String",
  "propertyDefinitionIds": [
    "String"
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
  "@odata.type": "#microsoft.graph.deviceManagementComplexSettingDefinition",
  "id": "51c69813-9813-51c6-1398-c6511398c651",
  "constraints": [
    {
      "@odata.type": "microsoft.graph.deviceManagementEnumConstraint"
    }
  ],
  "dependencies": [
    {
      "@odata.type": "microsoft.graph.deviceManagementSettingDependency"
    }
  ],
  "description": "String",
  "displayName": "String",
  "documentationUrl": "String",
  "headerSubtitle": "String",
  "headerTitle": "String",
  "isTopLevel": "Boolean",
  "keywords": [
    "String"
  ],
  "placeholderText": "String",
  "valueType": "String",
  "propertyDefinitionIds": [
    "String"
  ]
}
```

