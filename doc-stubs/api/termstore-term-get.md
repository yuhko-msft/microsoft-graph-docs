---
title: "Get term"
description: "Read the properties and relationships of a term object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get term
Namespace: microsoft.graph.termStore

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [term](../resources/termstore-term.md) object.

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
GET /sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/terms/{termId}
GET /sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/children/{termId}
GET /sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/children/{termId}/children/{termId}
GET /sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/children/{termId}/relations/{relationId}/toTerm
GET /sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/children/{termId}/relations/{relationId}/fromTerm
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [term](../resources/termstore-term.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_term"
}
-->
``` http
GET https://graph.microsoft.com/beta/sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/terms/{termId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.termStore.term"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.termStore.term",
    "id": "29ecf2b8-f2b8-29ec-b8f2-ec29b8f2ec29",
    "createdDateTime": "String (timestamp)",
    "descriptions": [
      {
        "@odata.type": "microsoft.graph.termStore.localizedDescription"
      }
    ],
    "labels": [
      {
        "@odata.type": "microsoft.graph.termStore.localizedLabel"
      }
    ],
    "lastModifiedDateTime": "String (timestamp)",
    "properties": [
      {
        "@odata.type": "microsoft.graph.keyValue"
      }
    ]
  }
}
```

