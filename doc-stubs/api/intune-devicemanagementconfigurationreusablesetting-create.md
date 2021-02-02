---
title: "Create deviceManagementConfigurationReusableSetting"
description: "Create a new deviceManagementConfigurationReusableSetting object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementConfigurationReusableSetting
Namespace: microsoft.graph

Create a new [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) object.

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
POST /deviceManagement/reusableSettings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) object.

The following table shows the properties that are required when you create the [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|settingDefinitionId|String|**TODO: Add Description**|
|settingInstance|[deviceManagementConfigurationSettingInstance](../resources/intune-devicemanagementconfigurationsettinginstance.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|
|referencingConfigurationPolicyCount|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementconfigurationreusablesetting_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/reusableSettings
Content-Type: application/json
Content-length: 369

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationReusableSetting",
  "displayName": "String",
  "description": "String",
  "settingDefinitionId": "String",
  "settingInstance": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstance"
  },
  "version": "Integer",
  "referencingConfigurationPolicyCount": "Integer"
}
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

