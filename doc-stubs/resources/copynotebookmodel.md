---
title: "CopyNotebookModel resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# CopyNotebookModel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|String|**TODO: Add Description**|
|createdByIdentity|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|createdTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|isDefault|Boolean|**TODO: Add Description**|
|isShared|Boolean|**TODO: Add Description**|
|lastModifiedBy|String|**TODO: Add Description**|
|lastModifiedByIdentity|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedTime|DateTimeOffset|**TODO: Add Description**|
|links|[notebookLinks](../resources/notebooklinks.md)|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|sectionGroupsUrl|String|**TODO: Add Description**|
|sectionsUrl|String|**TODO: Add Description**|
|self|String|**TODO: Add Description**|
|userRole|onenoteUserRole|**TODO: Add Description**. Possible values are: `None`, `Owner`, `Contributor`, `Reader`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.CopyNotebookModel"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.CopyNotebookModel",
  "createdBy": "String",
  "createdByIdentity": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdTime": "String (timestamp)",
  "id": "String (identifier)",
  "isDefault": "Boolean",
  "isShared": "Boolean",
  "lastModifiedBy": "String",
  "lastModifiedByIdentity": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedTime": "String (timestamp)",
  "links": {
    "@odata.type": "microsoft.graph.notebookLinks"
  },
  "name": "String",
  "sectionGroupsUrl": "String",
  "sectionsUrl": "String",
  "self": "String",
  "userRole": "String"
}
```

