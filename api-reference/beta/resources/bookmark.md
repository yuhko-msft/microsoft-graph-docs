---
title: "bookmark resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bookmark resource type

Namespace: microsoft.graph

A bookmark is a tenant wide administrative answer to common queries in a tenant. A bookmark has many properties which allow Admins to make common resources more accessible in their organization.
\
The main properties of a bookmark include: title, description, URL, Keywords, and Reserved Keywords.\
The advanced properties of a bookmark determine when and where the result should be published: Dates, Country or Region, Groups, Device, OS, targeted variations, and PowerApps.


Inherits from [searchAnswer](../resources/searchanswer.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List bookmarks](../api/bookmark-list.md)|[bookmark](../resources/bookmark.md) collection|Get a list of the [bookmark](../resources/bookmark.md) objects and their properties.|
|[Create bookmark](../api/bookmark-post-bookmarks.md)|[bookmark](../resources/bookmark.md)|Create a new [bookmark](../resources/bookmark.md) object.|
|[Get bookmark](../api/bookmark-get.md)|[bookmark](../resources/bookmark.md)|Read the properties and relationships of a [bookmark](../resources/bookmark.md) object.|
|[Update bookmark](../api/bookmark-update.md)|[bookmark](../resources/bookmark.md)|Update the properties of a [bookmark](../resources/bookmark.md) object.|
|[Delete bookmark](../api/bookmark-delete.md)|None|Deletes a [bookmark](../resources/bookmark.md) object.|

## Properties
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
|targetedVariations|[answerVariant](../resources/answerVariant.md) collection|List of bookmark targeted variations. Use when you need to show different content to users based on their device, or country and region, or both (Targeted Variations). The Dates and Groups settings will apply to all variations.|
|powerAppIds|String collection|PowerApp ids for this bookmark|
|keywords|[answerKeyword](../resources/answerkeyword.md)|Keywords for this bookmark. Properties include: keywords, reservedKeywords, and matchSimilarKeywords.|
|state|answerState|State of the bookmark. Possible values are: `Published`, `Draft`, `Excluded`.|
|isSuggested|Boolean|Read only. True if this bookmark was suggested to the admin by a user or was mined and suggested by Microsoft.|
|groupIds|String collection|List of security group IDs able to view this bookmark|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.bookmark",
  "baseType": "microsoft.graph.searchAnswer",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bookmark",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "webUrl": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "categories": [
    "String"
  ],
  "availabilityStartDateTime": "String (timestamp)",
  "availabilityEndDateTime": "String (timestamp)",
  "languageTags": [
    "String"
  ],
  "platforms": [
    "String"
  ],
  "targetedVariations": [
    {
      "@odata.type": "microsoft.graph.answerVariant"
    }
  ],
  "powerAppIds": [
    "String"
  ],
  "keywords": {
    "@odata.type": "microsoft.graph.answerKeyword"
  },
  "state": "String",
  "isSuggested": "Boolean",
  "groupIds": [
    "String"
  ]
}
```

