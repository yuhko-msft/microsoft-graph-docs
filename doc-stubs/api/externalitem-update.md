---
title: "Update externalItem"
description: "Update the properties of an externalItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update externalItem
Namespace: microsoft.graph



Update the properties of an [externalItem](../resources/externalitem.md) object.

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
PATCH /external/connections/{externalConnectionId}/items/{externalItemId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [externalItem](../resources/externalitem.md) object.

The following table shows the properties that are required when you update the [externalItem](../resources/externalitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|acl|[acl](../resources/acl.md) collection|**TODO: Add Description**|
|content|[externalItemContent](../resources/externalitemcontent.md)|**TODO: Add Description**|
|properties|[properties](../resources/properties.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [externalItem](../resources/externalitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_externalitem"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/external/connections/{externalConnectionId}/items/{externalItemId}
Content-Type: application/json
Content-length: 284

{
  "@odata.type": "#microsoft.graph.externalItem",
  "acl": [
    {
      "@odata.type": "microsoft.graph.acl"
    }
  ],
  "content": {
    "@odata.type": "microsoft.graph.externalItemContent"
  },
  "properties": {
    "@odata.type": "microsoft.graph.properties"
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
  "@odata.type": "#microsoft.graph.externalItem",
  "id": "94d05742-5742-94d0-4257-d0944257d094",
  "acl": [
    {
      "@odata.type": "microsoft.graph.acl"
    }
  ],
  "content": {
    "@odata.type": "microsoft.graph.externalItemContent"
  },
  "properties": {
    "@odata.type": "microsoft.graph.properties"
  }
}
```

