---
title: "Create contactFolder"
description: "Create a new contactFolder object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create contactFolder
Namespace: microsoft.graph



Create a new [contactFolder](../resources/contactfolder.md) object.

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
POST /me/contactFolders
POST /users/{usersId}/contactFolders
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [contactFolder](../resources/contactfolder.md) object.

The following table shows the properties that are required when you create the [contactFolder](../resources/contactfolder.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|parentFolderId|String|**TODO: Add Description**|
|wellKnownName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [contactFolder](../resources/contactfolder.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_contactfolder_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/contactFolders
Content-Type: application/json
Content-length: 144

{
  "@odata.type": "#microsoft.graph.contactFolder",
  "displayName": "String",
  "parentFolderId": "String",
  "wellKnownName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.contactFolder"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.contactFolder",
  "id": "26471625-1625-2647-2516-472625164726",
  "displayName": "String",
  "parentFolderId": "String",
  "wellKnownName": "String"
}
```

