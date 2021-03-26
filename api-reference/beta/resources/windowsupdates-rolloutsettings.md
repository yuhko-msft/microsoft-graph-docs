---
title: "rolloutSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# rolloutSettings resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Settings controlling how an update is deployed over time.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowOffersWhen|String|Date after which devices are allowed to receive new offers. When not set, offers are always allowed.|
|devicesPerOffer|Int32|	Specifies the number of devices that are offered at the same time. Has no effect when targetCompletionDateTime/endDateTime is set. When targetCompletionDateTime/endDateTime and devicesPerOffer are both not set, all devices in the deployment are offered content at the same time.|
|durationBetweenOffers|String|Specifies duration between each set of devices being offered the update. Has an effect when targetCompletionDateTime/endDateTime or devicesPerOffer are defined. Default value is P1D (1 day).|
|targetCompletionDateTime|DateTimeOffset|Specifies the date before which all devices currently in the deployment are offered the update. Devices added after this date are offered immediately. When targetCompletionDateTime and devicesPerOffer are both not set, all devices in the deployment are offered content at the same time.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsUpdates.rolloutSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.rolloutSettings",
  "allowOffersWhen": "String",
  "durationBetweenOffers": "String",
  "targetCompletionDateTime": "String (timestamp)",
  "devicesPerOffer": "Integer"
}
```

