---
title: "Update itemCategory"
description: "Update the properties of an itemCategory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update itemCategory
Namespace: microsoft.graph



Update the properties of an [itemCategory](../resources/itemcategory.md) object.

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
PATCH /financials/companies/{companyId}/items/{itemId}/itemCategory
PATCH /financials/companies/{companyId}/itemCategories/{itemCategoryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [itemCategory](../resources/itemcategory.md) object.

The following table shows the properties that are required when you update the [itemCategory](../resources/itemcategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [itemCategory](../resources/itemcategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_itemcategory"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/items/{itemId}/itemCategory
Content-Type: application/json
Content-length: 103

{
  "@odata.type": "#microsoft.graph.itemCategory",
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
  "@odata.type": "#microsoft.graph.itemCategory",
  "id": "cf606b25-6b25-cf60-256b-60cf256b60cf",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

