---
title: "baseItemVersion resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# baseItemVersion resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List baseItemVersions](../api/baseitemversion-list.md)|[baseItemVersion](../resources/baseitemversion.md) collection|Get a list of the [baseItemVersion](../resources/baseitemversion.md) objects and their properties.|
|[Create baseItemVersion](../api/baseitemversion-create.md)|[baseItemVersion](../resources/baseitemversion.md)|Create a new [baseItemVersion](../resources/baseitemversion.md) object.|
|[Get baseItemVersion](../api/baseitemversion-get.md)|[baseItemVersion](../resources/baseitemversion.md)|Read the properties and relationships of a [baseItemVersion](../resources/baseitemversion.md) object.|
|[Update baseItemVersion](../api/baseitemversion-update.md)|[baseItemVersion](../resources/baseitemversion.md)|Update the properties of a [baseItemVersion](../resources/baseitemversion.md) object.|
|[Delete baseItemVersion](../api/baseitemversion-delete.md)|None|Deletes a [baseItemVersion](../resources/baseitemversion.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|publication|[publicationFacet](../resources/publicationfacet.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.baseItemVersion",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.baseItemVersion",
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

