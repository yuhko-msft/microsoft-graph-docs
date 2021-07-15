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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

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
In the request body, supply a JSON representation of the [deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md) object.

The following table shows the properties that are required when you create the [deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|allowUnmanagedSettings|Boolean|Allow unmanaged setting templates|
|baseId|String|Template base identifier|
|description|String|Template description|
|displayName|String|Template display name|
|displayVersion|String|Description of template version|
|lifecycleState|deviceManagementTemplateLifecycleState|Indicate current lifecycle state of template. Possible values are: `invalid`, `draft`, `active`, `superseded`, `deprecated`, `retired`.|
|platforms|deviceManagementConfigurationPlatforms|Platforms for this template. Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|settingTemplateCount|Int32|Number of setting templates. Valid values 0 to 2147483647. This property is read-only.|
|technologies|deviceManagementConfigurationTechnologies|Technologies for this template. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`, `microsoftSense`.|
|templateFamily|deviceManagementConfigurationTemplateFamily|TemplateFamily for this template. Possible values are: `none`, `endpointSecurityAntivirus`, `endpointSecurityDiskEncryption`, `endpointSecurityFirewall`, `endpointSecurityEndpointDetectionAndResponse`, `endpointSecurityAttackSurfaceReduction`, `endpointSecurityAccountProtection`, `endpointSecurityApplicationControl`.|
|version|Int32|Template version. Valid values 1 to 2147483647. This property is read-only.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md) object in the response body.

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
Content-length: 415

{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyTemplate",
  "allowUnmanagedSettings": "Boolean",
  "baseId": "String",
  "description": "String",
  "displayName": "String",
  "displayVersion": "String",
  "lifecycleState": "String",
  "platforms": "String",
  "settingTemplateCount": "Integer",
  "technologies": "String",
  "templateFamily": "String",
  "version": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
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
  "id": "77ada6fe-a6fe-77ad-fea6-ad77fea6ad77",
  "allowUnmanagedSettings": "Boolean",
  "baseId": "String",
  "description": "String",
  "displayName": "String",
  "displayVersion": "String",
  "lifecycleState": "String",
  "platforms": "String",
  "settingTemplateCount": "Integer",
  "technologies": "String",
  "templateFamily": "String",
  "version": "Integer"
}
```

