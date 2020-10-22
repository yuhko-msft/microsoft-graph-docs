---
title: "iosVpnConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVpnConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [appleVpnConfiguration](../resources/applevpnconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosVpnConfigurations](../api/iosvpnconfiguration-list.md)|[iosVpnConfiguration](../resources/iosvpnconfiguration.md) collection|Get a list of the [iosVpnConfiguration](../resources/iosvpnconfiguration.md) objects and their properties.|
|[Create iosVpnConfiguration](../api/iosvpnconfiguration-create.md)|[iosVpnConfiguration](../resources/iosvpnconfiguration.md)|Create a new [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.|
|[Get iosVpnConfiguration](../api/iosvpnconfiguration-get.md)|[iosVpnConfiguration](../resources/iosvpnconfiguration.md)|Read the properties and relationships of an [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.|
|[Update iosVpnConfiguration](../api/iosvpnconfiguration-update.md)|[iosVpnConfiguration](../resources/iosvpnconfiguration.md)|Update the properties of an [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.|
|[Delete iosVpnConfiguration](../api/iosvpnconfiguration-delete.md)|None|Deletes an [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.|
|[List assignments](../api/iosvpnconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create assignments](../api/iosvpnconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[Get assignments](../api/iosvpnconfiguration-get-deviceconfigurationassignment.md)|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md)|Read the properties and relationships of a [deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) object.|
|[Update assignments](../api/iosvpnconfiguration-update-assignments.md)|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/iosvpnconfiguration-delete-assignments.md)|None|Delete a [deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) object.|
|[List derivedCredentialSettings](../api/iosvpnconfiguration-list-derivedcredentialsettings.md)|[deviceManagementDerivedCredentialSettings](../resources/intune-devicemanagementderivedcredentialsettings.md) collection|Get the deviceManagementDerivedCredentialSettings resources from the derivedCredentialSettings navigation property.|
|[Add derivedCredentialSettings](../api/iosvpnconfiguration-post-derivedcredentialsettings.md)|[deviceManagementDerivedCredentialSettings](../resources/intune-devicemanagementderivedcredentialsettings.md)|Add derivedCredentialSettings by posting to the derivedCredentialSettings collection.|
|[Remove derivedCredentialSettings](../api/iosvpnconfiguration-delete-derivedcredentialsettings.md)|None|Remove a [deviceManagementDerivedCredentialSettings](../resources/intune-devicemanagementderivedcredentialsettings.md) object.|
|[List deviceSettingStateSummaries](../api/iosvpnconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create deviceSettingStateSummaries](../api/iosvpnconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[Get deviceSettingStateSummaries](../api/iosvpnconfiguration-get-settingstatedevicesummary.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md)|Read the properties and relationships of a [settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) object.|
|[Update deviceSettingStateSummaries](../api/iosvpnconfiguration-update-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md)|Update the properties of a deviceSettingStateSummaries object.|
|[Delete deviceSettingStateSummaries](../api/iosvpnconfiguration-delete-devicesettingstatesummaries.md)|None|Delete a [settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) object.|
|[List deviceStatuses](../api/iosvpnconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceStatuses](../api/iosvpnconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[Get deviceStatuses](../api/iosvpnconfiguration-get-deviceconfigurationdevicestatus.md)|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md)|Read the properties and relationships of a [deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) object.|
|[Update deviceStatuses](../api/iosvpnconfiguration-update-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md)|Update the properties of a deviceStatuses object.|
|[Delete deviceStatuses](../api/iosvpnconfiguration-delete-devicestatuses.md)|None|Delete a [deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) object.|
|[List deviceStatusOverview](../api/iosvpnconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceStatusOverview](../api/iosvpnconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[Get deviceStatusOverview](../api/iosvpnconfiguration-get-deviceconfigurationdeviceoverview.md)|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|Read the properties and relationships of a [deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md) object.|
|[Update deviceStatusOverview](../api/iosvpnconfiguration-update-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|Update the properties of a deviceStatusOverview object.|
|[Delete deviceStatusOverview](../api/iosvpnconfiguration-delete-devicestatusoverview.md)|None|Delete a [deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md) object.|
|[List groupAssignments](../api/iosvpnconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create groupAssignments](../api/iosvpnconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[Get groupAssignments](../api/iosvpnconfiguration-get-deviceconfigurationgroupassignment.md)|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md)|Read the properties and relationships of a [deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) object.|
|[Update groupAssignments](../api/iosvpnconfiguration-update-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md)|Update the properties of a groupAssignments object.|
|[Delete groupAssignments](../api/iosvpnconfiguration-delete-groupassignments.md)|None|Delete a [deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) object.|
|[List identityCertificate](../api/iosvpnconfiguration-list-identitycertificate.md)|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md) collection|Get the iosCertificateProfileBase resources from the identityCertificate navigation property.|
|[Add identityCertificate](../api/iosvpnconfiguration-post-identitycertificate.md)|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|Add identityCertificate by posting to the identityCertificate collection.|
|[Remove identityCertificate](../api/iosvpnconfiguration-delete-identitycertificate.md)|None|Remove an [iosCertificateProfileBase](../resources/ioscertificateprofilebase.md) object.|
|[List userStatuses](../api/iosvpnconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create userStatuses](../api/iosvpnconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[Get userStatuses](../api/iosvpnconfiguration-get-deviceconfigurationuserstatus.md)|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md)|Read the properties and relationships of a [deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) object.|
|[Update userStatuses](../api/iosvpnconfiguration-update-userstatuses.md)|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md)|Update the properties of a userStatuses object.|
|[Delete userStatuses](../api/iosvpnconfiguration-delete-userstatuses.md)|None|Delete a [deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) object.|
|[List userStatusOverview](../api/iosvpnconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create userStatusOverview](../api/iosvpnconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|
|[Get userStatusOverview](../api/iosvpnconfiguration-get-deviceconfigurationuseroverview.md)|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|Read the properties and relationships of a [deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md) object.|
|[Update userStatusOverview](../api/iosvpnconfiguration-update-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|Update the properties of a userStatusOverview object.|
|[Delete userStatusOverview](../api/iosvpnconfiguration-delete-userstatusoverview.md)|None|Delete a [deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|vpnAuthenticationMethod|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `certificate`, `usernameAndPassword`, `sharedSecret`, `derivedCredential`, `azureAD`.|
|cloudName|String|**TODO: Add Description**|
|connectionName|String|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|connectionType|appleVpnConnectionType|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `ciscoAnyConnect`, `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`, `customVpn`, `ciscoIPSec`, `citrix`, `ciscoAnyConnectV2`, `paloAltoGlobalProtect`, `zscalerPrivateAccess`, `f5Access2018`, `citrixSso`, `paloAltoGlobalProtectV2`, `ikEv2`, `alwaysOn`, `microsoftTunnel`, `netMotionMobility`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|customData|[keyValue](../resources/intune-keyvalue.md) collection|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|customKeyValueData|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|disableOnDemandUserOverride|Boolean|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|enablePerApp|Boolean|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|enableSplitTunneling|Boolean|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|excludedDomains|String collection|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|excludeList|String collection|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|identifier|String|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|loginGroupOrDomain|String|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|microsoftTunnelSiteId|String|**TODO: Add Description**|
|onDemandRules|[vpnOnDemandRule](../resources/intune-vpnondemandrule.md) collection|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|optInToDeviceIdSharing|Boolean|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|providerType|vpnProviderType|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `notConfigured`, `appProxy`, `packetTunnel`.|
|proxyServer|[vpnProxyServer](../resources/intune-vpnproxyserver.md)|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|realm|String|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|role|String|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|safariDomains|String collection|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|server|[vpnServer](../resources/intune-vpnserver.md)|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|strictEnforcement|Boolean|**TODO: Add Description**|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|targetedMobileApps|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|userDomain|String|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|derivedCredentialSettings|[deviceManagementDerivedCredentialSettings](../resources/intune-devicemanagementderivedcredentialsettings.md)|**TODO: Add Description**|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificate|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|**TODO: Add Description**|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

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
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "connectionName": "String",
  "connectionType": "String",
  "loginGroupOrDomain": "String",
  "role": "String",
  "realm": "String",
  "server": {
    "@odata.type": "microsoft.graph.vpnServer"
  },
  "identifier": "String",
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
  "enableSplitTunneling": "Boolean",
  "authenticationMethod": "String",
  "enablePerApp": "Boolean",
  "safariDomains": [
    "String"
  ],
  "onDemandRules": [
    {
      "@odata.type": "microsoft.graph.vpnOnDemandRule"
    }
  ],
  "providerType": "String",
  "excludedDomains": [
    "String"
  ],
  "disableOnDemandUserOverride": "Boolean",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "optInToDeviceIdSharing": "Boolean",
  "userDomain": "String",
  "strictEnforcement": "Boolean",
  "cloudName": "String",
  "excludeList": [
    "String"
  ],
  "targetedMobileApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "microsoftTunnelSiteId": "String"
}
```

