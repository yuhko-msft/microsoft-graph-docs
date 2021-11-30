---
title: "Update roleGroup"
description: "Update the properties of a roleGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update roleGroup
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [roleGroup](../resources/rolegroup.md) object.

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
PATCH /industryData/roleGroups/{roleGroupId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|displayName|String|The name of the role group. Required.|
|roles|String collection|The set of roles belonging to the role group. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [roleGroup](../resources/rolegroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_rolegroup"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/industryData/roleGroups/{roleGroupId}
Content-Type: application/json
Content-length: 134

{
  "@odata.type": "#microsoft.graph.roleGroup",
  "eTag": "String",
  "displayName": "String",
  "roles": [
    "String"
  ]
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
  "@odata.type": "#microsoft.graph.roleGroup",
  "eTag": "String",
  "displayName": "String",
  "roles": [
    "String"
  ]
}
```

