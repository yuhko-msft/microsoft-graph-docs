---
title: "driveItem: createUploadSession"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# driveItem: createUploadSession
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /drive/root/createUploadSession
POST /drives/{drivesId}/root/createUploadSession
POST /shares/{sharesId}/root/createUploadSession
POST /drive/items/{driveItemId}/createUploadSession
POST /shares/{sharesId}/driveItem/createUploadSession
POST /drive/special/{driveItemId}/createUploadSession
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|item|[driveItemUploadableProperties](../resources/driveitemuploadableproperties.md)|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [uploadSession](../resources/uploadsession.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "driveitem_createuploadsession"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/drive/root/createUploadSession

Content-Type: application/json
Content-length: 90

{
  "item": {
    "@odata.type": "microsoft.graph.driveItemUploadableProperties"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.uploadSession"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "microsoft.graph.uploadSession"
  }
}
```

