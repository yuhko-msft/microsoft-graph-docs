---
title: "windowsPhone81VpnConfiguration resource type"
description: "By providing the configurations in this profile you can instruct the Windows Phone 8.1 to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsPhone81VpnConfiguration resource type

Namespace: microsoft.graph



By providing the configurations in this profile you can instruct the Windows Phone 8.1 to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.


Inherits from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsPhone81VpnConfiguration](../api/windowsphone81vpnconfiguration-list.md)|[windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md) collection|Get a list of the [windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md) objects and their properties.|
|[Create windowsPhone81VpnConfiguration](../api/windowsphone81vpnconfiguration-create.md)|[windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md)|Create a new [windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md) object.|
|[Get windowsPhone81VpnConfiguration](../api/windowsphone81vpnconfiguration-get.md)|[windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md)|Read the properties and relationships of a [windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md) object.|
|[Update windowsPhone81VpnConfiguration](../api/windowsphone81vpnconfiguration-update.md)|[windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md)|Update the properties of a [windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md) object.|
|[Delete windowsPhone81VpnConfiguration](../api/windowsphone81vpnconfiguration-delete.md)|None|Deletes a [windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md) object.|
|[List assignments](../api/windowsphone81vpnconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/windowsphone81vpnconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/windowsphone81vpnconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/windowsphone81vpnconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/windowsphone81vpnconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/windowsphone81vpnconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/windowsphone81vpnconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/windowsphone81vpnconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/windowsphone81vpnconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/windowsphone81vpnconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List windowsPhone81CertificateProfileBase](../api/windowsphone81vpnconfiguration-list-identitycertificate.md)|[windowsPhone81CertificateProfileBase](../resources/windowsphone81certificateprofilebase.md) collection|Get the windowsPhone81CertificateProfileBase resources from the identityCertificate navigation property.|
|[Add windowsPhone81CertificateProfileBase](../api/windowsphone81vpnconfiguration-post-identitycertificate.md)|[windowsPhone81CertificateProfileBase](../resources/windowsphone81certificateprofilebase.md)|Add identityCertificate by posting to the identityCertificate collection.|
|[List userStatuses](../api/windowsphone81vpnconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/windowsphone81vpnconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/windowsphone81vpnconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/windowsphone81vpnconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applyOnlyToWindows81|Boolean|Value indicating whether this policy only applies to Windows 8.1. This property is read-only. Inherited from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|
|authenticationMethod|vpnAuthenticationMethod|Authentication method. Possible values are: `certificate`, `usernameAndPassword`, `sharedSecret`, `derivedCredential`, `azureAD`.|
|bypassVpnOnCompanyWifi|Boolean|Bypass VPN on company Wi-Fi.|
|bypassVpnOnHomeWifi|Boolean|Bypass VPN on home Wi-Fi.|
|connectionName|String|Connection name displayed to the user. Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|connectionType|windowsVpnConnectionType|Connection type. Inherited from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md). Possible values are: `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|customXml|Binary|Custom XML commands that configures the VPN connection. (UTF8 encoded byte array) Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|dnsSuffixSearchList|String collection|DNS suffix search list.|
|enableSplitTunneling|Boolean|Enable split tunneling for the VPN. Inherited from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|loginGroupOrDomain|String|Login group or domain when connection type is set to Dell SonicWALL Mobile Connection. Inherited from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|
|proxyServer|[windows81VpnProxyServer](../resources/windows81vpnproxyserver.md)|Proxy Server. Inherited from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|
|rememberUserCredentials|Boolean|Remember user credentials.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|servers|[vpnServer](../resources/vpnserver.md) collection|List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements. Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificate|[windowsPhone81CertificateProfileBase](../resources/windowsphone81certificateprofilebase.md)|Identity certificate for client authentication when authentication method is certificate.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsPhone81VpnConfiguration",
  "baseType": "microsoft.graph.windows81VpnConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsPhone81VpnConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "connectionName": "String",
  "customXml": "Binary",
  "servers": [
    {
      "@odata.type": "microsoft.graph.vpnServer"
    }
  ],
  "applyOnlyToWindows81": "Boolean",
  "connectionType": "String",
  "enableSplitTunneling": "Boolean",
  "loginGroupOrDomain": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows81VpnProxyServer"
  },
  "authenticationMethod": "String",
  "bypassVpnOnCompanyWifi": "Boolean",
  "bypassVpnOnHomeWifi": "Boolean",
  "dnsSuffixSearchList": [
    "String"
  ],
  "rememberUserCredentials": "Boolean"
}
```

