---
title: "Get teamsTab"
description: "Read the properties and relationships of a teamsTab object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get teamsTab
Namespace: microsoft.graph

Read the properties and relationships of a [teamsTab](../resources/teamstab.md) object.

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
GET /chats/{chatsId}/tabs/{teamsTabId}
GET /teams/{teamsId}/channels/{channelId}/tabs/{teamsTabId}
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

If successful, this method returns a `200 OK` response code and a [teamsTab](../resources/teamstab.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_teamstab"
}
-->
``` http
GET https://graph.microsoft.com/beta/chats/{chatsId}/tabs/{teamsTabId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.teamsTab"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#Microsoft.Teams.GraphSvc.teamsTab",
    "id": "1d8c3597-3597-1d8c-9735-8c1d97358c1d",
    "name": "String",
    "displayName": "String",
    "teamsAppId": "String",
    "sortOrderIndex": "String",
    "messageId": "String",
    "webUrl": "String",
    "configuration": {
      "@odata.type": "microsoft.graph.teamsTabConfiguration"
    }
  }
}
```

