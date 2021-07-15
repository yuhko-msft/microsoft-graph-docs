---
title: "deviceAppManagement resource type"
description: "Singleton entity that acts as a container for all device app management functionality."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceAppManagement resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Singleton entity that acts as a container for all device app management functionality.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get deviceAppManagement](../api/deviceappmanagement-get.md)|[deviceAppManagement](../resources/deviceappmanagement.md)|Read the properties and relationships of a [deviceAppManagement](../resources/deviceappmanagement.md) object.|
|[Update deviceAppManagement](../api/deviceappmanagement-update.md)|[deviceAppManagement](../resources/deviceappmanagement.md)|Update the properties of a [deviceAppManagement](../resources/deviceappmanagement.md) object.|
|[syncMicrosoftStoreForBusinessApps](../api/deviceappmanagement-syncmicrosoftstoreforbusinessapps.md)|None|Syncs Intune account with Microsoft Store For Business|
|[List androidManagedAppProtections](../api/deviceappmanagement-list-androidmanagedappprotections.md)|[androidManagedAppProtection](../resources/androidmanagedappprotection.md) collection|Get the androidManagedAppProtection resources from the androidManagedAppProtections navigation property.|
|[Create androidManagedAppProtection](../api/deviceappmanagement-post-androidmanagedappprotections.md)|[androidManagedAppProtection](../resources/androidmanagedappprotection.md)|Create a new androidManagedAppProtection object.|
|[List defaultManagedAppProtections](../api/deviceappmanagement-list-defaultmanagedappprotections.md)|[defaultManagedAppProtection](../resources/defaultmanagedappprotection.md) collection|Get the defaultManagedAppProtection resources from the defaultManagedAppProtections navigation property.|
|[Create defaultManagedAppProtection](../api/deviceappmanagement-post-defaultmanagedappprotections.md)|[defaultManagedAppProtection](../resources/defaultmanagedappprotection.md)|Create a new defaultManagedAppProtection object.|
|[List deviceAppManagementTasks](../api/deviceappmanagement-list-deviceappmanagementtasks.md)|[deviceAppManagementTask](../resources/deviceappmanagementtask.md) collection|Get the deviceAppManagementTask resources from the deviceAppManagementTasks navigation property.|
|[Create deviceAppManagementTask](../api/deviceappmanagement-post-deviceappmanagementtasks.md)|[deviceAppManagementTask](../resources/deviceappmanagementtask.md)|Create a new deviceAppManagementTask object.|
|[List enterpriseCodeSigningCertificates](../api/deviceappmanagement-list-enterprisecodesigningcertificates.md)|[enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md) collection|Get the enterpriseCodeSigningCertificate resources from the enterpriseCodeSigningCertificates navigation property.|
|[Create enterpriseCodeSigningCertificate](../api/deviceappmanagement-post-enterprisecodesigningcertificates.md)|[enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md)|Create a new enterpriseCodeSigningCertificate object.|
|[List iosLobAppProvisioningConfigurations](../api/deviceappmanagement-list-ioslobappprovisioningconfigurations.md)|[iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) collection|Get the iosLobAppProvisioningConfiguration resources from the iosLobAppProvisioningConfigurations navigation property.|
|[Create iosLobAppProvisioningConfiguration](../api/deviceappmanagement-post-ioslobappprovisioningconfigurations.md)|[iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md)|Create a new iosLobAppProvisioningConfiguration object.|
|[List iosManagedAppProtections](../api/deviceappmanagement-list-iosmanagedappprotections.md)|[iosManagedAppProtection](../resources/iosmanagedappprotection.md) collection|Get the iosManagedAppProtection resources from the iosManagedAppProtections navigation property.|
|[Create iosManagedAppProtection](../api/deviceappmanagement-post-iosmanagedappprotections.md)|[iosManagedAppProtection](../resources/iosmanagedappprotection.md)|Create a new iosManagedAppProtection object.|
|[List managedAppPolicies](../api/deviceappmanagement-list-managedapppolicies.md)|[managedAppPolicy](../resources/managedapppolicy.md) collection|Get the managedAppPolicy resources from the managedAppPolicies navigation property.|
|[Create managedAppPolicy](../api/deviceappmanagement-post-managedapppolicies.md)|[managedAppPolicy](../resources/managedapppolicy.md)|Create a new managedAppPolicy object.|
|[List managedAppRegistrations](../api/deviceappmanagement-list-managedappregistrations.md)|[managedAppRegistration](../resources/managedappregistration.md) collection|Get the managedAppRegistration resources from the managedAppRegistrations navigation property.|
|[Create managedAppRegistration](../api/deviceappmanagement-post-managedappregistrations.md)|[managedAppRegistration](../resources/managedappregistration.md)|Create a new managedAppRegistration object.|
|[List managedAppStatuses](../api/deviceappmanagement-list-managedappstatuses.md)|[managedAppStatus](../resources/managedappstatus.md) collection|Get the managedAppStatus resources from the managedAppStatuses navigation property.|
|[Create managedAppStatus](../api/deviceappmanagement-post-managedappstatuses.md)|[managedAppStatus](../resources/managedappstatus.md)|Create a new managedAppStatus object.|
|[List managedEBookCategories](../api/deviceappmanagement-list-managedebookcategories.md)|[managedEBookCategory](../resources/managedebookcategory.md) collection|Get the managedEBookCategory resources from the managedEBookCategories navigation property.|
|[Create managedEBookCategory](../api/deviceappmanagement-post-managedebookcategories.md)|[managedEBookCategory](../resources/managedebookcategory.md)|Create a new managedEBookCategory object.|
|[List managedEBooks](../api/deviceappmanagement-list-managedebooks.md)|[managedEBook](../resources/managedebook.md) collection|Get the managedEBook resources from the managedEBooks navigation property.|
|[Create managedEBook](../api/deviceappmanagement-post-managedebooks.md)|[managedEBook](../resources/managedebook.md)|Create a new managedEBook object.|
|[List mdmWindowsInformationProtectionPolicies](../api/deviceappmanagement-list-mdmwindowsinformationprotectionpolicies.md)|[mdmWindowsInformationProtectionPolicy](../resources/mdmwindowsinformationprotectionpolicy.md) collection|Get the mdmWindowsInformationProtectionPolicy resources from the mdmWindowsInformationProtectionPolicies navigation property.|
|[Create mdmWindowsInformationProtectionPolicy](../api/deviceappmanagement-post-mdmwindowsinformationprotectionpolicies.md)|[mdmWindowsInformationProtectionPolicy](../resources/mdmwindowsinformationprotectionpolicy.md)|Create a new mdmWindowsInformationProtectionPolicy object.|
|[List mobileAppCategories](../api/deviceappmanagement-list-mobileappcategories.md)|[mobileAppCategory](../resources/mobileappcategory.md) collection|Get the mobileAppCategory resources from the mobileAppCategories navigation property.|
|[Create mobileAppCategory](../api/deviceappmanagement-post-mobileappcategories.md)|[mobileAppCategory](../resources/mobileappcategory.md)|Create a new mobileAppCategory object.|
|[List mobileAppConfigurations](../api/deviceappmanagement-list-mobileappconfigurations.md)|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) collection|Get the managedDeviceMobileAppConfiguration resources from the mobileAppConfigurations navigation property.|
|[Create managedDeviceMobileAppConfiguration](../api/deviceappmanagement-post-mobileappconfigurations.md)|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|Create a new managedDeviceMobileAppConfiguration object.|
|[List mobileApps](../api/deviceappmanagement-list-mobileapps.md)|[mobileApp](../resources/mobileapp.md) collection|Get the mobileApp resources from the mobileApps navigation property.|
|[Create mobileApp](../api/deviceappmanagement-post-mobileapps.md)|[mobileApp](../resources/mobileapp.md)|Create a new mobileApp object.|
|[List policySets](../api/deviceappmanagement-list-policysets.md)|[policySet](../resources/policyset.md) collection|Get the policySet resources from the policySets navigation property.|
|[Create policySet](../api/deviceappmanagement-post-policysets.md)|[policySet](../resources/policyset.md)|Create a new policySet object.|
|[List sideLoadingKeys](../api/deviceappmanagement-list-sideloadingkeys.md)|[sideLoadingKey](../resources/sideloadingkey.md) collection|Get the sideLoadingKey resources from the sideLoadingKeys navigation property.|
|[Create sideLoadingKey](../api/deviceappmanagement-post-sideloadingkeys.md)|[sideLoadingKey](../resources/sideloadingkey.md)|Create a new sideLoadingKey object.|
|[List symantecCodeSigningCertificate](../api/deviceappmanagement-list-symanteccodesigningcertificate.md)|[symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) collection|Get the symantecCodeSigningCertificate resources from the symantecCodeSigningCertificate navigation property.|
|[Create symantecCodeSigningCertificate](../api/deviceappmanagement-post-symanteccodesigningcertificate.md)|[symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md)|Create a new symantecCodeSigningCertificate object.|
|[List targetedManagedAppConfigurations](../api/deviceappmanagement-list-targetedmanagedappconfigurations.md)|[targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md) collection|Get the targetedManagedAppConfiguration resources from the targetedManagedAppConfigurations navigation property.|
|[Create targetedManagedAppConfiguration](../api/deviceappmanagement-post-targetedmanagedappconfigurations.md)|[targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md)|Create a new targetedManagedAppConfiguration object.|
|[List vppTokens](../api/deviceappmanagement-list-vpptokens.md)|[vppToken](../resources/vpptoken.md) collection|Get the vppToken resources from the vppTokens navigation property.|
|[Create vppToken](../api/deviceappmanagement-post-vpptokens.md)|[vppToken](../resources/vpptoken.md)|Create a new vppToken object.|
|[List wdacSupplementalPolicies](../api/deviceappmanagement-list-wdacsupplementalpolicies.md)|[windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) collection|Get the windowsDefenderApplicationControlSupplementalPolicy resources from the wdacSupplementalPolicies navigation property.|
|[Create windowsDefenderApplicationControlSupplementalPolicy](../api/deviceappmanagement-post-wdacsupplementalpolicies.md)|[windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md)|Create a new windowsDefenderApplicationControlSupplementalPolicy object.|
|[List windowsInformationProtectionDeviceRegistrations](../api/deviceappmanagement-list-windowsinformationprotectiondeviceregistrations.md)|[windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md) collection|Get the windowsInformationProtectionDeviceRegistration resources from the windowsInformationProtectionDeviceRegistrations navigation property.|
|[Create windowsInformationProtectionDeviceRegistration](../api/deviceappmanagement-post-windowsinformationprotectiondeviceregistrations.md)|[windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md)|Create a new windowsInformationProtectionDeviceRegistration object.|
|[List windowsInformationProtectionPolicies](../api/deviceappmanagement-list-windowsinformationprotectionpolicies.md)|[windowsInformationProtectionPolicy](../resources/windowsinformationprotectionpolicy.md) collection|Get the windowsInformationProtectionPolicy resources from the windowsInformationProtectionPolicies navigation property.|
|[Create windowsInformationProtectionPolicy](../api/deviceappmanagement-post-windowsinformationprotectionpolicies.md)|[windowsInformationProtectionPolicy](../resources/windowsinformationprotectionpolicy.md)|Create a new windowsInformationProtectionPolicy object.|
|[List windowsInformationProtectionWipeActions](../api/deviceappmanagement-list-windowsinformationprotectionwipeactions.md)|[windowsInformationProtectionWipeAction](../resources/windowsinformationprotectionwipeaction.md) collection|Get the windowsInformationProtectionWipeAction resources from the windowsInformationProtectionWipeActions navigation property.|
|[Create windowsInformationProtectionWipeAction](../api/deviceappmanagement-post-windowsinformationprotectionwipeactions.md)|[windowsInformationProtectionWipeAction](../resources/windowsinformationprotectionwipeaction.md)|Create a new windowsInformationProtectionWipeAction object.|
|[List windowsManagementApp](../api/deviceappmanagement-list-windowsmanagementapp.md)|[windowsManagementApp](../resources/windowsmanagementapp.md) collection|Get the windowsManagementApp resources from the windowsManagementApp navigation property.|
|[Add windowsManagementApp](../api/deviceappmanagement-post-windowsmanagementapp.md)|[windowsManagementApp](../resources/windowsmanagementapp.md)|Add windowsManagementApp by posting to the windowsManagementApp collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isEnabledForMicrosoftStoreForBusiness|Boolean|Whether the account is enabled for syncing applications from the Microsoft Store for Business.|
|microsoftStoreForBusinessLanguage|String|The locale information used to sync applications from the Microsoft Store for Business. Cultures that are spe.|
|microsoftStoreForBusinessLastCompletedApplicationSyncTime|DateTimeOffset|The last time an application sync from the Microsoft Store for Business was completed.|
|microsoftStoreForBusinessLastSuccessfulSyncDateTime|DateTimeOffset|The last time the apps from the Microsoft Store for Business were synced successfully for the account.|
|microsoftStoreForBusinessPortalSelection|microsoftStoreForBusinessPortalSelectionOptions|The end user portal information is used to sync applications from the Microsoft Store for Business to Intune Company Portal. There are three options to pick from \['Company portal only', 'Company portal and private store', 'Private store only'\]. Possible values are: `none`, `companyPortal`, `privateStore`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|androidManagedAppProtections|[androidManagedAppProtection](../resources/androidmanagedappprotection.md) collection|Android managed app policies.|
|defaultManagedAppProtections|[defaultManagedAppProtection](../resources/defaultmanagedappprotection.md) collection|Default managed app policies.|
|deviceAppManagementTasks|[deviceAppManagementTask](../resources/deviceappmanagementtask.md) collection|Device app management tasks.|
|enterpriseCodeSigningCertificates|[enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md) collection|The Windows Enterprise Code Signing Certificate.|
|iosLobAppProvisioningConfigurations|[iosLobAppProvisioningConfiguration](../resources/ioslobappprovisioningconfiguration.md) collection|The IOS Lob App Provisioning Configurations.|
|iosManagedAppProtections|[iosManagedAppProtection](../resources/iosmanagedappprotection.md) collection|iOS managed app policies.|
|managedAppPolicies|[managedAppPolicy](../resources/managedapppolicy.md) collection|Managed app policies.|
|managedAppRegistrations|[managedAppRegistration](../resources/managedappregistration.md) collection|The managed app registrations.|
|managedAppStatuses|[managedAppStatus](../resources/managedappstatus.md) collection|The managed app statuses.|
|managedEBookCategories|[managedEBookCategory](../resources/managedebookcategory.md) collection|The mobile eBook categories.|
|managedEBooks|[managedEBook](../resources/managedebook.md) collection|The Managed eBook.|
|mdmWindowsInformationProtectionPolicies|[mdmWindowsInformationProtectionPolicy](../resources/mdmwindowsinformationprotectionpolicy.md) collection|Windows information protection for apps running on devices which are MDM enrolled.|
|mobileAppCategories|[mobileAppCategory](../resources/mobileappcategory.md) collection|The mobile app categories.|
|mobileAppConfigurations|[managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md) collection|The Managed Device Mobile Application Configurations.|
|mobileApps|[mobileApp](../resources/mobileapp.md) collection|The mobile apps.|
|policySets|[policySet](../resources/policyset.md) collection|The PolicySet of Policies and Applications|
|sideLoadingKeys|[sideLoadingKey](../resources/sideloadingkey.md) collection|Side Loading Keys that are required for the Windows 8 and 8.1 Apps installation.|
|symantecCodeSigningCertificate|[symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md)|The WinPhone Symantec Code Signing Certificate.|
|targetedManagedAppConfigurations|[targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md) collection|Targeted managed app configurations.|
|vppTokens|[vppToken](../resources/vpptoken.md) collection|List of Vpp tokens for this organization.|
|wdacSupplementalPolicies|[windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) collection|The collection of Windows Defender Application Control Supplemental Policies.|
|windowsInformationProtectionDeviceRegistrations|[windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md) collection|Windows information protection device registrations that are not MDM enrolled.|
|windowsInformationProtectionPolicies|[windowsInformationProtectionPolicy](../resources/windowsinformationprotectionpolicy.md) collection|Windows information protection for apps running on devices which are not MDM enrolled.|
|windowsInformationProtectionWipeActions|[windowsInformationProtectionWipeAction](../resources/windowsinformationprotectionwipeaction.md) collection|Windows information protection wipe actions.|
|windowsManagementApp|[windowsManagementApp](../resources/windowsmanagementapp.md)|Windows management app.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceAppManagement",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceAppManagement",
  "id": "String (identifier)",
  "isEnabledForMicrosoftStoreForBusiness": "Boolean",
  "microsoftStoreForBusinessLanguage": "String",
  "microsoftStoreForBusinessLastCompletedApplicationSyncTime": "String (timestamp)",
  "microsoftStoreForBusinessLastSuccessfulSyncDateTime": "String (timestamp)",
  "microsoftStoreForBusinessPortalSelection": "String"
}
```

