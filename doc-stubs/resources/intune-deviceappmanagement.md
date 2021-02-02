---
title: "deviceAppManagement resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceAppManagement resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get deviceAppManagement](../api/intune-deviceappmanagement-get.md)|[deviceAppManagement](../resources/intune-deviceappmanagement.md)|Read the properties and relationships of a [deviceAppManagement](../resources/intune-deviceappmanagement.md) object.|
|[Update deviceAppManagement](../api/intune-deviceappmanagement-update.md)|[deviceAppManagement](../resources/intune-deviceappmanagement.md)|Update the properties of a [deviceAppManagement](../resources/intune-deviceappmanagement.md) object.|
|[List macManagedAppProtections](../api/intune-deviceappmanagement-list-macmanagedappprotections.md)|[macManagedAppProtection](../resources/macmanagedappprotection.md) collection|Get the macManagedAppProtection resources from the macManagedAppProtections navigation property.|
|[Create macManagedAppProtection](../api/intune-deviceappmanagement-post-macmanagedappprotections.md)|[macManagedAppProtection](../resources/macmanagedappprotection.md)|Create a new macManagedAppProtection object.|
|[List microsoftStoreForBusinessReleaseManagedAppTemplates](../api/intune-deviceappmanagement-list-microsoftstoreforbusinessreleasemanagedapptemplates.md)|[microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md) collection|Get the microsoftStoreForBusinessReleaseManagedAppTemplate resources from the microsoftStoreForBusinessReleaseManagedAppTemplates navigation property.|
|[Create microsoftStoreForBusinessReleaseManagedAppTemplate](../api/intune-deviceappmanagement-post-microsoftstoreforbusinessreleasemanagedapptemplates.md)|[microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md)|Create a new microsoftStoreForBusinessReleaseManagedAppTemplate object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isEnabledForMicrosoftStoreForBusiness|Boolean|**TODO: Add Description**|
|microsoftStoreForBusinessLanguage|String|**TODO: Add Description**|
|microsoftStoreForBusinessLastCompletedApplicationSyncTime|DateTimeOffset|**TODO: Add Description**|
|microsoftStoreForBusinessLastSuccessfulSyncDateTime|DateTimeOffset|**TODO: Add Description**|
|microsoftStoreForBusinessPortalSelection|microsoftStoreForBusinessPortalSelectionOptions|**TODO: Add Description**. Possible values are: `none`, `companyPortal`, `privateStore`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|androidManagedAppProtections|[androidManagedAppProtection](../resources/androidmanagedappprotection.md) collection|**TODO: Add Description**|
|defaultManagedAppProtections|[defaultManagedAppProtection](../resources/defaultmanagedappprotection.md) collection|**TODO: Add Description**|
|deviceAppManagementTasks|[deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md) collection|**TODO: Add Description**|
|enterpriseCodeSigningCertificates|[enterpriseCodeSigningCertificate](../resources/intune-enterprisecodesigningcertificate.md) collection|**TODO: Add Description**|
|iosLobAppProvisioningConfigurations|[iosLobAppProvisioningConfiguration](../resources/intune-ioslobappprovisioningconfiguration.md) collection|**TODO: Add Description**|
|iosManagedAppProtections|[iosManagedAppProtection](../resources/iosmanagedappprotection.md) collection|**TODO: Add Description**|
|macManagedAppProtections|[macManagedAppProtection](../resources/macmanagedappprotection.md) collection|**TODO: Add Description**|
|managedAppPolicies|[managedAppPolicy](../resources/intune-managedapppolicy.md) collection|**TODO: Add Description**|
|managedAppRegistrations|[managedAppRegistration](../resources/intune-managedappregistration.md) collection|**TODO: Add Description**|
|managedAppStatuses|[managedAppStatus](../resources/intune-managedappstatus.md) collection|**TODO: Add Description**|
|managedEBookCategories|[managedEBookCategory](../resources/intune-managedebookcategory.md) collection|**TODO: Add Description**|
|managedEBooks|[managedEBook](../resources/intune-managedebook.md) collection|**TODO: Add Description**|
|mdmWindowsInformationProtectionPolicies|[mdmWindowsInformationProtectionPolicy](../resources/mdmwindowsinformationprotectionpolicy.md) collection|**TODO: Add Description**|
|microsoftStoreForBusinessReleaseManagedAppTemplates|[microsoftStoreForBusinessReleaseManagedAppTemplate](../resources/intune-microsoftstoreforbusinessreleasemanagedapptemplate.md) collection|**TODO: Add Description**|
|mobileAppCategories|[mobileAppCategory](../resources/intune-mobileappcategory.md) collection|**TODO: Add Description**|
|mobileAppConfigurations|[managedDeviceMobileAppConfiguration](../resources/intune-manageddevicemobileappconfiguration.md) collection|**TODO: Add Description**|
|mobileApps|[mobileApp](../resources/intune-mobileapp.md) collection|**TODO: Add Description**|
|policySets|[policySet](../resources/intune-policyset.md) collection|**TODO: Add Description**|
|sideLoadingKeys|[sideLoadingKey](../resources/intune-sideloadingkey.md) collection|**TODO: Add Description**|
|symantecCodeSigningCertificate|[symantecCodeSigningCertificate](../resources/intune-symanteccodesigningcertificate.md)|**TODO: Add Description**|
|targetedManagedAppConfigurations|[targetedManagedAppConfiguration](../resources/targetedmanagedappconfiguration.md) collection|**TODO: Add Description**|
|vppTokens|[vppToken](../resources/intune-vpptoken.md) collection|**TODO: Add Description**|
|wdacSupplementalPolicies|[windowsDefenderApplicationControlSupplementalPolicy](../resources/intune-windowsdefenderapplicationcontrolsupplementalpolicy.md) collection|**TODO: Add Description**|
|windowsInformationProtectionDeviceRegistrations|[windowsInformationProtectionDeviceRegistration](../resources/intune-windowsinformationprotectiondeviceregistration.md) collection|**TODO: Add Description**|
|windowsInformationProtectionPolicies|[windowsInformationProtectionPolicy](../resources/windowsinformationprotectionpolicy.md) collection|**TODO: Add Description**|
|windowsInformationProtectionWipeActions|[windowsInformationProtectionWipeAction](../resources/intune-windowsinformationprotectionwipeaction.md) collection|**TODO: Add Description**|
|windowsManagementApp|[windowsManagementApp](../resources/intune-windowsmanagementapp.md)|**TODO: Add Description**|

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
  "microsoftStoreForBusinessLastSuccessfulSyncDateTime": "String (timestamp)",
  "isEnabledForMicrosoftStoreForBusiness": "Boolean",
  "microsoftStoreForBusinessLanguage": "String",
  "microsoftStoreForBusinessLastCompletedApplicationSyncTime": "String (timestamp)",
  "microsoftStoreForBusinessPortalSelection": "String"
}
```

