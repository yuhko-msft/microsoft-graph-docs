---
title: "androidWorkProfileVpnConfiguration resource type"
description: "By providing the configurations in this profile you can instruct the Android Work Profile device to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidWorkProfileVpnConfiguration resource type

Namespace: microsoft.graph



By providing the configurations in this profile you can instruct the Android Work Profile device to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidWorkProfileVpnConfigurations](../api/androidworkprofilevpnconfiguration-list.md)|[androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md) collection|Get a list of the [androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md) objects and their properties.|
|[Create androidWorkProfileVpnConfiguration](../api/androidworkprofilevpnconfiguration-create.md)|[androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md)|Create a new [androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md) object.|
|[Get androidWorkProfileVpnConfiguration](../api/androidworkprofilevpnconfiguration-get.md)|[androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md)|Read the properties and relationships of an [androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md) object.|
|[Update androidWorkProfileVpnConfiguration](../api/androidworkprofilevpnconfiguration-update.md)|[androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md)|Update the properties of an [androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md) object.|
|[Delete androidWorkProfileVpnConfiguration](../api/androidworkprofilevpnconfiguration-delete.md)|None|Deletes an [androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md) object.|
|[assign](../api/androidworkprofilevpnconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/androidworkprofilevpnconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/androidworkprofilevpnconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/androidworkprofilevpnconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/androidworkprofilevpnconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/androidworkprofilevpnconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/androidworkprofilevpnconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/androidworkprofilevpnconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/androidworkprofilevpnconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/androidworkprofilevpnconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/androidworkprofilevpnconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/androidworkprofilevpnconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/androidworkprofilevpnconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List androidWorkProfileCertificateProfileBase](../api/androidworkprofilevpnconfiguration-list-identitycertificate.md)|[androidWorkProfileCertificateProfileBase](../resources/androidworkprofilecertificateprofilebase.md) collection|Get the androidWorkProfileCertificateProfileBase resources from the identityCertificate navigation property.|
|[Add androidWorkProfileCertificateProfileBase](../api/androidworkprofilevpnconfiguration-post-identitycertificate.md)|[androidWorkProfileCertificateProfileBase](../resources/androidworkprofilecertificateprofilebase.md)|Add identityCertificate by posting to the identityCertificate collection.|
|[List userStatuses](../api/androidworkprofilevpnconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/androidworkprofilevpnconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/androidworkprofilevpnconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/androidworkprofilevpnconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|alwaysOn|Boolean|Whether or not to enable always-on VPN connection.|
|alwaysOnLockdown|Boolean|If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.|
|authenticationMethod|vpnAuthenticationMethod|Authentication method. Possible values are: `certificate`, `usernameAndPassword`, `sharedSecret`, `derivedCredential`, `azureAD`.|
|connectionName|String|Connection name displayed to the user.|
|connectionType|androidWorkProfileVpnConnectionType|Connection type. Possible values are: `ciscoAnyConnect`, `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`, `citrix`, `paloAltoGlobalProtect`, `microsoftTunnel`, `netMotionMobility`, `microsoftProtect`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|customData|[keyValue](../resources/keyvalue.md) collection|Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.|
|customKeyValueData|[keyValuePair](../resources/keyvaluepair.md) collection|Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|fingerprint|String|Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|microsoftTunnelSiteId|String|Microsoft Tunnel site ID.|
|proxyServer|[vpnProxyServer](../resources/vpnproxyserver.md)|Proxy server.|
|realm|String|Realm when connection type is set to Pulse Secure.|
|role|String|Role when connection type is set to Pulse Secure.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|servers|[vpnServer](../resources/vpnserver.md) collection|List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|targetedMobileApps|[appListItem](../resources/applistitem.md) collection|Targeted mobile apps. This collection can contain a maximum of 500 elements.|
|targetedPackageIds|String collection|Targeted App package IDs.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificate|[androidWorkProfileCertificateProfileBase](../resources/androidworkprofilecertificateprofilebase.md)|Identity certificate for client authentication when authentication method is certificate.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidWorkProfileVpnConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidWorkProfileVpnConfiguration",
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
  "alwaysOn": "Boolean",
  "alwaysOnLockdown": "Boolean",
  "authenticationMethod": "String",
  "connectionName": "String",
  "connectionType": "String",
  "customData": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ],
  "customKeyValueData": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "fingerprint": "String",
  "microsoftTunnelSiteId": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "realm": "String",
  "role": "String",
  "servers": [
    {
      "@odata.type": "microsoft.graph.vpnServer"
    }
  ],
  "targetedMobileApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "targetedPackageIds": [
    "String"
  ]
}
```

