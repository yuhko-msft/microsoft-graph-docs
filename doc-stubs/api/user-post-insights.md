---
title: "Create itemInsights"
description: "Create a new itemInsights object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create itemInsights
Namespace: microsoft.graph



Create a new itemInsights object.

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
POST /me/insights
POST /users/{usersId}/insights
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [itemInsights](../resources/iteminsights.md) object.

The following table shows the properties that are required when you create the [itemInsights](../resources/iteminsights.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|



## Response

If successful, this method returns a `201 Created` response code and an [itemInsights](../resources/iteminsights.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iteminsights_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/insights
Content-Type: application/json
Content-length: 54

{
  "@odata.type": "#microsoft.graph.itemInsights"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.itemInsights"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.itemInsights",
  "id": "6cd7dcff-dcff-6cd7-ffdc-d76cffdcd76c"
}
```

