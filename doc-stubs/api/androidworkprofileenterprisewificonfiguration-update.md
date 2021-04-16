---
title: "Update androidWorkProfileEnterpriseWiFiConfiguration"
description: "Update the properties of an androidWorkProfileEnterpriseWiFiConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidWorkProfileEnterpriseWiFiConfiguration
Namespace: microsoft.graph



Update the properties of an [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object.

The following table shows the properties that are required when you update the [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md).

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
|connectAutomatically|Boolean|Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network. Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md)|
|connectWhenNetworkNameIsHidden|Boolean|When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices. Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md)|
|networkName|String|Network Name Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md)|
|ssid|String|This is the name of the Wi-Fi network that is broadcast to all devices. Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md)|
|wiFiSecurityType|androidWiFiSecurityType|Indicates whether Wi-Fi endpoint uses an EAP based security type. Inherited from [androidWorkProfileWiFiConfiguration](../resources/androidworkprofilewificonfiguration.md). Possible values are: `open`, `wpaEnterprise`, `wpa2Enterprise`.|
|authenticationMethod|wiFiAuthenticationMethod|Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|eapType|androidEapType|Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: `eapTls`, `eapTtls`, `peap`.|
|innerAuthenticationProtocolForEapTtls|nonEapAuthenticationMethodForEapTtlsType|Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: `unencryptedPassword`, `challengeHandshakeAuthenticationProtocol`, `microsoftChap`, `microsoftChapVersionTwo`.|
|innerAuthenticationProtocolForPeap|nonEapAuthenticationMethodForPeap|Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. Possible values are: `none`, `microsoftChapVersionTwo`.|
|outerIdentityPrivacyTemporaryValue|String|Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network.|
|proxyAutomaticConfigurationUrl|String|URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.|
|proxySettings|wiFiProxySetting|Proxy Type for this Wi-Fi connection. Possible values are: `none`, `manual`, `automatic`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidWorkProfileEnterpriseWiFiConfiguration](../resources/androidworkprofileenterprisewificonfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androidworkprofileenterprisewificonfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration not found
Content-Type: application/json
Content-length: 1125

{
  "@odata.type": "#microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration",
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
  "@odata.type": "#microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration",
  "id": "0a51ff1a-ff1a-0a51-1aff-510a1aff510a",
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

