---
title: "deviceCompliancePolicy resource type"
description: "This is the base class for Compliance policy. Compliance policies are platform specific and individual per-platform compliance policies inherit from here. "
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceCompliancePolicy resource type

Namespace: microsoft.graph



This is the base class for Compliance policy. Compliance policies are platform specific and individual per-platform compliance policies inherit from here. 


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceCompliancePolicies](../api/devicecompliancepolicy-list.md)|[deviceCompliancePolicy](../resources/devicecompliancepolicy.md) collection|Get a list of the [deviceCompliancePolicy](../resources/devicecompliancepolicy.md) objects and their properties.|
|[Create deviceCompliancePolicy](../api/devicecompliancepolicy-create.md)|[deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|Create a new [deviceCompliancePolicy](../resources/devicecompliancepolicy.md) object.|
|[Get deviceCompliancePolicy](../api/devicecompliancepolicy-get.md)|[deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|Read the properties and relationships of a [deviceCompliancePolicy](../resources/devicecompliancepolicy.md) object.|
|[Update deviceCompliancePolicy](../api/devicecompliancepolicy-update.md)|[deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|Update the properties of a [deviceCompliancePolicy](../resources/devicecompliancepolicy.md) object.|
|[Delete deviceCompliancePolicy](../api/devicecompliancepolicy-delete.md)|None|Deletes a [deviceCompliancePolicy](../resources/devicecompliancepolicy.md) object.|
|[getDevicesScheduledToRetire](../api/devicecompliancepolicy-getdevicesscheduledtoretire.md)|[retireScheduledManagedDevice](../resources/retirescheduledmanageddevice.md) collection|**TODO: Add Description**|
|[hasPayloadLinks](../api/devicecompliancepolicy-haspayloadlinks.md)|[hasPayloadLinkResultItem](../resources/haspayloadlinkresultitem.md) collection|**TODO: Add Description**|
|[refreshDeviceComplianceReportSummarization](../api/devicecompliancepolicy-refreshdevicecompliancereportsummarization.md)|None|**TODO: Add Description**|
|[setScheduledRetireState](../api/devicecompliancepolicy-setscheduledretirestate.md)|None|**TODO: Add Description**|
|[validateComplianceScript](../api/devicecompliancepolicy-validatecompliancescript.md)|[deviceComplianceScriptValidationResult](../resources/devicecompliancescriptvalidationresult.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created.|
|description|String|Admin provided description of the Device Configuration.|
|displayName|String|Admin provided name of the device configuration.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|version|Int32|Version of the device configuration.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) collection|The collection of assignments for this compliance policy.|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Compliance Setting State Device Summary|
|deviceStatuses|[deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) collection|List of DeviceComplianceDeviceStatus.|
|deviceStatusOverview|[deviceComplianceDeviceOverview](../resources/devicecompliancedeviceoverview.md)|Device compliance devices status overview|
|scheduledActionsForRule|[deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md) collection|The list of scheduled action for this rule|
|userStatuses|[deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) collection|List of DeviceComplianceUserStatus.|
|userStatusOverview|[deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md)|Device compliance users status overview|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceCompliancePolicy",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicy",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
}
```

