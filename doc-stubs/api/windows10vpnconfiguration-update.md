---
title: "Update windows10VpnConfiguration"
description: "Update the properties of a windows10VpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windows10VpnConfiguration
Namespace: microsoft.graph



Update the properties of a [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windows10VpnConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) object.

The following table shows the properties that are required when you update the [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md).

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
|connectionName|String|Connection name displayed to the user. Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|customXml|Binary|Custom XML commands that configures the VPN connection. (UTF8 encoded byte array) Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|servers|[vpnServer](../resources/vpnserver.md) collection|List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements. Inherited from [windowsVpnConfiguration](../resources/windowsvpnconfiguration.md)|
|associatedApps|[windows10AssociatedApps](../resources/windows10associatedapps.md) collection|Associated Apps. This collection can contain a maximum of 10000 elements.|
|authenticationMethod|windows10VpnAuthenticationMethod|Authentication method. Possible values are: `certificate`, `usernameAndPassword`, `customEapXml`, `derivedCredential`.|
|connectionType|windows10VpnConnectionType|Connection type. Possible values are: `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`, `automatic`, `ikEv2`, `l2tp`, `pptp`, `citrix`, `paloAltoGlobalProtect`, `ciscoAnyConnect`.|
|cryptographySuite|[cryptographySuite](../resources/cryptographysuite.md)|Cryptography Suite security settings for IKEv2 VPN in Windows10 and above |
|dnsRules|[vpnDnsRule](../resources/vpndnsrule.md) collection|DNS rules. This collection can contain a maximum of 1000 elements.|
|dnsSuffixes|String collection|Specify DNS suffixes to add to the DNS search list to properly route short names.|
|eapXml|Binary|Extensible Authentication Protocol (EAP) XML. (UTF8 encoded byte array)|
|enableAlwaysOn|Boolean|Enable Always On mode.|
|enableConditionalAccess|Boolean|Enable conditional access.|
|enableDeviceTunnel|Boolean|Enable device tunnel.|
|enableDnsRegistration|Boolean|Enable IP address registration with internal DNS.|
|enableSingleSignOnWithAlternateCertificate|Boolean|Enable single sign-on (SSO) with alternate certificate.|
|enableSplitTunneling|Boolean|Enable split tunneling.|
|onlyAssociatedAppsCanUseConnection|Boolean|Only associated Apps can use connection (per-app VPN).|
|profileTarget|windows10VpnProfileTarget|Profile target type. Possible values are: `user`, `device`, `autoPilotDevice`.|
|proxyServer|[windows10VpnProxyServer](../resources/windows10vpnproxyserver.md)|Proxy Server.|
|rememberUserCredentials|Boolean|Remember user credentials.|
|routes|[vpnRoute](../resources/vpnroute.md) collection|Routes (optional for third-party providers). This collection can contain a maximum of 1000 elements.|
|singleSignOnEku|[extendedKeyUsage](../resources/extendedkeyusage.md)|Single sign-on Extended Key Usage (EKU).|
|singleSignOnIssuerHash|String|Single sign-on issuer hash.|
|trafficRules|[vpnTrafficRule](../resources/vpntrafficrule.md) collection|Traffic rules. This collection can contain a maximum of 1000 elements.|
|trustedNetworkDomains|String collection|Trusted Network Domains|
|windowsInformationProtectionDomain|String|Windows Information Protection (WIP) domain to associate with this connection.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windows10VpnConfiguration](../resources/windows10vpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windows10vpnconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windows10VpnConfiguration not found
Content-Type: application/json
Content-length: 2062

{
  "@odata.type": "#microsoft.graph.windows10VpnConfiguration",
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
  "connectionName": "String",
  "customXml": "Binary",
  "servers": [
    {
      "@odata.type": "microsoft.graph.vpnServer"
    }
  ],
  "associatedApps": [
    {
      "@odata.type": "microsoft.graph.windows10AssociatedApps"
    }
  ],
  "authenticationMethod": "String",
  "connectionType": "String",
  "cryptographySuite": {
    "@odata.type": "microsoft.graph.cryptographySuite"
  },
  "dnsRules": [
    {
      "@odata.type": "microsoft.graph.vpnDnsRule"
    }
  ],
  "dnsSuffixes": [
    "String"
  ],
  "eapXml": "Binary",
  "enableAlwaysOn": "Boolean",
  "enableConditionalAccess": "Boolean",
  "enableDeviceTunnel": "Boolean",
  "enableDnsRegistration": "Boolean",
  "enableSingleSignOnWithAlternateCertificate": "Boolean",
  "enableSplitTunneling": "Boolean",
  "onlyAssociatedAppsCanUseConnection": "Boolean",
  "profileTarget": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows10VpnProxyServer"
  },
  "rememberUserCredentials": "Boolean",
  "routes": [
    {
      "@odata.type": "microsoft.graph.vpnRoute"
    }
  ],
  "singleSignOnEku": {
    "@odata.type": "microsoft.graph.extendedKeyUsage"
  },
  "singleSignOnIssuerHash": "String",
  "trafficRules": [
    {
      "@odata.type": "microsoft.graph.vpnTrafficRule"
    }
  ],
  "trustedNetworkDomains": [
    "String"
  ],
  "windowsInformationProtectionDomain": "String"
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
  "@odata.type": "#microsoft.graph.windows10VpnConfiguration",
  "id": "38d91a6e-1a6e-38d9-6e1a-d9386e1ad938",
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
  "connectionName": "String",
  "customXml": "Binary",
  "servers": [
    {
      "@odata.type": "microsoft.graph.vpnServer"
    }
  ],
  "associatedApps": [
    {
      "@odata.type": "microsoft.graph.windows10AssociatedApps"
    }
  ],
  "authenticationMethod": "String",
  "connectionType": "String",
  "cryptographySuite": {
    "@odata.type": "microsoft.graph.cryptographySuite"
  },
  "dnsRules": [
    {
      "@odata.type": "microsoft.graph.vpnDnsRule"
    }
  ],
  "dnsSuffixes": [
    "String"
  ],
  "eapXml": "Binary",
  "enableAlwaysOn": "Boolean",
  "enableConditionalAccess": "Boolean",
  "enableDeviceTunnel": "Boolean",
  "enableDnsRegistration": "Boolean",
  "enableSingleSignOnWithAlternateCertificate": "Boolean",
  "enableSplitTunneling": "Boolean",
  "onlyAssociatedAppsCanUseConnection": "Boolean",
  "profileTarget": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows10VpnProxyServer"
  },
  "rememberUserCredentials": "Boolean",
  "routes": [
    {
      "@odata.type": "microsoft.graph.vpnRoute"
    }
  ],
  "singleSignOnEku": {
    "@odata.type": "microsoft.graph.extendedKeyUsage"
  },
  "singleSignOnIssuerHash": "String",
  "trafficRules": [
    {
      "@odata.type": "microsoft.graph.vpnTrafficRule"
    }
  ],
  "trustedNetworkDomains": [
    "String"
  ],
  "windowsInformationProtectionDomain": "String"
}
```

