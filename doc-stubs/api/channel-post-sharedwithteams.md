---
title: "Create sharedWithChannelTeamInfo"
description: "Create a new sharedWithChannelTeamInfo object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sharedWithChannelTeamInfo
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md) object.

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
POST /teams/{teamsId}/channels/{channelId}/sharedWithTeams
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md) object.

You can specify the following properties when creating a **sharedWithChannelTeamInfo**.

|Property|Type|Description|
|:---|:---|:---|
|tenantId|String|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md). Optional.|
|displayName|String|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md). Optional.|
|isHostTeam|Boolean|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sharedwithchannelteaminfo_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/teams/{teamsId}/channels/{channelId}/sharedWithTeams
Content-Type: application/json
Content-length: 157

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.sharedWithChannelTeamInfo",
  "tenantId": "String",
  "displayName": "String",
  "isHostTeam": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.sharedWithChannelTeamInfo"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.sharedWithChannelTeamInfo",
  "id": "2173de69-de69-2173-69de-732169de7321",
  "tenantId": "String",
  "displayName": "String",
  "isHostTeam": "Boolean"
}
```

