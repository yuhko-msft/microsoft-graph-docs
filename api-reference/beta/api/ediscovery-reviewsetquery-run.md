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
|Delegated (work or school account)|eDiscovery.Read.All, eDiscovery.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

``` http
GET /compliance/ediscovery/cases/{caseId}/reviewSets/{reviewSetId}/queries/{reviewSetQueryId}/run
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
GET https://graph.microsoft.com/beta/compliance/ediscovery/cases/c7158891-fb5d-422a-8f78-25f4028e9821/reviewSets/2ef821af-5899-4c56-bb0c-0d8d599a1c0d/queries/f089810f-af8a-4d14-82ec-0f76e4bdb85c/run
```

### Response

>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.file",
  "isCollection": true
}
-->

``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/beta/$metadata#Collection(file)",
    "@odata.nextLink": "https://graph.microsoft.com/beta/compliance/ediscovery/cases('c7158891-fb5d-422a-8f78-25f4028e9821')/reviewSets('2ef821af-5899-4c56-bb0c-0d8d599a1c0d')/queries('f089810f-af8a-4d14-82ec-0f76e4bdb85c')/run?$skiptoken=1",
    "value": [
        {
            "@odata.type": "#microsoft.graph.ediscovery.file",
            "id": "00007841052b867f11d08d27b7791e2d7120085aff200b5e5f7b9e79dd677a46",
            "date": "2021-02-19T19:57:04Z",
            "size": 81029,
            "name": "item.content",
            "sourceType": "mailbox",
            "senderAuthor": [
                "Adele Vance <adelev@contoso.com>"
            ],
            "subjectTitle": "item.content",
            "extension": "content",
            "mediaType": "application/octet-stream",
            "processingStatus": "fileTypeIsNotSupported",
            "otherProperties": {}
        }
    ]
}
```
