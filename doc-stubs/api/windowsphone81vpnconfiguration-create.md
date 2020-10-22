---
title: "Create windowsPhone81VpnConfiguration"
description: "Create a new windowsPhone81VpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsPhone81VpnConfiguration
Namespace: microsoft.graph

Create a new [windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windowsPhone81VpnConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md) object.

The following table shows the properties that are required when you create the [windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md).

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
|applyOnlyToWindows81|Boolean|**TODO: Add Description** Inherited from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|
|connectionType|windowsVpnConnectionType|**TODO: Add Description** Inherited from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md). Possible values are: `pulseSecure`, `f5EdgeClient`, `dellSonicWallMobileConnect`, `checkPointCapsuleVpn`.|
|loginGroupOrDomain|String|**TODO: Add Description** Inherited from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|
|enableSplitTunneling|Boolean|**TODO: Add Description** Inherited from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|
|proxyServer|[windows81VpnProxyServer](../resources/intune-windows81vpnproxyserver.md)|**TODO: Add Description** Inherited from [windows81VpnConfiguration](../resources/windows81vpnconfiguration.md)|
|bypassVpnOnCompanyWifi|Boolean|**TODO: Add Description**|
|bypassVpnOnHomeWifi|Boolean|**TODO: Add Description**|
|authenticationMethod|vpnAuthenticationMethod|**TODO: Add Description**. Possible values are: `certificate`, `usernameAndPassword`, `sharedSecret`, `derivedCredential`, `azureAD`.|
|rememberUserCredentials|Boolean|**TODO: Add Description**|
|dnsSuffixSearchList|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [windowsPhone81VpnConfiguration](../resources/windowsphone81vpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsphone81vpnconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.windowsPhone81VpnConfiguration not found
Content-Type: application/json
Content-length: 1224

{
  "@odata.type": "#microsoft.graph.windowsPhone81VpnConfiguration",
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
  "applyOnlyToWindows81": "Boolean",
  "connectionType": "String",
  "loginGroupOrDomain": "String",
  "enableSplitTunneling": "Boolean",
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows81VpnProxyServer"
  },
  "bypassVpnOnCompanyWifi": "Boolean",
  "bypassVpnOnHomeWifi": "Boolean",
  "authenticationMethod": "String",
  "rememberUserCredentials": "Boolean",
  "dnsSuffixSearchList": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsPhone81VpnConfiguration"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.windowsPhone81VpnConfiguration",
  "id": "790b1fb4-1fb4-790b-b41f-0b79b41f0b79",
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
  "applyOnlyToWindows81": "Boolean",
  "connectionType": "String",
  "loginGroupOrDomain": "String",
  "enableSplitTunneling": "Boolean",
  "proxyServer": {
    "@odata.type": "microsoft.graph.windows81VpnProxyServer"
  },
  "bypassVpnOnCompanyWifi": "Boolean",
  "bypassVpnOnHomeWifi": "Boolean",
  "authenticationMethod": "String",
  "rememberUserCredentials": "Boolean",
  "dnsSuffixSearchList": [
    "String"
  ]
}
```

