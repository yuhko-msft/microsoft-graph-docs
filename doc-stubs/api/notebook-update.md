---
title: "Update notebook"
description: "Update the properties of a notebook object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update notebook
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [notebook](../resources/notebook.md) object.

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
PATCH /me/onenote/notebooks/{notebookId}
PATCH /users/{usersId}/onenote/notebooks/{notebookId}
PATCH /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/parentNotebook
PATCH /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/parentNotebook
PATCH /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/parentNotebook
PATCH /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/parentNotebook
PATCH /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/pages/{onenotePageId}/parentNotebook
PATCH /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/pages/{onenotePageId}/parentNotebook
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [notebook](../resources/notebook.md) object.

The following table shows the properties that are required when you update the [notebook](../resources/notebook.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|self|String|**TODO: Add Description** Inherited from [onenoteEntityBaseModel](../resources/onenoteentitybasemodel.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntitySchemaObjectModel](../resources/onenoteentityschemaobjectmodel.md)|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md)|
|displayName|String|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md)|
|isDefault|Boolean|**TODO: Add Description**|
|isShared|Boolean|**TODO: Add Description**|
|links|[notebookLinks](../resources/notebooklinks.md)|**TODO: Add Description**|
|sectionGroupsUrl|String|**TODO: Add Description**|
|sectionsUrl|String|**TODO: Add Description**|
|userRole|onenoteUserRole|**TODO: Add Description**. Possible values are: `None`, `Owner`, `Contributor`, `Reader`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [notebook](../resources/notebook.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_notebook"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/onenote/notebooks/{notebookId}
Content-Type: application/json
Content-length: 384

{
  "@odata.type": "#microsoft.graph.notebook",
  "self": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "displayName": "String",
  "isDefault": "Boolean",
  "isShared": "Boolean",
  "links": {
    "@odata.type": "microsoft.graph.notebookLinks"
  },
  "sectionGroupsUrl": "String",
  "sectionsUrl": "String",
  "userRole": "String"
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
  "@odata.type": "#microsoft.graph.notebook",
  "id": "d1e0a48c-a48c-d1e0-8ca4-e0d18ca4e0d1",
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
```

