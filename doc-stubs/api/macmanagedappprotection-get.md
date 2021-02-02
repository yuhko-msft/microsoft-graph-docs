---
title: "Get macManagedAppProtection"
description: "Read the properties and relationships of a macManagedAppProtection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get macManagedAppProtection
Namespace: microsoft.graph

Read the properties and relationships of a [macManagedAppProtection](../resources/macmanagedappprotection.md) object.

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
GET /deviceAppManagement/macManagedAppProtections/{macManagedAppProtectionId}
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

If successful, this method returns a `200 OK` response code and a [macManagedAppProtection](../resources/macmanagedappprotection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_macmanagedappprotection"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceAppManagement/macManagedAppProtections/{macManagedAppProtectionId}
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

