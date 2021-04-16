---
title: "Create post"
description: "Create a new post object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create post
Namespace: microsoft.graph



Create a new [post](../resources/post.md) object.

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
POST /groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [post](../resources/post.md) object.

The following table shows the properties that are required when you create the [post](../resources/post.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|conversationId|String|**TODO: Add Description**|
|conversationThreadId|String|**TODO: Add Description**|
|from|[recipient](../resources/recipient.md)|**TODO: Add Description**|
|hasAttachments|Boolean|**TODO: Add Description**|
|importance|importance|**TODO: Add Description**. Possible values are: `low`, `normal`, `high`.|
|newParticipants|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|receivedDateTime|DateTimeOffset|**TODO: Add Description**|
|sender|[recipient](../resources/recipient.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [post](../resources/post.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_post_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts
Content-Type: application/json
Content-length: 579

{
  "@odata.type": "#microsoft.graph.post",
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "conversationId": "String",
  "conversationThreadId": "String",
  "from": {
    "@odata.type": "microsoft.graph.recipient"
  },
  "hasAttachments": "Boolean",
  "importance": "String",
  "newParticipants": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "receivedDateTime": "String (timestamp)",
  "sender": {
    "@odata.type": "microsoft.graph.recipient"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.post"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.post",
  "id": "bd078120-8120-bd07-2081-07bd208107bd",
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "conversationId": "String",
  "conversationThreadId": "String",
  "from": {
    "@odata.type": "microsoft.graph.recipient"
  },
  "hasAttachments": "Boolean",
  "importance": "String",
  "newParticipants": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "receivedDateTime": "String (timestamp)",
  "sender": {
    "@odata.type": "microsoft.graph.recipient"
  }
}
```

