---
title: "Add teamsApp"
description: "Add teamsApp by posting to the teamsApp collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add teamsApp
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add teamsApp by posting to the teamsApp collection.

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
POST /chats/{chatsId}/tabs/{teamsTabId}/teamsApp/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsApp](../resources/teamsapp.md) object.

You can specify the following properties when creating a **teamsApp**.

|Property|Type|Description|
|:---|:---|:---|
|externalId|String|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Optional.|
|distributionMethod|teamsAppDistributionMethod|**TODO: Add Description**. The possible values are: `store`, `organization`, `sideloaded`, `unknownFutureValue`. Optional.|



## Response

If successful, this method returns a `204 No Content` response code and a [teamsApp](../resources/teamsapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamsapp_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/chats/{chatsId}/tabs/{teamsTabId}/teamsApp/$ref
Content-Type: application/json
Content-length: 149

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamsApp",
  "externalId": "String",
  "displayName": "String",
  "distributionMethod": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.teamsApp"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamsApp",
  "id": "d156e095-e095-d156-95e0-56d195e056d1",
  "externalId": "String",
  "displayName": "String",
  "distributionMethod": "String"
}
```

