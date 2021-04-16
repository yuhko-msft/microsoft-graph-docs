---
title: "Get bookingBusiness"
description: "Read the properties and relationships of a bookingBusiness object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get bookingBusiness
Namespace: microsoft.graph



Read the properties and relationships of a [bookingBusiness](../resources/bookingbusiness.md) object.

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
GET /bookingBusinesses/{bookingBusinessesId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [bookingBusiness](../resources/bookingbusiness.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_bookingbusiness"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/bookingBusinesses/{bookingBusinessesId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.bookingBusiness"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.bookingBusiness",
    "id": "87b915c9-15c9-87b9-c915-b987c915b987",
    "displayName": "String",
    "address": {
      "@odata.type": "microsoft.graph.physicalAddress"
    },
    "businessHours": [
      {
        "@odata.type": "microsoft.graph.bookingWorkHours"
      }
    ],
    "businessType": "String",
    "defaultCurrencyIso": "String",
    "email": "String",
    "isPublished": "Boolean",
    "phone": "String",
    "publicUrl": "String",
    "schedulingPolicy": {
      "@odata.type": "microsoft.graph.bookingSchedulingPolicy"
    },
    "webSiteUrl": "String"
  }
}
```

