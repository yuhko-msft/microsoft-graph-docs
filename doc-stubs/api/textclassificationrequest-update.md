---
title: "Update textClassificationRequest"
description: "Update the properties of a textClassificationRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update textClassificationRequest
Namespace: microsoft.graph



Update the properties of a [textClassificationRequest](../resources/textclassificationrequest.md) object.

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
PATCH /dataClassification/classifyText/{textClassificationRequestId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [textClassificationRequest](../resources/textclassificationrequest.md) object.

The following table shows the properties that are required when you update the [textClassificationRequest](../resources/textclassificationrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|fileExtension|String|**TODO: Add Description**|
|matchTolerancesToInclude|mlClassificationMatchTolerance|**TODO: Add Description**. Possible values are: `exact`, `near`.|
|scopesToRun|sensitiveTypeScope|**TODO: Add Description**. Possible values are: `fullDocument`, `partialDocument`.|
|sensitiveTypeIds|String collection|**TODO: Add Description**|
|text|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [textClassificationRequest](../resources/textclassificationrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_textclassificationrequest"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/dataClassification/classifyText/{textClassificationRequestId}
Content-Type: application/json
Content-length: 232

{
  "@odata.type": "#microsoft.graph.textClassificationRequest",
  "fileExtension": "String",
  "matchTolerancesToInclude": "String",
  "scopesToRun": "String",
  "sensitiveTypeIds": [
    "String"
  ],
  "text": "String"
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
  "@odata.type": "#microsoft.graph.textClassificationRequest",
  "id": "c4a82bcf-2bcf-c4a8-cf2b-a8c4cf2ba8c4",
  "fileExtension": "String",
  "matchTolerancesToInclude": "String",
  "scopesToRun": "String",
  "sensitiveTypeIds": [
    "String"
  ],
  "text": "String"
}
```

