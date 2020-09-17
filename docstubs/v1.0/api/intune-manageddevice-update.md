---
title: "Update managedDevice"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update managedDevice

Namespace: microsoft.graph

Update the properties of a managedDevice object.

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
/users/{id}/managedDevices/{id}
/deviceManagement/managedDevices/{id}
/deviceManagement/detectedApps/{id}/managedDevices/{id}

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the managedDevice object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a managedDevice object.

| Property                                  | Type                                                                                                   | Description                                                                                                                                             |
| :---------------------------------------- | :----------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------ |
| activationLockBypassCode                  | String                                                                                                 | Code that allows the Activation Lock on a device to be bypassed. This property is read-only.                                                            |
| androidSecurityPatchLevel                 | String                                                                                                 | Android security patch level. This property is read-only.                                                                                               |
| azureADDeviceId                           | String                                                                                                 | The unique identifier for the Azure Active Directory device. Read only. This property is read-only.                                                     |
| azureADRegistered                         | Boolean                                                                                                | Whether the device is Azure Active Directory registered. This property is read-only.                                                                    |
| complianceGracePeriodExpirationDateTime   | DateTimeOffset                                                                                         | The DateTime when device compliance grace period expires. This property is read-only.                                                                   |
| complianceState                           | String                                                                                                 | Compliance state of the device. This property is read-only.                                                                                             |
| configurationManagerClientEnabledFeatures | [configurationManagerClientEnabledFeatures](../resources/configurationmanagerclientenabledfeatures.md) | ConfigrMgr client enabled features. This property is read-only.                                                                                         |
| deviceActionResults                       | [deviceActionResult](../resources/deviceactionresult.md) collection                                    | List of ComplexType deviceActionResult objects. This property is read-only.                                                                             |
| deviceCategoryDisplayName                 | String                                                                                                 | Device category display name. This property is read-only.                                                                                               |
| deviceEnrollmentType                      | String                                                                                                 | Enrollment type of the device. This property is read-only.                                                                                              |
| deviceHealthAttestationState              | [deviceHealthAttestationState](../resources/devicehealthattestationstate.md)                           | The device health attestation state. This property is read-only.                                                                                        |
| deviceName                                | String                                                                                                 | Name of the device. This property is read-only.                                                                                                         |
| deviceRegistrationState                   | String                                                                                                 | Device registration state. This property is read-only.                                                                                                  |
| easActivated                              | Boolean                                                                                                | Whether the device is Exchange ActiveSync activated. This property is read-only.                                                                        |
| easActivationDateTime                     | DateTimeOffset                                                                                         | Exchange ActivationSync activation time of the device. This property is read-only.                                                                      |
| easDeviceId                               | String                                                                                                 | Exchange ActiveSync Id of the device. This property is read-only.                                                                                       |
| emailAddress                              | String                                                                                                 | Email(s) for the user associated with the device. This property is read-only.                                                                           |
| enrolledDateTime                          | DateTimeOffset                                                                                         | Enrollment time of the device. This property is read-only.                                                                                              |
| exchangeAccessState                       | String                                                                                                 | The Access State of the device in Exchange. This property is read-only.                                                                                 |
| exchangeAccessStateReason                 | String                                                                                                 | The reason for the device's access state in Exchange. This property is read-only.                                                                       |
| exchangeLastSuccessfulSyncDateTime        | DateTimeOffset                                                                                         | Last time the device contacted Exchange. This property is read-only.                                                                                    |
| freeStorageSpaceInBytes                   | Int64                                                                                                  | Free Storage in Bytes. This property is read-only.                                                                                                      |
| id                                        | String                                                                                                 | Unique Identifier for the device. This property is read-only. Read-only.                                                                                |
| imei                                      | String                                                                                                 | IMEI. This property is read-only.                                                                                                                       |
| isEncrypted                               | Boolean                                                                                                | Device encryption status. This property is read-only.                                                                                                   |
| isSupervised                              | Boolean                                                                                                | Device supervised status. This property is read-only.                                                                                                   |
| jailBroken                                | String                                                                                                 | whether the device is jail broken or rooted. This property is read-only.                                                                                |
| lastSyncDateTime                          | DateTimeOffset                                                                                         | The date and time that the device last completed a successful sync with Intune. This property is read-only.                                             |
| managedDeviceName                         | String                                                                                                 | Automatically generated name to identify a device. Can be overwritten to a user friendly name.                                                          |
| managedDeviceOwnerType                    | String                                                                                                 | Ownership of the device. Can be 'company' or 'personal'                                                                                                 |
| managementAgent                           | String                                                                                                 | Management channel of the device. Intune, EAS, etc. This property is read-only.                                                                         |
| manufacturer                              | String                                                                                                 | Manufacturer of the device. This property is read-only.                                                                                                 |
| meid                                      | String                                                                                                 | MEID. This property is read-only.                                                                                                                       |
| model                                     | String                                                                                                 | Model of the device. This property is read-only.                                                                                                        |
| operatingSystem                           | String                                                                                                 | Operating system of the device. Windows, iOS, etc. This property is read-only.                                                                          |
| osVersion                                 | String                                                                                                 | Operating system version of the device. This property is read-only.                                                                                     |
| partnerReportedThreatState                | String                                                                                                 | Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read Only. This property is read-only. |
| phoneNumber                               | String                                                                                                 | Phone number of the device. This property is read-only.                                                                                                 |
| remoteAssistanceSessionErrorDetails       | String                                                                                                 | An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.                                     |
| remoteAssistanceSessionUrl                | String                                                                                                 | Url that allows a Remote Assistance session to be established with the device. This property is read-only.                                              |
| serialNumber                              | String                                                                                                 | SerialNumber. This property is read-only.                                                                                                               |
| subscriberCarrier                         | String                                                                                                 | Subscriber Carrier. This property is read-only.                                                                                                         |
| totalStorageSpaceInBytes                  | Int64                                                                                                  | Total Storage in Bytes. This property is read-only.                                                                                                     |
| userDisplayName                           | String                                                                                                 | User display name. This property is read-only.                                                                                                          |
| userId                                    | String                                                                                                 | Unique Identifier for the user associated with the device. This property is read-only.                                                                  |
| userPrincipalName                         | String                                                                                                 | Device user principal name. This property is read-only.                                                                                                 |
| wiFiMacAddress                            | String                                                                                                 | Wi-Fi MAC. This property is read-only.                                                                                                                  |

## Response

If successful, this method returns a `200 OK` response code and a managedDevice object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_manageddevice"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0/users/{id}/managedDevices/{id}

Content-Type: application/json
Content-Length: 3506

{
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