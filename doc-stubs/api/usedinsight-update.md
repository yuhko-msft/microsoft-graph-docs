---
title: "Update usedInsight"
description: "Update the properties of an usedInsight object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update usedInsight
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [usedInsight](../resources/usedinsight.md) object.

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
PATCH /officeGraphInsights/used/{usedInsightId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [usedInsight](../resources/usedinsight.md) object.

The following table shows the properties that are required when you update the [usedInsight](../resources/usedinsight.md).

|Property|Type|Description|
|:---|:---|:---|
|lastUsed|[usageDetails](../resources/usagedetails.md)|**TODO: Add Description**|
|resourceVisualization|[resourceVisualization](../resources/resourcevisualization.md)|**TODO: Add Description**|
|resourceReference|[resourceReference](../resources/resourcereference.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [usedInsight](../resources/usedinsight.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_usedinsight"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/officeGraphInsights/used/{usedInsightId}
Content-Type: application/json
Content-length: 311

{
  "@odata.type": "#microsoft.graph.usedInsight",
  "lastUsed": {
    "@odata.type": "microsoft.graph.usageDetails"
  },
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
  "@odata.type": "#microsoft.graph.usedInsight",
  "lastUsed": {
    "@odata.type": "microsoft.graph.usageDetails"
  },
  "resourceVisualization": {
    "@odata.type": "microsoft.graph.resourceVisualization"
  },
  "resourceReference": {
    "@odata.type": "microsoft.graph.resourceReference"
  }
}
```

