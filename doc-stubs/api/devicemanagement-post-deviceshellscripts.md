---
title: "Create deviceShellScript"
description: "Create a new deviceShellScript object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceShellScript
Namespace: microsoft.graph



Create a new deviceShellScript object.

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
POST /deviceManagement/deviceShellScripts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceShellScript](../resources/deviceshellscript.md) object.

The following table shows the properties that are required when you create the [deviceShellScript](../resources/deviceshellscript.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|blockExecutionNotifications|Boolean|Does not notify the user a script is being executed|
|createdDateTime|DateTimeOffset|The date and time the device management script was created. This property is read-only.|
|description|String|Optional description for the device management script.|
|displayName|String|Name of the device management script.|
|executionFrequency|Duration|The interval for script to run. If not defined the script will run once|
|fileName|String|Script file name.|
|lastModifiedDateTime|DateTimeOffset|The date and time the device management script was last modified. This property is read-only.|
|retryCount|Int32|Number of times for the script to be retried if it fails|
|roleScopeTagIds|String collection|List of Scope Tag IDs for this PowerShellScript instance.|
|runAsAccount|runAsAccountType|Indicates the type of execution context. Possible values are: `system`, `user`.|
|scriptContent|Binary|The script content.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceShellScript](../resources/deviceshellscript.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceshellscript_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceShellScripts
Content-Type: application/json
Content-length: 362

{
  "@odata.type": "#microsoft.graph.deviceShellScript",
  "blockExecutionNotifications": "Boolean",
  "description": "String",
  "displayName": "String",
  "executionFrequency": "String (duration)",
  "fileName": "String",
  "retryCount": "Integer",
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
  "@odata.type": "microsoft.graph.deviceShellScript"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceShellScript",
  "id": "39704191-4191-3970-9141-703991417039",
  "blockExecutionNotifications": "Boolean",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "executionFrequency": "String (duration)",
  "fileName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "retryCount": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "runAsAccount": "String",
  "scriptContent": "Binary"
}
```

