---
title: "windows81VpnConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows81VpnConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows81VpnConfiguration](../api/windows81vpnconfiguration-list.md)|[windows81VpnConfiguration](../resources/windows81vpnconfiguration.md) collection|Get a list of the [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md) objects and their properties.|
|[Create windows81VpnConfiguration](../api/windows81vpnconfiguration-create.md)|[windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|Create a new [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md) object.|
|[Get windows81VpnConfiguration](../api/windows81vpnconfiguration-get.md)|[windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|Read the properties and relationships of a [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md) object.|
|[Update windows81VpnConfiguration](../api/windows81vpnconfiguration-update.md)|[windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|Update the properties of a [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md) object.|
|[Delete windows81VpnConfiguration](../api/windows81vpnconfiguration-delete.md)|None|Deletes a [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applyOnlyToWindows81|Boolean|**TODO: Add Description**|
|connectionName|String|**TODO: Add Description** Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|connectionType|windowsVpnConnectionType|**TODO: Add Description**. Possible values are: `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|customXml|Binary|**TODO: Add Description** Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|enableSplitTunneling|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|loginGroupOrDomain|String|**TODO: Add Description**|
|proxyServer|[windows81VpnProxyServer](../resources/intune-windows81vpnproxyserver.md)|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|routes|[vpnRoute](../resources/intune-vpnroute.md) collection|**TODO: Add Description**|
|scenarioType|scenarioType|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Possible values are: `general`, `resourceAccess`.|
|servers|[vpnServer](../resources/intune-vpnserver.md) collection|**TODO: Add Description** Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windows81VpnConfiguration",
  "baseType": "microsoft.graph.windowsVpnConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows81VpnConfiguration",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "scenarioType": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "connectionName": "String",
  "servers": [
    {
      "@odata.type": "microsoft.graph.vpnServer"
    }
  ],
  "customXml": "Binary",
  "applyOnlyToWindows81": "Boolean",
  "connectionType": "String",
  "loginGroupOrDomain": "String",
  "enableSplitTunneling": "Boolean",
  "routes": [
    {
      "@odata.type": "microsoft.graph.vpnRoute"
    }
  ],
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows81VpnProxyServer"
  }
}
```

