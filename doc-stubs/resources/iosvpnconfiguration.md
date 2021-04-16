---
title: "iosVpnConfiguration resource type"
description: "By providing the configurations in this profile you can instruct the iOS device to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVpnConfiguration resource type

Namespace: microsoft.graph



By providing the configurations in this profile you can instruct the iOS device to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.


Inherits from [appleVpnConfiguration](../resources/applevpnconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosVpnConfigurations](../api/iosvpnconfiguration-list.md)|[iosVpnConfiguration](../resources/iosvpnconfiguration.md) collection|Get a list of the [iosVpnConfiguration](../resources/iosvpnconfiguration.md) objects and their properties.|
|[Create iosVpnConfiguration](../api/iosvpnconfiguration-create.md)|[iosVpnConfiguration](../resources/iosvpnconfiguration.md)|Create a new [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.|
|[Get iosVpnConfiguration](../api/iosvpnconfiguration-get.md)|[iosVpnConfiguration](../resources/iosvpnconfiguration.md)|Read the properties and relationships of an [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.|
|[Update iosVpnConfiguration](../api/iosvpnconfiguration-update.md)|[iosVpnConfiguration](../resources/iosvpnconfiguration.md)|Update the properties of an [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.|
|[Delete iosVpnConfiguration](../api/iosvpnconfiguration-delete.md)|None|Deletes an [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.|
|[List assignments](../api/iosvpnconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/iosvpnconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceManagementDerivedCredentialSettings](../api/iosvpnconfiguration-list-derivedcredentialsettings.md)|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md) collection|Get the deviceManagementDerivedCredentialSettings resources from the derivedCredentialSettings navigation property.|
|[Add deviceManagementDerivedCredentialSettings](../api/iosvpnconfiguration-post-derivedcredentialsettings.md)|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md)|Add derivedCredentialSettings by posting to the derivedCredentialSettings collection.|
|[List deviceSettingStateSummaries](../api/iosvpnconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/iosvpnconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/iosvpnconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/iosvpnconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/iosvpnconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/iosvpnconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/iosvpnconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/iosvpnconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List iosCertificateProfileBase](../api/iosvpnconfiguration-list-identitycertificate.md)|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md) collection|Get the iosCertificateProfileBase resources from the identityCertificate navigation property.|
|[Add iosCertificateProfileBase](../api/iosvpnconfiguration-post-identitycertificate.md)|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|Add identityCertificate by posting to the identityCertificate collection.|
|[List userStatuses](../api/iosvpnconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/iosvpnconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/iosvpnconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/iosvpnconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|associatedDomains|String collection|Associated Domains Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|authenticationMethod|vpnAuthenticationMethod|Authentication method for this VPN connection. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `certificate`, `usernameAndPassword`, `sharedSecret`, `derivedCredential`, `azureAD`.|
|cloudName|String|Zscaler only. Zscaler cloud which the user is assigned to.|
|connectionName|String|Connection name displayed to the user. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|connectionType|appleVpnConnectionType|Connection type. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `ciscoAnyConnect`, `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`, `customVpn`, `ciscoIPSec`, `citrix`, `ciscoAnyConnectV2`, `paloAltoGlobalProtect`, `zscalerPrivateAccess`, `f5Access2018`, `citrixSso`, `paloAltoGlobalProtectV2`, `ikEv2`, `alwaysOn`, `microsoftTunnel`, `netMotionMobility`, `microsoftProtect`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|customData|[keyValue](../resources/keyvalue.md) collection|Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|customKeyValueData|[keyValuePair](../resources/keyvaluepair.md) collection|Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|disableOnDemandUserOverride|Boolean|Toggle to prevent user from disabling automatic VPN in the Settings app Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|enablePerApp|Boolean|Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|enableSplitTunneling|Boolean|Send all network traffic through VPN. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|excludedDomains|String collection|Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|excludeList|String collection|Zscaler only. List of network addresses which are not sent through the Zscaler cloud.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|identifier|String|Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|loginGroupOrDomain|String|Login group or domain when connection type is set to Dell SonicWALL Mobile Connection. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|microsoftTunnelSiteId|String|Microsoft Tunnel site ID.|
|onDemandRules|[vpnOnDemandRule](../resources/vpnondemandrule.md) collection|On-Demand Rules. This collection can contain a maximum of 500 elements. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|optInToDeviceIdSharing|Boolean|Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|providerType|vpnProviderType|Provider type for per-app VPN. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `notConfigured`, `appProxy`, `packetTunnel`.|
|proxyServer|[vpnProxyServer](../resources/vpnproxyserver.md)|Proxy Server. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|realm|String|Realm when connection type is set to Pulse Secure. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|role|String|Role when connection type is set to Pulse Secure. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|safariDomains|String collection|Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|server|[vpnServer](../resources/vpnserver.md)|VPN Server on the network. Make sure end users can access this network location. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|strictEnforcement|Boolean|Zscaler only. Blocks network traffic until the user signs into Zscaler app. "True" means traffic is blocked.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|targetedMobileApps|[appListItem](../resources/applistitem.md) collection|Targeted mobile apps. This collection can contain a maximum of 500 elements.|
|userDomain|String|Zscaler only. Enter a static domain to pre-populate the login field with in the Zscaler app. If this is left empty, the user's Azure Active Directory domain will be used instead.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|derivedCredentialSettings|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md)|Tenant level settings for the Derived Credentials to be used for authentication.|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificate|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|Identity certificate for client authentication when authentication method is certificate.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosVpnConfiguration",
  "baseType": "microsoft.graph.appleVpnConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVpnConfiguration",
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
  "associatedDomains": [
    "String"
  ],
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
  "disableOnDemandUserOverride": "Boolean",
  "enablePerApp": "Boolean",
  "enableSplitTunneling": "Boolean",
  "excludedDomains": [
    "String"
  ],
  "identifier": "String",
  "loginGroupOrDomain": "String",
  "onDemandRules": [
    {
      "@odata.type": "microsoft.graph.vpnOnDemandRule"
    }
  ],
  "optInToDeviceIdSharing": "Boolean",
  "providerType": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "realm": "String",
  "role": "String",
  "safariDomains": [
    "String"
  ],
  "server": {
    "@odata.type": "microsoft.graph.vpnServer"
  },
  "cloudName": "String",
  "excludeList": [
    "String"
  ],
  "microsoftTunnelSiteId": "String",
  "strictEnforcement": "Boolean",
  "targetedMobileApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "userDomain": "String"
}
```

