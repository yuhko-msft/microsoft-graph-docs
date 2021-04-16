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
|[List deviceComplianceDeviceOverviews](../api/devicecompliancedeviceoverview-list.md)|[deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md) collection|Get a list of the [deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md) objects and their properties.|
|[Create deviceComplianceDeviceOverview](../api/devicecompliancedeviceoverview-create.md)|[deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md)|Create a new [deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md) object.|
|[Get deviceComplianceDeviceOverview](../api/devicecompliancedeviceoverview-get.md)|[deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md)|Read the properties and relationships of a [deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md) object.|
|[Update deviceComplianceDeviceOverview](../api/devicecompliancedeviceoverview-update.md)|[deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md)|Update the properties of a [deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md) object.|
|[Delete deviceComplianceDeviceOverview](../api/devicecompliancedeviceoverview-delete.md)|None|Deletes a [deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurationVersion|Int32|Version of the policy for that overview|
|conflictCount|Int32|Number of devices in conflict|
|errorCount|Int32|Number of error devices|
|failedCount|Int32|Number of failed devices|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdateDateTime|DateTimeOffset|Last update time|
|notApplicableCount|Int32|Number of not applicable devices|
|notApplicablePlatformCount|Int32|Number of not applicable devices due to mismatch platform and policy|
|pendingCount|Int32|Number of pending devices|
|successCount|Int32|Number of succeeded devices|

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
  "configurationVersion": "Integer",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "pendingCount": "Integer",
  "successCount": "Integer"
}
```

