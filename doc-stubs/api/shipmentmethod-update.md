---
title: "Update shipmentMethod"
description: "Update the properties of a shipmentMethod object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update shipmentMethod
Namespace: microsoft.graph



Update the properties of a [shipmentMethod](../resources/shipmentmethod.md) object.

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
PATCH /financials/companies/{companyId}/shipmentMethods/{shipmentMethodId}
PATCH /financials/companies/{companyId}/salesQuotes/{salesQuoteId}/shipmentMethod
PATCH /financials/companies/{companyId}/salesInvoices/{salesInvoiceId}/shipmentMethod
PATCH /financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}/customerPayments/{customerPaymentId}/customer/shipmentMethod
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [shipmentMethod](../resources/shipmentmethod.md) object.

The following table shows the properties that are required when you update the [shipmentMethod](../resources/shipmentmethod.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [shipmentMethod](../resources/shipmentmethod.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_shipmentmethod"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/shipmentMethods/{shipmentMethodId}
Content-Type: application/json
Content-length: 105

{
  "@odata.type": "#microsoft.graph.shipmentMethod",
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
  "@odata.type": "#microsoft.graph.shipmentMethod",
  "id": "73ef6cc3-6cc3-73ef-c36c-ef73c36cef73",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

