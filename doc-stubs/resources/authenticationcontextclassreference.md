---
title: "authenticationContextClassReference resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# authenticationContextClassReference resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List authenticationContextClassReferences](../api/authenticationcontextclassreference-list.md)|[authenticationContextClassReference](../resources/authenticationcontextclassreference.md) collection|Get a list of the [authenticationContextClassReference](../resources/authenticationcontextclassreference.md) objects and their properties.|
|[Create authenticationContextClassReference](../api/authenticationcontextclassreference-create.md)|[authenticationContextClassReference](../resources/authenticationcontextclassreference.md)|Create a new [authenticationContextClassReference](../resources/authenticationcontextclassreference.md) object.|
|[Get authenticationContextClassReference](../api/authenticationcontextclassreference-get.md)|[authenticationContextClassReference](../resources/authenticationcontextclassreference.md)|Read the properties and relationships of an [authenticationContextClassReference](../resources/authenticationcontextclassreference.md) object.|
|[Update authenticationContextClassReference](../api/authenticationcontextclassreference-update.md)|[authenticationContextClassReference](../resources/authenticationcontextclassreference.md)|Update the properties of an [authenticationContextClassReference](../resources/authenticationcontextclassreference.md) object.|
|[Delete authenticationContextClassReference](../api/authenticationcontextclassreference-delete.md)|None|Deletes an [authenticationContextClassReference](../resources/authenticationcontextclassreference.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isAvailable|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authenticationContextClassReference",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.authenticationContextClassReference",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "isAvailable": "Boolean"
}
```

