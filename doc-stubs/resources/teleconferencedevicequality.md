---
title: "teleconferenceDeviceQuality resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teleconferenceDeviceQuality resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|callChainId|Guid|**TODO: Add Description**|
|cloudServiceDeploymentEnvironment|String|**TODO: Add Description**|
|cloudServiceDeploymentId|String|**TODO: Add Description**|
|cloudServiceInstanceName|String|**TODO: Add Description**|
|cloudServiceName|String|**TODO: Add Description**|
|deviceDescription|String|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|
|mediaLegId|Guid|**TODO: Add Description**|
|mediaQualityList|[teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md) collection|**TODO: Add Description**|
|participantId|Guid|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teleconferenceDeviceQuality"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teleconferenceDeviceQuality",
  "callChainId": "Guid",
  "cloudServiceDeploymentEnvironment": "String",
  "cloudServiceDeploymentId": "String",
  "cloudServiceInstanceName": "String",
  "cloudServiceName": "String",
  "deviceDescription": "String",
  "deviceName": "String",
  "mediaLegId": "Guid",
  "mediaQualityList": [
    {
      "@odata.type": "microsoft.graph.teleconferenceDeviceAudioQuality"
    }
  ],
  "participantId": "Guid"
}
```

