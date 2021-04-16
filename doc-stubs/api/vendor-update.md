---
title: "Update vendor"
description: "Update the properties of a vendor object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update vendor
Namespace: microsoft.graph



Update the properties of a [vendor](../resources/vendor.md) object.

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
PATCH /financials/companies/{companyId}/vendors/{vendorId}
PATCH /financials/companies/{companyId}/purchaseInvoices/{purchaseInvoiceId}/vendor
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [vendor](../resources/vendor.md) object.

The following table shows the properties that are required when you update the [vendor](../resources/vendor.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|address|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|balance|Decimal|**TODO: Add Description**|
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
|taxLiable|Boolean|**TODO: Add Description**|
|taxRegistrationNumber|String|**TODO: Add Description**|
|website|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [vendor](../resources/vendor.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_vendor"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/vendors/{vendorId}
Content-Type: application/json
Content-length: 478

{
  "@odata.type": "#microsoft.graph.vendor",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "balance": "Decimal",
  "blocked": "String",
  "currencyCode": "String",
  "currencyId": "Guid",
  "displayName": "String",
  "email": "String",
  "number": "String",
  "paymentMethodId": "Guid",
  "paymentTermsId": "Guid",
  "phoneNumber": "String",
  "taxLiable": "Boolean",
  "taxRegistrationNumber": "String",
  "website": "String"
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
  "@odata.type": "#microsoft.graph.vendor",
  "id": "4ac54f99-4f99-4ac5-994f-c54a994fc54a",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "balance": "Decimal",
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
  "taxLiable": "Boolean",
  "taxRegistrationNumber": "String",
  "website": "String"
}
```

