---
title: "managedDeviceMobileAppConfiguration resource type"
description: "An abstract class for Mobile app configuration for enrolled devices."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDeviceMobileAppConfiguration resource type

Namespace: microsoft.graph



An abstract class for Mobile app configuration for enrolled devices.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceMobileAppConfigurations](../api/manageddevicemobileappconfiguration-list.md)|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) collection|Get a list of the [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) objects and their properties.|
|[Create managedDeviceMobileAppConfiguration](../api/manageddevicemobileappconfiguration-create.md)|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|Create a new [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) object.|
|[Get managedDeviceMobileAppConfiguration](../api/manageddevicemobileappconfiguration-get.md)|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|Read the properties and relationships of a [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) object.|
|[Update managedDeviceMobileAppConfiguration](../api/manageddevicemobileappconfiguration-update.md)|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|Update the properties of a [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) object.|
|[Delete managedDeviceMobileAppConfiguration](../api/manageddevicemobileappconfiguration-delete.md)|None|Deletes a [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created.|
|description|String|Admin provided description of the Device Configuration.|
|displayName|String|Admin provided name of the device configuration.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this App configuration entity.|
|targetedMobileApps|String collection|the associated app.|
|version|Int32|Version of the device configuration.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[managedDeviceMobileAppConfigurationAssignment](../resources/manageddevicemobileappconfigurationassignment.md) collection|The list of group assignemenets for app configration.|
|deviceStatuses|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) collection|List of ManagedDeviceMobileAppConfigurationDeviceStatus.|
|deviceStatusSummary|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md)|App configuration device status summary.|
|userStatuses|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md) collection|List of ManagedDeviceMobileAppConfigurationUserStatus.|
|userStatusSummary|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md)|App configuration user status summary.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedDeviceMobileAppConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfiguration",
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
  "version": "Integer"
}
```

