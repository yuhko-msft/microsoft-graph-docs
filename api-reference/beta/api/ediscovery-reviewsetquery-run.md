---
title: "reviewSetQuery: run"
description: "Execute a review set query."
ms.localizationpriority: medium
author: "mahage-msft"
ms.prod: "ediscovery"
doc_type: "apiPageType"
---

# reviewSetQuery: run
Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Execute a review set query.

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
GET /caseExportOperation/reviewSetQuery/run
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [microsoft.graph.ediscovery.file](../resources/ediscovery-file.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "reviewsetquery_run"
}
-->
``` http
GET https://graph.microsoft.com/beta/caseExportOperation/reviewSetQuery/run
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.ediscovery.file)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.ediscovery.file",
      "id": "String (identifier)",
      "date": "String (timestamp)",
      "size": "Integer",
      "name": "String",
      "sourceType": "String",
      "senderAuthor": [
        "String"
      ],
      "subjectTitle": "String",
      "extension": "String",
      "mediaType": "String",
      "processingStatus": "String",
      "content": "Stream",
      "extractedTextContent": "String",
      "otherProperties": {
        "@odata.type": "microsoft.graph.ediscovery.stringValueDictionary"
      }
    }
  ]
}
```

