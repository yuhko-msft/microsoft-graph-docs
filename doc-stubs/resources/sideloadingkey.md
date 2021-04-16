---
title: "sideLoadingKey resource type"
description: "SideLoadingKey entity is required for Windows 8 and 8.1 devices to intall Line Of Business Apps for a tenant."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sideLoadingKey resource type

Namespace: microsoft.graph



SideLoadingKey entity is required for Windows 8 and 8.1 devices to intall Line Of Business Apps for a tenant.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sideLoadingKeys](../api/sideloadingkey-list.md)|[sideLoadingKey](../resources/sideloadingkey.md) collection|Get a list of the [sideLoadingKey](../resources/sideloadingkey.md) objects and their properties.|
|[Create sideLoadingKey](../api/sideloadingkey-create.md)|[sideLoadingKey](../resources/sideloadingkey.md)|Create a new [sideLoadingKey](../resources/sideloadingkey.md) object.|
|[Get sideLoadingKey](../api/sideloadingkey-get.md)|[sideLoadingKey](../resources/sideloadingkey.md)|Read the properties and relationships of a [sideLoadingKey](../resources/sideloadingkey.md) object.|
|[Update sideLoadingKey](../api/sideloadingkey-update.md)|[sideLoadingKey](../resources/sideloadingkey.md)|Update the properties of a [sideLoadingKey](../resources/sideloadingkey.md) object.|
|[Delete sideLoadingKey](../api/sideloadingkey-delete.md)|None|Deletes a [sideLoadingKey](../resources/sideloadingkey.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Side Loading Key description displayed to the ITPro Admins..|
|displayName|String|Side Loading Key Name displayed to the ITPro Admins.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdatedDateTime|String|Side Loading Key Last Updated Date displayed to the ITPro Admins.|
|totalActivation|Int32|Side Loading Key Total Activation displayed to the ITPro Admins.|
|value|String|Side Loading Key Value, it is 5x5 value, seperated by hiphens.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sideLoadingKey",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sideLoadingKey",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "lastUpdatedDateTime": "String",
  "totalActivation": "Integer",
  "value": "String"
}
```

