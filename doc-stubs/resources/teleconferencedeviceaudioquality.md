---
title: "teleconferenceDeviceAudioQuality resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teleconferenceDeviceAudioQuality resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|averageInboundJitter|Duration|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|averageInboundPacketLossRateInPercentage|Double|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|averageInboundRoundTripDelay|Duration|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|averageOutboundJitter|Duration|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|averageOutboundPacketLossRateInPercentage|Double|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|averageOutboundRoundTripDelay|Duration|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|channelIndex|Int32|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|inboundPackets|Int64|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|localIPAddress|String|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|localPort|Int32|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|maximumInboundJitter|Duration|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|maximumInboundPacketLossRateInPercentage|Double|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|maximumInboundRoundTripDelay|Duration|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|maximumOutboundJitter|Duration|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|maximumOutboundPacketLossRateInPercentage|Double|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|maximumOutboundRoundTripDelay|Duration|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|mediaDuration|Duration|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|networkLinkSpeedInBytes|Int64|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|outboundPackets|Int64|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|remoteIPAddress|String|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|
|remotePort|Int32|**TODO: Add Description** Inherited from [teleconferenceDeviceMediaQuality](../resources/teleconferencedevicemediaquality.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teleconferenceDeviceAudioQuality"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teleconferenceDeviceAudioQuality",
  "averageInboundJitter": "String (duration)",
  "averageInboundPacketLossRateInPercentage": "Double",
  "averageInboundRoundTripDelay": "String (duration)",
  "averageOutboundJitter": "String (duration)",
  "averageOutboundPacketLossRateInPercentage": "Double",
  "averageOutboundRoundTripDelay": "String (duration)",
  "channelIndex": "Integer",
  "inboundPackets": "Integer",
  "localIPAddress": "String",
  "localPort": "Integer",
  "maximumInboundJitter": "String (duration)",
  "maximumInboundPacketLossRateInPercentage": "Double",
  "maximumInboundRoundTripDelay": "String (duration)",
  "maximumOutboundJitter": "String (duration)",
  "maximumOutboundPacketLossRateInPercentage": "Double",
  "maximumOutboundRoundTripDelay": "String (duration)",
  "mediaDuration": "String (duration)",
  "networkLinkSpeedInBytes": "Integer",
  "outboundPackets": "Integer",
  "remoteIPAddress": "String",
  "remotePort": "Integer"
}
```

