---
title: "Create roleGroup"
description: "Create a new roleGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create roleGroup
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [roleGroup](../resources/rolegroup.md) object.

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
POST /industryData/roleGroups
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [roleGroup](../resources/rolegroup.md) object.

You can specify the following properties when creating a **roleGroup**.

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|displayName|String|The name of the role group. Required.|
|roles|String collection|The set of roles belonging to the role group. Required.|



## Response

If successful, this method returns a `201 Created` response code and a [roleGroup](../resources/rolegroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_rolegroup_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/industryData/roleGroups
Content-Type: application/json
Content-length: 141

{
  "@odata.type": "#microsoft.industryData.roleGroup",
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
  "truncated": true,
  "@odata.type": "microsoft.industryData.roleGroup"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.industryData.roleGroup",
  "id": "c9e3e023-e023-c9e3-23e0-e3c923e0e3c9",
  "eTag": "String",
  "displayName": "String",
  "roles": [
    "String"
  ]
}
```

