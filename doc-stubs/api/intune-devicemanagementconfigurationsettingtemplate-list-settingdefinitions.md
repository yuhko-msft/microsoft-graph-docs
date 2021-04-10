---
title: "List settingDefinitions"
description: "Get the deviceManagementConfigurationSettingDefinition resources from the settingDefinitions navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List settingDefinitions
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the deviceManagementConfigurationSettingDefinition resources from the settingDefinitions navigation property.

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
GET /deviceManagementConfigurationPolicyTemplate/settingTemplates/{deviceManagementConfigurationSettingTemplateId}/settingDefinitions
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

If successful, this method returns a `200 OK` response code and a collection of [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_devicemanagementconfigurationsettingdefinition"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagementConfigurationPolicyTemplate/settingTemplates/{deviceManagementConfigurationSettingTemplateId}/settingDefinitions
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceManagementConfigurationSettingDefinition)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

