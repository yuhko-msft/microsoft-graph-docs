---
title: "office365ServicesUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365ServicesUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365ServicesUserCounts](../api/office365servicesusercounts-list.md)|[office365ServicesUserCounts](../resources/office365servicesusercounts.md) collection|Get a list of the [office365ServicesUserCounts](../resources/office365servicesusercounts.md) objects and their properties.|
|[Create office365ServicesUserCounts](../api/office365servicesusercounts-create.md)|[office365ServicesUserCounts](../resources/office365servicesusercounts.md)|Create a new [office365ServicesUserCounts](../resources/office365servicesusercounts.md) object.|
|[Get office365ServicesUserCounts](../api/office365servicesusercounts-get.md)|[office365ServicesUserCounts](../resources/office365servicesusercounts.md)|Read the properties and relationships of an [office365ServicesUserCounts](../resources/office365servicesusercounts.md) object.|
|[Update office365ServicesUserCounts](../api/office365servicesusercounts-update.md)|[office365ServicesUserCounts](../resources/office365servicesusercounts.md)|Update the properties of an [office365ServicesUserCounts](../resources/office365servicesusercounts.md) object.|
|[Delete office365ServicesUserCounts](../api/office365servicesusercounts-delete.md)|None|Deletes an [office365ServicesUserCounts](../resources/office365servicesusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|exchangeActive|Int64|**TODO: Add Description**|
|exchangeInactive|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|office365Active|Int64|**TODO: Add Description**|
|office365Inactive|Int64|**TODO: Add Description**|
|oneDriveActive|Int64|**TODO: Add Description**|
|oneDriveInactive|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharePointActive|Int64|**TODO: Add Description**|
|sharePointInactive|Int64|**TODO: Add Description**|
|skypeForBusinessActive|Int64|**TODO: Add Description**|
|skypeForBusinessInactive|Int64|**TODO: Add Description**|
|teamsActive|Int64|**TODO: Add Description**|
|teamsInactive|Int64|**TODO: Add Description**|
|yammerActive|Int64|**TODO: Add Description**|
|yammerInactive|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365ServicesUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365ServicesUserCounts",
  "id": "String (identifier)",
  "exchangeActive": "Integer",
  "exchangeInactive": "Integer",
  "office365Active": "Integer",
  "office365Inactive": "Integer",
  "oneDriveActive": "Integer",
  "oneDriveInactive": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharePointActive": "Integer",
  "sharePointInactive": "Integer",
  "skypeForBusinessActive": "Integer",
  "skypeForBusinessInactive": "Integer",
  "teamsActive": "Integer",
  "teamsInactive": "Integer",
  "yammerActive": "Integer",
  "yammerInactive": "Integer"
}
```

