---
title: "Update plannerRosterMember"
description: "Update the properties of a plannerRosterMember object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update plannerRosterMember
Namespace: microsoft.graph



Update the properties of a [plannerRosterMember](../resources/plannerrostermember.md) object.

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
PATCH /planner/rosters/{plannerRosterId}/members/{plannerRosterMemberId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [plannerRosterMember](../resources/plannerrostermember.md) object.

The following table shows the properties that are required when you update the [plannerRosterMember](../resources/plannerrostermember.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|roles|String collection|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [plannerRosterMember](../resources/plannerrostermember.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_plannerrostermember"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/planner/rosters/{plannerRosterId}/members/{plannerRosterMemberId}
Content-Type: application/json
Content-length: 143

{
  "@odata.type": "#microsoft.graph.plannerRosterMember",
  "roles": [
    "String"
  ],
  "tenantId": "String",
  "userId": "String"
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
  "@odata.type": "#microsoft.graph.plannerRosterMember",
  "id": "87d69af8-9af8-87d6-f89a-d687f89ad687",
  "roles": [
    "String"
  ],
  "tenantId": "String",
  "userId": "String"
}
```

