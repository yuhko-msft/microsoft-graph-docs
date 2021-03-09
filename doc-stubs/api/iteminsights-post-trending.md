---
title: "Create trending"
description: "Create a new trending object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create trending
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new trending object.

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
POST /user/insights/trending
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [trending](../resources/trending.md) object.

The following table shows the properties that are required when you create the [trending](../resources/trending.md).

|Property|Type|Description|
|:---|:---|:---|
|weight|Double|**TODO: Add Description**|
|resourceVisualization|[resourceVisualization](../resources/resourcevisualization.md)|**TODO: Add Description**|
|resourceReference|[resourceReference](../resources/resourcereference.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [trending](../resources/trending.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_trending_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/user/insights/trending
Content-Type: application/json
Content-length: 263

{
  "@odata.type": "#Microsoft.OfficeGraph.trending",
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
  "truncated": true,
  "@odata.type": "Microsoft.OfficeGraph.trending"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.OfficeGraph.trending",
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

