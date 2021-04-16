---
title: "iosDeviceFeaturesConfiguration resource type"
description: "iOS Device Features Configuration Profile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosDeviceFeaturesConfiguration resource type

Namespace: microsoft.graph



iOS Device Features Configuration Profile.


Inherits from [appleDeviceFeaturesConfigurationBase](../resources/appledevicefeaturesconfigurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosDeviceFeaturesConfigurations](../api/iosdevicefeaturesconfiguration-list.md)|[iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) collection|Get a list of the [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) objects and their properties.|
|[Create iosDeviceFeaturesConfiguration](../api/iosdevicefeaturesconfiguration-create.md)|[iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md)|Create a new [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) object.|
|[Get iosDeviceFeaturesConfiguration](../api/iosdevicefeaturesconfiguration-get.md)|[iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md)|Read the properties and relationships of an [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) object.|
|[Update iosDeviceFeaturesConfiguration](../api/iosdevicefeaturesconfiguration-update.md)|[iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md)|Update the properties of an [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) object.|
|[Delete iosDeviceFeaturesConfiguration](../api/iosdevicefeaturesconfiguration-delete.md)|None|Deletes an [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) object.|
|[List iosCertificateProfileBase](../api/iosdevicefeaturesconfiguration-list-identitycertificateforclientauthentication.md)|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md) collection|Get the iosCertificateProfileBase resources from the identityCertificateForClientAuthentication navigation property.|
|[Add iosCertificateProfileBase](../api/iosdevicefeaturesconfiguration-post-identitycertificateforclientauthentication.md)|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|Add identityCertificateForClientAuthentication by posting to the identityCertificateForClientAuthentication collection.|
|[List iosCertificateProfileBase](../api/iosdevicefeaturesconfiguration-list-singlesignonextensionpkinitcertificate.md)|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md) collection|Get the iosCertificateProfileBase resources from the singleSignOnExtensionPkinitCertificate navigation property.|
|[Add iosCertificateProfileBase](../api/iosdevicefeaturesconfiguration-post-singlesignonextensionpkinitcertificate.md)|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|Add singleSignOnExtensionPkinitCertificate by posting to the singleSignOnExtensionPkinitCertificate collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|airPrintDestinations|[airPrintDestination](../resources/airprintdestination.md) collection|An array of AirPrint printers that should always be shown. This collection can contain a maximum of 500 elements. Inherited from [appleDeviceFeaturesConfigurationBase](../resources/appledevicefeaturesconfigurationbase.md)|
|assetTagTemplate|String|Asset tag information for the device, displayed on the login window and lock screen.|
|contentFilterSettings|[iosWebContentFilterBase](../resources/ioswebcontentfilterbase.md)|Gets or sets iOS Web Content Filter settings, supervised mode only|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|homeScreenDockIcons|[iosHomeScreenItem](../resources/ioshomescreenitem.md) collection|A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.|
|homeScreenPages|[iosHomeScreenPage](../resources/ioshomescreenpage.md) collection|A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|iosSingleSignOnExtension|[iosSingleSignOnExtension](../resources/iossinglesignonextension.md)|Gets or sets a single sign-on extension profile.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lockScreenFootnote|String|A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.|
|notificationSettings|[iosNotificationSettings](../resources/iosnotificationsettings.md) collection|Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|singleSignOnExtension|[singleSignOnExtension](../resources/singlesignonextension.md)|Gets or sets a single sign-on extension profile. Deprecated: use IOSSingleSignOnExtension instead.|
|singleSignOnSettings|[iosSingleSignOnSettings](../resources/iossinglesignonsettings.md)|The Kerberos login settings that enable apps on receiving devices to authenticate smoothly.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|wallpaperDisplayLocation|iosWallpaperDisplayLocation|A wallpaper display location specifier. Possible values are: `notConfigured`, `lockScreen`, `homeScreen`, `lockAndHomeScreens`.|
|wallpaperImage|[mimeContent](../resources/mimecontent.md)|A wallpaper image must be in either PNG or JPEG format. It requires a supervised device with iOS 8 or later version.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificateForClientAuthentication|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|Identity Certificate for the renewal of Kerberos ticket used in single sign-on settings.|
|singleSignOnExtensionPkinitCertificate|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|PKINIT Certificate for the authentication with single sign-on extension settings.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosDeviceFeaturesConfiguration",
  "baseType": "microsoft.graph.appleDeviceFeaturesConfigurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosDeviceFeaturesConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "airPrintDestinations": [
    {
      "@odata.type": "microsoft.graph.airPrintDestination"
    }
  ],
  "assetTagTemplate": "String",
  "contentFilterSettings": {
    "@odata.type": "microsoft.graph.iosWebContentFilterBase"
  },
  "homeScreenDockIcons": [
    {
      "@odata.type": "microsoft.graph.iosHomeScreenApp"
    }
  ],
  "homeScreenPages": [
    {
      "@odata.type": "microsoft.graph.iosHomeScreenPage"
    }
  ],
  "iosSingleSignOnExtension": {
    "@odata.type": "microsoft.graph.iosSingleSignOnExtension"
  },
  "lockScreenFootnote": "String",
  "notificationSettings": [
    {
      "@odata.type": "microsoft.graph.iosNotificationSettings"
    }
  ],
  "singleSignOnExtension": {
    "@odata.type": "microsoft.graph.singleSignOnExtension"
  },
  "singleSignOnSettings": {
    "@odata.type": "microsoft.graph.iosSingleSignOnSettings"
  },
  "wallpaperDisplayLocation": "String",
  "wallpaperImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  }
}
```

