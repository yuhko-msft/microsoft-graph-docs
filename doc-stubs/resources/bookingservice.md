---
title: "bookingService resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bookingService resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [bookingNamedEntity](../resources/bookingnamedentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List bookingServices](../api/bookingservice-list.md)|[bookingService](../resources/bookingservice.md) collection|Get a list of the [bookingService](../resources/bookingservice.md) objects and their properties.|
|[Create bookingService](../api/bookingservice-create.md)|[bookingService](../resources/bookingservice.md)|Create a new [bookingService](../resources/bookingservice.md) object.|
|[Get bookingService](../api/bookingservice-get.md)|[bookingService](../resources/bookingservice.md)|Read the properties and relationships of a [bookingService](../resources/bookingservice.md) object.|
|[Update bookingService](../api/bookingservice-update.md)|[bookingService](../resources/bookingservice.md)|Update the properties of a [bookingService](../resources/bookingservice.md) object.|
|[Delete bookingService](../api/bookingservice-delete.md)|None|Deletes a [bookingService](../resources/bookingservice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalInformation|String|**TODO: Add Description**|
|defaultDuration|Duration|**TODO: Add Description**|
|defaultLocation|[location](../resources/location.md)|**TODO: Add Description**|
|defaultPrice|Double|**TODO: Add Description**|
|defaultPriceType|bookingPriceType|**TODO: Add Description**. Possible values are: `undefined`, `fixedPrice`, `startingAt`, `hourly`, `free`, `priceVaries`, `callUs`, `notSet`.|
|defaultReminders|[bookingReminder](../resources/bookingreminder.md) collection|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description** Inherited from [bookingNamedEntity](../resources/bookingnamedentity.md)|
|isHiddenFromCustomers|Boolean|**TODO: Add Description**|
|isLocationOnline|Boolean|**TODO: Add Description**|
|notes|String|**TODO: Add Description**|
|postBuffer|Duration|**TODO: Add Description**|
|preBuffer|Duration|**TODO: Add Description**|
|schedulingPolicy|[bookingSchedulingPolicy](../resources/bookingschedulingpolicy.md)|**TODO: Add Description**|
|staffMemberIds|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.bookingService",
  "baseType": "microsoft.graph.bookingNamedEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bookingService",
  "displayName": "String",
  "defaultDuration": "String (duration)",
  "defaultLocation": {
    "@odata.type": "microsoft.graph.location"
  },
  "defaultPrice": "Double",
  "defaultPriceType": "String",
  "defaultReminders": [
    {
      "@odata.type": "microsoft.graph.bookingReminder"
    }
  ],
  "description": "String",
  "isHiddenFromCustomers": "Boolean",
  "notes": "String",
  "additionalInformation": "String",
  "preBuffer": "String (duration)",
  "postBuffer": "String (duration)",
  "schedulingPolicy": {
    "@odata.type": "microsoft.graph.bookingSchedulingPolicy"
  },
  "staffMemberIds": [
    "String"
  ],
  "isLocationOnline": "Boolean"
}
```

