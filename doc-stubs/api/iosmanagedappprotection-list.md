---
title: "List iosManagedAppProtections"
description: "Get a list of the iosManagedAppProtection objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List iosManagedAppProtections
Namespace: microsoft.graph



Get a list of the [iosManagedAppProtection](../resources/iosmanagedappprotection.md) objects and their properties.

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
GET /deviceAppManagement/iosManagedAppProtections
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

If successful, this method returns a `200 OK` response code and a collection of [iosManagedAppProtection](../resources/iosmanagedappprotection.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_iosmanagedappprotection"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceAppManagement/iosManagedAppProtections
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.iosManagedAppProtection)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.iosManagedAppProtection",
      "id": "b1bba315-a315-b1bb-15a3-bbb115a3bbb1",
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
      "allowedIosDeviceModels": "String",
      "appActionIfIosDeviceModelNotAllowed": "String",
      "appDataEncryptionType": "String",
      "customBrowserProtocol": "String",
      "customDialerAppProtocol": "String",
      "deployedAppCount": "Integer",
      "disableProtectionOfManagedOutboundOpenInData": "Boolean",
      "exemptedAppProtocols": [
        {
          "@odata.type": "microsoft.graph.keyValuePair"
        }
      ],
      "faceIdBlocked": "Boolean",
      "filterOpenInToOnlyManagedApps": "Boolean",
      "minimumRequiredSdkVersion": "String",
      "minimumWipeSdkVersion": "String",
      "protectInboundDataFromUnknownSources": "Boolean",
      "thirdPartyKeyboardsBlocked": "Boolean"
    }
  ]
}
```

