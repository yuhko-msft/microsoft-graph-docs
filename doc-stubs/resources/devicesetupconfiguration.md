---
title: "deviceSetupConfiguration resource type"
description: "This is the base class for Setup Configuration. Setup configurations are platform specific and individual per-platform setup configurations inherit from here."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceSetupConfiguration resource type

Namespace: microsoft.graph



This is the base class for Setup Configuration. Setup configurations are platform specific and individual per-platform setup configurations inherit from here.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceSetupConfigurations](../api/devicesetupconfiguration-list.md)|[deviceSetupConfiguration](../resources/devicesetupconfiguration.md) collection|Get a list of the [deviceSetupConfiguration](../resources/devicesetupconfiguration.md) objects and their properties.|
|[Create deviceSetupConfiguration](../api/devicesetupconfiguration-create.md)|[deviceSetupConfiguration](../resources/devicesetupconfiguration.md)|Create a new [deviceSetupConfiguration](../resources/devicesetupconfiguration.md) object.|
|[Get deviceSetupConfiguration](../api/devicesetupconfiguration-get.md)|[deviceSetupConfiguration](../resources/devicesetupconfiguration.md)|Read the properties and relationships of a [deviceSetupConfiguration](../resources/devicesetupconfiguration.md) object.|
|[Update deviceSetupConfiguration](../api/devicesetupconfiguration-update.md)|[deviceSetupConfiguration](../resources/devicesetupconfiguration.md)|Update the properties of a [deviceSetupConfiguration](../resources/devicesetupconfiguration.md) object.|
|[Delete deviceSetupConfiguration](../api/devicesetupconfiguration-delete.md)|None|Deletes a [deviceSetupConfiguration](../resources/devicesetupconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created.|
|description|String|Admin provided description of the Device Configuration.|
|displayName|String|Admin provided name of the device configuration.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|version|Int32|Version of the device configuration.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceSetupConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceSetupConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "version": "Integer"
}
```

