---
title: "macOSEnterpriseWiFiConfiguration resource type"
description: "MacOS Wi-Fi WPA-Enterprise/WPA2-Enterprise configuration profile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSEnterpriseWiFiConfiguration resource type

Namespace: microsoft.graph



MacOS Wi-Fi WPA-Enterprise/WPA2-Enterprise configuration profile.


Inherits from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSEnterpriseWiFiConfigurations](../api/macosenterprisewificonfiguration-list.md)|[macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md) collection|Get a list of the [macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md) objects and their properties.|
|[Create macOSEnterpriseWiFiConfiguration](../api/macosenterprisewificonfiguration-create.md)|[macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md)|Create a new [macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md) object.|
|[Get macOSEnterpriseWiFiConfiguration](../api/macosenterprisewificonfiguration-get.md)|[macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md)|Read the properties and relationships of a [macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md) object.|
|[Update macOSEnterpriseWiFiConfiguration](../api/macosenterprisewificonfiguration-update.md)|[macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md)|Update the properties of a [macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md) object.|
|[Delete macOSEnterpriseWiFiConfiguration](../api/macosenterprisewificonfiguration-delete.md)|None|Deletes a [macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md) object.|
|[List assignments](../api/macosenterprisewificonfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/macosenterprisewificonfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/macosenterprisewificonfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/macosenterprisewificonfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/macosenterprisewificonfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/macosenterprisewificonfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/macosenterprisewificonfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/macosenterprisewificonfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/macosenterprisewificonfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/macosenterprisewificonfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List macOSCertificateProfileBase](../api/macosenterprisewificonfiguration-list-identitycertificateforclientauthentication.md)|[macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md) collection|Get the macOSCertificateProfileBase resources from the identityCertificateForClientAuthentication navigation property.|
|[Add macOSCertificateProfileBase](../api/macosenterprisewificonfiguration-post-identitycertificateforclientauthentication.md)|[macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md)|Add identityCertificateForClientAuthentication by posting to the identityCertificateForClientAuthentication collection.|
|[List macOSTrustedRootCertificate](../api/macosenterprisewificonfiguration-list-rootcertificateforservervalidation.md)|[macOSTrustedRootCertificate](../resources/macostrustedrootcertificate.md) collection|Get the macOSTrustedRootCertificate resources from the rootCertificateForServerValidation navigation property.|
|[Add macOSTrustedRootCertificate](../api/macosenterprisewificonfiguration-post-rootcertificateforservervalidation.md)|[macOSTrustedRootCertificate](../resources/macostrustedrootcertificate.md)|Add rootCertificateForServerValidation by posting to the rootCertificateForServerValidation collection.|
|[List rootCertificatesForServerValidation](../api/macosenterprisewificonfiguration-list-rootcertificatesforservervalidation.md)|[macOSTrustedRootCertificate](../resources/macostrustedrootcertificate.md) collection|Get the macOSTrustedRootCertificate resources from the rootCertificatesForServerValidation navigation property.|
|[Add macOSTrustedRootCertificate](../api/macosenterprisewificonfiguration-post-rootcertificatesforservervalidation.md)|[macOSTrustedRootCertificate](../resources/macostrustedrootcertificate.md)|Add rootCertificatesForServerValidation by posting to the rootCertificatesForServerValidation collection.|
|[List userStatuses](../api/macosenterprisewificonfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/macosenterprisewificonfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/macosenterprisewificonfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/macosenterprisewificonfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|wiFiAuthenticationMethod|Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|connectAutomatically|Boolean|Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|connectWhenNetworkNameIsHidden|Boolean|Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|eapFastConfiguration|eapFastConfiguration|EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: `noProtectedAccessCredential`, `useProtectedAccessCredential`, `useProtectedAccessCredentialAndProvision`, `useProtectedAccessCredentialAndProvisionAnonymously`.|
|eapType|eapType|Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: `eapTls`, `leap`, `eapSim`, `eapTtls`, `peap`, `eapFast`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|innerAuthenticationProtocolForEapTtls|nonEapAuthenticationMethodForEapTtlsType|Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: `unencryptedPassword`, `challengeHandshakeAuthenticationProtocol`, `microsoftChap`, `microsoftChapVersionTwo`.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|networkName|String|Network Name Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|outerIdentityPrivacyTemporaryValue|String|Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'.|
|preSharedKey|String|This is the pre-shared key for WPA Personal Wi-Fi network. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|proxyAutomaticConfigurationUrl|String|URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|proxyManualAddress|String|IP Address or DNS hostname of the proxy server when manual configuration is selected. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|proxyManualPort|Int32|Port of the proxy server when manual configuration is selected. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|proxySettings|wiFiProxySetting|Proxy Type for this Wi-Fi connection Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md). Possible values are: `none`, `manual`, `automatic`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|ssid|String|This is the name of the Wi-Fi network that is broadcast to all devices. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|trustedServerCertificateNames|String collection|Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this Wi-Fi network.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|wiFiSecurityType|wiFiSecurityType|Indicates whether Wi-Fi endpoint uses an EAP based security type. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md). Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Personal`, `wpa2Enterprise`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificateForClientAuthentication|[macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md)|Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).|
|rootCertificateForServerValidation|[macOSTrustedRootCertificate](../resources/macostrustedrootcertificate.md)|Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP.|
|rootCertificatesForServerValidation|[macOSTrustedRootCertificate](../resources/macostrustedrootcertificate.md) collection|Trusted Root Certificates for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. If you provide this value you do not need to provide trustedServerCertificateNames, and vice versa.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macOSEnterpriseWiFiConfiguration",
  "baseType": "microsoft.graph.macOSWiFiConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSEnterpriseWiFiConfiguration",
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
  "connectAutomatically": "Boolean",
  "connectWhenNetworkNameIsHidden": "Boolean",
  "networkName": "String",
  "preSharedKey": "String",
  "proxyAutomaticConfigurationUrl": "String",
  "proxyManualAddress": "String",
  "proxyManualPort": "Integer",
  "proxySettings": "String",
  "ssid": "String",
  "wiFiSecurityType": "String",
  "authenticationMethod": "String",
  "eapFastConfiguration": "String",
  "eapType": "String",
  "innerAuthenticationProtocolForEapTtls": "String",
  "outerIdentityPrivacyTemporaryValue": "String",
  "trustedServerCertificateNames": [
    "String"
  ]
}
```

