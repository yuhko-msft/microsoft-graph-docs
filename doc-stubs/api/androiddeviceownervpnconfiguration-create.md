---
title: "Create androidDeviceOwnerVpnConfiguration"
description: "Create a new androidDeviceOwnerVpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidDeviceOwnerVpnConfiguration
Namespace: microsoft.graph



Create a new [androidDeviceOwnerVpnConfiguration](../resources/androiddeviceownervpnconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.androidDeviceOwnerVpnConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidDeviceOwnerVpnConfiguration](../resources/androiddeviceownervpnconfiguration.md) object.

The following table shows the properties that are required when you create the [androidDeviceOwnerVpnConfiguration](../resources/androiddeviceownervpnconfiguration.md).

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
|authenticationMethod|vpnAuthenticationMethod|Authentication method. Inherited from [vpnConfiguration](../resources/vpnconfiguration.md). Possible values are: `certificate`, `usernameAndPassword`, `sharedSecret`, `derivedCredential`, `azureAD`.|
|connectionName|String|Connection name displayed to the user. Inherited from [vpnConfiguration](../resources/vpnconfiguration.md)|
|realm|String|Realm when connection type is set to Pulse Secure. Inherited from [vpnConfiguration](../resources/vpnconfiguration.md)|
|role|String|Role when connection type is set to Pulse Secure. Inherited from [vpnConfiguration](../resources/vpnconfiguration.md)|
|servers|[vpnServer](../resources/vpnserver.md) collection|List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements. Inherited from [vpnConfiguration](../resources/vpnconfiguration.md)|
|alwaysOn|Boolean|Whether or not to enable always-on VPN connection.|
|alwaysOnLockdown|Boolean|If always-on VPN connection is enabled, whether or not to lock network traffic when that VPN is disconnected.|
|connectionType|androidVpnConnectionType|Connection type. Possible values are: `ciscoAnyConnect`, `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`, `citrix`, `microsoftTunnel`, `netMotionMobility`, `microsoftProtect`.|
|customData|[keyValue](../resources/keyvalue.md) collection|Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.|
|customKeyValueData|[keyValuePair](../resources/keyvaluepair.md) collection|Custom data to define key/value pairs specific to a VPN provider. This collection can contain a maximum of 25 elements.|
|microsoftTunnelSiteId|String|Microsoft Tunnel site ID.|
|proxyServer|[vpnProxyServer](../resources/vpnproxyserver.md)|Proxy server.|
|targetedMobileApps|[appListItem](../resources/applistitem.md) collection|Targeted mobile apps. This collection can contain a maximum of 500 elements.|
|targetedPackageIds|String collection|Targeted App package IDs.|



## Response

If successful, this method returns a `201 Created` response code and an [androidDeviceOwnerVpnConfiguration](../resources/androiddeviceownervpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androiddeviceownervpnconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidDeviceOwnerVpnConfiguration not found
Content-Type: application/json
Content-length: 1391

{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerVpnConfiguration",
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
  "authenticationMethod": "String",
  "connectionName": "String",
  "realm": "String",
  "role": "String",
  "servers": [
    {
      "@odata.type": "microsoft.graph.vpnServer"
    }
  ],
  "alwaysOn": "Boolean",
  "alwaysOnLockdown": "Boolean",
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
  "microsoftTunnelSiteId": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "targetedMobileApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "targetedPackageIds": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidDeviceOwnerVpnConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerVpnConfiguration",
  "id": "805ffb99-fb99-805f-99fb-5f8099fb5f80",
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
  "authenticationMethod": "String",
  "connectionName": "String",
  "realm": "String",
  "role": "String",
  "servers": [
    {
      "@odata.type": "microsoft.graph.vpnServer"
    }
  ],
  "alwaysOn": "Boolean",
  "alwaysOnLockdown": "Boolean",
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
  "microsoftTunnelSiteId": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.vpnProxyServer"
  },
  "targetedMobileApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "targetedPackageIds": [
    "String"
  ]
}
```

