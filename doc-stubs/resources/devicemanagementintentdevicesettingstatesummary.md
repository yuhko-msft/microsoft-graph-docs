---
title: "deviceManagementIntentDeviceSettingStateSummary resource type"
description: "Entity that represents device setting state summary for an intent"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementIntentDeviceSettingStateSummary resource type

Namespace: microsoft.graph



Entity that represents device setting state summary for an intent


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementIntentDeviceSettingStateSummaries](../api/devicemanagementintentdevicesettingstatesummary-list.md)|[deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md) collection|Get a list of the [deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md) objects and their properties.|
|[Create deviceManagementIntentDeviceSettingStateSummary](../api/devicemanagementintentdevicesettingstatesummary-create.md)|[deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md)|Create a new [deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md) object.|
|[Get deviceManagementIntentDeviceSettingStateSummary](../api/devicemanagementintentdevicesettingstatesummary-get.md)|[deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md)|Read the properties and relationships of a [deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md) object.|
|[Update deviceManagementIntentDeviceSettingStateSummary](../api/devicemanagementintentdevicesettingstatesummary-update.md)|[deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md)|Update the properties of a [deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md) object.|
|[Delete deviceManagementIntentDeviceSettingStateSummary](../api/devicemanagementintentdevicesettingstatesummary-delete.md)|None|Deletes a [deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|compliantCount|Int32|Number of compliant devices|
|conflictCount|Int32|Number of devices in conflict|
|errorCount|Int32|Number of error devices|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|nonCompliantCount|Int32|Number of non compliant devices|
|notApplicableCount|Int32|Number of not applicable devices|
|remediatedCount|Int32|Number of remediated devices|
|settingName|String|Name of a setting|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementIntentDeviceSettingStateSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementIntentDeviceSettingStateSummary",
  "id": "String (identifier)",
  "compliantCount": "Integer",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "nonCompliantCount": "Integer",
  "notApplicableCount": "Integer",
  "remediatedCount": "Integer",
  "settingName": "String"
}
```

