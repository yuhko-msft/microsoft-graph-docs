---
title: "Update iosVpnConfiguration"
description: "Update the properties of an iosVpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosVpnConfiguration
Namespace: microsoft.graph

Update the properties of an [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.iosVpnConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.

The following table shows the properties that are required when you create the [iosVpnConfiguration](../resources/iosvpnconfiguration.md).

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
|connectionName|String|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|connectionType|appleVpnConnectionType|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `ciscoAnyConnect`, `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`, `customVpn`, `ciscoIPSec`, `citrix`, `ciscoAnyConnectV2`, `paloAltoGlobalProtect`, `zscalerPrivateAccess`, `f5Access2018`, `citrixSso`, `paloAltoGlobalProtectV2`, `ikEv2`, `alwaysOn`, `microsoftTunnel`, `netMotionMobility`.|
|loginGroupOrDomain|String|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|role|String|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|realm|String|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|server|[vpnServer](../resources/intune-vpnserver.md)|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|identifier|String|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|customData|[keyValue](../resources/intune-keyvalue.md) collection|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|customKeyValueData|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|enableSplitTunneling|Boolean|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|authenticationMethod|vpnAuthenticationMethod|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `certificate`, `usernameAndPassword`, `sharedSecret`, `derivedCredential`, `azureAD`.|
|enablePerApp|Boolean|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|safariDomains|String collection|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|onDemandRules|[vpnOnDemandRule](../resources/intune-vpnondemandrule.md) collection|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|providerType|vpnProviderType|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md). Possible values are: `notConfigured`, `appProxy`, `packetTunnel`.|
|excludedDomains|String collection|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|disableOnDemandUserOverride|Boolean|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|proxyServer|[vpnProxyServer](../resources/intune-vpnproxyserver.md)|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|optInToDeviceIdSharing|Boolean|**TODO: Add Description** Inherited from [appleVpnConfiguration](../resources/applevpnconfiguration.md)|
|userDomain|String|**TODO: Add Description**|
|strictEnforcement|Boolean|**TODO: Add Description**|
|cloudName|String|**TODO: Add Description**|
|excludeList|String collection|**TODO: Add Description**|
|targetedMobileApps|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|microsoftTunnelSiteId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_iosvpnconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosVpnConfiguration not found
Content-Type: application/json
Content-length: 1808

{
  "@odata.type": "#microsoft.graph.iosVpnConfiguration",
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
  "connectionType": "String",
  "loginGroupOrDomain": "String",
  "role": "String",
  "realm": "String",
  "server": {
    "@odata.type": "microsoft.graph.vpnServer"
  },
  "identifier": "String",
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
  "enableSplitTunneling": "Boolean",
  "authenticationMethod": "String",
  "enablePerApp": "Boolean",
  "safariDomains": [
    "String"
  ],
  "onDemandRules": [
    {
      "@odata.type": "microsoft.graph.vpnOnDemandRule"
    }
  ],
  "providerType": "String",
  "excludedDomains": [
    "String"
  ],
  "disableOnDemandUserOverride": "Boolean",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "optInToDeviceIdSharing": "Boolean",
  "userDomain": "String",
  "strictEnforcement": "Boolean",
  "cloudName": "String",
  "excludeList": [
    "String"
  ],
  "targetedMobileApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "microsoftTunnelSiteId": "String"
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
  "@odata.type": "#microsoft.graph.iosVpnConfiguration",
  "id": "053dde6f-de6f-053d-6fde-3d056fde3d05",
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
  "connectionType": "String",
  "loginGroupOrDomain": "String",
  "role": "String",
  "realm": "String",
  "server": {
    "@odata.type": "microsoft.graph.vpnServer"
  },
  "identifier": "String",
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
  "enableSplitTunneling": "Boolean",
  "authenticationMethod": "String",
  "enablePerApp": "Boolean",
  "safariDomains": [
    "String"
  ],
  "onDemandRules": [
    {
      "@odata.type": "microsoft.graph.vpnOnDemandRule"
    }
  ],
  "providerType": "String",
  "excludedDomains": [
    "String"
  ],
  "disableOnDemandUserOverride": "Boolean",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "optInToDeviceIdSharing": "Boolean",
  "userDomain": "String",
  "strictEnforcement": "Boolean",
  "cloudName": "String",
  "excludeList": [
    "String"
  ],
  "targetedMobileApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "microsoftTunnelSiteId": "String"
}
```

