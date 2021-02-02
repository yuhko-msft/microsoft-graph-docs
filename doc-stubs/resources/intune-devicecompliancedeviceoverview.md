---
title: "deviceComplianceDeviceOverview resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceDeviceOverview resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceComplianceDeviceOverviews](../api/intune-devicecompliancedeviceoverview-list.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) collection|Get a list of the [deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md) objects and their properties.|
|[Create deviceComplianceDeviceOverview](../api/intune-devicecompliancedeviceoverview-create.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md)|Create a new [deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) object.|
|[Get deviceComplianceDeviceOverview](../api/intune-devicecompliancedeviceoverview-get.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md)|Read the properties and relationships of a [deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) object.|
|[Update deviceComplianceDeviceOverview](../api/intune-devicecompliancedeviceoverview-update.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md)|Update the properties of a [deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) object.|
|[Delete deviceComplianceDeviceOverview](../api/intune-devicecompliancedeviceoverview-delete.md)|None|Deletes a [deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurationVersion|Int32|**TODO: Add Description**|
|conflictCount|Int32|**TODO: Add Description**|
|errorCount|Int32|**TODO: Add Description**|
|failedCount|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdateDateTime|DateTimeOffset|**TODO: Add Description**|
|notApplicableCount|Int32|**TODO: Add Description**|
|notApplicablePlatformCount|Int32|**TODO: Add Description**|
|pendingCount|Int32|**TODO: Add Description**|
|retireScheduledCount|Int32|**TODO: Add Description**|
|successCount|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceComplianceDeviceOverview",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceDeviceOverview",
  "id": "String (identifier)",
  "retireScheduledCount": "Integer",
  "pendingCount": "Integer",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "successCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "conflictCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "configurationVersion": "Integer"
}
```

