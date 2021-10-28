---
title: "Update teamworkHierarchyNode"
description: "Update the properties of a teamworkHierarchyNode object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update teamworkHierarchyNode
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) object.

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
PATCH /hierarchies/{hierarchiesId}/nodes/{teamworkHierarchyNodeId}
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
|displayName|String|**TODO: Add Description** Required.|
|teamId|String|**TODO: Add Description** Required.|
|groupId|String|**TODO: Add Description** Required.|
|parentNodesUrls|String collection|**TODO: Add Description** Optional.|
|attributes|String collection|**TODO: Add Description** Required.|
|topicsToChannelMap|String|**TODO: Add Description** Required.|
|childNodesUrls|String collection|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_teamworkhierarchynode"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/hierarchies/{hierarchiesId}/nodes/{teamworkHierarchyNodeId}
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
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

