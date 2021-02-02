---
title: "Create macManagedAppProtection"
description: "Create a new macManagedAppProtection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create macManagedAppProtection
Namespace: microsoft.graph

Create a new macManagedAppProtection object.

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
POST /deviceAppManagement/macManagedAppProtections
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macManagedAppProtection](../resources/macmanagedappprotection.md) object.

The following table shows the properties that are required when you create the [macManagedAppProtection](../resources/macmanagedappprotection.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|description|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|version|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|allowedDataStorageLocations|managedAppDataStorageLocation collection|**TODO: Add Description**. Possible values are: `oneDriveForBusiness`, `sharePoint`, `box`, `localStorage`.|
|allowedInboundDataTransferSources|managedAppDataTransferLevel|**TODO: Add Description**. Possible values are: `allApps`, `managedApps`, `none`.|
|allowedMacDeviceModels|String|**TODO: Add Description**|
|allowedOutboundClipboardSharingLevel|managedAppClipboardSharingLevel|**TODO: Add Description**. Possible values are: `allApps`, `managedAppsWithPasteIn`, `managedApps`, `blocked`.|
|allowedOutboundDataTransferDestinations|managedAppDataTransferLevel|**TODO: Add Description**. Possible values are: `allApps`, `managedApps`, `none`.|
|appActionIfMacDeviceModelNotAllowed|managedAppRemediationAction|**TODO: Add Description**. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfMaximumPinRetriesExceeded|managedAppRemediationAction|**TODO: Add Description**. Possible values are: `block`, `wipe`, `warn`.|
|contactSyncBlocked|Boolean|**TODO: Add Description**|
|dataBackupBlocked|Boolean|**TODO: Add Description**|
|deployedAppCount|Int32|**TODO: Add Description**|
|disableAppEncryptionIfDeviceEncryptionIsEnabled|Boolean|**TODO: Add Description**|
|encryptAppData|Boolean|**TODO: Add Description**|
|exemptedAppProtocols|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|
|filterOpenInToOnlyManagedApps|Boolean|**TODO: Add Description**|
|fingerprintBlocked|Boolean|**TODO: Add Description**|
|isAssigned|Boolean|**TODO: Add Description**|
|managedBrowserToOpenLinksRequired|Boolean|**TODO: Add Description**|
|maximumPinRetries|Int32|**TODO: Add Description**|
|minimumPinLength|Int32|**TODO: Add Description**|
|minimumRequiredAppVersion|String|**TODO: Add Description**|
|maximumRequiredOsVersion|String|**TODO: Add Description**|
|maximumWarningOsVersion|String|**TODO: Add Description**|
|maximumWipeOsVersion|String|**TODO: Add Description**|
|minimumRequiredOsVersion|String|**TODO: Add Description**|
|minimumRequiredSdkVersion|String|**TODO: Add Description**|
|minimumWarningAppVersion|String|**TODO: Add Description**|
|minimumWarningOsVersion|String|**TODO: Add Description**|
|minimumWipeAppVersion|String|**TODO: Add Description**|
|minimumWipeOsVersion|String|**TODO: Add Description**|
|minimumWipeSdkVersion|String|**TODO: Add Description**|
|organizationalCredentialsRequired|Boolean|**TODO: Add Description**|
|periodBeforePinReset|Duration|**TODO: Add Description**|
|periodOfflineBeforeAccessCheck|Duration|**TODO: Add Description**|
|periodOfflineBeforeWipeIsEnforced|Duration|**TODO: Add Description**|
|periodOnlineBeforeAccessCheck|Duration|**TODO: Add Description**|
|pinCharacterSet|managedAppPinCharacterSet|**TODO: Add Description**. Possible values are: `numeric`, `alphanumericAndSymbol`.|
|pinRequired|Boolean|**TODO: Add Description**|
|pinRequiredInsteadOfBiometricTimeout|Duration|**TODO: Add Description**|
|printBlocked|Boolean|**TODO: Add Description**|
|saveAsBlocked|Boolean|**TODO: Add Description**|
|simplePinBlocked|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [macManagedAppProtection](../resources/macmanagedappprotection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_macmanagedappprotection_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceAppManagement/macManagedAppProtections
Content-Type: application/json
Content-length: 2015

{
  "@odata.type": "#microsoft.graph.macManagedAppProtection",
  "displayName": "String",
  "description": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String",
  "allowedDataStorageLocations": [
    "String"
  ],
  "allowedInboundDataTransferSources": "String",
  "allowedMacDeviceModels": "String",
  "allowedOutboundClipboardSharingLevel": "String",
  "allowedOutboundDataTransferDestinations": "String",
  "appActionIfMacDeviceModelNotAllowed": "String",
  "appActionIfMaximumPinRetriesExceeded": "String",
  "contactSyncBlocked": "Boolean",
  "dataBackupBlocked": "Boolean",
  "deployedAppCount": "Integer",
  "disableAppEncryptionIfDeviceEncryptionIsEnabled": "Boolean",
  "encryptAppData": "Boolean",
  "exemptedAppProtocols": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "filterOpenInToOnlyManagedApps": "Boolean",
  "fingerprintBlocked": "Boolean",
  "isAssigned": "Boolean",
  "managedBrowserToOpenLinksRequired": "Boolean",
  "maximumPinRetries": "Integer",
  "minimumPinLength": "Integer",
  "minimumRequiredAppVersion": "String",
  "maximumRequiredOsVersion": "String",
  "maximumWarningOsVersion": "String",
  "maximumWipeOsVersion": "String",
  "minimumRequiredOsVersion": "String",
  "minimumRequiredSdkVersion": "String",
  "minimumWarningAppVersion": "String",
  "minimumWarningOsVersion": "String",
  "minimumWipeAppVersion": "String",
  "minimumWipeOsVersion": "String",
  "minimumWipeSdkVersion": "String",
  "organizationalCredentialsRequired": "Boolean",
  "periodBeforePinReset": "String (duration)",
  "periodOfflineBeforeAccessCheck": "String (duration)",
  "periodOfflineBeforeWipeIsEnforced": "String (duration)",
  "periodOnlineBeforeAccessCheck": "String (duration)",
  "pinCharacterSet": "String",
  "pinRequired": "Boolean",
  "pinRequiredInsteadOfBiometricTimeout": "String (duration)",
  "printBlocked": "Boolean",
  "saveAsBlocked": "Boolean",
  "simplePinBlocked": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macManagedAppProtection"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.macManagedAppProtection",
  "id": "1ca9a2c5-a2c5-1ca9-c5a2-a91cc5a2a91c",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String",
  "allowedDataStorageLocations": [
    "String"
  ],
  "allowedInboundDataTransferSources": "String",
  "allowedMacDeviceModels": "String",
  "allowedOutboundClipboardSharingLevel": "String",
  "allowedOutboundDataTransferDestinations": "String",
  "appActionIfMacDeviceModelNotAllowed": "String",
  "appActionIfMaximumPinRetriesExceeded": "String",
  "contactSyncBlocked": "Boolean",
  "dataBackupBlocked": "Boolean",
  "deployedAppCount": "Integer",
  "disableAppEncryptionIfDeviceEncryptionIsEnabled": "Boolean",
  "encryptAppData": "Boolean",
  "exemptedAppProtocols": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "filterOpenInToOnlyManagedApps": "Boolean",
  "fingerprintBlocked": "Boolean",
  "isAssigned": "Boolean",
  "managedBrowserToOpenLinksRequired": "Boolean",
  "maximumPinRetries": "Integer",
  "minimumPinLength": "Integer",
  "minimumRequiredAppVersion": "String",
  "maximumRequiredOsVersion": "String",
  "maximumWarningOsVersion": "String",
  "maximumWipeOsVersion": "String",
  "minimumRequiredOsVersion": "String",
  "minimumRequiredSdkVersion": "String",
  "minimumWarningAppVersion": "String",
  "minimumWarningOsVersion": "String",
  "minimumWipeAppVersion": "String",
  "minimumWipeOsVersion": "String",
  "minimumWipeSdkVersion": "String",
  "organizationalCredentialsRequired": "Boolean",
  "periodBeforePinReset": "String (duration)",
  "periodOfflineBeforeAccessCheck": "String (duration)",
  "periodOfflineBeforeWipeIsEnforced": "String (duration)",
  "periodOnlineBeforeAccessCheck": "String (duration)",
  "pinCharacterSet": "String",
  "pinRequired": "Boolean",
  "pinRequiredInsteadOfBiometricTimeout": "String (duration)",
  "printBlocked": "Boolean",
  "saveAsBlocked": "Boolean",
  "simplePinBlocked": "Boolean"
}
```

