---
title: "Create iosEnterpriseWiFiConfiguration"
description: "Create a new iosEnterpriseWiFiConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosEnterpriseWiFiConfiguration
Namespace: microsoft.graph



Create a new [iosEnterpriseWiFiConfiguration](../resources/iosenterprisewificonfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.iosEnterpriseWiFiConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosEnterpriseWiFiConfiguration](../resources/iosenterprisewificonfiguration.md) object.

The following table shows the properties that are required when you create the [iosEnterpriseWiFiConfiguration](../resources/iosenterprisewificonfiguration.md).

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
|connectAutomatically|Boolean|Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network. Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md)|
|connectWhenNetworkNameIsHidden|Boolean|Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md)|
|disableMacAddressRandomization|Boolean|If set to true, forces devices connecting using this Wi-Fi profile to present their actual Wi-Fi MAC address instead of a random MAC address. Applies to iOS 14 and later. Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md)|
|networkName|String|Network Name Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md)|
|preSharedKey|String|This is the pre-shared key for WPA Personal Wi-Fi network. Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md)|
|proxyAutomaticConfigurationUrl|String|URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file. Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md)|
|proxyManualAddress|String|IP Address or DNS hostname of the proxy server when manual configuration is selected. Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md)|
|proxyManualPort|Int32|Port of the proxy server when manual configuration is selected. Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md)|
|proxySettings|wiFiProxySetting|Proxy Type for this Wi-Fi connection Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md). Possible values are: `none`, `manual`, `automatic`.|
|ssid|String|This is the name of the Wi-Fi network that is broadcast to all devices. Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md)|
|wiFiSecurityType|wiFiSecurityType|Indicates whether Wi-Fi endpoint uses an EAP based security type. Inherited from [iosWiFiConfiguration](../resources/ioswificonfiguration.md). Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Personal`, `wpa2Enterprise`.|
|authenticationMethod|wiFiAuthenticationMethod|Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|eapFastConfiguration|eapFastConfiguration|EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: `noProtectedAccessCredential`, `useProtectedAccessCredential`, `useProtectedAccessCredentialAndProvision`, `useProtectedAccessCredentialAndProvisionAnonymously`.|
|eapType|eapType|Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: `eapTls`, `leap`, `eapSim`, `eapTtls`, `peap`, `eapFast`.|
|innerAuthenticationProtocolForEapTtls|nonEapAuthenticationMethodForEapTtlsType|Non-EAP Method for Authentication when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: `unencryptedPassword`, `challengeHandshakeAuthenticationProtocol`, `microsoftChap`, `microsoftChapVersionTwo`.|
|outerIdentityPrivacyTemporaryValue|String|Enable identity privacy (Outer Identity) when EAP Type is configured to EAP - TTLS, EAP - FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'.|
|passwordFormatString|String|Password format string used to build the password to connect to wifi|
|trustedServerCertificateNames|String collection|Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network.|
|usernameFormatString|String|Username format string used to build the username to connect to wifi|



## Response

If successful, this method returns a `201 Created` response code and an [iosEnterpriseWiFiConfiguration](../resources/iosenterprisewificonfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iosenterprisewificonfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.iosEnterpriseWiFiConfiguration not found
Content-Type: application/json
Content-length: 1373

{
  "@odata.type": "#microsoft.graph.iosEnterpriseWiFiConfiguration",
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
  "connectWhenNetworkNameIsHidden": "Boolean",
  "disableMacAddressRandomization": "Boolean",
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
  "passwordFormatString": "String",
  "trustedServerCertificateNames": [
    "String"
  ],
  "usernameFormatString": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosEnterpriseWiFiConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.iosEnterpriseWiFiConfiguration",
  "id": "0d700cfb-0cfb-0d70-fb0c-700dfb0c700d",
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
  "disableMacAddressRandomization": "Boolean",
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
  "passwordFormatString": "String",
  "trustedServerCertificateNames": [
    "String"
  ],
  "usernameFormatString": "String"
}
```

