---
title: "Get androidManagedAppProtection"
description: "Read the properties and relationships of an androidManagedAppProtection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get androidManagedAppProtection
Namespace: microsoft.graph



Read the properties and relationships of an [androidManagedAppProtection](../resources/androidmanagedappprotection.md) object.

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
GET /deviceAppManagement/androidManagedAppProtections/{androidManagedAppProtectionId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [androidManagedAppProtection](../resources/androidmanagedappprotection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_androidmanagedappprotection"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceAppManagement/androidManagedAppProtections/{androidManagedAppProtectionId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidManagedAppProtection"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.androidManagedAppProtection",
    "id": "229a9cb9-9cb9-229a-b99c-9a22b99c9a22",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "version": "String",
    "allowedDataIngestionLocations": [
      "String"
    ],
    "allowedDataStorageLocations": [
      "String"
    ],
    "allowedInboundDataTransferSources": "String",
    "allowedOutboundClipboardSharingExceptionLength": "Integer",
    "allowedOutboundClipboardSharingLevel": "String",
    "allowedOutboundDataTransferDestinations": "String",
    "appActionIfDeviceComplianceRequired": "String",
    "appActionIfMaximumPinRetriesExceeded": "String",
    "appActionIfUnableToAuthenticateUser": "String",
    "blockDataIngestionIntoOrganizationDocuments": "Boolean",
    "contactSyncBlocked": "Boolean",
    "dataBackupBlocked": "Boolean",
    "deviceComplianceRequired": "Boolean",
    "dialerRestrictionLevel": "String",
    "disableAppPinIfDevicePinIsSet": "Boolean",
    "fingerprintBlocked": "Boolean",
    "managedBrowser": "String",
    "managedBrowserToOpenLinksRequired": "Boolean",
    "maximumAllowedDeviceThreatLevel": "String",
    "maximumPinRetries": "Integer",
    "maximumRequiredOsVersion": "String",
    "maximumWarningOsVersion": "String",
    "maximumWipeOsVersion": "String",
    "minimumPinLength": "Integer",
    "minimumRequiredAppVersion": "String",
    "minimumRequiredOsVersion": "String",
    "minimumWarningAppVersion": "String",
    "minimumWarningOsVersion": "String",
    "minimumWipeAppVersion": "String",
    "minimumWipeOsVersion": "String",
    "mobileThreatDefenseRemediationAction": "String",
    "notificationRestriction": "String",
    "organizationalCredentialsRequired": "Boolean",
    "periodBeforePinReset": "String (duration)",
    "periodOfflineBeforeAccessCheck": "String (duration)",
    "periodOfflineBeforeWipeIsEnforced": "String (duration)",
    "periodOnlineBeforeAccessCheck": "String (duration)",
    "pinCharacterSet": "String",
    "pinRequired": "Boolean",
    "pinRequiredInsteadOfBiometricTimeout": "String (duration)",
    "previousPinBlockCount": "Integer",
    "printBlocked": "Boolean",
    "saveAsBlocked": "Boolean",
    "simplePinBlocked": "Boolean",
    "isAssigned": "Boolean",
    "targetedAppManagementLevels": "String",
    "allowedAndroidDeviceManufacturers": "String",
    "allowedAndroidDeviceModels": [
      "String"
    ],
    "appActionIfAndroidDeviceManufacturerNotAllowed": "String",
    "appActionIfAndroidDeviceModelNotAllowed": "String",
    "appActionIfAndroidSafetyNetAppsVerificationFailed": "String",
    "appActionIfAndroidSafetyNetDeviceAttestationFailed": "String",
    "appActionIfDeviceLockNotSet": "String",
    "approvedKeyboards": [
      {
        "@odata.type": "microsoft.graph.keyValuePair"
      }
    ],
    "biometricAuthenticationBlocked": "Boolean",
    "blockAfterCompanyPortalUpdateDeferralInDays": "Integer",
    "customBrowserDisplayName": "String",
    "customBrowserPackageId": "String",
    "customDialerAppDisplayName": "String",
    "customDialerAppPackageId": "String",
    "deployedAppCount": "Integer",
    "deviceLockRequired": "Boolean",
    "disableAppEncryptionIfDeviceEncryptionIsEnabled": "Boolean",
    "encryptAppData": "Boolean",
    "exemptedAppPackages": [
      {
        "@odata.type": "microsoft.graph.keyValuePair"
      }
    ],
    "keyboardsRestricted": "Boolean",
    "minimumRequiredCompanyPortalVersion": "String",
    "minimumRequiredPatchVersion": "String",
    "minimumWarningCompanyPortalVersion": "String",
    "minimumWarningPatchVersion": "String",
    "minimumWipeCompanyPortalVersion": "String",
    "minimumWipePatchVersion": "String",
    "requiredAndroidSafetyNetAppsVerificationType": "String",
    "requiredAndroidSafetyNetDeviceAttestationType": "String",
    "requiredAndroidSafetyNetEvaluationType": "String",
    "screenCaptureBlocked": "Boolean",
    "warnAfterCompanyPortalUpdateDeferralInDays": "Integer",
    "wipeAfterCompanyPortalUpdateDeferralInDays": "Integer"
  }
}
```

