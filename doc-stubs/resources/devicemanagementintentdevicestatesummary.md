---
title: "deviceManagementIntentDeviceStateSummary resource type"
description: "Entity that represents device state summary for an intent"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementIntentDeviceStateSummary resource type

Namespace: microsoft.graph



Entity that represents device state summary for an intent


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementIntentDeviceStateSummaries](../api/devicemanagementintentdevicestatesummary-list.md)|[deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md) collection|Get a list of the [deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md) objects and their properties.|
|[Create deviceManagementIntentDeviceStateSummary](../api/devicemanagementintentdevicestatesummary-create.md)|[deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md)|Create a new [deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md) object.|
|[Get deviceManagementIntentDeviceStateSummary](../api/devicemanagementintentdevicestatesummary-get.md)|[deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md)|Read the properties and relationships of a [deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md) object.|
|[Update deviceManagementIntentDeviceStateSummary](../api/devicemanagementintentdevicestatesummary-update.md)|[deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md)|Update the properties of a [deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md) object.|
|[Delete deviceManagementIntentDeviceStateSummary](../api/devicemanagementintentdevicestatesummary-delete.md)|None|Deletes a [deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|conflictCount|Int32|Number of devices in conflict|
|errorCount|Int32|Number of error devices|
|failedCount|Int32|Number of failed devices|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|notApplicableCount|Int32|Number of not applicable devices|
|notApplicablePlatformCount|Int32|Number of not applicable devices due to mismatch platform and policy|
|successCount|Int32|Number of succeeded devices|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementIntentDeviceStateSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementIntentDeviceStateSummary",
  "id": "String (identifier)",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "notApplicableCount": "Integer",
  "notApplicablePlatformCount": "Integer",
  "successCount": "Integer"
}
```

