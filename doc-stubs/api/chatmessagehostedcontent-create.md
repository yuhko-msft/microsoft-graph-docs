---
title: "Create chatMessageHostedContent"
description: "Create a new chatMessageHostedContent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create chatMessageHostedContent
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [chatMessageHostedContent](../resources/chatmessagehostedcontent.md) object.

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
POST /chats/{chatsId}/messages/{chatMessageId}/hostedContents
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [chatMessageHostedContent](../resources/chatmessagehostedcontent.md) object.

You can specify the following properties when creating a **chatMessageHostedContent**.

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [teamworkHostedContent](../resources/teamworkhostedcontent.md). Required.|
|contentBytes|Binary|**TODO: Add Description** Inherited from [teamworkHostedContent](../resources/teamworkhostedcontent.md). Optional.|
|contentType|String|**TODO: Add Description** Inherited from [teamworkHostedContent](../resources/teamworkhostedcontent.md). Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [chatMessageHostedContent](../resources/chatmessagehostedcontent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_chatmessagehostedcontent_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/chats/{chatsId}/messages/{chatMessageId}/hostedContents
Content-Type: application/json
Content-length: 132

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.chatMessageHostedContent",
  "contentBytes": "Binary",
  "contentType": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.chatMessageHostedContent"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.chatMessageHostedContent",
  "id": "87e5c1fe-c1fe-87e5-fec1-e587fec1e587",
  "contentBytes": "Binary",
  "contentType": "String"
}
```

