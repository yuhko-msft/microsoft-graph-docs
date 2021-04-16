---
title: "Update deviceManagementTemplate"
description: "Update the properties of a deviceManagementTemplate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementTemplate
Namespace: microsoft.graph



Update the properties of a [deviceManagementTemplate](../resources/devicemanagementtemplate.md) object.

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
PATCH /deviceManagement/templates/{deviceManagementTemplateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementTemplate](../resources/devicemanagementtemplate.md) object.

The following table shows the properties that are required when you update the [deviceManagementTemplate](../resources/devicemanagementtemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|The template's description|
|displayName|String|The template's display name|
|intentCount|Int32|Number of Intents created from this template.|
|isDeprecated|Boolean|The template is deprecated or not. Intents cannot be created from a deprecated template.|
|platformType|policyPlatformType|The template's platform. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `windows10XProfile`, `all`.|
|publishedDateTime|DateTimeOffset|When the template was published|
|templateSubtype|deviceManagementTemplateSubtype|The template's subtype. Possible values are: `none`, `firewall`, `diskEncryption`, `attackSurfaceReduction`, `endpointDetectionReponse`, `accountProtection`, `antivirus`, `firewallSharedAppList`, `firewallSharedIpList`, `firewallSharedPortlist`.|
|templateType|deviceManagementTemplateType|The template's type. Possible values are: `securityBaseline`, `specializedDevices`, `advancedThreatProtectionSecurityBaseline`, `deviceConfiguration`, `custom`, `securityTemplate`, `microsoftEdgeSecurityBaseline`, `microsoftOffice365ProPlusSecurityBaseline`, `deviceCompliance`, `deviceConfigurationForOffice365`, `cloudPC`, `firewallSharedSettings`.|
|versionInfo|String|The template's version information|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementTemplate](../resources/devicemanagementtemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementtemplate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/templates/{deviceManagementTemplateId}
Content-Type: application/json
Content-length: 345

{
  "@odata.type": "#microsoft.graph.deviceManagementTemplate",
  "description": "String",
  "displayName": "String",
  "intentCount": "Integer",
  "isDeprecated": "Boolean",
  "platformType": "String",
  "publishedDateTime": "String (timestamp)",
  "templateSubtype": "String",
  "templateType": "String",
  "versionInfo": "String"
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
  "@odata.type": "#microsoft.graph.deviceManagementTemplate",
  "id": "03bc3a3a-3a3a-03bc-3a3a-bc033a3abc03",
  "description": "String",
  "displayName": "String",
  "intentCount": "Integer",
  "isDeprecated": "Boolean",
  "platformType": "String",
  "publishedDateTime": "String (timestamp)",
  "templateSubtype": "String",
  "templateType": "String",
  "versionInfo": "String"
}
```

