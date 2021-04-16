---
title: "conversationMember: add"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# conversationMember: add
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /chats/{chatsId}/members/add
POST /teams/{teamsId}/members/add
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|values|[conversationMember](../resources/conversationmember.md) collection|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [actionResultPart](../resources/actionresultpart.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "conversationmember_add"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/chats/{chatsId}/members/add

Content-Type: application/json
Content-length: 272

{
  "values": [
    {
      "@odata.type": "#microsoft.graph.conversationMember",
      "id": "String (identifier)",
      "displayName": "String",
      "roles": [
        "String"
      ],
      "visibleHistoryStartDateTime": "String (timestamp)"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.actionResultPart)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "microsoft.graph.aadUserConversationMemberResult"
    }
  ]
}
```

