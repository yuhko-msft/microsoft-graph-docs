---
title: "Update agedAccountsReceivable"
description: "Update the properties of an agedAccountsReceivable object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update agedAccountsReceivable
Namespace: microsoft.graph



Update the properties of an [agedAccountsReceivable](../resources/agedaccountsreceivable.md) object.

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
PATCH /financials/companies/{companyId}/agedAccountsReceivable/{agedAccountsReceivableId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [agedAccountsReceivable](../resources/agedaccountsreceivable.md) object.

The following table shows the properties that are required when you update the [agedAccountsReceivable](../resources/agedaccountsreceivable.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|agedAsOfDate|Date|**TODO: Add Description**|
|balanceDue|Decimal|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currentAmount|Decimal|**TODO: Add Description**|
|customerNumber|String|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|period1Amount|Decimal|**TODO: Add Description**|
|period2Amount|Decimal|**TODO: Add Description**|
|period3Amount|Decimal|**TODO: Add Description**|
|periodLengthFilter|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [agedAccountsReceivable](../resources/agedaccountsreceivable.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_agedaccountsreceivable"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/agedAccountsReceivable/{agedAccountsReceivableId}
Content-Type: application/json
Content-length: 359

{
  "@odata.type": "#microsoft.graph.agedAccountsReceivable",
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
```

