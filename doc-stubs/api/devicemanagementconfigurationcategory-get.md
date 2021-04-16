---
title: "Get deviceManagementConfigurationCategory"
description: "Read the properties and relationships of a deviceManagementConfigurationCategory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceManagementConfigurationCategory
Namespace: microsoft.graph



Read the properties and relationships of a [deviceManagementConfigurationCategory](../resources/devicemanagementconfigurationcategory.md) object.

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
GET /deviceManagement/configurationCategories/{deviceManagementConfigurationCategoryId}
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

If successful, this method returns a `200 OK` response code and a [deviceManagementConfigurationCategory](../resources/devicemanagementconfigurationcategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicemanagementconfigurationcategory"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/configurationCategories/{deviceManagementConfigurationCategoryId}
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

