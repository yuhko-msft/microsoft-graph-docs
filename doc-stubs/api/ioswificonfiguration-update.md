---
title: "Update iosWiFiConfiguration"
description: "Update the properties of an iosWiFiConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosWiFiConfiguration
Namespace: microsoft.graph



Update the properties of an [iosWiFiConfiguration](../resources/ioswificonfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.iosWiFiConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosWiFiConfiguration](../resources/ioswificonfiguration.md) object.

The following table shows the properties that are required when you update the [iosWiFiConfiguration](../resources/ioswificonfiguration.md).

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
|connectAutomatically|Boolean|Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network.|
|connectWhenNetworkNameIsHidden|Boolean|Connect when the network is not broadcasting its name (SSID). When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.|
|disableMacAddressRandomization|Boolean|If set to true, forces devices connecting using this Wi-Fi profile to present their actual Wi-Fi MAC address instead of a random MAC address. Applies to iOS 14 and later.|
|networkName|String|Network Name|
|preSharedKey|String|This is the pre-shared key for WPA Personal Wi-Fi network.|
|proxyAutomaticConfigurationUrl|String|URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.|
|proxyManualAddress|String|IP Address or DNS hostname of the proxy server when manual configuration is selected.|
|proxyManualPort|Int32|Port of the proxy server when manual configuration is selected.|
|proxySettings|wiFiProxySetting|Proxy Type for this Wi-Fi connection. Possible values are: `none`, `manual`, `automatic`.|
|ssid|String|This is the name of the Wi-Fi network that is broadcast to all devices.|
|wiFiSecurityType|wiFiSecurityType|Indicates whether Wi-Fi endpoint uses an EAP based security type. Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Personal`, `wpa2Enterprise`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosWiFiConfiguration](../resources/ioswificonfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_ioswificonfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.iosWiFiConfiguration not found
Content-Type: application/json
Content-length: 1028

{
  "@odata.type": "#microsoft.graph.iosWiFiConfiguration",
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
  "disableMacAddressRandomization": "Boolean",
  "networkName": "String",
  "preSharedKey": "String",
  "proxyAutomaticConfigurationUrl": "String",
  "proxyManualAddress": "String",
  "proxyManualPort": "Integer",
  "proxySettings": "String",
  "ssid": "String",
  "wiFiSecurityType": "String"
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
  "@odata.type": "#microsoft.graph.iosWiFiConfiguration",
  "id": "82832ef5-2ef5-8283-f52e-8382f52e8382",
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
  "disableMacAddressRandomization": "Boolean",
  "networkName": "String",
  "preSharedKey": "String",
  "proxyAutomaticConfigurationUrl": "String",
  "proxyManualAddress": "String",
  "proxyManualPort": "Integer",
  "proxySettings": "String",
  "ssid": "String",
  "wiFiSecurityType": "String"
}
```

