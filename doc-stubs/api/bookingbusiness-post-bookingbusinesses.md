---
title: "Create bookingBusiness"
description: "Create a new bookingBusiness object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create bookingBusiness
Namespace: microsoft.graph



Create a new [bookingBusiness](../resources/bookingbusiness.md) object.

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
POST /bookingBusinesses
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [bookingBusiness](../resources/bookingbusiness.md) object.

The following table shows the properties that are required when you create the [bookingBusiness](../resources/bookingbusiness.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|Display name of this entity.
The display name is suitable for human-readable interfaces. Inherited from [bookingNamedEntity](../resources/bookingnamedentity.md)|
|address|[physicalAddress](../resources/physicaladdress.md)|**TODO: Add Description**|
|businessHours|[bookingWorkHours](../resources/bookingworkhours.md) collection|**TODO: Add Description**|
|businessType|String|**TODO: Add Description**|
|defaultCurrencyIso|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|isPublished|Boolean|**TODO: Add Description**|
|phone|String|**TODO: Add Description**|
|publicUrl|String|**TODO: Add Description**|
|schedulingPolicy|[bookingSchedulingPolicy](../resources/bookingschedulingpolicy.md)|**TODO: Add Description**|
|webSiteUrl|String|The URL of the business web site.
Example: https://www.contoso.com|



## Response

If successful, this method returns a `201 Created` response code and a [bookingBusiness](../resources/bookingbusiness.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_bookingbusiness_from_bookingbusinesses"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/bookingBusinesses
Content-Type: application/json
Content-length: 543

{
  "@odata.type": "#microsoft.graph.bookingBusiness",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

