---
title: "Enum values"
description: "Microsoft Graph enumeration values"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: enumTypes
---

### actionState values 

State of the action on the device

|Members|
|:---|
|none|
|pending|
|canceled|
|active|
|done|
|failed|
|notSupported|

### androidPermissionActionType values 

Android action taken when an app requests a dangerous permission.

|Members|
|:---|
|prompt|
|autoGrant|
|autoDeny|

### androidProfileApplicability values 

Android profile applicability

|Members|
|:---|
|default|
|androidWorkProfile|
|androidDeviceOwner|

### certificateStatus values 

**TODO: Add Description**

|Members|
|:---|
|notProvisioned|
|provisioned|

### complianceStatus values 

**TODO: Add Description**

|Members|
|:---|
|unknown|
|notApplicable|
|compliant|
|remediated|
|nonCompliant|
|error|
|conflict|
|notAssigned|

### deviceAndAppManagementAssignmentFilterType values 

Represents type of the assignment filter.

|Members|
|:---|
|none|
|include|

### deviceAndAppManagementAssignmentSource values 

Represents source of assignment.

|Members|
|:---|
|direct|
|policySets|

### installIntent values 

Possible values for the install intent chosen by the admin.

|Members|
|:---|
|available|
|required|
|uninstall|
|availableWithoutEnrollment|

### managedAppAvailability values 

A managed (MAM) application's availability.

|Members|
|:---|
|global|
|lineOfBusiness|

### mdmAppConfigKeyType values 

App configuration key types.

|Members|
|:---|
|stringType|
|integerType|
|realType|
|booleanType|
|tokenType|

### microsoftEdgeChannel values 

The enum to specify the channels for Microsoft Edge apps.

|Members|
|:---|
|dev|
|beta|
|stable|

### microsoftStoreForBusinessLicenseType values 

**TODO: Add Description**

|Members|
|:---|
|offline|
|online|

### mobileAppContentFileUploadState values 

Contains properties for upload request states.

|Members|
|:---|
|success|
|transientError|
|error|
|unknown|
|azureStorageUriRequestSuccess|
|azureStorageUriRequestPending|
|azureStorageUriRequestFailed|
|azureStorageUriRequestTimedOut|
|azureStorageUriRenewalSuccess|
|azureStorageUriRenewalPending|
|azureStorageUriRenewalFailed|
|azureStorageUriRenewalTimedOut|
|commitFileSuccess|
|commitFilePending|
|commitFileFailed|
|commitFileTimedOut|

### mobileAppDependencyType values 

Indicates the dependency type associated with a relationship between two mobile apps.

|Members|
|:---|
|detect|
|autoInstall|

### mobileAppPublishingState values 

Indicates the publishing state of an app.

|Members|
|:---|
|notPublished|
|processing|
|published|

### mobileAppRelationshipType values 

Indicates whether the target of a relationship is the parent or the child in the relationship.

|Members|
|:---|
|child|
|parent|

### mobileAppSupersedenceType values 

Indicates the supersedence type associated with a relationship between two mobile apps.

|Members|
|:---|
|update|
|replace|

### officeProductId values 

The Enum to specify the Office365 ProductIds that represent the Office365 Suite SKUs.

|Members|
|:---|
|o365ProPlusRetail|
|o365BusinessRetail|
|visioProRetail|
|projectProRetail|

### officeSuiteInstallProgressDisplayLevel values 

The Enum to specify the level of display for the Installation Progress Setup UI on the Device.

|Members|
|:---|
|none|
|full|

### officeUpdateChannel values 

The Enum to specify the Office365 Updates Channel.

|Members|
|:---|
|none|
|current|
|deferred|
|firstReleaseCurrent|
|firstReleaseDeferred|
|monthlyEnterprise|

### resultantAppState values 

**TODO: Add Description**

|Members|
|:---|
|installed|
|failed|
|notInstalled|
|uninstallFailed|
|pendingInstall|
|unknown|
|notApplicable|

### resultantAppStateDetail values 

Enum indicating additional details regarding why an application has a particular install state.

|Members|
|:---|
|noAdditionalDetails|
|dependencyFailedToInstall|
|dependencyWithRequirementsNotMet|
|dependencyPendingReboot|
|dependencyWithAutoInstallDisabled|
|iosAppStoreUpdateFailedToInstall|
|vppAppHasUpdateAvailable|
|userRejectedUpdate|
|seeInstallErrorCode|
|autoInstallDisabled|
|managedAppNoLongerPresent|
|userRejectedInstall|
|userIsNotLoggedIntoAppStore|
|seeUninstallErrorCode|
|pendingReboot|
|installingDependencies|
|contentDownloaded|
|powerShellScriptRequirementNotMet|
|registryRequirementNotMet|
|fileSystemRequirementNotMet|
|platformNotApplicable|
|minimumCpuSpeedNotMet|
|minimumLogicalProcessorCountNotMet|
|minimumPhysicalMemoryNotMet|
|minimumOsVersionNotMet|
|minimumDiskSpaceNotMet|
|processorArchitectureNotApplicable|

### runAsAccountType values 

Indicates the type of execution context the app runs in.

|Members|
|:---|
|system|
|user|

### vppTokenAccountType values 

Possible types of an Apple Volume Purchase Program token.

|Members|
|:---|
|business|
|education|

### vppTokenActionFailureReason values 

Possible types of reasons for an Apple Volume Purchase Program token action failure.

|Members|
|:---|
|none|
|appleFailure|
|internalError|
|expiredVppToken|
|expiredApplePushNotificationCertificate|

### win32LobAppDeliveryOptimizationPriority values 

Contains value for delivery optimization priority.

|Members|
|:---|
|notConfigured|
|foreground|

### win32LobAppDetectionOperator values 

Contains properties for detection operator.

|Members|
|:---|
|notConfigured|
|equal|
|notEqual|
|greaterThan|
|greaterThanOrEqual|
|lessThan|
|lessThanOrEqual|

### win32LobAppFileSystemDetectionType values 

Contains all supported file system detection type.

|Members|
|:---|
|notConfigured|
|exists|
|modifiedDate|
|createdDate|
|version|
|sizeInMB|
|doesNotExist|

### win32LobAppFileSystemOperationType values 

Contains all supported file system detection type.

|Members|
|:---|
|notConfigured|
|exists|
|modifiedDate|
|createdDate|
|version|
|sizeInMB|
|doesNotExist|

### win32LobAppMsiPackageType values 

Indicates the package type of an MSI Win32LobApp.

|Members|
|:---|
|perMachine|
|perUser|
|dualPurpose|

### win32LobAppNotification values 

Contains value for notification status.

|Members|
|:---|
|showAll|
|showReboot|
|hideAll|

### win32LobAppPowerShellScriptDetectionType values 

Contains all supported Powershell Script output detection type.

|Members|
|:---|
|notConfigured|
|string|
|dateTime|
|integer|
|float|
|version|
|boolean|

### win32LobAppPowerShellScriptRuleOperationType values 

Contains all supported Powershell Script output detection type.

|Members|
|:---|
|notConfigured|
|string|
|dateTime|
|integer|
|float|
|version|
|boolean|

### win32LobAppRegistryDetectionType values 

Contains all supported registry data detection type.

|Members|
|:---|
|notConfigured|
|exists|
|doesNotExist|
|string|
|integer|
|version|

### win32LobAppRegistryRuleOperationType values 

Contains all supported registry data detection type.

|Members|
|:---|
|notConfigured|
|exists|
|doesNotExist|
|string|
|integer|
|version|

### win32LobAppRestartBehavior values 

Indicates the type of restart action.

|Members|
|:---|
|basedOnReturnCode|
|allow|
|suppress|
|force|

### win32LobAppReturnCodeType values 

Indicates the type of return code.

|Members|
|:---|
|failed|
|success|
|softReboot|
|hardReboot|
|retry|

### win32LobAppRuleOperator values 

Contains properties for detection operator.

|Members|
|:---|
|notConfigured|
|equal|
|notEqual|
|greaterThan|
|greaterThanOrEqual|
|lessThan|
|lessThanOrEqual|

### win32LobAppRuleType values 

Contains rule types for Win32 LOB apps.

|Members|
|:---|
|detection|
|requirement|

### windowsArchitecture values 

Contains properties for Windows architecture.

|Members|
|:---|
|none|
|x86|
|x64|
|arm|
|neutral|
|arm64|

### windowsDeviceType values 

Contains properties for Windows device type.

|Members|
|:---|
|none|
|desktop|
|mobile|
|holographic|
|team|

