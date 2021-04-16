---
title: "Update externalItem"
description: "Update the properties of an externalItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update externalItem
Namespace: microsoft.graph.externalConnectors



Update the properties of an [externalItem](../resources/externalconnectors-externalitem.md) object.

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
PATCH /connections/{connectionsId}/items/{externalItemId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [externalItem](../resources/externalconnectors-externalitem.md) object.

The following table shows the properties that are required when you update the [externalItem](../resources/externalconnectors-externalitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/externalconnectors-entity.md)|
|acl|[acl](../resources/externalconnectors-acl.md) collection|**TODO: Add Description**|
|content|[externalItemContent](../resources/externalconnectors-externalitemcontent.md)|**TODO: Add Description**|
|previews|[externalItemPreview](../resources/externalconnectors-externalitempreview.md) collection|**TODO: Add Description**|
|properties|[properties](../resources/externalconnectors-properties.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [externalItem](../resources/externalconnectors-externalitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_externalitem"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/connections/{connectionsId}/items/{externalItemId}
Content-Type: application/json
Content-length: 476

{
  "@odata.type": "#microsoft.graph.externalConnectors.externalItem",
  "acl": [
    {
      "@odata.type": "microsoft.graph.externalConnectors.acl"
    }
  ],
  "content": {
    "@odata.type": "microsoft.graph.externalConnectors.externalItemContent"
  },
  "previews": [
    {
      "@odata.type": "microsoft.graph.externalConnectors.externalItemPreview"
    }
  ],
  "properties": {
    "@odata.type": "microsoft.graph.externalConnectors.properties"
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
  "@odata.type": "#microsoft.graph.externalConnectors.externalItem",
  "id": "7496b67f-b67f-7496-7fb6-96747fb69674",
  "acl": [
    {
      "@odata.type": "microsoft.graph.externalConnectors.acl"
    }
  ],
  "content": {
    "@odata.type": "microsoft.graph.externalConnectors.externalItemContent"
  },
  "previews": [
    {
      "@odata.type": "microsoft.graph.externalConnectors.externalItemPreview"
    }
  ],
  "properties": {
    "@odata.type": "microsoft.graph.externalConnectors.properties"
  }
}
```

