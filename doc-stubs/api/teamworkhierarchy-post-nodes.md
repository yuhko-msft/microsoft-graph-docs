---
title: "Create teamworkHierarchyNode"
description: "Create a new teamworkHierarchyNode object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamworkHierarchyNode
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) object.

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
POST /hierarchies/{hierarchiesId}/nodes
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) object.

You can specify the following properties when creating a **teamworkHierarchyNode**.

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Required.|
|teamId|String|**TODO: Add Description** Required.|
|groupId|String|**TODO: Add Description** Required.|
|parentNodesUrls|String collection|**TODO: Add Description** Optional.|
|attributes|String collection|**TODO: Add Description** Required.|
|topicsToChannelMap|String|**TODO: Add Description** Required.|
|childNodesUrls|String collection|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamworkhierarchynode_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/hierarchies/{hierarchiesId}/nodes
Content-Type: application/json
Content-length: 299

{
  "@odata.type": "#microsoft.graph.teamworkHierarchyNode",
  "displayName": "String",
  "teamId": "String",
  "groupId": "String",
  "parentNodesUrls": [
    "String"
  ],
  "attributes": [
    "String"
  ],
  "topicsToChannelMap": "String",
  "childNodesUrls": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.teamworkHierarchyNode"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.teamworkHierarchyNode",
  "id": "639e40dc-40dc-639e-dc40-9e63dc409e63",
  "displayName": "String",
  "teamId": "String",
  "groupId": "String",
  "parentNodesUrls": [
    "String"
  ],
  "attributes": [
    "String"
  ],
  "topicsToChannelMap": "String",
  "childNodesUrls": [
    "String"
  ]
}
```

