---
title: "deviceSetupConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceSetupConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceSetupConfigurations](../api/intune-devicesetupconfiguration-list.md)|[deviceSetupConfiguration](../resources/intune-devicesetupconfiguration.md) collection|Get a list of the [deviceSetupConfiguration](../resources/devicesetupconfiguration.md) objects and their properties.|
|[Create deviceSetupConfiguration](../api/intune-devicesetupconfiguration-create.md)|[deviceSetupConfiguration](../resources/intune-devicesetupconfiguration.md)|Create a new [deviceSetupConfiguration](../resources/intune-devicesetupconfiguration.md) object.|
|[Get deviceSetupConfiguration](../api/intune-devicesetupconfiguration-get.md)|[deviceSetupConfiguration](../resources/intune-devicesetupconfiguration.md)|Read the properties and relationships of a [deviceSetupConfiguration](../resources/intune-devicesetupconfiguration.md) object.|
|[Update deviceSetupConfiguration](../api/intune-devicesetupconfiguration-update.md)|[deviceSetupConfiguration](../resources/intune-devicesetupconfiguration.md)|Update the properties of a [deviceSetupConfiguration](../resources/intune-devicesetupconfiguration.md) object.|
|[Delete deviceSetupConfiguration](../api/intune-devicesetupconfiguration-delete.md)|None|Deletes a [deviceSetupConfiguration](../resources/intune-devicesetupconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceSetupConfiguration",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceSetupConfiguration",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "version": "Integer"
}
```

