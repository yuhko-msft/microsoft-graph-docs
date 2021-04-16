---
title: "Create securityBaselineTemplate"
description: "Create a new securityBaselineTemplate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create securityBaselineTemplate
Namespace: microsoft.graph



Create a new [securityBaselineTemplate](../resources/securitybaselinetemplate.md) object.

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
POST ** Collection URI for microsoft.graph.securityBaselineTemplate not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [securityBaselineTemplate](../resources/securitybaselinetemplate.md) object.

The following table shows the properties that are required when you create the [securityBaselineTemplate](../resources/securitybaselinetemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|The template's description Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|displayName|String|The template's display name Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|intentCount|Int32|Number of Intents created from this template. Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|isDeprecated|Boolean|The template is deprecated or not. Intents cannot be created from a deprecated template. Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|platformType|policyPlatformType|The template's platform. Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md). Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `windows10XProfile`, `all`.|
|publishedDateTime|DateTimeOffset|When the template was published Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|templateSubtype|deviceManagementTemplateSubtype|The template's subtype. Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md). Possible values are: `none`, `firewall`, `diskEncryption`, `attackSurfaceReduction`, `endpointDetectionReponse`, `accountProtection`, `antivirus`, `firewallSharedAppList`, `firewallSharedIpList`, `firewallSharedPortlist`.|
|templateType|deviceManagementTemplateType|The template's type. Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md). Possible values are: `securityBaseline`, `specializedDevices`, `advancedThreatProtectionSecurityBaseline`, `deviceConfiguration`, `custom`, `securityTemplate`, `microsoftEdgeSecurityBaseline`, `microsoftOffice365ProPlusSecurityBaseline`, `deviceCompliance`, `deviceConfigurationForOffice365`, `cloudPC`, `firewallSharedSettings`.|
|versionInfo|String|The template's version information Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|



## Response

If successful, this method returns a `201 Created` response code and a [securityBaselineTemplate](../resources/securitybaselinetemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_securitybaselinetemplate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.securityBaselineTemplate not found
Content-Type: application/json
Content-length: 345

{
  "@odata.type": "#microsoft.graph.securityBaselineTemplate",
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
  "truncated": true,
  "@odata.type": "microsoft.graph.securityBaselineTemplate"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.securityBaselineTemplate",
  "id": "e3954a06-4a06-e395-064a-95e3064a95e3",
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

