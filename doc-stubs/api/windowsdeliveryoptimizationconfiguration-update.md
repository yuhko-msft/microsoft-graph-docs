---
title: "Update windowsDeliveryOptimizationConfiguration"
description: "Update the properties of a windowsDeliveryOptimizationConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsDeliveryOptimizationConfiguration
Namespace: microsoft.graph

Update the properties of a [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windowsDeliveryOptimizationConfiguration not found
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
|deliveryOptimizationMode|windowsDeliveryOptimizationMode|**TODO: Add Description**. Possible values are: `userDefined`, `httpOnly`, `httpWithPeeringNat`, `httpWithPeeringPrivateGroup`, `httpWithInternetPeering`, `simpleDownload`, `bypassMode`.|
|restrictPeerSelectionBy|deliveryOptimizationRestrictPeerSelectionByOptions|**TODO: Add Description**. Possible values are: `notConfigured`, `subnetMask`.|
|groupIdSource|[deliveryOptimizationGroupIdSource](../resources/intune-deliveryoptimizationgroupidsource.md)|**TODO: Add Description**|
|bandwidthMode|[deliveryOptimizationBandwidth](../resources/intune-deliveryoptimizationbandwidth.md)|**TODO: Add Description**|
|backgroundDownloadFromHttpDelayInSeconds|Int64|**TODO: Add Description**|
|foregroundDownloadFromHttpDelayInSeconds|Int64|**TODO: Add Description**|
|minimumRamAllowedToPeerInGigabytes|Int32|**TODO: Add Description**|
|minimumDiskSizeAllowedToPeerInGigabytes|Int32|**TODO: Add Description**|
|minimumFileSizeToCacheInMegabytes|Int32|**TODO: Add Description**|
|minimumBatteryPercentageAllowedToUpload|Int32|**TODO: Add Description**|
|modifyCacheLocation|String|**TODO: Add Description**|
|maximumCacheAgeInDays|Int32|**TODO: Add Description**|
|maximumCacheSize|[deliveryOptimizationMaxCacheSize](../resources/intune-deliveryoptimizationmaxcachesize.md)|**TODO: Add Description**|
|vpnPeerCaching|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|cacheServerHostNames|String collection|**TODO: Add Description**|
|cacheServerForegroundDownloadFallbackToHttpDelayInSeconds|Int32|**TODO: Add Description**|
|cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsdeliveryoptimizationconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windowsDeliveryOptimizationConfiguration not found
Content-Type: application/json
Content-length: 1675

{
  "@odata.type": "#microsoft.graph.windowsDeliveryOptimizationConfiguration",
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
  "deliveryOptimizationMode": "String",
  "restrictPeerSelectionBy": "String",
  "groupIdSource": {
    "@odata.type": "microsoft.graph.deliveryOptimizationGroupIdSource"
  },
  "bandwidthMode": {
    "@odata.type": "microsoft.graph.deliveryOptimizationBandwidth"
  },
  "backgroundDownloadFromHttpDelayInSeconds": "Integer",
  "foregroundDownloadFromHttpDelayInSeconds": "Integer",
  "minimumRamAllowedToPeerInGigabytes": "Integer",
  "minimumDiskSizeAllowedToPeerInGigabytes": "Integer",
  "minimumFileSizeToCacheInMegabytes": "Integer",
  "minimumBatteryPercentageAllowedToUpload": "Integer",
  "modifyCacheLocation": "String",
  "maximumCacheAgeInDays": "Integer",
  "maximumCacheSize": {
    "@odata.type": "microsoft.graph.deliveryOptimizationMaxCacheSize"
  },
  "vpnPeerCaching": "String",
  "cacheServerHostNames": [
    "String"
  ],
  "cacheServerForegroundDownloadFallbackToHttpDelayInSeconds": "Integer",
  "cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds": "Integer"
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
  "@odata.type": "#microsoft.graph.windowsDeliveryOptimizationConfiguration",
  "id": "8b82e553-e553-8b82-53e5-828b53e5828b",
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
  "deliveryOptimizationMode": "String",
  "restrictPeerSelectionBy": "String",
  "groupIdSource": {
    "@odata.type": "microsoft.graph.deliveryOptimizationGroupIdSource"
  },
  "bandwidthMode": {
    "@odata.type": "microsoft.graph.deliveryOptimizationBandwidth"
  },
  "backgroundDownloadFromHttpDelayInSeconds": "Integer",
  "foregroundDownloadFromHttpDelayInSeconds": "Integer",
  "minimumRamAllowedToPeerInGigabytes": "Integer",
  "minimumDiskSizeAllowedToPeerInGigabytes": "Integer",
  "minimumFileSizeToCacheInMegabytes": "Integer",
  "minimumBatteryPercentageAllowedToUpload": "Integer",
  "modifyCacheLocation": "String",
  "maximumCacheAgeInDays": "Integer",
  "maximumCacheSize": {
    "@odata.type": "microsoft.graph.deliveryOptimizationMaxCacheSize"
  },
  "vpnPeerCaching": "String",
  "cacheServerHostNames": [
    "String"
  ],
  "cacheServerForegroundDownloadFallbackToHttpDelayInSeconds": "Integer",
  "cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds": "Integer"
}
```

