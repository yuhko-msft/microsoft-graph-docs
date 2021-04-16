---
title: "activeDirectoryWindowsAutopilotDeploymentProfile resource type"
description: "Windows Autopilot Deployment Profile"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# activeDirectoryWindowsAutopilotDeploymentProfile resource type

Namespace: microsoft.graph



Windows Autopilot Deployment Profile


Inherits from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List activeDirectoryWindowsAutopilotDeploymentProfiles](../api/activedirectorywindowsautopilotdeploymentprofile-list.md)|[activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md) collection|Get a list of the [activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md) objects and their properties.|
|[Create activeDirectoryWindowsAutopilotDeploymentProfile](../api/activedirectorywindowsautopilotdeploymentprofile-create.md)|[activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md)|Create a new [activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md) object.|
|[Get activeDirectoryWindowsAutopilotDeploymentProfile](../api/activedirectorywindowsautopilotdeploymentprofile-get.md)|[activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md)|Read the properties and relationships of an [activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md) object.|
|[Update activeDirectoryWindowsAutopilotDeploymentProfile](../api/activedirectorywindowsautopilotdeploymentprofile-update.md)|[activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md)|Update the properties of an [activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md) object.|
|[Delete activeDirectoryWindowsAutopilotDeploymentProfile](../api/activedirectorywindowsautopilotdeploymentprofile-delete.md)|None|Deletes an [activeDirectoryWindowsAutopilotDeploymentProfile](../resources/activedirectorywindowsautopilotdeploymentprofile.md) object.|
|[assign](../api/activedirectorywindowsautopilotdeploymentprofile-assign.md)|None|**TODO: Add Description**|
|[List assignedDevices](../api/activedirectorywindowsautopilotdeploymentprofile-list-assigneddevices.md)|[windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) collection|Get the windowsAutopilotDeviceIdentity resources from the assignedDevices navigation property.|
|[Create windowsAutopilotDeviceIdentity](../api/activedirectorywindowsautopilotdeploymentprofile-post-assigneddevices.md)|[windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md)|Create a new windowsAutopilotDeviceIdentity object.|
|[List assignments](../api/activedirectorywindowsautopilotdeploymentprofile-list-assignments.md)|[windowsAutopilotDeploymentProfileAssignment](../resources/windowsautopilotdeploymentprofileassignment.md) collection|Get the windowsAutopilotDeploymentProfileAssignment resources from the assignments navigation property.|
|[Create windowsAutopilotDeploymentProfileAssignment](../api/activedirectorywindowsautopilotdeploymentprofile-post-assignments.md)|[windowsAutopilotDeploymentProfileAssignment](../resources/windowsautopilotdeploymentprofileassignment.md)|Create a new windowsAutopilotDeploymentProfileAssignment object.|
|[List windowsDomainJoinConfiguration](../api/activedirectorywindowsautopilotdeploymentprofile-list-domainjoinconfiguration.md)|[windowsDomainJoinConfiguration](../resources/windowsdomainjoinconfiguration.md) collection|Get the windowsDomainJoinConfiguration resources from the domainJoinConfiguration navigation property.|
|[Create windowsDomainJoinConfiguration](../api/activedirectorywindowsautopilotdeploymentprofile-post-domainjoinconfiguration.md)|[windowsDomainJoinConfiguration](../resources/windowsdomainjoinconfiguration.md)|Create a new windowsDomainJoinConfiguration object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Profile creation time Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|description|String|Description of the profile Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|deviceNameTemplate|String|The template used to name the AutoPilot Device. This can be a custom text and can also contain either the serial number of the device, or a randomly generated number. The total length of the text generated by the template can be no more than 15 characters. Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|deviceType|windowsAutopilotDeviceType|The AutoPilot device type that this profile is applicable to. Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md). Possible values are: `windowsPc`, `surfaceHub2`, `holoLens`.|
|displayName|String|Name of the profile Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|enableWhiteGlove|Boolean|Enable Autopilot White Glove for the profile. Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|enrollmentStatusScreenSettings|[windowsEnrollmentStatusScreenSettings](../resources/windowsenrollmentstatusscreensettings.md)|Enrollment status screen setting Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|extractHardwareHash|Boolean|HardwareHash Extraction for the profile Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|hybridAzureADJoinSkipConnectivityCheck|Boolean|The Autopilot Hybrid Azure AD join flow will continue even if it does not establish domain controller connectivity during OOBE.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|language|String|Language configured on the device Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|lastModifiedDateTime|DateTimeOffset|Profile last modified time Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|outOfBoxExperienceSettings|[outOfBoxExperienceSettings](../resources/outofboxexperiencesettings.md)|Out of box experience setting Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|roleScopeTagIds|String collection|Scope tags for the profile. Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignedDevices|[windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) collection|The list of assigned devices for the profile. Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|assignments|[windowsAutopilotDeploymentProfileAssignment](../resources/windowsautopilotdeploymentprofileassignment.md) collection|The list of group assignments for the profile. Inherited from [windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|
|domainJoinConfiguration|[windowsDomainJoinConfiguration](../resources/windowsdomainjoinconfiguration.md)|Configuration to join Active Directory domain|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.activeDirectoryWindowsAutopilotDeploymentProfile",
  "baseType": "microsoft.graph.windowsAutopilotDeploymentProfile",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.activeDirectoryWindowsAutopilotDeploymentProfile",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "deviceNameTemplate": "String",
  "deviceType": "String",
  "displayName": "String",
  "enableWhiteGlove": "Boolean",
  "enrollmentStatusScreenSettings": {
    "@odata.type": "microsoft.graph.windowsEnrollmentStatusScreenSettings"
  },
  "extractHardwareHash": "Boolean",
  "language": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "outOfBoxExperienceSettings": {
    "@odata.type": "microsoft.graph.outOfBoxExperienceSettings"
  },
  "roleScopeTagIds": [
    "String"
  ],
  "hybridAzureADJoinSkipConnectivityCheck": "Boolean"
}
```

