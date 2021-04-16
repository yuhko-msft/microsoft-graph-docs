---
title: "connector resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# connector resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List connectors](../api/connector-list.md)|[connector](../resources/connector.md) collection|Get a list of the [connector](../resources/connector.md) objects and their properties.|
|[Create connector](../api/connector-create.md)|[connector](../resources/connector.md)|Create a new [connector](../resources/connector.md) object.|
|[Get connector](../api/connector-get.md)|[connector](../resources/connector.md)|Read the properties and relationships of a [connector](../resources/connector.md) object.|
|[Update connector](../api/connector-update.md)|[connector](../resources/connector.md)|Update the properties of a [connector](../resources/connector.md) object.|
|[Delete connector](../api/connector-delete.md)|None|Deletes a [connector](../resources/connector.md) object.|
|[List memberOf](../api/connector-list-memberof.md)|[connectorGroup](../resources/connectorgroup.md) collection|Get the connectorGroup resources from the memberOf navigation property.|
|[Add connectorGroup](../api/connector-post-memberof.md)|[connectorGroup](../resources/connectorgroup.md)|Add memberOf by posting to the memberOf collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|externalIp|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|machineName|String|**TODO: Add Description**|
|status|connectorStatus|**TODO: Add Description**. Possible values are: `active`, `inactive`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|memberOf|[connectorGroup](../resources/connectorgroup.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.connector",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.connector",
  "id": "String (identifier)",
  "externalIp": "String",
  "machineName": "String",
  "status": "String"
}
```

