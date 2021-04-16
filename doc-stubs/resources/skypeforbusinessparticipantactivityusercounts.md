---
title: "skypeForBusinessParticipantActivityUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessParticipantActivityUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessParticipantActivityUserCounts](../api/skypeforbusinessparticipantactivityusercounts-list.md)|[skypeForBusinessParticipantActivityUserCounts](../resources/skypeforbusinessparticipantactivityusercounts.md) collection|Get a list of the [skypeForBusinessParticipantActivityUserCounts](../resources/skypeforbusinessparticipantactivityusercounts.md) objects and their properties.|
|[Create skypeForBusinessParticipantActivityUserCounts](../api/skypeforbusinessparticipantactivityusercounts-create.md)|[skypeForBusinessParticipantActivityUserCounts](../resources/skypeforbusinessparticipantactivityusercounts.md)|Create a new [skypeForBusinessParticipantActivityUserCounts](../resources/skypeforbusinessparticipantactivityusercounts.md) object.|
|[Get skypeForBusinessParticipantActivityUserCounts](../api/skypeforbusinessparticipantactivityusercounts-get.md)|[skypeForBusinessParticipantActivityUserCounts](../resources/skypeforbusinessparticipantactivityusercounts.md)|Read the properties and relationships of a [skypeForBusinessParticipantActivityUserCounts](../resources/skypeforbusinessparticipantactivityusercounts.md) object.|
|[Update skypeForBusinessParticipantActivityUserCounts](../api/skypeforbusinessparticipantactivityusercounts-update.md)|[skypeForBusinessParticipantActivityUserCounts](../resources/skypeforbusinessparticipantactivityusercounts.md)|Update the properties of a [skypeForBusinessParticipantActivityUserCounts](../resources/skypeforbusinessparticipantactivityusercounts.md) object.|
|[Delete skypeForBusinessParticipantActivityUserCounts](../api/skypeforbusinessparticipantactivityusercounts-delete.md)|None|Deletes a [skypeForBusinessParticipantActivityUserCounts](../resources/skypeforbusinessparticipantactivityusercounts.md) object.|

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
  "@odata.type": "microsoft.graph.skypeForBusinessParticipantActivityUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessParticipantActivityUserCounts",
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

