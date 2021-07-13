---
title: "deviceCompliancePolicySettingStateSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceCompliancePolicySettingStateSummary resource type

Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/managedtenants-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceCompliancePolicySettingStateSummaries](../api/managedtenants-devicecompliancepolicysettingstatesummary-list.md)|[microsoft.graph.managedTenants.deviceCompliancePolicySettingStateSummary](../resources/managedtenants-devicecompliancepolicysettingstatesummary.md) collection|Get a list of the [deviceCompliancePolicySettingStateSummary](../resources/managedtenants-devicecompliancepolicysettingstatesummary.md) objects and their properties.|
|[Create deviceCompliancePolicySettingStateSummary](../api/managedtenants-devicecompliancepolicysettingstatesummary-create.md)|[microsoft.graph.managedTenants.deviceCompliancePolicySettingStateSummary](../resources/managedtenants-devicecompliancepolicysettingstatesummary.md)|Create a new [deviceCompliancePolicySettingStateSummary](../resources/managedtenants-devicecompliancepolicysettingstatesummary.md) object.|
|[Get deviceCompliancePolicySettingStateSummary](../api/managedtenants-devicecompliancepolicysettingstatesummary-get.md)|[microsoft.graph.managedTenants.deviceCompliancePolicySettingStateSummary](../resources/managedtenants-devicecompliancepolicysettingstatesummary.md)|Read the properties and relationships of a [deviceCompliancePolicySettingStateSummary](../resources/managedtenants-devicecompliancepolicysettingstatesummary.md) object.|
|[Update deviceCompliancePolicySettingStateSummary](../api/managedtenants-devicecompliancepolicysettingstatesummary-update.md)|[microsoft.graph.managedTenants.deviceCompliancePolicySettingStateSummary](../resources/managedtenants-devicecompliancepolicysettingstatesummary.md)|Update the properties of a [deviceCompliancePolicySettingStateSummary](../resources/managedtenants-devicecompliancepolicysettingstatesummary.md) object.|
|[Delete deviceCompliancePolicySettingStateSummary](../api/managedtenants-devicecompliancepolicysettingstatesummary-delete.md)|None|Deletes a [deviceCompliancePolicySettingStateSummary](../resources/managedtenants-devicecompliancepolicysettingstatesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|conflictDeviceCount|Int32|**TODO: Add Description**|
|errorDeviceCount|Int32|**TODO: Add Description**|
|failedDeviceCount|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/managedtenants-entity.md).|
|intuneAccountId|String|**TODO: Add Description**|
|intuneSettingId|String|**TODO: Add Description**|
|lastRefreshedDateTime|DateTimeOffset|**TODO: Add Description**|
|notApplicableDeviceCount|Int32|**TODO: Add Description**|
|pendingDeviceCount|Int32|**TODO: Add Description**|
|policyType|String|**TODO: Add Description**|
|settingName|String|**TODO: Add Description**|
|succeededDeviceCount|Int32|**TODO: Add Description**|
|tenantDisplayName|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedTenants.deviceCompliancePolicySettingStateSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedTenants.deviceCompliancePolicySettingStateSummary",
  "id": "String (identifier)",
  "conflictDeviceCount": "Integer",
  "errorDeviceCount": "Integer",
  "failedDeviceCount": "Integer",
  "intuneAccountId": "String",
  "intuneSettingId": "String",
  "lastRefreshedDateTime": "String (timestamp)",
  "notApplicableDeviceCount": "Integer",
  "pendingDeviceCount": "Integer",
  "policyType": "String",
  "settingName": "String",
  "succeededDeviceCount": "Integer",
  "tenantDisplayName": "String",
  "tenantId": "String"
}
```

