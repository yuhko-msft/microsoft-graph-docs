---
title: "List journalLines"
description: "Get a list of the journalLine objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List journalLines
Namespace: microsoft.graph



Get a list of the [journalLine](../resources/journalline.md) objects and their properties.

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
GET /financials/companies/{companyId}/journalLines
GET /financials/companies/{companyId}/journals/{journalId}/journalLines
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

If successful, this method returns a `200 OK` response code and a collection of [journalLine](../resources/journalline.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_journalline"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/journalLines
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.journalLine)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.journalLine",
      "id": "5b14e786-e786-5b14-86e7-145b86e7145b",
      "accountId": "Guid",
      "accountNumber": "String",
      "amount": "Decimal",
      "comment": "String",
      "description": "String",
      "documentNumber": "String",
      "externalDocumentNumber": "String",
      "journalDisplayName": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "lineNumber": "Integer",
      "postingDate": "Date"
    }
  ]
}
```

