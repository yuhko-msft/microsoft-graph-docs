---
title: "skypeForBusinessOrganizerActivityUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessOrganizerActivityUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessOrganizerActivityUserCounts](../api/skypeforbusinessorganizeractivityusercounts-list.md)|[skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md) collection|Get a list of the [skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md) objects and their properties.|
|[Create skypeForBusinessOrganizerActivityUserCounts](../api/skypeforbusinessorganizeractivityusercounts-create.md)|[skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md)|Create a new [skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md) object.|
|[Get skypeForBusinessOrganizerActivityUserCounts](../api/skypeforbusinessorganizeractivityusercounts-get.md)|[skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md)|Read the properties and relationships of a [skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md) object.|
|[Update skypeForBusinessOrganizerActivityUserCounts](../api/skypeforbusinessorganizeractivityusercounts-update.md)|[skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md)|Update the properties of a [skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md) object.|
|[Delete skypeForBusinessOrganizerActivityUserCounts](../api/skypeforbusinessorganizeractivityusercounts-delete.md)|None|Deletes a [skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md) object.|

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
  "@odata.type": "microsoft.graph.skypeForBusinessOrganizerActivityUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessOrganizerActivityUserCounts",
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

