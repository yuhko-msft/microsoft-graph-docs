---
title: "Update customerPaymentJournal"
description: "Update the properties of a customerPaymentJournal object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update customerPaymentJournal
Namespace: microsoft.graph



Update the properties of a [customerPaymentJournal](../resources/customerpaymentjournal.md) object.

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
PATCH /financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [customerPaymentJournal](../resources/customerpaymentjournal.md) object.

The following table shows the properties that are required when you update the [customerPaymentJournal](../resources/customerpaymentjournal.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|balancingAccountId|Guid|**TODO: Add Description**|
|balancingAccountNumber|String|**TODO: Add Description**|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [customerPaymentJournal](../resources/customerpaymentjournal.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_customerpaymentjournal"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}
Content-Type: application/json
Content-length: 185

{
  "@odata.type": "#microsoft.graph.customerPaymentJournal",
  "balancingAccountId": "Guid",
  "balancingAccountNumber": "String",
  "code": "String",
  "displayName": "String"
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
  "@odata.type": "#microsoft.graph.customerPaymentJournal",
  "id": "0aa92d1e-2d1e-0aa9-1e2d-a90a1e2da90a",
  "balancingAccountId": "Guid",
  "balancingAccountNumber": "String",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

