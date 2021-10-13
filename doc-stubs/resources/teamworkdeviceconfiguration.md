---
title: "teamworkDeviceConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamworkDeviceConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teamworkDeviceConfigurations](../api/teamworkdeviceconfiguration-list.md)|[teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md) collection|Get a list of the [teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md) objects and their properties.|
|[Create teamworkDeviceConfiguration](../api/teamworkdevice-post-configuration.md)|[teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md)|Create a new [teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md) object.|
|[Get teamworkDeviceConfiguration](../api/teamworkdeviceconfiguration-get.md)|[teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md)|Read the properties and relationships of a [teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md) object.|
|[Update teamworkDeviceConfiguration](../api/teamworkdeviceconfiguration-update.md)|[teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md)|Update the properties of a [teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md) object.|
|[Delete teamworkDeviceConfiguration](../api/teamworkdeviceconfiguration-delete.md)|None|Deletes a [teamworkDeviceConfiguration](../resources/teamworkdeviceconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|camera|[teamworkCameraConfiguration](../resources/teamworkcameraconfiguration.md)|**TODO: Add Description**|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|display|[teamworkDisplayConfiguration](../resources/teamworkdisplayconfiguration.md)|**TODO: Add Description**|
|hardware|[teamworkHardwareConfiguration](../resources/teamworkhardwareconfiguration.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|microphone|[teamworkMicrophoneConfiguration](../resources/teamworkmicrophoneconfiguration.md)|**TODO: Add Description**|
|softwareVersions|[teamworkDeviceSoftwareVersions](../resources/teamworkdevicesoftwareversions.md)|**TODO: Add Description**|
|speaker|[teamworkSpeakerConfiguration](../resources/teamworkspeakerconfiguration.md)|**TODO: Add Description**|
|system|[teamworkSystemConfiguration](../resources/teamworksystemconfiguration.md)|**TODO: Add Description**|
|teamsClient|[teamworkTeamsClientConfiguration](../resources/teamworkteamsclientconfiguration.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamworkDeviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkDeviceConfiguration",
  "id": "String (identifier)",
  "softwareVersions": {
    "@odata.type": "microsoft.graph.teamworkDeviceSoftwareVersions"
  },
  "display": {
    "@odata.type": "microsoft.graph.teamworkDisplayConfiguration"
  },
  "camera": {
    "@odata.type": "microsoft.graph.teamworkCameraConfiguration"
  },
  "speaker": {
    "@odata.type": "microsoft.graph.teamworkSpeakerConfiguration"
  },
  "microphone": {
    "@odata.type": "microsoft.graph.teamworkMicrophoneConfiguration"
  },
  "teamsClient": {
    "@odata.type": "microsoft.graph.teamworkTeamsClientConfiguration"
  },
  "hardware": {
    "@odata.type": "microsoft.graph.teamworkHardwareConfiguration"
  },
  "system": {
    "@odata.type": "microsoft.graph.teamworkSystemConfiguration"
  },
  "createdDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  }
}
```

