---
title: "Create generalLedgerEntry"
description: "Create a new generalLedgerEntry object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create generalLedgerEntry
Namespace: microsoft.graph



Create a new generalLedgerEntry object.

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
POST /financials/companies/{companyId}/generalLedgerEntries
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [generalLedgerEntry](../resources/generalledgerentry.md) object.

The following table shows the properties that are required when you create the [generalLedgerEntry](../resources/generalledgerentry.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accountId|Guid|**TODO: Add Description**|
|accountNumber|String|**TODO: Add Description**|
|creditAmount|Decimal|**TODO: Add Description**|
|debitAmount|Decimal|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|documentNumber|String|**TODO: Add Description**|
|documentType|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|postingDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [generalLedgerEntry](../resources/generalledgerentry.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_generalledgerentry_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/financials/companies/{companyId}/generalLedgerEntries
Content-Type: application/json
Content-length: 287

{
  "@odata.type": "#microsoft.graph.generalLedgerEntry",
  "accountId": "Guid",
  "accountNumber": "String",
  "creditAmount": "Decimal",
  "debitAmount": "Decimal",
  "description": "String",
  "documentNumber": "String",
  "documentType": "String",
  "postingDate": "Date"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.generalLedgerEntry"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.generalLedgerEntry",
  "id": "e6e6ac87-ac87-e6e6-87ac-e6e687ace6e6",
  "accountId": "Guid",
  "accountNumber": "String",
  "creditAmount": "Decimal",
  "debitAmount": "Decimal",
  "description": "String",
  "documentNumber": "String",
  "documentType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "postingDate": "Date"
}
```

