---
title: "Update qualityUpdateCatalogEntry"
description: "Update the properties of a qualityUpdateCatalogEntry object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update qualityUpdateCatalogEntry
Namespace: microsoft.graph.windowsUpdates



Update the properties of a [qualityUpdateCatalogEntry](../resources/windowsupdates-qualityupdatecatalogentry.md) object.

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
PATCH /qualityUpdateCatalogEntry
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [qualityUpdateCatalogEntry](../resources/windowsupdates-qualityupdatecatalogentry.md) object.

The following table shows the properties that are required when you update the [qualityUpdateCatalogEntry](../resources/windowsupdates-qualityupdatecatalogentry.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/windowsupdates-entity.md)|
|deployableUntilDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|
|displayName|String|**TODO: Add Description** Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|
|releaseDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [catalogEntry](../resources/windowsupdates-catalogentry.md)|
|isExpeditable|Boolean|**TODO: Add Description**|
|qualityUpdateClassification|qualityUpdateClassification|**TODO: Add Description**. Possible values are: `all`, `security`, `nonSecurity`, `unknownFutureValue`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [qualityUpdateCatalogEntry](../resources/windowsupdates-qualityupdatecatalogentry.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_qualityupdatecatalogentry"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/qualityUpdateCatalogEntry
Content-Type: application/json
Content-length: 281

{
  "@odata.type": "#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry",
  "deployableUntilDateTime": "String (timestamp)",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)",
  "isExpeditable": "Boolean",
  "qualityUpdateClassification": "String"
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
  "@odata.type": "#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry",
  "id": "22e3258f-258f-22e3-8f25-e3228f25e322",
  "deployableUntilDateTime": "String (timestamp)",
  "displayName": "String",
  "releaseDateTime": "String (timestamp)",
  "isExpeditable": "Boolean",
  "qualityUpdateClassification": "String"
}
```

