---
title: "Get itemActivity"
description: "Read the properties and relationships of an itemActivity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get itemActivity
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [itemActivity](../resources/itemactivity.md) object.

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
GET /drive/activities/{itemActivityId}
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

If successful, this method returns a `200 OK` response code and an [itemActivity](../resources/itemactivity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_itemactivity"
}
-->
``` http
GET https://graph.microsoft.com/beta/drive/activities/{itemActivityId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.itemActivity"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.itemActivity",
    "id": "70cfd020-d020-70cf-20d0-cf7020d0cf70",
    "action": {
      "@odata.type": "microsoft.graph.itemActionSet"
    },
    "actor": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "times": {
      "@odata.type": "microsoft.graph.itemActivityTimeSet"
    }
  }
}
```

