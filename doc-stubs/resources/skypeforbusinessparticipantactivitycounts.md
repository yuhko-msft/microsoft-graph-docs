---
title: "skypeForBusinessParticipantActivityCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessParticipantActivityCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessParticipantActivityCounts](../api/skypeforbusinessparticipantactivitycounts-list.md)|[skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) collection|Get a list of the [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) objects and their properties.|
|[Create skypeForBusinessParticipantActivityCounts](../api/skypeforbusinessparticipantactivitycounts-create.md)|[skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md)|Create a new [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) object.|
|[Get skypeForBusinessParticipantActivityCounts](../api/skypeforbusinessparticipantactivitycounts-get.md)|[skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md)|Read the properties and relationships of a [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) object.|
|[Update skypeForBusinessParticipantActivityCounts](../api/skypeforbusinessparticipantactivitycounts-update.md)|[skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md)|Update the properties of a [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) object.|
|[Delete skypeForBusinessParticipantActivityCounts](../api/skypeforbusinessparticipantactivitycounts-delete.md)|None|Deletes a [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appSharing|Int64|**TODO: Add Description**|
|audioVideo|Int64|**TODO: Add Description**|
|dialInOut3rdParty|Int64|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.skypeForBusinessParticipantActivityCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessParticipantActivityCounts",
  "id": "String (identifier)",
  "appSharing": "Integer",
  "audioVideo": "Integer",
  "dialInOut3rdParty": "Integer",
  "im": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "web": "Integer"
}
```

