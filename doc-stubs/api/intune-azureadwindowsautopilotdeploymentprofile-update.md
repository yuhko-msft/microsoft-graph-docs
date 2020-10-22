---
title: "Update azureADWindowsAutopilotDeploymentProfile"
description: "Update the properties of an azureADWindowsAutopilotDeploymentProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update azureADWindowsAutopilotDeploymentProfile
Namespace: microsoft.graph

Update the properties of an [azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md) object.

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
PATCH ** Entity URI for microsoft.graph.azureADWindowsAutopilotDeploymentProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md) object.

The following table shows the properties that are required when you create the [azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|description|String|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|language|String|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|outOfBoxExperienceSettings|[outOfBoxExperienceSettings](../resources/intune-outofboxexperiencesettings.md)|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|enrollmentStatusScreenSettings|[windowsEnrollmentStatusScreenSettings](../resources/intune-windowsenrollmentstatusscreensettings.md)|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|extractHardwareHash|Boolean|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|deviceNameTemplate|String|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|deviceType|windowsAutopilotDeviceType|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md). Possible values are: `windowsPc`, `surfaceHub2`, `holoLens`.|
|enableWhiteGlove|Boolean|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_azureadwindowsautopilotdeploymentprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.azureADWindowsAutopilotDeploymentProfile not found
Content-Type: application/json
Content-length: 567

{
  "@odata.type": "#microsoft.graph.azureADWindowsAutopilotDeploymentProfile",
  "displayName": "String",
  "description": "String",
  "language": "String",
  "outOfBoxExperienceSettings": {
    "@odata.type": "microsoft.graph.outOfBoxExperienceSettings"
  },
  "enrollmentStatusScreenSettings": {
    "@odata.type": "microsoft.graph.windowsEnrollmentStatusScreenSettings"
  },
  "extractHardwareHash": "Boolean",
  "deviceNameTemplate": "String",
  "deviceType": "String",
  "enableWhiteGlove": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
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
  "@odata.type": "#microsoft.graph.azureADWindowsAutopilotDeploymentProfile",
  "id": "58e4c237-c237-58e4-37c2-e45837c2e458",
  "displayName": "String",
  "description": "String",
  "language": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "outOfBoxExperienceSettings": {
    "@odata.type": "microsoft.graph.outOfBoxExperienceSettings"
  },
  "enrollmentStatusScreenSettings": {
    "@odata.type": "microsoft.graph.windowsEnrollmentStatusScreenSettings"
  },
  "extractHardwareHash": "Boolean",
  "deviceNameTemplate": "String",
  "deviceType": "String",
  "enableWhiteGlove": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```

