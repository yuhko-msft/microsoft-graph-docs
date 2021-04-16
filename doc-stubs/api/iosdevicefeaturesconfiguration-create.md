---
title: "Create iosDeviceFeaturesConfiguration"
description: "Create a new iosDeviceFeaturesConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosDeviceFeaturesConfiguration
Namespace: microsoft.graph



Create a new [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.iosDeviceFeaturesConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) object.

The following table shows the properties that are required when you create the [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|airPrintDestinations|[airPrintDestination](../resources/airprintdestination.md) collection|An array of AirPrint printers that should always be shown. This collection can contain a maximum of 500 elements. Inherited from [appleDeviceFeaturesConfigurationBase](../resources/appledevicefeaturesconfigurationbase.md)|
|assetTagTemplate|String|Asset tag information for the device, displayed on the login window and lock screen.|
|contentFilterSettings|[iosWebContentFilterBase](../resources/ioswebcontentfilterbase.md)|Gets or sets iOS Web Content Filter settings, supervised mode only|
|homeScreenDockIcons|[iosHomeScreenItem](../resources/ioshomescreenitem.md) collection|A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.|
|homeScreenPages|[iosHomeScreenPage](../resources/ioshomescreenpage.md) collection|A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.|
|iosSingleSignOnExtension|[iosSingleSignOnExtension](../resources/iossinglesignonextension.md)|Gets or sets a single sign-on extension profile.|
|lockScreenFootnote|String|A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.|
|notificationSettings|[iosNotificationSettings](../resources/iosnotificationsettings.md) collection|Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.|
|singleSignOnExtension|[singleSignOnExtension](../resources/singlesignonextension.md)|Gets or sets a single sign-on extension profile. Deprecated: use IOSSingleSignOnExtension instead.|
|singleSignOnSettings|[iosSingleSignOnSettings](../resources/iossinglesignonsettings.md)|The Kerberos login settings that enable apps on receiving devices to authenticate smoothly.|
|wallpaperDisplayLocation|iosWallpaperDisplayLocation|A wallpaper display location specifier. Possible values are: `notConfigured`, `lockScreen`, `homeScreen`, `lockAndHomeScreens`.|
|wallpaperImage|[mimeContent](../resources/mimecontent.md)|A wallpaper image must be in either PNG or JPEG format. It requires a supervised device with iOS 8 or later version.|



## Response

If successful, this method returns a `201 Created` response code and an [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iosdevicefeaturesconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.iosDeviceFeaturesConfiguration not found
Content-Type: application/json
Content-length: 1658

{
  "@odata.type": "#microsoft.graph.iosDeviceFeaturesConfiguration",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosDeviceFeaturesConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.iosDeviceFeaturesConfiguration",
  "id": "d4d7cda4-cda4-d4d7-a4cd-d7d4a4cdd7d4",
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

