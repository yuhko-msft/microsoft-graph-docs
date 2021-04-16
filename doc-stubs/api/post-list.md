---
title: "List posts"
description: "Get a list of the post objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List posts
Namespace: microsoft.graph



Get a list of the [post](../resources/post.md) objects and their properties.

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
GET /groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts
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

If successful, this method returns a `200 OK` response code and a collection of [post](../resources/post.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_post"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.post)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

