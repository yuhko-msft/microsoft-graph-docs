---
title: "Update teamworkTagMember"
description: "Update the properties of a teamworkTagMember object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update teamworkTagMember
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [teamworkTagMember](../resources/teamworktagmember.md) object.

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
PATCH /teams/{teamsId}/tags/{teamworkTagId}/members/{teamworkTagMemberId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamworkTagMember](../resources/teamworktagmember.md) object.

The following table shows the properties that are required when you update the [teamworkTagMember](../resources/teamworktagmember.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [teamworkTagMember](../resources/teamworktagmember.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_teamworktagmember"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/teams/{teamsId}/tags/{teamworkTagId}/members/{teamworkTagMemberId}
Content-Type: application/json
Content-length: 135

{
  "@odata.type": "#microsoft.graph.teamworkTagMember",
  "displayName": "String",
  "tenantId": "String",
  "userId": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.teamworkTagMember",
  "id": "f6dd6dea-6dea-f6dd-ea6d-ddf6ea6dddf6",
  "displayName": "String",
  "tenantId": "String",
  "userId": "String"
}
```

