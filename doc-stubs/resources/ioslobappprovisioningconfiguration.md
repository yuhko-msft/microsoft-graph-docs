---
title: "iosLobAppProvisioningConfiguration resource type"
description: "This topic provides descriptions of the declared methods, properties and relationships exposed by the iOS Lob App Provisioning Configuration resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosLobAppProvisioningConfiguration resource type

Namespace: microsoft.graph



This topic provides descriptions of the declared methods, properties and relationships exposed by the iOS Lob App Provisioning Configuration resource.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosLobAppProvisioningConfigurations](../api/ioslobappprovisioningconfiguration-list.md)|[iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) collection|Get a list of the [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) objects and their properties.|
|[Create iosLobAppProvisioningConfiguration](../api/ioslobappprovisioningconfiguration-create.md)|[iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md)|Create a new [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) object.|
|[Get iosLobAppProvisioningConfiguration](../api/ioslobappprovisioningconfiguration-get.md)|[iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md)|Read the properties and relationships of an [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) object.|
|[Update iosLobAppProvisioningConfiguration](../api/ioslobappprovisioningconfiguration-update.md)|[iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md)|Update the properties of an [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) object.|
|[Delete iosLobAppProvisioningConfiguration](../api/ioslobappprovisioningconfiguration-delete.md)|None|Deletes an [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) object.|
|[assign](../api/ioslobappprovisioningconfiguration-assign.md)|None|**TODO: Add Description**|
|[hasPayloadLinks](../api/ioslobappprovisioningconfiguration-haspayloadlinks.md)|[hasPayloadLinkResultItem](../resources/haspayloadlinkresultitem.md) collection|**TODO: Add Description**|
|[List assignments](../api/ioslobappprovisioningconfiguration-list-assignments.md)|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) collection|Get the iosLobAppProvisioningConfigurationAssignment resources from the assignments navigation property.|
|[Create iosLobAppProvisioningConfigurationAssignment](../api/ioslobappprovisioningconfiguration-post-assignments.md)|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md)|Create a new iosLobAppProvisioningConfigurationAssignment object.|
|[List deviceStatuses](../api/ioslobappprovisioningconfiguration-list-devicestatuses.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) collection|Get the managedDeviceMobileAppConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create managedDeviceMobileAppConfigurationDeviceStatus](../api/ioslobappprovisioningconfiguration-post-devicestatuses.md)|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md)|Create a new managedDeviceMobileAppConfigurationDeviceStatus object.|
|[List groupAssignments](../api/ioslobappprovisioningconfiguration-list-groupassignments.md)|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) collection|Get the mobileAppProvisioningConfigGroupAssignment resources from the groupAssignments navigation property.|
|[Create mobileAppProvisioningConfigGroupAssignment](../api/ioslobappprovisioningconfiguration-post-groupassignments.md)|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md)|Create a new mobileAppProvisioningConfigGroupAssignment object.|
|[List userStatuses](../api/ioslobappprovisioningconfiguration-list-userstatuses.md)|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md) collection|Get the managedDeviceMobileAppConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create managedDeviceMobileAppConfigurationUserStatus](../api/ioslobappprovisioningconfiguration-post-userstatuses.md)|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md)|Create a new managedDeviceMobileAppConfigurationUserStatus object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created.|
|description|String|Admin provided description of the Device Configuration.|
|displayName|String|Admin provided name of the device configuration.|
|expirationDateTime|DateTimeOffset|Optional profile expiration date and time.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|payload|Binary|Payload. (UTF8 encoded byte array)|
|payloadFileName|String|Payload file name (*.mobileprovision | *.xml).|
|roleScopeTagIds|String collection|List of Scope Tags for this iOS LOB app provisioning configuration entity.|
|version|Int32|Version of the device configuration.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[iosLobAppProvisioningConfigurationAssignment](../resources/ioslobappprovisioningconfigurationassignment.md) collection|The associated group assignments for IosLobAppProvisioningConfiguration.|
|deviceStatuses|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/manageddevicemobileappconfigurationdevicestatus.md) collection|The list of device installation states for this mobile app configuration.|
|groupAssignments|[mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) collection|The associated group assignments.|
|userStatuses|[managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md) collection|The list of user installation states for this mobile app configuration.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosLobAppProvisioningConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosLobAppProvisioningConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "expirationDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "payload": "Binary",
  "payloadFileName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
}
```

