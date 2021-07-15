---
title: "listItemVersion resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# listItemVersion resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [baseItemVersion](../resources/baseitemversion.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List listItemVersions](../api/listitemversion-list.md)|[listItemVersion](../resources/listitemversion.md) collection|Get a list of the [listItemVersion](../resources/listitemversion.md) objects and their properties.|
|[Create listItemVersion](../api/listitemversion-create.md)|[listItemVersion](../resources/listitemversion.md)|Create a new [listItemVersion](../resources/listitemversion.md) object.|
|[Get listItemVersion](../api/listitemversion-get.md)|[listItemVersion](../resources/listitemversion.md)|Read the properties and relationships of a [listItemVersion](../resources/listitemversion.md) object.|
|[Update listItemVersion](../api/listitemversion-update.md)|[listItemVersion](../resources/listitemversion.md)|Update the properties of a [listItemVersion](../resources/listitemversion.md) object.|
|[Delete listItemVersion](../api/listitemversion-delete.md)|None|Deletes a [listItemVersion](../resources/listitemversion.md) object.|
|[restoreVersion](../api/listitemversion-restoreversion.md)|None|**TODO: Add Description**|
|[List fieldValueSet](../api/listitemversion-list-fields.md)|[fieldValueSet](../resources/fieldvalueset.md) collection|Get the fieldValueSet resources from the fields navigation property.|
|[Create fieldValueSet](../api/listitemversion-post-fields.md)|[fieldValueSet](../resources/fieldvalueset.md)|Create a new fieldValueSet object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItemVersion](../resources/baseitemversion.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItemVersion](../resources/baseitemversion.md).|
|publication|[publicationFacet](../resources/publicationfacet.md)|**TODO: Add Description** Inherited from [baseItemVersion](../resources/baseitemversion.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|fields|[fieldValueSet](../resources/fieldvalueset.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.listItemVersion",
  "baseType": "microsoft.graph.baseItemVersion",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.listItemVersion",
  "id": "String (identifier)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "publication": {
    "@odata.type": "microsoft.graph.publicationFacet"
  }
}
```

