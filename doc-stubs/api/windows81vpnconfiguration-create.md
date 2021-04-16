---
title: "Create windows81VpnConfiguration"
description: "Create a new windows81VpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windows81VpnConfiguration
Namespace: microsoft.graph



Create a new [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windows81VpnConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md) object.

The following table shows the properties that are required when you create the [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md).

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
|applyOnlyToWindows81|Boolean|Value indicating whether this policy only applies to Windows 8.1. This property is read-only.|
|connectionType|windowsVpnConnectionType|Connection type. Possible values are: `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`.|
|enableSplitTunneling|Boolean|Enable split tunneling for the VPN.|
|loginGroupOrDomain|String|Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.|
|proxyServer|[windows81VpnProxyServer](../resources/windows81vpnproxyserver.md)|Proxy Server.|



## Response

If successful, this method returns a `201 Created` response code and a [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windows81vpnconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windows81VpnConfiguration not found
Content-Type: application/json
Content-length: 1016

{
  "@odata.type": "#microsoft.graph.windows81VpnConfiguration",
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
  "applyOnlyToWindows81": "Boolean",
  "connectionType": "String",
  "enableSplitTunneling": "Boolean",
  "loginGroupOrDomain": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows81VpnProxyServer"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows81VpnConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windows81VpnConfiguration",
  "id": "1dc4be8d-be8d-1dc4-8dbe-c41d8dbec41d",
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
  "applyOnlyToWindows81": "Boolean",
  "connectionType": "String",
  "enableSplitTunneling": "Boolean",
  "loginGroupOrDomain": "String",
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows81VpnProxyServer"
  }
}
```

