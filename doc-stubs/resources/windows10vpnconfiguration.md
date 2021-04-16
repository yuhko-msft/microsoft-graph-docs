---
title: "windows10VpnConfiguration resource type"
description: "By providing the configurations in this profile you can instruct the Windows 10 device (desktop or mobile) to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10VpnConfiguration resource type

Namespace: microsoft.graph



By providing the configurations in this profile you can instruct the Windows 10 device (desktop or mobile) to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.


Inherits from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10VpnConfiguration](../api/windows10vpnconfiguration-list.md)|[windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) collection|Get a list of the [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) objects and their properties.|
|[Create windows10VpnConfiguration](../api/windows10vpnconfiguration-create.md)|[windows10VpnConfiguration](../resources/windows10vpnconfiguration.md)|Create a new [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) object.|
|[Get windows10VpnConfiguration](../api/windows10vpnconfiguration-get.md)|[windows10VpnConfiguration](../resources/windows10vpnconfiguration.md)|Read the properties and relationships of a [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) object.|
|[Update windows10VpnConfiguration](../api/windows10vpnconfiguration-update.md)|[windows10VpnConfiguration](../resources/windows10vpnconfiguration.md)|Update the properties of a [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) object.|
|[Delete windows10VpnConfiguration](../api/windows10vpnconfiguration-delete.md)|None|Deletes a [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) object.|
|[List assignments](../api/windows10vpnconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/windows10vpnconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/windows10vpnconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/windows10vpnconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/windows10vpnconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/windows10vpnconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/windows10vpnconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/windows10vpnconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/windows10vpnconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/windows10vpnconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List windowsCertificateProfileBase](../api/windows10vpnconfiguration-list-identitycertificate.md)|[windowsCertificateProfileBase](../resources/windowscertificateprofilebase.md) collection|Get the windowsCertificateProfileBase resources from the identityCertificate navigation property.|
|[Add windowsCertificateProfileBase](../api/windows10vpnconfiguration-post-identitycertificate.md)|[windowsCertificateProfileBase](../resources/windowscertificateprofilebase.md)|Add identityCertificate by posting to the identityCertificate collection.|
|[List userStatuses](../api/windows10vpnconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/windows10vpnconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/windows10vpnconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/windows10vpnconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|associatedApps|[windows10AssociatedApps](../resources/windows10associatedapps.md) collection|Associated Apps. This collection can contain a maximum of 10000 elements.|
|authenticationMethod|windows10VpnAuthenticationMethod|Authentication method. Possible values are: `certificate`, `usernameAndPassword`, `customEapXml`, `derivedCredential`.|
|connectionName|String|Connection name displayed to the user. Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|connectionType|windows10VpnConnectionType|Connection type. Possible values are: `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`, `automatic`, `ikEv2`, `l2tp`, `pptp`, `citrix`, `paloAltoGlobalProtect`, `ciscoAnyConnect`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|cryptographySuite|[cryptographySuite](../resources/cryptographysuite.md)|Cryptography Suite security settings for IKEv2 VPN in Windows10 and above |
|customXml|Binary|Custom XML commands that configures the VPN connection. (UTF8 encoded byte array) Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|dnsRules|[vpnDnsRule](../resources/vpndnsrule.md) collection|DNS rules. This collection can contain a maximum of 1000 elements.|
|dnsSuffixes|String collection|Specify DNS suffixes to add to the DNS search list to properly route short names.|
|eapXml|Binary|Extensible Authentication Protocol (EAP) XML. (UTF8 encoded byte array)|
|enableAlwaysOn|Boolean|Enable Always On mode.|
|enableConditionalAccess|Boolean|Enable conditional access.|
|enableDeviceTunnel|Boolean|Enable device tunnel.|
|enableDnsRegistration|Boolean|Enable IP address registration with internal DNS.|
|enableSingleSignOnWithAlternateCertificate|Boolean|Enable single sign-on (SSO) with alternate certificate.|
|enableSplitTunneling|Boolean|Enable split tunneling.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|onlyAssociatedAppsCanUseConnection|Boolean|Only associated Apps can use connection (per-app VPN).|
|profileTarget|windows10VpnProfileTarget|Profile target type. Possible values are: `user`, `device`, `autoPilotDevice`.|
|proxyServer|[windows10VpnProxyServer](../resources/windows10vpnproxyserver.md)|Proxy Server.|
|rememberUserCredentials|Boolean|Remember user credentials.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|routes|[vpnRoute](../resources/vpnroute.md) collection|Routes (optional for third-party providers). This collection can contain a maximum of 1000 elements.|
|servers|[vpnServer](../resources/vpnserver.md) collection|List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements. Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|singleSignOnEku|[extendedKeyUsage](../resources/extendedkeyusage.md)|Single sign-on Extended Key Usage (EKU).|
|singleSignOnIssuerHash|String|Single sign-on issuer hash.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|trafficRules|[vpnTrafficRule](../resources/vpntrafficrule.md) collection|Traffic rules. This collection can contain a maximum of 1000 elements.|
|trustedNetworkDomains|String collection|Trusted Network Domains|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|windowsInformationProtectionDomain|String|Windows Information Protection (WIP) domain to associate with this connection.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificate|[windowsCertificateProfileBase](../resources/windowscertificateprofilebase.md)|Identity certificate for client authentication when authentication method is certificate.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windows10VpnConfiguration",
  "baseType": "microsoft.graph.windowsVpnConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10VpnConfiguration",
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
  "associatedApps": [
    {
      "@odata.type": "microsoft.graph.windows10AssociatedApps"
    }
  ],
  "authenticationMethod": "String",
  "connectionType": "String",
  "cryptographySuite": {
    "@odata.type": "microsoft.graph.cryptographySuite"
  },
  "dnsRules": [
    {
      "@odata.type": "microsoft.graph.vpnDnsRule"
    }
  ],
  "dnsSuffixes": [
    "String"
  ],
  "eapXml": "Binary",
  "enableAlwaysOn": "Boolean",
  "enableConditionalAccess": "Boolean",
  "enableDeviceTunnel": "Boolean",
  "enableDnsRegistration": "Boolean",
  "enableSingleSignOnWithAlternateCertificate": "Boolean",
  "enableSplitTunneling": "Boolean",
  "onlyAssociatedAppsCanUseConnection": "Boolean",
  "profileTarget": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows10VpnProxyServer"
  },
  "rememberUserCredentials": "Boolean",
  "routes": [
    {
      "@odata.type": "microsoft.graph.vpnRoute"
    }
  ],
  "singleSignOnEku": {
    "@odata.type": "microsoft.graph.extendedKeyUsage"
  },
  "singleSignOnIssuerHash": "String",
  "trafficRules": [
    {
      "@odata.type": "microsoft.graph.vpnTrafficRule"
    }
  ],
  "trustedNetworkDomains": [
    "String"
  ],
  "windowsInformationProtectionDomain": "String"
}
```

