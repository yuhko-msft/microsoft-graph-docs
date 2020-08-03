---
title: "accessPackageResourceScope resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# accessPackageResourceScope resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List accessPackageResourceScopes](../api/accesspackagecatalog-list-accesspackageresourcescopes.md)|[accessPackageResourceScope](../resources/accesspackageresourcescope.md) collection|Get the accessPackageResourceScopes from the accessPackageResourceScopes navigation property.|
|[Create accessPackageResourceScopes](../api/accesspackagecatalog-post-accesspackageresourcescopes.md)|[accessPackageResourceScope](../resources/accesspackageresourcescope.md)|Create a new accessPackageResourceScopes object.|
|[Update accessPackageResourceScopes](../api/accesspackagecatalog-update-accesspackageresourcescopes.md)|[accessPackageResourceScope](../resources/accesspackageresourcescope.md)|Update the properties of an accessPackageResourceScopes object.|
|[Get accessPackageResourceScopes](../api/accesspackagecatalog-get-accesspackageresourcescope.md)|[accessPackageResourceScope](../resources/accesspackageresourcescope.md)|Read the properties and relationships of an [accessPackageResourceScope](../resources/accesspackageresourcescope.md) object.|
|[Delete accessPackageResourceScopes](../api/accesspackagecatalog-delete-accesspackageresourcescopes.md)|None|Delete an [accessPackageResourceScope](../resources/accesspackageresourcescope.md) object.|
|[List accessPackageResourceScopes](../api/accesspackageresourcescope-list.md)|[accessPackageResourceScope](../resources/accesspackageresourcescope.md) collection|Get a list of the [accessPackageResourceScope](../resources/accesspackageresourcescope.md) objects and their properties.|
|[Create accessPackageResourceScope](../api/accesspackageresourcescope-create.md)|[accessPackageResourceScope](../resources/accesspackageresourcescope.md)|Create a new [accessPackageResourceScope](../resources/accesspackageresourcescope.md) object.|
|[Get accessPackageResourceScope](../api/accesspackageresourcescope-get.md)|[accessPackageResourceScope](../resources/accesspackageresourcescope.md)|Read the properties and relationships of an [accessPackageResourceScope](../resources/accesspackageresourcescope.md) object.|
|[Update accessPackageResourceScope](../api/accesspackageresourcescope-update.md)|[accessPackageResourceScope](../resources/accesspackageresourcescope.md)|Update the properties of an [accessPackageResourceScope](../resources/accesspackageresourcescope.md) object.|
|[Delete accessPackageResourceScope](../api/accesspackageresourcescope-delete.md)|None|Deletes an [accessPackageResourceScope](../resources/accesspackageresourcescope.md) object.|
|[List accessPackageResource](../api/accesspackageresourcescope-list-accesspackageresource.md)|[accessPackageResource](../resources/accesspackageresource.md) collection|Get the accessPackageResources from the accessPackageResource navigation property.|
|[Create accessPackageResource](../api/accesspackageresourcescope-post-accesspackageresource.md)|[accessPackageResource](../resources/accesspackageresource.md)|Create a new accessPackageResource object.|
|[Get accessPackageResource](../api/accesspackageresourcescope-get-accesspackageresource.md)|[accessPackageResource](../resources/accesspackageresource.md)|Read the properties and relationships of an [accessPackageResource](../resources/accesspackageresource.md) object.|
|[Update accessPackageResource](../api/accesspackageresourcescope-update-accesspackageresource.md)|[accessPackageResource](../resources/accesspackageresource.md)|Update the properties of an accessPackageResource object.|
|[Delete accessPackageResource](../api/accesspackageresourcescope-delete-accesspackageresource.md)|None|Delete an [accessPackageResource](../resources/accesspackageresource.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isRootScope|Boolean|**TODO: Add Description**|
|originId|String|**TODO: Add Description**|
|originSystem|String|**TODO: Add Description**|
|roleOriginId|String|**TODO: Add Description**|
|url|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|accessPackageResource|[accessPackageResource](../resources/accesspackageresource.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.accessPackageResourceScope",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.accessPackageResourceScope",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "originId": "String",
  "originSystem": "String",
  "roleOriginId": "String",
  "isRootScope": "Boolean",
  "url": "String"
}
```

