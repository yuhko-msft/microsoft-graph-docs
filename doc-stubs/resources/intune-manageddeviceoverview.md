---
title: "managedDeviceOverview resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDeviceOverview resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceOverviews](../api/intune-manageddeviceoverview-list.md)|[managedDeviceOverview](../resources/intune-manageddeviceoverview.md) collection|Get a list of the [managedDeviceOverview](../resources/manageddeviceoverview.md) objects and their properties.|
|[Create managedDeviceOverview](../api/intune-manageddeviceoverview-create.md)|[managedDeviceOverview](../resources/intune-manageddeviceoverview.md)|Create a new [managedDeviceOverview](../resources/intune-manageddeviceoverview.md) object.|
|[Get managedDeviceOverview](../api/intune-manageddeviceoverview-get.md)|[managedDeviceOverview](../resources/intune-manageddeviceoverview.md)|Read the properties and relationships of a [managedDeviceOverview](../resources/intune-manageddeviceoverview.md) object.|
|[Update managedDeviceOverview](../api/intune-manageddeviceoverview-update.md)|[managedDeviceOverview](../resources/intune-manageddeviceoverview.md)|Update the properties of a [managedDeviceOverview](../resources/intune-manageddeviceoverview.md) object.|
|[Delete managedDeviceOverview](../api/intune-manageddeviceoverview-delete.md)|None|Deletes a [managedDeviceOverview](../resources/intune-manageddeviceoverview.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceExchangeAccessStateSummary|[deviceExchangeAccessStateSummary](../resources/intune-deviceexchangeaccessstatesummary.md)|**TODO: Add Description**|
|deviceOperatingSystemSummary|[deviceOperatingSystemSummary](../resources/intune-deviceoperatingsystemsummary.md)|**TODO: Add Description**|
|dualEnrolledDeviceCount|Int32|**TODO: Add Description**|
|enrolledDeviceCount|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|managedDeviceModelsAndManufacturers|[managedDeviceModelsAndManufacturers](../resources/intune-manageddevicemodelsandmanufacturers.md)|**TODO: Add Description**|
|mdmEnrolledCount|Int32|**TODO: Add Description**|
|partnerManagedDeviceSummary|[partnerManagedDeviceSummary](../resources/intune-partnermanageddevicesummary.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedDeviceOverview",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedDeviceOverview",
  "id": "String (identifier)",
  "enrolledDeviceCount": "Integer",
  "mdmEnrolledCount": "Integer",
  "dualEnrolledDeviceCount": "Integer",
  "deviceOperatingSystemSummary": {
    "@odata.type": "microsoft.graph.deviceOperatingSystemSummary"
  },
  "deviceExchangeAccessStateSummary": {
    "@odata.type": "microsoft.graph.deviceExchangeAccessStateSummary"
  },
  "managedDeviceModelsAndManufacturers": {
    "@odata.type": "microsoft.graph.managedDeviceModelsAndManufacturers"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "partnerManagedDeviceSummary": {
    "@odata.type": "microsoft.graph.partnerManagedDeviceSummary"
  }
}
```

