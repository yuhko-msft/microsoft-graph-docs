---
title: "Create windowsKioskConfiguration"
description: "Create a new windowsKioskConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsKioskConfiguration
Namespace: microsoft.graph



Create a new [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windowsKioskConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.

The following table shows the properties that are required when you create the [windowsKioskConfiguration](../resources/windowskioskconfiguration.md).

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
|edgeKioskEnablePublicBrowsing|Boolean|Enable public browsing kiosk mode for the Microsoft Edge browser. The Default is false.|
|kioskBrowserBlockedUrlExceptions|String collection|Specify URLs that the kiosk browser is allowed to navigate to|
|kioskBrowserBlockedURLs|String collection|Specify URLs that the kiosk browsers should not navigate to|
|kioskBrowserDefaultUrl|String|Specify the default URL the browser should navigate to on launch.|
|kioskBrowserEnableEndSessionButton|Boolean|Enable the kiosk browser's end session button. By default, the end session button is disabled.|
|kioskBrowserEnableHomeButton|Boolean|Enable the kiosk browser's home button. By default, the home button is disabled.|
|kioskBrowserEnableNavigationButtons|Boolean|Enable the kiosk browser's navigation buttons(forward/back). By default, the navigation buttons are disabled.|
|kioskBrowserRestartOnIdleTimeInMinutes|Int32|Specify the number of minutes the session is idle until the kiosk browser restarts in a fresh state.  Valid values are 1-1440. Valid values 1 to 1440|
|kioskProfiles|[windowsKioskProfile](../resources/windowskioskprofile.md) collection|This policy setting allows to define a list of Kiosk profiles for a Kiosk configuration. This collection can contain a maximum of 3 elements.|
|windowsKioskForceUpdateSchedule|[windowsKioskForceUpdateSchedule](../resources/windowskioskforceupdateschedule.md)|force update schedule for Kiosk devices.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowskioskconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsKioskConfiguration not found
Content-Type: application/json
Content-length: 1267

{
  "@odata.type": "#microsoft.graph.windowsKioskConfiguration",
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
  "edgeKioskEnablePublicBrowsing": "Boolean",
  "kioskBrowserBlockedUrlExceptions": [
    "String"
  ],
  "kioskBrowserBlockedURLs": [
    "String"
  ],
  "kioskBrowserDefaultUrl": "String",
  "kioskBrowserEnableEndSessionButton": "Boolean",
  "kioskBrowserEnableHomeButton": "Boolean",
  "kioskBrowserEnableNavigationButtons": "Boolean",
  "kioskBrowserRestartOnIdleTimeInMinutes": "Integer",
  "kioskProfiles": [
    {
      "@odata.type": "microsoft.graph.windowsKioskProfile"
    }
  ],
  "windowsKioskForceUpdateSchedule": {
    "@odata.type": "microsoft.graph.windowsKioskForceUpdateSchedule"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsKioskConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsKioskConfiguration",
  "id": "20009b9e-9b9e-2000-9e9b-00209e9b0020",
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
  "edgeKioskEnablePublicBrowsing": "Boolean",
  "kioskBrowserBlockedUrlExceptions": [
    "String"
  ],
  "kioskBrowserBlockedURLs": [
    "String"
  ],
  "kioskBrowserDefaultUrl": "String",
  "kioskBrowserEnableEndSessionButton": "Boolean",
  "kioskBrowserEnableHomeButton": "Boolean",
  "kioskBrowserEnableNavigationButtons": "Boolean",
  "kioskBrowserRestartOnIdleTimeInMinutes": "Integer",
  "kioskProfiles": [
    {
      "@odata.type": "microsoft.graph.windowsKioskProfile"
    }
  ],
  "windowsKioskForceUpdateSchedule": {
    "@odata.type": "microsoft.graph.windowsKioskForceUpdateSchedule"
  }
}
```

