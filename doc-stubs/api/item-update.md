---
title: "Update item"
description: "Update the properties of an item object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update item
Namespace: microsoft.graph



Update the properties of an [item](../resources/item.md) object.

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
PATCH /financials/companies/{companyId}/items/{itemId}
PATCH /financials/companies/{companyId}/salesOrderLines/{salesOrderLineId}/item
PATCH /financials/companies/{companyId}/salesQuoteLines/{salesQuoteLineId}/item
PATCH /financials/companies/{companyId}/salesInvoiceLines/{salesInvoiceLineId}/item
PATCH /financials/companies/{companyId}/purchaseInvoiceLines/{purchaseInvoiceLineId}/item
PATCH /financials/companies/{companyId}/salesCreditMemoLines/{salesCreditMemoLineId}/item
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [item](../resources/item.md) object.

The following table shows the properties that are required when you update the [item](../resources/item.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|baseUnitOfMeasureId|Guid|**TODO: Add Description**|
|blocked|Boolean|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|gtin|String|**TODO: Add Description**|
|inventory|Decimal|**TODO: Add Description**|
|itemCategoryCode|String|**TODO: Add Description**|
|itemCategoryId|Guid|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|priceIncludesTax|Boolean|**TODO: Add Description**|
|taxGroupCode|String|**TODO: Add Description**|
|taxGroupId|Guid|**TODO: Add Description**|
|type|String|**TODO: Add Description**|
|unitCost|Decimal|**TODO: Add Description**|
|unitPrice|Decimal|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [item](../resources/item.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_item"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/items/{itemId}
Content-Type: application/json
Content-length: 428

{
  "@odata.type": "#microsoft.graph.item",
  "baseUnitOfMeasureId": "Guid",
  "blocked": "Boolean",
  "displayName": "String",
  "gtin": "String",
  "inventory": "Decimal",
  "itemCategoryCode": "String",
  "itemCategoryId": "Guid",
  "number": "String",
  "priceIncludesTax": "Boolean",
  "taxGroupCode": "String",
  "taxGroupId": "Guid",
  "type": "String",
  "unitCost": "Decimal",
  "unitPrice": "Decimal"
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
  "@odata.type": "#microsoft.graph.item",
  "id": "58d51876-1876-58d5-7618-d5587618d558",
  "baseUnitOfMeasureId": "Guid",
  "blocked": "Boolean",
  "displayName": "String",
  "gtin": "String",
  "inventory": "Decimal",
  "itemCategoryCode": "String",
  "itemCategoryId": "Guid",
  "lastModifiedDateTime": "String (timestamp)",
  "number": "String",
  "priceIncludesTax": "Boolean",
  "taxGroupCode": "String",
  "taxGroupId": "Guid",
  "type": "String",
  "unitCost": "Decimal",
  "unitPrice": "Decimal"
}
```

