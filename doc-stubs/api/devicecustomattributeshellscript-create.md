---
title: "Create deviceCustomAttributeShellScript"
description: "Create a new deviceCustomAttributeShellScript object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceCustomAttributeShellScript
Namespace: microsoft.graph



Create a new [deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) object.

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
POST /deviceManagement/deviceCustomAttributeShellScripts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) object.

The following table shows the properties that are required when you create the [deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the device management script was created. This property is read-only.|
|customAttributeName|String|The name of the custom attribute.|
|customAttributeType|deviceCustomAttributeValueType|The expected type of the custom attribute's value. Possible values are: `integer`, `string`, `dateTime`.|
|description|String|Optional description for the device management script.|
|displayName|String|Name of the device management script.|
|fileName|String|Script file name.|
|lastModifiedDateTime|DateTimeOffset|The date and time the device management script was last modified. This property is read-only.|
|roleScopeTagIds|String collection|List of Scope Tag IDs for this PowerShellScript instance.|
|runAsAccount|runAsAccountType|Indicates the type of execution context. Possible values are: `system`, `user`.|
|scriptContent|Binary|The script content.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicecustomattributeshellscript_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceCustomAttributeShellScripts
Content-Type: application/json
Content-length: 330

{
  "@odata.type": "#microsoft.graph.deviceCustomAttributeShellScript",
  "customAttributeName": "String",
  "customAttributeType": "String",
  "description": "String",
  "displayName": "String",
  "fileName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "runAsAccount": "String",
  "scriptContent": "Binary"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceCustomAttributeShellScript"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceCustomAttributeShellScript",
  "id": "748fd749-d749-748f-49d7-8f7449d78f74",
  "createdDateTime": "String (timestamp)",
  "customAttributeName": "String",
  "customAttributeType": "String",
  "description": "String",
  "displayName": "String",
  "fileName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "runAsAccount": "String",
  "scriptContent": "Binary"
}
```

