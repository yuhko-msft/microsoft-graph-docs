---
title: "androidWorkProfileEnterpriseWiFiConfiguration resource type"
description: "By providing the configurations in this profile you can instruct the Android Work Profile device to connect to desired Wi-Fi endpoint. By specifying the authentication method and security types expected by Wi-Fi endpoint you can make the Wi-Fi connection seamless for end user."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidWorkProfileEnterpriseWiFiConfiguration resource type

Namespace: microsoft.graph



By providing the configurations in this profile you can instruct the Android Work Profile device to connect to desired Wi-Fi endpoint. By specifying the authentication method and security types expected by Wi-Fi endpoint you can make the Wi-Fi connection seamless for end user.


Inherits from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidWorkProfileEnterpriseWiFiConfigurations](../api/androidworkprofileenterprisewificonfiguration-list.md)|[androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) collection|Get a list of the [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) objects and their properties.|
|[Create androidWorkProfileEnterpriseWiFiConfiguration](../api/androidworkprofileenterprisewificonfiguration-create.md)|[androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md)|Create a new [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object.|
|[Get androidWorkProfileEnterpriseWiFiConfiguration](../api/androidworkprofileenterprisewificonfiguration-get.md)|[androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md)|Read the properties and relationships of an [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object.|
|[Update androidWorkProfileEnterpriseWiFiConfiguration](../api/androidworkprofileenterprisewificonfiguration-update.md)|[androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md)|Update the properties of an [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object.|
|[Delete androidWorkProfileEnterpriseWiFiConfiguration](../api/androidworkprofileenterprisewificonfiguration-delete.md)|None|Deletes an [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object.|
|[List assignments](../api/androidworkprofileenterprisewificonfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/androidworkprofileenterprisewificonfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/androidworkprofileenterprisewificonfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/androidworkprofileenterprisewificonfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/androidworkprofileenterprisewificonfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/androidworkprofileenterprisewificonfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/androidworkprofileenterprisewificonfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/androidworkprofileenterprisewificonfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/androidworkprofileenterprisewificonfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/androidworkprofileenterprisewificonfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List androidWorkProfileCertificateProfileBase](../api/androidworkprofileenterprisewificonfiguration-list-identitycertificateforclientauthentication.md)|[androidWorkProfileCertificateProfileBase](../resources/androidworkprofilecertificateprofilebase.md) collection|Get the androidWorkProfileCertificateProfileBase resources from the identityCertificateForClientAuthentication navigation property.|
|[Add androidWorkProfileCertificateProfileBase](../api/androidworkprofileenterprisewificonfiguration-post-identitycertificateforclientauthentication.md)|[androidWorkProfileCertificateProfileBase](../resources/androidworkprofilecertificateprofilebase.md)|Add identityCertificateForClientAuthentication by posting to the identityCertificateForClientAuthentication collection.|
|[List androidWorkProfileTrustedRootCertificate](../api/androidworkprofileenterprisewificonfiguration-list-rootcertificateforservervalidation.md)|[androidWorkProfileTrustedRootCertificate](../resources/androidworkprofiletrustedrootcertificate.md) collection|Get the androidWorkProfileTrustedRootCertificate resources from the rootCertificateForServerValidation navigation property.|
|[Add androidWorkProfileTrustedRootCertificate](../api/androidworkprofileenterprisewificonfiguration-post-rootcertificateforservervalidation.md)|[androidWorkProfileTrustedRootCertificate](../resources/androidworkprofiletrustedrootcertificate.md)|Add rootCertificateForServerValidation by posting to the rootCertificateForServerValidation collection.|
|[List userStatuses](../api/androidworkprofileenterprisewificonfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/androidworkprofileenterprisewificonfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/androidworkprofileenterprisewificonfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/androidworkprofileenterprisewificonfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|wiFiAuthenticationMethod|Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|connectAutomatically|Boolean|Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network. Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md)|
|connectWhenNetworkNameIsHidden|Boolean|When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|eapType|androidEapType|Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: `eapTls`, `eapTtls`, `peap`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|innerAuthenticationProtocolForEapTtls|nonEapAuthenticationMethodForEapTtlsType|Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: `unencryptedPassword`, `challengeHandshakeAuthenticationProtocol`, `microsoftChap`, `microsoftChapVersionTwo`.|
|innerAuthenticationProtocolForPeap|nonEapAuthenticationMethodForPeap|Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. Possible values are: `none`, `microsoftChapVersionTwo`.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|networkName|String|Network Name Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md)|
|outerIdentityPrivacyTemporaryValue|String|Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network.|
|proxyAutomaticConfigurationUrl|String|URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.|
|proxySettings|wiFiProxySetting|Proxy Type for this Wi-Fi connection. Possible values are: `none`, `manual`, `automatic`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|ssid|String|This is the name of the Wi-Fi network that is broadcast to all devices. Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|wiFiSecurityType|androidWiFiSecurityType|Indicates whether Wi-Fi endpoint uses an EAP based security type. Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md). Possible values are: `open`, `wpaEnterprise`, `wpa2Enterprise`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificateForClientAuthentication|[androidWorkProfileCertificateProfileBase](../resources/androidworkprofilecertificateprofilebase.md)|Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection.|
|rootCertificateForServerValidation|[androidWorkProfileTrustedRootCertificate](../resources/androidworkprofiletrustedrootcertificate.md)|Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration",
  "baseType": "microsoft.graph.androidWorkProfileWiFiConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration",
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
  "ssid": "String",
  "wiFiSecurityType": "String",
  "authenticationMethod": "String",
  "eapType": "String",
  "innerAuthenticationProtocolForEapTtls": "String",
  "innerAuthenticationProtocolForPeap": "String",
  "outerIdentityPrivacyTemporaryValue": "String",
  "proxyAutomaticConfigurationUrl": "String",
  "proxySettings": "String"
}
```

