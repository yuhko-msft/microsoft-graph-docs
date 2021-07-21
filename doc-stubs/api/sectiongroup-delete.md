---
title: "Delete sectionGroup"
description: "Deletes a sectionGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Delete sectionGroup
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Deletes a [sectionGroup](../resources/sectiongroup.md) object.

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
DELETE /me/onenote/sectionGroups/{sectionGroupId}
DELETE /users/{usersId}/onenote/sectionGroups/{sectionGroupId}
DELETE /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}
DELETE /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}
DELETE /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/parentSectionGroup
DELETE /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sectionGroups/{sectionGroupId}
DELETE /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/parentSectionGroup
DELETE /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sectionGroups/{sectionGroupId}
DELETE /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/parentSectionGroup
DELETE /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/parentSectionGroup
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "delete_sectiongroup"
}
-->
``` http
DELETE https://graph.microsoft.com/beta/me/onenote/sectionGroups/{sectionGroupId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 204 No Content
```

