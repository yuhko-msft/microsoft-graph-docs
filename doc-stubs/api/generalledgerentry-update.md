---
title: "Update generalLedgerEntry"
description: "Update the properties of a generalLedgerEntry object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update generalLedgerEntry
Namespace: microsoft.graph



Update the properties of a [generalLedgerEntry](../resources/generalledgerentry.md) object.

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
PATCH /financials/companies/{companyId}/generalLedgerEntries/{generalLedgerEntryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [generalLedgerEntry](../resources/generalledgerentry.md) object.

The following table shows the properties that are required when you update the [generalLedgerEntry](../resources/generalledgerentry.md).

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

If successful, this method returns a `200 OK` response code and an updated [generalLedgerEntry](../resources/generalledgerentry.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_generalledgerentry"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/generalLedgerEntries/{generalLedgerEntryId}
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
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

