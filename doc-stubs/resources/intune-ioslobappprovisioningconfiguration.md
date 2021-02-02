---
title: "iosLobAppProvisioningConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosLobAppProvisioningConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosLobAppProvisioningConfigurations](../api/intune-ioslobappprovisioningconfiguration-list.md)|[iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md) collection|Get a list of the [iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) objects and their properties.|
|[Create iosLobAppProvisioningConfiguration](../api/intune-ioslobappprovisioningconfiguration-create.md)|[iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md)|Create a new [iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md) object.|
|[Get iosLobAppProvisioningConfiguration](../api/intune-ioslobappprovisioningconfiguration-get.md)|[iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md)|Read the properties and relationships of an [iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md) object.|
|[Update iosLobAppProvisioningConfiguration](../api/intune-ioslobappprovisioningconfiguration-update.md)|[iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md)|Update the properties of an [iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md) object.|
|[Delete iosLobAppProvisioningConfiguration](../api/intune-ioslobappprovisioningconfiguration-delete.md)|None|Deletes an [iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|associatedMobileApps|String collection|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|payload|Binary|**TODO: Add Description**|
|payloadFileName|String|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[iosLobAppProvisioningConfigurationAssignment](../resources/intune-ioslobappprovisioningconfigurationassignment.md) collection|**TODO: Add Description**|
|deviceStatuses|[managedDeviceMobileAppConfigurationDeviceStatus](../resources/intune-manageddevicemobileappconfigurationdevicestatus.md) collection|**TODO: Add Description**|
|groupAssignments|[mobileAppProvisioningConfigGroupAssignment](../resources/intune-mobileappprovisioningconfiggroupassignment.md) collection|**TODO: Add Description**|
|userStatuses|[managedDeviceMobileAppConfigurationUserStatus](../resources/intune-manageddevicemobileappconfigurationuserstatus.md) collection|**TODO: Add Description**|

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
  "expirationDateTime": "String (timestamp)",
  "payloadFileName": "String",
  "payload": "Binary",
  "roleScopeTagIds": [
    "String"
  ],
  "associatedMobileApps": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "version": "Integer"
}
```

