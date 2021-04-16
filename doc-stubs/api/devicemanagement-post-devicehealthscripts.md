---
title: "Create deviceHealthScript"
description: "Create a new deviceHealthScript object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceHealthScript
Namespace: microsoft.graph



Create a new deviceHealthScript object.

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
POST /deviceManagement/deviceHealthScripts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceHealthScript](../resources/devicehealthscript.md) object.

The following table shows the properties that are required when you create the [deviceHealthScript](../resources/devicehealthscript.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The timestamp of when the device health script was created. This property is read-only.|
|description|String|Description of the device health script|
|detectionScriptContent|Binary|The entire content of the detection powershell script|
|detectionScriptParameters|[deviceHealthScriptParameter](../resources/devicehealthscriptparameter.md) collection|List of ComplexType DetectionScriptParameters objects.|
|displayName|String|Name of the device health script|
|enforceSignatureCheck|Boolean|Indicate whether the script signature needs be checked|
|highestAvailableVersion|String|Highest available version for a Microsoft Proprietary script|
|isGlobalScript|Boolean|Determines if this is Microsoft Proprietary Script. Proprietary scripts are read-only|
|lastModifiedDateTime|DateTimeOffset|The timestamp of when the device health script was modified. This property is read-only.|
|publisher|String|Name of the device health script publisher|
|remediationScriptContent|Binary|The entire content of the remediation powershell script|
|remediationScriptParameters|[deviceHealthScriptParameter](../resources/devicehealthscriptparameter.md) collection|List of ComplexType RemediationScriptParameters objects.|
|roleScopeTagIds|String collection|List of Scope Tag IDs for the device health script|
|runAs32Bit|Boolean|Indicate whether PowerShell script(s) should run as 32-bit|
|runAsAccount|runAsAccountType|Indicates the type of execution context. Possible values are: `system`, `user`.|
|version|String|Version of the device health script|



## Response

If successful, this method returns a `201 Created` response code and a [deviceHealthScript](../resources/devicehealthscript.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicehealthscript_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceHealthScripts
Content-Type: application/json
Content-length: 718

{
  "@odata.type": "#microsoft.graph.deviceHealthScript",
  "description": "String",
  "detectionScriptContent": "Binary",
  "detectionScriptParameters": [
    {
      "@odata.type": "microsoft.graph.deviceHealthScriptBooleanParameter"
    }
  ],
  "displayName": "String",
  "enforceSignatureCheck": "Boolean",
  "highestAvailableVersion": "String",
  "isGlobalScript": "Boolean",
  "publisher": "String",
  "remediationScriptContent": "Binary",
  "remediationScriptParameters": [
    {
      "@odata.type": "microsoft.graph.deviceHealthScriptBooleanParameter"
    }
  ],
  "roleScopeTagIds": [
    "String"
  ],
  "runAs32Bit": "Boolean",
  "runAsAccount": "String",
  "version": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceHealthScript"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceHealthScript",
  "id": "7e8b82a4-82a4-7e8b-a482-8b7ea4828b7e",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "detectionScriptContent": "Binary",
  "detectionScriptParameters": [
    {
      "@odata.type": "microsoft.graph.deviceHealthScriptBooleanParameter"
    }
  ],
  "displayName": "String",
  "enforceSignatureCheck": "Boolean",
  "highestAvailableVersion": "String",
  "isGlobalScript": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "publisher": "String",
  "remediationScriptContent": "Binary",
  "remediationScriptParameters": [
    {
      "@odata.type": "microsoft.graph.deviceHealthScriptBooleanParameter"
    }
  ],
  "roleScopeTagIds": [
    "String"
  ],
  "runAs32Bit": "Boolean",
  "runAsAccount": "String",
  "version": "String"
}
```

