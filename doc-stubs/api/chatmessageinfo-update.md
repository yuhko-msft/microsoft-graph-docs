---
title: "Update chatMessageInfo"
description: "Update the properties of a chatMessageInfo object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update chatMessageInfo
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [chatMessageInfo](../resources/chatmessageinfo.md) object.

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
PATCH /chats/{chatsId}/lastMessagePreview
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]
In the request body, supply a JSON representation of the [chatMessageInfo](../resources/chatmessageinfo.md) object.


|Property|Type|Description|
|:---|:---|:---|
|body|[Microsoft.Teams.GraphSvc.itemBody](../resources/itembody.md)|**TODO: Add Description** Optional.|
|from|[Microsoft.Teams.GraphSvc.chatMessageFromIdentitySet](../resources/chatmessagefromidentityset.md)|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|isDeleted|Boolean|**TODO: Add Description** Optional.|
|messageType|chatMessageType|**TODO: Add Description**. The possible values are: `message`, `chatEvent`, `typing`, `unknownFutureValue`, `systemEventMessage`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `systemEventMessage`. Required.|
|eventDetail|[Microsoft.Teams.GraphSvc.eventMessageDetail](../resources/eventmessagedetail.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [chatMessageInfo](../resources/chatmessageinfo.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_chatmessageinfo"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/chats/{chatsId}/lastMessagePreview
Content-Type: application/json
Content-length: 345

{
  "@odata.type": "#microsoft.graph.chatMessageInfo",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "from": {
    "@odata.type": "microsoft.graph.chatMessageFromIdentitySet"
  },
  "isDeleted": "Boolean",
  "messageType": "String",
  "eventDetail": {
    "@odata.type": "microsoft.graph.eventMessageDetail"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.chatMessageInfo",
  "id": "9802bb02-bb02-9802-02bb-029802bb0298",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "from": {
    "@odata.type": "microsoft.graph.chatMessageFromIdentitySet"
  },
  "createdDateTime": "String (timestamp)",
  "isDeleted": "Boolean",
  "messageType": "String",
  "eventDetail": {
    "@odata.type": "microsoft.graph.eventMessageDetail"
  }
}
```

