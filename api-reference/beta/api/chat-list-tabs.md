---
title: "List tabs in chat"
description: "Retrieve the list of tabs in the specified chat. "
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---
 
# List tabs in chat
 
Namespace: microsoft.graph
 
[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]
 
Retrieve the list of [tabs](../resources/teamstab.md) in the specified [chat](../resources/chat.md) .

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged) | 
|:--------------------|:---------------------------------|
|Delegated (work or school account) | TeamsTab.Read.All, TeamsTab.ReadWrite.All  |
|Delegated (personal Microsoft account) | Not supported |
|Application | TeamsTab.Read.All, TeamsTab.ReadWrite.All  |
 
## HTTP request
<!-- { "blockType": "ignored" } -->

```http
GET /chats/{id}/tabs
```
 
## Optional query parameters
 
This method supports the `$filter`, `$select`, and `$expand` [OData query parameters](/graph/query-parameters) to help customize the response.
 
## Request headers
| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |
 
## Response
If successful, this method returns a `200 OK` response code and collection of [tabs](../resources/teamstab.md) objects in the response body.
 
## Example

### Request

<!-- {
  "blockType": "request",
  "name": "list_tabs_in_chat"
}-->

```http
GET /chats/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tabs
```

### Response

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.team"
  } -->

```http
HTTP/1.1 200 OK
Content-type: application/json

{
  "@odata.context": "https://localhost:8200/beta/$metadata#chats/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tabs",
  "@odata.count": 1,
  "value": [
  {
    "id": "794f0e4e-4d10-4bb5-9079-3a465a629eff",
    "displayName": "Scrum Board",
    "webUrl": "https://teams.microsoft.com/l/chat/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tab%3a%3a794f0e4e-4d10-4bb5-9079-3a465a629eff?label=scrum%20tab",
    "configuration": {
      "entityId": "2DCA2E6C7A10415CAF6B8AB6661B3154",
      "contentUrl": "https://www.contoso.com/scrumsboards/",
      "websiteUrl": "https://www.contoso.com/scrumsboards/2DCA2E6C7A10415CAF6B8AB6661B3154",
      "removeUrl": "https://www.contoso.com/scrumsboards.2DCA2E6C7A10415CAF6B8AB6661B3154/uninstallTab"
    }
   }
  ]
}
```

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "List-tabs in chat",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": []
}
-->
