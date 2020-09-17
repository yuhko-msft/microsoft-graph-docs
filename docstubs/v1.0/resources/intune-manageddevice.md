---
title: "managedDevice resource type"
description: "Devices that are managed or pre-enrolled through Intune"
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# managedDevice resource type

Namespace: microsoft.graph

Devices that are managed or pre-enrolled through Intune

## Methods

| Method                                                                                                | Return Type                                         | Description                                                               |
| :---------------------------------------------------------------------------------------------------- | :-------------------------------------------------- | :------------------------------------------------------------------------ |
| [List managedDevice](../api/intune-manageddevice-list.md)                                             | [managedDevice](intune-managedDevice.md) collection | List properties and relationships of a managedDevice object.              |
| [Create managedDevice](../api/intune-manageddevice-create.md)                                         | [managedDevice](intune-managedDevice.md)            | Create a new managedDevice object.                                        |
| [Get managedDevice](../api/intune-manageddevice-get.md)                                               | [managedDevice](intune-managedDevice.md)            | Read properties and relationships of a managedDevice object.              |
| [Update managedDevice](../api/intune-manageddevice-update.md)                                         | [managedDevice](intune-managedDevice.md)            | Update the properties of a managedDevice object.                          |
| [Delete managedDevice](../api/intune-manageddevice-delete.md)                                         |                                                     | Delete a managedDevice object.                                            |
| [bypassActivationLock](../api/intune-manageddevice-bypassActivationLock.md)                           |                                                     | Bypass activation lock                                                    |
| [cleanWindowsDevice](../api/intune-manageddevice-cleanWindowsDevice.md)                               |                                                     | Clean Windows device                                                      |
| [deleteUserFromSharedAppleDevice](../api/intune-manageddevice-deleteUserFromSharedAppleDevice.md)     |                                                     | Delete user from shared Apple device                                      |
| [disableLostMode](../api/intune-manageddevice-disableLostMode.md)                                     |                                                     | Disable lost mode                                                         |
| [locateDevice](../api/intune-manageddevice-locateDevice.md)                                           |                                                     | Locate a device                                                           |
| [logoutSharedAppleDeviceActiveUser](../api/intune-manageddevice-logoutSharedAppleDeviceActiveUser.md) |                                                     | Logout shared Apple device active user                                    |
| [rebootNow](../api/intune-manageddevice-rebootNow.md)                                                 |                                                     | Reboot device                                                             |
| [recoverPasscode](../api/intune-manageddevice-recoverPasscode.md)                                     |                                                     | Recover passcode                                                          |
| [remoteLock](../api/intune-manageddevice-remoteLock.md)                                               |                                                     | Remote lock                                                               |
| [requestRemoteAssistance](../api/intune-manageddevice-requestRemoteAssistance.md)                     |                                                     | Request remote assistance                                                 |
| [resetPasscode](../api/intune-manageddevice-resetPasscode.md)                                         |                                                     | Reset passcode                                                            |
| [retire](../api/intune-manageddevice-retire.md)                                                       |                                                     | Retire a device                                                           |
| [shutDown](../api/intune-manageddevice-shutDown.md)                                                   |                                                     | Shut down device                                                          |
| [syncDevice](../api/intune-manageddevice-syncDevice.md)                                               |                                                     |                                                                           |
| [updateWindowsDeviceAccount](../api/intune-manageddevice-updateWindowsDeviceAccount.md)               |                                                     |                                                                           |
| [windowsDefenderScan](../api/intune-manageddevice-windowsDefenderScan.md)                             |                                                     |                                                                           |
| [windowsDefenderUpdateSignatures](../api/intune-manageddevice-windowsDefenderUpdateSignatures.md)     |                                                     |                                                                           |
| [wipe](../api/intune-manageddevice-wipe.md)                                                           |                                                     | Wipe a device                                                             |
| [List deviceCategory](../api/intune-manageddevice-list-devicecategory.md)                             | deviceCategory                                      | Get the deviceCategory objects from a deviceCategory navigation property. |
| [Create deviceCategory](../api/intune-manageddevice-post-devicecategory.md)                           | deviceCategory                                      | Create a new deviceCategory object.                                       |
| [Get deviceCategory](../api/intune-manageddevice-get-devicecategory.md)                               | deviceCategory                                      | Read the properties and relationships of a deviceCategory object.         |
| [Update deviceCategory](../api/intune-manageddevice-update-devicecategory.md)                         | deviceCategory                                      | Update the properties of a deviceCategory object.                         |
| [Delete deviceCategory](../api/intune-manageddevice-delete-devicecategory.md)                         |                                                     | Delete a deviceCategory object.                                           |

## Properties

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

## Relationships

| Relationship   | Type                                             | Description     |
| :------------- | :----------------------------------------------- | :-------------- |
| deviceCategory | [deviceCategory](../resources/devicecategory.md) | Device category |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedDevice",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.managedDevice",
  "activationLockBypassCode": "String",
  "androidSecurityPatchLevel": "String",
  "azureADDeviceId": "String",
  "azureADRegistered": "Boolean",
  "complianceGracePeriodExpirationDateTime": "DateTimeOffset",
  "complianceState": "unknown | compliant | noncompliant | conflict | error | inGracePeriod | configManager",
  "configurationManagerClientEnabledFeatures": {"@odata.type": "microsoft.graph.configurationManagerClientEnabledFeatures"},
  "deviceActionResults": [{"@odata.type": "microsoft.graph.deviceActionResult"}],
  "deviceCategoryDisplayName": "String",
  "deviceEnrollmentType": "unknown | userEnrollment | deviceEnrollmentManager | appleBulkWithUser | appleBulkWithoutUser | windowsAzureADJoin | windowsBulkUserless | windowsAutoEnrollment | windowsBulkAzureDomainJoin | windowsCoManagement",
  "deviceHealthAttestationState": {"@odata.type": "microsoft.graph.deviceHealthAttestationState"},
  "deviceName": "String",
  "deviceRegistrationState": "notRegistered | registered | revoked | keyConflict | approvalPending | certificateReset | notRegisteredPendingEnrollment | unknown",
  "easActivated": "Boolean",
  "easActivationDateTime": "DateTimeOffset",
  "easDeviceId": "String",
  "emailAddress": "String",
  "enrolledDateTime": "DateTimeOffset",
  "exchangeAccessState": "none | unknown | allowed | blocked | quarantined",
  "exchangeAccessStateReason": "none | unknown | exchangeGlobalRule | exchangeIndividualRule | exchangeDeviceRule | exchangeUpgrade | exchangeMailboxPolicy | other | compliant | notCompliant | notEnrolled | unknownLocation | mfaRequired | azureADBlockDueToAccessPolicy | compromisedPassword | deviceNotKnownWithManagedApp",
  "exchangeLastSuccessfulSyncDateTime": "DateTimeOffset",
  "freeStorageSpaceInBytes": "Int64",
  "id": "String (identifier)",
  "imei": "String",
  "isEncrypted": "Boolean",
  "isSupervised": "Boolean",
  "jailBroken": "String",
  "lastSyncDateTime": "DateTimeOffset",
  "managedDeviceName": "String",
  "managedDeviceOwnerType": "unknown | company | personal",
  "managementAgent": "eas | mdm | easMdm | intuneClient | easIntuneClient | configurationManagerClient | configurationManagerClientMdm | configurationManagerClientMdmEas | unknown | jamf | googleCloudDevicePolicyController",
  "manufacturer": "String",
  "meid": "String",
  "model": "String",
  "operatingSystem": "String",
  "osVersion": "String",
  "partnerReportedThreatState": "unknown | activated | deactivated | secured | lowSeverity | mediumSeverity | highSeverity | unresponsive | compromised | misconfigured",
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