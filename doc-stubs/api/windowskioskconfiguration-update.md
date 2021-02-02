---
title: "Update windowsKioskConfiguration"
description: "Update the properties of a windowsKioskConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsKioskConfiguration
Namespace: microsoft.graph

Update the properties of a [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windowsKioskConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.

The following table shows the properties that are required when you update the [windowsKioskConfiguration](../resources/windowskioskconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|scenarioType|scenarioType|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Possible values are: `general`, `resourceAccess`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|kioskProfiles|[windowsKioskProfile](../resources/intune-windowskioskprofile.md) collection|**TODO: Add Description**|
|kioskBrowserDefaultUrl|String|**TODO: Add Description**|
|kioskBrowserEnableHomeButton|Boolean|**TODO: Add Description**|
|kioskBrowserEnableNavigationButtons|Boolean|**TODO: Add Description**|
|kioskBrowserEnableEndSessionButton|Boolean|**TODO: Add Description**|
|kioskBrowserRestartOnIdleTimeInMinutes|Int32|**TODO: Add Description**|
|kioskBrowserBlockedURLs|String collection|**TODO: Add Description**|
|kioskBrowserBlockedUrlExceptions|String collection|**TODO: Add Description**|
|edgeKioskEnablePublicBrowsing|Boolean|**TODO: Add Description**|
|windowsKioskForceUpdateSchedule|[windowsKioskForceUpdateSchedule](../resources/intune-windowskioskforceupdateschedule.md)|**TODO: Add Description**|
|windowsKioskShellLauncherShell|String|**TODO: Add Description**|
|windowsKioskShellLauncherIdleTimeoutMinutes|Int32|**TODO: Add Description**|
|windowsKioskShellLauncherEdgeNoFirstRun|Boolean|**TODO: Add Description**|
|windowsKioskShellLauncherEdgeKioskType|windowsEdgeKioskType|**TODO: Add Description**. Possible values are: `publicBrowsing`, `fullScreen`.|
|windowsKioskShellLauncherEdgeKioskUrl|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowskioskconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windowsKioskConfiguration not found
Content-Type: application/json
Content-length: 1570

{
  "@odata.type": "#microsoft.graph.windowsKioskConfiguration",
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
  "scenarioType": "String",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "kioskProfiles": [
    {
      "@odata.type": "microsoft.graph.windowsKioskProfile"
    }
  ],
  "kioskBrowserDefaultUrl": "String",
  "kioskBrowserEnableHomeButton": "Boolean",
  "kioskBrowserEnableNavigationButtons": "Boolean",
  "kioskBrowserEnableEndSessionButton": "Boolean",
  "kioskBrowserRestartOnIdleTimeInMinutes": "Integer",
  "kioskBrowserBlockedURLs": [
    "String"
  ],
  "kioskBrowserBlockedUrlExceptions": [
    "String"
  ],
  "edgeKioskEnablePublicBrowsing": "Boolean",
  "windowsKioskForceUpdateSchedule": {
    "@odata.type": "microsoft.graph.windowsKioskForceUpdateSchedule"
  },
  "windowsKioskShellLauncherShell": "String",
  "windowsKioskShellLauncherIdleTimeoutMinutes": "Integer",
  "windowsKioskShellLauncherEdgeNoFirstRun": "Boolean",
  "windowsKioskShellLauncherEdgeKioskType": "String",
  "windowsKioskShellLauncherEdgeKioskUrl": "String"
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
  "@odata.type": "#microsoft.graph.windowsKioskConfiguration",
  "id": "6ad405aa-05aa-6ad4-aa05-d46aaa05d46a",
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
  "scenarioType": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "kioskProfiles": [
    {
      "@odata.type": "microsoft.graph.windowsKioskProfile"
    }
  ],
  "kioskBrowserDefaultUrl": "String",
  "kioskBrowserEnableHomeButton": "Boolean",
  "kioskBrowserEnableNavigationButtons": "Boolean",
  "kioskBrowserEnableEndSessionButton": "Boolean",
  "kioskBrowserRestartOnIdleTimeInMinutes": "Integer",
  "kioskBrowserBlockedURLs": [
    "String"
  ],
  "kioskBrowserBlockedUrlExceptions": [
    "String"
  ],
  "edgeKioskEnablePublicBrowsing": "Boolean",
  "windowsKioskForceUpdateSchedule": {
    "@odata.type": "microsoft.graph.windowsKioskForceUpdateSchedule"
  },
  "windowsKioskShellLauncherShell": "String",
  "windowsKioskShellLauncherIdleTimeoutMinutes": "Integer",
  "windowsKioskShellLauncherEdgeNoFirstRun": "Boolean",
  "windowsKioskShellLauncherEdgeKioskType": "String",
  "windowsKioskShellLauncherEdgeKioskUrl": "String"
}
```

