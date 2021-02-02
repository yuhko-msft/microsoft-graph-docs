---
title: "Create deviceManagementConfigurationPolicyTemplate"
description: "Create a new deviceManagementConfigurationPolicyTemplate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementConfigurationPolicyTemplate
Namespace: microsoft.graph

Create a new deviceManagementConfigurationPolicyTemplate object.

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
POST /deviceManagement/configurationPolicyTemplates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md) object.

The following table shows the properties that are required when you create the [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|baseId|String|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayVersion|String|**TODO: Add Description**|
|sourceType|deviceManagementTemplateSourceType|**TODO: Add Description**. Possible values are: `invalid`, `system`, `builtIn`, `custom`.|
|lifecycleState|deviceManagementTemplateLifecycleState|**TODO: Add Description**. Possible values are: `invalid`, `draft`, `active`, `superseded`, `deprecated`, `retired`.|
|platforms|deviceManagementConfigurationPlatforms|**TODO: Add Description**. Possible values are: `none`, `android`, `androidEnterprise`, `iOS`, `macOS`, `windows10X`, `windows10`.|
|technologies|deviceManagementConfigurationTechnologies|**TODO: Add Description**. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`, `intuneManagementExtension`, `thirdParty`, `documentGateway`, `appleRemoteManagement`.|
|allowUnmanagedSettings|Boolean|**TODO: Add Description**|
|settingTemplateCount|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementconfigurationpolicytemplate_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/configurationPolicyTemplates
Content-Type: application/json
Content-length: 411

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyTemplate",
  "baseId": "String",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "displayVersion": "String",
  "sourceType": "String",
  "lifecycleState": "String",
  "platforms": "String",
  "technologies": "String",
  "allowUnmanagedSettings": "Boolean",
  "settingTemplateCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyTemplate"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyTemplate",
  "id": "6190f43a-f43a-6190-3af4-90613af49061",
  "baseId": "String",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "displayVersion": "String",
  "sourceType": "String",
  "lifecycleState": "String",
  "platforms": "String",
  "technologies": "String",
  "allowUnmanagedSettings": "Boolean",
  "settingTemplateCount": "Integer"
}
```

