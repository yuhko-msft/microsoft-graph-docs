---
title: "Create onenoteSection"
description: "Create a new onenoteSection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create onenoteSection
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new onenoteSection object.

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
POST /users/{usersId}/onenote/notebooks/{notebookId}/sections
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onenoteSection](../resources/onenotesection.md) object.

The following table shows the properties that are required when you create the [onenoteSection](../resources/onenotesection.md).

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

If successful, this method returns a `201 Created` response code and an [onenoteSection](../resources/onenotesection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_onenotesection_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/onenote/notebooks/{notebookId}/sections
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
  "truncated": true,
  "@odata.type": "microsoft.graph.onenoteSection"
}
-->
``` http
HTTP/1.1 201 Created
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

