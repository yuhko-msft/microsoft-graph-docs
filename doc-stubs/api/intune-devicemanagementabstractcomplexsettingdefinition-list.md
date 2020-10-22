---
title: "List deviceManagementAbstractComplexSettingDefinitions"
description: "Get a list of the deviceManagementAbstractComplexSettingDefinition objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List deviceManagementAbstractComplexSettingDefinitions
Namespace: microsoft.graph

Get a list of the [deviceManagementAbstractComplexSettingDefinition](../resources/devicemanagementabstractcomplexsettingdefinition.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.deviceManagementAbstractComplexSettingDefinition not found
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

If successful, this method returns a `200 OK` response code and a collection of [deviceManagementAbstractComplexSettingDefinition](../resources/devicemanagementabstractcomplexsettingdefinition.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicemanagementabstractcomplexsettingdefinition"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.deviceManagementAbstractComplexSettingDefinition not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceManagementAbstractComplexSettingDefinition)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
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
  ]
}
```

