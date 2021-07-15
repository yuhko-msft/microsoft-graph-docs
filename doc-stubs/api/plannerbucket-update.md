---
title: "Update plannerBucket"
description: "Update the properties of a plannerBucket object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update plannerBucket
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [plannerBucket](../resources/plannerbucket.md) object.

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
PATCH /planner/buckets/{plannerBucketId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [plannerBucket](../resources/plannerbucket.md) object.

The following table shows the properties that are required when you update the [plannerBucket](../resources/plannerbucket.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|
|orderHint|String|**TODO: Add Description**|
|planId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [plannerBucket](../resources/plannerbucket.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_plannerbucket"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/planner/buckets/{plannerBucketId}
Content-Type: application/json
Content-length: 125

{
  "@odata.type": "#microsoft.graph.plannerBucket",
  "name": "String",
  "orderHint": "String",
  "planId": "String"
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
  "@odata.type": "#microsoft.graph.plannerBucket",
  "id": "76053fad-3fad-7605-ad3f-0576ad3f0576",
  "name": "String",
  "orderHint": "String",
  "planId": "String"
}
```

