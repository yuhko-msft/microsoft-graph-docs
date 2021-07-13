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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

An abstract class for Mobile app configuration for enrolled devices.
This is an abstract type.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceMobileAppConfigurations](../api/manageddevicemobileappconfiguration-list.md)|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) collection|Get a list of the [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) objects and their properties.|
|[Create managedDeviceMobileAppConfiguration](../api/manageddevicemobileappconfiguration-create.md)|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|Create a new [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) object.|
|[Get managedDeviceMobileAppConfiguration](../api/manageddevicemobileappconfiguration-get.md)|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|Read the properties and relationships of a [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) object.|
|[Update managedDeviceMobileAppConfiguration](../api/manageddevicemobileappconfiguration-update.md)|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|Update the properties of a [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) object.|
|[Delete managedDeviceMobileAppConfiguration](../api/manageddevicemobileappconfiguration-delete.md)|None|Deletes a [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) object.|
|[assign](../api/manageddevicemobileappconfiguration-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/manageddevicemobileappconfiguration-list-assignments.md)|[managedDeviceMobileAppConfigurationAssignment](../resources/manageddevicemobileappconfigurationassignment.md) collection|Get the managedDeviceMobileAppConfigurationAssignment resources from the assignments navigation property.|
|[Create managedDeviceMobileAppConfigurationAssignment](../api/manageddevicemobileappconfiguration-post-assignments.md)|[managedDeviceMobileAppConfigurationAssignment](../resources/manageddevicemobileappconfigurationassignment.md)|Create a new managedDeviceMobileAppConfigurationAssignment object.|
|[List deviceStatuses](../api/manageddevicemobileappconfiguration-list-devicestatuses.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) collection|Get the managedDeviceMobileAppConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create managedDeviceMobileAppConfigurationDeviceStatus](../api/manageddevicemobileappconfiguration-post-devicestatuses.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md)|Create a new managedDeviceMobileAppConfigurationDeviceStatus object.|
|[List managedDeviceMobileAppConfigurationDeviceSummary](../api/manageddevicemobileappconfiguration-list-devicestatussummary.md)|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) collection|Get the managedDeviceMobileAppConfigurationDeviceSummary resources from the deviceStatusSummary navigation property.|
|[Create managedDeviceMobileAppConfigurationDeviceSummary](../api/manageddevicemobileappconfiguration-post-devicestatussummary.md)|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md)|Create a new managedDeviceMobileAppConfigurationDeviceSummary object.|
|[List userStatuses](../api/manageddevicemobileappconfiguration-list-userstatuses.md)|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md) collection|Get the managedDeviceMobileAppConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create managedDeviceMobileAppConfigurationUserStatus](../api/manageddevicemobileappconfiguration-post-userstatuses.md)|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md)|Create a new managedDeviceMobileAppConfigurationUserStatus object.|
|[List managedDeviceMobileAppConfigurationUserSummary](../api/manageddevicemobileappconfiguration-list-userstatussummary.md)|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) collection|Get the managedDeviceMobileAppConfigurationUserSummary resources from the userStatusSummary navigation property.|
|[Create managedDeviceMobileAppConfigurationUserSummary](../api/manageddevicemobileappconfiguration-post-userstatussummary.md)|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md)|Create a new managedDeviceMobileAppConfigurationUserSummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created.|
|description|String|Admin provided description of the Device Configuration.|
|displayName|String|Admin provided name of the device configuration.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
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

