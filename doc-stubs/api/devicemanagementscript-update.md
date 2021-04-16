---
title: "Update deviceManagementScript"
description: "Update the properties of a deviceManagementScript object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementScript
Namespace: microsoft.graph



Update the properties of a [deviceManagementScript](../resources/devicemanagementscript.md) object.

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
PATCH /deviceManagement/deviceManagementScripts/{deviceManagementScriptId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementScript](../resources/devicemanagementscript.md) object.

The following table shows the properties that are required when you update the [deviceManagementScript](../resources/devicemanagementscript.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the device management script was created. This property is read-only.|
|description|String|Optional description for the device management script.|
|displayName|String|Name of the device management script.|
|enforceSignatureCheck|Boolean|Indicate whether the script signature needs be checked.|
|fileName|String|Script file name.|
|lastModifiedDateTime|DateTimeOffset|The date and time the device management script was last modified. This property is read-only.|
|roleScopeTagIds|String collection|List of Scope Tag IDs for this PowerShellScript instance.|
|runAs32Bit|Boolean|A value indicating whether the PowerShell script should run as 32-bit|
|runAsAccount|runAsAccountType|Indicates the type of execution context. Possible values are: `system`, `user`.|
|scriptContent|Binary|The script content.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementScript](../resources/devicemanagementscript.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementscript"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceManagementScripts/{deviceManagementScriptId}
Content-Type: application/json
Content-length: 315

{
  "@odata.type": "#microsoft.graph.deviceManagementScript",
  "description": "String",
  "displayName": "String",
  "enforceSignatureCheck": "Boolean",
  "fileName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "runAs32Bit": "Boolean",
  "runAsAccount": "String",
  "scriptContent": "Binary"
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
  "@odata.type": "#microsoft.graph.deviceManagementScript",
  "id": "451eaeac-aeac-451e-acae-1e45acae1e45",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "enforceSignatureCheck": "Boolean",
  "fileName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "runAs32Bit": "Boolean",
  "runAsAccount": "String",
  "scriptContent": "Binary"
}
```

