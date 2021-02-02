---
title: "partnerAndroidCompliancePolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# partnerAndroidCompliancePolicy resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List partnerAndroidCompliancePolicies](../api/partnerandroidcompliancepolicy-list.md)|[partnerAndroidCompliancePolicy](../resources/partnerandroidcompliancepolicy.md) collection|Get a list of the [partnerAndroidCompliancePolicy](../resources/partnerandroidcompliancepolicy.md) objects and their properties.|
|[Create partnerAndroidCompliancePolicy](../api/partnerandroidcompliancepolicy-create.md)|[partnerAndroidCompliancePolicy](../resources/partnerandroidcompliancepolicy.md)|Create a new [partnerAndroidCompliancePolicy](../resources/partnerandroidcompliancepolicy.md) object.|
|[Get partnerAndroidCompliancePolicy](../api/partnerandroidcompliancepolicy-get.md)|[partnerAndroidCompliancePolicy](../resources/partnerandroidcompliancepolicy.md)|Read the properties and relationships of a [partnerAndroidCompliancePolicy](../resources/partnerandroidcompliancepolicy.md) object.|
|[Update partnerAndroidCompliancePolicy](../api/partnerandroidcompliancepolicy-update.md)|[partnerAndroidCompliancePolicy](../resources/partnerandroidcompliancepolicy.md)|Update the properties of a [partnerAndroidCompliancePolicy](../resources/partnerandroidcompliancepolicy.md) object.|
|[Delete partnerAndroidCompliancePolicy](../api/partnerandroidcompliancepolicy-delete.md)|None|Deletes a [partnerAndroidCompliancePolicy](../resources/partnerandroidcompliancepolicy.md) object.|
|[List assignments](../api/partnerandroidcompliancepolicy-list-assignments.md)|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md) collection|Get the deviceCompliancePolicyAssignment resources from the assignments navigation property.|
|[Create deviceCompliancePolicyAssignment](../api/partnerandroidcompliancepolicy-post-assignments.md)|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md)|Create a new deviceCompliancePolicyAssignment object.|
|[List deviceSettingStateSummaries](../api/partnerandroidcompliancepolicy-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/partnerandroidcompliancepolicy-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/partnerandroidcompliancepolicy-list-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) collection|Get the deviceComplianceDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceComplianceDeviceStatus](../api/partnerandroidcompliancepolicy-post-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md)|Create a new deviceComplianceDeviceStatus object.|
|[List deviceComplianceDeviceOverview](../api/partnerandroidcompliancepolicy-list-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) collection|Get the deviceComplianceDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceComplianceDeviceOverview](../api/partnerandroidcompliancepolicy-post-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md)|Create a new deviceComplianceDeviceOverview object.|
|[List scheduledActionsForRule](../api/partnerandroidcompliancepolicy-list-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md) collection|Get the deviceComplianceScheduledActionForRule resources from the scheduledActionsForRule navigation property.|
|[Create deviceComplianceScheduledActionForRule](../api/partnerandroidcompliancepolicy-post-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md)|Create a new deviceComplianceScheduledActionForRule object.|
|[List userStatuses](../api/partnerandroidcompliancepolicy-list-userstatuses.md)|[deviceComplianceUserStatus](../resources/intune-devicecomplianceuserstatus.md) collection|Get the deviceComplianceUserStatus resources from the userStatuses navigation property.|
|[Create deviceComplianceUserStatus](../api/partnerandroidcompliancepolicy-post-userstatuses.md)|[deviceComplianceUserStatus](../resources/intune-devicecomplianceuserstatus.md)|Create a new deviceComplianceUserStatus object.|
|[List deviceComplianceUserOverview](../api/partnerandroidcompliancepolicy-list-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/intune-devicecomplianceuseroverview.md) collection|Get the deviceComplianceUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceComplianceUserOverview](../api/partnerandroidcompliancepolicy-post-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/intune-devicecomplianceuseroverview.md)|Create a new deviceComplianceUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|partnerAppId|String|**TODO: Add Description** Inherited from [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md)|
|partnerPolicyId|String|**TODO: Add Description** Inherited from [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md)|
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
  "@odata.type": "microsoft.graph.partnerAndroidCompliancePolicy",
  "baseType": "microsoft.graph.partnerDeviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.partnerAndroidCompliancePolicy",
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

