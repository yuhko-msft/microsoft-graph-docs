---
title: "Get deviceManagementConfigurationSimpleSettingCollectionDefinition"
description: "Read the properties and relationships of a deviceManagementConfigurationSimpleSettingCollectionDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceManagementConfigurationSimpleSettingCollectionDefinition
Namespace: microsoft.graph



Read the properties and relationships of a [deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md) object.

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
GET /deviceManagementConfigurationSimpleSettingCollectionDefinition
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

If successful, this method returns a `200 OK` response code and a [deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicemanagementconfigurationsimplesettingcollectiondefinition"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagementConfigurationSimpleSettingCollectionDefinition
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionDefinition"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionDefinition",
    "id": "5dc0795d-795d-5dc0-5d79-c05d5d79c05d",
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
    "defaultValue": {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingValue"
    },
    "dependedOnBy": [
      {
        "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingDependedOnBy"
      }
    ],
    "dependentOn": [
      {
        "@odata.type": "microsoft.graph.deviceManagementConfigurationDependentOn"
      }
    ],
    "valueDefinition": {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingValueDefinition"
    },
    "maximumCount": "Integer",
    "minimumCount": "Integer"
  }
}
```

