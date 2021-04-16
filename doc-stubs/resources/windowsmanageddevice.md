---
title: "windowsManagedDevice resource type"
description: "Windows devices that are managed or pre-enrolled through Intune"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsManagedDevice resource type

Namespace: microsoft.graph



Windows devices that are managed or pre-enrolled through Intune


Inherits from [managedDevice](../resources/manageddevice.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsManagedDevices](../api/windowsmanageddevice-list.md)|[windowsManagedDevice](../resources/windowsmanageddevice.md) collection|Get a list of the [windowsManagedDevice](../resources/windowsmanageddevice.md) objects and their properties.|
|[Create windowsManagedDevice](../api/windowsmanageddevice-create.md)|[windowsManagedDevice](../resources/windowsmanageddevice.md)|Create a new [windowsManagedDevice](../resources/windowsmanageddevice.md) object.|
|[Get windowsManagedDevice](../api/windowsmanageddevice-get.md)|[windowsManagedDevice](../resources/windowsmanageddevice.md)|Read the properties and relationships of a [windowsManagedDevice](../resources/windowsmanageddevice.md) object.|
|[Update windowsManagedDevice](../api/windowsmanageddevice-update.md)|[windowsManagedDevice](../resources/windowsmanageddevice.md)|Update the properties of a [windowsManagedDevice](../resources/windowsmanageddevice.md) object.|
|[Delete windowsManagedDevice](../api/windowsmanageddevice-delete.md)|None|Deletes a [windowsManagedDevice](../resources/windowsmanageddevice.md) object.|
|[bypassActivationLock](../api/windowsmanageddevice-bypassactivationlock.md)|None|**TODO: Add Description**|
|[cleanWindowsDevice](../api/windowsmanageddevice-cleanwindowsdevice.md)|None|**TODO: Add Description**|
|[createDeviceLogCollectionRequest](../api/windowsmanageddevice-createdevicelogcollectionrequest.md)|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md)|**TODO: Add Description**|
|[deleteUserFromSharedAppleDevice](../api/windowsmanageddevice-deleteuserfromsharedappledevice.md)|None|**TODO: Add Description**|
|[disableLostMode](../api/windowsmanageddevice-disablelostmode.md)|None|**TODO: Add Description**|
|[enableLostMode](../api/windowsmanageddevice-enablelostmode.md)|None|**TODO: Add Description**|
|[locateDevice](../api/windowsmanageddevice-locatedevice.md)|None|**TODO: Add Description**|
|[logoutSharedAppleDeviceActiveUser](../api/windowsmanageddevice-logoutsharedappledeviceactiveuser.md)|None|**TODO: Add Description**|
|[overrideComplianceState](../api/windowsmanageddevice-overridecompliancestate.md)|None|**TODO: Add Description**|
|[playLostModeSound](../api/windowsmanageddevice-playlostmodesound.md)|None|**TODO: Add Description**|
|[rebootNow](../api/windowsmanageddevice-rebootnow.md)|None|**TODO: Add Description**|
|[recoverPasscode](../api/windowsmanageddevice-recoverpasscode.md)|None|**TODO: Add Description**|
|[remoteLock](../api/windowsmanageddevice-remotelock.md)|None|**TODO: Add Description**|
|[requestRemoteAssistance](../api/windowsmanageddevice-requestremoteassistance.md)|None|**TODO: Add Description**|
|[resetPasscode](../api/windowsmanageddevice-resetpasscode.md)|None|**TODO: Add Description**|
|[retire](../api/windowsmanageddevice-retire.md)|None|**TODO: Add Description**|
|[revokeAppleVppLicenses](../api/windowsmanageddevice-revokeapplevpplicenses.md)|None|**TODO: Add Description**|
|[rotateBitLockerKeys](../api/windowsmanageddevice-rotatebitlockerkeys.md)|None|**TODO: Add Description**|
|[rotateFileVaultKey](../api/windowsmanageddevice-rotatefilevaultkey.md)|None|**TODO: Add Description**|
|[sendCustomNotificationToCompanyPortal](../api/windowsmanageddevice-sendcustomnotificationtocompanyportal.md)|None|**TODO: Add Description**|
|[setDeviceName](../api/windowsmanageddevice-setdevicename.md)|None|**TODO: Add Description**|
|[shutDown](../api/windowsmanageddevice-shutdown.md)|None|**TODO: Add Description**|
|[syncDevice](../api/windowsmanageddevice-syncdevice.md)|None|**TODO: Add Description**|
|[triggerConfigurationManagerAction](../api/windowsmanageddevice-triggerconfigurationmanageraction.md)|None|**TODO: Add Description**|
|[updateWindowsDeviceAccount](../api/windowsmanageddevice-updatewindowsdeviceaccount.md)|None|**TODO: Add Description**|
|[windowsDefenderScan](../api/windowsmanageddevice-windowsdefenderscan.md)|None|**TODO: Add Description**|
|[windowsDefenderUpdateSignatures](../api/windowsmanageddevice-windowsdefenderupdatesignatures.md)|None|**TODO: Add Description**|
|[wipe](../api/windowsmanageddevice-wipe.md)|None|**TODO: Add Description**|
|[getFileVaultKey](../api/windowsmanageddevice-getfilevaultkey.md)|String|**TODO: Add Description**|
|[getNonCompliantSettings](../api/windowsmanageddevice-getnoncompliantsettings.md)|[deviceCompliancePolicySettingState](../resources/devicecompliancepolicysettingstate.md) collection|**TODO: Add Description**|
|[List assignmentFilterEvaluationStatusDetails](../api/windowsmanageddevice-list-assignmentfilterevaluationstatusdetails.md)|[assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) collection|Get the assignmentFilterEvaluationStatusDetails resources from the assignmentFilterEvaluationStatusDetails navigation property.|
|[Create assignmentFilterEvaluationStatusDetails](../api/windowsmanageddevice-post-assignmentfilterevaluationstatusdetails.md)|[assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md)|Create a new assignmentFilterEvaluationStatusDetails object.|
|[List detectedApps](../api/windowsmanageddevice-list-detectedapps.md)|[detectedApp](../resources/detectedapp.md) collection|Get the detectedApp resources from the detectedApps navigation property.|
|[Add detectedApp](../api/windowsmanageddevice-post-detectedapps.md)|[detectedApp](../resources/detectedapp.md)|Add detectedApps by posting to the detectedApps collection.|
|[List deviceCategory](../api/windowsmanageddevice-list-devicecategory.md)|[deviceCategory](../resources/devicecategory.md) collection|Get the deviceCategory resources from the deviceCategory navigation property.|
|[Create deviceCategory](../api/windowsmanageddevice-post-devicecategory.md)|[deviceCategory](../resources/devicecategory.md)|Create a new deviceCategory object.|
|[List deviceCompliancePolicyStates](../api/windowsmanageddevice-list-devicecompliancepolicystates.md)|[deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) collection|Get the deviceCompliancePolicyState resources from the deviceCompliancePolicyStates navigation property.|
|[Create deviceCompliancePolicyState](../api/windowsmanageddevice-post-devicecompliancepolicystates.md)|[deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md)|Create a new deviceCompliancePolicyState object.|
|[List deviceConfigurationStates](../api/windowsmanageddevice-list-deviceconfigurationstates.md)|[deviceConfigurationState](../resources/deviceconfigurationstate.md) collection|Get the deviceConfigurationState resources from the deviceConfigurationStates navigation property.|
|[Create deviceConfigurationState](../api/windowsmanageddevice-post-deviceconfigurationstates.md)|[deviceConfigurationState](../resources/deviceconfigurationstate.md)|Create a new deviceConfigurationState object.|
|[List logCollectionRequests](../api/windowsmanageddevice-list-logcollectionrequests.md)|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) collection|Get the deviceLogCollectionResponse resources from the logCollectionRequests navigation property.|
|[Create deviceLogCollectionResponse](../api/windowsmanageddevice-post-logcollectionrequests.md)|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md)|Create a new deviceLogCollectionResponse object.|
|[List managedDeviceMobileAppConfigurationStates](../api/windowsmanageddevice-list-manageddevicemobileappconfigurationstates.md)|[managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md) collection|Get the managedDeviceMobileAppConfigurationState resources from the managedDeviceMobileAppConfigurationStates navigation property.|
|[Create managedDeviceMobileAppConfigurationState](../api/windowsmanageddevice-post-manageddevicemobileappconfigurationstates.md)|[managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md)|Create a new managedDeviceMobileAppConfigurationState object.|
|[List securityBaselineStates](../api/windowsmanageddevice-list-securitybaselinestates.md)|[securityBaselineState](../resources/securitybaselinestate.md) collection|Get the securityBaselineState resources from the securityBaselineStates navigation property.|
|[Create securityBaselineState](../api/windowsmanageddevice-post-securitybaselinestates.md)|[securityBaselineState](../resources/securitybaselinestate.md)|Create a new securityBaselineState object.|
|[List users](../api/windowsmanageddevice-list-users.md)|[user](../resources/user.md) collection|Get the user resources from the users navigation property.|
|[Create user](../api/windowsmanageddevice-post-users.md)|[user](../resources/user.md)|Create a new user object.|
|[List windowsProtectionState](../api/windowsmanageddevice-list-windowsprotectionstate.md)|[windowsProtectionState](../resources/windowsprotectionstate.md) collection|Get the windowsProtectionState resources from the windowsProtectionState navigation property.|
|[Create windowsProtectionState](../api/windowsmanageddevice-post-windowsprotectionstate.md)|[windowsProtectionState](../resources/windowsprotectionstate.md)|Create a new windowsProtectionState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignmentFilterEvaluationStatusDetails|[assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) collection|Managed device mobile app configuration states for this device. Inherited from [managedDevice](../resources/manageddevice.md)|
|detectedApps|[detectedApp](../resources/detectedapp.md) collection|All applications currently installed on the device Inherited from [managedDevice](../resources/manageddevice.md)|
|deviceCategory|[deviceCategory](../resources/devicecategory.md)|Device category Inherited from [managedDevice](../resources/manageddevice.md)|
|deviceCompliancePolicyStates|[deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) collection|Device compliance policy states for this device. Inherited from [managedDevice](../resources/manageddevice.md)|
|deviceConfigurationStates|[deviceConfigurationState](../resources/deviceconfigurationstate.md) collection|Device configuration states for this device. Inherited from [managedDevice](../resources/manageddevice.md)|
|logCollectionRequests|[deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) collection|List of log collection requests Inherited from [managedDevice](../resources/manageddevice.md)|
|managedDeviceMobileAppConfigurationStates|[managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md) collection|Managed device mobile app configuration states for this device. Inherited from [managedDevice](../resources/manageddevice.md)|
|securityBaselineStates|[securityBaselineState](../resources/securitybaselinestate.md) collection|Security baseline states for this device. Inherited from [managedDevice](../resources/manageddevice.md)|
|users|[user](../resources/user.md) collection|The primary users associated with the managed device. Inherited from [managedDevice](../resources/manageddevice.md)|
|windowsProtectionState|[windowsProtectionState](../resources/windowsprotectionstate.md)|The device protection status. Inherited from [managedDevice](../resources/manageddevice.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsManagedDevice",
  "baseType": "microsoft.graph.managedDevice",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsManagedDevice",
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

