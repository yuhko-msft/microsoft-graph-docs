---
title: "managedDeviceMobileAppConfigurationDeviceStatus resource type"
description: "Contains properties, inherited properties and actions for an MDM mobile app configuration status for a device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDeviceMobileAppConfigurationDeviceStatus resource type

Namespace: microsoft.graph



Contains properties, inherited properties and actions for an MDM mobile app configuration status for a device.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceMobileAppConfigurationDeviceStatus](../api/manageddevicemobileappconfigurationdevicestatus-list.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) collection|Get a list of the [managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) objects and their properties.|
|[Create managedDeviceMobileAppConfigurationDeviceStatus](../api/manageddevicemobileappconfigurationdevicestatus-create.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md)|Create a new [managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) object.|
|[Get managedDeviceMobileAppConfigurationDeviceStatus](../api/manageddevicemobileappconfigurationdevicestatus-get.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md)|Read the properties and relationships of a [managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) object.|
|[Update managedDeviceMobileAppConfigurationDeviceStatus](../api/manageddevicemobileappconfigurationdevicestatus-update.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md)|Update the properties of a [managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) object.|
|[Delete managedDeviceMobileAppConfigurationDeviceStatus](../api/manageddevicemobileappconfigurationdevicestatus-delete.md)|None|Deletes a [managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|The DateTime when device compliance grace period expires|
|deviceDisplayName|String|Device name of the DevicePolicyStatus.|
|deviceModel|String|The device model that is being reported|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report.|
|platform|Int32|Platform of the device that is being reported|
|status|complianceStatus|Compliance status of the policy report. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userName|String|The User Name that is being reported|
|userPrincipalName|String|UserPrincipalName.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationDeviceStatus",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationDeviceStatus",
  "id": "String (identifier)",
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "deviceDisplayName": "String",
  "deviceModel": "String",
  "lastReportedDateTime": "String (timestamp)",
  "platform": "Integer",
  "status": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```

