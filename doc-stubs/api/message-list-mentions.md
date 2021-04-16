---
title: "List mentions"
description: "Get the mention resources from the mentions navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List mentions
Namespace: microsoft.graph



Get the mention resources from the mentions navigation property.

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
GET /users/{usersId}/mailFolders/{mailFolderId}/messages/{messageId}/mentions
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

If successful, this method returns a `200 OK` response code and a collection of [mention](../resources/mention.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_mention"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/users/{usersId}/mailFolders/{mailFolderId}/messages/{messageId}/mentions
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.mention)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.mention",
      "id": "2972a86e-a86e-2972-6ea8-72296ea87229",
      "application": "String",
      "clientReference": "String",
      "createdBy": {
        "@odata.type": "microsoft.graph.emailAddress"
      },
      "createdDateTime": "String (timestamp)",
      "deepLink": "String",
      "mentioned": {
        "@odata.type": "microsoft.graph.emailAddress"
      },
      "mentionText": "String",
      "serverCreatedDateTime": "String (timestamp)"
    }
  ]
}
```

