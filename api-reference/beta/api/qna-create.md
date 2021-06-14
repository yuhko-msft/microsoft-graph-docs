---
title: "Create qna"
description: "Create a new qna object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create qna
Namespace: microsoft.graph

Create a new [qna](../resources/qna.md) object.

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
POST /qnas
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [qna](../resources/qna.md) object.

The following table shows the properties that are required when you create the [qna](../resources/qna.md).

|Property|Type|Description|
|:---|:---|:---|
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



## Response

If successful, this method returns a `201 Created` response code with the id of the Question and Answer created.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_qna_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/search/qnas
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.qna",
  "displayName": "String",
  "description": "String",
  "webUrl": "String",
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
      "@odata.type": "microsoft.graph.searchAdminVariant"
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
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

