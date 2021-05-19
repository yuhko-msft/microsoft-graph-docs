---
title: "Update familyMember"
description: "Update the properties of a familyMember object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update familyMember
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [familyMember](../resources/familymember.md) object.

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
PATCH /familyMember
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [familyMember](../resources/familymember.md) object.

The following table shows the properties that are required when you update the [familyMember](../resources/familymember.md).

|Property|Type|Description|
|:---|:---|:---|
|netId|String|**TODO: Add Description**|
|role|familyRole|**TODO: Add Description**. Possible values are: `admin`, `user`, `unknownFutureValue`.|
|joinedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [familyMember](../resources/familymember.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_familymember"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/familyMember
Content-Type: application/json
Content-length: 140

{
  "@odata.type": "#microsoft.graph.familyMember",
  "netId": "String",
  "role": "String",
  "joinedDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.familyMember",
  "netId": "String",
  "role": "String",
  "joinedDateTime": "String (timestamp)"
}
```

