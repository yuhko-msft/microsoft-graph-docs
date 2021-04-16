---
title: "Add detectedApp"
description: "Add detectedApps by posting to the detectedApps collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add detectedApp
Namespace: microsoft.graph



Add detectedApps by posting to the detectedApps collection.

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
POST /users/{usersId}/managedDevices/{managedDeviceId}/detectedApps/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [detectedApp](../resources/detectedapp.md) object.

The following table shows the properties that are required when you create the [detectedApp](../resources/detectedapp.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceCount|Int32|The number of devices that have installed this application|
|displayName|String|Name of the discovered application. Read-only|
|sizeInByte|Int64|Discovered application size in bytes. Read-only|
|version|String|Version of the discovered application. Read-only|



## Response

If successful, this method returns a `204 No Content` response code and a [detectedApp](../resources/detectedapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_detectedapp_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/users/{usersId}/managedDevices/{managedDeviceId}/detectedApps/$ref
Content-Type: application/json
Content-length: 162

{
  "@odata.type": "#microsoft.graph.detectedApp",
  "deviceCount": "Integer",
  "displayName": "String",
  "sizeInByte": "Integer",
  "version": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.detectedApp"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.detectedApp",
  "id": "d0ec2f67-2f67-d0ec-672f-ecd0672fecd0",
  "deviceCount": "Integer",
  "displayName": "String",
  "sizeInByte": "Integer",
  "version": "String"
}
```

