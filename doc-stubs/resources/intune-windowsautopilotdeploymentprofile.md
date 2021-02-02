---
title: "windowsAutopilotDeploymentProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsAutopilotDeploymentProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsAutopilotDeploymentProfiles](../api/intune-windowsautopilotdeploymentprofile-list.md)|[windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md) collection|Get a list of the [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md) objects and their properties.|
|[Create windowsAutopilotDeploymentProfile](../api/intune-windowsautopilotdeploymentprofile-create.md)|[windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|Create a new [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md) object.|
|[Get windowsAutopilotDeploymentProfile](../api/intune-windowsautopilotdeploymentprofile-get.md)|[windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|Read the properties and relationships of a [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md) object.|
|[Update windowsAutopilotDeploymentProfile](../api/intune-windowsautopilotdeploymentprofile-update.md)|[windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|Update the properties of a [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md) object.|
|[Delete windowsAutopilotDeploymentProfile](../api/intune-windowsautopilotdeploymentprofile-delete.md)|None|Deletes a [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|deviceNameTemplate|String|**TODO: Add Description**|
|deviceType|windowsAutopilotDeviceType|**TODO: Add Description**. Possible values are: `windowsPc`, `surfaceHub2`, `holoLens`.|
|displayName|String|**TODO: Add Description**|
|enableClientAcceleration|Boolean|**TODO: Add Description**|
|enableWhiteGlove|Boolean|**TODO: Add Description**|
|enrollmentSettings|[windowsAutoPilotEnrollmentSettings](../resources/intune-windowsautopilotenrollmentsettings.md)|**TODO: Add Description**|
|enrollmentStatusScreenSettings|[windowsEnrollmentStatusScreenSettings](../resources/intune-windowsenrollmentstatusscreensettings.md)|**TODO: Add Description**|
|extractHardwareHash|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|language|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|outOfBoxExperienceSettings|[outOfBoxExperienceSettings](../resources/intune-outofboxexperiencesettings.md)|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignedDevices|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) collection|**TODO: Add Description**|
|assignments|[windowsAutopilotDeploymentProfileAssignment](../resources/intune-windowsautopilotdeploymentprofileassignment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsAutopilotDeploymentProfile",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsAutopilotDeploymentProfile",
  "id": "String (identifier)",
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

