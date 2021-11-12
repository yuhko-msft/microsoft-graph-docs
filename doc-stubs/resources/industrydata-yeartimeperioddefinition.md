---
title: "yearTimePeriodDefinition resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# yearTimePeriodDefinition resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [mutableEntity](../resources/industrydata-mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List yearTimePeriodDefinitions](../api/industrydata-yeartimeperioddefinition-list.md)|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md) collection|Get a list of the [yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md) objects and their properties.|
|[Create yearTimePeriodDefinition](../api/industrydata-industrydatahub-post-years.md)|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md)|Create a new [yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md) object.|
|[Get yearTimePeriodDefinition](../api/industrydata-yeartimeperioddefinition-get.md)|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md)|Read the properties and relationships of a [yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md) object.|
|[Update yearTimePeriodDefinition](../api/industrydata-yeartimeperioddefinition-update.md)|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md)|Update the properties of a [yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md) object.|
|[Delete yearTimePeriodDefinition](../api/industrydata-yeartimeperioddefinition-delete.md)|None|Deletes a [yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the year.|
|endDate|Date|The last day of the year. ISO 8601 date.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|startDate|Date|The first day of the year. ISO 8601 date.|
|year|String|TBD - will be replaced with a reference nav property.|
|year2|[microsoft.graph.industryData.yearReferenceValue](../resources/industrydata-yearreferencevalue.md)|Pointer to a year entry in the referenceDefinition collection.  Rename to year once the simple text year value is removed.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.yearTimePeriodDefinition",
  "baseType": "microsoft.graph.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.yearTimePeriodDefinition",
  "eTag": "String",
  "displayName": "String",
  "year": "String",
  "year2": {
    "@odata.type": "microsoft.graph.industryData.yearReferenceValue"
  },
  "startDate": "Date",
  "endDate": "Date"
}
```

