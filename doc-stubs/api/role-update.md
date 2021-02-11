---
title: "Update role"
description: "Update the properties of a role object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update role
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [role](../resources/role.md) object.

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
PATCH /person/role
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [role](../resources/role.md) object.

The following table shows the properties that are required when you update the [role](../resources/role.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|name|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [role](../resources/role.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_role"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/person/role
Content-Type: application/json
Content-length: 67

{
  "@odata.type": "#microsoft.graph.role",
  "name": "String"
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
  "@odata.type": "#microsoft.graph.role",
  "id": "a68c288f-288f-a68c-8f28-8ca68f288ca6",
  "name": "String"
}
```

