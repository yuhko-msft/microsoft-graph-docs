---
title: "Get deviceManagementConfigurationReusableSetting"
description: "Read the properties and relationships of a deviceManagementConfigurationReusableSetting object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceManagementConfigurationReusableSetting
Namespace: microsoft.graph

Read the properties and relationships of a [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) object.

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
GET /deviceManagement/reusableSettings/{deviceManagementConfigurationReusableSettingId}
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

If successful, this method returns a `200 OK` response code and a [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicemanagementconfigurationreusablesetting"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/reusableSettings/{deviceManagementConfigurationReusableSettingId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementConfigurationReusableSetting"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceManagementConfigurationReusableSetting",
    "id": "da5a1e53-1e53-da5a-531e-5ada531e5ada",
    "displayName": "String",
    "description": "String",
    "settingDefinitionId": "String",
    "settingInstance": {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstance"
    },
    "createdDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "version": "Integer",
    "referencingConfigurationPolicyCount": "Integer"
  }
}
```

