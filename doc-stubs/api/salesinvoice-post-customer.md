---
title: "Create customer"
description: "Create a new customer object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create customer
Namespace: microsoft.graph



Create a new customer object.

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
POST /financials/companies/{companyId}/salesInvoices/{salesInvoiceId}/customer
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [customer](../resources/customer.md) object.

The following table shows the properties that are required when you create the [customer](../resources/customer.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|address|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|blocked|String|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currencyId|Guid|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|paymentMethodId|Guid|**TODO: Add Description**|
|paymentTermsId|Guid|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|shipmentMethodId|Guid|**TODO: Add Description**|
|taxAreaDisplayName|String|**TODO: Add Description**|
|taxAreaId|Guid|**TODO: Add Description**|
|taxLiable|Boolean|**TODO: Add Description**|
|taxRegistrationNumber|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|
|website|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [customer](../resources/customer.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_customer_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/financials/companies/{companyId}/salesInvoices/{salesInvoiceId}/customer
Content-Type: application/json
Content-length: 566

{
  "@odata.type": "#microsoft.graph.customer",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "blocked": "String",
  "currencyCode": "String",
  "currencyId": "Guid",
  "displayName": "String",
  "email": "String",
  "number": "String",
  "paymentMethodId": "Guid",
  "paymentTermsId": "Guid",
  "phoneNumber": "String",
  "shipmentMethodId": "Guid",
  "taxAreaDisplayName": "String",
  "taxAreaId": "Guid",
  "taxLiable": "Boolean",
  "taxRegistrationNumber": "String",
  "type": "String",
  "website": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.customer"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.customer",
  "id": "3b2f52b9-52b9-3b2f-b952-2f3bb9522f3b",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "blocked": "String",
  "currencyCode": "String",
  "currencyId": "Guid",
  "displayName": "String",
  "email": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "number": "String",
  "paymentMethodId": "Guid",
  "paymentTermsId": "Guid",
  "phoneNumber": "String",
  "shipmentMethodId": "Guid",
  "taxAreaDisplayName": "String",
  "taxAreaId": "Guid",
  "taxLiable": "Boolean",
  "taxRegistrationNumber": "String",
  "type": "String",
  "website": "String"
}
```

