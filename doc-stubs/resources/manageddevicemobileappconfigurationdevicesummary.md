---
title: "managedDeviceMobileAppConfigurationDeviceSummary resource type"
description: "Contains properties, inherited properties and actions for an MDM mobile app configuration device status summary."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDeviceMobileAppConfigurationDeviceSummary resource type

Namespace: microsoft.graph



Contains properties, inherited properties and actions for an MDM mobile app configuration device status summary.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceMobileAppConfigurationDeviceSummaries](../api/manageddevicemobileappconfigurationdevicesummary-list.md)|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) collection|Get a list of the [managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) objects and their properties.|
|[Create managedDeviceMobileAppConfigurationDeviceSummary](../api/manageddevicemobileappconfigurationdevicesummary-create.md)|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md)|Create a new [managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) object.|
|[Get managedDeviceMobileAppConfigurationDeviceSummary](../api/manageddevicemobileappconfigurationdevicesummary-get.md)|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md)|Read the properties and relationships of a [managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) object.|
|[Update managedDeviceMobileAppConfigurationDeviceSummary](../api/manageddevicemobileappconfigurationdevicesummary-update.md)|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md)|Update the properties of a [managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) object.|
|[Delete managedDeviceMobileAppConfigurationDeviceSummary](../api/manageddevicemobileappconfigurationdevicesummary-delete.md)|None|Deletes a [managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) object.|

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
  "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationDeviceSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationDeviceSummary",
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

