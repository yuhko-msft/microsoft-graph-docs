---
title: "iosMobileAppConfiguration resource type"
description: "Contains properties, inherited properties and actions for iOS mobile app configurations."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosMobileAppConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains properties, inherited properties and actions for iOS mobile app configurations.


Inherits from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosMobileAppConfigurations](../api/iosmobileappconfiguration-list.md)|[iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md) collection|Get a list of the [iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md) objects and their properties.|
|[Create iosMobileAppConfiguration](../api/iosmobileappconfiguration-create.md)|[iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md)|Create a new [iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md) object.|
|[Get iosMobileAppConfiguration](../api/iosmobileappconfiguration-get.md)|[iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md)|Read the properties and relationships of an [iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md) object.|
|[Update iosMobileAppConfiguration](../api/iosmobileappconfiguration-update.md)|[iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md)|Update the properties of an [iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md) object.|
|[Delete iosMobileAppConfiguration](../api/iosmobileappconfiguration-delete.md)|None|Deletes an [iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md) object.|
|[assign](../api/iosmobileappconfiguration-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/iosmobileappconfiguration-list-assignments.md)|[managedDeviceMobileAppConfigurationAssignment](../resources/manageddevicemobileappconfigurationassignment.md) collection|Get the managedDeviceMobileAppConfigurationAssignment resources from the assignments navigation property.|
|[Create managedDeviceMobileAppConfigurationAssignment](../api/iosmobileappconfiguration-post-assignments.md)|[managedDeviceMobileAppConfigurationAssignment](../resources/manageddevicemobileappconfigurationassignment.md)|Create a new managedDeviceMobileAppConfigurationAssignment object.|
|[List deviceStatuses](../api/iosmobileappconfiguration-list-devicestatuses.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) collection|Get the managedDeviceMobileAppConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create managedDeviceMobileAppConfigurationDeviceStatus](../api/iosmobileappconfiguration-post-devicestatuses.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md)|Create a new managedDeviceMobileAppConfigurationDeviceStatus object.|
|[List managedDeviceMobileAppConfigurationDeviceSummary](../api/iosmobileappconfiguration-list-devicestatussummary.md)|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) collection|Get the managedDeviceMobileAppConfigurationDeviceSummary resources from the deviceStatusSummary navigation property.|
|[Create managedDeviceMobileAppConfigurationDeviceSummary](../api/iosmobileappconfiguration-post-devicestatussummary.md)|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md)|Create a new managedDeviceMobileAppConfigurationDeviceSummary object.|
|[List userStatuses](../api/iosmobileappconfiguration-list-userstatuses.md)|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md) collection|Get the managedDeviceMobileAppConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create managedDeviceMobileAppConfigurationUserStatus](../api/iosmobileappconfiguration-post-userstatuses.md)|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md)|Create a new managedDeviceMobileAppConfigurationUserStatus object.|
|[List managedDeviceMobileAppConfigurationUserSummary](../api/iosmobileappconfiguration-list-userstatussummary.md)|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) collection|Get the managedDeviceMobileAppConfigurationUserSummary resources from the userStatusSummary navigation property.|
|[Create managedDeviceMobileAppConfigurationUserSummary](../api/iosmobileappconfiguration-post-userstatussummary.md)|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md)|Create a new managedDeviceMobileAppConfigurationUserSummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md).|
|description|String|Admin provided description of the Device Configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md).|
|displayName|String|Admin provided name of the device configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md).|
|encodedSettingXml|Binary|mdm app configuration Base64 binary.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md).|
|roleScopeTagIds|String collection|List of Scope Tags for this App configuration entity. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md).|
|settings|[appConfigurationSettingItem](../resources/appconfigurationsettingitem.md) collection|app configuration setting items.|
|targetedMobileApps|String collection|the associated app. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md).|
|version|Int32|Version of the device configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[managedDeviceMobileAppConfigurationAssignment](../resources/manageddevicemobileappconfigurationassignment.md) collection|The list of group assignemenets for app configration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|deviceStatuses|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) collection|List of ManagedDeviceMobileAppConfigurationDeviceStatus. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|deviceStatusSummary|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md)|App configuration device status summary. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|userStatuses|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md) collection|List of ManagedDeviceMobileAppConfigurationUserStatus. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|userStatusSummary|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md)|App configuration user status summary. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosMobileAppConfiguration",
  "baseType": "microsoft.graph.managedDeviceMobileAppConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosMobileAppConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "targetedMobileApps": [
    "String"
  ],
  "version": "Integer",
  "encodedSettingXml": "Binary",
  "settings": [
    {
      "@odata.type": "microsoft.graph.appConfigurationSettingItem"
    }
  ]
}
```

