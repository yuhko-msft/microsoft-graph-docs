---
title: "Update trending"
description: "Update the properties of a trending object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update trending
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [trending](../resources/trending.md) object.

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
PATCH /officeGraphInsights/trending/{trendingId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [trending](../resources/trending.md) object.

The following table shows the properties that are required when you update the [trending](../resources/trending.md).

|Property|Type|Description|
|:---|:---|:---|
|weight|Double|**TODO: Add Description**|
|resourceVisualization|[resourceVisualization](../resources/resourcevisualization.md)|**TODO: Add Description**|
|resourceReference|[resourceReference](../resources/resourcereference.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [trending](../resources/trending.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_trending"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/officeGraphInsights/trending/{trendingId}
Content-Type: application/json
Content-length: 257

{
  "@odata.type": "#microsoft.graph.trending",
  "weight": "Double",
  "resourceVisualization": {
    "@odata.type": "microsoft.graph.resourceVisualization"
  },
  "resourceReference": {
    "@odata.type": "microsoft.graph.resourceReference"
  }
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
  "@odata.type": "#microsoft.graph.trending",
  "weight": "Double",
  "resourceVisualization": {
    "@odata.type": "microsoft.graph.resourceVisualization"
  },
  "resourceReference": {
    "@odata.type": "microsoft.graph.resourceReference"
  },
  "lastModifiedDateTime": "String (timestamp)"
}
```

