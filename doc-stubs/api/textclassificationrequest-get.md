---
title: "Get textClassificationRequest"
description: "Read the properties and relationships of a textClassificationRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get textClassificationRequest
Namespace: microsoft.graph



Read the properties and relationships of a [textClassificationRequest](../resources/textclassificationrequest.md) object.

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
GET /dataClassification/classifyText/{textClassificationRequestId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [textClassificationRequest](../resources/textclassificationrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_textclassificationrequest"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/dataClassification/classifyText/{textClassificationRequestId}
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

