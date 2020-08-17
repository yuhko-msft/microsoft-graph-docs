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

|Permission type|Permissions (from most to least privileged)|
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
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|preSharedKey|String|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|wifiSecurityType|wiFiSecurityType|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md). Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Personal`, `wpa2Enterprise`.|
|meteredConnectionLimit|meteredConnectionLimitType|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md). Possible values are: `unrestricted`, `fixed`, `variable`.|
|ssid|String|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|networkName|String|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|connectAutomatically|Boolean|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|connectToPreferredNetwork|Boolean|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|connectWhenNetworkNameIsHidden|Boolean|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|proxySetting|wiFiProxySetting|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md). Possible values are: `none`, `manual`, `automatic`.|
|proxyManualAddress|String|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|proxyManualPort|Int32|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|proxyAutomaticConfigurationUrl|String|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|forceFIPSCompliance|Boolean|**TODO: Add Description** Inherited from [windowsWifiConfiguration](../resources/windowswificonfiguration.md)|
|networkSingleSignOn|networkSingleSignOnType|**TODO: Add Description**. Possible values are: `disabled`, `prelogon`, `postlogon`.|
|maximumAuthenticationTimeoutInSeconds|Int32|**TODO: Add Description**|
|promptForAdditionalAuthenticationCredentials|Boolean|**TODO: Add Description**|
|enablePairwiseMasterKeyCaching|Boolean|**TODO: Add Description**|
|maximumPairwiseMasterKeyCacheTimeInMinutes|Int32|**TODO: Add Description**|
|maximumNumberOfPairwiseMasterKeysInCache|Int32|**TODO: Add Description**|
|enablePreAuthentication|Boolean|**TODO: Add Description**|
|maximumPreAuthenticationAttempts|Int32|**TODO: Add Description**|
|eapType|eapType|**TODO: Add Description**. Possible values are: `eapTls`, `leap`, `eapSim`, `eapTtls`, `peap`, `eapFast`.|
|trustedServerCertificateNames|String collection|**TODO: Add Description**|
|authenticationMethod|wiFiAuthenticationMethod|**TODO: Add Description**. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|innerAuthenticationProtocolForEAPTTLS|nonEapAuthenticationMethodForEapTtlsType|**TODO: Add Description**. Possible values are: `unencryptedPassword`, `challengeHandshakeAuthenticationProtocol`, `microsoftChap`, `microsoftChapVersionTwo`.|
|outerIdentityPrivacyTemporaryValue|String|**TODO: Add Description**|
|requireCryptographicBinding|Boolean|**TODO: Add Description**|
|performServerValidation|Boolean|**TODO: Add Description**|
|disableUserPromptForServerValidation|Boolean|**TODO: Add Description**|



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
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.windowsWifiEnterpriseEAPConfiguration not found
Content-Type: application/json
Content-length: 1889

{
  "@odata.type": "#microsoft.graph.windowsWifiEnterpriseEAPConfiguration",
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
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "preSharedKey": "String",
  "wifiSecurityType": "String",
  "meteredConnectionLimit": "String",
  "ssid": "String",
  "networkName": "String",
  "connectAutomatically": "Boolean",
  "connectToPreferredNetwork": "Boolean",
  "connectWhenNetworkNameIsHidden": "Boolean",
  "proxySetting": "String",
  "proxyManualAddress": "String",
  "proxyManualPort": "Integer",
  "proxyAutomaticConfigurationUrl": "String",
  "forceFIPSCompliance": "Boolean",
  "networkSingleSignOn": "String",
  "maximumAuthenticationTimeoutInSeconds": "Integer",
  "promptForAdditionalAuthenticationCredentials": "Boolean",
  "enablePairwiseMasterKeyCaching": "Boolean",
  "maximumPairwiseMasterKeyCacheTimeInMinutes": "Integer",
  "maximumNumberOfPairwiseMasterKeysInCache": "Integer",
  "enablePreAuthentication": "Boolean",
  "maximumPreAuthenticationAttempts": "Integer",
  "eapType": "String",
  "trustedServerCertificateNames": [
    "String"
  ],
  "authenticationMethod": "String",
  "innerAuthenticationProtocolForEAPTTLS": "String",
  "outerIdentityPrivacyTemporaryValue": "String",
  "requireCryptographicBinding": "Boolean",
  "performServerValidation": "Boolean",
  "disableUserPromptForServerValidation": "Boolean"
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
  "id": "0f97ed73-ed73-0f97-73ed-970f73ed970f",
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
  "preSharedKey": "String",
  "wifiSecurityType": "String",
  "meteredConnectionLimit": "String",
  "ssid": "String",
  "networkName": "String",
  "connectAutomatically": "Boolean",
  "connectToPreferredNetwork": "Boolean",
  "connectWhenNetworkNameIsHidden": "Boolean",
  "proxySetting": "String",
  "proxyManualAddress": "String",
  "proxyManualPort": "Integer",
  "proxyAutomaticConfigurationUrl": "String",
  "forceFIPSCompliance": "Boolean",
  "networkSingleSignOn": "String",
  "maximumAuthenticationTimeoutInSeconds": "Integer",
  "promptForAdditionalAuthenticationCredentials": "Boolean",
  "enablePairwiseMasterKeyCaching": "Boolean",
  "maximumPairwiseMasterKeyCacheTimeInMinutes": "Integer",
  "maximumNumberOfPairwiseMasterKeysInCache": "Integer",
  "enablePreAuthentication": "Boolean",
  "maximumPreAuthenticationAttempts": "Integer",
  "eapType": "String",
  "trustedServerCertificateNames": [
    "String"
  ],
  "authenticationMethod": "String",
  "innerAuthenticationProtocolForEAPTTLS": "String",
  "outerIdentityPrivacyTemporaryValue": "String",
  "requireCryptographicBinding": "Boolean",
  "performServerValidation": "Boolean",
  "disableUserPromptForServerValidation": "Boolean"
}
```

