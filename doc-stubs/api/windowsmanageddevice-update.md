---
title: "Update windowsManagedDevice"
description: "Update the properties of a windowsManagedDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsManagedDevice
Namespace: microsoft.graph

Update the properties of a [windowsManagedDevice](../resources/windowsmanageddevice.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH ** Entity URI for microsoft.graph.windowsManagedDevice not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsManagedDevice](../resources/windowsmanageddevice.md) object.

The following table shows the properties that are required when you create the [windowsManagedDevice](../resources/windowsmanageddevice.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userId|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|deviceName|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|hardwareInformation|[hardwareInformation](../resources/intune-hardwareinformation.md)|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|ownerType|ownerType|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `unknown`, `company`, `personal`.|
|managedDeviceOwnerType|managedDeviceOwnerType|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `unknown`, `company`, `personal`.|
|deviceActionResults|[deviceActionResult](../resources/intune-deviceactionresult.md) collection|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|managementState|managementState|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `managed`, `retirePending`, `retireFailed`, `wipePending`, `wipeFailed`, `unhealthy`, `deletePending`, `retireIssued`, `wipeIssued`, `wipeCanceled`, `retireCanceled`, `discovered`.|
|enrolledDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|lastSyncDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|chassisType|chassisType|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `unknown`, `desktop`, `laptop`, `worksWorkstation`, `enterpriseServer`, `phone`, `tablet`, `mobileOther`, `mobileUnknown`.|
|operatingSystem|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|deviceType|deviceType|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `desktop`, `windowsRT`, `winMO6`, `nokia`, `windowsPhone`, `mac`, `winCE`, `winEmbedded`, `iPhone`, `iPad`, `iPod`, `android`, `iSocConsumer`, `unix`, `macMDM`, `holoLens`, `surfaceHub`, `androidForWork`, `androidEnterprise`, `windows10x`, `androidnGMS`, `cloudPC`, `blackberry`, `palm`, `unknown`.|
|complianceState|complianceState|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `unknown`, `compliant`, `noncompliant`, `conflict`, `error`, `inGracePeriod`, `configManager`.|
|jailBroken|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|managementAgent|managementAgentType|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `eas`, `mdm`, `easMdm`, `intuneClient`, `easIntuneClient`, `configurationManagerClient`, `configurationManagerClientMdm`, `configurationManagerClientMdmEas`, `unknown`, `jamf`, `googleCloudDevicePolicyController`, `microsoft365ManagedMdm`, `windowsManagementCloudApi`.|
|osVersion|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|easActivated|Boolean|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|easDeviceId|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|easActivationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|aadRegistered|Boolean|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|azureADRegistered|Boolean|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|deviceEnrollmentType|deviceEnrollmentType|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `unknown`, `userEnrollment`, `deviceEnrollmentManager`, `appleBulkWithUser`, `appleBulkWithoutUser`, `windowsAzureADJoin`, `windowsBulkUserless`, `windowsAutoEnrollment`, `windowsBulkAzureDomainJoin`, `windowsCoManagement`, `appleUserEnrollment`, `appleUserEnrollmentWithServiceAccount`, `azureAdJoinUsingAzureVmExtension`, `androidEnterpriseDedicatedDevice`, `androidEnterpriseFullyManaged`, `androidEnterpriseCorporateWorkProfile`.|
|lostModeState|lostModeState|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `disabled`, `enabled`.|
|activationLockBypassCode|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|emailAddress|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|azureActiveDirectoryDeviceId|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|azureADDeviceId|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|deviceRegistrationState|deviceRegistrationState|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `notRegistered`, `registered`, `revoked`, `keyConflict`, `approvalPending`, `certificateReset`, `notRegisteredPendingEnrollment`, `unknown`.|
|deviceCategoryDisplayName|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|isSupervised|Boolean|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|exchangeLastSuccessfulSyncDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|exchangeAccessState|deviceManagementExchangeAccessState|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `none`, `unknown`, `allowed`, `blocked`, `quarantined`.|
|exchangeAccessStateReason|deviceManagementExchangeAccessStateReason|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `none`, `unknown`, `exchangeGlobalRule`, `exchangeIndividualRule`, `exchangeDeviceRule`, `exchangeUpgrade`, `exchangeMailboxPolicy`, `other`, `compliant`, `notCompliant`, `notEnrolled`, `unknownLocation`, `mfaRequired`, `azureADBlockDueToAccessPolicy`, `compromisedPassword`, `deviceNotKnownWithManagedApp`.|
|remoteAssistanceSessionUrl|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|remoteAssistanceSessionErrorDetails|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|isEncrypted|Boolean|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|userPrincipalName|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|model|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|manufacturer|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|imei|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|serialNumber|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|phoneNumber|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|androidSecurityPatchLevel|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|userDisplayName|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|configurationManagerClientEnabledFeatures|[configurationManagerClientEnabledFeatures](../resources/intune-configurationmanagerclientenabledfeatures.md)|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|wiFiMacAddress|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|deviceHealthAttestationState|[deviceHealthAttestationState](../resources/intune-devicehealthattestationstate.md)|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|subscriberCarrier|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|meid|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|totalStorageSpaceInBytes|Int64|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|freeStorageSpaceInBytes|Int64|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|managedDeviceName|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|partnerReportedThreatState|managedDevicePartnerReportedHealthState|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `unknown`, `activated`, `deactivated`, `secured`, `lowSeverity`, `mediumSeverity`, `highSeverity`, `unresponsive`, `compromised`, `misconfigured`.|
|retireAfterDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|usersLoggedOn|[loggedOnUser](../resources/intune-loggedonuser.md) collection|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|preferMdmOverGroupPolicyAppliedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|autopilotEnrolled|Boolean|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|requireUserEnrollmentApproval|Boolean|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|managementCertificateExpirationDate|DateTimeOffset|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|iccid|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|udid|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|windowsActiveMalwareCount|Int32|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|windowsRemediatedMalwareCount|Int32|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|notes|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|configurationManagerClientHealthState|[configurationManagerClientHealthState](../resources/intune-configurationmanagerclienthealthstate.md)|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|configurationManagerClientInformation|[configurationManagerClientInformation](../resources/intune-configurationmanagerclientinformation.md)|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|ethernetMacAddress|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|physicalMemoryInBytes|Int64|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|processorArchitecture|managedDeviceArchitecture|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `unknown`, `x86`, `x64`, `arm`, `arM64`.|
|specificationVersion|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|joinType|joinType|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `unknown`, `azureADJoined`, `azureADRegistered`, `hybridAzureADJoined`.|
|skuFamily|String|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|skuNumber|Int32|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md)|
|managementFeatures|managedDeviceManagementFeatures|**TODO: Add Description** Inherited from [managedDevice](../resources/intune-manageddevice.md). Possible values are: `none`, `microsoftManagedDesktop`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsManagedDevice](../resources/windowsmanageddevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsmanageddevice"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windowsManagedDevice not found
Content-Type: application/json
Content-length: 3338

{
  "@odata.type": "#microsoft.graph.windowsManagedDevice",
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
  "managementFeatures": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.windowsManagedDevice",
  "id": "a9ef7be4-7be4-a9ef-e47b-efa9e47befa9",
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
  "managementFeatures": "String"
}
```

