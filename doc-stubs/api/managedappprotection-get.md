---
title: "Get managedAppProtection"
description: "Read the properties and relationships of a managedAppProtection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get managedAppProtection
Namespace: microsoft.graph



Read the properties and relationships of a [managedAppProtection](../resources/managedappprotection.md) object.

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
GET /managedAppProtection
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

If successful, this method returns a `200 OK` response code and a [managedAppProtection](../resources/managedappprotection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_managedappprotection"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/managedAppProtection
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedAppProtection"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.managedAppProtection",
    "id": "58a8ba63-ba63-58a8-63ba-a85863baa858",
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
    "simplePinBlocked": "Boolean"
  }
}
```

