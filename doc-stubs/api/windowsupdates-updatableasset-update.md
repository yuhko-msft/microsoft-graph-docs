---
title: "Update updatableAsset"
description: "Update the properties of an updatableAsset object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update updatableAsset
Namespace: microsoft.graph.windowsUpdates



Update the properties of an [updatableAsset](../resources/windowsupdates-updatableasset.md) object.

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
PATCH /updatableAssetGroup/members/{updatableAssetId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [updatableAsset](../resources/windowsupdates-updatableasset.md) object.

The following table shows the properties that are required when you update the [updatableAsset](../resources/windowsupdates-updatableasset.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/windowsupdates-entity.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [updatableAsset](../resources/windowsupdates-updatableasset.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_updatableasset"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/updatableAssetGroup/members/{updatableAssetId}
Content-Type: application/json
Content-length: 71

{
  "@odata.type": "#microsoft.graph.windowsUpdates.updatableAsset"
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
  "@odata.type": "#microsoft.graph.windowsUpdates.updatableAsset",
  "id": "3b7b5060-5060-3b7b-6050-7b3b60507b3b"
}
```

