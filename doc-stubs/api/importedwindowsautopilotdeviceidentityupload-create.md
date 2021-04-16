---
title: "Create importedWindowsAutopilotDeviceIdentityUpload"
description: "Create a new importedWindowsAutopilotDeviceIdentityUpload object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create importedWindowsAutopilotDeviceIdentityUpload
Namespace: microsoft.graph



Create a new [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) object.

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
POST ** Collection URI for microsoft.graph.importedWindowsAutopilotDeviceIdentityUpload not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) object.

The following table shows the properties that are required when you create the [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTimeUtc|DateTimeOffset|DateTime when the entity is created.|
|status|importedWindowsAutopilotDeviceIdentityUploadStatus|Upload status. Possible values are: `noUpload`, `pending`, `complete`, `error`.|



## Response

If successful, this method returns a `201 Created` response code and an [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_importedwindowsautopilotdeviceidentityupload_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.importedWindowsAutopilotDeviceIdentityUpload not found
Content-Type: application/json
Content-length: 156

{
  "@odata.type": "#microsoft.graph.importedWindowsAutopilotDeviceIdentityUpload",
  "createdDateTimeUtc": "String (timestamp)",
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.importedWindowsAutopilotDeviceIdentityUpload"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.importedWindowsAutopilotDeviceIdentityUpload",
  "id": "c5e6ec08-ec08-c5e6-08ec-e6c508ece6c5",
  "createdDateTimeUtc": "String (timestamp)",
  "status": "String"
}
```

