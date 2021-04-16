---
title: "Create agedAccountsPayable"
description: "Create a new agedAccountsPayable object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create agedAccountsPayable
Namespace: microsoft.graph



Create a new [agedAccountsPayable](../resources/agedaccountspayable.md) object.

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
POST /financials/companies/{companyId}/agedAccountsPayable
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [agedAccountsPayable](../resources/agedaccountspayable.md) object.

The following table shows the properties that are required when you create the [agedAccountsPayable](../resources/agedaccountspayable.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|agedAsOfDate|Date|**TODO: Add Description**|
|balanceDue|Decimal|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currentAmount|Decimal|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|period1Amount|Decimal|**TODO: Add Description**|
|period2Amount|Decimal|**TODO: Add Description**|
|period3Amount|Decimal|**TODO: Add Description**|
|periodLengthFilter|String|**TODO: Add Description**|
|vendorNumber|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [agedAccountsPayable](../resources/agedaccountspayable.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_agedaccountspayable_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/financials/companies/{companyId}/agedAccountsPayable
Content-Type: application/json
Content-length: 354

{
  "@odata.type": "#microsoft.graph.agedAccountsPayable",
  "agedAsOfDate": "Date",
  "balanceDue": "Decimal",
  "currencyCode": "String",
  "currentAmount": "Decimal",
  "name": "String",
  "period1Amount": "Decimal",
  "period2Amount": "Decimal",
  "period3Amount": "Decimal",
  "periodLengthFilter": "String",
  "vendorNumber": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.agedAccountsPayable"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.agedAccountsPayable",
  "id": "dea8227a-227a-dea8-7a22-a8de7a22a8de",
  "agedAsOfDate": "Date",
  "balanceDue": "Decimal",
  "currencyCode": "String",
  "currentAmount": "Decimal",
  "name": "String",
  "period1Amount": "Decimal",
  "period2Amount": "Decimal",
  "period3Amount": "Decimal",
  "periodLengthFilter": "String",
  "vendorNumber": "String"
}
```

