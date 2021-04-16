---
title: "connectorGroup resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# connectorGroup resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List connectorGroups](../api/connectorgroup-list.md)|[connectorGroup](../resources/connectorgroup.md) collection|Get a list of the [connectorGroup](../resources/connectorgroup.md) objects and their properties.|
|[Create connectorGroup](../api/connectorgroup-create.md)|[connectorGroup](../resources/connectorgroup.md)|Create a new [connectorGroup](../resources/connectorgroup.md) object.|
|[Get connectorGroup](../api/connectorgroup-get.md)|[connectorGroup](../resources/connectorgroup.md)|Read the properties and relationships of a [connectorGroup](../resources/connectorgroup.md) object.|
|[Update connectorGroup](../api/connectorgroup-update.md)|[connectorGroup](../resources/connectorgroup.md)|Update the properties of a [connectorGroup](../resources/connectorgroup.md) object.|
|[Delete connectorGroup](../api/connectorgroup-delete.md)|None|Deletes a [connectorGroup](../resources/connectorgroup.md) object.|
|[List applications](../api/connectorgroup-list-applications.md)|[application](../resources/application.md) collection|Get the application resources from the applications navigation property.|
|[Add application](../api/connectorgroup-post-applications.md)|[application](../resources/application.md)|Add applications by posting to the applications collection.|
|[List members](../api/connectorgroup-list-members.md)|[connector](../resources/connector.md) collection|Get the connector resources from the members navigation property.|
|[Add connector](../api/connectorgroup-post-members.md)|[connector](../resources/connector.md)|Add members by posting to the members collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|connectorGroupType|connectorGroupType|**TODO: Add Description**. Possible values are: `applicationProxy`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDefault|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|region|connectorGroupRegion|**TODO: Add Description**. Possible values are: `nam`, `eur`, `aus`, `asia`, `ind`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|applications|[application](../resources/application.md) collection|**TODO: Add Description**|
|members|[connector](../resources/connector.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.connectorGroup",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.connectorGroup",
  "id": "String (identifier)",
  "connectorGroupType": "String",
  "isDefault": "Boolean",
  "name": "String",
  "region": "String"
}
```

