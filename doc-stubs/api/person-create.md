---
title: "Create person"
description: "Create a new person object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create person
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [person](../resources/person.md) object.

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
POST ** Collection URI for microsoft.graph.person not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [person](../resources/person.md) object.

The following table shows the properties that are required when you create the [person](../resources/person.md).

|Property|Type|Description|
|:---|:---|:---|
|id|Int32|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|phone|String|**TODO: Add Description**|
|emailaddress|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [person](../resources/person.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_person_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.person not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.person"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.person",
  "id": "dbfa2a69-2a69-dbfa-692a-fadb692afadb",
  "name": "String",
  "phone": "String",
  "emailaddress": "String"
}
```

