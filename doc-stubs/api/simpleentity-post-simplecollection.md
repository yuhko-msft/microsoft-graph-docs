---
title: "Create simpleEntity"
description: "Create a new simpleEntity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create simpleEntity
Namespace: microsoft.graph

Create a new [simpleEntity](../resources/simpleentity.md) object.

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
POST /simpleCollection
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [simpleEntity](../resources/simpleentity.md) object.

The following table shows the properties that are required when you create the [simpleEntity](../resources/simpleentity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|name|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [simpleEntity](../resources/simpleentity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_simpleentity_from_simplecollection"
}
-->
``` http
POST https://graph.microsoft.com/beta/simpleCollection
Content-Type: application/json
Content-length: 93

{
  "@odata.type": "#microsoft.management.services.api.simpleEntity",
  "name": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.simpleEntity"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.management.services.api.simpleEntity",
  "id": "cfa507af-07af-cfa5-af07-a5cfaf07a5cf",
  "name": "String"
}
```

