---
title: "Enum values"
description: "Microsoft Graph enumeration values"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: enumTypes
---

### aclType values 



|Member|
|:---|
|user|
|group|
|everyone|
|everyoneExceptGuests|
|unknownFutureValue|

### aclType values 



|Member|
|:---|
|user|
|group|
|everyone|
|everyoneExceptGuests|

### appleDeploymentChannel values 



|Member|
|:---|
|deviceChannel|
|userChannel|

### applicationIdentityType values 



|Member|
|:---|
|aadApplication|
|bot|
|tenantBot|
|office365Connector|
|outgoingWebhook|

### appliedConditionalAccessPolicyResult values 



|Member|
|:---|
|success|
|failure|
|notApplied|
|notEnabled|
|unknown|
|unknownFutureValue|
|reportOnlySuccess|
|reportOnlyFailure|
|reportOnlyNotApplied|
|reportOnlyInterrupted|

### assignmentFilterOperator values 



|Member|
|:---|
|notSet|
|equals|
|notEquals|
|startsWith|
|notStartsWith|
|contains|
|notContains|
|in|
|notIn|
|endsWith|
|notEndsWith|

### assignmentFilterPayloadType values 



|Member|
|:---|
|notSet|
|enrollmentRestrictions|

### authenticationMethodFeature values 



|Member|
|:---|
|ssprRegistered|
|ssprEnabled|
|ssprCapable|
|passwordlessCapable|
|mfaCapable|

### authMethodsType values 



|Member|
|:---|
|email|
|mobileSMS|
|mobilePhone|
|officePhone|
|securityQuestion|
|appNotification|
|appNotificationCode|
|appNotificationAndCode|
|appPassword|
|fido|
|alternateMobilePhone|
|mobilePhoneAndSMS|
|unknownFutureValue|

### azureADLicenseType values 



|Member|
|:---|
|none|
|free|
|basic|
|premiumP1|
|premiumP2|
|unknownFutureValue|

### chatMessageType values 



|Member|
|:---|
|message|
|chatEvent|
|typing|

### cloudPcOnPremisesConnectionHealthCheckErrorType values 



|Member|
|:---|
|dnsCheckFqdnNotFound|
|dnsCheckUnknownError|
|adJoinCheckFqdnNotFound|
|adJoinCheckIncorrectCredentials|
|adJoinCheckOrganizationalUnitNotFound|
|adJoinCheckOrganizationalUnitIncorrectFormat|
|adJoinCheckComputerObjectAlreadyExists|
|adJoinCheckUnknownError|
|endpointConnectivityCheckUrlNotWhitelisted|
|endpointConnectivityCheckUnknownError|
|aadConnectivityCheckUnknownError|
|resourceAvailabilityCheckNoSubnetIP|
|resourceAvailabilityCheckSubscriptionDisabled|
|resourceAvailabilityCheckUnknownError|
|permissionCheckNoSubscriptionReaderRole|
|permissionCheckNoResourceGroupOwnerRole|
|permissionCheckNoVNetContributorRole|
|permissionCheckUnknownError|
|internalServerUnknownError|

### cloudPcOnPremisesConnectionStatus values 



|Member|
|:---|
|pending|
|running|
|passed|
|failed|
|unknownFutureValue|

### cloudPcStatus values 



|Member|
|:---|
|notProvisioned|
|provisioning|
|provisioned|
|upgrading|
|inGracePeriod|
|deprovisioning|
|failed|

### conditionalAccessConditions values 



|Member|
|:---|
|none|
|application|
|users|
|devicePlatform|
|location|
|clientType|
|signInRisk|
|userRisk|
|time|
|deviceState|
|client|

### conditionalAccessStatus values 



|Member|
|:---|
|success|
|failure|
|notApplied|
|unknownFutureValue|

### conversationIdentityType values 



|Member|
|:---|
|team|
|channel|

### enrollmentRestrictionPlatformType values 



|Member|
|:---|
|allPlatforms|
|ios|
|windows|
|windowsPhone|
|android|
|androidForWork|
|androidAosp|
|mac|

### entityType values 



|Member|
|:---|
|event|
|message|
|driveItem|
|externalItem|
|site|
|list|
|listItem|
|drive|
|unknownfuturevalue|

### featureType values 



|Member|
|:---|
|registration|
|reset|
|unknownFutureValue|

### groupType values 



|Member|
|:---|
|unifiedGroups|
|azureAD|
|unknownFutureValue|

### includedUserRoles values 



|Member|
|:---|
|all|
|privilegedAdmin|
|admin|
|user|
|unknownFutureValue|

### includedUserTypes values 



|Member|
|:---|
|all|
|member|
|guest|
|unknownFutureValue|

### initiatorType values 



|Member|
|:---|
|user|
|app|
|system|
|unknownFutureValue|

### managedDeviceRemoteAction values 



|Member|
|:---|
|retire|
|delete|
|fullScan|
|quickScan|
|signatureUpdate|
|wipe|
|customTextNotification|
|rebootNow|
|setDeviceName|
|syncDevice|
|deprovision|
|disable|
|reenable|
|moveDeviceToOrganizationalUnit|

### migrationStatus values 



|Member|
|:---|
|ready|
|needsReview|
|additionalStepsRequired|
|unknownFutureValue|

### networkType values 



|Member|
|:---|
|intranet|
|extranet|
|namedNetwork|
|trusted|
|unknownFutureValue|

### operatingSystemUpgradeEligibility values 



|Member|
|:---|
|upgraded|
|unknown|
|notCapable|
|capable|

### operationResult values 



|Member|
|:---|
|success|
|failure|
|timeout|
|unknownFutureValue|

### provisioningResult values 



|Member|
|:---|
|success|
|failure|
|skipped|
|warning|
|unknownFutureValue|

### provisioningStepType values 



|Member|
|:---|
|import|
|scoping|
|matching|
|processing|
|referenceResolution|
|export|
|unknownFutureValue|

### registrationAuthMethod values 



|Member|
|:---|
|email|
|mobilePhone|
|officePhone|
|securityQuestion|
|appNotification|
|appCode|
|alternateMobilePhone|
|fido|
|appPassword|
|unknownFutureValue|

### registrationStatusType values 



|Member|
|:---|
|registered|
|enabled|
|capable|
|mfaRegistered|
|unknownFutureValue|

### requirementProvider values 



|Member|
|:---|
|user|
|request|
|servicePrincipal|
|v1ConditionalAccess|
|multiConditionalAccess|
|tenantSessionRiskPolicy|
|accountCompromisePolicies|
|v1ConditionalAccessDependency|
|v1ConditionalAccessPolicyIdRequested|
|mfaRegistrationRequiredByIdentityProtectionPolicy|
|baselineProtection|
|mfaRegistrationRequiredByBaselineProtection|
|mfaRegistrationRequiredByMultiConditionalAccess|
|enforcedForCspAdmins|
|securityDefaults|
|mfaRegistrationRequiredBySecurityDefaults|
|proofUpCodeRequest|
|crossTenantOutboundRule|
|gpsLocationCondition|
|riskBasedPolicy|
|unknownFutureValue|

### roleAssignmentRequestFilterByCurrentUserOptions values 



|Member|
|:---|
|principal|
|createdBy|
|approver|
|unknownFutureValue|

### roleEligibilityRequestFilterByCurrentUserOptions values 



|Member|
|:---|
|principal|
|createdBy|
|approver|
|unknownFutureValue|

### signInIdentifierType values 



|Member|
|:---|
|userPrincipalName|
|phoneNumber|
|proxyAddress|
|qrCode|
|onPremisesUserPrincipalName|
|unknownFutureValue|

### signInUserType values 



|Member|
|:---|
|member|
|guest|
|unknownFutureValue|

### synchronizationSecret values 



|Member|
|:---|
|None|
|UserName|
|Password|
|SecretToken|
|AppKey|
|BaseAddress|
|ClientIdentifier|
|ClientSecret|
|SingleSignOnType|
|Sandbox|
|Url|
|Domain|
|ConsumerKey|
|ConsumerSecret|
|TokenKey|
|TokenExpiration|
|Oauth2AccessToken|
|Oauth2AccessTokenCreationTime|
|Oauth2RefreshToken|
|SyncAll|
|InstanceName|
|Oauth2ClientId|
|Oauth2ClientSecret|
|CompanyId|
|UpdateKeyOnSoftDelete|
|SynchronizationSchedule|
|SystemOfRecord|
|SandboxName|
|EnforceDomain|
|SyncNotificationSettings|
|SkipOutOfScopeDeletions|
|Oauth2AuthorizationCode|
|Oauth2RedirectUri|
|ApplicationTemplateIdentifier|
|Server|
|PerformInboundEntitlementGrants|
|HardDeletesEnabled|
|SyncAgentCompatibilityKey|
|SyncAgentADContainer|
|ValidateDomain|
|TestReferences|

### targetedManagedAppGroupType values 



|Member|
|:---|
|selectedPublicApps|
|allCoreMicrosoftApps|
|allMicrosoftApps|
|allApps|

### teamsAsyncOperationType values 



|Member|
|:---|
|invalid|
|cloneTeam|
|archiveTeam|
|unarchiveTeam|
|createTeam|
|unknownFutureValue|
|teamifyGroup|
|createChannel|

### usageAuthMethod values 



|Member|
|:---|
|email|
|mobileSMS|
|mobileCall|
|officePhone|
|securityQuestion|
|appNotification|
|appCode|
|alternateMobileCall|
|fido|
|appPassword|
|unknownFutureValue|

### userIdentityType values 



|Member|
|:---|
|aadUser|
|onPremiseAadUser|
|anonymousGuest|
|federatedUser|
|personalMicrosoftAccountUser|
|skypeUser|

### vpnEncryptionAlgorithmType values 



|Member|
|:---|
|aes256|
|des|
|tripleDes|
|aes128|
|aes128Gcm|
|aes256Gcm|
|aes192|
|aes192Gcm|
|chaCha20Poly1305|

