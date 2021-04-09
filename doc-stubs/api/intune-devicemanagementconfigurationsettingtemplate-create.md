---
title: "Create deviceManagementConfigurationSettingTemplate"
description: "Create a new deviceManagementConfigurationSettingTemplate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementConfigurationSettingTemplate
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md) object.

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
POST /deviceManagementConfigurationPolicyTemplate/settingTemplates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md) object.

The following table shows the properties that are required when you create the [deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|settingInstanceTemplate|[deviceManagementConfigurationSettingInstanceTemplate](../resources/intune-devicemanagementconfigurationsettinginstancetemplate.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementconfigurationsettingtemplate_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagementConfigurationPolicyTemplate/settingTemplates
Content-Type: application/json
Content-length: 215

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingTemplate",
  "settingInstanceTemplate": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstanceTemplate"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingTemplate"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingTemplate",
  "id": "b135aedd-aedd-b135-ddae-35b1ddae35b1",
  "settingInstanceTemplate": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstanceTemplate"
  }
}
```

