---
title: "skypeForBusinessPeerToPeerActivityCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessPeerToPeerActivityCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessPeerToPeerActivityCounts](../api/skypeforbusinesspeertopeeractivitycounts-list.md)|[skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md) collection|Get a list of the [skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md) objects and their properties.|
|[Create skypeForBusinessPeerToPeerActivityCounts](../api/skypeforbusinesspeertopeeractivitycounts-create.md)|[skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md)|Create a new [skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md) object.|
|[Get skypeForBusinessPeerToPeerActivityCounts](../api/skypeforbusinesspeertopeeractivitycounts-get.md)|[skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md)|Read the properties and relationships of a [skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md) object.|
|[Update skypeForBusinessPeerToPeerActivityCounts](../api/skypeforbusinesspeertopeeractivitycounts-update.md)|[skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md)|Update the properties of a [skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md) object.|
|[Delete skypeForBusinessPeerToPeerActivityCounts](../api/skypeforbusinesspeertopeeractivitycounts-delete.md)|None|Deletes a [skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appSharing|Int64|**TODO: Add Description**|
|audio|Int64|**TODO: Add Description**|
|fileTransfer|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|im|Int64|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.skypeForBusinessPeerToPeerActivityCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessPeerToPeerActivityCounts",
  "id": "String (identifier)",
  "appSharing": "Integer",
  "audio": "Integer",
  "fileTransfer": "Integer",
  "im": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "video": "Integer"
}
```

