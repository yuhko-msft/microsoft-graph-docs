---
title: "yearTimePeriodDefinition resource type"
description: "Defines annual time periods such as academic or fiscal years."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# yearTimePeriodDefinition resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Defines annual time periods such as academic or fiscal years.


Inherits from [mutableEntity](../resources/mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List yearTimePeriodDefinitions](../api/yeartimeperioddefinition-list.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) collection|Get a list of the [yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) objects and their properties.|
|[Create yearTimePeriodDefinition](../api/industrydatahub-post-years.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md)|Create a new [yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) object.|
|[Get yearTimePeriodDefinition](../api/yeartimeperioddefinition-get.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md)|Read the properties and relationships of a [yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) object.|
|[Update yearTimePeriodDefinition](../api/yeartimeperioddefinition-update.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md)|Update the properties of a [yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) object.|
|[Delete yearTimePeriodDefinition](../api/yeartimeperioddefinition-delete.md)|None|Deletes a [yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the year.|
|endDate|Date|The last day of the year. ISO 8601 date.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|startDate|Date|The first day of the year. ISO 8601 date.|
|year|String|TBD - will be replaced with a reference nav property.|
|year2|[yearReferenceValue](../resources/yearreferencevalue.md)|Pointer to a year entry in the referenceDefinition collection.  Rename to year once the simple text year value is removed.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.yearTimePeriodDefinition",
  "baseType": "microsoft.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.yearTimePeriodDefinition",
  "id": "String (identifier)",
  "eTag": "String",
  "displayName": "String",
  "year": "String",
  "year2": {
    "@odata.type": "microsoft.graph.yearReferenceValue"
  },
  "startDate": "Date",
  "endDate": "Date"
}
```

