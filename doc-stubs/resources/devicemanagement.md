---
title: "deviceManagement resource type"
description: "Singleton entity that acts as a container for all device management functionality."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagement resource type

Namespace: microsoft.graph

Singleton entity that acts as a container for all device management functionality.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagements](../api/devicemanagement-list.md)|[deviceManagement](../resources/devicemanagement.md) collection|Get a list of the [deviceManagement](../resources/devicemanagement.md) objects and their properties.|
|[Create deviceManagement](../api/devicemanagement-create.md)|[deviceManagement](../resources/devicemanagement.md)|Create a new [deviceManagement](../resources/devicemanagement.md) object.|
|[Get deviceManagement](../api/devicemanagement-get.md)|[deviceManagement](../resources/devicemanagement.md)|Read the properties and relationships of a [deviceManagement](../resources/devicemanagement.md) object.|
|[Update deviceManagement](../api/devicemanagement-update.md)|[deviceManagement](../resources/devicemanagement.md)|Update the properties of a [deviceManagement](../resources/devicemanagement.md) object.|
|[Delete deviceManagement](../api/devicemanagement-delete.md)|None|Deletes a [deviceManagement](../resources/devicemanagement.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagement",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagement",
  "id": "String (identifier)"
}
```

