---
title: "Create teamsTab"
description: "Create a new teamsTab object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamsTab
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new teamsTab object.

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
POST /chats/{chatsId}/tabs
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsTab](../resources/teamstab.md) object.

You can specify the following properties when creating a **teamsTab**.

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Required.|
|displayName|String|**TODO: Add Description** Optional.|
|teamsAppId|String|**TODO: Add Description** Optional.|
|sortOrderIndex|String|**TODO: Add Description** Optional.|
|messageId|String|**TODO: Add Description** Optional.|
|webUrl|String|**TODO: Add Description** Optional.|
|configuration|[Microsoft.Teams.GraphSvc.teamsTabConfiguration](../resources/teamstabconfiguration.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [teamsTab](../resources/teamstab.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamstab_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/chats/{chatsId}/tabs
Content-Type: application/json
Content-length: 282

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamsTab",
  "displayName": "String",
  "teamsAppId": "String",
  "sortOrderIndex": "String",
  "messageId": "String",
  "webUrl": "String",
  "configuration": {
    "@odata.type": "microsoft.graph.teamsTabConfiguration"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.teamsTab"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamsTab",
  "id": "11c88ee3-8ee3-11c8-e38e-c811e38ec811",
  "displayName": "String",
  "teamsAppId": "String",
  "sortOrderIndex": "String",
  "messageId": "String",
  "webUrl": "String",
  "configuration": {
    "@odata.type": "microsoft.graph.teamsTabConfiguration"
  }
}
```

