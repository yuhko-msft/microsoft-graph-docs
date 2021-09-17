---
title: "Create chatMessageInfo"
description: "Create a new chatMessageInfo object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create chatMessageInfo
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [chatMessageInfo](../resources/chatmessageinfo.md) object.

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
POST ** Collection URI for Microsoft.Teams.GraphSvc.chatMessageInfo not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [chatMessageInfo](../resources/chatmessageinfo.md) object.

You can specify the following properties when creating a **chatMessageInfo**.

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Required.|
|body|[Microsoft.Teams.GraphSvc.itemBody](../resources/itembody.md)|**TODO: Add Description** Optional.|
|from|[Microsoft.Teams.GraphSvc.chatMessageFromIdentitySet](../resources/chatmessagefromidentityset.md)|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|isDeleted|Boolean|**TODO: Add Description** Optional.|
|messageType|chatMessageType|**TODO: Add Description**. The possible values are: `message`, `chatEvent`, `typing`, `unknownFutureValue`, `systemEventMessage`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `systemEventMessage`. Required.|
|eventDetail|[Microsoft.Teams.GraphSvc.eventMessageDetail](../resources/eventmessagedetail.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [chatMessageInfo](../resources/chatmessageinfo.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_chatmessageinfo_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for Microsoft.Teams.GraphSvc.chatMessageInfo not found
Content-Type: application/json
Content-length: 354

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.chatMessageInfo",
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
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.chatMessageInfo"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.chatMessageInfo",
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

