---
title: "deviceInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceInfo resource type

Namespace: microsoft.graph.callRecords

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|captureDeviceDriver|String|**TODO: Add Description**|
|captureDeviceName|String|**TODO: Add Description**|
|captureNotFunctioningEventRatio|Single|**TODO: Add Description**|
|cpuInsufficentEventRatio|Single|**TODO: Add Description**|
|deviceClippingEventRatio|Single|**TODO: Add Description**|
|deviceGlitchEventRatio|Single|**TODO: Add Description**|
|howlingEventCount|Int32|**TODO: Add Description**|
|initialSignalLevelRootMeanSquare|Single|**TODO: Add Description**|
|lowSpeechLevelEventRatio|Single|**TODO: Add Description**|
|lowSpeechToNoiseEventRatio|Single|**TODO: Add Description**|
|micGlitchRate|Single|**TODO: Add Description**|
|receivedNoiseLevel|Int32|**TODO: Add Description**|
|receivedSignalLevel|Int32|**TODO: Add Description**|
|renderDeviceDriver|String|**TODO: Add Description**|
|renderDeviceName|String|**TODO: Add Description**|
|renderMuteEventRatio|Single|**TODO: Add Description**|
|renderNotFunctioningEventRatio|Single|**TODO: Add Description**|
|renderZeroVolumeEventRatio|Single|**TODO: Add Description**|
|sentNoiseLevel|Int32|**TODO: Add Description**|
|sentSignalLevel|Int32|**TODO: Add Description**|
|speakerGlitchRate|Single|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.callRecords.deviceInfo"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.callRecords.deviceInfo",
  "captureDeviceDriver": "String",
  "captureDeviceName": "String",
  "captureNotFunctioningEventRatio": "Single",
  "cpuInsufficentEventRatio": "Single",
  "deviceClippingEventRatio": "Single",
  "deviceGlitchEventRatio": "Single",
  "howlingEventCount": "Integer",
  "initialSignalLevelRootMeanSquare": "Single",
  "lowSpeechLevelEventRatio": "Single",
  "lowSpeechToNoiseEventRatio": "Single",
  "micGlitchRate": "Single",
  "receivedNoiseLevel": "Integer",
  "receivedSignalLevel": "Integer",
  "renderDeviceDriver": "String",
  "renderDeviceName": "String",
  "renderMuteEventRatio": "Single",
  "renderNotFunctioningEventRatio": "Single",
  "renderZeroVolumeEventRatio": "Single",
  "sentNoiseLevel": "Integer",
  "sentSignalLevel": "Integer",
  "speakerGlitchRate": "Single"
}
```

