---
title: "skypeForBusinessOrganizerActivityMinuteCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessOrganizerActivityMinuteCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessOrganizerActivityMinuteCounts](../api/skypeforbusinessorganizeractivityminutecounts-list.md)|[skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) collection|Get a list of the [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) objects and their properties.|
|[Create skypeForBusinessOrganizerActivityMinuteCounts](../api/skypeforbusinessorganizeractivityminutecounts-create.md)|[skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md)|Create a new [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) object.|
|[Get skypeForBusinessOrganizerActivityMinuteCounts](../api/skypeforbusinessorganizeractivityminutecounts-get.md)|[skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md)|Read the properties and relationships of a [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) object.|
|[Update skypeForBusinessOrganizerActivityMinuteCounts](../api/skypeforbusinessorganizeractivityminutecounts-update.md)|[skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md)|Update the properties of a [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) object.|
|[Delete skypeForBusinessOrganizerActivityMinuteCounts](../api/skypeforbusinessorganizeractivityminutecounts-delete.md)|None|Deletes a [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|audioVideo|Int64|**TODO: Add Description**|
|dialInMicrosoft|Int64|**TODO: Add Description**|
|dialOutMicrosoft|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.skypeForBusinessOrganizerActivityMinuteCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessOrganizerActivityMinuteCounts",
  "id": "String (identifier)",
  "audioVideo": "Integer",
  "dialInMicrosoft": "Integer",
  "dialOutMicrosoft": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```

