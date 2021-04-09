---
title: "Update deviceManagementConfigurationPolicyTemplate"
description: "Update the properties of a deviceManagementConfigurationPolicyTemplate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementConfigurationPolicyTemplate
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md) object.

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
PATCH /deviceManagementConfigurationPolicyTemplate
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md) object.

The following table shows the properties that are required when you update the [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|baseId|String|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayVersion|String|**TODO: Add Description**|
|lifecycleState|deviceManagementTemplateLifecycleState|**TODO: Add Description**. Possible values are: `invalid`, `draft`, `active`, `superseded`, `deprecated`, `retired`.|
|platforms|deviceManagementConfigurationPlatforms|**TODO: Add Description**. Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|technologies|deviceManagementConfigurationTechnologies|**TODO: Add Description**. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`.|
|templateFamily|deviceManagementConfigurationTemplateFamily|**TODO: Add Description**. Possible values are: `none`, `endpointSecurityAntivirus`, `endpointSecurityDiskEncryption`, `endpointSecurityFirewall`, `endpointSecurityEndpointDectionAndResponse`, `endpointSecurityAttackSurfaceReduction`, `endpointSecurityAccountProtection`, `endpointSecurityApplicationControl`.|
|allowUnmanagedSettings|Boolean|**TODO: Add Description**|
|settingTemplateCount|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementconfigurationpolicytemplate"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagementConfigurationPolicyTemplate
Content-Type: application/json
Content-length: 415

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyTemplate",
  "baseId": "String",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "displayVersion": "String",
  "lifecycleState": "String",
  "platforms": "String",
  "technologies": "String",
  "templateFamily": "String",
  "allowUnmanagedSettings": "Boolean",
  "settingTemplateCount": "Integer"
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
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyTemplate",
  "id": "27505a05-5a05-2750-055a-5027055a5027",
  "baseId": "String",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "displayVersion": "String",
  "lifecycleState": "String",
  "platforms": "String",
  "technologies": "String",
  "templateFamily": "String",
  "allowUnmanagedSettings": "Boolean",
  "settingTemplateCount": "Integer"
}
```

