---
title: "deviceManagementCachedReportConfiguration resource type"
description: "Entity representing the configuration of a cached report"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementCachedReportConfiguration resource type

Namespace: microsoft.graph



Entity representing the configuration of a cached report


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementCachedReportConfigurations](../api/devicemanagementcachedreportconfiguration-list.md)|[deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md) collection|Get a list of the [deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md) objects and their properties.|
|[Create deviceManagementCachedReportConfiguration](../api/devicemanagementcachedreportconfiguration-create.md)|[deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md)|Create a new [deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md) object.|
|[Get deviceManagementCachedReportConfiguration](../api/devicemanagementcachedreportconfiguration-get.md)|[deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md)|Read the properties and relationships of a [deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md) object.|
|[Update deviceManagementCachedReportConfiguration](../api/devicemanagementcachedreportconfiguration-update.md)|[deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md)|Update the properties of a [deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md) object.|
|[Delete deviceManagementCachedReportConfiguration](../api/devicemanagementcachedreportconfiguration-delete.md)|None|Deletes a [deviceManagementCachedReportConfiguration](../resources/devicemanagementcachedreportconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|expirationDateTime|DateTimeOffset|Time that the cached report expires|
|filter|String|Filters applied on report creation.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastRefreshDateTime|DateTimeOffset|Time that the cached report was last refreshed|
|metadata|String|Caller-managed metadata associated with the report|
|orderBy|String collection|Ordering of columns in the report|
|reportName|String|Name of the report|
|select|String collection|Columns selected from the report|
|status|deviceManagementReportStatus|Status of the cached report. Possible values are: `unknown`, `notStarted`, `inProgress`, `completed`, `failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementCachedReportConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementCachedReportConfiguration",
  "id": "String (identifier)",
  "expirationDateTime": "String (timestamp)",
  "filter": "String",
  "lastRefreshDateTime": "String (timestamp)",
  "metadata": "String",
  "orderBy": [
    "String"
  ],
  "reportName": "String",
  "select": [
    "String"
  ],
  "status": "String"
}
```

