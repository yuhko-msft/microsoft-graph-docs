---
title: "Get notebook"
description: "Read the properties and relationships of a notebook object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get notebook
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [notebook](../resources/notebook.md) object.

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
GET /me/onenote/notebooks/{notebookId}
GET /users/{usersId}/onenote/notebooks/{notebookId}
GET /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/parentNotebook
GET /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/parentNotebook
GET /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/parentNotebook
GET /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/parentNotebook
GET /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/pages/{onenotePageId}/parentNotebook
GET /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/pages/{onenotePageId}/parentNotebook
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

If successful, this method returns a `200 OK` response code and a [notebook](../resources/notebook.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_notebook"
}
-->
``` http
GET https://graph.microsoft.com/beta/me/onenote/notebooks/{notebookId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.notebook"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.notebook",
    "id": "3f4eac71-ac71-3f4e-71ac-4e3f71ac4e3f",
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
    "isShared": "Boolean",
    "links": {
      "@odata.type": "microsoft.graph.notebookLinks"
    },
    "sectionGroupsUrl": "String",
    "sectionsUrl": "String",
    "userRole": "String"
  }
}
```

