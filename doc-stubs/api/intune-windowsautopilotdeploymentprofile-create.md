---
title: "Create windowsAutopilotDeploymentProfile"
description: "Create a new windowsAutopilotDeploymentProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsAutopilotDeploymentProfile
Namespace: microsoft.graph

Create a new [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md) object.

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
POST /deviceManagement/windowsAutopilotDeploymentProfiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md) object.

The following table shows the properties that are required when you create the [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|language|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|outOfBoxExperienceSettings|[outOfBoxExperienceSettings](../resources/intune-outofboxexperiencesettings.md)|**TODO: Add Description**|
|enrollmentStatusScreenSettings|[windowsEnrollmentStatusScreenSettings](../resources/intune-windowsenrollmentstatusscreensettings.md)|**TODO: Add Description**|
|enrollmentSettings|[windowsAutoPilotEnrollmentSettings](../resources/intune-windowsautopilotenrollmentsettings.md)|**TODO: Add Description**|
|extractHardwareHash|Boolean|**TODO: Add Description**|
|deviceNameTemplate|String|**TODO: Add Description**|
|deviceType|windowsAutopilotDeviceType|**TODO: Add Description**. Possible values are: `windowsPc`, `surfaceHub2`, `holoLens`.|
|enableWhiteGlove|Boolean|**TODO: Add Description**|
|enableClientAcceleration|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsautopilotdeploymentprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/windowsAutopilotDeploymentProfiles
Content-Type: application/json
Content-length: 708

{
  "@odata.type": "#microsoft.graph.windowsAutopilotDeploymentProfile",
  "displayName": "String",
  "description": "String",
  "language": "String",
  "outOfBoxExperienceSettings": {
    "@odata.type": "microsoft.graph.outOfBoxExperienceSettings"
  },
  "enrollmentStatusScreenSettings": {
    "@odata.type": "microsoft.graph.windowsEnrollmentStatusScreenSettings"
  },
  "enrollmentSettings": {
    "@odata.type": "microsoft.graph.windowsAutoPilotEnrollmentSettings"
  },
  "extractHardwareHash": "Boolean",
  "deviceNameTemplate": "String",
  "deviceType": "String",
  "enableWhiteGlove": "Boolean",
  "enableClientAcceleration": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsAutopilotDeploymentProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsAutopilotDeploymentProfile",
  "id": "fd2fd8b5-d8b5-fd2f-b5d8-2ffdb5d82ffd",
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
  "enrollmentSettings": {
    "@odata.type": "microsoft.graph.windowsAutoPilotEnrollmentSettings"
  },
  "extractHardwareHash": "Boolean",
  "deviceNameTemplate": "String",
  "deviceType": "String",
  "enableWhiteGlove": "Boolean",
  "enableClientAcceleration": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```

