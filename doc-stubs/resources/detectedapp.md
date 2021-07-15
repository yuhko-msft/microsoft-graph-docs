---
title: "detectedApp resource type"
description: "A managed or unmanaged app that is installed on a managed device. Unmanaged apps will only appear for devices marked as corporate owned."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# detectedApp resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A managed or unmanaged app that is installed on a managed device. Unmanaged apps will only appear for devices marked as corporate owned.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List detectedApps](../api/detectedapp-list.md)|[detectedApp](../resources/detectedapp.md) collection|Get a list of the [detectedApp](../resources/detectedapp.md) objects and their properties.|
|[Create detectedApp](../api/detectedapp-create.md)|[detectedApp](../resources/detectedapp.md)|Create a new [detectedApp](../resources/detectedapp.md) object.|
|[Get detectedApp](../api/detectedapp-get.md)|[detectedApp](../resources/detectedapp.md)|Read the properties and relationships of a [detectedApp](../resources/detectedapp.md) object.|
|[Update detectedApp](../api/detectedapp-update.md)|[detectedApp](../resources/detectedapp.md)|Update the properties of a [detectedApp](../resources/detectedapp.md) object.|
|[Delete detectedApp](../api/detectedapp-delete.md)|None|Deletes a [detectedApp](../resources/detectedapp.md) object.|
|[List managedDevices](../api/detectedapp-list-manageddevices.md)|[managedDevice](../resources/manageddevice.md) collection|Get the managedDevice resources from the managedDevices navigation property.|
|[Add managedDevice](../api/detectedapp-post-manageddevices.md)|[managedDevice](../resources/manageddevice.md)|Add managedDevices by posting to the managedDevices collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceCount|Int32|The number of devices that have installed this application|
|displayName|String|Name of the discovered application. Read-only|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|sizeInByte|Int64|Discovered application size in bytes. Read-only|
|version|String|Version of the discovered application. Read-only|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managedDevices|[managedDevice](../resources/manageddevice.md) collection|The devices that have the discovered application installed|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.detectedApp",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.detectedApp",
  "id": "String (identifier)",
  "deviceCount": "Integer",
  "displayName": "String",
  "sizeInByte": "Integer",
  "version": "String"
}
```

