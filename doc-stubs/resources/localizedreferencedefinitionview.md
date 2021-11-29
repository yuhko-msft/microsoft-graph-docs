---
title: "localizedReferenceDefinitionView resource type"
description: "Read-only result set type for simplified querying of localized referenceDefinitions."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# localizedReferenceDefinitionView resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read-only result set type for simplified querying of localized referenceDefinitions.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List localizedReferenceDefinitionViews](../api/localizedreferencedefinitionview-list.md)|[localizedReferenceDefinitionView](../resources/localizedreferencedefinitionview.md) collection|Get a list of the [localizedReferenceDefinitionView](../resources/localizedreferencedefinitionview.md) objects and their properties.|
|[Get localizedReferenceDefinitionView](../api/localizedreferencedefinitionview-get.md)|[localizedReferenceDefinitionView](../resources/localizedreferencedefinitionview.md)|Read the properties and relationships of a [localizedReferenceDefinitionView](../resources/localizedreferencedefinitionview.md) object.|
|[Update localizedReferenceDefinitionView](../api/localizedreferencedefinitionview-update.md)|[localizedReferenceDefinitionView](../resources/localizedreferencedefinitionview.md)|Update the properties of a [localizedReferenceDefinitionView](../resources/localizedreferencedefinitionview.md) object.|
|[Delete localizedReferenceDefinitionView](../api/localizedreferencedefinitionview-delete.md)|None|Deletes a [localizedReferenceDefinitionView](../resources/localizedreferencedefinitionview.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|Code value for the definition.|
|displayName|String|Localized name of the definition.|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|namespace|String|Namespace of the definition.|
|url|String|Reference url to the definition.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.localizedReferenceDefinitionView",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.localizedReferenceDefinitionView",
  "id": "String (identifier)",
  "code": "String",
  "displayName": "String",
  "namespace": "String",
  "url": "String"
}
```

