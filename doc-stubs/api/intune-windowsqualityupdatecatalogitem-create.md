---
title: "Create windowsQualityUpdateCatalogItem"
description: "Create a new windowsQualityUpdateCatalogItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsQualityUpdateCatalogItem
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) object.

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
POST ** Collection URI for microsoft.graph.windowsQualityUpdateCatalogItem not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) object.

The following table shows the properties that are required when you create the [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|
|releaseDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|
|endOfSupportDate|DateTimeOffset|**TODO: Add Description** Inherited from [windowsUpdateCatalogItem](../resources/intune-windowsupdatecatalogitem.md)|
|kbArticleId|String|**TODO: Add Description**|
|classification|windowsQualityUpdateClassification|**TODO: Add Description**. Possible values are: `all`, `security`, `nonSecurity`.|
|isExpeditable|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsqualityupdatecatalogitem_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.windowsQualityUpdateCatalogItem not found
Content-Type: application/json
Content-length: 280

{
  "@odata.type": "#microsoft.graph.windowsQualityUpdateCatalogItem",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)",
  "endOfSupportDate": "String (timestamp)",
  "kbArticleId": "String",
  "classification": "String",
  "isExpeditable": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsQualityUpdateCatalogItem"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsQualityUpdateCatalogItem",
  "id": "8ee098b3-98b3-8ee0-b398-e08eb398e08e",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)",
  "endOfSupportDate": "String (timestamp)",
  "kbArticleId": "String",
  "classification": "String",
  "isExpeditable": "Boolean"
}
```

