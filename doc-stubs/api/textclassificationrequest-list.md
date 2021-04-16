---
title: "List textClassificationRequests"
description: "Get a list of the textClassificationRequest objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List textClassificationRequests
Namespace: microsoft.graph



Get a list of the [textClassificationRequest](../resources/textclassificationrequest.md) objects and their properties.

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
GET /dataClassification/classifyText
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

If successful, this method returns a `200 OK` response code and a collection of [textClassificationRequest](../resources/textclassificationrequest.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_textclassificationrequest"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/dataClassification/classifyText
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.textClassificationRequest)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

