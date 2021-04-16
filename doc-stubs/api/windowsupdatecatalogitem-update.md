---
title: "Update windowsUpdateCatalogItem"
description: "Update the properties of a windowsUpdateCatalogItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsUpdateCatalogItem
Namespace: microsoft.graph



Update the properties of a [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) object.

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
PATCH /deviceManagement/windowsUpdateCatalogItems/{windowsUpdateCatalogItemId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) object.

The following table shows the properties that are required when you update the [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The display name for the catalog item.|
|releaseDateTime|DateTimeOffset|The date the catalog item was released|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsupdatecatalogitem"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/windowsUpdateCatalogItems/{windowsUpdateCatalogItemId}
Content-Type: application/json
Content-length: 138

{
  "@odata.type": "#microsoft.graph.windowsUpdateCatalogItem",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.windowsUpdateCatalogItem",
  "id": "f6a7a14d-a14d-f6a7-4da1-a7f64da1a7f6",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)"
}
```

