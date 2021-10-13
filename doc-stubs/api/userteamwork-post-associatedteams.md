---
title: "Create associatedTeamInfo"
description: "Create a new associatedTeamInfo object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create associatedTeamInfo
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new associatedTeamInfo object.

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
POST /users/{usersId}/teamwork/associatedTeams
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [associatedTeamInfo](../resources/associatedteaminfo.md) object.

You can specify the following properties when creating an **associatedTeamInfo**.

|Property|Type|Description|
|:---|:---|:---|
|tenantId|String|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md). Optional.|
|displayName|String|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md). Optional.|



## Response

If successful, this method returns a `201 Created` response code and an [associatedTeamInfo](../resources/associatedteaminfo.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_associatedteaminfo_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/teamwork/associatedTeams
Content-Type: application/json
Content-length: 122

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.associatedTeamInfo",
  "tenantId": "String",
  "displayName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.associatedTeamInfo"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.associatedTeamInfo",
  "id": "b695c5a5-c5a5-b695-a5c5-95b6a5c595b6",
  "tenantId": "String",
  "displayName": "String"
}
```

