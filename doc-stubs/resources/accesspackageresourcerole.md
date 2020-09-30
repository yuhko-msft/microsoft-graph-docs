---
title: "accessPackageResourceRole resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# accessPackageResourceRole resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List accessPackageResourceRoles](../api/accesspackagecatalog-list-accesspackageresourceroles.md)|[accessPackageResourceRole](../resources/accesspackageresourcerole.md) collection|Get the accessPackageResourceRole resources from the accessPackageResourceRoles navigation property.|
|[Create accessPackageResourceRoles](../api/accesspackagecatalog-post-accesspackageresourceroles.md)|[accessPackageResourceRole](../resources/accesspackageresourcerole.md)|Create a new accessPackageResourceRole object.|
|[Update accessPackageResourceRoles](../api/accesspackagecatalog-update-accesspackageresourceroles.md)|[accessPackageResourceRole](../resources/accesspackageresourcerole.md)|Update the properties of an accessPackageResourceRoles object.|
|[Get accessPackageResourceRoles](../api/accesspackagecatalog-get-accesspackageresourcerole.md)|[accessPackageResourceRole](../resources/accesspackageresourcerole.md)|Read the properties and relationships of an [accessPackageResourceRole](../resources/accesspackageresourcerole.md) object.|
|[Delete accessPackageResourceRoles](../api/accesspackagecatalog-delete-accesspackageresourceroles.md)|None|Delete an [accessPackageResourceRole](../resources/accesspackageresourcerole.md) object.|
|[List accessPackageResourceRoles](../api/accesspackageresourcerole-list.md)|[accessPackageResourceRole](../resources/accesspackageresourcerole.md) collection|Get a list of the [accessPackageResourceRole](../resources/accesspackageresourcerole.md) objects and their properties.|
|[Create accessPackageResourceRole](../api/accesspackageresourcerole-create.md)|[accessPackageResourceRole](../resources/accesspackageresourcerole.md)|Create a new [accessPackageResourceRole](../resources/accesspackageresourcerole.md) object.|
|[Get accessPackageResourceRole](../api/accesspackageresourcerole-get.md)|[accessPackageResourceRole](../resources/accesspackageresourcerole.md)|Read the properties and relationships of an [accessPackageResourceRole](../resources/accesspackageresourcerole.md) object.|
|[Update accessPackageResourceRole](../api/accesspackageresourcerole-update.md)|[accessPackageResourceRole](../resources/accesspackageresourcerole.md)|Update the properties of an [accessPackageResourceRole](../resources/accesspackageresourcerole.md) object.|
|[Delete accessPackageResourceRole](../api/accesspackageresourcerole-delete.md)|None|Deletes an [accessPackageResourceRole](../resources/accesspackageresourcerole.md) object.|
|[List accessPackageResource](../api/accesspackageresourcerole-list-accesspackageresource.md)|[accessPackageResource](../resources/accesspackageresource.md) collection|Get the accessPackageResource resources from the accessPackageResource navigation property.|
|[Create accessPackageResource](../api/accesspackageresourcerole-post-accesspackageresource.md)|[accessPackageResource](../resources/accesspackageresource.md)|Create a new accessPackageResource object.|
|[Get accessPackageResource](../api/accesspackageresourcerole-get-accesspackageresource.md)|[accessPackageResource](../resources/accesspackageresource.md)|Read the properties and relationships of an [accessPackageResource](../resources/accesspackageresource.md) object.|
|[Update accessPackageResource](../api/accesspackageresourcerole-update-accesspackageresource.md)|[accessPackageResource](../resources/accesspackageresource.md)|Update the properties of an accessPackageResource object.|
|[Delete accessPackageResource](../api/accesspackageresourcerole-delete-accesspackageresource.md)|None|Delete an [accessPackageResource](../resources/accesspackageresource.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|originId|String|**TODO: Add Description**|
|originSystem|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|accessPackageResource|[accessPackageResource](../resources/accesspackageresource.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.accessPackageResourceRole",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.accessPackageResourceRole",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "originId": "String",
  "originSystem": "String"
}
```

