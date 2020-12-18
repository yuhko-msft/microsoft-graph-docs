---
title: "Create bookmark"
description: "Create a new bookmark object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create bookmark
Namespace: microsoft.graph

Create a new [bookmark](../resources/bookmark.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)| Global Administrator, Search Administrator, Search Editor |
|Delegated (personal Microsoft account)| Not supported. |
|Application| Not supported. |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /bookmarks
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [bookmark](../resources/bookmark.md) object.

The following table shows the properties that are required when you create the [bookmark](../resources/bookmark.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Guid id of the Bookmark Inherited from [entity](../resources/entity.md)|
|displayName|String|Bookmark Display Name Inherited from [searchAnswer](../resources/searchanswer.md)|
|description|String|Bookmark Description Inherited from [searchAnswer](../resources/searchanswer.md)|
|webUrl|String|Bookmark URL Inherited from [searchAnswer](../resources/searchanswer.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|Read only. Details of the user that created or last modified the bookmark Inherited from [searchAnswer](../resources/searchanswer.md)|
|lastModifiedDateTime|DateTimeOffset|Read only. Timestamp of when the bookmark is created or edited Inherited from [searchAnswer](../resources/searchanswer.md)|
|categories|String collection|Categories commonly used to describe this bookmark. eg. IT, HR, etc.|
|availabilityStartDateTime|DateTimeOffset|Bookmark start date to appear as a search result (Set as null for always available)|
|availabilityEndDateTime|DateTimeOffset|Bookmark end date to stop appearing as a search result (Set as null for always available)|
|languageTags|String collection|List of countries or regions able to view this bookmark|
|platforms|devicePlatformType collection|List of devices and OS able to view this bookmark. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|targetedVariations|[searchAdminVariant](../resources/searchadminvariant.md) collection|List of bookmark targeted variations. Use when you need to show different content to users based on their device, or country and region, or both (Targeted Variations). The Dates and Groups settings will apply to all variations.|
|powerAppIds|String collection|PowerApp ids for this bookmark|
|keywords|[answerKeyword](../resources/answerkeyword.md)|Keywords for this bookmark. Properties include: keywords, reservedKeywords, and matchSimilarKeywords.|
|state|answerState|State of the bookmark. Possible values are: `Published`, `Draft`, `Excluded`.|
|isSuggested|Boolean|Read only. True if this bookmark was suggested to the admin by a user or was mined and suggested by Microsoft.|
|groupIds|String collection|List of security group IDs able to view this bookmark|



## Response

If successful, this method returns a `201 Created` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_bookmark_from_bookmarks"
}
-->
``` http
POST https://graph.microsoft.com/beta/search/bookmarks

Authorization: Bearer AAD_PFT_TOKEN
Content-Type: application/json

{
  "displayName": "Office Install Site",
  "webUrl": "https://getOffice",
  "description": "Try or buy Office for Home or Business and view product information",
  "keywords":  {
    "keywords": ["Vancation in Europe", "Holiday in Europe"],
    "reservedKeywords": ["Vancation in Italy"],
    "matchSimilarKeywords": true
  },
  "availabilityStartDateTime": null,
  "availabilityEndDateTime": null,
  "platforms": ["windows"],
  "targetedVariations": [
    {
      "languageTag": "es-ES",
      "displayName": "Sitio de instalación Office",
      "description": "Pruebe o compre Office hogar o negocios y vea la información del producto"
    }
  ],
  "groupIds": ["groupId"],
  "powerAppIds": ["powerAppId"],
  "state": "published",
  "isSuggested": false
}
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
HTTP/1.1 201 CREATED
Location: /733b26d5-af76-4eea-ac69-1a0ce8716897
Content-Type: application/json
{
  "id": "733b26d5-af76-4eea-ac69-1a0ce8716897"
}
```

