---
title: "Add set"
description: "Add set by posting to the set collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add set
Namespace: microsoft.graph.termStore



Add set by posting to the set collection.

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
POST /sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/children/{termId}/relations/{relationId}/set/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [set](../resources/termstore-set.md) object.

The following table shows the properties that are required when you create the [set](../resources/termstore-set.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/termstore-entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|localizedNames|[localizedName](../resources/termstore-localizedname.md) collection|**TODO: Add Description**|
|properties|[keyValue](../resources/termstore-keyvalue.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and a [set](../resources/termstore-set.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_set_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/children/{termId}/relations/{relationId}/set/$ref
Content-Type: application/json
Content-length: 278

{
  "@odata.type": "#microsoft.graph.termStore.set",
  "description": "String",
  "localizedNames": [
    {
      "@odata.type": "microsoft.graph.termStore.localizedName"
    }
  ],
  "properties": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.termStore.set"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.termStore.set",
  "id": "0a4f383b-383b-0a4f-3b38-4f0a3b384f0a",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "localizedNames": [
    {
      "@odata.type": "microsoft.graph.termStore.localizedName"
    }
  ],
  "properties": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ]
}
```

