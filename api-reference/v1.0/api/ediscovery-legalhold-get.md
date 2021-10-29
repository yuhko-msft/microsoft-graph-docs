---
title: "Get legalHold"
description: "Read the properties and relationships of a legalHold object."
ms.localizationpriority: medium
author: "mahage-msft"
ms.prod: "ediscovery"
doc_type: apiPageType
---

# Get legalHold

Namespace: microsoft.graph.ediscovery

Read the properties and relationships of a [legalHold](../resources/ediscovery-legalhold.md) object.

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
GET /compliance/ediscovery/cases/{caseId}/legalHolds/{legalholdId}
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

If successful, this method returns a `200 OK` response code and a [microsoft.graph.ediscovery.legalHold](../resources/ediscovery-legalhold.md) object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_legalhold"
}
-->

``` http
GET https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/10de56cd-1c9c-43a1-b39c-fd412f25cd42/legalholds
```

### Response

**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.legalHold"
}
-->

``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/beta/$metadata#compliance/ediscovery/cases('10de56cd-1c9c-43a1-b39c-fd412f25cd42')/legalHolds",
    "value": [
        {
            "description": null,
            "lastModifiedDateTime": "2021-09-28T15:58:35Z",
            "isEnabled": false,
            "status": "Pending",
            "contentQuery": null,
            "errors": [],
            "id": "8294d1c2-8d84-4dd9-ac33-cf13dab80d89",
            "displayName": "CustodianHold-10de56cd1c9c43a1-0637684414664473464",
            "createdDateTime": "2021-09-28T15:57:47Z",
            "createdBy": {
                "user": {
                    "id": "8a0c4a12-8b20-4eb1-ae1e-3c8c3ed19afa",
                    "displayName": "EDisco Admin"
                }
            },
            "lastModifiedBy": {
                "user": {
                    "id": "8a0c4a12-8b20-4eb1-ae1e-3c8c3ed19afa",
                    "displayName": "EDisco Admin"
                }
            }
        }
    ]
}
```
