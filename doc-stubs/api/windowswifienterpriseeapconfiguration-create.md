---
title: "Create windowsWifiEnterpriseEAPConfiguration"
description: "Create a new windowsWifiEnterpriseEAPConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsWifiEnterpriseEAPConfiguration
Namespace: microsoft.graph



Create a new [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST ** Collection URI for microsoft.graph.windowsWifiEnterpriseEAPConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) object.

The following table shows the properties that are required when you create the [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|connectAutomatically|Boolean|Specify whether the wifi connection should connect automatically when in range. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|connectToPreferredNetwork|Boolean|Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|connectWhenNetworkNameIsHidden|Boolean|Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|forceFIPSCompliance|Boolean|Specify whether to force FIPS compliance. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|meteredConnectionLimit|meteredConnectionLimitType|Specify the metered connection limit type for the wifi connection. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md). Possible values are: `unrestricted`, `fixed`, `variable`.|
|networkName|String|Specify the network configuration name. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|preSharedKey|String|This is the pre-shared key for WPA Personal Wi-Fi network. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|proxyAutomaticConfigurationUrl|String|Specify the URL for the proxy server configuration script. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|proxyManualAddress|String|Specify the IP address for the proxy server. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|proxyManualPort|Int32|Specify the port for the proxy server. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|proxySetting|wiFiProxySetting|Specify the proxy setting for Wi-Fi configuration Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md). Possible values are: `none`, `manual`, `automatic`.|
|ssid|String|Specify the SSID of the wifi connection. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|wifiSecurityType|wiFiSecurityType|Specify the Wifi Security Type. Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md). Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Personal`, `wpa2Enterprise`.|
|authenticationMethod|wiFiAuthenticationMethod|Specify the authentication method. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|authenticationPeriodInSeconds|Int32|Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.|
|authenticationRetryDelayPeriodInSeconds|Int32|Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.|
|authenticationType|wifiAuthenticationType|Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you’re using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: `none`, `user`, `machine`, `machineOrUser`, `guest`.|
|cacheCredentials|Boolean|Specify whether to cache user credentials on the device so that users don’t need to keep entering them each time they connect.|
|disableUserPromptForServerValidation|Boolean|Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP.|
|eapolStartPeriodInSeconds|Int32|Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.|
|eapType|eapType|Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: `eapTls`, `leap`, `eapSim`, `eapTtls`, `peap`, `eapFast`.|
|enablePairwiseMasterKeyCaching|Boolean|Specify whether the wifi connection should enable pairwise master key caching.|
|enablePreAuthentication|Boolean|Specify whether pre-authentication should be enabled.|
|innerAuthenticationProtocolForEAPTTLS|nonEapAuthenticationMethodForEapTtlsType|Specify inner authentication protocol for EAP TTLS. Possible values are: `unencryptedPassword`, `challengeHandshakeAuthenticationProtocol`, `microsoftChap`, `microsoftChapVersionTwo`.|
|maximumAuthenticationFailures|Int32|Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.|
|maximumAuthenticationTimeoutInSeconds|Int32|Specify maximum authentication timeout (in seconds).  Valid range: 1-120|
|maximumEAPOLStartMessages|Int32|Specifiy the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.|
|maximumNumberOfPairwiseMasterKeysInCache|Int32|Specify maximum number of pairwise master keys in cache.  Valid range: 1-255|
|maximumPairwiseMasterKeyCacheTimeInMinutes|Int32|Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440|
|maximumPreAuthenticationAttempts|Int32|Specify maximum pre-authentication attempts.  Valid range: 1-16|
|networkSingleSignOn|networkSingleSignOnType|Specify the network single sign on type. Possible values are: `disabled`, `prelogon`, `postlogon`.|
|outerIdentityPrivacyTemporaryValue|String|Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.|
|performServerValidation|Boolean|Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP.|
|promptForAdditionalAuthenticationCredentials|Boolean|Specify whether the wifi connection should prompt for additional authentication credentials.|
|requireCryptographicBinding|Boolean|Specify whether to enable cryptographic binding when EAP type is selected as PEAP.|
|trustedServerCertificateNames|String collection|Specify trusted server certificate names.|
|userBasedVirtualLan|Boolean|Specifiy whether to change the virtual LAN used by the device based on the user’s credentials. Cannot be used when NetworkSingleSignOnType is set to ​Disabled.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowswifienterpriseeapconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsWifiEnterpriseEAPConfiguration not found
Content-Type: application/json
Content-length: 2232

{
  "@odata.type": "#microsoft.graph.windowsWifiEnterpriseEAPConfiguration",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsWifiEnterpriseEAPConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsWifiEnterpriseEAPConfiguration",
  "id": "0883ff9e-ff9e-0883-9eff-83089eff8308",
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

