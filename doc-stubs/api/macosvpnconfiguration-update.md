---
title: "Update macOSVpnConfiguration"
description: "Update the properties of a macOSVpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOSVpnConfiguration
Namespace: microsoft.graph



Update the properties of a [macOSVpnConfiguration](../resources/macosvpnconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.macOSVpnConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSVpnConfiguration](../resources/macosvpnconfiguration.md) object.

The following table shows the properties that are required when you update the [macOSVpnConfiguration](../resources/macosvpnconfiguration.md).

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
|associatedDomains|String collection|Associated Domains Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|authenticationMethod|vpnAuthenticationMethod|Authentication method for this VPN connection. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `certificate`, `usernameAndPassword`, `sharedSecret`, `derivedCredential`, `azureAD`.|
|connectionName|String|Connection name displayed to the user. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|connectionType|appleVpnConnectionType|Connection type. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `ciscoAnyConnect`, `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`, `customVpn`, `ciscoIPSec`, `citrix`, `ciscoAnyConnectV2`, `paloAltoGlobalProtect`, `zscalerPrivateAccess`, `f5Access2018`, `citrixSso`, `paloAltoGlobalProtectV2`, `ikEv2`, `alwaysOn`, `microsoftTunnel`, `netMotionMobility`, `microsoftProtect`.|
|customData|[keyValue](../resources/keyvalue.md) collection|Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|customKeyValueData|[keyValuePair](../resources/keyvaluepair.md) collection|Custom data when connection type is set to Custom VPN. Use this field to enable functionality not supported by Intune, but available in your VPN solution. Contact your VPN vendor to learn how to add these key/value pairs. This collection can contain a maximum of 25 elements. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|disableOnDemandUserOverride|Boolean|Toggle to prevent user from disabling automatic VPN in the Settings app Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|enablePerApp|Boolean|Setting this to true creates Per-App VPN payload which can later be associated with Apps that can trigger this VPN conneciton on the end user's iOS device. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|enableSplitTunneling|Boolean|Send all network traffic through VPN. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|excludedDomains|String collection|Domains that are accessed through the public internet instead of through VPN, even when per-app VPN is activated Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|identifier|String|Identifier provided by VPN vendor when connection type is set to Custom VPN. For example: Cisco AnyConnect uses an identifier of the form com.cisco.anyconnect.applevpn.plugin Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|loginGroupOrDomain|String|Login group or domain when connection type is set to Dell SonicWALL Mobile Connection. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|onDemandRules|[vpnOnDemandRule](../resources/vpnondemandrule.md) collection|On-Demand Rules. This collection can contain a maximum of 500 elements. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|optInToDeviceIdSharing|Boolean|Opt-In to sharing the device's Id to third-party vpn clients for use during network access control validation. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|providerType|vpnProviderType|Provider type for per-app VPN. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `notConfigured`, `appProxy`, `packetTunnel`.|
|proxyServer|[vpnProxyServer](../resources/vpnproxyserver.md)|Proxy Server. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|realm|String|Realm when connection type is set to Pulse Secure. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|role|String|Role when connection type is set to Pulse Secure. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|safariDomains|String collection|Safari domains when this VPN per App setting is enabled. In addition to the apps associated with this VPN, Safari domains specified here will also be able to trigger this VPN connection. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|server|[vpnServer](../resources/vpnserver.md)|VPN Server on the network. Make sure end users can access this network location. Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOSVpnConfiguration](../resources/macosvpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macosvpnconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSVpnConfiguration not found
Content-Type: application/json
Content-length: 1591

{
  "@odata.type": "#microsoft.graph.macOSVpnConfiguration",
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
  "associatedDomains": [
    "String"
  ],
  "authenticationMethod": "String",
  "connectionName": "String",
  "connectionType": "String",
  "customData": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ],
  "customKeyValueData": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "disableOnDemandUserOverride": "Boolean",
  "enablePerApp": "Boolean",
  "enableSplitTunneling": "Boolean",
  "excludedDomains": [
    "String"
  ],
  "identifier": "String",
  "loginGroupOrDomain": "String",
  "onDemandRules": [
    {
      "@odata.type": "microsoft.graph.vpnOnDemandRule"
    }
  ],
  "optInToDeviceIdSharing": "Boolean",
  "providerType": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "realm": "String",
  "role": "String",
  "safariDomains": [
    "String"
  ],
  "server": {
    "@odata.type": "microsoft.graph.vpnServer"
  }
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
  "@odata.type": "#microsoft.graph.macOSVpnConfiguration",
  "id": "84a17f83-7f83-84a1-837f-a184837fa184",
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
  "associatedDomains": [
    "String"
  ],
  "authenticationMethod": "String",
  "connectionName": "String",
  "connectionType": "String",
  "customData": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ],
  "customKeyValueData": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "disableOnDemandUserOverride": "Boolean",
  "enablePerApp": "Boolean",
  "enableSplitTunneling": "Boolean",
  "excludedDomains": [
    "String"
  ],
  "identifier": "String",
  "loginGroupOrDomain": "String",
  "onDemandRules": [
    {
      "@odata.type": "microsoft.graph.vpnOnDemandRule"
    }
  ],
  "optInToDeviceIdSharing": "Boolean",
  "providerType": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "realm": "String",
  "role": "String",
  "safariDomains": [
    "String"
  ],
  "server": {
    "@odata.type": "microsoft.graph.vpnServer"
  }
}
```

