---
title: "Update macOSEnterpriseWiFiConfiguration"
description: "Update the properties of a macOSEnterpriseWiFiConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOSEnterpriseWiFiConfiguration
Namespace: microsoft.graph



Update the properties of a [macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.macOSEnterpriseWiFiConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md) object.

The following table shows the properties that are required when you update the [macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md).

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
|connectAutomatically|Boolean|Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|connectWhenNetworkNameIsHidden|Boolean|Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|networkName|String|Network Name Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|preSharedKey|String|This is the pre-shared key for WPA Personal Wi-Fi network. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|proxyAutomaticConfigurationUrl|String|URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|proxyManualAddress|String|IP Address or DNS hostname of the proxy server when manual configuration is selected. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|proxyManualPort|Int32|Port of the proxy server when manual configuration is selected. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|proxySettings|wiFiProxySetting|Proxy Type for this Wi-Fi connection Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md). Possible values are: `none`, `manual`, `automatic`.|
|ssid|String|This is the name of the Wi-Fi network that is broadcast to all devices. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md)|
|wiFiSecurityType|wiFiSecurityType|Indicates whether Wi-Fi endpoint uses an EAP based security type. Inherited from [macOSWiFiConfiguration](../resources/macoswificonfiguration.md). Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Personal`, `wpa2Enterprise`.|
|authenticationMethod|wiFiAuthenticationMethod|Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|eapFastConfiguration|eapFastConfiguration|EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: `noProtectedAccessCredential`, `useProtectedAccessCredential`, `useProtectedAccessCredentialAndProvision`, `useProtectedAccessCredentialAndProvisionAnonymously`.|
|eapType|eapType|Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: `eapTls`, `leap`, `eapSim`, `eapTtls`, `peap`, `eapFast`.|
|innerAuthenticationProtocolForEapTtls|nonEapAuthenticationMethodForEapTtlsType|Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: `unencryptedPassword`, `challengeHandshakeAuthenticationProtocol`, `microsoftChap`, `microsoftChapVersionTwo`.|
|outerIdentityPrivacyTemporaryValue|String|Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'.|
|trustedServerCertificateNames|String collection|Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this Wi-Fi network.|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOSEnterpriseWiFiConfiguration](../resources/macosenterprisewificonfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macosenterprisewificonfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSEnterpriseWiFiConfiguration not found
Content-Type: application/json
Content-length: 1253

{
  "@odata.type": "#microsoft.graph.macOSEnterpriseWiFiConfiguration",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.macOSEnterpriseWiFiConfiguration",
  "id": "0a682c31-2c31-0a68-312c-680a312c680a",
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

