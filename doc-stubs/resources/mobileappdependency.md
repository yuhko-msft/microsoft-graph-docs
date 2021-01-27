---
title: "mobileAppDependency resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppDependency resource type

Namespace: microsoft.graph

**TODO: Add Description**


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
|dependencyType|mobileAppDependencyType|**TODO: Add Description**. Possible values are: `detect`, `autoInstall`.|
|dependentAppCount|Int32|**TODO: Add Description**|
|dependsOnAppCount|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetDisplayName|String|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md)|
|targetDisplayVersion|String|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md)|
|targetId|String|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md)|
|targetPublisher|String|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md)|
|targetType|mobileAppRelationshipType|**TODO: Add Description** Inherited from [mobileAppRelationship](../resources/intune-mobileapprelationship.md). Possible values are: `child`, `parent`.|

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
  "targetId": "String",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetPublisher": "String",
  "targetType": "String",
  "dependencyType": "String",
  "dependentAppCount": "Integer",
  "dependsOnAppCount": "Integer"
}
```

