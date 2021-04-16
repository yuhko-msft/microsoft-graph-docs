---
title: "Create mailFolder"
description: "Create a new mailFolder object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mailFolder
Namespace: microsoft.graph



Create a new [mailFolder](../resources/mailfolder.md) object.

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
POST /me/mailFolders
POST /users/{usersId}/mailFolders
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mailFolder](../resources/mailfolder.md) object.

The following table shows the properties that are required when you create the [mailFolder](../resources/mailfolder.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|childFolderCount|Int32|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isHidden|Boolean|**TODO: Add Description**|
|parentFolderId|String|**TODO: Add Description**|
|totalItemCount|Int32|**TODO: Add Description**|
|unreadItemCount|Int32|**TODO: Add Description**|
|wellKnownName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [mailFolder](../resources/mailfolder.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mailfolder_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/mailFolders
Content-Type: application/json
Content-length: 266

{
  "@odata.type": "#microsoft.graph.mailFolder",
  "childFolderCount": "Integer",
  "displayName": "String",
  "isHidden": "Boolean",
  "parentFolderId": "String",
  "totalItemCount": "Integer",
  "unreadItemCount": "Integer",
  "wellKnownName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mailFolder"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.mailFolder",
  "id": "65a6d364-d364-65a6-64d3-a66564d3a665",
  "childFolderCount": "Integer",
  "displayName": "String",
  "isHidden": "Boolean",
  "parentFolderId": "String",
  "totalItemCount": "Integer",
  "unreadItemCount": "Integer",
  "wellKnownName": "String"
}
```

