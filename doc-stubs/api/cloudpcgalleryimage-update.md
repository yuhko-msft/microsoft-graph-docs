---
title: "Update cloudPcGalleryImage"
description: "Update the properties of a cloudPcGalleryImage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update cloudPcGalleryImage
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [cloudPcGalleryImage](../resources/cloudpcgalleryimage.md) object.

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
PATCH /deviceManagement/virtualEndpoint/galleryImages/{cloudPcGalleryImageId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [cloudPcGalleryImage](../resources/cloudpcgalleryimage.md) object.

The following table shows the properties that are required when you update the [cloudPcGalleryImage](../resources/cloudpcgalleryimage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|offerDisplayName|String|**TODO: Add Description**|
|skuDisplayName|String|**TODO: Add Description**|
|publisher|String|**TODO: Add Description**|
|offer|String|**TODO: Add Description**|
|sku|String|**TODO: Add Description**|
|recommendedSku|String|**TODO: Add Description**|
|status|cloudPcGalleryImageStatus|**TODO: Add Description**. The possible values are: `supported`, `supportedWithWarning`, `notSupported`, `unknownFutureValue`.|
|sizeInGB|Int32|**TODO: Add Description**|
|startDate|Date|**TODO: Add Description**|
|endDate|Date|**TODO: Add Description**|
|expirationDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [cloudPcGalleryImage](../resources/cloudpcgalleryimage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_cloudpcgalleryimage"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/galleryImages/{cloudPcGalleryImageId}
Content-Type: application/json
Content-length: 376

{
  "@odata.type": "#microsoft.graph.cloudPcGalleryImage",
  "displayName": "String",
  "offerDisplayName": "String",
  "skuDisplayName": "String",
  "publisher": "String",
  "offer": "String",
  "sku": "String",
  "recommendedSku": "String",
  "status": "String",
  "sizeInGB": "Integer",
  "startDate": "Date",
  "endDate": "Date",
  "expirationDate": "Date"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.cloudPcGalleryImage",
  "id": "058709e4-09e4-0587-e409-8705e4098705",
  "displayName": "String",
  "offerDisplayName": "String",
  "skuDisplayName": "String",
  "publisher": "String",
  "offer": "String",
  "sku": "String",
  "recommendedSku": "String",
  "status": "String",
  "sizeInGB": "Integer",
  "startDate": "Date",
  "endDate": "Date",
  "expirationDate": "Date"
}
```

