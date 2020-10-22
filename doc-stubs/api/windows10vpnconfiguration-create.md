---
title: "Create windows10VpnConfiguration"
description: "Create a new windows10VpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windows10VpnConfiguration
Namespace: microsoft.graph

Create a new [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windows10VpnConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) object.

The following table shows the properties that are required when you create the [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md).

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
|connectionName|String|**TODO: Add Description** Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|servers|[vpnServer](../resources/intune-vpnserver.md) collection|**TODO: Add Description** Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|customXml|Binary|**TODO: Add Description** Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|profileTarget|windows10VpnProfileTarget|**TODO: Add Description**. Possible values are: `user`, `device`, `autoPilotDevice`.|
|connectionType|windows10VpnConnectionType|**TODO: Add Description**. Possible values are: `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`, `automatic`, `ikEv2`, `l2tp`, `pptp`, `citrix`, `paloAltoGlobalProtect`.|
|enableSplitTunneling|Boolean|**TODO: Add Description**|
|enableAlwaysOn|Boolean|**TODO: Add Description**|
|enableDeviceTunnel|Boolean|**TODO: Add Description**|
|enableDnsRegistration|Boolean|**TODO: Add Description**|
|dnsSuffixes|String collection|**TODO: Add Description**|
|authenticationMethod|windows10VpnAuthenticationMethod|**TODO: Add Description**. Possible values are: `certificate`, `usernameAndPassword`, `customEapXml`, `derivedCredential`.|
|rememberUserCredentials|Boolean|**TODO: Add Description**|
|enableConditionalAccess|Boolean|**TODO: Add Description**|
|enableSingleSignOnWithAlternateCertificate|Boolean|**TODO: Add Description**|
|singleSignOnEku|[extendedKeyUsage](../resources/intune-extendedkeyusage.md)|**TODO: Add Description**|
|singleSignOnIssuerHash|String|**TODO: Add Description**|
|eapXml|Binary|**TODO: Add Description**|
|proxyServer|[windows10VpnProxyServer](../resources/intune-windows10vpnproxyserver.md)|**TODO: Add Description**|
|associatedApps|[windows10AssociatedApps](../resources/intune-windows10associatedapps.md) collection|**TODO: Add Description**|
|onlyAssociatedAppsCanUseConnection|Boolean|**TODO: Add Description**|
|windowsInformationProtectionDomain|String|**TODO: Add Description**|
|trafficRules|[vpnTrafficRule](../resources/intune-vpntrafficrule.md) collection|**TODO: Add Description**|
|routes|[vpnRoute](../resources/intune-vpnroute.md) collection|**TODO: Add Description**|
|dnsRules|[vpnDnsRule](../resources/intune-vpndnsrule.md) collection|**TODO: Add Description**|
|trustedNetworkDomains|String collection|**TODO: Add Description**|
|cryptographySuite|[cryptographySuite](../resources/intune-cryptographysuite.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windows10vpnconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.windows10VpnConfiguration not found
Content-Type: application/json
Content-length: 2062

{
  "@odata.type": "#microsoft.graph.windows10VpnConfiguration",
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
  "connectionName": "String",
  "servers": [
    {
      "@odata.type": "microsoft.graph.vpnServer"
    }
  ],
  "customXml": "Binary",
  "profileTarget": "String",
  "connectionType": "String",
  "enableSplitTunneling": "Boolean",
  "enableAlwaysOn": "Boolean",
  "enableDeviceTunnel": "Boolean",
  "enableDnsRegistration": "Boolean",
  "dnsSuffixes": [
    "String"
  ],
  "authenticationMethod": "String",
  "rememberUserCredentials": "Boolean",
  "enableConditionalAccess": "Boolean",
  "enableSingleSignOnWithAlternateCertificate": "Boolean",
  "singleSignOnEku": {
    "@odata.type": "microsoft.graph.extendedKeyUsage"
  },
  "singleSignOnIssuerHash": "String",
  "eapXml": "Binary",
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows10VpnProxyServer"
  },
  "associatedApps": [
    {
      "@odata.type": "microsoft.graph.windows10AssociatedApps"
    }
  ],
  "onlyAssociatedAppsCanUseConnection": "Boolean",
  "windowsInformationProtectionDomain": "String",
  "trafficRules": [
    {
      "@odata.type": "microsoft.graph.vpnTrafficRule"
    }
  ],
  "routes": [
    {
      "@odata.type": "microsoft.graph.vpnRoute"
    }
  ],
  "dnsRules": [
    {
      "@odata.type": "microsoft.graph.vpnDnsRule"
    }
  ],
  "trustedNetworkDomains": [
    "String"
  ],
  "cryptographySuite": {
    "@odata.type": "microsoft.graph.cryptographySuite"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10VpnConfiguration"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.windows10VpnConfiguration",
  "id": "8e79415d-415d-8e79-5d41-798e5d41798e",
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
  "servers": [
    {
      "@odata.type": "microsoft.graph.vpnServer"
    }
  ],
  "customXml": "Binary",
  "profileTarget": "String",
  "connectionType": "String",
  "enableSplitTunneling": "Boolean",
  "enableAlwaysOn": "Boolean",
  "enableDeviceTunnel": "Boolean",
  "enableDnsRegistration": "Boolean",
  "dnsSuffixes": [
    "String"
  ],
  "authenticationMethod": "String",
  "rememberUserCredentials": "Boolean",
  "enableConditionalAccess": "Boolean",
  "enableSingleSignOnWithAlternateCertificate": "Boolean",
  "singleSignOnEku": {
    "@odata.type": "microsoft.graph.extendedKeyUsage"
  },
  "singleSignOnIssuerHash": "String",
  "eapXml": "Binary",
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows10VpnProxyServer"
  },
  "associatedApps": [
    {
      "@odata.type": "microsoft.graph.windows10AssociatedApps"
    }
  ],
  "onlyAssociatedAppsCanUseConnection": "Boolean",
  "windowsInformationProtectionDomain": "String",
  "trafficRules": [
    {
      "@odata.type": "microsoft.graph.vpnTrafficRule"
    }
  ],
  "routes": [
    {
      "@odata.type": "microsoft.graph.vpnRoute"
    }
  ],
  "dnsRules": [
    {
      "@odata.type": "microsoft.graph.vpnDnsRule"
    }
  ],
  "trustedNetworkDomains": [
    "String"
  ],
  "cryptographySuite": {
    "@odata.type": "microsoft.graph.cryptographySuite"
  }
}
```

