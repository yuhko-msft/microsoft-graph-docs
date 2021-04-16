---
title: "skypeForBusinessPeerToPeerActivityMinuteCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessPeerToPeerActivityMinuteCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessPeerToPeerActivityMinuteCounts](../api/skypeforbusinesspeertopeeractivityminutecounts-list.md)|[skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md) collection|Get a list of the [skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md) objects and their properties.|
|[Create skypeForBusinessPeerToPeerActivityMinuteCounts](../api/skypeforbusinesspeertopeeractivityminutecounts-create.md)|[skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md)|Create a new [skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md) object.|
|[Get skypeForBusinessPeerToPeerActivityMinuteCounts](../api/skypeforbusinesspeertopeeractivityminutecounts-get.md)|[skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md)|Read the properties and relationships of a [skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md) object.|
|[Update skypeForBusinessPeerToPeerActivityMinuteCounts](../api/skypeforbusinesspeertopeeractivityminutecounts-update.md)|[skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md)|Update the properties of a [skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md) object.|
|[Delete skypeForBusinessPeerToPeerActivityMinuteCounts](../api/skypeforbusinesspeertopeeractivityminutecounts-delete.md)|None|Deletes a [skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|audio|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|video|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.skypeForBusinessPeerToPeerActivityMinuteCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessPeerToPeerActivityMinuteCounts",
  "id": "String (identifier)",
  "audio": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "video": "Integer"
}
```

