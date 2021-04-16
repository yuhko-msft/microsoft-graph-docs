---
title: "skypeForBusinessOrganizerActivityCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessOrganizerActivityCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessOrganizerActivityCounts](../api/skypeforbusinessorganizeractivitycounts-list.md)|[skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md) collection|Get a list of the [skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md) objects and their properties.|
|[Create skypeForBusinessOrganizerActivityCounts](../api/skypeforbusinessorganizeractivitycounts-create.md)|[skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md)|Create a new [skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md) object.|
|[Get skypeForBusinessOrganizerActivityCounts](../api/skypeforbusinessorganizeractivitycounts-get.md)|[skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md)|Read the properties and relationships of a [skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md) object.|
|[Update skypeForBusinessOrganizerActivityCounts](../api/skypeforbusinessorganizeractivitycounts-update.md)|[skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md)|Update the properties of a [skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md) object.|
|[Delete skypeForBusinessOrganizerActivityCounts](../api/skypeforbusinessorganizeractivitycounts-delete.md)|None|Deletes a [skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appSharing|Int64|**TODO: Add Description**|
|audioVideo|Int64|**TODO: Add Description**|
|dialInOut3rdParty|Int64|**TODO: Add Description**|
|dialInOutMicrosoft|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|im|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|web|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.skypeForBusinessOrganizerActivityCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessOrganizerActivityCounts",
  "id": "String (identifier)",
  "appSharing": "Integer",
  "audioVideo": "Integer",
  "dialInOut3rdParty": "Integer",
  "dialInOutMicrosoft": "Integer",
  "im": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "web": "Integer"
}
```

