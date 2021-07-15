---
title: "Create onenotePage"
description: "Create a new onenotePage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create onenotePage
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new onenotePage object.

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
POST /users/{usersId}/onenote/pages
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onenotePage](../resources/onenotepage.md) object.

The following table shows the properties that are required when you create the [onenotePage](../resources/onenotepage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|self|String|**TODO: Add Description** Inherited from [onenoteEntityBaseModel](../resources/onenoteentitybasemodel.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntitySchemaObjectModel](../resources/onenoteentityschemaobjectmodel.md)|
|content|Stream|**TODO: Add Description**|
|contentUrl|String|**TODO: Add Description**|
|createdByAppId|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|level|Int32|**TODO: Add Description**|
|links|[pageLinks](../resources/pagelinks.md)|**TODO: Add Description**|
|order|Int32|**TODO: Add Description**|
|title|String|**TODO: Add Description**|
|userTags|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [onenotePage](../resources/onenotepage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_onenotepage_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/onenote/pages
Content-Type: application/json
Content-length: 329

{
  "@odata.type": "#microsoft.graph.onenotePage",
  "self": "String",
  "content": "Stream",
  "contentUrl": "String",
  "createdByAppId": "String",
  "level": "Integer",
  "links": {
    "@odata.type": "microsoft.graph.pageLinks"
  },
  "order": "Integer",
  "title": "String",
  "userTags": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.onenotePage"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.onenotePage",
  "id": "ab050623-0623-ab05-2306-05ab230605ab",
  "self": "String",
  "createdDateTime": "String (timestamp)",
  "content": "Stream",
  "contentUrl": "String",
  "createdByAppId": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "level": "Integer",
  "links": {
    "@odata.type": "microsoft.graph.pageLinks"
  },
  "order": "Integer",
  "title": "String",
  "userTags": [
    "String"
  ]
}
```

