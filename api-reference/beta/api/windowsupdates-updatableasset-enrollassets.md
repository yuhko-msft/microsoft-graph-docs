---
title: "updatableAsset: enrollAssets"
description: "Enroll an updatable asset in update management by the deployment service."
author: "Alice-at-Microsoft"
localization_priority: Normal
ms.prod: "w10"
doc_type: apiPageType
---

# updatableAsset: enrollAssets
Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Enroll an updatable asset in update management by the deployment service.

An [azureADDevice](../resources/windowsupdates-azureaddevice.md) can be enrolled in update management; an [updatableAssetGroup](../resources/windowsupdates-updatableassetgroup.md) cannot be enrolled in update management.

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
POST /admin/windows/updates/updatableAssets/enrollAssets
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
|updateCategory|updateCategory|The category of updates for the service to manage. Possible values are: `feature`.|
|assets|[updatableAsset](../resources/windowsupdates-updatableasset.md) collection|List of updatable assets to enroll in update management by the service for the given `updateCategory`.|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "updatableasset_enrollassets"
}
-->
``` http
POST https://graph.microsoft.com/beta/admin/windows/updates/updatableAssets/enrollAssets

Content-Type: application/json
Content-length: 176

{
  "updateCategory": "String",
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

<!-- # updatableAsset: enrollAssetsById
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
POST /admin/windows/updates/updatableAssets/enrollAssetsById
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
|updateCategory|updateCategory|**TODO: Add Description**|
|memberEntityType|String|**TODO: Add Description**|
|ids|String collection|**TODO: Add Description**|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request -->
<!-- {
  "blockType": "request",
  "name": "updatableasset_enrollassetsbyid"
}
-->
<!-- ``` http
POST https://graph.microsoft.com/beta/admin/windows/updates/updatableAssets/enrollAssetsById

Content-Type: application/json
Content-length: 99

{
  "updateCategory": "String",
  "memberEntityType": "String",
  "ids": [
    "String"
  ]
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
