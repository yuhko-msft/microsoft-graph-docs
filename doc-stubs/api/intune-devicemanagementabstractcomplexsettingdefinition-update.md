---
title: "Update deviceManagementAbstractComplexSettingDefinition"
description: "Update the properties of a deviceManagementAbstractComplexSettingDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementAbstractComplexSettingDefinition
Namespace: microsoft.graph

Update the properties of a [deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /deviceManagementAbstractComplexSettingDefinition
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md) object.

The following table shows the properties that are required when you create the [deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|valueType|deviceManangementIntentValueType|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md). Possible values are: `integer`, `boolean`, `string`, `complex`, `collection`, `abstractComplex`.|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|isTopLevel|Boolean|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|placeholderText|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|documentationUrl|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|headerTitle|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|headerSubtitle|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|keywords|String collection|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|constraints|[deviceManagementConstraint](../resources/intune-devicemanagementconstraint.md) collection|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|dependencies|[deviceManagementSettingDependency](../resources/intune-devicemanagementsettingdependency.md) collection|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|implementations|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementabstractcomplexsettingdefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagementAbstractComplexSettingDefinition
Content-Type: application/json
Content-length: 637

{
  "@odata.type": "#microsoft.graph.deviceManagementAbstractComplexSettingDefinition",
  "valueType": "String",
  "displayName": "String",
  "isTopLevel": "Boolean",
  "description": "String",
  "placeholderText": "String",
  "documentationUrl": "String",
  "headerTitle": "String",
  "headerSubtitle": "String",
  "keywords": [
    "String"
  ],
  "constraints": [
    {
      "@odata.type": "microsoft.graph.deviceManagementSettingAppConstraint"
    }
  ],
  "dependencies": [
    {
      "@odata.type": "microsoft.graph.deviceManagementSettingDependency"
    }
  ],
  "implementations": [
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
  "@odata.type": "#microsoft.graph.deviceManagementAbstractComplexSettingDefinition",
  "id": "7d3c708a-708a-7d3c-8a70-3c7d8a703c7d",
  "valueType": "String",
  "displayName": "String",
  "isTopLevel": "Boolean",
  "description": "String",
  "placeholderText": "String",
  "documentationUrl": "String",
  "headerTitle": "String",
  "headerSubtitle": "String",
  "keywords": [
    "String"
  ],
  "constraints": [
    {
      "@odata.type": "microsoft.graph.deviceManagementSettingAppConstraint"
    }
  ],
  "dependencies": [
    {
      "@odata.type": "microsoft.graph.deviceManagementSettingDependency"
    }
  ],
  "implementations": [
    "String"
  ]
}
```

