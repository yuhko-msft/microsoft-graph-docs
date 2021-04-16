---
title: "Update store"
description: "Update the properties of a store object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update store
Namespace: microsoft.graph.termStore



Update the properties of a [store](../resources/termstore-store.md) object.

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
PATCH /termStore
PATCH /sites/{sitesId}/termStore
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [store](../resources/termstore-store.md) object.

The following table shows the properties that are required when you update the [store](../resources/termstore-store.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/termstore-entity.md)|
|defaultLanguageTag|String|**TODO: Add Description**|
|languageTags|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [store](../resources/termstore-store.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_store"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/termStore
Content-Type: application/json
Content-length: 133

{
  "@odata.type": "#microsoft.graph.termStore.store",
  "defaultLanguageTag": "String",
  "languageTags": [
    "String"
  ]
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
  "@odata.type": "#microsoft.graph.termStore.store",
  "id": "3695ce13-ce13-3695-13ce-953613ce9536",
  "defaultLanguageTag": "String",
  "languageTags": [
    "String"
  ]
}
```

