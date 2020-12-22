---
title: "qna resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# qna resource type

Namespace: microsoft.graph

Q&A are administrative answer results similar to bookmarks. Q&As allow Admins to answer the user's questions instead of just providing a link to a webpage. A Q&A has many properties which allow Admins to make common resources more accessible in their organization. This is based on microsoft.graph.search.searchAnswer\
\
\
The main properties of a Q&A include: title, description, URL, Keywords, and Reserved Keywords.\
The advanced properties of a Q&A determine when and where the result should be published: Dates, Country or Region, Groups, Device, OS, targeted variations, and PowerApps.


Inherits from [searchAnswer](../resources/searchanswer.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List qnas](../api/qna-list.md)|[qna](../resources/qna.md) collection|Get a list of the [qna](../resources/qna.md) objects and their properties.|
|[Create qna](../api/qna-create.md)|[qna](../resources/qna.md)|Create a new [qna](../resources/qna.md) object.|
|[Get qna](../api/qna-get.md)|[qna](../resources/qna.md)|Read the properties and relationships of a [qna](../resources/qna.md) object.|
|[Update qna](../api/qna-update.md)|[qna](../resources/qna.md)|Update the properties of a [qna](../resources/qna.md) object.|
|[Delete qna](../api/qna-delete.md)|None|Deletes a [qna](../resources/qna.md) object.|

## Properties
|id|String|Guid id of the Qna Inherited from [entity](../resources/entity.md)|
|displayName|String|Qna Display Name Inherited from [searchAnswer](../resources/searchanswer.md)|
|description|String|Qna Description Inherited from [searchAnswer](../resources/searchanswer.md)|
|webUrl|String|Qna URL Inherited from [searchAnswer](../resources/searchanswer.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|Read only. Details of the user that created or last modified the Qna Inherited from [searchAnswer](../resources/searchanswer.md)|
|lastModifiedDateTime|DateTimeOffset|Read only. Timestamp of when the Qna is created or edited Inherited from [searchAnswer](../resources/searchanswer.md)|
|availabilityStartDateTime|DateTimeOffset|Qna start date to appear as a search result (Set as null for always available)|
|availabilityEndDateTime|DateTimeOffset|Qna end date to stop appearing as a search result (Set as null for always available)|
|languageTags|String collection|List of countries or regions able to view this Qna|
|platforms|devicePlatformType collection|List of devices and OS able to view this Qna. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|targetedVariations|[answerVariant](../resources/answerVariant.md) collection|List of Qna targeted variations. Use when you need to show different content to users based on their device, or country and region, or both (Targeted Variations). The Dates and Groups settings will apply to all variations.|
|keywords|[answerKeyword](../resources/answerkeyword.md)|Keywords for this Qna. Properties include: keywords, reservedKeywords, and matchSimilarKeywords.|
|state|answerState|State of the Qna. Possible values are: `Published`, `Draft`, `Excluded`.|
|isSuggested|Boolean|Read only. True if this Qna was suggested to the admin by a user or was mined and suggested by Microsoft.|
|groupIds|String collection|List of security group IDs able to view this Qna|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.qna",
  "baseType": "microsoft.graph.searchAnswer",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.qna",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "webUrl": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
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

