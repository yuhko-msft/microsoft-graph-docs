---
title: "Create teamsTab"
description: "Create a new teamsTab object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
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
POST /teams/{teamsId}/channels/{channelId}/tabs
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsTab](../resources/teamstab.md) object.

The following table shows the properties that are required when you create the [teamsTab](../resources/teamstab.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configuration|[teamsTabConfiguration](../resources/teamstabconfiguration.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|messageId|String|**TODO: Add Description**|
|sortOrderIndex|String|**TODO: Add Description**|
|teamsAppId|String|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description**|



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
POST https://graph.microsoft.com/beta/teams/{teamsId}/channels/{channelId}/tabs
Content-Type: application/json
Content-length: 273

{
  "@odata.type": "#microsoft.graph.teamsTab",
  "configuration": {
    "@odata.type": "microsoft.graph.teamsTabConfiguration"
  },
  "displayName": "String",
  "messageId": "String",
  "sortOrderIndex": "String",
  "teamsAppId": "String",
  "webUrl": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.teamsTab"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.teamsTab",
  "id": "59bbe800-e800-59bb-00e8-bb5900e8bb59",
  "configuration": {
    "@odata.type": "microsoft.graph.teamsTabConfiguration"
  },
  "displayName": "String",
  "messageId": "String",
  "sortOrderIndex": "String",
  "teamsAppId": "String",
  "webUrl": "String"
}
```

