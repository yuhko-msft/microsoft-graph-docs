---
title: "partnerDeviceCompliancePolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# partnerDeviceCompliancePolicy resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List partnerDeviceCompliancePolicies](../api/partnerdevicecompliancepolicy-list.md)|[partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md) collection|Get a list of the [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md) objects and their properties.|
|[Create partnerDeviceCompliancePolicy](../api/partnerdevicecompliancepolicy-create.md)|[partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md)|Create a new [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md) object.|
|[Get partnerDeviceCompliancePolicy](../api/partnerdevicecompliancepolicy-get.md)|[partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md)|Read the properties and relationships of a [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md) object.|
|[Update partnerDeviceCompliancePolicy](../api/partnerdevicecompliancepolicy-update.md)|[partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md)|Update the properties of a [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md) object.|
|[Delete partnerDeviceCompliancePolicy](../api/partnerdevicecompliancepolicy-delete.md)|None|Deletes a [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md) object.|
|[assign](../api/partnerdevicecompliancepolicy-assign.md)|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md) collection|**TODO: Add Description**|
|[scheduleActionsForRules](../api/partnerdevicecompliancepolicy-scheduleactionsforrules.md)|None|**TODO: Add Description**|
|[List assignments](../api/partnerdevicecompliancepolicy-list-assignments.md)|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md) collection|Get the deviceCompliancePolicyAssignment resources from the assignments navigation property.|
|[Create deviceCompliancePolicyAssignment](../api/partnerdevicecompliancepolicy-post-assignments.md)|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md)|Create a new deviceCompliancePolicyAssignment object.|
|[List deviceSettingStateSummaries](../api/partnerdevicecompliancepolicy-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/partnerdevicecompliancepolicy-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/partnerdevicecompliancepolicy-list-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) collection|Get the deviceComplianceDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceComplianceDeviceStatus](../api/partnerdevicecompliancepolicy-post-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md)|Create a new deviceComplianceDeviceStatus object.|
|[List deviceComplianceDeviceOverview](../api/partnerdevicecompliancepolicy-list-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) collection|Get the deviceComplianceDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceComplianceDeviceOverview](../api/partnerdevicecompliancepolicy-post-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md)|Create a new deviceComplianceDeviceOverview object.|
|[List scheduledActionsForRule](../api/partnerdevicecompliancepolicy-list-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md) collection|Get the deviceComplianceScheduledActionForRule resources from the scheduledActionsForRule navigation property.|
|[Create deviceComplianceScheduledActionForRule](../api/partnerdevicecompliancepolicy-post-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md)|Create a new deviceComplianceScheduledActionForRule object.|
|[List userStatuses](../api/partnerdevicecompliancepolicy-list-userstatuses.md)|[deviceComplianceUserStatus](../resources/intune-devicecomplianceuserstatus.md) collection|Get the deviceComplianceUserStatus resources from the userStatuses navigation property.|
|[Create deviceComplianceUserStatus](../api/partnerdevicecompliancepolicy-post-userstatuses.md)|[deviceComplianceUserStatus](../resources/intune-devicecomplianceuserstatus.md)|Create a new deviceComplianceUserStatus object.|
|[List deviceComplianceUserOverview](../api/partnerdevicecompliancepolicy-list-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/intune-devicecomplianceuseroverview.md) collection|Get the deviceComplianceUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceComplianceUserOverview](../api/partnerdevicecompliancepolicy-post-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/intune-devicecomplianceuseroverview.md)|Create a new deviceComplianceUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|partnerAppId|String|**TODO: Add Description**|
|partnerPolicyId|String|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md) collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceStatuses|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceStatusOverview|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md)|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|scheduledActionsForRule|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md) collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|userStatuses|[deviceComplianceUserStatus](../resources/intune-devicecomplianceuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|userStatusOverview|[deviceComplianceUserOverview](../resources/intune-devicecomplianceuseroverview.md)|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.partnerDeviceCompliancePolicy",
  "baseType": "microsoft.graph.deviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.partnerDeviceCompliancePolicy",
  "id": "String (identifier)",
  "roleScopeTagIds": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "version": "Integer",
  "partnerAppId": "String",
  "partnerPolicyId": "String"
}
```

