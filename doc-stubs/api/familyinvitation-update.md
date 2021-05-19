---
title: "Update familyInvitation"
description: "Update the properties of a familyInvitation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update familyInvitation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [familyInvitation](../resources/familyinvitation.md) object.

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
PATCH /familyInvitation
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [familyInvitation](../resources/familyinvitation.md) object.

The following table shows the properties that are required when you update the [familyInvitation](../resources/familyinvitation.md).

|Property|Type|Description|
|:---|:---|:---|
|role|familyRole|**TODO: Add Description**. Possible values are: `admin`, `user`, `unknownFutureValue`.|
|invitedDateTime|DateTimeOffset|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|phone|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [familyInvitation](../resources/familyinvitation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_familyinvitation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/familyInvitation
Content-Type: application/json
Content-length: 167

{
  "@odata.type": "#microsoft.graph.familyInvitation",
  "role": "String",
  "invitedDateTime": "String (timestamp)",
  "email": "String",
  "phone": "String"
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
  "@odata.type": "#microsoft.graph.familyInvitation",
  "role": "String",
  "invitedDateTime": "String (timestamp)",
  "email": "String",
  "phone": "String"
}
```

