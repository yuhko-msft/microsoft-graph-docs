---
title: "androidForWorkMobileAppConfiguration resource type"
description: "Contains properties, inherited properties and actions for AFW mobile app configurations."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidForWorkMobileAppConfiguration resource type

Namespace: microsoft.graph



Contains properties, inherited properties and actions for AFW mobile app configurations.


Inherits from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidForWorkMobileAppConfigurations](../api/androidforworkmobileappconfiguration-list.md)|[androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md) collection|Get a list of the [androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md) objects and their properties.|
|[Create androidForWorkMobileAppConfiguration](../api/androidforworkmobileappconfiguration-create.md)|[androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md)|Create a new [androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md) object.|
|[Get androidForWorkMobileAppConfiguration](../api/androidforworkmobileappconfiguration-get.md)|[androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md)|Read the properties and relationships of an [androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md) object.|
|[Update androidForWorkMobileAppConfiguration](../api/androidforworkmobileappconfiguration-update.md)|[androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md)|Update the properties of an [androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md) object.|
|[Delete androidForWorkMobileAppConfiguration](../api/androidforworkmobileappconfiguration-delete.md)|None|Deletes an [androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md) object.|
|[assign](../api/androidforworkmobileappconfiguration-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/androidforworkmobileappconfiguration-list-assignments.md)|[managedDeviceMobileAppConfigurationAssignment](../resources/manageddevicemobileappconfigurationassignment.md) collection|Get the managedDeviceMobileAppConfigurationAssignment resources from the assignments navigation property.|
|[Create managedDeviceMobileAppConfigurationAssignment](../api/androidforworkmobileappconfiguration-post-assignments.md)|[managedDeviceMobileAppConfigurationAssignment](../resources/manageddevicemobileappconfigurationassignment.md)|Create a new managedDeviceMobileAppConfigurationAssignment object.|
|[List deviceStatuses](../api/androidforworkmobileappconfiguration-list-devicestatuses.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) collection|Get the managedDeviceMobileAppConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create managedDeviceMobileAppConfigurationDeviceStatus](../api/androidforworkmobileappconfiguration-post-devicestatuses.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md)|Create a new managedDeviceMobileAppConfigurationDeviceStatus object.|
|[List managedDeviceMobileAppConfigurationDeviceSummary](../api/androidforworkmobileappconfiguration-list-devicestatussummary.md)|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md) collection|Get the managedDeviceMobileAppConfigurationDeviceSummary resources from the deviceStatusSummary navigation property.|
|[Create managedDeviceMobileAppConfigurationDeviceSummary](../api/androidforworkmobileappconfiguration-post-devicestatussummary.md)|[managedDeviceMobileAppConfigurationDeviceSummary](../resources/manageddevicemobileappconfigurationdevicesummary.md)|Create a new managedDeviceMobileAppConfigurationDeviceSummary object.|
|[List userStatuses](../api/androidforworkmobileappconfiguration-list-userstatuses.md)|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md) collection|Get the managedDeviceMobileAppConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create managedDeviceMobileAppConfigurationUserStatus](../api/androidforworkmobileappconfiguration-post-userstatuses.md)|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md)|Create a new managedDeviceMobileAppConfigurationUserStatus object.|
|[List managedDeviceMobileAppConfigurationUserSummary](../api/androidforworkmobileappconfiguration-list-userstatussummary.md)|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) collection|Get the managedDeviceMobileAppConfigurationUserSummary resources from the userStatusSummary navigation property.|
|[Create managedDeviceMobileAppConfigurationUserSummary](../api/androidforworkmobileappconfiguration-post-userstatussummary.md)|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md)|Create a new managedDeviceMobileAppConfigurationUserSummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|packageId|String|Android For Work app configuration package id.|
|payloadJson|String|Android For Work app configuration JSON payload.|
|permissionActions|[androidPermissionAction](../resources/androidpermissionaction.md) collection|List of Android app permissions and corresponding permission actions.|
|profileApplicability|androidProfileApplicability|Android Enterprise profile applicability (AndroidWorkProfile, DeviceOwner, or default (applies to both)). Possible values are: `default`, `androidWorkProfile`, `androidDeviceOwner`.|
|roleScopeTagIds|String collection|List of Scope Tags for this App configuration entity. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|targetedMobileApps|String collection|the associated app. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|

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
  "@odata.type": "microsoft.graph.androidForWorkMobileAppConfiguration",
  "baseType": "microsoft.graph.managedDeviceMobileAppConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidForWorkMobileAppConfiguration",
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
  "packageId": "String",
  "payloadJson": "String",
  "permissionActions": [
    {
      "@odata.type": "microsoft.graph.androidPermissionAction"
    }
  ],
  "profileApplicability": "String"
}
```

