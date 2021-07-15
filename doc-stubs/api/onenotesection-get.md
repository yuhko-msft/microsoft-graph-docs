---
title: "Get onenoteSection"
description: "Read the properties and relationships of an onenoteSection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get onenoteSection
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [onenoteSection](../resources/onenotesection.md) object.

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
GET /me/onenote/sections/{onenoteSectionId}
GET /users/{usersId}/onenote/sections/{onenoteSectionId}
GET /me/onenote/notebooks/{notebookId}/sections/{onenoteSectionId}
GET /users/{usersId}/onenote/notebooks/{notebookId}/sections/{onenoteSectionId}
GET /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}
GET /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}
GET /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/pages/{onenotePageId}/parentSection
GET /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/pages/{onenotePageId}/parentSection
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

If successful, this method returns a `200 OK` response code and an [onenoteSection](../resources/onenotesection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_onenotesection"
}
-->
``` http
GET https://graph.microsoft.com/beta/me/onenote/sections/{onenoteSectionId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.onenoteSection"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.onenoteSection",
    "id": "ef73f0d6-f0d6-ef73-d6f0-73efd6f073ef",
    "self": "String",
    "createdDateTime": "String (timestamp)",
    "createdBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "displayName": "String",
    "lastModifiedBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "lastModifiedDateTime": "String (timestamp)",
    "isDefault": "Boolean",
    "links": {
      "@odata.type": "microsoft.graph.sectionLinks"
    },
    "pagesUrl": "String"
  }
}
```

