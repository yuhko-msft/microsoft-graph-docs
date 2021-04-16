---
title: "mobileAppRelationship resource type"
description: "Describes a relationship between two mobile apps."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppRelationship resource type

Namespace: microsoft.graph



Describes a relationship between two mobile apps.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileAppRelationships](../api/mobileapprelationship-list.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get a list of the [mobileAppRelationship](../resources/mobileapprelationship.md) objects and their properties.|
|[Create mobileAppRelationship](../api/mobileapprelationship-create.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[Get mobileAppRelationship](../api/mobileapprelationship-get.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Read the properties and relationships of a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[Update mobileAppRelationship](../api/mobileapprelationship-update.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Update the properties of a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[Delete mobileAppRelationship](../api/mobileapprelationship-delete.md)|None|Deletes a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetDisplayName|String|The target mobile app's display name.|
|targetDisplayVersion|String|The target mobile app's display version.|
|targetId|String|The target mobile app's app id.|
|targetPublisher|String|The target mobile app's publisher.|
|targetType|mobileAppRelationshipType|The type of relationship indicating whether the target is a parent or child. Possible values are: `child`, `parent`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppRelationship",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppRelationship",
  "id": "String (identifier)",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetId": "String",
  "targetPublisher": "String",
  "targetType": "String"
}
```

