---
title: "office365ActiveUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365ActiveUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365ActiveUserCounts](../api/office365activeusercounts-list.md)|[office365ActiveUserCounts](../resources/office365activeusercounts.md) collection|Get a list of the [office365ActiveUserCounts](../resources/office365activeusercounts.md) objects and their properties.|
|[Create office365ActiveUserCounts](../api/office365activeusercounts-create.md)|[office365ActiveUserCounts](../resources/office365activeusercounts.md)|Create a new [office365ActiveUserCounts](../resources/office365activeusercounts.md) object.|
|[Get office365ActiveUserCounts](../api/office365activeusercounts-get.md)|[office365ActiveUserCounts](../resources/office365activeusercounts.md)|Read the properties and relationships of an [office365ActiveUserCounts](../resources/office365activeusercounts.md) object.|
|[Update office365ActiveUserCounts](../api/office365activeusercounts-update.md)|[office365ActiveUserCounts](../resources/office365activeusercounts.md)|Update the properties of an [office365ActiveUserCounts](../resources/office365activeusercounts.md) object.|
|[Delete office365ActiveUserCounts](../api/office365activeusercounts-delete.md)|None|Deletes an [office365ActiveUserCounts](../resources/office365activeusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|exchange|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|office365|Int64|**TODO: Add Description**|
|oneDrive|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharePoint|Int64|**TODO: Add Description**|
|skypeForBusiness|Int64|**TODO: Add Description**|
|teams|Int64|**TODO: Add Description**|
|yammer|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365ActiveUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365ActiveUserCounts",
  "id": "String (identifier)",
  "exchange": "Integer",
  "office365": "Integer",
  "oneDrive": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharePoint": "Integer",
  "skypeForBusiness": "Integer",
  "teams": "Integer",
  "yammer": "Integer"
}
```

