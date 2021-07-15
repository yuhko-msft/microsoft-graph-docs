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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

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
|[assignLicense](../api/user-assignlicense.md)|[user](../resources/user.md)|**TODO: Add Description**|
|[changePassword](../api/user-changepassword.md)|None|**TODO: Add Description**|
|[invalidateAllRefreshTokens](../api/user-invalidateallrefreshtokens.md)|Boolean|**TODO: Add Description**|
|[reprocessLicenseAssignment](../api/user-reprocesslicenseassignment.md)|[user](../resources/user.md)|**TODO: Add Description**|
|[revokeSignInSessions](../api/user-revokesigninsessions.md)|Boolean|**TODO: Add Description**|
|[findMeetingTimes](../api/user-findmeetingtimes.md)|[meetingTimeSuggestionsResult](../resources/meetingtimesuggestionsresult.md)|**TODO: Add Description**|
|[getMailTips](../api/user-getmailtips.md)|[mailTips](../resources/mailtips.md) collection|**TODO: Add Description**|
|[sendMail](../api/user-sendmail.md)|None|**TODO: Add Description**|
|[translateExchangeIds](../api/user-translateexchangeids.md)|[convertIdResult](../resources/convertidresult.md) collection|**TODO: Add Description**|
|[findRoomLists](../api/user-findroomlists.md)|[emailAddress](../resources/emailaddress.md) collection|**TODO: Add Description**|
|[findRooms](../api/user-findrooms.md)|[emailAddress](../resources/emailaddress.md) collection|**TODO: Add Description**|
|[findRooms](../api/user-findrooms.md)|[emailAddress](../resources/emailaddress.md) collection|**TODO: Add Description**|
|[reminderView](../api/user-reminderview.md)|[reminder](../resources/reminder.md) collection|**TODO: Add Description**|
|[exportDeviceAndAppManagementData](../api/user-exportdeviceandappmanagementdata.md)|[deviceAndAppManagementData](../resources/deviceandappmanagementdata.md)|**TODO: Add Description**|
|[exportDeviceAndAppManagementData](../api/user-exportdeviceandappmanagementdata.md)|[deviceAndAppManagementData](../resources/deviceandappmanagementdata.md)|**TODO: Add Description**|
|[getEffectiveDeviceEnrollmentConfigurations](../api/user-geteffectivedeviceenrollmentconfigurations.md)|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) collection|**TODO: Add Description**|
|[removeAllDevicesFromManagement](../api/user-removealldevicesfrommanagement.md)|None|Retire all devices from management for this user|
|[getLoggedOnManagedDevices](../api/user-getloggedonmanageddevices.md)|[managedDevice](../resources/manageddevice.md) collection|**TODO: Add Description**|
|[unblockManagedApps](../api/user-unblockmanagedapps.md)|None|Unblocks the managed app user from app check-in.|
|[wipeAndBlockManagedApps](../api/user-wipeandblockmanagedapps.md)|None|Blocks the managed app user from app check-in.|
|[wipeManagedAppRegistrationByDeviceTag](../api/user-wipemanagedappregistrationbydevicetag.md)|None|Issues a wipe operation on an app registration with specified device tag.|
|[wipeManagedAppRegistrationsByDeviceTag](../api/user-wipemanagedappregistrationsbydevicetag.md)|None|Issues a wipe operation on an app registration with specified device tag.|
|[getManagedAppDiagnosticStatuses](../api/user-getmanagedappdiagnosticstatuses.md)|[managedAppDiagnosticStatus](../resources/managedappdiagnosticstatus.md) collection|Gets diagnostics validation status for a given user.|
|[getManagedAppPolicies](../api/user-getmanagedapppolicies.md)|[managedAppPolicy](../resources/managedapppolicy.md) collection|Gets app restrictions for a given user.|
|[isManagedAppUserBlocked](../api/user-ismanagedappuserblocked.md)|Boolean|Gets the blocked state of a managed app user.|
|[getManagedDevicesWithAppFailures](../api/user-getmanageddeviceswithappfailures.md)|String collection|Retrieves the list of devices with failed apps|
|[getManagedDevicesWithFailedOrPendingApps](../api/user-getmanageddeviceswithfailedorpendingapps.md)|[managedDeviceSummarizedAppState](../resources/manageddevicesummarizedappstate.md) collection|Retrieves the list of devices with failed or pending apps|
|[exportPersonalData](../api/user-exportpersonaldata.md)|None|**TODO: Add Description**|
|[checkMemberGroups](../api/user-checkmembergroups.md)|String collection|**TODO: Add Description**|
|[checkMemberObjects](../api/user-checkmemberobjects.md)|String collection|**TODO: Add Description**|
|[getMemberGroups](../api/user-getmembergroups.md)|String collection|**TODO: Add Description**|
|[getMemberObjects](../api/user-getmemberobjects.md)|String collection|**TODO: Add Description**|
|[restore](../api/user-restore.md)|[directoryObject](../resources/directoryobject.md)|**TODO: Add Description**|
|[delta](../api/user-delta.md)|[user](../resources/user.md) collection|**TODO: Add Description**|
|[getManagedAppBlockedUsers](../api/user-getmanagedappblockedusers.md)|String collection|**TODO: Add Description**|
|[List activities](../api/user-list-activities.md)|[userActivity](../resources/useractivity.md) collection|Get the userActivity resources from the activities navigation property.|
|[Create userActivity](../api/user-post-activities.md)|[userActivity](../resources/useractivity.md)|Create a new userActivity object.|
|[List agreementAcceptances](../api/user-list-agreementacceptances.md)|[agreementAcceptance](../resources/agreementacceptance.md) collection|Get the agreementAcceptance resources from the agreementAcceptances navigation property.|
|[Add agreementAcceptance](../api/user-post-agreementacceptances.md)|[agreementAcceptance](../resources/agreementacceptance.md)|Add agreementAcceptances by posting to the agreementAcceptances collection.|
|[List userAnalytics](../api/user-list-analytics.md)|[userAnalytics](../resources/useranalytics.md) collection|Get the userAnalytics resources from the analytics navigation property.|
|[Create userAnalytics](../api/user-post-analytics.md)|[userAnalytics](../resources/useranalytics.md)|Create a new userAnalytics object.|
|[List appConsentRequestsForApproval](../api/user-list-appconsentrequestsforapproval.md)|[appConsentRequest](../resources/appconsentrequest.md) collection|Get the appConsentRequest resources from the appConsentRequestsForApproval navigation property.|
|[Create appConsentRequest](../api/user-post-appconsentrequestsforapproval.md)|[appConsentRequest](../resources/appconsentrequest.md)|Create a new appConsentRequest object.|
|[List appRoleAssignments](../api/user-list-approleassignments.md)|[appRoleAssignment](../resources/approleassignment.md) collection|Get the appRoleAssignment resources from the appRoleAssignments navigation property.|
|[Create appRoleAssignment](../api/user-post-approleassignments.md)|[appRoleAssignment](../resources/approleassignment.md)|Create a new appRoleAssignment object.|
|[List approvals](../api/user-list-approvals.md)|[approval](../resources/approval.md) collection|Get the approval resources from the approvals navigation property.|
|[Create approval](../api/user-post-approvals.md)|[approval](../resources/approval.md)|Create a new approval object.|
|[List authentication](../api/user-list-authentication.md)|[authentication](../resources/authentication.md) collection|Get the authentication resources from the authentication navigation property.|
|[Create authentication](../api/user-post-authentication.md)|[authentication](../resources/authentication.md)|Create a new authentication object.|
|[List calendar](../api/user-list-calendar.md)|[calendar](../resources/calendar.md) collection|Get the calendar resources from the calendar navigation property.|
|[Create calendar](../api/user-post-calendar.md)|[calendar](../resources/calendar.md)|Create a new calendar object.|
|[List calendarGroups](../api/user-list-calendargroups.md)|[calendarGroup](../resources/calendargroup.md) collection|Get the calendarGroup resources from the calendarGroups navigation property.|
|[Create calendarGroup](../api/user-post-calendargroups.md)|[calendarGroup](../resources/calendargroup.md)|Create a new calendarGroup object.|
|[List calendars](../api/user-list-calendars.md)|[calendar](../resources/calendar.md) collection|Get the calendar resources from the calendars navigation property.|
|[Create calendar](../api/user-post-calendars.md)|[calendar](../resources/calendar.md)|Create a new calendar object.|
|[List calendarView](../api/user-list-calendarview.md)|[event](../resources/event.md) collection|Get the event resources from the calendarView navigation property.|
|[Create event](../api/user-post-calendarview.md)|[event](../resources/event.md)|Create a new event object.|
|[List chats](../api/user-list-chats.md)|[chat](../resources/chat.md) collection|Get the chat resources from the chats navigation property.|
|[Create chat](../api/user-post-chats.md)|[chat](../resources/chat.md)|Create a new chat object.|
|[List contactFolders](../api/user-list-contactfolders.md)|[contactFolder](../resources/contactfolder.md) collection|Get the contactFolder resources from the contactFolders navigation property.|
|[Create contactFolder](../api/user-post-contactfolders.md)|[contactFolder](../resources/contactfolder.md)|Create a new contactFolder object.|
|[List contacts](../api/user-list-contacts.md)|[contact](../resources/contact.md) collection|Get the contact resources from the contacts navigation property.|
|[Create contact](../api/user-post-contacts.md)|[contact](../resources/contact.md)|Create a new contact object.|
|[List createdObjects](../api/user-list-createdobjects.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the createdObjects navigation property.|
|[Add createdObjects](../api/user-post-createdobjects.md)|[directoryObject](../resources/directoryobject.md)|Add createdObjects by posting to the createdObjects collection.|
|[List deviceEnrollmentConfigurations](../api/user-list-deviceenrollmentconfigurations.md)|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) collection|Get the deviceEnrollmentConfiguration resources from the deviceEnrollmentConfigurations navigation property.|
|[Create deviceEnrollmentConfiguration](../api/user-post-deviceenrollmentconfigurations.md)|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|Create a new deviceEnrollmentConfiguration object.|
|[List deviceManagementTroubleshootingEvents](../api/user-list-devicemanagementtroubleshootingevents.md)|[deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) collection|Get the deviceManagementTroubleshootingEvent resources from the deviceManagementTroubleshootingEvents navigation property.|
|[Create deviceManagementTroubleshootingEvent](../api/user-post-devicemanagementtroubleshootingevents.md)|[deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|Create a new deviceManagementTroubleshootingEvent object.|
|[List devices](../api/user-list-devices.md)|[device](../resources/device.md) collection|Get the device resources from the devices navigation property.|
|[Create device](../api/user-post-devices.md)|[device](../resources/device.md)|Create a new device object.|
|[List directReports](../api/user-list-directreports.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the directReports navigation property.|
|[Add directReports](../api/user-post-directreports.md)|[directoryObject](../resources/directoryobject.md)|Add directReports by posting to the directReports collection.|
|[List drive](../api/user-list-drive.md)|[drive](../resources/drive.md) collection|Get the drive resources from the drive navigation property.|
|[Create drive](../api/user-post-drive.md)|[drive](../resources/drive.md)|Create a new drive object.|
|[List drives](../api/user-list-drives.md)|[drive](../resources/drive.md) collection|Get the drive resources from the drives navigation property.|
|[Create drive](../api/user-post-drives.md)|[drive](../resources/drive.md)|Create a new drive object.|
|[List events](../api/user-list-events.md)|[event](../resources/event.md) collection|Get the event resources from the events navigation property.|
|[Create event](../api/user-post-events.md)|[event](../resources/event.md)|Create a new event object.|
|[List extensions](../api/user-list-extensions.md)|[extension](../resources/extension.md) collection|Get the extension resources from the extensions navigation property.|
|[Create extension](../api/user-post-extensions.md)|[extension](../resources/extension.md)|Create a new extension object.|
|[List followedSites](../api/user-list-followedsites.md)|[site](../resources/site.md) collection|Get the site resources from the followedSites navigation property.|
|[Add site](../api/user-post-followedsites.md)|[site](../resources/site.md)|Add followedSites by posting to the followedSites collection.|
|[List inferenceClassification](../api/user-list-inferenceclassification.md)|[inferenceClassification](../resources/inferenceclassification.md) collection|Get the inferenceClassification resources from the inferenceClassification navigation property.|
|[Create inferenceClassification](../api/user-post-inferenceclassification.md)|[inferenceClassification](../resources/inferenceclassification.md)|Create a new inferenceClassification object.|
|[List informationProtection](../api/user-list-informationprotection.md)|[informationProtection](../resources/informationprotection.md) collection|Get the informationProtection resources from the informationProtection navigation property.|
|[Create informationProtection](../api/user-post-informationprotection.md)|[informationProtection](../resources/informationprotection.md)|Create a new informationProtection object.|
|[List itemInsights](../api/user-list-insights.md)|[itemInsights](../resources/iteminsights.md) collection|Get the itemInsights resources from the insights navigation property.|
|[Create itemInsights](../api/user-post-insights.md)|[itemInsights](../resources/iteminsights.md)|Create a new itemInsights object.|
|[List joinedGroups](../api/user-list-joinedgroups.md)|[group](../resources/group.md) collection|Get the group resources from the joinedGroups navigation property.|
|[Create group](../api/user-post-joinedgroups.md)|[group](../resources/group.md)|Create a new group object.|
|[List joinedTeams](../api/user-list-joinedteams.md)|[team](../resources/team.md) collection|Get the team resources from the joinedTeams navigation property.|
|[Add team](../api/user-post-joinedteams.md)|[team](../resources/team.md)|Add joinedTeams by posting to the joinedTeams collection.|
|[List licenseDetails](../api/user-list-licensedetails.md)|[licenseDetails](../resources/licensedetails.md) collection|Get the licenseDetails resources from the licenseDetails navigation property.|
|[Create licenseDetails](../api/user-post-licensedetails.md)|[licenseDetails](../resources/licensedetails.md)|Create a new licenseDetails object.|
|[List mailFolders](../api/user-list-mailfolders.md)|[mailFolder](../resources/mailfolder.md) collection|Get the mailFolder resources from the mailFolders navigation property.|
|[Create mailFolder](../api/user-post-mailfolders.md)|[mailFolder](../resources/mailfolder.md)|Create a new mailFolder object.|
|[List managedAppRegistrations](../api/user-list-managedappregistrations.md)|[managedAppRegistration](../resources/managedappregistration.md) collection|Get the managedAppRegistration resources from the managedAppRegistrations navigation property.|
|[Add managedAppRegistration](../api/user-post-managedappregistrations.md)|[managedAppRegistration](../resources/managedappregistration.md)|Add managedAppRegistrations by posting to the managedAppRegistrations collection.|
|[List managedDevices](../api/user-list-manageddevices.md)|[managedDevice](../resources/manageddevice.md) collection|Get the managedDevice resources from the managedDevices navigation property.|
|[Create managedDevice](../api/user-post-manageddevices.md)|[managedDevice](../resources/manageddevice.md)|Create a new managedDevice object.|
|[List manager](../api/user-list-manager.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the manager navigation property.|
|[Add manager](../api/user-post-manager.md)|[directoryObject](../resources/directoryobject.md)|Add manager by posting to the manager collection.|
|[List memberOf](../api/user-list-memberof.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the memberOf navigation property.|
|[Add memberOf](../api/user-post-memberof.md)|[directoryObject](../resources/directoryobject.md)|Add memberOf by posting to the memberOf collection.|
|[List messages](../api/user-list-messages.md)|[message](../resources/message.md) collection|Get the message resources from the messages navigation property.|
|[Create message](../api/user-post-messages.md)|[message](../resources/message.md)|Create a new message object.|
|[List mobileAppIntentAndStates](../api/user-list-mobileappintentandstates.md)|[mobileAppIntentAndState](../resources/mobileappintentandstate.md) collection|Get the mobileAppIntentAndState resources from the mobileAppIntentAndStates navigation property.|
|[Create mobileAppIntentAndState](../api/user-post-mobileappintentandstates.md)|[mobileAppIntentAndState](../resources/mobileappintentandstate.md)|Create a new mobileAppIntentAndState object.|
|[List mobileAppTroubleshootingEvents](../api/user-list-mobileapptroubleshootingevents.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) collection|Get the mobileAppTroubleshootingEvent resources from the mobileAppTroubleshootingEvents navigation property.|
|[Create mobileAppTroubleshootingEvent](../api/user-post-mobileapptroubleshootingevents.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md)|Create a new mobileAppTroubleshootingEvent object.|
|[List notifications](../api/user-list-notifications.md)|[notification](../resources/notification.md) collection|Get the notification resources from the notifications navigation property.|
|[Create notification](../api/user-post-notifications.md)|[notification](../resources/notification.md)|Create a new notification object.|
|[List oauth2PermissionGrants](../api/user-list-oauth2permissiongrants.md)|[oAuth2PermissionGrant](../resources/oauth2permissiongrant.md) collection|Get the oAuth2PermissionGrant resources from the oauth2PermissionGrants navigation property.|
|[Add oAuth2PermissionGrant](../api/user-post-oauth2permissiongrants.md)|[oAuth2PermissionGrant](../resources/oauth2permissiongrant.md)|Add oauth2PermissionGrants by posting to the oauth2PermissionGrants collection.|
|[List onenote](../api/user-list-onenote.md)|[onenote](../resources/onenote.md) collection|Get the onenote resources from the onenote navigation property.|
|[Create onenote](../api/user-post-onenote.md)|[onenote](../resources/onenote.md)|Create a new onenote object.|
|[List onlineMeetings](../api/user-list-onlinemeetings.md)|[onlineMeeting](../resources/onlinemeeting.md) collection|Get the onlineMeeting resources from the onlineMeetings navigation property.|
|[Create onlineMeeting](../api/user-post-onlinemeetings.md)|[onlineMeeting](../resources/onlinemeeting.md)|Create a new onlineMeeting object.|
|[List outlookUser](../api/user-list-outlook.md)|[outlookUser](../resources/outlookuser.md) collection|Get the outlookUser resources from the outlook navigation property.|
|[Create outlookUser](../api/user-post-outlook.md)|[outlookUser](../resources/outlookuser.md)|Create a new outlookUser object.|
|[List ownedDevices](../api/user-list-owneddevices.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the ownedDevices navigation property.|
|[Add ownedDevices](../api/user-post-owneddevices.md)|[directoryObject](../resources/directoryobject.md)|Add ownedDevices by posting to the ownedDevices collection.|
|[List ownedObjects](../api/user-list-ownedobjects.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the ownedObjects navigation property.|
|[Add ownedObjects](../api/user-post-ownedobjects.md)|[directoryObject](../resources/directoryobject.md)|Add ownedObjects by posting to the ownedObjects collection.|
|[List pendingAccessReviewInstances](../api/user-list-pendingaccessreviewinstances.md)|[accessReviewInstance](../resources/accessreviewinstance.md) collection|Get the accessReviewInstance resources from the pendingAccessReviewInstances navigation property.|
|[Create accessReviewInstance](../api/user-post-pendingaccessreviewinstances.md)|[accessReviewInstance](../resources/accessreviewinstance.md)|Create a new accessReviewInstance object.|
|[List people](../api/user-list-people.md)|[person](../resources/person.md) collection|Get the person resources from the people navigation property.|
|[Create person](../api/user-post-people.md)|[person](../resources/person.md)|Create a new person object.|
|[List profilePhoto](../api/user-list-photo.md)|[profilePhoto](../resources/profilephoto.md) collection|Get the profilePhoto resources from the photo navigation property.|
|[Create profilePhoto](../api/user-post-photo.md)|[profilePhoto](../resources/profilephoto.md)|Create a new profilePhoto object.|
|[List photos](../api/user-list-photos.md)|[profilePhoto](../resources/profilephoto.md) collection|Get the profilePhoto resources from the photos navigation property.|
|[Create profilePhoto](../api/user-post-photos.md)|[profilePhoto](../resources/profilephoto.md)|Create a new profilePhoto object.|
|[List plannerUser](../api/user-list-planner.md)|[plannerUser](../resources/planneruser.md) collection|Get the plannerUser resources from the planner navigation property.|
|[Create plannerUser](../api/user-post-planner.md)|[plannerUser](../resources/planneruser.md)|Create a new plannerUser object.|
|[List presence](../api/user-list-presence.md)|[presence](../resources/presence.md) collection|Get the presence resources from the presence navigation property.|
|[Create presence](../api/user-post-presence.md)|[presence](../resources/presence.md)|Create a new presence object.|
|[List profile](../api/user-list-profile.md)|[profile](../resources/profile.md) collection|Get the profile resources from the profile navigation property.|
|[Create profile](../api/user-post-profile.md)|[profile](../resources/profile.md)|Create a new profile object.|
|[List registeredDevices](../api/user-list-registereddevices.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the registeredDevices navigation property.|
|[Add registeredDevices](../api/user-post-registereddevices.md)|[directoryObject](../resources/directoryobject.md)|Add registeredDevices by posting to the registeredDevices collection.|
|[List scopedRoleMemberOf](../api/user-list-scopedrolememberof.md)|[scopedRoleMembership](../resources/scopedrolemembership.md) collection|Get the scopedRoleMembership resources from the scopedRoleMemberOf navigation property.|
|[Create scopedRoleMembership](../api/user-post-scopedrolememberof.md)|[scopedRoleMembership](../resources/scopedrolemembership.md)|Create a new scopedRoleMembership object.|
|[List userSettings](../api/user-list-settings.md)|[userSettings](../resources/usersettings.md) collection|Get the userSettings resources from the settings navigation property.|
|[Create userSettings](../api/user-post-settings.md)|[userSettings](../resources/usersettings.md)|Create a new userSettings object.|
|[List userTeamwork](../api/user-list-teamwork.md)|[userTeamwork](../resources/userteamwork.md) collection|Get the userTeamwork resources from the teamwork navigation property.|
|[Create userTeamwork](../api/user-post-teamwork.md)|[userTeamwork](../resources/userteamwork.md)|Create a new userTeamwork object.|
|[List todo](../api/user-list-todo.md)|[todo](../resources/todo.md) collection|Get the todo resources from the todo navigation property.|
|[Create todo](../api/user-post-todo.md)|[todo](../resources/todo.md)|Create a new todo object.|
|[List transitiveMemberOf](../api/user-list-transitivememberof.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the transitiveMemberOf navigation property.|
|[Add transitiveMemberOf](../api/user-post-transitivememberof.md)|[directoryObject](../resources/directoryobject.md)|Add transitiveMemberOf by posting to the transitiveMemberOf collection.|
|[List transitiveReports](../api/user-list-transitivereports.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the transitiveReports navigation property.|
|[Add transitiveReports](../api/user-post-transitivereports.md)|[directoryObject](../resources/directoryobject.md)|Add transitiveReports by posting to the transitiveReports collection.|
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
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md).|
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|identities|[objectIdentity](../resources/objectidentity.md) collection|**TODO: Add Description**|
|imAddresses|String collection|**TODO: Add Description**|
|infoCatalogs|String collection|**TODO: Add Description**|
|interests|String collection|**TODO: Add Description**|
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
|scopedRoleMemberOf|[scopedRoleMembership](../resources/scopedrolemembership.md) collection|**TODO: Add Description**|
|settings|[userSettings](../resources/usersettings.md)|**TODO: Add Description**|
|teamwork|[userTeamwork](../resources/userteamwork.md)|**TODO: Add Description**|
|todo|[todo](../resources/todo.md)|**TODO: Add Description**|
|transitiveMemberOf|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|transitiveReports|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
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
  "signInActivity": {
    "@odata.type": "microsoft.graph.signInActivity"
  },
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
  "businessPhones": [
    "String"
  ],
  "city": "String",
  "companyName": "String",
  "consentProvidedForMinor": "String",
  "country": "String",
  "createdDateTime": "String (timestamp)",
  "creationType": "String",
  "department": "String",
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
  "mailNickname": "String",
  "mobilePhone": "String",
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
  "postalCode": "String",
  "preferredDataLocation": "String",
  "preferredLanguage": "String",
  "provisionedPlans": [
    {
      "@odata.type": "microsoft.graph.provisionedPlan"
    }
  ],
  "proxyAddresses": [
    "String"
  ],
  "refreshTokensValidFromDateTime": "String (timestamp)",
  "showInAddressList": "Boolean",
  "signInSessionsValidFromDateTime": "String (timestamp)",
  "state": "String",
  "streetAddress": "String",
  "surname": "String",
  "usageLocation": "String",
  "userPrincipalName": "String",
  "userType": "String",
  "mailboxSettings": {
    "@odata.type": "microsoft.graph.mailboxSettings"
  },
  "deviceEnrollmentLimit": "Integer",
  "aboutMe": "String",
  "birthday": "String (timestamp)",
  "hireDate": "String (timestamp)",
  "interests": [
    "String"
  ],
  "mySite": "String",
  "pastProjects": [
    "String"
  ],
  "preferredName": "String",
  "responsibilities": [
    "String"
  ],
  "schools": [
    "String"
  ],
  "skills": [
    "String"
  ]
}
```

