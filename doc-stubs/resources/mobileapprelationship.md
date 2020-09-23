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

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List relationships](../api/mobileapp-list-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get the mobileAppRelationship resources from the relationships navigation property.|
|[Create relationships](../api/mobileapp-post-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new mobileAppRelationship object.|
|[Update relationships](../api/mobileapp-update-relationships.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Update the properties of a relationships object.|
|[Get relationships](../api/mobileapp-get-mobileapprelationship.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Read the properties and relationships of a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[Delete relationships](../api/mobileapp-delete-relationships.md)|None|Delete a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[List mobileAppRelationships](../api/mobileapprelationship-list.md)|[mobileAppRelationship](../resources/mobileapprelationship.md) collection|Get a list of the [mobileAppRelationship](../resources/mobileapprelationship.md) objects and their properties.|
|[Create mobileAppRelationship](../api/mobileapprelationship-create.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Create a new [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[Get mobileAppRelationship](../api/mobileapprelationship-get.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Read the properties and relationships of a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[Update mobileAppRelationship](../api/mobileapprelationship-update.md)|[mobileAppRelationship](../resources/mobileapprelationship.md)|Update the properties of a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|
|[Delete mobileAppRelationship](../api/mobileapprelationship-delete.md)|None|Deletes a [mobileAppRelationship](../resources/mobileapprelationship.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|The relationship entity id.|
|targetDisplayName|String|The target mobile app's display name.|
|targetId|String|The target mobile app's app id.|
|targetType|mobileAppRelationshipType|The type of relationship indicating whether the target is a parent or child. Possible values are: `child`, `parent`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppRelationship",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppRelationship",
  "id": "String (identifier)",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetType": "String"
}
```

