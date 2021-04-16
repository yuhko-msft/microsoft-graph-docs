---
title: "Update deviceManagementConfigurationSetting"
description: "Update the properties of a deviceManagementConfigurationSetting object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementConfigurationSetting
Namespace: microsoft.graph



Update the properties of a [deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) object.

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
PATCH /deviceManagement/configurationPolicies/{deviceManagementConfigurationPolicyId}/settings/{deviceManagementConfigurationSettingId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) object.

The following table shows the properties that are required when you update the [deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|settingInstance|[deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md)|Setting Instance|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementconfigurationsetting"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/configurationPolicies/{deviceManagementConfigurationPolicyId}/settings/{deviceManagementConfigurationSettingId}
Content-Type: application/json
Content-length: 191

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSetting",
  "settingInstance": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstance"
  }
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
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSetting",
  "id": "266b7e87-7e87-266b-877e-6b26877e6b26",
  "settingInstance": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstance"
  }
}
```

