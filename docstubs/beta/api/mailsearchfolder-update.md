---
title: "Update mailSearchFolder"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update mailSearchFolder

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a mailSearchFolder object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [mailSearchFolder](../resources/-mailsearchfolder.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a mailSearchFolder object.

| Property             | Type              | Description |
| :------------------- | :---------------- | :---------- |
| filterQuery          | String            |             |
| includeNestedFolders | Boolean           |             |
| isSupported          | Boolean           |             |
| sourceFolderIds      | String collection |             |

## Response

If successful, this method returns a `200 OK` response code and a mailSearchFolder object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_mailsearchfolder"
}
-->

```http
PATCH https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 379

{
  "@odata.type": "#microsoft.graph.mailSearchFolder",
  "childFolderCount": "Int32",
  "displayName": "String",
  "filterQuery": "String",
  "includeNestedFolders": "Boolean",
  "isSupported": "Boolean",
  "parentFolderId": "String",
  "sourceFolderIds": [
    "String"
  ],
  "totalItemCount": "Int32",
  "unreadItemCount": "Int32",
  "wellKnownName": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.mailSearchFolder"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.mailSearchFolder",
  "childFolderCount": "Int32",
  "displayName": "String",
  "filterQuery": "String",
  "id": "String(identifier)",
  "includeNestedFolders": "Boolean",
  "isSupported": "Boolean",
  "parentFolderId": "String",
  "sourceFolderIds": [
    "String"
  ],
  "totalItemCount": "Int32",
  "unreadItemCount": "Int32",
  "wellKnownName": "String"
}
}

```
