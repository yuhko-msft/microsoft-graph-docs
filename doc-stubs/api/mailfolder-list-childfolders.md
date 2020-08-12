---
title: "List childFolders"
description: "Get the mailFolders from the childFolders navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List childFolders
Namespace: microsoft.graph

Get the mailFolders from the childFolders navigation property.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /users/{usersId}/mailFolders
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [mailFolder](../resources/mailfolder.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_mailfolder"
}
-->
``` http
GET https://graph.microsoft.com/beta/users/{usersId}/mailFolders
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.mailFolder)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.mailFolder",
      "id": "692ea8f2-a8f2-692e-f2a8-2e69f2a82e69",
      "displayName": "String",
      "parentFolderId": "String",
      "childFolderCount": "Integer",
      "unreadItemCount": "Integer",
      "totalItemCount": "Integer",
      "wellKnownName": "String"
    }
  ]
}
```

