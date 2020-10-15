---
title: "location resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# location resource type

Namespace: microsoft.graph

## Properties

| Property             | Type                                                           | Description |
| :------------------- | :------------------------------------------------------------- | :---------- |
| address              | [physicalAddress](../resources/physicaladdress.md)             |             |
| coordinates          | [outlookGeoCoordinates](../resources/outlookgeocoordinates.md) |             |
| displayName          | String                                                         |             |
| locationEmailAddress | String                                                         |             |
| locationType         | String                                                         |             |
| locationUri          | String                                                         |             |
| uniqueId             | String                                                         |             |
| uniqueIdType         | String                                                         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.location",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.location",
  "address": {"@odata.type": "microsoft.graph.physicalAddress"},
  "coordinates": {"@odata.type": "microsoft.graph.outlookGeoCoordinates"},
  "displayName": "String",
  "locationEmailAddress": "String",
  "locationType": "default | conferenceRoom | homeAddress | businessAddress | geoCoordinates | streetAddress | hotel | restaurant | localBusiness | postalAddress",
  "locationUri": "String",
  "uniqueId": "String",
  "uniqueIdType": "unknown | locationStore | directory | private | bing"
}
```
