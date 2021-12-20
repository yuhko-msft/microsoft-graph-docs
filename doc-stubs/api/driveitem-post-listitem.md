---
title: "Create listItem"
description: "Create a new listItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create listItem
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [listItem](../resources/listitem.md) object.

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
POST /drive/list/items
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [listItem](../resources/listitem.md) object.

You can specify the following properties when creating a **listItem**.

|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/intune-identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md). Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md). Required.|
|description|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md). Optional.|
|eTag|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md). Optional.|
|lastModifiedBy|[identitySet](../resources/intune-identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md). Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md). Required.|
|name|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md). Optional.|
|parentReference|[itemReference](../resources/itemreference.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md). Optional.|
|webUrl|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md). Optional.|
|contentType|[contentTypeInfo](../resources/contenttypeinfo.md)|**TODO: Add Description** Optional.|
|sharepointIds|[sharepointIds](../resources/sharepointids.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [listItem](../resources/listitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_listitem_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/drive/list/items
Content-Type: application/json
Content-length: 459

{
  "@odata.type": "#microsoft.graph.listItem",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "description": "String",
  "eTag": "String",
  "name": "String",
  "parentReference": {
    "@odata.type": "microsoft.graph.itemReference"
  },
  "webUrl": "String",
  "contentType": {
    "@odata.type": "microsoft.graph.contentTypeInfo"
  },
  "sharepointIds": {
    "@odata.type": "microsoft.graph.sharepointIds"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.listItem"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.listItem",
  "id": "3f4d30df-30df-3f4d-df30-4d3fdf304d3f",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "eTag": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "parentReference": {
    "@odata.type": "microsoft.graph.itemReference"
  },
  "webUrl": "String",
  "contentType": {
    "@odata.type": "microsoft.graph.contentTypeInfo"
  },
  "sharepointIds": {
    "@odata.type": "microsoft.graph.sharepointIds"
  }
}
```

