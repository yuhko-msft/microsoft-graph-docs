---
title: "Create teamworkTag"
description: "Create a new teamworkTag object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamworkTag
Namespace: microsoft.graph

Create a new teamworkTag object.

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
POST /teams/{teamsId}/tags
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamworkTag](../resources/teamworktag.md) object.

The following table shows the properties that are required when you create the [teamworkTag](../resources/teamworktag.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|teamId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|memberCount|Int32|**TODO: Add Description**|
|tagType|teamworkTagType|**TODO: Add Description**. Possible values are: `standard`.|



## Response

If successful, this method returns a `201 Created` response code and a [teamworkTag](../resources/teamworktag.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamworktag_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/teams/{teamsId}/tags
Content-Type: application/json
Content-length: 194

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamworkTag",
  "teamId": "String",
  "displayName": "String",
  "description": "String",
  "memberCount": "Integer",
  "tagType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.teamworkTag"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamworkTag",
  "id": "f47b7f55-7f55-f47b-557f-7bf4557f7bf4",
  "teamId": "String",
  "displayName": "String",
  "description": "String",
  "memberCount": "Integer",
  "tagType": "String"
}
```

