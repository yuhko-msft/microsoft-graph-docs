---
title: "userConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userConfiguration resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userConfigurations](../api/userconfiguration-list.md)|[userConfiguration](../resources/userconfiguration.md) collection|Get a list of the [userConfiguration](../resources/userconfiguration.md) objects and their properties.|
|[Create userConfiguration](../api/userconfiguration-create.md)|[userConfiguration](../resources/userconfiguration.md)|Create a new [userConfiguration](../resources/userconfiguration.md) object.|
|[Get userConfiguration](../api/userconfiguration-get.md)|[userConfiguration](../resources/userconfiguration.md)|Read the properties and relationships of a [userConfiguration](../resources/userconfiguration.md) object.|
|[Update userConfiguration](../api/userconfiguration-update.md)|[userConfiguration](../resources/userconfiguration.md)|Update the properties of a [userConfiguration](../resources/userconfiguration.md) object.|
|[Delete userConfiguration](../api/userconfiguration-delete.md)|None|Deletes a [userConfiguration](../resources/userconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|binaryData|Binary|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userConfiguration",
  "id": "String (identifier)",
  "binaryData": "Binary"
}
```

