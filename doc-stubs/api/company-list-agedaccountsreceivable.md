---
title: "List agedAccountsReceivable"
description: "Get the agedAccountsReceivable resources from the agedAccountsReceivable navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List agedAccountsReceivable
Namespace: microsoft.graph



Get the agedAccountsReceivable resources from the agedAccountsReceivable navigation property.

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
GET /financials/companies/{companyId}/agedAccountsReceivable
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

If successful, this method returns a `200 OK` response code and a collection of [agedAccountsReceivable](../resources/agedaccountsreceivable.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_agedaccountsreceivable"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/agedAccountsReceivable
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.agedAccountsReceivable)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.agedAccountsReceivable",
      "id": "ce9f11c8-11c8-ce9f-c811-9fcec8119fce",
      "agedAsOfDate": "Date",
      "balanceDue": "Decimal",
      "currencyCode": "String",
      "currentAmount": "Decimal",
      "customerNumber": "String",
      "name": "String",
      "period1Amount": "Decimal",
      "period2Amount": "Decimal",
      "period3Amount": "Decimal",
      "periodLengthFilter": "String"
    }
  ]
}
```

