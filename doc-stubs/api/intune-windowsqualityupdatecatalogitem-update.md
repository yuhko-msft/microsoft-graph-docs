---
title: "Update windowsQualityUpdateCatalogItem"
description: "Update the properties of a windowsQualityUpdateCatalogItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsQualityUpdateCatalogItem
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) object.

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
PATCH /windowsQualityUpdateCatalogItem
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) object.

The following table shows the properties that are required when you update the [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md).

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

If successful, this method returns a `200 OK` response code and an updated [windowsQualityUpdateCatalogItem](../resources/intune-windowsqualityupdatecatalogitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsqualityupdatecatalogitem"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/windowsQualityUpdateCatalogItem
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
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

