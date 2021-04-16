---
title: "skypeForBusinessParticipantActivityMinuteCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessParticipantActivityMinuteCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessParticipantActivityMinuteCounts](../api/skypeforbusinessparticipantactivityminutecounts-list.md)|[skypeForBusinessParticipantActivityMinuteCounts](../resources/skypeforbusinessparticipantactivityminutecounts.md) collection|Get a list of the [skypeForBusinessParticipantActivityMinuteCounts](../resources/skypeforbusinessparticipantactivityminutecounts.md) objects and their properties.|
|[Create skypeForBusinessParticipantActivityMinuteCounts](../api/skypeforbusinessparticipantactivityminutecounts-create.md)|[skypeForBusinessParticipantActivityMinuteCounts](../resources/skypeforbusinessparticipantactivityminutecounts.md)|Create a new [skypeForBusinessParticipantActivityMinuteCounts](../resources/skypeforbusinessparticipantactivityminutecounts.md) object.|
|[Get skypeForBusinessParticipantActivityMinuteCounts](../api/skypeforbusinessparticipantactivityminutecounts-get.md)|[skypeForBusinessParticipantActivityMinuteCounts](../resources/skypeforbusinessparticipantactivityminutecounts.md)|Read the properties and relationships of a [skypeForBusinessParticipantActivityMinuteCounts](../resources/skypeforbusinessparticipantactivityminutecounts.md) object.|
|[Update skypeForBusinessParticipantActivityMinuteCounts](../api/skypeforbusinessparticipantactivityminutecounts-update.md)|[skypeForBusinessParticipantActivityMinuteCounts](../resources/skypeforbusinessparticipantactivityminutecounts.md)|Update the properties of a [skypeForBusinessParticipantActivityMinuteCounts](../resources/skypeforbusinessparticipantactivityminutecounts.md) object.|
|[Delete skypeForBusinessParticipantActivityMinuteCounts](../api/skypeforbusinessparticipantactivityminutecounts-delete.md)|None|Deletes a [skypeForBusinessParticipantActivityMinuteCounts](../resources/skypeforbusinessparticipantactivityminutecounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|audiovideo|Int64|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.skypeForBusinessParticipantActivityMinuteCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessParticipantActivityMinuteCounts",
  "id": "String (identifier)",
  "audiovideo": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```

