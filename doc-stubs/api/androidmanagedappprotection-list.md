---
title: "List androidManagedAppProtections"
description: "Get a list of the androidManagedAppProtection objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List androidManagedAppProtections
Namespace: microsoft.graph



Get a list of the [androidManagedAppProtection](../resources/androidmanagedappprotection.md) objects and their properties.

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
GET /deviceAppManagement/androidManagedAppProtections
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

If successful, this method returns a `200 OK` response code and a collection of [androidManagedAppProtection](../resources/androidmanagedappprotection.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_androidmanagedappprotection"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceAppManagement/androidManagedAppProtections
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.androidManagedAppProtection)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
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
  ]
}
```

