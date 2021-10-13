---
title: "deviceManagementReports resource type"
description: "Singleton entity that acts as a container for all reports functionality."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementReports resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Singleton entity that acts as a container for all reports functionality.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementReports](../api/devicemanagementreports-list.md)|[deviceManagementReports](../resources/devicemanagementreports.md) collection|Get a list of the [deviceManagementReports](../resources/devicemanagementreports.md) objects and their properties.|
|[Create deviceManagementReports](../api/devicemanagement-post-reports.md)|[deviceManagementReports](../resources/devicemanagementreports.md)|Create a new [deviceManagementReports](../resources/devicemanagementreports.md) object.|
|[Get deviceManagementReports](../api/devicemanagementreports-get.md)|[deviceManagementReports](../resources/devicemanagementreports.md)|Read the properties and relationships of a [deviceManagementReports](../resources/devicemanagementreports.md) object.|
|[Update deviceManagementReports](../api/devicemanagementreports-update.md)|[deviceManagementReports](../resources/devicemanagementreports.md)|Update the properties of a [deviceManagementReports](../resources/devicemanagementreports.md) object.|
|[Delete deviceManagementReports](../api/devicemanagementreports-delete.md)|None|Deletes a [deviceManagementReports](../resources/devicemanagementreports.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|cachedReportConfigurations|[deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md) collection|Entity representing the configuration of a cached report|
|exportJobs|[deviceManagementExportJob](../resources/devicemanagementexportjob.md) collection|Entity representing a job to export a report|
|reportSchedules|[deviceManagementReportSchedule](../resources/devicemanagementreportschedule.md) collection|Entity representing a schedule for which reports are delivered|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementReports",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementReports",
  "id": "String (identifier)"
}
```

