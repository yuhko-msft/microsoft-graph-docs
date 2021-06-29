---
title: "Update bookmark"
description: "Update the properties of a bookmark object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update bookmark
Namespace: microsoft.graph.search

Update the properties of a [bookmark](../resources/bookmark.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)| Global administrator, search administrator, search editor. |
|Delegated (personal Microsoft account)| Not supported. |
|Application| Not supported. |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /bookmarks/{bookmarksId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [bookmark](../resources/bookmark.md) object.

The following table shows the properties that are required when you update the [bookmark](../resources/bookmark.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Guid id of the bookmark. Inherited from [entity](../resources/entity.md).|
|displayName|String|Bookmark name displayed in search results. Inherited from [searchAnswer](../resources/searchanswer.md).|
|description|String|Bookmark description shown on search results page. Inherited from [searchAnswer](../resources/searchanswer.md).|
|webUrl|String|Bookmark url link. When users click this bookmark in search results they will go to this url. Inherited from [searchAnswer](../resources/searchanswer.md).|
|lastModifiedBy|[identitySet](../resources/identityset.md)|Details of the user that created or last modified the bookmark. Inherited from [searchAnswer](../resources/searchanswer.md). Read only.|
|lastModifiedDateTime|DateTimeOffset|Timestamp of when the bookmark is created or edited. Inherited from [searchAnswer](../resources/searchanswer.md). Read only.|
|categories|String collection|Categories commonly used to describe this bookmark. eg. IT, HR, etc.|
|availabilityStartDateTime|DateTimeOffset|Date bookmark will start to appear as a search result. Set as null for always available.|
|availabilityEndDateTime|DateTimeOffset|Date bookmark will stop appearing as a search result. Set as null for always available.|
|languageTags|String collection|List of countries or regions able to view this bookmark.|
|platforms|devicePlatformType collection|List of devices and os able to view this bookmark. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|targetedVariations|[answerVariant](../resources/answervariant.md) collection|Variations of a bookmark for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings will apply to all variations.|
|powerAppIds|String collection|PowerApp ids for this bookmark. By adding existing PowerApps to a Bookmark, users can complete tasks like entering vacation time or reporting expenses on the search results page.|
|keywords|[answerKeyword](../resources/answerkeyword.md)|Keywords that trigger this bookmark to appear in search results.|
|state|answerState|State of the bookmark. Possible values are: `Published`, `Draft`, `Excluded`.|
|isSuggested|Boolean|True if this bookmark was suggested to the admin by a user or was mined and suggested by Microsoft. Read only.|
|groupIds|String collection|List of security groups able to view this bookmark.|



## Response

If successful, this method returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_bookmark"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/bookmarks/{bookmarksId}
Content-Type: application/json

{
  "description": "Book a fancy vacation in Tuscany or browse museums in Florence."
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
HTTP/1.1 204 No Content
```

