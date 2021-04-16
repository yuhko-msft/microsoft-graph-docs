---
title: "Create windowsDeliveryOptimizationConfiguration"
description: "Create a new windowsDeliveryOptimizationConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsDeliveryOptimizationConfiguration
Namespace: microsoft.graph



Create a new [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windowsDeliveryOptimizationConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) object.

The following table shows the properties that are required when you create the [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md).

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
|backgroundDownloadFromHttpDelayInSeconds|Int64|Specifies number of seconds to delay an HTTP source in a background download that is allowed to use peer-to-peer. Valid values 0 to 4294967295|
|bandwidthMode|[deliveryOptimizationBandwidth](../resources/deliveryoptimizationbandwidth.md)|Specifies foreground and background bandwidth usage using percentages, absolutes, or hours.|
|cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds|Int32|Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a background download. Valid values 0 to 2592000.|
|cacheServerForegroundDownloadFallbackToHttpDelayInSeconds|Int32|Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a foreground download. Valid values 0 to 2592000.​|
|cacheServerHostNames|String collection|Specifies cache servers host names.|
|deliveryOptimizationMode|windowsDeliveryOptimizationMode|Specifies the download method that delivery optimization can use to manage network bandwidth consumption for large content distribution scenarios. Possible values are: `userDefined`, `httpOnly`, `httpWithPeeringNat`, `httpWithPeeringPrivateGroup`, `httpWithInternetPeering`, `simpleDownload`, `bypassMode`.|
|foregroundDownloadFromHttpDelayInSeconds|Int64|Specifies number of seconds to delay an HTTP source in a foreground download that is allowed to use peer-to-peer (0-86400). Valid values 0 to 86400
Specifying 0 sets Delivery Optimization to manage this setting using the cloud service. Valid values 0 to 86400|
|groupIdSource|[deliveryOptimizationGroupIdSource](../resources/deliveryoptimizationgroupidsource.md)|Specifies to restrict peer selection to a specfic source.
The options set in this policy only apply to Delivery Optimization mode Group (2) download mode. If Group (2) isn't set as Download mode, this policy will be ignored. For option 3 - DHCP Option ID, the client will query DHCP Option ID 234 and use the returned GUID value as the Group ID.|
|maximumCacheAgeInDays|Int32|Specifies the maximum time in days that each file is held in the Delivery Optimization cache after downloading successfully (0-3650). Valid values 0 to 3650|
|maximumCacheSize|[deliveryOptimizationMaxCacheSize](../resources/deliveryoptimizationmaxcachesize.md)|Specifies the maximum cache size that Delivery Optimization either as a percentage or in GB.|
|minimumBatteryPercentageAllowedToUpload|Int32|Specifies the minimum battery percentage to allow the device to upload data (0-100). Valid values 0 to 100
The default value is 0. The value 0 (zero) means "not limited" and the cloud service default value will be used. Valid values 0 to 100|
|minimumDiskSizeAllowedToPeerInGigabytes|Int32|Specifies the minimum disk size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
Recommended values: 64 GB to 256 GB. Valid values 1 to 100000|
|minimumFileSizeToCacheInMegabytes|Int32|Specifies the minimum content file size in MB enabled to use Peer Caching (1-100000). Valid values 1 to 100000
Recommended values: 1 MB to 100,000 MB. Valid values 1 to 100000|
|minimumRamAllowedToPeerInGigabytes|Int32|Specifies the minimum RAM size in GB to use Peer Caching (1-100000). Valid values 1 to 100000|
|modifyCacheLocation|String|Specifies the drive that Delivery Optimization should use for its cache.|
|restrictPeerSelectionBy|deliveryOptimizationRestrictPeerSelectionByOptions|Specifies to restrict peer selection via selected option.
Option 1 (Subnet mask) only applies to Delivery Optimization modes Download Mode LAN (1) and Group (2). Possible values are: `notConfigured`, `subnetMask`.|
|vpnPeerCaching|enablement|Specifies whether the device is allowed to participate in Peer Caching while connected via VPN to the domain network. Possible values are: `notConfigured`, `enabled`, `disabled`.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsdeliveryoptimizationconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsDeliveryOptimizationConfiguration not found
Content-Type: application/json
Content-length: 1675

{
  "@odata.type": "#microsoft.graph.windowsDeliveryOptimizationConfiguration",
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
  "backgroundDownloadFromHttpDelayInSeconds": "Integer",
  "bandwidthMode": {
    "@odata.type": "microsoft.graph.deliveryOptimizationBandwidth"
  },
  "cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds": "Integer",
  "cacheServerForegroundDownloadFallbackToHttpDelayInSeconds": "Integer",
  "cacheServerHostNames": [
    "String"
  ],
  "deliveryOptimizationMode": "String",
  "foregroundDownloadFromHttpDelayInSeconds": "Integer",
  "groupIdSource": {
    "@odata.type": "microsoft.graph.deliveryOptimizationGroupIdSource"
  },
  "maximumCacheAgeInDays": "Integer",
  "maximumCacheSize": {
    "@odata.type": "microsoft.graph.deliveryOptimizationMaxCacheSize"
  },
  "minimumBatteryPercentageAllowedToUpload": "Integer",
  "minimumDiskSizeAllowedToPeerInGigabytes": "Integer",
  "minimumFileSizeToCacheInMegabytes": "Integer",
  "minimumRamAllowedToPeerInGigabytes": "Integer",
  "modifyCacheLocation": "String",
  "restrictPeerSelectionBy": "String",
  "vpnPeerCaching": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsDeliveryOptimizationConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsDeliveryOptimizationConfiguration",
  "id": "a4645637-5637-a464-3756-64a4375664a4",
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
  "backgroundDownloadFromHttpDelayInSeconds": "Integer",
  "bandwidthMode": {
    "@odata.type": "microsoft.graph.deliveryOptimizationBandwidth"
  },
  "cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds": "Integer",
  "cacheServerForegroundDownloadFallbackToHttpDelayInSeconds": "Integer",
  "cacheServerHostNames": [
    "String"
  ],
  "deliveryOptimizationMode": "String",
  "foregroundDownloadFromHttpDelayInSeconds": "Integer",
  "groupIdSource": {
    "@odata.type": "microsoft.graph.deliveryOptimizationGroupIdSource"
  },
  "maximumCacheAgeInDays": "Integer",
  "maximumCacheSize": {
    "@odata.type": "microsoft.graph.deliveryOptimizationMaxCacheSize"
  },
  "minimumBatteryPercentageAllowedToUpload": "Integer",
  "minimumDiskSizeAllowedToPeerInGigabytes": "Integer",
  "minimumFileSizeToCacheInMegabytes": "Integer",
  "minimumRamAllowedToPeerInGigabytes": "Integer",
  "modifyCacheLocation": "String",
  "restrictPeerSelectionBy": "String",
  "vpnPeerCaching": "String"
}
```

