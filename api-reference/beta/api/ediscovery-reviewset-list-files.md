---
title: "List files"
description: "Get the file resources from the files navigation property."
ms.localizationpriority: medium
author: "mahage-msft"
ms.prod: "ediscovery"
doc_type: "apiPageType"
---

# List files

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the **file** resources from the files navigation property.

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
GET /compliance/ediscovery/cases/{caseId}/reviewSets/{reviewSetId}/files
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

If successful, this method returns a `200 OK` response code and a collection of [file](../resources/file.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_file"
}
-->
``` http
GET https://graph.microsoft.com/beta/compliance/ediscovery/cases/c7158891-fb5d-422a-8f78-25f4028e9821/reviewSets/2ef821af-5899-4c56-bb0c-0d8d599a1c0d/files
```

### Response

>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "isCollection": true,
"@odata.type": "microsoft.graph.ediscovery.file"
}
-->

``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/beta/$metadata#compliance/ediscovery/cases('c7158891-fb5d-422a-8f78-25f4028e9821')/reviewSets('2ef821af-5899-4c56-bb0c-0d8d599a1c0d')/files",
    "@odata.nextLink": "https://graph.microsoft.com/beta/compliance/ediscovery/cases('c7158891-fb5d-422a-8f78-25f4028e9821')/reviewSets('2ef821af-5899-4c56-bb0c-0d8d599a1c0d')/files?$skiptoken=1",
    "value": [
        {
            "id": "00001ead7c180e5db9cbf26cb6fcebd680daadb1db3578de4445fd37680afce4",
            "date": "2021-06-05T08:25:07Z",
            "size": 14336,
            "name": "item.content",
            "sourceType": "mailbox",
            "senderAuthor": [
                "Adele Vance <adelev@contoso.com>"
            ],
            "subjectTitle": null,
            "extension": "content",
            "mediaType": "application/vnd.ms-outlook",
            "processingStatus": "success",
            "otherProperties": {}
        }
    ]
}
```
