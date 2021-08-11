---
title: "deviceManagementReports resource type"
description: "Singleton entity that acts as a container for all reports functionality."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementReports resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Singleton entity that acts as a container for all reports functionality.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementReports](../api/devicemanagementreports-list.md)|[deviceManagementReports](../resources/devicemanagementreports.md) collection|Get a list of the [deviceManagementReports](../resources/devicemanagementreports.md) objects and their properties.|
|[Create deviceManagementReports](../api/devicemanagementreports-create.md)|[deviceManagementReports](../resources/devicemanagementreports.md)|Create a new [deviceManagementReports](../resources/devicemanagementreports.md) object.|
|[Get deviceManagementReports](../api/devicemanagementreports-get.md)|[deviceManagementReports](../resources/devicemanagementreports.md)|Read the properties and relationships of a [deviceManagementReports](../resources/devicemanagementreports.md) object.|
|[Update deviceManagementReports](../api/devicemanagementreports-update.md)|[deviceManagementReports](../resources/devicemanagementreports.md)|Update the properties of a [deviceManagementReports](../resources/devicemanagementreports.md) object.|
|[Delete deviceManagementReports](../api/devicemanagementreports-delete.md)|None|Deletes a [deviceManagementReports](../resources/devicemanagementreports.md) object.|
|[getActiveMalwareReport](../api/devicemanagementreports-getactivemalwarereport.md)|Stream|**TODO: Add Description**|
|[getUnhealthyDefenderAgentsReport](../api/devicemanagementreports-getunhealthydefenderagentsreport.md)|Stream|**TODO: Add Description**|
|[getMalwareSummaryReport](../api/devicemanagementreports-getmalwaresummaryreport.md)|Stream|**TODO: Add Description**|
|[getActiveMalwareSummaryReport](../api/devicemanagementreports-getactivemalwaresummaryreport.md)|Stream|**TODO: Add Description**|
|[getUnhealthyFirewallSummaryReport](../api/devicemanagementreports-getunhealthyfirewallsummaryreport.md)|Stream|**TODO: Add Description**|
|[getUnhealthyFirewallReport](../api/devicemanagementreports-getunhealthyfirewallreport.md)|Stream|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|Unique identifier for this entity|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementReports",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementReports",
  "id": "String (identifier)"
}
```

