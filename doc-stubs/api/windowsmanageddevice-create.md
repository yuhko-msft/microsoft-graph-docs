---
title: "Create windowsManagedDevice"
description: "Create a new windowsManagedDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsManagedDevice
Namespace: microsoft.graph



Create a new [windowsManagedDevice](../resources/windowsmanageddevice.md) object.

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
POST ** Collection URI for microsoft.graph.windowsManagedDevice not found
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
|aadRegistered|Boolean|Whether the device is Azure Active Directory registered. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|activationLockBypassCode|String|Code that allows the Activation Lock on a device to be bypassed. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|androidSecurityPatchLevel|String|Android security patch level. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|autopilotEnrolled|Boolean|Reports if the managed device is enrolled via auto-pilot. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|azureActiveDirectoryDeviceId|String|The unique identifier for the Azure Active Directory device. Read only. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|azureADDeviceId|String|The unique identifier for the Azure Active Directory device. Read only. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|azureADRegistered|Boolean|Whether the device is Azure Active Directory registered. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|chassisType|chassisType|Chassis type of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `unknown`, `desktop`, `laptop`, `worksWorkstation`, `enterpriseServer`, `phone`, `tablet`, `mobileOther`, `mobileUnknown`.|
|chromeOSDeviceInfo|[chromeOSDeviceProperty](../resources/chromeosdeviceproperty.md) collection|List of properties of the ChromeOS Device. Inherited from [managedDevice](../resources/manageddevice.md)|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|The DateTime when device compliance grace period expires. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|complianceState|complianceState|Compliance state of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `unknown`, `compliant`, `noncompliant`, `conflict`, `error`, `inGracePeriod`, `configManager`.|
|configurationManagerClientEnabledFeatures|[configurationManagerClientEnabledFeatures](../resources/configurationmanagerclientenabledfeatures.md)|ConfigrMgr client enabled features. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|configurationManagerClientHealthState|[configurationManagerClientHealthState](../resources/configurationmanagerclienthealthstate.md)|Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent Inherited from [managedDevice](../resources/manageddevice.md)|
|configurationManagerClientInformation|[configurationManagerClientInformation](../resources/configurationmanagerclientinformation.md)|Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent Inherited from [managedDevice](../resources/manageddevice.md)|
|deviceActionResults|[deviceActionResult](../resources/deviceactionresult.md) collection|List of ComplexType deviceActionResult objects. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|deviceCategoryDisplayName|String|Device category display name. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|deviceEnrollmentType|deviceEnrollmentType|Enrollment type of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `unknown`, `userEnrollment`, `deviceEnrollmentManager`, `appleBulkWithUser`, `appleBulkWithoutUser`, `windowsAzureADJoin`, `windowsBulkUserless`, `windowsAutoEnrollment`, `windowsBulkAzureDomainJoin`, `windowsCoManagement`, `windowsAzureADJoinUsingDeviceAuth`, `appleUserEnrollment`, `appleUserEnrollmentWithServiceAccount`, `azureAdJoinUsingAzureVmExtension`, `androidEnterpriseDedicatedDevice`, `androidEnterpriseFullyManaged`, `androidEnterpriseCorporateWorkProfile`.|
|deviceHealthAttestationState|[deviceHealthAttestationState](../resources/devicehealthattestationstate.md)|The device health attestation state. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|deviceName|String|Name of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|deviceRegistrationState|deviceRegistrationState|Device registration state. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `notRegistered`, `registered`, `revoked`, `keyConflict`, `approvalPending`, `certificateReset`, `notRegisteredPendingEnrollment`, `unknown`.|
|deviceType|deviceType|Platform of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `desktop`, `windowsRT`, `winMO6`, `nokia`, `windowsPhone`, `mac`, `winCE`, `winEmbedded`, `iPhone`, `iPad`, `iPod`, `android`, `iSocConsumer`, `unix`, `macMDM`, `holoLens`, `surfaceHub`, `androidForWork`, `androidEnterprise`, `windows10x`, `androidnGMS`, `chromeOS`, `linux`, `blackberry`, `palm`, `unknown`, `cloudPC`.|
|easActivated|Boolean|Whether the device is Exchange ActiveSync activated. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|easActivationDateTime|DateTimeOffset|Exchange ActivationSync activation time of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|easDeviceId|String|Exchange ActiveSync Id of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|emailAddress|String|Email(s) for the user associated with the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|enrolledDateTime|DateTimeOffset|Enrollment time of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|ethernetMacAddress|String|Ethernet MAC. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|exchangeAccessState|deviceManagementExchangeAccessState|The Access State of the device in Exchange. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `none`, `unknown`, `allowed`, `blocked`, `quarantined`.|
|exchangeAccessStateReason|deviceManagementExchangeAccessStateReason|The reason for the device's access state in Exchange. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `none`, `unknown`, `exchangeGlobalRule`, `exchangeIndividualRule`, `exchangeDeviceRule`, `exchangeUpgrade`, `exchangeMailboxPolicy`, `other`, `compliant`, `notCompliant`, `notEnrolled`, `unknownLocation`, `mfaRequired`, `azureADBlockDueToAccessPolicy`, `compromisedPassword`, `deviceNotKnownWithManagedApp`.|
|exchangeLastSuccessfulSyncDateTime|DateTimeOffset|Last time the device contacted Exchange. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|freeStorageSpaceInBytes|Int64|Free Storage in Bytes. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|hardwareInformation|[hardwareInformation](../resources/hardwareinformation.md)|The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|iccid|String|Integrated Circuit Card Identifier, it is A SIM card's unique identification number. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|imei|String|IMEI. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|isEncrypted|Boolean|Device encryption status. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|isSupervised|Boolean|Device supervised status. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|jailBroken|String|whether the device is jail broken or rooted. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|joinType|joinType|Device join type Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `unknown`, `azureADJoined`, `azureADRegistered`, `hybridAzureADJoined`.|
|lastSyncDateTime|DateTimeOffset|The date and time that the device last completed a successful sync with Intune. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|lostModeState|lostModeState|Indicates if Lost mode is enabled or disabled. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `disabled`, `enabled`.|
|managedDeviceName|String|Automatically generated name to identify a device. Can be overwritten to a user friendly name. Inherited from [managedDevice](../resources/manageddevice.md)|
|managedDeviceOwnerType|managedDeviceOwnerType|Ownership of the device. Can be 'company' or 'personal' Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `unknown`, `company`, `personal`.|
|managementAgent|managementAgentType|Management channel of the device. Intune, EAS, etc. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `eas`, `mdm`, `easMdm`, `intuneClient`, `easIntuneClient`, `configurationManagerClient`, `configurationManagerClientMdm`, `configurationManagerClientMdmEas`, `unknown`, `jamf`, `googleCloudDevicePolicyController`, `microsoft365ManagedMdm`, `windowsManagementCloudApi`.|
|managementCertificateExpirationDate|DateTimeOffset|Reports device management certificate expiration date. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|managementFeatures|managedDeviceManagementFeatures|Device management features Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `none`, `microsoftManagedDesktop`.|
|managementState|managementState|Management state of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `managed`, `retirePending`, `retireFailed`, `wipePending`, `wipeFailed`, `unhealthy`, `deletePending`, `retireIssued`, `wipeIssued`, `wipeCanceled`, `retireCanceled`, `discovered`.|
|manufacturer|String|Manufacturer of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|meid|String|MEID. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|model|String|Model of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|notes|String|Notes on the device created by IT Admin Inherited from [managedDevice](../resources/manageddevice.md)|
|operatingSystem|String|Operating system of the device. Windows, iOS, etc. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|osVersion|String|Operating system version of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|ownerType|ownerType|Ownership of the device. Can be 'company' or 'personal' Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `unknown`, `company`, `personal`.|
|partnerReportedThreatState|managedDevicePartnerReportedHealthState|Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read Only. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `unknown`, `activated`, `deactivated`, `secured`, `lowSeverity`, `mediumSeverity`, `highSeverity`, `unresponsive`, `compromised`, `misconfigured`.|
|phoneNumber|String|Phone number of the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|physicalMemoryInBytes|Int64|Total Memory in Bytes. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|preferMdmOverGroupPolicyAppliedDateTime|DateTimeOffset|Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|processorArchitecture|managedDeviceArchitecture|Processor architecture. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md). Possible values are: `unknown`, `x86`, `x64`, `arm`, `arM64`.|
|remoteAssistanceSessionErrorDetails|String|An error string that identifies issues when creating Remote Assistance session objects. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|remoteAssistanceSessionUrl|String|Url that allows a Remote Assistance session to be established with the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|requireUserEnrollmentApproval|Boolean|Reports if the managed iOS device is user approval enrollment. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|retireAfterDateTime|DateTimeOffset|Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|roleScopeTagIds|String collection|List of Scope Tag IDs for this Device instance. Inherited from [managedDevice](../resources/manageddevice.md)|
|serialNumber|String|SerialNumber. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|skuFamily|String|Device sku family Inherited from [managedDevice](../resources/manageddevice.md)|
|skuNumber|Int32|Device sku number, see also: https://docs.microsoft.com/en-us/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|specificationVersion|String|Specification version. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|subscriberCarrier|String|Subscriber Carrier. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|totalStorageSpaceInBytes|Int64|Total Storage in Bytes. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|udid|String|Unique Device Identifier for iOS and macOS devices. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|userDisplayName|String|User display name. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|userId|String|Unique Identifier for the user associated with the device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|userPrincipalName|String|Device user principal name. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|usersLoggedOn|[loggedOnUser](../resources/loggedonuser.md) collection|Indicates the last logged on users of a device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|wiFiMacAddress|String|Wi-Fi MAC. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|windowsActiveMalwareCount|Int32|Count of active malware for this windows device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|
|windowsRemediatedMalwareCount|Int32|Count of remediated malware for this windows device. This property is read-only. Inherited from [managedDevice](../resources/manageddevice.md)|



## Response

If successful, this method returns a `201 Created` response code and a [windowsManagedDevice](../resources/windowsmanageddevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsmanageddevice_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsManagedDevice not found
Content-Type: application/json
Content-length: 3448

{
  "@odata.type": "#microsoft.graph.windowsManagedDevice",
  "aadRegistered": "Boolean",
  "activationLockBypassCode": "String",
  "androidSecurityPatchLevel": "String",
  "autopilotEnrolled": "Boolean",
  "azureActiveDirectoryDeviceId": "String",
  "azureADDeviceId": "String",
  "azureADRegistered": "Boolean",
  "chassisType": "String",
  "chromeOSDeviceInfo": [
    {
      "@odata.type": "microsoft.graph.chromeOSDeviceProperty"
    }
  ],
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "complianceState": "String",
  "configurationManagerClientEnabledFeatures": {
    "@odata.type": "microsoft.graph.configurationManagerClientEnabledFeatures"
  },
  "configurationManagerClientHealthState": {
    "@odata.type": "microsoft.graph.configurationManagerClientHealthState"
  },
  "configurationManagerClientInformation": {
    "@odata.type": "microsoft.graph.configurationManagerClientInformation"
  },
  "deviceActionResults": [
    {
      "@odata.type": "microsoft.graph.deviceActionResult"
    }
  ],
  "deviceCategoryDisplayName": "String",
  "deviceEnrollmentType": "String",
  "deviceHealthAttestationState": {
    "@odata.type": "microsoft.graph.deviceHealthAttestationState"
  },
  "deviceName": "String",
  "deviceRegistrationState": "String",
  "deviceType": "String",
  "easActivated": "Boolean",
  "easActivationDateTime": "String (timestamp)",
  "easDeviceId": "String",
  "emailAddress": "String",
  "enrolledDateTime": "String (timestamp)",
  "ethernetMacAddress": "String",
  "exchangeAccessState": "String",
  "exchangeAccessStateReason": "String",
  "exchangeLastSuccessfulSyncDateTime": "String (timestamp)",
  "freeStorageSpaceInBytes": "Integer",
  "hardwareInformation": {
    "@odata.type": "microsoft.graph.hardwareInformation"
  },
  "iccid": "String",
  "imei": "String",
  "isEncrypted": "Boolean",
  "isSupervised": "Boolean",
  "jailBroken": "String",
  "joinType": "String",
  "lastSyncDateTime": "String (timestamp)",
  "lostModeState": "String",
  "managedDeviceName": "String",
  "managedDeviceOwnerType": "String",
  "managementAgent": "String",
  "managementCertificateExpirationDate": "String (timestamp)",
  "managementFeatures": "String",
  "managementState": "String",
  "manufacturer": "String",
  "meid": "String",
  "model": "String",
  "notes": "String",
  "operatingSystem": "String",
  "osVersion": "String",
  "ownerType": "String",
  "partnerReportedThreatState": "String",
  "phoneNumber": "String",
  "physicalMemoryInBytes": "Integer",
  "preferMdmOverGroupPolicyAppliedDateTime": "String (timestamp)",
  "processorArchitecture": "String",
  "remoteAssistanceSessionErrorDetails": "String",
  "remoteAssistanceSessionUrl": "String",
  "requireUserEnrollmentApproval": "Boolean",
  "retireAfterDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "serialNumber": "String",
  "skuFamily": "String",
  "skuNumber": "Integer",
  "specificationVersion": "String",
  "subscriberCarrier": "String",
  "totalStorageSpaceInBytes": "Integer",
  "udid": "String",
  "userDisplayName": "String",
  "userId": "String",
  "userPrincipalName": "String",
  "usersLoggedOn": [
    {
      "@odata.type": "microsoft.graph.loggedOnUser"
    }
  ],
  "wiFiMacAddress": "String",
  "windowsActiveMalwareCount": "Integer",
  "windowsRemediatedMalwareCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsManagedDevice"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsManagedDevice",
  "id": "e30e47b3-47b3-e30e-b347-0ee3b3470ee3",
  "aadRegistered": "Boolean",
  "activationLockBypassCode": "String",
  "androidSecurityPatchLevel": "String",
  "autopilotEnrolled": "Boolean",
  "azureActiveDirectoryDeviceId": "String",
  "azureADDeviceId": "String",
  "azureADRegistered": "Boolean",
  "chassisType": "String",
  "chromeOSDeviceInfo": [
    {
      "@odata.type": "microsoft.graph.chromeOSDeviceProperty"
    }
  ],
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "complianceState": "String",
  "configurationManagerClientEnabledFeatures": {
    "@odata.type": "microsoft.graph.configurationManagerClientEnabledFeatures"
  },
  "configurationManagerClientHealthState": {
    "@odata.type": "microsoft.graph.configurationManagerClientHealthState"
  },
  "configurationManagerClientInformation": {
    "@odata.type": "microsoft.graph.configurationManagerClientInformation"
  },
  "deviceActionResults": [
    {
      "@odata.type": "microsoft.graph.deviceActionResult"
    }
  ],
  "deviceCategoryDisplayName": "String",
  "deviceEnrollmentType": "String",
  "deviceHealthAttestationState": {
    "@odata.type": "microsoft.graph.deviceHealthAttestationState"
  },
  "deviceName": "String",
  "deviceRegistrationState": "String",
  "deviceType": "String",
  "easActivated": "Boolean",
  "easActivationDateTime": "String (timestamp)",
  "easDeviceId": "String",
  "emailAddress": "String",
  "enrolledDateTime": "String (timestamp)",
  "ethernetMacAddress": "String",
  "exchangeAccessState": "String",
  "exchangeAccessStateReason": "String",
  "exchangeLastSuccessfulSyncDateTime": "String (timestamp)",
  "freeStorageSpaceInBytes": "Integer",
  "hardwareInformation": {
    "@odata.type": "microsoft.graph.hardwareInformation"
  },
  "iccid": "String",
  "imei": "String",
  "isEncrypted": "Boolean",
  "isSupervised": "Boolean",
  "jailBroken": "String",
  "joinType": "String",
  "lastSyncDateTime": "String (timestamp)",
  "lostModeState": "String",
  "managedDeviceName": "String",
  "managedDeviceOwnerType": "String",
  "managementAgent": "String",
  "managementCertificateExpirationDate": "String (timestamp)",
  "managementFeatures": "String",
  "managementState": "String",
  "manufacturer": "String",
  "meid": "String",
  "model": "String",
  "notes": "String",
  "operatingSystem": "String",
  "osVersion": "String",
  "ownerType": "String",
  "partnerReportedThreatState": "String",
  "phoneNumber": "String",
  "physicalMemoryInBytes": "Integer",
  "preferMdmOverGroupPolicyAppliedDateTime": "String (timestamp)",
  "processorArchitecture": "String",
  "remoteAssistanceSessionErrorDetails": "String",
  "remoteAssistanceSessionUrl": "String",
  "requireUserEnrollmentApproval": "Boolean",
  "retireAfterDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "serialNumber": "String",
  "skuFamily": "String",
  "skuNumber": "Integer",
  "specificationVersion": "String",
  "subscriberCarrier": "String",
  "totalStorageSpaceInBytes": "Integer",
  "udid": "String",
  "userDisplayName": "String",
  "userId": "String",
  "userPrincipalName": "String",
  "usersLoggedOn": [
    {
      "@odata.type": "microsoft.graph.loggedOnUser"
    }
  ],
  "wiFiMacAddress": "String",
  "windowsActiveMalwareCount": "Integer",
  "windowsRemediatedMalwareCount": "Integer"
}
```

