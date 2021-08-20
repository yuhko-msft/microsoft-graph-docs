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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [androidManagedAppProtection](../resources/intune-androidmanagedappprotection.md) objects and their properties.

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
GET https://graph.microsoft.com/beta/deviceAppManagement/androidManagedAppProtections
```


### Response
>**Note:** The response object shown here might be shortened for readability.
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
      "id": "aafefea2-fea2-aafe-a2fe-feaaa2fefeaa",
      "displayName": "String",
      "description": "String",
      "createdDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "roleScopeTagIds": [
        "String"
      ],
      "version": "String",
      "periodOfflineBeforeAccessCheck": "String (duration)",
      "periodOnlineBeforeAccessCheck": "String (duration)",
      "allowedInboundDataTransferSources": "String",
      "allowedOutboundDataTransferDestinations": "String",
      "organizationalCredentialsRequired": "Boolean",
      "allowedOutboundClipboardSharingLevel": "String",
      "dataBackupBlocked": "Boolean",
      "deviceComplianceRequired": "Boolean",
      "managedBrowserToOpenLinksRequired": "Boolean",
      "saveAsBlocked": "Boolean",
      "periodOfflineBeforeWipeIsEnforced": "String (duration)",
      "pinRequired": "Boolean",
      "maximumPinRetries": "Integer",
      "simplePinBlocked": "Boolean",
      "minimumPinLength": "Integer",
      "pinCharacterSet": "String",
      "periodBeforePinReset": "String (duration)",
      "allowedDataStorageLocations": [
        "String"
      ],
      "contactSyncBlocked": "Boolean",
      "printBlocked": "Boolean",
      "fingerprintBlocked": "Boolean",
      "disableAppPinIfDevicePinIsSet": "Boolean",
      "maximumRequiredOsVersion": "String",
      "maximumWarningOsVersion": "String",
      "maximumWipeOsVersion": "String",
      "minimumRequiredOsVersion": "String",
      "minimumWarningOsVersion": "String",
      "minimumRequiredAppVersion": "String",
      "minimumWarningAppVersion": "String",
      "minimumWipeOsVersion": "String",
      "minimumWipeAppVersion": "String",
      "appActionIfDeviceComplianceRequired": "String",
      "appActionIfMaximumPinRetriesExceeded": "String",
      "pinRequiredInsteadOfBiometricTimeout": "String (duration)",
      "allowedOutboundClipboardSharingExceptionLength": "Integer",
      "notificationRestriction": "String",
      "previousPinBlockCount": "Integer",
      "managedBrowser": "String",
      "maximumAllowedDeviceThreatLevel": "String",
      "mobileThreatDefenseRemediationAction": "String",
      "blockDataIngestionIntoOrganizationDocuments": "Boolean",
      "allowedDataIngestionLocations": [
        "String"
      ],
      "appActionIfUnableToAuthenticateUser": "String",
      "dialerRestrictionLevel": "String",
      "isAssigned": "Boolean",
      "targetedAppManagementLevels": "String",
      "appGroupType": "String",
      "screenCaptureBlocked": "Boolean",
      "disableAppEncryptionIfDeviceEncryptionIsEnabled": "Boolean",
      "encryptAppData": "Boolean",
      "deployedAppCount": "Integer",
      "minimumRequiredPatchVersion": "String",
      "minimumWarningPatchVersion": "String",
      "exemptedAppPackages": [
        {
          "@odata.type": "microsoft.graph.keyValuePair"
        }
      ],
      "minimumWipePatchVersion": "String",
      "allowedAndroidDeviceManufacturers": "String",
      "appActionIfAndroidDeviceManufacturerNotAllowed": "String",
      "requiredAndroidSafetyNetDeviceAttestationType": "String",
      "appActionIfAndroidSafetyNetDeviceAttestationFailed": "String",
      "requiredAndroidSafetyNetAppsVerificationType": "String",
      "appActionIfAndroidSafetyNetAppsVerificationFailed": "String",
      "customBrowserPackageId": "String",
      "customBrowserDisplayName": "String",
      "minimumRequiredCompanyPortalVersion": "String",
      "minimumWarningCompanyPortalVersion": "String",
      "minimumWipeCompanyPortalVersion": "String",
      "keyboardsRestricted": "Boolean",
      "approvedKeyboards": [
        {
          "@odata.type": "microsoft.graph.keyValuePair"
        }
      ],
      "allowedAndroidDeviceModels": [
        "String"
      ],
      "appActionIfAndroidDeviceModelNotAllowed": "String",
      "customDialerAppPackageId": "String",
      "customDialerAppDisplayName": "String",
      "biometricAuthenticationBlocked": "Boolean",
      "requiredAndroidSafetyNetEvaluationType": "String",
      "blockAfterCompanyPortalUpdateDeferralInDays": "Integer",
      "warnAfterCompanyPortalUpdateDeferralInDays": "Integer",
      "wipeAfterCompanyPortalUpdateDeferralInDays": "Integer",
      "deviceLockRequired": "Boolean",
      "appActionIfDeviceLockNotSet": "String",
      "connectToVpnOnLaunch": "Boolean"
    }
  ]
}
```

