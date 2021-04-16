---
title: "Create paymentMethod"
description: "Create a new paymentMethod object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create paymentMethod
Namespace: microsoft.graph



Create a new paymentMethod object.

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
POST /financials/companies/{companyId}/paymentMethods
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [paymentMethod](../resources/paymentmethod.md) object.

The following table shows the properties that are required when you create the [paymentMethod](../resources/paymentmethod.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [paymentMethod](../resources/paymentmethod.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_paymentmethod_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/financials/companies/{companyId}/paymentMethods
Content-Type: application/json
Content-length: 104

{
  "@odata.type": "#microsoft.graph.paymentMethod",
  "code": "String",
  "displayName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.paymentMethod"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.paymentMethod",
  "id": "03ec6918-6918-03ec-1869-ec031869ec03",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

