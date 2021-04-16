---
title: "user resource type"
description: "Represents an Azure Active Directory user object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# user resource type

Namespace: microsoft.graph



Represents an Azure Active Directory user object.


Inherits from [directoryObject](../resources/directoryobject.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List users](../api/user-list.md)|[user](../resources/user.md) collection|Get a list of the [user](../resources/user.md) objects and their properties.|
|[Create user](../api/user-post-users.md)|[user](../resources/user.md)|Create a new [user](../resources/user.md) object.|
|[Get user](../api/user-get.md)|[user](../resources/user.md)|Read the properties and relationships of a [user](../resources/user.md) object.|
|[Update user](../api/user-update.md)|[user](../resources/user.md)|Update the properties of a [user](../resources/user.md) object.|
|[Delete user](../api/user-delete.md)|None|Deletes a [user](../resources/user.md) object.|
|[activateServicePlan](../api/user-activateserviceplan.md)|None|**TODO: Add Description**|
|[invalidateAllRefreshTokens](../api/user-invalidateallrefreshtokens.md)|Boolean|**TODO: Add Description**|
|[revokeLocalGrant](../api/user-revokelocalgrant.md)|String|**TODO: Add Description**|
|[unblockManagedApps](../api/user-unblockmanagedapps.md)|None|**TODO: Add Description**|
|[wipeAndBlockManagedApps](../api/user-wipeandblockmanagedapps.md)|None|**TODO: Add Description**|
|[wipeManagedAppRegistrationByDeviceTag](../api/user-wipemanagedappregistrationbydevicetag.md)|None|**TODO: Add Description**|
|[exportDeviceAndAppManagementData](../api/user-exportdeviceandappmanagementdata.md)|[deviceAndAppManagementData](../resources/deviceandappmanagementdata.md)|**TODO: Add Description**|
|[exportDeviceAndAppManagementData](../api/user-exportdeviceandappmanagementdata.md)|[deviceAndAppManagementData](../resources/deviceandappmanagementdata.md)|**TODO: Add Description**|
|[findRoomLists](../api/user-findroomlists.md)|[emailAddress](../resources/emailaddress.md) collection|**TODO: Add Description**|
|[findRooms](../api/user-findrooms.md)|[emailAddress](../resources/emailaddress.md) collection|**TODO: Add Description**|
|[findRooms](../api/user-findrooms.md)|[emailAddress](../resources/emailaddress.md) collection|**TODO: Add Description**|
|[getEffectiveDeviceEnrollmentConfigurations](../api/user-geteffectivedeviceenrollmentconfigurations.md)|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) collection|**TODO: Add Description**|
|[getLoggedOnManagedDevices](../api/user-getloggedonmanageddevices.md)|[managedDevice](../resources/manageddevice.md) collection|**TODO: Add Description**|
|[getManagedAppBlockedUsers](../api/user-getmanagedappblockedusers.md)|String collection|**TODO: Add Description**|
|[getManagedDevicesWithAppFailures](../api/user-getmanageddeviceswithappfailures.md)|String collection|**TODO: Add Description**|
|[getManagedDevicesWithFailedOrPendingApps](../api/user-getmanageddeviceswithfailedorpendingapps.md)|[managedDeviceSummarizedAppState](../resources/manageddevicesummarizedappstate.md) collection|**TODO: Add Description**|
|[isManagedAppUserBlocked](../api/user-ismanagedappuserblocked.md)|Boolean|**TODO: Add Description**|
|[List userAnalytics](../api/user-list-analytics.md)|[userAnalytics](../resources/useranalytics.md) collection|Get the userAnalytics resources from the analytics navigation property.|
|[Create userAnalytics](../api/user-post-analytics.md)|[userAnalytics](../resources/useranalytics.md)|Create a new userAnalytics object.|
|[List appConsentRequestsForApproval](../api/user-list-appconsentrequestsforapproval.md)|[appConsentRequest](../resources/appconsentrequest.md) collection|Get the appConsentRequest resources from the appConsentRequestsForApproval navigation property.|
|[Create appConsentRequest](../api/user-post-appconsentrequestsforapproval.md)|[appConsentRequest](../resources/appconsentrequest.md)|Create a new appConsentRequest object.|
|[List approvals](../api/user-list-approvals.md)|[approval](../resources/approval.md) collection|Get the approval resources from the approvals navigation property.|
|[Create approval](../api/user-post-approvals.md)|[approval](../resources/approval.md)|Create a new approval object.|
|[List chats](../api/user-list-chats.md)|[chat](../resources/chat.md) collection|Get the chat resources from the chats navigation property.|
|[Create chat](../api/user-post-chats.md)|[chat](../resources/chat.md)|Create a new chat object.|
|[List deviceEnrollmentConfigurations](../api/user-list-deviceenrollmentconfigurations.md)|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) collection|Get the deviceEnrollmentConfiguration resources from the deviceEnrollmentConfigurations navigation property.|
|[Create deviceEnrollmentConfiguration](../api/user-post-deviceenrollmentconfigurations.md)|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|Create a new deviceEnrollmentConfiguration object.|
|[List devices](../api/user-list-devices.md)|[device](../resources/device.md) collection|Get the device resources from the devices navigation property.|
|[Create device](../api/user-post-devices.md)|[device](../resources/device.md)|Create a new device object.|
|[List informationProtection](../api/user-list-informationprotection.md)|[informationProtection](../resources/informationprotection.md) collection|Get the informationProtection resources from the informationProtection navigation property.|
|[Create informationProtection](../api/user-post-informationprotection.md)|[informationProtection](../resources/informationprotection.md)|Create a new informationProtection object.|
|[List itemInsights](../api/user-list-insights.md)|[itemInsights](../resources/iteminsights.md) collection|Get the itemInsights resources from the insights navigation property.|
|[Create itemInsights](../api/user-post-insights.md)|[itemInsights](../resources/iteminsights.md)|Create a new itemInsights object.|
|[List joinedGroups](../api/user-list-joinedgroups.md)|[group](../resources/group.md) collection|Get the group resources from the joinedGroups navigation property.|
|[Create group](../api/user-post-joinedgroups.md)|[group](../resources/group.md)|Create a new group object.|
|[List mobileAppIntentAndStates](../api/user-list-mobileappintentandstates.md)|[mobileAppIntentAndState](../resources/mobileappintentandstate.md) collection|Get the mobileAppIntentAndState resources from the mobileAppIntentAndStates navigation property.|
|[Create mobileAppIntentAndState](../api/user-post-mobileappintentandstates.md)|[mobileAppIntentAndState](../resources/mobileappintentandstate.md)|Create a new mobileAppIntentAndState object.|
|[List mobileAppTroubleshootingEvents](../api/user-list-mobileapptroubleshootingevents.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) collection|Get the mobileAppTroubleshootingEvent resources from the mobileAppTroubleshootingEvents navigation property.|
|[Create mobileAppTroubleshootingEvent](../api/user-post-mobileapptroubleshootingevents.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md)|Create a new mobileAppTroubleshootingEvent object.|
|[List notifications](../api/user-list-notifications.md)|[notification](../resources/notification.md) collection|Get the notification resources from the notifications navigation property.|
|[Create notification](../api/user-post-notifications.md)|[notification](../resources/notification.md)|Create a new notification object.|
|[List pendingAccessReviewInstances](../api/user-list-pendingaccessreviewinstances.md)|[accessReviewInstance](../resources/accessreviewinstance.md) collection|Get the accessReviewInstance resources from the pendingAccessReviewInstances navigation property.|
|[Create accessReviewInstance](../api/user-post-pendingaccessreviewinstances.md)|[accessReviewInstance](../resources/accessreviewinstance.md)|Create a new accessReviewInstance object.|
|[List profile](../api/user-list-profile.md)|[profile](../resources/profile.md) collection|Get the profile resources from the profile navigation property.|
|[Create profile](../api/user-post-profile.md)|[profile](../resources/profile.md)|Create a new profile object.|
|[List usageRights](../api/user-list-usagerights.md)|[usageRight](../resources/usageright.md) collection|Get the usageRight resources from the usageRights navigation property.|
|[Create usageRight](../api/user-post-usagerights.md)|[usageRight](../resources/usageright.md)|Create a new usageRight object.|
|[List windowsInformationProtectionDeviceRegistrations](../api/user-list-windowsinformationprotectiondeviceregistrations.md)|[windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md) collection|Get the windowsInformationProtectionDeviceRegistration resources from the windowsInformationProtectionDeviceRegistrations navigation property.|
|[Add windowsInformationProtectionDeviceRegistration](../api/user-post-windowsinformationprotectiondeviceregistrations.md)|[windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md)|Add windowsInformationProtectionDeviceRegistrations by posting to the windowsInformationProtectionDeviceRegistrations collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|aboutMe|String|**TODO: Add Description**|
|accountEnabled|Boolean|**TODO: Add Description**|
|ageGroup|String|**TODO: Add Description**|
|assignedLicenses|[assignedLicense](../resources/assignedlicense.md) collection|**TODO: Add Description**|
|assignedPlans|[assignedPlan](../resources/assignedplan.md) collection|**TODO: Add Description**|
|birthday|DateTimeOffset|**TODO: Add Description**|
|businessPhones|String collection|**TODO: Add Description**|
|city|String|**TODO: Add Description**|
|companyName|String|**TODO: Add Description**|
|consentProvidedForMinor|String|**TODO: Add Description**|
|country|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|creationType|String|**TODO: Add Description**|
|customSecurityAttributes|[customSecurityAttributeValue](../resources/customsecurityattributevalue.md)|**TODO: Add Description**|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|department|String|**TODO: Add Description**|
|deviceEnrollmentLimit|Int32|The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.|
|deviceKeys|[deviceKey](../resources/devicekey.md) collection|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|employeeHireDate|DateTimeOffset|**TODO: Add Description**|
|employeeId|String|**TODO: Add Description**|
|employeeOrgData|[employeeOrgData](../resources/employeeorgdata.md)|**TODO: Add Description**|
|employeeType|String|**TODO: Add Description**|
|externalUserState|String|**TODO: Add Description**|
|externalUserStateChangeDateTime|String|**TODO: Add Description**|
|faxNumber|String|**TODO: Add Description**|
|givenName|String|**TODO: Add Description**|
|hireDate|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|identities|[objectIdentity](../resources/objectidentity.md) collection|**TODO: Add Description**|
|imAddresses|String collection|**TODO: Add Description**|
|infoCatalogs|String collection|**TODO: Add Description**|
|interests|String collection|**TODO: Add Description**|
|isManagementRestricted|Boolean|**TODO: Add Description**|
|isResourceAccount|Boolean|**TODO: Add Description**|
|jobTitle|String|**TODO: Add Description**|
|lastPasswordChangeDateTime|DateTimeOffset|**TODO: Add Description**|
|legalAgeGroupClassification|String|**TODO: Add Description**|
|licenseAssignmentStates|[licenseAssignmentState](../resources/licenseassignmentstate.md) collection|**TODO: Add Description**|
|mail|String|**TODO: Add Description**|
|mailboxSettings|[mailboxSettings](../resources/mailboxsettings.md)|**TODO: Add Description**|
|mailNickname|String|**TODO: Add Description**|
|mobilePhone|String|**TODO: Add Description**|
|mySite|String|**TODO: Add Description**|
|officeLocation|String|**TODO: Add Description**|
|onPremisesDistinguishedName|String|**TODO: Add Description**|
|onPremisesDomainName|String|**TODO: Add Description**|
|onPremisesExtensionAttributes|[onPremisesExtensionAttributes](../resources/onpremisesextensionattributes.md)|**TODO: Add Description**|
|onPremisesImmutableId|String|**TODO: Add Description**|
|onPremisesLastSyncDateTime|DateTimeOffset|**TODO: Add Description**|
|onPremisesProvisioningErrors|[onPremisesProvisioningError](../resources/onpremisesprovisioningerror.md) collection|**TODO: Add Description**|
|onPremisesSamAccountName|String|**TODO: Add Description**|
|onPremisesSecurityIdentifier|String|**TODO: Add Description**|
|onPremisesSyncEnabled|Boolean|**TODO: Add Description**|
|onPremisesUserPrincipalName|String|**TODO: Add Description**|
|otherMails|String collection|**TODO: Add Description**|
|passwordPolicies|String|**TODO: Add Description**|
|passwordProfile|[passwordProfile](../resources/passwordprofile.md)|**TODO: Add Description**|
|pastProjects|String collection|**TODO: Add Description**|
|postalCode|String|**TODO: Add Description**|
|preferredDataLocation|String|**TODO: Add Description**|
|preferredLanguage|String|**TODO: Add Description**|
|preferredName|String|**TODO: Add Description**|
|provisionedPlans|[provisionedPlan](../resources/provisionedplan.md) collection|**TODO: Add Description**|
|proxyAddresses|String collection|**TODO: Add Description**|
|refreshTokensValidFromDateTime|DateTimeOffset|**TODO: Add Description**|
|responsibilities|String collection|**TODO: Add Description**|
|schools|String collection|**TODO: Add Description**|
|showInAddressList|Boolean|**TODO: Add Description**|
|signInActivity|[signInActivity](../resources/signinactivity.md)|**TODO: Add Description**|
|signInSessionsValidFromDateTime|DateTimeOffset|**TODO: Add Description**|
|skills|String collection|**TODO: Add Description**|
|state|String|**TODO: Add Description**|
|streetAddress|String|**TODO: Add Description**|
|surname|String|**TODO: Add Description**|
|temporaryAccessPass|[temporaryAccessPass](../resources/temporaryaccesspass.md)|**TODO: Add Description**|
|usageLocation|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|userType|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|activities|[userActivity](../resources/useractivity.md) collection|**TODO: Add Description**|
|agreementAcceptances|[agreementAcceptance](../resources/agreementacceptance.md) collection|**TODO: Add Description**|
|analytics|[userAnalytics](../resources/useranalytics.md)|**TODO: Add Description**|
|appConsentRequestsForApproval|[appConsentRequest](../resources/appconsentrequest.md) collection|**TODO: Add Description**|
|appRoleAssignments|[appRoleAssignment](../resources/approleassignment.md) collection|**TODO: Add Description**|
|approvals|[approval](../resources/approval.md) collection|**TODO: Add Description**|
|authentication|[authentication](../resources/authentication.md)|**TODO: Add Description**|
|calendar|[calendar](../resources/calendar.md)|**TODO: Add Description**|
|calendarGroups|[calendarGroup](../resources/calendargroup.md) collection|**TODO: Add Description**|
|calendars|[calendar](../resources/calendar.md) collection|**TODO: Add Description**|
|calendarView|[event](../resources/event.md) collection|**TODO: Add Description**|
|chats|[chat](../resources/chat.md) collection|**TODO: Add Description**|
|contactFolders|[contactFolder](../resources/contactfolder.md) collection|**TODO: Add Description**|
|contacts|[contact](../resources/contact.md) collection|**TODO: Add Description**|
|createdObjects|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|decoratedProfile|[DecoratedProfile](../resources/decoratedprofile.md)|**TODO: Add Description**|
|deviceEnrollmentConfigurations|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) collection|Get enrollment configurations targeted to the user|
|deviceManagementTroubleshootingEvents|[deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) collection|The list of troubleshooting events for this user.|
|devices|[device](../resources/device.md) collection|**TODO: Add Description**|
|directReports|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|drive|[drive](../resources/drive.md)|**TODO: Add Description**|
|drives|[drive](../resources/drive.md) collection|**TODO: Add Description**|
|events|[event](../resources/event.md) collection|**TODO: Add Description**|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description**|
|followedSites|[site](../resources/site.md) collection|**TODO: Add Description**|
|inferenceClassification|[inferenceClassification](../resources/inferenceclassification.md)|**TODO: Add Description**|
|informationProtection|[informationProtection](../resources/informationprotection.md)|**TODO: Add Description**|
|insights|[itemInsights](../resources/iteminsights.md)|**TODO: Add Description**|
|joinedGroups|[group](../resources/group.md) collection|**TODO: Add Description**|
|joinedTeams|[team](../resources/team.md) collection|**TODO: Add Description**|
|licenseDetails|[licenseDetails](../resources/licensedetails.md) collection|**TODO: Add Description**|
|mailFolders|[mailFolder](../resources/mailfolder.md) collection|**TODO: Add Description**|
|managedAppRegistrations|[managedAppRegistration](../resources/managedappregistration.md) collection|Zero or more managed app registrations that belong to the user.|
|managedDevices|[managedDevice](../resources/manageddevice.md) collection|The managed devices associated with the user.|
|manager|[directoryObject](../resources/directoryobject.md)|**TODO: Add Description**|
|memberOf|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|messages|[message](../resources/message.md) collection|**TODO: Add Description**|
|mobileAppIntentAndStates|[mobileAppIntentAndState](../resources/mobileappintentandstate.md) collection|The list of troubleshooting events for this user.|
|mobileAppTroubleshootingEvents|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) collection|The list of mobile app troubleshooting events for this user.|
|notes|[note](../resources/note.md) collection|**TODO: Add Description**|
|notifications|[notification](../resources/notification.md) collection|**TODO: Add Description**|
|oauth2PermissionGrants|[oAuth2PermissionGrant](../resources/oauth2permissiongrant.md) collection|**TODO: Add Description**|
|onenote|[onenote](../resources/onenote.md)|**TODO: Add Description**|
|onlineMeetings|[onlineMeeting](../resources/onlinemeeting.md) collection|**TODO: Add Description**|
|outlook|[outlookUser](../resources/outlookuser.md)|**TODO: Add Description**|
|ownedDevices|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|ownedObjects|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|pendingAccessReviewInstances|[accessReviewInstance](../resources/accessreviewinstance.md) collection|**TODO: Add Description**|
|people|[person](../resources/person.md) collection|**TODO: Add Description**|
|photo|[profilePhoto](../resources/profilephoto.md)|**TODO: Add Description**|
|photos|[profilePhoto](../resources/profilephoto.md) collection|**TODO: Add Description**|
|planner|[plannerUser](../resources/planneruser.md)|**TODO: Add Description**|
|presence|[presence](../resources/presence.md)|**TODO: Add Description**|
|profile|[profile](../resources/profile.md)|**TODO: Add Description**|
|registeredDevices|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|roleManagement|[principalBoundRoleManagement](../resources/principalboundrolemanagement.md)|**TODO: Add Description**|
|scopedRoleMemberOf|[scopedRoleMembership](../resources/scopedrolemembership.md) collection|**TODO: Add Description**|
|settings|[userSettings](../resources/usersettings.md)|**TODO: Add Description**|
|teamwork|[userTeamwork](../resources/userteamwork.md)|**TODO: Add Description**|
|todo|[todo](../resources/todo.md)|**TODO: Add Description**|
|transitiveMemberOf|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|transitiveReports|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|transitiveRoleAssignments|[unifiedRoleAssignment](../resources/unifiedroleassignment.md)|**TODO: Add Description**|
|usageRights|[usageRight](../resources/usageright.md) collection|**TODO: Add Description**|
|windowsInformationProtectionDeviceRegistrations|[windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md) collection|Zero or more WIP device registrations that belong to the user.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.user",
  "baseType": "microsoft.graph.directoryObject",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.user",
  "id": "String (identifier)",
  "deletedDateTime": "String (timestamp)",
  "aboutMe": "String",
  "accountEnabled": "Boolean",
  "ageGroup": "String",
  "assignedLicenses": [
    {
      "@odata.type": "microsoft.graph.assignedLicense"
    }
  ],
  "assignedPlans": [
    {
      "@odata.type": "microsoft.graph.assignedPlan"
    }
  ],
  "birthday": "String (timestamp)",
  "businessPhones": [
    "String"
  ],
  "city": "String",
  "companyName": "String",
  "consentProvidedForMinor": "String",
  "country": "String",
  "createdDateTime": "String (timestamp)",
  "creationType": "String",
  "customSecurityAttributes": {
    "@odata.type": "microsoft.graph.customSecurityAttributeValue"
  },
  "department": "String",
  "deviceEnrollmentLimit": "Integer",
  "deviceKeys": [
    {
      "@odata.type": "microsoft.graph.deviceKey"
    }
  ],
  "displayName": "String",
  "employeeHireDate": "String (timestamp)",
  "employeeId": "String",
  "employeeOrgData": {
    "@odata.type": "microsoft.graph.employeeOrgData"
  },
  "employeeType": "String",
  "externalUserState": "String",
  "externalUserStateChangeDateTime": "String",
  "faxNumber": "String",
  "givenName": "String",
  "hireDate": "String (timestamp)",
  "identities": [
    {
      "@odata.type": "microsoft.graph.objectIdentity"
    }
  ],
  "imAddresses": [
    "String"
  ],
  "infoCatalogs": [
    "String"
  ],
  "interests": [
    "String"
  ],
  "isManagementRestricted": "Boolean",
  "isResourceAccount": "Boolean",
  "jobTitle": "String",
  "lastPasswordChangeDateTime": "String (timestamp)",
  "legalAgeGroupClassification": "String",
  "licenseAssignmentStates": [
    {
      "@odata.type": "microsoft.graph.licenseAssignmentState"
    }
  ],
  "mail": "String",
  "mailboxSettings": {
    "@odata.type": "microsoft.graph.mailboxSettings"
  },
  "mailNickname": "String",
  "mobilePhone": "String",
  "mySite": "String",
  "officeLocation": "String",
  "onPremisesDistinguishedName": "String",
  "onPremisesDomainName": "String",
  "onPremisesExtensionAttributes": {
    "@odata.type": "microsoft.graph.onPremisesExtensionAttributes"
  },
  "onPremisesImmutableId": "String",
  "onPremisesLastSyncDateTime": "String (timestamp)",
  "onPremisesProvisioningErrors": [
    {
      "@odata.type": "microsoft.graph.onPremisesProvisioningError"
    }
  ],
  "onPremisesSamAccountName": "String",
  "onPremisesSecurityIdentifier": "String",
  "onPremisesSyncEnabled": "Boolean",
  "onPremisesUserPrincipalName": "String",
  "otherMails": [
    "String"
  ],
  "passwordPolicies": "String",
  "passwordProfile": {
    "@odata.type": "microsoft.graph.passwordProfile"
  },
  "pastProjects": [
    "String"
  ],
  "postalCode": "String",
  "preferredDataLocation": "String",
  "preferredLanguage": "String",
  "preferredName": "String",
  "provisionedPlans": [
    {
      "@odata.type": "microsoft.graph.provisionedPlan"
    }
  ],
  "proxyAddresses": [
    "String"
  ],
  "refreshTokensValidFromDateTime": "String (timestamp)",
  "responsibilities": [
    "String"
  ],
  "schools": [
    "String"
  ],
  "showInAddressList": "Boolean",
  "signInActivity": {
    "@odata.type": "microsoft.graph.signInActivity"
  },
  "signInSessionsValidFromDateTime": "String (timestamp)",
  "skills": [
    "String"
  ],
  "state": "String",
  "streetAddress": "String",
  "surname": "String",
  "temporaryAccessPass": {
    "@odata.type": "microsoft.graph.temporaryAccessPass"
  },
  "usageLocation": "String",
  "userPrincipalName": "String",
  "userType": "String"
}
```

