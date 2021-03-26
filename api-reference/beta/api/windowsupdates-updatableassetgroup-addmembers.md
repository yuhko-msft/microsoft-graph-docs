---
title: "updatableAssetGroup: addMembers"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# updatableAssetGroup: addMembers
Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add members to an updatableAssetGroup. An azureADDevice can be added as a member of an updatableAssetGroup; an updatableAssetGroup cannot be added as a member of an updatableAssetGroup.

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
POST /updatableAssetGroup/{updatableAssetGroupId}/addMembers
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|assets|[updatableAsset](../resources/windowsupdates-updatableasset.md) collection|List of updatable assets to add as members of the updatable asset group.|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "updatableassetgroup_addmembers"
}
-->
``` http
POST https://graph.microsoft.com/beta/updatableAssetGroup/{updatableAssetGroupId}/addMembers

Content-Type: application/json
Content-length: 145

{
  "assets": [
    {
      "@odata.type": "#microsoft.graph.windowsUpdates.updatableAsset",
      "id": "String (identifier)"
    }
  ]
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
HTTP/1.1 204 No Content
```

<!-- # updatableAssetGroup: addMembersById
Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request -->

<!-- {
  "blockType": "ignored"
}
-->
<!-- ``` http
POST /updatableAssetGroup/{updatableAssetGroupId}/addMembersById
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|ids|String collection|**TODO: Add Description**|
|memberEntityType|String|**TODO: Add Description**|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request -->
<!-- {
  "blockType": "request",
  "name": "updatableassetgroup_addmembersbyid"
}
-->
<!-- ``` http
POST https://graph.microsoft.com/beta/updatableAssetGroup/{updatableAssetGroupId}/addMembersById

Content-Type: application/json
Content-length: 68

{
  "ids": [
    "String"
  ],
  "memberEntityType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability. -->
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
<!-- ``` http
HTTP/1.1 204 No Content
```
 -->
