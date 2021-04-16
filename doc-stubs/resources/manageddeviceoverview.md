---
title: "managedDeviceOverview resource type"
description: "Summary data for managed devices"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDeviceOverview resource type

Namespace: microsoft.graph



Summary data for managed devices


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceOverviews](../api/manageddeviceoverview-list.md)|[managedDeviceOverview](../resources/manageddeviceoverview.md) collection|Get a list of the [managedDeviceOverview](../resources/manageddeviceoverview.md) objects and their properties.|
|[Create managedDeviceOverview](../api/manageddeviceoverview-create.md)|[managedDeviceOverview](../resources/manageddeviceoverview.md)|Create a new [managedDeviceOverview](../resources/manageddeviceoverview.md) object.|
|[Get managedDeviceOverview](../api/manageddeviceoverview-get.md)|[managedDeviceOverview](../resources/manageddeviceoverview.md)|Read the properties and relationships of a [managedDeviceOverview](../resources/manageddeviceoverview.md) object.|
|[Update managedDeviceOverview](../api/manageddeviceoverview-update.md)|[managedDeviceOverview](../resources/manageddeviceoverview.md)|Update the properties of a [managedDeviceOverview](../resources/manageddeviceoverview.md) object.|
|[Delete managedDeviceOverview](../api/manageddeviceoverview-delete.md)|None|Deletes a [managedDeviceOverview](../resources/manageddeviceoverview.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceExchangeAccessStateSummary|[deviceExchangeAccessStateSummary](../resources/deviceexchangeaccessstatesummary.md)|Distribution of Exchange Access State in Intune|
|deviceOperatingSystemSummary|[deviceOperatingSystemSummary](../resources/deviceoperatingsystemsummary.md)|Device operating system summary.|
|dualEnrolledDeviceCount|Int32|The number of devices enrolled in both MDM and EAS|
|enrolledDeviceCount|Int32|Total enrolled device count. Does not include PC devices managed via Intune PC Agent|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified date time of device overview|
|managedDeviceModelsAndManufacturers|[managedDeviceModelsAndManufacturers](../resources/manageddevicemodelsandmanufacturers.md)|Models and Manufactures meatadata for managed devices in the account|
|mdmEnrolledCount|Int32|The number of devices enrolled in MDM|

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
  "deviceExchangeAccessStateSummary": {
    "@odata.type": "microsoft.graph.deviceExchangeAccessStateSummary"
  },
  "deviceOperatingSystemSummary": {
    "@odata.type": "microsoft.graph.deviceOperatingSystemSummary"
  },
  "dualEnrolledDeviceCount": "Integer",
  "enrolledDeviceCount": "Integer",
  "lastModifiedDateTime": "String (timestamp)",
  "managedDeviceModelsAndManufacturers": {
    "@odata.type": "microsoft.graph.managedDeviceModelsAndManufacturers"
  },
  "mdmEnrolledCount": "Integer"
}
```

