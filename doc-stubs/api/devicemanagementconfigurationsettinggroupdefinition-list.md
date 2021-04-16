---
title: "List deviceManagementConfigurationSettingGroupDefinitions"
description: "Get a list of the deviceManagementConfigurationSettingGroupDefinition objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List deviceManagementConfigurationSettingGroupDefinitions
Namespace: microsoft.graph



Get a list of the [deviceManagementConfigurationSettingGroupDefinition](../resources/devicemanagementconfigurationsettinggroupdefinition.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.deviceManagementConfigurationSettingGroupDefinition not found
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

If successful, this method returns a `200 OK` response code and a collection of [deviceManagementConfigurationSettingGroupDefinition](../resources/devicemanagementconfigurationsettinggroupdefinition.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_devicemanagementconfigurationsettinggroupdefinition"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.deviceManagementConfigurationSettingGroupDefinition not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceManagementConfigurationSettingGroupDefinition)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingGroupDefinition",
      "id": "f6ab5a80-5a80-f6ab-805a-abf6805aabf6",
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
      "childIds": [
        "String"
      ],
      "dependedOnBy": [
        {
          "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingDependedOnBy"
        }
      ],
      "dependentOn": [
        {
          "@odata.type": "microsoft.graph.deviceManagementConfigurationDependentOn"
        }
      ]
    }
  ]
}
```

