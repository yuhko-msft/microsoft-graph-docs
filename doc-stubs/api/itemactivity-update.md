---
title: "Update itemActivity"
description: "Update the properties of an itemActivity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update itemActivity
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [itemActivity](../resources/itemactivity.md) object.

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
PATCH /drive/activities/{itemActivityId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [itemActivity](../resources/itemactivity.md) object.

The following table shows the properties that are required when you update the [itemActivity](../resources/itemactivity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|action|[itemActionSet](../resources/itemactionset.md)|**TODO: Add Description**|
|actor|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|times|[itemActivityTimeSet](../resources/itemactivitytimeset.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [itemActivity](../resources/itemactivity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_itemactivity"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/drive/activities/{itemActivityId}
Content-Type: application/json
Content-length: 275

{
  "@odata.type": "#microsoft.graph.itemActivity",
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
```

