---
title: "Update onenoteSection"
description: "Update the properties of an onenoteSection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update onenoteSection
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [onenoteSection](../resources/onenotesection.md) object.

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
PATCH /me/onenote/sections/{onenoteSectionId}
PATCH /users/{usersId}/onenote/sections/{onenoteSectionId}
PATCH /me/onenote/notebooks/{notebookId}/sections/{onenoteSectionId}
PATCH /users/{usersId}/onenote/notebooks/{notebookId}/sections/{onenoteSectionId}
PATCH /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}
PATCH /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}
PATCH /me/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/pages/{onenotePageId}/parentSection
PATCH /users/{usersId}/onenote/notebooks/{notebookId}/sectionGroups/{sectionGroupId}/sections/{onenoteSectionId}/pages/{onenotePageId}/parentSection
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onenoteSection](../resources/onenotesection.md) object.

The following table shows the properties that are required when you update the [onenoteSection](../resources/onenotesection.md).

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
|links|[sectionLinks](../resources/sectionlinks.md)|**TODO: Add Description**|
|pagesUrl|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [onenoteSection](../resources/onenotesection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_onenotesection"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/onenote/sections/{onenoteSectionId}
Content-Type: application/json
Content-length: 302

{
  "@odata.type": "#microsoft.graph.onenoteSection",
  "self": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "displayName": "String",
  "isDefault": "Boolean",
  "links": {
    "@odata.type": "microsoft.graph.sectionLinks"
  },
  "pagesUrl": "String"
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
```

