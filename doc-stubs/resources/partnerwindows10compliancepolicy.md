---
title: "partnerWindows10CompliancePolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# partnerWindows10CompliancePolicy resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [partnerDeviceCompliancePolicy](../resources/partnerdevicecompliancepolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List partnerWindows10CompliancePolicy](../api/partnerwindows10compliancepolicy-list.md)|[partnerWindows10CompliancePolicy](../resources/partnerwindows10compliancepolicy.md) collection|Get a list of the [partnerWindows10CompliancePolicy](../resources/partnerwindows10compliancepolicy.md) objects and their properties.|
|[Create partnerWindows10CompliancePolicy](../api/partnerwindows10compliancepolicy-create.md)|[partnerWindows10CompliancePolicy](../resources/partnerwindows10compliancepolicy.md)|Create a new [partnerWindows10CompliancePolicy](../resources/partnerwindows10compliancepolicy.md) object.|
|[Get partnerWindows10CompliancePolicy](../api/partnerwindows10compliancepolicy-get.md)|[partnerWindows10CompliancePolicy](../resources/partnerwindows10compliancepolicy.md)|Read the properties and relationships of a [partnerWindows10CompliancePolicy](../resources/partnerwindows10compliancepolicy.md) object.|
|[Update partnerWindows10CompliancePolicy](../api/partnerwindows10compliancepolicy-update.md)|[partnerWindows10CompliancePolicy](../resources/partnerwindows10compliancepolicy.md)|Update the properties of a [partnerWindows10CompliancePolicy](../resources/partnerwindows10compliancepolicy.md) object.|
|[Delete partnerWindows10CompliancePolicy](../api/partnerwindows10compliancepolicy-delete.md)|None|Deletes a [partnerWindows10CompliancePolicy](../resources/partnerwindows10compliancepolicy.md) object.|
|[List assignments](../api/partnerwindows10compliancepolicy-list-assignments.md)|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md) collection|Get the deviceCompliancePolicyAssignment resources from the assignments navigation property.|
|[Create deviceCompliancePolicyAssignment](../api/partnerwindows10compliancepolicy-post-assignments.md)|[deviceCompliancePolicyAssignment](../resources/intune-devicecompliancepolicyassignment.md)|Create a new deviceCompliancePolicyAssignment object.|
|[List deviceSettingStateSummaries](../api/partnerwindows10compliancepolicy-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/partnerwindows10compliancepolicy-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/partnerwindows10compliancepolicy-list-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md) collection|Get the deviceComplianceDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceComplianceDeviceStatus](../api/partnerwindows10compliancepolicy-post-devicestatuses.md)|[deviceComplianceDeviceStatus](../resources/intune-devicecompliancedevicestatus.md)|Create a new deviceComplianceDeviceStatus object.|
|[List deviceComplianceDeviceOverview](../api/partnerwindows10compliancepolicy-list-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md) collection|Get the deviceComplianceDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceComplianceDeviceOverview](../api/partnerwindows10compliancepolicy-post-devicestatusoverview.md)|[deviceComplianceDeviceOverview](../resources/intune-devicecompliancedeviceoverview.md)|Create a new deviceComplianceDeviceOverview object.|
|[List scheduledActionsForRule](../api/partnerwindows10compliancepolicy-list-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md) collection|Get the deviceComplianceScheduledActionForRule resources from the scheduledActionsForRule navigation property.|
|[Create deviceComplianceScheduledActionForRule](../api/partnerwindows10compliancepolicy-post-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md)|Create a new deviceComplianceScheduledActionForRule object.|
|[List userStatuses](../api/partnerwindows10compliancepolicy-list-userstatuses.md)|[deviceComplianceUserStatus](../resources/intune-devicecomplianceuserstatus.md) collection|Get the deviceComplianceUserStatus resources from the userStatuses navigation property.|
|[Create deviceComplianceUserStatus](../api/partnerwindows10compliancepolicy-post-userstatuses.md)|[deviceComplianceUserStatus](../resources/intune-devicecomplianceuserstatus.md)|Create a new deviceComplianceUserStatus object.|
|[List deviceComplianceUserOverview](../api/partnerwindows10compliancepolicy-list-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/intune-devicecomplianceuseroverview.md) collection|Get the deviceComplianceUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceComplianceUserOverview](../api/partnerwindows10compliancepolicy-post-userstatusoverview.md)|[deviceComplianceUserOverview](../resources/intune-devicecomplianceuseroverview.md)|Create a new deviceComplianceUserOverview object.|

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
  "@odata.type": "microsoft.graph.partnerWindows10CompliancePolicy",
  "baseType": "microsoft.graph.partnerDeviceCompliancePolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.partnerWindows10CompliancePolicy",
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

