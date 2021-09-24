---
title: "Create channel"
description: "Create a new channel object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create channel
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [channel](../resources/channel.md) object.

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
POST /teams/{teamsId}/channels
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [channel](../resources/channel.md) object.

You can specify the following properties when creating a **channel**.

|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Required.|
|description|String|**TODO: Add Description** Optional.|
|isFavoriteByDefault|Boolean|**TODO: Add Description** Optional.|
|email|String|**TODO: Add Description** Optional.|
|webUrl|String|**TODO: Add Description** Optional.|
|filesFolderWebUrl|String|**TODO: Add Description** Optional.|
|membershipType|channelMembershipType|**TODO: Add Description**. The possible values are: `standard`, `private`, `unknownFutureValue`, `shared`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `shared`. Optional.|
|moderationSettings|[Microsoft.Teams.GraphSvc.channelModerationSettings](../resources/channelmoderationsettings.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [channel](../resources/channel.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_channel_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/teams/{teamsId}/channels
Content-Type: application/json
Content-length: 358

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.channel",
  "displayName": "String",
  "description": "String",
  "isFavoriteByDefault": "Boolean",
  "email": "String",
  "webUrl": "String",
  "filesFolderWebUrl": "String",
  "membershipType": "String",
  "moderationSettings": {
    "@odata.type": "microsoft.graph.channelModerationSettings"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.channel"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.channel",
  "id": "0660e8bf-e8bf-0660-bfe8-6006bfe86006",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "description": "String",
  "isFavoriteByDefault": "Boolean",
  "email": "String",
  "webUrl": "String",
  "filesFolderWebUrl": "String",
  "membershipType": "String",
  "moderationSettings": {
    "@odata.type": "microsoft.graph.channelModerationSettings"
  }
}
```

