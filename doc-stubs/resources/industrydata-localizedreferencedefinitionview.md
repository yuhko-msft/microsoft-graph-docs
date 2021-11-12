---
title: "localizedReferenceDefinitionView resource type"
description: "Read-only result set type for simplified querying of localized referenceDefinitions."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# localizedReferenceDefinitionView resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read-only result set type for simplified querying of localized referenceDefinitions.


Inherits from [entity](../resources/industrydata-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List localizedReferenceDefinitionViews](../api/industrydata-localizedreferencedefinitionview-list.md)|[microsoft.graph.industryData.localizedReferenceDefinitionView](../resources/industrydata-localizedreferencedefinitionview.md) collection|Get a list of the [localizedReferenceDefinitionView](../resources/industrydata-localizedreferencedefinitionview.md) objects and their properties.|
|[Get localizedReferenceDefinitionView](../api/industrydata-localizedreferencedefinitionview-get.md)|[microsoft.graph.industryData.localizedReferenceDefinitionView](../resources/industrydata-localizedreferencedefinitionview.md)|Read the properties and relationships of a [localizedReferenceDefinitionView](../resources/industrydata-localizedreferencedefinitionview.md) object.|
|[Update localizedReferenceDefinitionView](../api/industrydata-localizedreferencedefinitionview-update.md)|[microsoft.graph.industryData.localizedReferenceDefinitionView](../resources/industrydata-localizedreferencedefinitionview.md)|Update the properties of a [localizedReferenceDefinitionView](../resources/industrydata-localizedreferencedefinitionview.md) object.|
|[Delete localizedReferenceDefinitionView](../api/industrydata-localizedreferencedefinitionview-delete.md)|None|Deletes a [localizedReferenceDefinitionView](../resources/industrydata-localizedreferencedefinitionview.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|Code value for the definition.|
|displayName|String|Localized name of the definition.|
|namespace|String|Namespace of the definition.|
|url|String|Reference url to the definition.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.localizedReferenceDefinitionView",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.localizedReferenceDefinitionView",
  "code": "String",
  "displayName": "String",
  "namespace": "String",
  "url": "String"
}
```

