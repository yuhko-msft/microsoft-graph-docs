---
title: "Get post"
description: "Read the properties and relationships of a post object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get post
Namespace: microsoft.graph



Read the properties and relationships of a [post](../resources/post.md) object.

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
GET /groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts/{postId}
GET /groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts/{postId}/inReplyTo
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

If successful, this method returns a `200 OK` response code and a [post](../resources/post.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_post"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts/{postId}
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

