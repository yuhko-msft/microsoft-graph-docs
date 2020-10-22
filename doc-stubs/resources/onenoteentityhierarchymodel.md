---
title: "onenoteEntityHierarchyModel resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# onenoteEntityHierarchyModel resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [onenoteEntitySchemaObjectModel](../resources/onenoteentityschemaobjectmodel.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List onenoteEntityHierarchyModels](../api/onenoteentityhierarchymodel-list.md)|[onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md) collection|Get a list of the [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md) objects and their properties.|
|[Create onenoteEntityHierarchyModel](../api/onenoteentityhierarchymodel-create.md)|[onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md)|Create a new [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md) object.|
|[Get onenoteEntityHierarchyModel](../api/onenoteentityhierarchymodel-get.md)|[onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md)|Read the properties and relationships of an [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md) object.|
|[Update onenoteEntityHierarchyModel](../api/onenoteentityhierarchymodel-update.md)|[onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md)|Update the properties of an [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md) object.|
|[Delete onenoteEntityHierarchyModel](../api/onenoteentityhierarchymodel-delete.md)|None|Deletes an [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntitySchemaObjectModel](../resources/onenoteentityschemaobjectmodel.md)|
|displayName|String|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|self|String|**TODO: Add Description** Inherited from [onenoteEntityBaseModel](../resources/onenoteentitybasemodel.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.onenoteEntityHierarchyModel",
  "baseType": "microsoft.graph.onenoteEntitySchemaObjectModel",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.onenoteEntityHierarchyModel",
  "self": "String",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)"
}
```

