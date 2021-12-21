---
title: "Create managedDevice"
description: "Create a new managedDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create managedDevice
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [managedDevice](../resources/intune-manageddevice.md) object.

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
POST /me/managedDevices
POST /users/{usersId}/managedDevices
POST /deviceManagement/managedDevices
POST /deviceManagement/comanagedDevices
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedDevice](../resources/intune-manageddevice.md) object.

You can specify the following properties when creating a **managedDevice**.

|Property|Type|Description|
|:---|:---|:---|
|cloudPcRemoteActionResults|[cloudPcRemoteActionResult](../resources/cloudpcremoteactionresult.md) collection|**TODO: Add Description** Optional.|
|userId|String|**TODO: Add Description** Optional.|
|deviceName|String|**TODO: Add Description** Optional.|
|hardwareInformation|[hardwareInformation](../resources/intune-hardwareinformation.md)|**TODO: Add Description** Optional.|
|ownerType|ownerType|**TODO: Add Description**. The possible values are: `unknown`, `company`, `personal`. Required.|
|managedDeviceOwnerType|managedDeviceOwnerType|**TODO: Add Description**. The possible values are: `unknown`, `company`, `personal`. Required.|
|deviceActionResults|[deviceActionResult](../resources/intune-deviceactionresult.md) collection|**TODO: Add Description** Optional.|
|managementState|managementState|**TODO: Add Description**. The possible values are: `managed`, `retirePending`, `retireFailed`, `wipePending`, `wipeFailed`, `unhealthy`, `deletePending`, `retireIssued`, `wipeIssued`, `wipeCanceled`, `retireCanceled`, `discovered`. Required.|
|enrolledDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|lastSyncDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|chassisType|chassisType|**TODO: Add Description**. The possible values are: `unknown`, `desktop`, `laptop`, `worksWorkstation`, `enterpriseServer`, `phone`, `tablet`, `mobileOther`, `mobileUnknown`. Required.|
|operatingSystem|String|**TODO: Add Description** Optional.|
|deviceType|deviceType|**TODO: Add Description**. The possible values are: `desktop`, `windowsRT`, `winMO6`, `nokia`, `windowsPhone`, `mac`, `winCE`, `winEmbedded`, `iPhone`, `iPad`, `iPod`, `android`, `iSocConsumer`, `unix`, `macMDM`, `holoLens`, `surfaceHub`, `androidForWork`, `androidEnterprise`, `windows10x`, `androidnGMS`, `chromeOS`, `linux`, `blackberry`, `palm`, `unknown`, `cloudPC`. Required.|
|complianceState|complianceState|**TODO: Add Description**. The possible values are: `unknown`, `compliant`, `noncompliant`, `conflict`, `error`, `inGracePeriod`, `configManager`. Required.|
|jailBroken|String|**TODO: Add Description** Optional.|
|managementAgent|managementAgentType|**TODO: Add Description**. The possible values are: `eas`, `mdm`, `easMdm`, `intuneClient`, `easIntuneClient`, `configurationManagerClient`, `configurationManagerClientMdm`, `configurationManagerClientMdmEas`, `unknown`, `jamf`, `googleCloudDevicePolicyController`, `microsoft365ManagedMdm`, `msSense`, `intuneAosp`. Required.|
|osVersion|String|**TODO: Add Description** Optional.|
|easActivated|Boolean|**TODO: Add Description** Required.|
|easDeviceId|String|**TODO: Add Description** Optional.|
|easActivationDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|aadRegistered|Boolean|**TODO: Add Description** Optional.|
|azureADRegistered|Boolean|**TODO: Add Description** Optional.|
|deviceEnrollmentType|deviceEnrollmentType|**TODO: Add Description**. The possible values are: `unknown`, `userEnrollment`, `deviceEnrollmentManager`, `appleBulkWithUser`, `appleBulkWithoutUser`, `windowsAzureADJoin`, `windowsBulkUserless`, `windowsAutoEnrollment`, `windowsBulkAzureDomainJoin`, `windowsCoManagement`, `windowsAzureADJoinUsingDeviceAuth`, `appleUserEnrollment`, `appleUserEnrollmentWithServiceAccount`, `azureAdJoinUsingAzureVmExtension`, `androidEnterpriseDedicatedDevice`, `androidEnterpriseFullyManaged`, `androidEnterpriseCorporateWorkProfile`. Required.|
|lostModeState|lostModeState|**TODO: Add Description**. The possible values are: `disabled`, `enabled`. Required.|
|activationLockBypassCode|String|**TODO: Add Description** Optional.|
|emailAddress|String|**TODO: Add Description** Optional.|
|azureActiveDirectoryDeviceId|String|**TODO: Add Description** Optional.|
|azureADDeviceId|String|**TODO: Add Description** Optional.|
|deviceRegistrationState|deviceRegistrationState|**TODO: Add Description**. The possible values are: `notRegistered`, `registered`, `revoked`, `keyConflict`, `approvalPending`, `certificateReset`, `notRegisteredPendingEnrollment`, `unknown`. Required.|
|deviceCategoryDisplayName|String|**TODO: Add Description** Optional.|
|isSupervised|Boolean|**TODO: Add Description** Required.|
|exchangeLastSuccessfulSyncDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|exchangeAccessState|deviceManagementExchangeAccessState|**TODO: Add Description**. The possible values are: `none`, `unknown`, `allowed`, `blocked`, `quarantined`. Required.|
|exchangeAccessStateReason|deviceManagementExchangeAccessStateReason|**TODO: Add Description**. The possible values are: `none`, `unknown`, `exchangeGlobalRule`, `exchangeIndividualRule`, `exchangeDeviceRule`, `exchangeUpgrade`, `exchangeMailboxPolicy`, `other`, `compliant`, `notCompliant`, `notEnrolled`, `unknownLocation`, `mfaRequired`, `azureADBlockDueToAccessPolicy`, `compromisedPassword`, `deviceNotKnownWithManagedApp`. Required.|
|remoteAssistanceSessionUrl|String|**TODO: Add Description** Optional.|
|remoteAssistanceSessionErrorDetails|String|**TODO: Add Description** Optional.|
|isEncrypted|Boolean|**TODO: Add Description** Required.|
|userPrincipalName|String|**TODO: Add Description** Optional.|
|model|String|**TODO: Add Description** Optional.|
|manufacturer|String|**TODO: Add Description** Optional.|
|imei|String|**TODO: Add Description** Optional.|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|serialNumber|String|**TODO: Add Description** Optional.|
|phoneNumber|String|**TODO: Add Description** Optional.|
|androidSecurityPatchLevel|String|**TODO: Add Description** Optional.|
|userDisplayName|String|**TODO: Add Description** Optional.|
|configurationManagerClientEnabledFeatures|[configurationManagerClientEnabledFeatures](../resources/intune-configurationmanagerclientenabledfeatures.md)|**TODO: Add Description** Optional.|
|wiFiMacAddress|String|**TODO: Add Description** Optional.|
|deviceHealthAttestationState|[deviceHealthAttestationState](../resources/intune-devicehealthattestationstate.md)|**TODO: Add Description** Optional.|
|subscriberCarrier|String|**TODO: Add Description** Optional.|
|meid|String|**TODO: Add Description** Optional.|
|totalStorageSpaceInBytes|Int64|**TODO: Add Description** Required.|
|freeStorageSpaceInBytes|Int64|**TODO: Add Description** Required.|
|managedDeviceName|String|**TODO: Add Description** Optional.|
|partnerReportedThreatState|managedDevicePartnerReportedHealthState|**TODO: Add Description**. The possible values are: `unknown`, `activated`, `deactivated`, `secured`, `lowSeverity`, `mediumSeverity`, `highSeverity`, `unresponsive`, `compromised`, `misconfigured`. Required.|
|retireAfterDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|usersLoggedOn|[loggedOnUser](../resources/intune-loggedonuser.md) collection|**TODO: Add Description** Optional.|
|preferMdmOverGroupPolicyAppliedDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|autopilotEnrolled|Boolean|**TODO: Add Description** Required.|
|requireUserEnrollmentApproval|Boolean|**TODO: Add Description** Optional.|
|managementCertificateExpirationDate|DateTimeOffset|**TODO: Add Description** Required.|
|iccid|String|**TODO: Add Description** Optional.|
|udid|String|**TODO: Add Description** Optional.|
|roleScopeTagIds|String collection|**TODO: Add Description** Optional.|
|windowsActiveMalwareCount|Int32|**TODO: Add Description** Required.|
|windowsRemediatedMalwareCount|Int32|**TODO: Add Description** Required.|
|notes|String|**TODO: Add Description** Optional.|
|configurationManagerClientHealthState|[configurationManagerClientHealthState](../resources/intune-configurationmanagerclienthealthstate.md)|**TODO: Add Description** Optional.|
|configurationManagerClientInformation|[configurationManagerClientInformation](../resources/intune-configurationmanagerclientinformation.md)|**TODO: Add Description** Optional.|
|ethernetMacAddress|String|**TODO: Add Description** Optional.|
|physicalMemoryInBytes|Int64|**TODO: Add Description** Required.|
|processorArchitecture|managedDeviceArchitecture|**TODO: Add Description**. The possible values are: `unknown`, `x86`, `x64`, `arm`, `arM64`. Required.|
|specificationVersion|String|**TODO: Add Description** Optional.|
|joinType|joinType|**TODO: Add Description**. The possible values are: `unknown`, `azureADJoined`, `azureADRegistered`, `hybridAzureADJoined`. Required.|
|skuFamily|String|**TODO: Add Description** Optional.|
|skuNumber|Int32|**TODO: Add Description** Required.|
|managementFeatures|managedDeviceManagementFeatures|**TODO: Add Description**. The possible values are: `none`, `microsoftManagedDesktop`. Required.|
|chromeOSDeviceInfo|[chromeOSDeviceProperty](../resources/intune-chromeosdeviceproperty.md) collection|**TODO: Add Description** Optional.|
|enrollmentProfileName|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [managedDevice](../resources/intune-manageddevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_manageddevice_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/me/managedDevices
Content-Type: application/json
Content-length: 3600

{
  "@odata.type": "#microsoft.graph.managedDevice",
  "cloudPcRemoteActionResults": [
    {
      "@odata.type": "microsoft.graph.cloudPcRemoteActionResult"
    }
  ],
  "userId": "String",
  "deviceName": "String",
  "hardwareInformation": {
    "@odata.type": "microsoft.graph.hardwareInformation"
  },
  "ownerType": "String",
  "managedDeviceOwnerType": "String",
  "deviceActionResults": [
    {
      "@odata.type": "microsoft.graph.deviceActionResult"
    }
  ],
  "managementState": "String",
  "enrolledDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "chassisType": "String",
  "operatingSystem": "String",
  "deviceType": "String",
  "complianceState": "String",
  "jailBroken": "String",
  "managementAgent": "String",
  "osVersion": "String",
  "easActivated": "Boolean",
  "easDeviceId": "String",
  "easActivationDateTime": "String (timestamp)",
  "aadRegistered": "Boolean",
  "azureADRegistered": "Boolean",
  "deviceEnrollmentType": "String",
  "lostModeState": "String",
  "activationLockBypassCode": "String",
  "emailAddress": "String",
  "azureActiveDirectoryDeviceId": "String",
  "azureADDeviceId": "String",
  "deviceRegistrationState": "String",
  "deviceCategoryDisplayName": "String",
  "isSupervised": "Boolean",
  "exchangeLastSuccessfulSyncDateTime": "String (timestamp)",
  "exchangeAccessState": "String",
  "exchangeAccessStateReason": "String",
  "remoteAssistanceSessionUrl": "String",
  "remoteAssistanceSessionErrorDetails": "String",
  "isEncrypted": "Boolean",
  "userPrincipalName": "String",
  "model": "String",
  "manufacturer": "String",
  "imei": "String",
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "serialNumber": "String",
  "phoneNumber": "String",
  "androidSecurityPatchLevel": "String",
  "userDisplayName": "String",
  "configurationManagerClientEnabledFeatures": {
    "@odata.type": "microsoft.graph.configurationManagerClientEnabledFeatures"
  },
  "wiFiMacAddress": "String",
  "deviceHealthAttestationState": {
    "@odata.type": "microsoft.graph.deviceHealthAttestationState"
  },
  "subscriberCarrier": "String",
  "meid": "String",
  "totalStorageSpaceInBytes": "Integer",
  "freeStorageSpaceInBytes": "Integer",
  "managedDeviceName": "String",
  "partnerReportedThreatState": "String",
  "retireAfterDateTime": "String (timestamp)",
  "usersLoggedOn": [
    {
      "@odata.type": "microsoft.graph.loggedOnUser"
    }
  ],
  "preferMdmOverGroupPolicyAppliedDateTime": "String (timestamp)",
  "autopilotEnrolled": "Boolean",
  "requireUserEnrollmentApproval": "Boolean",
  "managementCertificateExpirationDate": "String (timestamp)",
  "iccid": "String",
  "udid": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "windowsActiveMalwareCount": "Integer",
  "windowsRemediatedMalwareCount": "Integer",
  "notes": "String",
  "configurationManagerClientHealthState": {
    "@odata.type": "microsoft.graph.configurationManagerClientHealthState"
  },
  "configurationManagerClientInformation": {
    "@odata.type": "microsoft.graph.configurationManagerClientInformation"
  },
  "ethernetMacAddress": "String",
  "physicalMemoryInBytes": "Integer",
  "processorArchitecture": "String",
  "specificationVersion": "String",
  "joinType": "String",
  "skuFamily": "String",
  "skuNumber": "Integer",
  "managementFeatures": "String",
  "chromeOSDeviceInfo": [
    {
      "@odata.type": "microsoft.graph.chromeOSDeviceProperty"
    }
  ],
  "enrollmentProfileName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedDevice"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedDevice",
  "id": "1634236b-236b-1634-6b23-34166b233416",
  "cloudPcRemoteActionResults": [
    {
      "@odata.type": "microsoft.graph.cloudPcRemoteActionResult"
    }
  ],
  "userId": "String",
  "deviceName": "String",
  "hardwareInformation": {
    "@odata.type": "microsoft.graph.hardwareInformation"
  },
  "ownerType": "String",
  "managedDeviceOwnerType": "String",
  "deviceActionResults": [
    {
      "@odata.type": "microsoft.graph.deviceActionResult"
    }
  ],
  "managementState": "String",
  "enrolledDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "chassisType": "String",
  "operatingSystem": "String",
  "deviceType": "String",
  "complianceState": "String",
  "jailBroken": "String",
  "managementAgent": "String",
  "osVersion": "String",
  "easActivated": "Boolean",
  "easDeviceId": "String",
  "easActivationDateTime": "String (timestamp)",
  "aadRegistered": "Boolean",
  "azureADRegistered": "Boolean",
  "deviceEnrollmentType": "String",
  "lostModeState": "String",
  "activationLockBypassCode": "String",
  "emailAddress": "String",
  "azureActiveDirectoryDeviceId": "String",
  "azureADDeviceId": "String",
  "deviceRegistrationState": "String",
  "deviceCategoryDisplayName": "String",
  "isSupervised": "Boolean",
  "exchangeLastSuccessfulSyncDateTime": "String (timestamp)",
  "exchangeAccessState": "String",
  "exchangeAccessStateReason": "String",
  "remoteAssistanceSessionUrl": "String",
  "remoteAssistanceSessionErrorDetails": "String",
  "isEncrypted": "Boolean",
  "userPrincipalName": "String",
  "model": "String",
  "manufacturer": "String",
  "imei": "String",
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "serialNumber": "String",
  "phoneNumber": "String",
  "androidSecurityPatchLevel": "String",
  "userDisplayName": "String",
  "configurationManagerClientEnabledFeatures": {
    "@odata.type": "microsoft.graph.configurationManagerClientEnabledFeatures"
  },
  "wiFiMacAddress": "String",
  "deviceHealthAttestationState": {
    "@odata.type": "microsoft.graph.deviceHealthAttestationState"
  },
  "subscriberCarrier": "String",
  "meid": "String",
  "totalStorageSpaceInBytes": "Integer",
  "freeStorageSpaceInBytes": "Integer",
  "managedDeviceName": "String",
  "partnerReportedThreatState": "String",
  "retireAfterDateTime": "String (timestamp)",
  "usersLoggedOn": [
    {
      "@odata.type": "microsoft.graph.loggedOnUser"
    }
  ],
  "preferMdmOverGroupPolicyAppliedDateTime": "String (timestamp)",
  "autopilotEnrolled": "Boolean",
  "requireUserEnrollmentApproval": "Boolean",
  "managementCertificateExpirationDate": "String (timestamp)",
  "iccid": "String",
  "udid": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "windowsActiveMalwareCount": "Integer",
  "windowsRemediatedMalwareCount": "Integer",
  "notes": "String",
  "configurationManagerClientHealthState": {
    "@odata.type": "microsoft.graph.configurationManagerClientHealthState"
  },
  "configurationManagerClientInformation": {
    "@odata.type": "microsoft.graph.configurationManagerClientInformation"
  },
  "ethernetMacAddress": "String",
  "physicalMemoryInBytes": "Integer",
  "processorArchitecture": "String",
  "specificationVersion": "String",
  "joinType": "String",
  "skuFamily": "String",
  "skuNumber": "Integer",
  "managementFeatures": "String",
  "chromeOSDeviceInfo": [
    {
      "@odata.type": "microsoft.graph.chromeOSDeviceProperty"
    }
  ],
  "enrollmentProfileName": "String"
}
```

