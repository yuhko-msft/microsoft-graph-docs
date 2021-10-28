---
title: "teamworkHierarchyNode: getAncestors"
description: "Gets all the ancestors for given team id."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# teamworkHierarchyNode: getAncestors
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Gets all the ancestors for given team id.

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
GET /hierarchies/{hierarchiesId}/nodes/{teamworkHierarchyNodeId}/getAncestors
```

## Function parameters
In the request URL, provide the following query parameters with values.
The following table shows the parameters that can be used with this function.

|Parameter|Type|Description|
|:---|:---|:---|
|nodeId|String|**TODO: Add Description**|


## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "teamworkhierarchynode_getancestors"
}
-->
``` http
GET https://graph.microsoft.com/beta/hierarchies/{hierarchiesId}/nodes/{teamworkHierarchyNodeId}/getAncestors(nodeId='parameterValue')
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.teamworkHierarchyNode)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.teamworkHierarchyNode",
      "id": "String (identifier)",
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
  ]
}
```

