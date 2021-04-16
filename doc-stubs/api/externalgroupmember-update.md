---
title: "Update externalGroupMember"
description: "Update the properties of an externalGroupMember object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update externalGroupMember
Namespace: microsoft.graph



Update the properties of an [externalGroupMember](../resources/externalgroupmember.md) object.

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
PATCH /external/connections/{externalConnectionId}/groups/{externalGroupId}/members/{externalGroupMemberId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [externalGroupMember](../resources/externalgroupmember.md) object.

The following table shows the properties that are required when you update the [externalGroupMember](../resources/externalgroupmember.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|identitySource|identitySourceType|**TODO: Add Description**. Possible values are: `azureActiveDirectory`, `external`.|
|type|externalGroupMemberType|**TODO: Add Description**. Possible values are: `user`, `group`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [externalGroupMember](../resources/externalgroupmember.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_externalgroupmember"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/external/connections/{externalConnectionId}/groups/{externalGroupId}/members/{externalGroupMemberId}
Content-Type: application/json
Content-length: 113

{
  "@odata.type": "#microsoft.graph.externalGroupMember",
  "identitySource": "String",
  "type": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.externalGroupMember",
  "id": "d5d7454d-454d-d5d7-4d45-d7d54d45d7d5",
  "identitySource": "String",
  "type": "String"
}
```

