---
title: "mobileAppDependency resource type"
description: "Describes a dependency type between two mobile apps."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppDependency resource type

Namespace: microsoft.graph



Describes a dependency type between two mobile apps.


Inherits from [mobileAppRelationship](../resources/mobileapprelationship.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileAppDependencies](../api/mobileappdependency-list.md)|[mobileAppDependency](../resources/mobileappdependency.md) collection|Get a list of the [mobileAppDependency](../resources/mobileappdependency.md) objects and their properties.|
|[Create mobileAppDependency](../api/mobileappdependency-create.md)|[mobileAppDependency](../resources/mobileappdependency.md)|Create a new [mobileAppDependency](../resources/mobileappdependency.md) object.|
|[Get mobileAppDependency](../api/mobileappdependency-get.md)|[mobileAppDependency](../resources/mobileappdependency.md)|Read the properties and relationships of a [mobileAppDependency](../resources/mobileappdependency.md) object.|
|[Update mobileAppDependency](../api/mobileappdependency-update.md)|[mobileAppDependency](../resources/mobileappdependency.md)|Update the properties of a [mobileAppDependency](../resources/mobileappdependency.md) object.|
|[Delete mobileAppDependency](../api/mobileappdependency-delete.md)|None|Deletes a [mobileAppDependency](../resources/mobileappdependency.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dependencyType|mobileAppDependencyType|The type of dependency relationship between the parent and child apps. Possible values are: `detect`, `autoInstall`.|
|dependentAppCount|Int32|The total number of apps that directly or indirectly depend on the parent app.|
|dependsOnAppCount|Int32|The total number of apps the child app directly or indirectly depends on.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetDisplayName|String|The target mobile app's display name. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetDisplayVersion|String|The target mobile app's display version. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetId|String|The target mobile app's app id. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetPublisher|String|The target mobile app's publisher. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetType|mobileAppRelationshipType|The type of relationship indicating whether the target is a parent or child. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md). Possible values are: `child`, `parent`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppDependency",
  "baseType": "microsoft.graph.mobileAppRelationship",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppDependency",
  "id": "String (identifier)",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetId": "String",
  "targetPublisher": "String",
  "targetType": "String",
  "dependencyType": "String",
  "dependentAppCount": "Integer",
  "dependsOnAppCount": "Integer"
}
```

