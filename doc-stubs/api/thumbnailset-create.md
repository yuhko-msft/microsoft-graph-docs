---
title: "Create thumbnailSet"
description: "Create a new thumbnailSet object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create thumbnailSet
Namespace: microsoft.graph

Create a new [thumbnailSet](../resources/thumbnailset.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST /drive/activities/{itemActivityOLDId}/driveItem/thumbnails
POST /drives/{drivesId}/activities/{itemActivityOLDId}/driveItem/thumbnails
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [thumbnailSet](../resources/thumbnailset.md) object.

The following table shows the properties that are required when you create the [thumbnailSet](../resources/thumbnailset.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|large|[thumbnail](../resources/thumbnail.md)|**TODO: Add Description**|
|medium|[thumbnail](../resources/thumbnail.md)|**TODO: Add Description**|
|small|[thumbnail](../resources/thumbnail.md)|**TODO: Add Description**|
|source|[thumbnail](../resources/thumbnail.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [thumbnailSet](../resources/thumbnailset.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_thumbnailset_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/drive/activities/{itemActivityOLDId}/driveItem/thumbnails
Content-Type: application/json
Content-length: 328

{
  "@odata.type": "#microsoft.graph.thumbnailSet",
  "large": {
    "@odata.type": "microsoft.graph.thumbnail"
  },
  "medium": {
    "@odata.type": "microsoft.graph.thumbnail"
  },
  "small": {
    "@odata.type": "microsoft.graph.thumbnail"
  },
  "source": {
    "@odata.type": "microsoft.graph.thumbnail"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.thumbnailSet"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.thumbnailSet",
  "id": "254201ea-01ea-2542-ea01-4225ea014225",
  "large": {
    "@odata.type": "microsoft.graph.thumbnail"
  },
  "medium": {
    "@odata.type": "microsoft.graph.thumbnail"
  },
  "small": {
    "@odata.type": "microsoft.graph.thumbnail"
  },
  "source": {
    "@odata.type": "microsoft.graph.thumbnail"
  }
}
```

