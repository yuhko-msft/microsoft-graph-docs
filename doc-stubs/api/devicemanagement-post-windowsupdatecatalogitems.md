---
title: "Create windowsUpdateCatalogItem"
description: "Create a new windowsUpdateCatalogItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsUpdateCatalogItem
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new windowsUpdateCatalogItem object.

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
POST /deviceManagement/windowsUpdateCatalogItems
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) object.

The following table shows the properties that are required when you create the [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The display name for the catalog item.|
|endOfSupportDate|DateTimeOffset|The last supported date for a catalog item|
|releaseDateTime|DateTimeOffset|The date the catalog item was released|



## Response

If successful, this method returns a `201 Created` response code and a [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsupdatecatalogitem_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/windowsUpdateCatalogItems
Content-Type: application/json
Content-length: 183

{
  "@odata.type": "#microsoft.graph.windowsUpdateCatalogItem",
  "displayName": "String",
  "endOfSupportDate": "String (timestamp)",
  "releaseDateTime": "String (timestamp)"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsUpdateCatalogItem"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsUpdateCatalogItem",
  "id": "82f1bbf8-bbf8-82f1-f8bb-f182f8bbf182",
  "displayName": "String",
  "endOfSupportDate": "String (timestamp)",
  "releaseDateTime": "String (timestamp)"
}
```

