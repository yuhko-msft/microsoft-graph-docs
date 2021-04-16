---
title: "windowsWifiEnterpriseEAPConfiguration resource type"
description: "This entity provides descriptions of the declared methods, properties and relationships exposed by the Wifi CSP."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsWifiEnterpriseEAPConfiguration resource type

Namespace: microsoft.graph



This entity provides descriptions of the declared methods, properties and relationships exposed by the Wifi CSP.


Inherits from [windowsWifiConfiguration](../resources/windowswificonfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsWifiEnterpriseEAPConfigurations](../api/windowswifienterpriseeapconfiguration-list.md)|[windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) collection|Get a list of the [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) objects and their properties.|
|[Create windowsWifiEnterpriseEAPConfiguration](../api/windowswifienterpriseeapconfiguration-create.md)|[windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md)|Create a new [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) object.|
|[Get windowsWifiEnterpriseEAPConfiguration](../api/windowswifienterpriseeapconfiguration-get.md)|[windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md)|Read the properties and relationships of a [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) object.|
|[Update windowsWifiEnterpriseEAPConfiguration](../api/windowswifienterpriseeapconfiguration-update.md)|[windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md)|Update the properties of a [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) object.|
|[Delete windowsWifiEnterpriseEAPConfiguration](../api/windowswifienterpriseeapconfiguration-delete.md)|None|Deletes a [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) object.|
|[List assignments](../api/windowswifienterpriseeapconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/windowswifienterpriseeapconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/windowswifienterpriseeapconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/windowswifienterpriseeapconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/windowswifienterpriseeapconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/windowswifienterpriseeapconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/windowswifienterpriseeapconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/windowswifienterpriseeapconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/windowswifienterpriseeapconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/windowswifienterpriseeapconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List windowsCertificateProfileBase](../api/windowswifienterpriseeapconfiguration-list-identitycertificateforclientauthentication.md)|[windowsCertificateProfileBase](../resources/windowscertificateprofilebase.md) collection|Get the windowsCertificateProfileBase resources from the identityCertificateForClientAuthentication navigation property.|
|[Add windowsCertificateProfileBase](../api/windowswifienterpriseeapconfiguration-post-identitycertificateforclientauthentication.md)|[windowsCertificateProfileBase](../resources/windowscertificateprofilebase.md)|Add identityCertificateForClientAuthentication by posting to the identityCertificateForClientAuthentication collection.|
|[List windows81TrustedRootCertificate](../api/windowswifienterpriseeapconfiguration-list-rootcertificateforclientvalidation.md)|[windows81TrustedRootCertificate](../resources/windows81trustedrootcertificate.md) collection|Get the windows81TrustedRootCertificate resources from the rootCertificateForClientValidation navigation property.|
|[Add windows81TrustedRootCertificate](../api/windowswifienterpriseeapconfiguration-post-rootcertificateforclientvalidation.md)|[windows81TrustedRootCertificate](../resources/windows81trustedrootcertificate.md)|Add rootCertificateForClientValidation by posting to the rootCertificateForClientValidation collection.|
|[List rootCertificatesForServerValidation](../api/windowswifienterpriseeapconfiguration-list-rootcertificatesforservervalidation.md)|[windows81TrustedRootCertificate](../resources/windows81trustedrootcertificate.md) collection|Get the windows81TrustedRootCertificate resources from the rootCertificatesForServerValidation navigation property.|
|[Add windows81TrustedRootCertificate](../api/windowswifienterpriseeapconfiguration-post-rootcertificatesforservervalidation.md)|[windows81TrustedRootCertificate](../resources/windows81trustedrootcertificate.md)|Add rootCertificatesForServerValidation by posting to the rootCertificatesForServerValidation collection.|
|[List userStatuses](../api/windowswifienterpriseeapconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/windowswifienterpriseeapconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/windowswifienterpriseeapconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/windowswifienterpriseeapconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|wiFiAuthenticationMethod|Specify the authentication method. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|authenticationPeriodInSeconds|Int32|Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.|
|authenticationRetryDelayPeriodInSeconds|Int32|Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.|
|authenticationType|wifiAuthenticationType|Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you’re using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: `none`, `user`, `machine`, `machineOrUser`, `guest`.|
|cacheCredentials|Boolean|Specify whether to cache user credentials on the device so that users don’t need to keep entering them each time they connect.|
|connectAutomatically|Boolean|Specify whether the wifi connection should connect automatically when in range. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|connectToPreferredNetwork|Boolean|Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|connectWhenNetworkNameIsHidden|Boolean|Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|disableUserPromptForServerValidation|Boolean|Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP.|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|eapolStartPeriodInSeconds|Int32|Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.|
|eapType|eapType|Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: `eapTls`, `leap`, `eapSim`, `eapTtls`, `peap`, `eapFast`.|
|enablePairwiseMasterKeyCaching|Boolean|Specify whether the wifi connection should enable pairwise master key caching.|
|enablePreAuthentication|Boolean|Specify whether pre-authentication should be enabled.|
|forceFIPSCompliance|Boolean|Specify whether to force FIPS compliance. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|innerAuthenticationProtocolForEAPTTLS|nonEapAuthenticationMethodForEapTtlsType|Specify inner authentication protocol for EAP TTLS. Possible values are: `unencryptedPassword`, `challengeHandshakeAuthenticationProtocol`, `microsoftChap`, `microsoftChapVersionTwo`.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|maximumAuthenticationFailures|Int32|Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.|
|maximumAuthenticationTimeoutInSeconds|Int32|Specify maximum authentication timeout (in seconds).  Valid range: 1-120|
|maximumEAPOLStartMessages|Int32|Specifiy the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.|
|maximumNumberOfPairwiseMasterKeysInCache|Int32|Specify maximum number of pairwise master keys in cache.  Valid range: 1-255|
|maximumPairwiseMasterKeyCacheTimeInMinutes|Int32|Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440|
|maximumPreAuthenticationAttempts|Int32|Specify maximum pre-authentication attempts.  Valid range: 1-16|
|meteredConnectionLimit|meteredConnectionLimitType|Specify the metered connection limit type for the wifi connection. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md). Possible values are: `unrestricted`, `fixed`, `variable`.|
|networkName|String|Specify the network configuration name. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|networkSingleSignOn|networkSingleSignOnType|Specify the network single sign on type. Possible values are: `disabled`, `prelogon`, `postlogon`.|
|outerIdentityPrivacyTemporaryValue|String|Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.|
|performServerValidation|Boolean|Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP.|
|preSharedKey|String|This is the pre-shared key for WPA Personal Wi-Fi network. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|promptForAdditionalAuthenticationCredentials|Boolean|Specify whether the wifi connection should prompt for additional authentication credentials.|
|proxyAutomaticConfigurationUrl|String|Specify the URL for the proxy server configuration script. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|proxyManualAddress|String|Specify the IP address for the proxy server. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|proxyManualPort|Int32|Specify the port for the proxy server. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|proxySetting|wiFiProxySetting|Specify the proxy setting for Wi-Fi configuration Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md). Possible values are: `none`, `manual`, `automatic`.|
|requireCryptographicBinding|Boolean|Specify whether to enable cryptographic binding when EAP type is selected as PEAP.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|ssid|String|Specify the SSID of the wifi connection. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|trustedServerCertificateNames|String collection|Specify trusted server certificate names.|
|userBasedVirtualLan|Boolean|Specifiy whether to change the virtual LAN used by the device based on the user’s credentials. Cannot be used when NetworkSingleSignOnType is set to ​Disabled.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|wifiSecurityType|wiFiSecurityType|Specify the Wifi Security Type. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md). Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Personal`, `wpa2Enterprise`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificateForClientAuthentication|[windowsCertificateProfileBase](../resources/windowscertificateprofilebase.md)|Specify identity certificate for client authentication.|
|rootCertificateForClientValidation|[windows81TrustedRootCertificate](../resources/windows81trustedrootcertificate.md)|Specify root certificate for client validation.|
|rootCertificatesForServerValidation|[windows81TrustedRootCertificate](../resources/windows81trustedrootcertificate.md) collection|Specify root certificate for server validation.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsWifiEnterpriseEAPConfiguration",
  "baseType": "microsoft.graph.windowsWifiConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsWifiEnterpriseEAPConfiguration",
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
  "connectToPreferredNetwork": "Boolean",
  "connectWhenNetworkNameIsHidden": "Boolean",
  "forceFIPSCompliance": "Boolean",
  "meteredConnectionLimit": "String",
  "networkName": "String",
  "preSharedKey": "String",
  "proxyAutomaticConfigurationUrl": "String",
  "proxyManualAddress": "String",
  "proxyManualPort": "Integer",
  "proxySetting": "String",
  "ssid": "String",
  "wifiSecurityType": "String",
  "authenticationMethod": "String",
  "authenticationPeriodInSeconds": "Integer",
  "authenticationRetryDelayPeriodInSeconds": "Integer",
  "authenticationType": "String",
  "cacheCredentials": "Boolean",
  "disableUserPromptForServerValidation": "Boolean",
  "eapolStartPeriodInSeconds": "Integer",
  "eapType": "String",
  "enablePairwiseMasterKeyCaching": "Boolean",
  "enablePreAuthentication": "Boolean",
  "innerAuthenticationProtocolForEAPTTLS": "String",
  "maximumAuthenticationFailures": "Integer",
  "maximumAuthenticationTimeoutInSeconds": "Integer",
  "maximumEAPOLStartMessages": "Integer",
  "maximumNumberOfPairwiseMasterKeysInCache": "Integer",
  "maximumPairwiseMasterKeyCacheTimeInMinutes": "Integer",
  "maximumPreAuthenticationAttempts": "Integer",
  "networkSingleSignOn": "String",
  "outerIdentityPrivacyTemporaryValue": "String",
  "performServerValidation": "Boolean",
  "promptForAdditionalAuthenticationCredentials": "Boolean",
  "requireCryptographicBinding": "Boolean",
  "trustedServerCertificateNames": [
    "String"
  ],
  "userBasedVirtualLan": "Boolean"
}
```

