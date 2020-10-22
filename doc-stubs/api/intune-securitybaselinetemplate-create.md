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

Create a new [securityBaselineTemplate](../resources/intune-securitybaselinetemplate.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
In the request body, supply a JSON representation of the [securityBaselineTemplate](../resources/intune-securitybaselinetemplate.md) object.

The following table shows the properties that are required when you create the [securityBaselineTemplate](../resources/intune-securitybaselinetemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md)|
|versionInfo|String|**TODO: Add Description** Inherited from [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md)|
|isDeprecated|Boolean|**TODO: Add Description** Inherited from [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md)|
|intentCount|Int32|**TODO: Add Description** Inherited from [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md)|
|templateType|deviceManagementTemplateType|**TODO: Add Description** Inherited from [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md). Possible values are: `securityBaseline`, `specializedDevices`, `advancedThreatProtectionSecurityBaseline`, `deviceConfiguration`, `custom`, `securityTemplate`, `microsoftEdgeSecurityBaseline`, `microsoftOffice365ProPlusSecurityBaseline`, `deviceCompliance`, `deviceConfigurationForOffice365`, `cloudPC`.|
|platformType|policyPlatformType|**TODO: Add Description** Inherited from [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md). Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `windows10XProfile`, `all`.|
|templateSubtype|deviceManagementTemplateSubtype|**TODO: Add Description** Inherited from [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md). Possible values are: `none`, `firewall`, `diskEncryption`, `attackSurfaceReduction`, `endpointDetectionReponse`, `accountProtection`, `antivirus`.|
|publishedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md)|



## Response

If successful, this method returns a `201 Created` response code and a [securityBaselineTemplate](../resources/intune-securitybaselinetemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_securitybaselinetemplate_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.securityBaselineTemplate not found
Content-Type: application/json
Content-length: 345

{
  "@odata.type": "#microsoft.graph.securityBaselineTemplate",
  "displayName": "String",
  "description": "String",
  "versionInfo": "String",
  "isDeprecated": "Boolean",
  "intentCount": "Integer",
  "templateType": "String",
  "platformType": "String",
  "templateSubtype": "String",
  "publishedDateTime": "String (timestamp)"
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
  "id": "21b480c0-80c0-21b4-c080-b421c080b421",
  "displayName": "String",
  "description": "String",
  "versionInfo": "String",
  "isDeprecated": "Boolean",
  "intentCount": "Integer",
  "templateType": "String",
  "platformType": "String",
  "templateSubtype": "String",
  "publishedDateTime": "String (timestamp)"
}
```

