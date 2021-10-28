---
title: "Create teamworkHierarchy"
description: "Create a new teamworkHierarchy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamworkHierarchy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [teamworkHierarchy](../resources/teamworkhierarchy.md) object.

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
POST /hierarchies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamworkHierarchy](../resources/teamworkhierarchy.md) object.

You can specify the following properties when creating a **teamworkHierarchy**.

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Required.|
|rootNodesUrls|String collection|**TODO: Add Description** Required.|
|topics|String collection|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `201 Created` response code and a [teamworkHierarchy](../resources/teamworkhierarchy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamworkhierarchy_from_hierarchies"
}
-->
``` http
POST https://graph.microsoft.com/beta/hierarchies
Content-Type: application/json
Content-length: 164

{
  "@odata.type": "#microsoft.graph.teamworkHierarchy",
  "displayName": "String",
  "rootNodesUrls": [
    "String"
  ],
  "topics": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.teamworkHierarchy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.teamworkHierarchy",
  "id": "ba5f3202-3202-ba5f-0232-5fba02325fba",
  "displayName": "String",
  "rootNodesUrls": [
    "String"
  ],
  "topics": [
    "String"
  ]
}
```

