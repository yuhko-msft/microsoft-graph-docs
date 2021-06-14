---
title: "Get bookmark"
description: "Read the properties and relationships of a bookmark object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get bookmark
Namespace: microsoft.graph

Read the properties and relationships of a [bookmark](../resources/bookmark.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)| Global Administrator, Global Reader, Search Administrator, Search Editor |
|Delegated (personal Microsoft account)| Not supported. |
|Application| Not supported. |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /bookmarks/{bookmarksId}
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

If successful, this method returns a `200 OK` response code and a [bookmark](../resources/bookmark.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_bookmark"
}
-->
``` http
GET https://graph.microsoft.com/beta/bookmarks/{bookmarksId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.bookmark"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "id": "733b26d5-af76-4eea-ac69-1a0ce8716897",
  "displayName": "Italy Holiday",
  "webUrl": "https://msvacation",
  "description": "Book a fancy vacation in Tuscany or browse museums in Florence.",
  "lastModifiedDateTime": 2016-03-21T20:01:37Z,
  "lastModifiedBy": {
    "user": {
        "id": "efee1b77-fb3b-4f65-99d6-274c11914d12",
        "displayName": "Ryan Gregg"
    }
  },
  "keywords":  {
    "keywords": ["Vancation in Europe", "Holiday in Europe"],
    "reservedKeywords": ["Vancation in Italy"],
    "matchSimilarKeywords": true
  },
  "categories": ["HR"],
  "availabilityStartDateTime": 2020-09-21T20:01:37Z,
  "availabilityEndDateTime": 2020-11-21T20:01:37Z,
  "languageTags": ["en-US"],
  "platforms": ["ios"],
  "groupIds": ["groupId"],
  "targetedVariations": null,
  "powerAppIds": ["powerAppId"],
  "state": "published",
  "isSuggested": false
}
```

