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
GET https://graph.microsoft.com/beta/managedAppProtection
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
    "id": "67490593-0593-6749-9305-496793054967",
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
    "dialerRestrictionLevel": "String"
  }
}
```

