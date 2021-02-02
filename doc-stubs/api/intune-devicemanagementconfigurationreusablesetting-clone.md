---
title: "deviceManagementConfigurationReusableSetting: clone"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# deviceManagementConfigurationReusableSetting: clone
Namespace: microsoft.graph

**TODO: Add Description**

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
POST /deviceManagement/reusableSettings/{deviceManagementConfigurationReusableSettingId}/clone
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "devicemanagementconfigurationreusablesetting_clone"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/reusableSettings/{deviceManagementConfigurationReusableSettingId}/clone
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
    "id": "String (identifier)",
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

