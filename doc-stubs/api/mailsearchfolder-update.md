---
title: "Update mailSearchFolder"
description: "Update the properties of a mailSearchFolder object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mailSearchFolder
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [mailSearchFolder](../resources/mailsearchfolder.md) object.

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
PATCH ** Entity URI for microsoft.graph.mailSearchFolder not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mailSearchFolder](../resources/mailsearchfolder.md) object.

The following table shows the properties that are required when you update the [mailSearchFolder](../resources/mailsearchfolder.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|childFolderCount|Int32|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|displayName|String|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|isHidden|Boolean|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|parentFolderId|String|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|totalItemCount|Int32|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|unreadItemCount|Int32|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|wellKnownName|String|**TODO: Add Description** Inherited from [mailFolder](../resources/mailfolder.md)|
|filterQuery|String|**TODO: Add Description**|
|includeNestedFolders|Boolean|**TODO: Add Description**|
|isSupported|Boolean|**TODO: Add Description**|
|sourceFolderIds|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [mailSearchFolder](../resources/mailsearchfolder.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mailsearchfolder"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.mailSearchFolder not found
Content-Type: application/json
Content-length: 411

{
  "@odata.type": "#microsoft.graph.mailSearchFolder",
  "childFolderCount": "Integer",
  "displayName": "String",
  "isHidden": "Boolean",
  "parentFolderId": "String",
  "totalItemCount": "Integer",
  "unreadItemCount": "Integer",
  "wellKnownName": "String",
  "filterQuery": "String",
  "includeNestedFolders": "Boolean",
  "isSupported": "Boolean",
  "sourceFolderIds": [
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
  "@odata.type": "#microsoft.graph.mailSearchFolder",
  "id": "f598d9d1-d9d1-f598-d1d9-98f5d1d998f5",
  "childFolderCount": "Integer",
  "displayName": "String",
  "isHidden": "Boolean",
  "parentFolderId": "String",
  "totalItemCount": "Integer",
  "unreadItemCount": "Integer",
  "wellKnownName": "String",
  "filterQuery": "String",
  "includeNestedFolders": "Boolean",
  "isSupported": "Boolean",
  "sourceFolderIds": [
    "String"
  ]
}
```

