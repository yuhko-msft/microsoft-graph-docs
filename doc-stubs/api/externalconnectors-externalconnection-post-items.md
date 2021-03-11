---
title: "Create externalItem"
description: "Create a new externalItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create externalItem
Namespace: microsoft.graph.externalConnectors



Create a new externalItem object.

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
POST /connections/{connectionsId}/items
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [externalItem](../resources/externalconnectors-externalitem.md) object.

The following table shows the properties that are required when you create the [externalItem](../resources/externalconnectors-externalitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|properties|[properties](../resources/externalconnectors-properties.md)|**TODO: Add Description**|
|content|[externalItemContent](../resources/externalconnectors-externalitemcontent.md)|**TODO: Add Description**|
|acl|[acl](../resources/externalconnectors-acl.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [externalItem](../resources/externalconnectors-externalitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_externalitem_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/connections/{connectionsId}/items
Content-Type: application/json
Content-length: 360

{
  "@odata.type": "#microsoft.graph.externalConnectors.externalItem",
  "properties": {
    "@odata.type": "microsoft.graph.externalConnectors.properties"
  },
  "content": {
    "@odata.type": "microsoft.graph.externalConnectors.externalItemContent"
  },
  "acl": [
    {
      "@odata.type": "microsoft.graph.externalConnectors.acl"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.externalConnectors.externalItem"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.externalConnectors.externalItem",
  "id": "7b50de70-de70-7b50-70de-507b70de507b",
  "properties": {
    "@odata.type": "microsoft.graph.externalConnectors.properties"
  },
  "content": {
    "@odata.type": "microsoft.graph.externalConnectors.externalItemContent"
  },
  "acl": [
    {
      "@odata.type": "microsoft.graph.externalConnectors.acl"
    }
  ]
}
```

