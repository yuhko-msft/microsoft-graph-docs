---
title: "Create windowsWifiConfiguration"
description: "Create a new windowsWifiConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsWifiConfiguration
Namespace: microsoft.graph



Create a new [windowsWifiConfiguration](../resources/windowswificonfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windowsWifiConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsWifiConfiguration](../resources/windowswificonfiguration.md) object.

The following table shows the properties that are required when you create the [windowsWifiConfiguration](../resources/windowswificonfiguration.md).

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
|connectAutomatically|Boolean|Specify whether the wifi connection should connect automatically when in range.|
|connectToPreferredNetwork|Boolean|Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true.|
|connectWhenNetworkNameIsHidden|Boolean|Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting.|
|forceFIPSCompliance|Boolean|Specify whether to force FIPS compliance.|
|meteredConnectionLimit|meteredConnectionLimitType|Specify the metered connection limit type for the wifi connection. Possible values are: `unrestricted`, `fixed`, `variable`.|
|networkName|String|Specify the network configuration name.|
|preSharedKey|String|This is the pre-shared key for WPA Personal Wi-Fi network.|
|proxyAutomaticConfigurationUrl|String|Specify the URL for the proxy server configuration script.|
|proxyManualAddress|String|Specify the IP address for the proxy server.|
|proxyManualPort|Int32|Specify the port for the proxy server.|
|proxySetting|wiFiProxySetting|Specify the proxy setting for Wi-Fi configuration. Possible values are: `none`, `manual`, `automatic`.|
|ssid|String|Specify the SSID of the wifi connection.|
|wifiSecurityType|wiFiSecurityType|Specify the Wifi Security Type. Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Personal`, `wpa2Enterprise`.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsWifiConfiguration](../resources/windowswificonfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowswificonfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsWifiConfiguration not found
Content-Type: application/json
Content-length: 1102

{
  "@odata.type": "#microsoft.graph.windowsWifiConfiguration",
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
  "connectToPreferredNetwork": "Boolean",
  "connectWhenNetworkNameIsHidden": "Boolean",
  "forceFIPSCompliance": "Boolean",
  "meteredConnectionLimit": "String",
  "networkName": "String",
  "preSharedKey": "String",
  "proxyAutomaticConfigurationUrl": "String",
  "proxyManualAddress": "String",
  "proxyManualPort": "Integer",
  "proxySetting": "String",
  "ssid": "String",
  "wifiSecurityType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsWifiConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsWifiConfiguration",
  "id": "580c3fc2-3fc2-580c-c23f-0c58c23f0c58",
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
  "connectToPreferredNetwork": "Boolean",
  "connectWhenNetworkNameIsHidden": "Boolean",
  "forceFIPSCompliance": "Boolean",
  "meteredConnectionLimit": "String",
  "networkName": "String",
  "preSharedKey": "String",
  "proxyAutomaticConfigurationUrl": "String",
  "proxyManualAddress": "String",
  "proxyManualPort": "Integer",
  "proxySetting": "String",
  "ssid": "String",
  "wifiSecurityType": "String"
}
```

