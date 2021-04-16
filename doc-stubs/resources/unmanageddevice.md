---
title: "unmanagedDevice resource type"
description: "Unmanaged device discovered in the network."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# unmanagedDevice resource type

Namespace: microsoft.graph



Unmanaged device discovered in the network.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceName|String|Device name.|
|domain|String|Domain.|
|ipAddress|String|IP address.|
|lastLoggedOnUser|String|Last logged on user.|
|lastSeenDateTime|DateTimeOffset|Last seen date and time.|
|location|String|Location.|
|macAddress|String|MAC address.|
|manufacturer|String|Manufacturer.|
|model|String|Model.|
|os|String|Operating system.|
|osVersion|String|Operating system version.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.unmanagedDevice"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.unmanagedDevice",
  "deviceName": "String",
  "domain": "String",
  "ipAddress": "String",
  "lastLoggedOnUser": "String",
  "lastSeenDateTime": "String (timestamp)",
  "location": "String",
  "macAddress": "String",
  "manufacturer": "String",
  "model": "String",
  "os": "String",
  "osVersion": "String"
}
```

