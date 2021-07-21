---
title: "Create windowsPhone81GeneralConfiguration"
description: "Create a new windowsPhone81GeneralConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsPhone81GeneralConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [windowsPhone81GeneralConfiguration](../resources/windowsphone81generalconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windowsPhone81GeneralConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsPhone81GeneralConfiguration](../resources/windowsphone81generalconfiguration.md) object.

The following table shows the properties that are required when you create the [windowsPhone81GeneralConfiguration](../resources/windowsphone81generalconfiguration.md).

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
|applyOnlyToWindowsPhone81|Boolean|Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only.|
|appsBlockCopyPaste|Boolean|Indicates whether or not to block copy paste.|
|bluetoothBlocked|Boolean|Indicates whether or not to block bluetooth.|
|cameraBlocked|Boolean|Indicates whether or not to block camera.|
|cellularBlockWifiTethering|Boolean|Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.|
|compliantAppListType|appListType|List that is in the AppComplianceList. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|compliantAppsList|[appListItem](../resources/applistitem.md) collection|List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.|
|diagnosticDataBlockSubmission|Boolean|Indicates whether or not to block diagnostic data submission.|
|emailBlockAddingAccounts|Boolean|Indicates whether or not to block custom email accounts.|
|locationServicesBlocked|Boolean|Indicates whether or not to block location services.|
|microsoftAccountBlocked|Boolean|Indicates whether or not to block using a Microsoft Account.|
|nfcBlocked|Boolean|Indicates whether or not to block Near-Field Communication.|
|passwordBlockSimple|Boolean|Indicates whether or not to block syncing the calendar.|
|passwordExpirationDays|Int32|Number of days before the password expires.|
|passwordMinimumCharacterSetCount|Int32|Number of character sets a password must contain.|
|passwordMinimumLength|Int32|Minimum length of passwords.|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before screen timeout.|
|passwordPreviousPasswordBlockCount|Int32|Number of previous passwords to block. Valid values 0 to 24|
|passwordRequired|Boolean|Indicates whether or not to require a password.|
|passwordRequiredType|requiredPasswordType|Password type that is required. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|Number of sign in failures allowed before factory reset.|
|screenCaptureBlocked|Boolean|Indicates whether or not to block screenshots.|
|storageBlockRemovableStorage|Boolean|Indicates whether or not to block removable storage.|
|storageRequireEncryption|Boolean|Indicates whether or not to require encryption.|
|webBrowserBlocked|Boolean|Indicates whether or not to block the web browser.|
|wifiBlockAutomaticConnectHotspots|Boolean|Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.|
|wifiBlocked|Boolean|Indicates whether or not to block Wi-Fi.|
|wifiBlockHotspotReporting|Boolean|Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.|
|windowsStoreBlocked|Boolean|Indicates whether or not to block the Windows Store.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsPhone81GeneralConfiguration](../resources/windowsphone81generalconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsphone81generalconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.windowsPhone81GeneralConfiguration not found
Content-Type: application/json
Content-length: 1910

{
  "@odata.type": "#microsoft.graph.windowsPhone81GeneralConfiguration",
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
  "applyOnlyToWindowsPhone81": "Boolean",
  "appsBlockCopyPaste": "Boolean",
  "bluetoothBlocked": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWifiTethering": "Boolean",
  "compliantAppListType": "String",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "diagnosticDataBlockSubmission": "Boolean",
  "emailBlockAddingAccounts": "Boolean",
  "locationServicesBlocked": "Boolean",
  "microsoftAccountBlocked": "Boolean",
  "nfcBlocked": "Boolean",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "screenCaptureBlocked": "Boolean",
  "storageBlockRemovableStorage": "Boolean",
  "storageRequireEncryption": "Boolean",
  "webBrowserBlocked": "Boolean",
  "wifiBlockAutomaticConnectHotspots": "Boolean",
  "wifiBlocked": "Boolean",
  "wifiBlockHotspotReporting": "Boolean",
  "windowsStoreBlocked": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsPhone81GeneralConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsPhone81GeneralConfiguration",
  "id": "9f6f0315-0315-9f6f-1503-6f9f15036f9f",
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
  "applyOnlyToWindowsPhone81": "Boolean",
  "appsBlockCopyPaste": "Boolean",
  "bluetoothBlocked": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWifiTethering": "Boolean",
  "compliantAppListType": "String",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "diagnosticDataBlockSubmission": "Boolean",
  "emailBlockAddingAccounts": "Boolean",
  "locationServicesBlocked": "Boolean",
  "microsoftAccountBlocked": "Boolean",
  "nfcBlocked": "Boolean",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "screenCaptureBlocked": "Boolean",
  "storageBlockRemovableStorage": "Boolean",
  "storageRequireEncryption": "Boolean",
  "webBrowserBlocked": "Boolean",
  "wifiBlockAutomaticConnectHotspots": "Boolean",
  "wifiBlocked": "Boolean",
  "wifiBlockHotspotReporting": "Boolean",
  "windowsStoreBlocked": "Boolean"
}
```

