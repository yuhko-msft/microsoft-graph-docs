---
title: "skypeForBusinessPeerToPeerActivityUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessPeerToPeerActivityUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessPeerToPeerActivityUserCounts](../api/skypeforbusinesspeertopeeractivityusercounts-list.md)|[skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md) collection|Get a list of the [skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md) objects and their properties.|
|[Create skypeForBusinessPeerToPeerActivityUserCounts](../api/skypeforbusinesspeertopeeractivityusercounts-create.md)|[skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md)|Create a new [skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md) object.|
|[Get skypeForBusinessPeerToPeerActivityUserCounts](../api/skypeforbusinesspeertopeeractivityusercounts-get.md)|[skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md)|Read the properties and relationships of a [skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md) object.|
|[Update skypeForBusinessPeerToPeerActivityUserCounts](../api/skypeforbusinesspeertopeeractivityusercounts-update.md)|[skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md)|Update the properties of a [skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md) object.|
|[Delete skypeForBusinessPeerToPeerActivityUserCounts](../api/skypeforbusinesspeertopeeractivityusercounts-delete.md)|None|Deletes a [skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md) object.|

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
  "@odata.type": "microsoft.graph.skypeForBusinessPeerToPeerActivityUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessPeerToPeerActivityUserCounts",
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

