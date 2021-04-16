---
title: "Get deviceManagementSettingDefinition"
description: "Read the properties and relationships of a deviceManagementSettingDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceManagementSettingDefinition
Namespace: microsoft.graph



Read the properties and relationships of a [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) object.

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
GET /deviceManagement/settingDefinitions/{deviceManagementSettingDefinitionId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicemanagementsettingdefinition"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/settingDefinitions/{deviceManagementSettingDefinitionId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementSettingDefinition"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

