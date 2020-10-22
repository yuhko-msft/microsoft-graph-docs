---
title: "Update iosDeviceFeaturesConfiguration"
description: "Update the properties of an iosDeviceFeaturesConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosDeviceFeaturesConfiguration
Namespace: microsoft.graph

Update the properties of an [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH ** Entity URI for microsoft.graph.iosDeviceFeaturesConfiguration not found
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
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|airPrintDestinations|[airPrintDestination](../resources/intune-airprintdestination.md) collection|**TODO: Add Description** Inherited from [appleDeviceFeaturesConfigurationBase](../resources/appledevicefeaturesconfigurationbase.md)|
|assetTagTemplate|String|**TODO: Add Description**|
|contentFilterSettings|[iosWebContentFilterBase](../resources/intune-ioswebcontentfilterbase.md)|**TODO: Add Description**|
|lockScreenFootnote|String|**TODO: Add Description**|
|homeScreenDockIcons|[iosHomeScreenItem](../resources/intune-ioshomescreenitem.md) collection|**TODO: Add Description**|
|homeScreenPages|[iosHomeScreenPage](../resources/intune-ioshomescreenpage.md) collection|**TODO: Add Description**|
|notificationSettings|[iosNotificationSettings](../resources/intune-iosnotificationsettings.md) collection|**TODO: Add Description**|
|singleSignOnSettings|[iosSingleSignOnSettings](../resources/intune-iossinglesignonsettings.md)|**TODO: Add Description**|
|wallpaperDisplayLocation|iosWallpaperDisplayLocation|**TODO: Add Description**. Possible values are: `notConfigured`, `lockScreen`, `homeScreen`, `lockAndHomeScreens`.|
|wallpaperImage|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description**|
|singleSignOnExtension|[singleSignOnExtension](../resources/intune-singlesignonextension.md)|**TODO: Add Description**|
|iosSingleSignOnExtension|[iosSingleSignOnExtension](../resources/intune-iossinglesignonextension.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosDeviceFeaturesConfiguration](../resources/iosdevicefeaturesconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_iosdevicefeaturesconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosDeviceFeaturesConfiguration not found
Content-Type: application/json
Content-length: 1661

{
  "@odata.type": "#microsoft.graph.iosDeviceFeaturesConfiguration",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "description": "String",
  "displayName": "String",
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
  "lockScreenFootnote": "String",
  "homeScreenDockIcons": [
    {
      "@odata.type": "microsoft.graph.iosHomeScreenFolder"
    }
  ],
  "homeScreenPages": [
    {
      "@odata.type": "microsoft.graph.iosHomeScreenPage"
    }
  ],
  "notificationSettings": [
    {
      "@odata.type": "microsoft.graph.iosNotificationSettings"
    }
  ],
  "singleSignOnSettings": {
    "@odata.type": "microsoft.graph.iosSingleSignOnSettings"
  },
  "wallpaperDisplayLocation": "String",
  "wallpaperImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "singleSignOnExtension": {
    "@odata.type": "microsoft.graph.singleSignOnExtension"
  },
  "iosSingleSignOnExtension": {
    "@odata.type": "microsoft.graph.iosSingleSignOnExtension"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.iosDeviceFeaturesConfiguration",
  "id": "3d703910-3910-3d70-1039-703d1039703d",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
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
  "lockScreenFootnote": "String",
  "homeScreenDockIcons": [
    {
      "@odata.type": "microsoft.graph.iosHomeScreenFolder"
    }
  ],
  "homeScreenPages": [
    {
      "@odata.type": "microsoft.graph.iosHomeScreenPage"
    }
  ],
  "notificationSettings": [
    {
      "@odata.type": "microsoft.graph.iosNotificationSettings"
    }
  ],
  "singleSignOnSettings": {
    "@odata.type": "microsoft.graph.iosSingleSignOnSettings"
  },
  "wallpaperDisplayLocation": "String",
  "wallpaperImage": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "singleSignOnExtension": {
    "@odata.type": "microsoft.graph.singleSignOnExtension"
  },
  "iosSingleSignOnExtension": {
    "@odata.type": "microsoft.graph.iosSingleSignOnExtension"
  }
}
```

