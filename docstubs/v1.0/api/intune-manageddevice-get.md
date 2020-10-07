---
title: "Get managedDevice"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get managedDevice

Namespace: microsoft.graph

Read the properties and relationships a managedDevice object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

| Name          | Description               |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Request Body

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a managedDevice object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_manageddevice"
}
-->

```http
GET https://graph.microsoft.com/v1.0/users/{id}/managedDevices/{id}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.managedDevice"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.managedDevice",
  "activationLockBypassCode": "String",
  "androidSecurityPatchLevel": "String",
  "azureADDeviceId": "String",
  "azureADRegistered": "Boolean",
  "complianceGracePeriodExpirationDateTime": "DateTimeOffset",
  "complianceState": "String",
  "configurationManagerClientEnabledFeatures": {
    "@odata.type": "#microsoft.graph.configurationManagerClientEnabledFeatures",
    "compliancePolicy": "Boolean",
    "deviceConfiguration": "Boolean",
    "inventory": "Boolean",
    "modernApps": "Boolean",
    "resourceAccess": "Boolean",
    "windowsUpdateForBusiness": "Boolean"
  },
  "deviceActionResults": [
    {
      "@odata.type": "#microsoft.graph.deviceActionResult",
      "actionName": "String",
      "actionState": "String",
      "lastUpdatedDateTime": "DateTimeOffset",
      "startDateTime": "DateTimeOffset"
    }
  ],
  "deviceCategoryDisplayName": "String",
  "deviceEnrollmentType": "String",
  "deviceHealthAttestationState": {
    "@odata.type": "#microsoft.graph.deviceHealthAttestationState",
    "attestationIdentityKey": "String",
    "bitLockerStatus": "String",
    "bootAppSecurityVersion": "String",
    "bootDebugging": "String",
    "bootManagerSecurityVersion": "String",
    "bootManagerVersion": "String",
    "bootRevisionListInfo": "String",
    "codeIntegrity": "String",
    "codeIntegrityCheckVersion": "String",
    "codeIntegrityPolicy": "String",
    "contentNamespaceUrl": "String",
    "contentVersion": "String",
    "dataExcutionPolicy": "String",
    "deviceHealthAttestationStatus": "String",
    "earlyLaunchAntiMalwareDriverProtection": "String",
    "healthAttestationSupportedStatus": "String",
    "healthStatusMismatchInfo": "String",
    "issuedDateTime": "DateTimeOffset",
    "lastUpdateDateTime": "String",
    "operatingSystemKernelDebugging": "String",
    "operatingSystemRevListInfo": "String",
    "pcr0": "String",
    "pcrHashAlgorithm": "String",
    "resetCount": "Int64",
    "restartCount": "Int64",
    "safeMode": "String",
    "secureBoot": "String",
    "secureBootConfigurationPolicyFingerPrint": "String",
    "testSigning": "String",
    "tpmVersion": "String",
    "virtualSecureMode": "String",
    "windowsPE": "String"
  },
  "deviceName": "String",
  "deviceRegistrationState": "String",
  "easActivated": "Boolean",
  "easActivationDateTime": "DateTimeOffset",
  "easDeviceId": "String",
  "emailAddress": "String",
  "enrolledDateTime": "DateTimeOffset",
  "exchangeAccessState": "String",
  "exchangeAccessStateReason": "String",
  "exchangeLastSuccessfulSyncDateTime": "DateTimeOffset",
  "freeStorageSpaceInBytes": "Int64",
  "id": "String(identifier)",
  "imei": "String",
  "isEncrypted": "Boolean",
  "isSupervised": "Boolean",
  "jailBroken": "String",
  "lastSyncDateTime": "DateTimeOffset",
  "managedDeviceName": "String",
  "managedDeviceOwnerType": "String",
  "managementAgent": "String",
  "manufacturer": "String",
  "meid": "String",
  "model": "String",
  "operatingSystem": "String",
  "osVersion": "String",
  "partnerReportedThreatState": "String",
  "phoneNumber": "String",
  "remoteAssistanceSessionErrorDetails": "String",
  "remoteAssistanceSessionUrl": "String",
  "serialNumber": "String",
  "subscriberCarrier": "String",
  "totalStorageSpaceInBytes": "Int64",
  "userDisplayName": "String",
  "userId": "String",
  "userPrincipalName": "String",
  "wiFiMacAddress": "String"
}
}

```