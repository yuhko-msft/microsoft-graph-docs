---
title: "shipmentMethod resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# shipmentMethod resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List shipmentMethods](../api/shipmentmethod-list.md)|[shipmentMethod](../resources/shipmentmethod.md) collection|Get a list of the [shipmentMethod](../resources/shipmentmethod.md) objects and their properties.|
|[Create shipmentMethod](../api/shipmentmethod-create.md)|[shipmentMethod](../resources/shipmentmethod.md)|Create a new [shipmentMethod](../resources/shipmentmethod.md) object.|
|[Get shipmentMethod](../api/shipmentmethod-get.md)|[shipmentMethod](../resources/shipmentmethod.md)|Read the properties and relationships of a [shipmentMethod](../resources/shipmentmethod.md) object.|
|[Update shipmentMethod](../api/shipmentmethod-update.md)|[shipmentMethod](../resources/shipmentmethod.md)|Update the properties of a [shipmentMethod](../resources/shipmentmethod.md) object.|
|[Delete shipmentMethod](../api/shipmentmethod-delete.md)|None|Deletes a [shipmentMethod](../resources/shipmentmethod.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.shipmentMethod",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.shipmentMethod",
  "id": "String (identifier)",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

