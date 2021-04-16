---
title: "Update fileClassificationRequest"
description: "Update the properties of a fileClassificationRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update fileClassificationRequest
Namespace: microsoft.graph



Update the properties of a [fileClassificationRequest](../resources/fileclassificationrequest.md) object.

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
PATCH /dataClassification/classifyFile/{fileClassificationRequestId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [fileClassificationRequest](../resources/fileclassificationrequest.md) object.

The following table shows the properties that are required when you update the [fileClassificationRequest](../resources/fileclassificationrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|file|Stream|**TODO: Add Description**|
|sensitiveTypeIds|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [fileClassificationRequest](../resources/fileclassificationrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_fileclassificationrequest"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/dataClassification/classifyFile/{fileClassificationRequestId}
Content-Type: application/json
Content-length: 133

{
  "@odata.type": "#microsoft.graph.fileClassificationRequest",
  "file": "Stream",
  "sensitiveTypeIds": [
    "String"
  ]
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
  "@odata.type": "#microsoft.graph.fileClassificationRequest",
  "id": "397c3df2-3df2-397c-f23d-7c39f23d7c39",
  "file": "Stream",
  "sensitiveTypeIds": [
    "String"
  ]
}
```

