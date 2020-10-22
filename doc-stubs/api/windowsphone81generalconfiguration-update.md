---
title: "Update windowsPhone81GeneralConfiguration"
description: "Update the properties of a windowsPhone81GeneralConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsPhone81GeneralConfiguration
Namespace: microsoft.graph

Update the properties of a [windowsPhone81GeneralConfiguration](../resources/windowsphone81generalconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windowsPhone81GeneralConfiguration not found
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
|applyOnlyToWindowsPhone81|Boolean|**TODO: Add Description**|
|appsBlockCopyPaste|Boolean|**TODO: Add Description**|
|bluetoothBlocked|Boolean|**TODO: Add Description**|
|cameraBlocked|Boolean|**TODO: Add Description**|
|cellularBlockWifiTethering|Boolean|**TODO: Add Description**|
|compliantAppsList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|compliantAppListType|appListType|**TODO: Add Description**. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|diagnosticDataBlockSubmission|Boolean|**TODO: Add Description**|
|emailBlockAddingAccounts|Boolean|**TODO: Add Description**|
|locationServicesBlocked|Boolean|**TODO: Add Description**|
|microsoftAccountBlocked|Boolean|**TODO: Add Description**|
|nfcBlocked|Boolean|**TODO: Add Description**|
|passwordBlockSimple|Boolean|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|passwordMinimumCharacterSetCount|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|passwordRequiredType|requiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passwordRequired|Boolean|**TODO: Add Description**|
|screenCaptureBlocked|Boolean|**TODO: Add Description**|
|storageBlockRemovableStorage|Boolean|**TODO: Add Description**|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|webBrowserBlocked|Boolean|**TODO: Add Description**|
|wifiBlocked|Boolean|**TODO: Add Description**|
|wifiBlockAutomaticConnectHotspots|Boolean|**TODO: Add Description**|
|wifiBlockHotspotReporting|Boolean|**TODO: Add Description**|
|windowsStoreBlocked|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsPhone81GeneralConfiguration](../resources/windowsphone81generalconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsphone81generalconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windowsPhone81GeneralConfiguration not found
Content-Type: application/json
Content-length: 1910

{
  "@odata.type": "#microsoft.graph.windowsPhone81GeneralConfiguration",
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
  "applyOnlyToWindowsPhone81": "Boolean",
  "appsBlockCopyPaste": "Boolean",
  "bluetoothBlocked": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWifiTethering": "Boolean",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "compliantAppListType": "String",
  "diagnosticDataBlockSubmission": "Boolean",
  "emailBlockAddingAccounts": "Boolean",
  "locationServicesBlocked": "Boolean",
  "microsoftAccountBlocked": "Boolean",
  "nfcBlocked": "Boolean",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "passwordRequiredType": "String",
  "passwordRequired": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "storageBlockRemovableStorage": "Boolean",
  "storageRequireEncryption": "Boolean",
  "webBrowserBlocked": "Boolean",
  "wifiBlocked": "Boolean",
  "wifiBlockAutomaticConnectHotspots": "Boolean",
  "wifiBlockHotspotReporting": "Boolean",
  "windowsStoreBlocked": "Boolean"
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
  "@odata.type": "#microsoft.graph.windowsPhone81GeneralConfiguration",
  "id": "933bf172-f172-933b-72f1-3b9372f13b93",
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
  "applyOnlyToWindowsPhone81": "Boolean",
  "appsBlockCopyPaste": "Boolean",
  "bluetoothBlocked": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWifiTethering": "Boolean",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "compliantAppListType": "String",
  "diagnosticDataBlockSubmission": "Boolean",
  "emailBlockAddingAccounts": "Boolean",
  "locationServicesBlocked": "Boolean",
  "microsoftAccountBlocked": "Boolean",
  "nfcBlocked": "Boolean",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "passwordRequiredType": "String",
  "passwordRequired": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "storageBlockRemovableStorage": "Boolean",
  "storageRequireEncryption": "Boolean",
  "webBrowserBlocked": "Boolean",
  "wifiBlocked": "Boolean",
  "wifiBlockAutomaticConnectHotspots": "Boolean",
  "wifiBlockHotspotReporting": "Boolean",
  "windowsStoreBlocked": "Boolean"
}
```

