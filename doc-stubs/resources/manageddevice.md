---
title: "managedDevice resource type"
description: "Devices that are managed or pre-enrolled through Intune"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDevice resource type

Namespace: microsoft.graph



Devices that are managed or pre-enrolled through Intune


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDevices](../api/manageddevice-list.md)|[managedDevice](../resources/manageddevice.md) collection|Get a list of the [managedDevice](../resources/manageddevice.md) objects and their properties.|
|[Create managedDevice](../api/manageddevice-create.md)|[managedDevice](../resources/manageddevice.md)|Create a new [managedDevice](../resources/manageddevice.md) object.|
|[Get managedDevice](../api/manageddevice-get.md)|[managedDevice](../resources/manageddevice.md)|Read the properties and relationships of a [managedDevice](../resources/manageddevice.md) object.|
|[Update managedDevice](../api/manageddevice-update.md)|[managedDevice](../resources/manageddevice.md)|Update the properties of a [managedDevice](../resources/manageddevice.md) object.|
|[Delete managedDevice](../api/manageddevice-delete.md)|None|Deletes a [managedDevice](../resources/manageddevice.md) object.|
|[createDeviceLogCollectionRequest](../api/manageddevice-createdevicelogcollectionrequest.md)|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md)|**TODO: Add Description**|
|[enableLostMode](../api/manageddevice-enablelostmode.md)|None|**TODO: Add Description**|
|[executeAction](../api/manageddevice-executeaction.md)|[bulkManagedDeviceActionResult](../resources/bulkmanageddeviceactionresult.md)|**TODO: Add Description**|
|[overrideComplianceState](../api/manageddevice-overridecompliancestate.md)|None|**TODO: Add Description**|
|[playLostModeSound](../api/manageddevice-playlostmodesound.md)|None|**TODO: Add Description**|
|[revokeAppleVppLicenses](../api/manageddevice-revokeapplevpplicenses.md)|None|**TODO: Add Description**|
|[rotateBitLockerKeys](../api/manageddevice-rotatebitlockerkeys.md)|None|**TODO: Add Description**|
|[rotateFileVaultKey](../api/manageddevice-rotatefilevaultkey.md)|None|**TODO: Add Description**|
|[sendCustomNotificationToCompanyPortal](../api/manageddevice-sendcustomnotificationtocompanyportal.md)|None|**TODO: Add Description**|
|[setDeviceName](../api/manageddevice-setdevicename.md)|None|**TODO: Add Description**|
|[triggerConfigurationManagerAction](../api/manageddevice-triggerconfigurationmanageraction.md)|None|**TODO: Add Description**|
|[wipe](../api/manageddevice-wipe.md)|None|**TODO: Add Description**|
|[getFileVaultKey](../api/manageddevice-getfilevaultkey.md)|String|**TODO: Add Description**|
|[getNonCompliantSettings](../api/manageddevice-getnoncompliantsettings.md)|[deviceCompliancePolicySettingState](../resources/devicecompliancepolicysettingstate.md) collection|**TODO: Add Description**|
|[List assignmentFilterEvaluationStatusDetails](../api/manageddevice-list-assignmentfilterevaluationstatusdetails.md)|[assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) collection|Get the assignmentFilterEvaluationStatusDetails resources from the assignmentFilterEvaluationStatusDetails navigation property.|
|[Create assignmentFilterEvaluationStatusDetails](../api/manageddevice-post-assignmentfilterevaluationstatusdetails.md)|[assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md)|Create a new assignmentFilterEvaluationStatusDetails object.|
|[List detectedApps](../api/manageddevice-list-detectedapps.md)|[detectedApp](../resources/detectedapp.md) collection|Get the detectedApp resources from the detectedApps navigation property.|
|[Add detectedApp](../api/manageddevice-post-detectedapps.md)|[detectedApp](../resources/detectedapp.md)|Add detectedApps by posting to the detectedApps collection.|
|[List logCollectionRequests](../api/manageddevice-list-logcollectionrequests.md)|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) collection|Get the deviceLogCollectionResponse resources from the logCollectionRequests navigation property.|
|[Create deviceLogCollectionResponse](../api/manageddevice-post-logcollectionrequests.md)|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md)|Create a new deviceLogCollectionResponse object.|
|[List managedDeviceMobileAppConfigurationStates](../api/manageddevice-list-manageddevicemobileappconfigurationstates.md)|[managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md) collection|Get the managedDeviceMobileAppConfigurationState resources from the managedDeviceMobileAppConfigurationStates navigation property.|
|[Create managedDeviceMobileAppConfigurationState](../api/manageddevice-post-manageddevicemobileappconfigurationstates.md)|[managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md)|Create a new managedDeviceMobileAppConfigurationState object.|
|[List securityBaselineStates](../api/manageddevice-list-securitybaselinestates.md)|[securityBaselineState](../resources/securitybaselinestate.md) collection|Get the securityBaselineState resources from the securityBaselineStates navigation property.|
|[Create securityBaselineState](../api/manageddevice-post-securitybaselinestates.md)|[securityBaselineState](../resources/securitybaselinestate.md)|Create a new securityBaselineState object.|
|[List users](../api/manageddevice-list-users.md)|[user](../resources/user.md) collection|Get the user resources from the users navigation property.|
|[Create user](../api/manageddevice-post-users.md)|[user](../resources/user.md)|Create a new user object.|
|[List windowsProtectionState](../api/manageddevice-list-windowsprotectionstate.md)|[windowsProtectionState](../resources/windowsprotectionstate.md) collection|Get the windowsProtectionState resources from the windowsProtectionState navigation property.|
|[Create windowsProtectionState](../api/manageddevice-post-windowsprotectionstate.md)|[windowsProtectionState](../resources/windowsprotectionstate.md)|Create a new windowsProtectionState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|aadRegistered|Boolean|Whether the device is Azure Active Directory registered. This property is read-only.|
|activationLockBypassCode|String|Code that allows the Activation Lock on a device to be bypassed. This property is read-only.|
|androidSecurityPatchLevel|String|Android security patch level. This property is read-only.|
|autopilotEnrolled|Boolean|Reports if the managed device is enrolled via auto-pilot. This property is read-only.|
|azureActiveDirectoryDeviceId|String|The unique identifier for the Azure Active Directory device. Read only. This property is read-only.|
|azureADDeviceId|String|The unique identifier for the Azure Active Directory device. Read only. This property is read-only.|
|azureADRegistered|Boolean|Whether the device is Azure Active Directory registered. This property is read-only.|
|chassisType|chassisType|Chassis type of the device. This property is read-only. Possible values are: `unknown`, `desktop`, `laptop`, `worksWorkstation`, `enterpriseServer`, `phone`, `tablet`, `mobileOther`, `mobileUnknown`.|
|chromeOSDeviceInfo|[chromeOSDeviceProperty](../resources/chromeosdeviceproperty.md) collection|List of properties of the ChromeOS Device.|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|The DateTime when device compliance grace period expires. This property is read-only.|
|complianceState|complianceState|Compliance state of the device. This property is read-only. Possible values are: `unknown`, `compliant`, `noncompliant`, `conflict`, `error`, `inGracePeriod`, `configManager`.|
|configurationManagerClientEnabledFeatures|[configurationManagerClientEnabledFeatures](../resources/configurationmanagerclientenabledfeatures.md)|ConfigrMgr client enabled features. This property is read-only.|
|configurationManagerClientHealthState|[configurationManagerClientHealthState](../resources/configurationmanagerclienthealthstate.md)|Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent|
|configurationManagerClientInformation|[configurationManagerClientInformation](../resources/configurationmanagerclientinformation.md)|Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent|
|deviceActionResults|[deviceActionResult](../resources/deviceactionresult.md) collection|List of ComplexType deviceActionResult objects. This property is read-only.|
|deviceCategoryDisplayName|String|Device category display name. This property is read-only.|
|deviceEnrollmentType|deviceEnrollmentType|Enrollment type of the device. This property is read-only. Possible values are: `unknown`, `userEnrollment`, `deviceEnrollmentManager`, `appleBulkWithUser`, `appleBulkWithoutUser`, `windowsAzureADJoin`, `windowsBulkUserless`, `windowsAutoEnrollment`, `windowsBulkAzureDomainJoin`, `windowsCoManagement`, `windowsAzureADJoinUsingDeviceAuth`, `appleUserEnrollment`, `appleUserEnrollmentWithServiceAccount`, `azureAdJoinUsingAzureVmExtension`, `androidEnterpriseDedicatedDevice`, `androidEnterpriseFullyManaged`, `androidEnterpriseCorporateWorkProfile`.|
|deviceHealthAttestationState|[deviceHealthAttestationState](../resources/devicehealthattestationstate.md)|The device health attestation state. This property is read-only.|
|deviceName|String|Name of the device. This property is read-only.|
|deviceRegistrationState|deviceRegistrationState|Device registration state. This property is read-only. Possible values are: `notRegistered`, `registered`, `revoked`, `keyConflict`, `approvalPending`, `certificateReset`, `notRegisteredPendingEnrollment`, `unknown`.|
|deviceType|deviceType|Platform of the device. This property is read-only. Possible values are: `desktop`, `windowsRT`, `winMO6`, `nokia`, `windowsPhone`, `mac`, `winCE`, `winEmbedded`, `iPhone`, `iPad`, `iPod`, `android`, `iSocConsumer`, `unix`, `macMDM`, `holoLens`, `surfaceHub`, `androidForWork`, `androidEnterprise`, `windows10x`, `androidnGMS`, `chromeOS`, `linux`, `blackberry`, `palm`, `unknown`, `cloudPC`.|
|easActivated|Boolean|Whether the device is Exchange ActiveSync activated. This property is read-only.|
|easActivationDateTime|DateTimeOffset|Exchange ActivationSync activation time of the device. This property is read-only.|
|easDeviceId|String|Exchange ActiveSync Id of the device. This property is read-only.|
|emailAddress|String|Email(s) for the user associated with the device. This property is read-only.|
|enrolledDateTime|DateTimeOffset|Enrollment time of the device. This property is read-only.|
|ethernetMacAddress|String|Ethernet MAC. This property is read-only.|
|exchangeAccessState|deviceManagementExchangeAccessState|The Access State of the device in Exchange. This property is read-only. Possible values are: `none`, `unknown`, `allowed`, `blocked`, `quarantined`.|
|exchangeAccessStateReason|deviceManagementExchangeAccessStateReason|The reason for the device's access state in Exchange. This property is read-only. Possible values are: `none`, `unknown`, `exchangeGlobalRule`, `exchangeIndividualRule`, `exchangeDeviceRule`, `exchangeUpgrade`, `exchangeMailboxPolicy`, `other`, `compliant`, `notCompliant`, `notEnrolled`, `unknownLocation`, `mfaRequired`, `azureADBlockDueToAccessPolicy`, `compromisedPassword`, `deviceNotKnownWithManagedApp`.|
|exchangeLastSuccessfulSyncDateTime|DateTimeOffset|Last time the device contacted Exchange. This property is read-only.|
|freeStorageSpaceInBytes|Int64|Free Storage in Bytes. This property is read-only.|
|hardwareInformation|[hardwareInformation](../resources/hardwareinformation.md)|The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. This property is read-only.|
|iccid|String|Integrated Circuit Card Identifier, it is A SIM card's unique identification number. This property is read-only.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|imei|String|IMEI. This property is read-only.|
|isEncrypted|Boolean|Device encryption status. This property is read-only.|
|isSupervised|Boolean|Device supervised status. This property is read-only.|
|jailBroken|String|whether the device is jail broken or rooted. This property is read-only.|
|joinType|joinType|Device join type. Possible values are: `unknown`, `azureADJoined`, `azureADRegistered`, `hybridAzureADJoined`.|
|lastSyncDateTime|DateTimeOffset|The date and time that the device last completed a successful sync with Intune. This property is read-only.|
|lostModeState|lostModeState|Indicates if Lost mode is enabled or disabled. This property is read-only. Possible values are: `disabled`, `enabled`.|
|managedDeviceName|String|Automatically generated name to identify a device. Can be overwritten to a user friendly name.|
|managedDeviceOwnerType|managedDeviceOwnerType|Ownership of the device. Can be 'company' or 'personal'. Possible values are: `unknown`, `company`, `personal`.|
|managementAgent|managementAgentType|Management channel of the device. Intune, EAS, etc. This property is read-only. Possible values are: `eas`, `mdm`, `easMdm`, `intuneClient`, `easIntuneClient`, `configurationManagerClient`, `configurationManagerClientMdm`, `configurationManagerClientMdmEas`, `unknown`, `jamf`, `googleCloudDevicePolicyController`, `microsoft365ManagedMdm`, `windowsManagementCloudApi`.|
|managementCertificateExpirationDate|DateTimeOffset|Reports device management certificate expiration date. This property is read-only.|
|managementFeatures|managedDeviceManagementFeatures|Device management features. Possible values are: `none`, `microsoftManagedDesktop`.|
|managementState|managementState|Management state of the device. This property is read-only. Possible values are: `managed`, `retirePending`, `retireFailed`, `wipePending`, `wipeFailed`, `unhealthy`, `deletePending`, `retireIssued`, `wipeIssued`, `wipeCanceled`, `retireCanceled`, `discovered`.|
|manufacturer|String|Manufacturer of the device. This property is read-only.|
|meid|String|MEID. This property is read-only.|
|model|String|Model of the device. This property is read-only.|
|notes|String|Notes on the device created by IT Admin|
|operatingSystem|String|Operating system of the device. Windows, iOS, etc. This property is read-only.|
|osVersion|String|Operating system version of the device. This property is read-only.|
|ownerType|ownerType|Ownership of the device. Can be 'company' or 'personal'. Possible values are: `unknown`, `company`, `personal`.|
|partnerReportedThreatState|managedDevicePartnerReportedHealthState|Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read Only. This property is read-only. Possible values are: `unknown`, `activated`, `deactivated`, `secured`, `lowSeverity`, `mediumSeverity`, `highSeverity`, `unresponsive`, `compromised`, `misconfigured`.|
|phoneNumber|String|Phone number of the device. This property is read-only.|
|physicalMemoryInBytes|Int64|Total Memory in Bytes. This property is read-only.|
|preferMdmOverGroupPolicyAppliedDateTime|DateTimeOffset|Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only.|
|processorArchitecture|managedDeviceArchitecture|Processor architecture. This property is read-only. Possible values are: `unknown`, `x86`, `x64`, `arm`, `arM64`.|
|remoteAssistanceSessionErrorDetails|String|An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.|
|remoteAssistanceSessionUrl|String|Url that allows a Remote Assistance session to be established with the device. This property is read-only.|
|requireUserEnrollmentApproval|Boolean|Reports if the managed iOS device is user approval enrollment. This property is read-only.|
|retireAfterDateTime|DateTimeOffset|Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only.|
|roleScopeTagIds|String collection|List of Scope Tag IDs for this Device instance.|
|serialNumber|String|SerialNumber. This property is read-only.|
|skuFamily|String|Device sku family|
|skuNumber|Int32|Device sku number, see also: https://docs.microsoft.com/en-us/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only.|
|specificationVersion|String|Specification version. This property is read-only.|
|subscriberCarrier|String|Subscriber Carrier. This property is read-only.|
|totalStorageSpaceInBytes|Int64|Total Storage in Bytes. This property is read-only.|
|udid|String|Unique Device Identifier for iOS and macOS devices. This property is read-only.|
|userDisplayName|String|User display name. This property is read-only.|
|userId|String|Unique Identifier for the user associated with the device. This property is read-only.|
|userPrincipalName|String|Device user principal name. This property is read-only.|
|usersLoggedOn|[loggedOnUser](../resources/loggedonuser.md) collection|Indicates the last logged on users of a device. This property is read-only.|
|wiFiMacAddress|String|Wi-Fi MAC. This property is read-only.|
|windowsActiveMalwareCount|Int32|Count of active malware for this windows device. This property is read-only.|
|windowsRemediatedMalwareCount|Int32|Count of remediated malware for this windows device. This property is read-only.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignmentFilterEvaluationStatusDetails|[assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) collection|Managed device mobile app configuration states for this device.|
|detectedApps|[detectedApp](../resources/detectedapp.md) collection|All applications currently installed on the device|
|deviceCategory|[deviceCategory](../resources/devicecategory.md)|Device category|
|deviceCompliancePolicyStates|[deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) collection|Device compliance policy states for this device.|
|deviceConfigurationStates|[deviceConfigurationState](../resources/deviceconfigurationstate.md) collection|Device configuration states for this device.|
|logCollectionRequests|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) collection|List of log collection requests|
|managedDeviceMobileAppConfigurationStates|[managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md) collection|Managed device mobile app configuration states for this device.|
|securityBaselineStates|[securityBaselineState](../resources/securitybaselinestate.md) collection|Security baseline states for this device.|
|users|[user](../resources/user.md) collection|The primary users associated with the managed device.|
|windowsProtectionState|[windowsProtectionState](../resources/windowsprotectionstate.md)|The device protection status.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedDevice",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedDevice",
  "id": "String (identifier)",
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

