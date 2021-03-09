---
title: "Create sharedInsight"
description: "Create a new sharedInsight object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sharedInsight
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new sharedInsight object.

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
POST /officeGraphInsights/shared
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharedInsight](../resources/sharedinsight.md) object.

The following table shows the properties that are required when you create the [sharedInsight](../resources/sharedinsight.md).

|Property|Type|Description|
|:---|:---|:---|
|lastShared|[sharingDetail](../resources/sharingdetail.md)|**TODO: Add Description**|
|sharingHistory|[sharingDetail](../resources/sharingdetail.md) collection|**TODO: Add Description**|
|resourceVisualization|[resourceVisualization](../resources/resourcevisualization.md)|**TODO: Add Description**|
|resourceReference|[resourceReference](../resources/resourcereference.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [sharedInsight](../resources/sharedinsight.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sharedinsight_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/officeGraphInsights/shared
Content-Type: application/json
Content-length: 419

{
  "@odata.type": "#Microsoft.OfficeGraph.sharedInsight",
  "lastShared": {
    "@odata.type": "microsoft.graph.sharingDetail"
  },
  "sharingHistory": [
    {
      "@odata.type": "microsoft.graph.sharingDetail"
    }
  ],
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
  "@odata.type": "Microsoft.OfficeGraph.sharedInsight"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.OfficeGraph.sharedInsight",
  "lastShared": {
    "@odata.type": "microsoft.graph.sharingDetail"
  },
  "sharingHistory": [
    {
      "@odata.type": "microsoft.graph.sharingDetail"
    }
  ],
  "resourceVisualization": {
    "@odata.type": "microsoft.graph.resourceVisualization"
  },
  "resourceReference": {
    "@odata.type": "microsoft.graph.resourceReference"
  }
}
```

