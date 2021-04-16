---
title: "media resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# media resource type

Namespace: microsoft.graph.callRecords



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|calleeDevice|[deviceInfo](../resources/callrecords-deviceinfo.md)|**TODO: Add Description**|
|calleeNetwork|[networkInfo](../resources/callrecords-networkinfo.md)|**TODO: Add Description**|
|callerDevice|[deviceInfo](../resources/callrecords-deviceinfo.md)|**TODO: Add Description**|
|callerNetwork|[networkInfo](../resources/callrecords-networkinfo.md)|**TODO: Add Description**|
|label|String|**TODO: Add Description**|
|streams|[mediaStream](../resources/callrecords-mediastream.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.callRecords.media"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.callRecords.media",
  "calleeDevice": {
    "@odata.type": "microsoft.graph.callRecords.deviceInfo"
  },
  "calleeNetwork": {
    "@odata.type": "microsoft.graph.callRecords.networkInfo"
  },
  "callerDevice": {
    "@odata.type": "microsoft.graph.callRecords.deviceInfo"
  },
  "callerNetwork": {
    "@odata.type": "microsoft.graph.callRecords.networkInfo"
  },
  "label": "String",
  "streams": [
    {
      "@odata.type": "microsoft.graph.callRecords.mediaStream"
    }
  ]
}
```

