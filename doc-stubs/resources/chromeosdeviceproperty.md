---
title: "chromeOSDeviceProperty resource type"
description: "Represents a property of the ChromeOS device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# chromeOSDeviceProperty resource type

Namespace: microsoft.graph



Represents a property of the ChromeOS device.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|name|String|Name of the property|
|updatable|Boolean|Whether this property is updatable|
|value|String|Value of the property|
|valueType|String|Type of the value|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.chromeOSDeviceProperty"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.chromeOSDeviceProperty",
  "name": "String",
  "updatable": "Boolean",
  "value": "String",
  "valueType": "String"
}
```

