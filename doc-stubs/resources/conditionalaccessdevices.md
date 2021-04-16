---
title: "conditionalAccessDevices resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# conditionalAccessDevices resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceFilter|[conditionalAccessFilter](../resources/conditionalaccessfilter.md)|**TODO: Add Description**|
|excludeDevices|String collection|**TODO: Add Description**|
|excludeDeviceStates|String collection|**TODO: Add Description**|
|includeDevices|String collection|**TODO: Add Description**|
|includeDeviceStates|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.conditionalAccessDevices"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.conditionalAccessDevices",
  "deviceFilter": {
    "@odata.type": "microsoft.graph.conditionalAccessFilter"
  },
  "excludeDevices": [
    "String"
  ],
  "excludeDeviceStates": [
    "String"
  ],
  "includeDevices": [
    "String"
  ],
  "includeDeviceStates": [
    "String"
  ]
}
```

