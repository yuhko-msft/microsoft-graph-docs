---
title: "Update deviceManagementSettingDefinition"
description: "Update the properties of a deviceManagementSettingDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementSettingDefinition
Namespace: microsoft.graph



Update the properties of a [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) object.

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
PATCH /deviceManagement/settingDefinitions/{deviceManagementSettingDefinitionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) object.

The following table shows the properties that are required when you update the [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|constraints|[deviceManagementConstraint](../resources/devicemanagementconstraint.md) collection|Collection of constraints for the setting value|
|dependencies|[deviceManagementSettingDependency](../resources/devicemanagementsettingdependency.md) collection|Collection of dependencies on other settings|
|description|String|The setting's description|
|displayName|String|The setting's display name|
|documentationUrl|String|Url to setting documentation|
|headerSubtitle|String|subtitle of the setting header for more details about the category/section|
|headerTitle|String|title of the setting header represents a category/section of a setting/settings|
|isTopLevel|Boolean|If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting|
|keywords|String collection|Keywords associated with the setting|
|placeholderText|String|Placeholder text as an example of valid input|
|valueType|deviceManangementIntentValueType|The data type of the value. Possible values are: `integer`, `boolean`, `string`, `complex`, `collection`, `abstractComplex`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementsettingdefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/settingDefinitions/{deviceManagementSettingDefinitionId}
Content-Type: application/json
Content-length: 572

{
  "@odata.type": "#microsoft.graph.deviceManagementSettingDefinition",
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
  "valueType": "String"
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
  "@odata.type": "#microsoft.graph.deviceManagementSettingDefinition",
  "id": "1d5848f1-48f1-1d58-f148-581df148581d",
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
  "valueType": "String"
}
```

