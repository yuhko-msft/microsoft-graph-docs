---
title: "Create deviceManagementCollectionSettingDefinition"
description: "Create a new deviceManagementCollectionSettingDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementCollectionSettingDefinition
Namespace: microsoft.graph

Create a new [deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md) object.

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
POST ** Collection URI for microsoft.graph.deviceManagementCollectionSettingDefinition not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md) object.

The following table shows the properties that are required when you create the [deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md).

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
|elementDefinitionId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementcollectionsettingdefinition_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.deviceManagementCollectionSettingDefinition not found
Content-Type: application/json
Content-length: 624

{
  "@odata.type": "#microsoft.graph.deviceManagementCollectionSettingDefinition",
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
  "elementDefinitionId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementCollectionSettingDefinition"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.deviceManagementCollectionSettingDefinition",
  "id": "2181081d-081d-2181-1d08-81211d088121",
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
  "elementDefinitionId": "String"
}
```

