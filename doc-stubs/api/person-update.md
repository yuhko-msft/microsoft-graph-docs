---
title: "Update person"
description: "Update the properties of a person object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update person
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [person](../resources/person.md) object.

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
PATCH /person
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [person](../resources/person.md) object.

The following table shows the properties that are required when you update the [person](../resources/person.md).

|Property|Type|Description|
|:---|:---|:---|
|id|Int32|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|phone|String|**TODO: Add Description**|
|emailaddress|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [person](../resources/person.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_person"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/person
Content-Type: application/json
Content-length: 120

{
  "@odata.type": "#microsoft.graph.person",
  "name": "String",
  "phone": "String",
  "emailaddress": "String"
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
  "@odata.type": "#microsoft.graph.person",
  "id": "dbfa2a69-2a69-dbfa-692a-fadb692afadb",
  "name": "String",
  "phone": "String",
  "emailaddress": "String"
}
```

