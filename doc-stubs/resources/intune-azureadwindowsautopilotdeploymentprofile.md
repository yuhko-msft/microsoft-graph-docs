---
title: "azureADWindowsAutopilotDeploymentProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# azureADWindowsAutopilotDeploymentProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List azureADWindowsAutopilotDeploymentProfiles](../api/intune-azureadwindowsautopilotdeploymentprofile-list.md)|[azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md) collection|Get a list of the [azureADWindowsAutopilotDeploymentProfile](../resources/azureadwindowsautopilotdeploymentprofile.md) objects and their properties.|
|[Create azureADWindowsAutopilotDeploymentProfile](../api/intune-azureadwindowsautopilotdeploymentprofile-create.md)|[azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md)|Create a new [azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md) object.|
|[Get azureADWindowsAutopilotDeploymentProfile](../api/intune-azureadwindowsautopilotdeploymentprofile-get.md)|[azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md)|Read the properties and relationships of an [azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md) object.|
|[Update azureADWindowsAutopilotDeploymentProfile](../api/intune-azureadwindowsautopilotdeploymentprofile-update.md)|[azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md)|Update the properties of an [azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md) object.|
|[Delete azureADWindowsAutopilotDeploymentProfile](../api/intune-azureadwindowsautopilotdeploymentprofile-delete.md)|None|Deletes an [azureADWindowsAutopilotDeploymentProfile](../resources/intune-azureadwindowsautopilotdeploymentprofile.md) object.|
|[assign](../api/intune-azureadwindowsautopilotdeploymentprofile-assign.md)|None|**TODO: Add Description**|
|[List assignedDevices](../api/intune-azureadwindowsautopilotdeploymentprofile-list-assigneddevices.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) collection|Get the windowsAutopilotDeviceIdentity resources from the assignedDevices navigation property.|
|[Create assignedDevices](../api/intune-azureadwindowsautopilotdeploymentprofile-post-assigneddevices.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md)|Create a new windowsAutopilotDeviceIdentity object.|
|[Get assignedDevices](../api/intune-azureadwindowsautopilotdeploymentprofile-get-windowsautopilotdeviceidentity.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md)|Read the properties and relationships of a [windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) object.|
|[Update assignedDevices](../api/intune-azureadwindowsautopilotdeploymentprofile-update-assigneddevices.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md)|Update the properties of an assignedDevices object.|
|[Delete assignedDevices](../api/intune-azureadwindowsautopilotdeploymentprofile-delete-assigneddevices.md)|None|Delete a [windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) object.|
|[List assignments](../api/intune-azureadwindowsautopilotdeploymentprofile-list-assignments.md)|[windowsAutopilotDeploymentProfileAssignment](../resources/intune-windowsautopilotdeploymentprofileassignment.md) collection|Get the windowsAutopilotDeploymentProfileAssignment resources from the assignments navigation property.|
|[Create assignments](../api/intune-azureadwindowsautopilotdeploymentprofile-post-assignments.md)|[windowsAutopilotDeploymentProfileAssignment](../resources/intune-windowsautopilotdeploymentprofileassignment.md)|Create a new windowsAutopilotDeploymentProfileAssignment object.|
|[Get assignments](../api/intune-azureadwindowsautopilotdeploymentprofile-get-windowsautopilotdeploymentprofileassignment.md)|[windowsAutopilotDeploymentProfileAssignment](../resources/intune-windowsautopilotdeploymentprofileassignment.md)|Read the properties and relationships of a [windowsAutopilotDeploymentProfileAssignment](../resources/intune-windowsautopilotdeploymentprofileassignment.md) object.|
|[Update assignments](../api/intune-azureadwindowsautopilotdeploymentprofile-update-assignments.md)|[windowsAutopilotDeploymentProfileAssignment](../resources/intune-windowsautopilotdeploymentprofileassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/intune-azureadwindowsautopilotdeploymentprofile-delete-assignments.md)|None|Delete a [windowsAutopilotDeploymentProfileAssignment](../resources/intune-windowsautopilotdeploymentprofileassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|description|String|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|deviceNameTemplate|String|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|deviceType|windowsAutopilotDeviceType|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md). Possible values are: `windowsPc`, `surfaceHub2`, `holoLens`.|
|displayName|String|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|enableWhiteGlove|Boolean|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|enrollmentStatusScreenSettings|[windowsEnrollmentStatusScreenSettings](../resources/intune-windowsenrollmentstatusscreensettings.md)|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|extractHardwareHash|Boolean|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|language|String|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|outOfBoxExperienceSettings|[outOfBoxExperienceSettings](../resources/intune-outofboxexperiencesettings.md)|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignedDevices|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) collection|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|assignments|[windowsAutopilotDeploymentProfileAssignment](../resources/intune-windowsautopilotdeploymentprofileassignment.md) collection|**TODO: Add Description** Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.azureADWindowsAutopilotDeploymentProfile",
  "baseType": "microsoft.graph.windowsAutopilotDeploymentProfile",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.azureADWindowsAutopilotDeploymentProfile",
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
  "extractHardwareHash": "Boolean",
  "deviceNameTemplate": "String",
  "deviceType": "String",
  "enableWhiteGlove": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```

