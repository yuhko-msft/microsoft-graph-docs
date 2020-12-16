---
title: "Create conversationMember"
description: "Create a new conversationMember object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create conversationMember
Namespace: microsoft.graph

Create a new [conversationMember](../resources/conversationmember.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST /chats/{chatsId}/members
POST /teams/{teamsId}/members
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [conversationMember](../resources/conversationmember.md) object.

The following table shows the properties that are required when you create the [conversationMember](../resources/conversationmember.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|roles|String collection|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|visibleHistoryStartDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [conversationMember](../resources/conversationmember.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_conversationmember_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/chats/{chatsId}/members
Content-Type: application/json
Content-length: 178

{
  "@odata.type": "#microsoft.graph.conversationMember",
  "roles": [
    "String"
  ],
  "displayName": "String",
  "visibleHistoryStartDateTime": "String (timestamp)"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.conversationMember"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.conversationMember",
  "id": "a84d7737-7737-a84d-3777-4da837774da8",
  "roles": [
    "String"
  ],
  "displayName": "String",
  "visibleHistoryStartDateTime": "String (timestamp)"
}
```

