---
title: "Create textClassificationRequest"
description: "Create a new textClassificationRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create textClassificationRequest
Namespace: microsoft.graph



Create a new [textClassificationRequest](../resources/textclassificationrequest.md) object.

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
POST /dataClassification/classifyText
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [textClassificationRequest](../resources/textclassificationrequest.md) object.

The following table shows the properties that are required when you create the [textClassificationRequest](../resources/textclassificationrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|fileExtension|String|**TODO: Add Description**|
|matchTolerancesToInclude|mlClassificationMatchTolerance|**TODO: Add Description**. Possible values are: `exact`, `near`.|
|scopesToRun|sensitiveTypeScope|**TODO: Add Description**. Possible values are: `fullDocument`, `partialDocument`.|
|sensitiveTypeIds|String collection|**TODO: Add Description**|
|text|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [textClassificationRequest](../resources/textclassificationrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_textclassificationrequest_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/dataClassification/classifyText
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
  "truncated": true,
  "@odata.type": "microsoft.graph.textClassificationRequest"
}
-->
``` http
HTTP/1.1 201 Created
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

