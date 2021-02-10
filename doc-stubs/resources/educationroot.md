---
title: "educationRoot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationRoot resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get educationRoot](../api/educationroot-get.md)|[educationRoot](../resources/educationroot.md)|Read the properties and relationships of an [educationRoot](../resources/educationroot.md) object.|
|[Update educationRoot](../api/educationroot-update.md)|[educationRoot](../resources/educationroot.md)|Update the properties of an [educationRoot](../resources/educationroot.md) object.|
|[List classes](../api/educationroot-list-classes.md)|[educationClass](../resources/educationclass.md) collection|Get the educationClass resources from the classes navigation property.|
|[Create educationClass](../api/educationroot-post-classes.md)|[educationClass](../resources/educationclass.md)|Create a new educationClass object.|
|[List educationUser](../api/educationroot-list-me.md)|[educationUser](../resources/educationuser.md) collection|Get the educationUser resources from the me navigation property.|
|[Create educationUser](../api/educationroot-post-me.md)|[educationUser](../resources/educationuser.md)|Create a new educationUser object.|
|[List schools](../api/educationroot-list-schools.md)|[educationSchool](../resources/educationschool.md) collection|Get the educationSchool resources from the schools navigation property.|
|[Create educationSchool](../api/educationroot-post-schools.md)|[educationSchool](../resources/educationschool.md)|Create a new educationSchool object.|
|[List users](../api/educationroot-list-users.md)|[educationUser](../resources/educationuser.md) collection|Get the educationUser resources from the users navigation property.|
|[Create educationUser](../api/educationroot-post-users.md)|[educationUser](../resources/educationuser.md)|Create a new educationUser object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|classes|[educationClass](../resources/educationclass.md) collection|**TODO: Add Description**|
|me|[educationUser](../resources/educationuser.md)|**TODO: Add Description**|
|schools|[educationSchool](../resources/educationschool.md) collection|**TODO: Add Description**|
|users|[educationUser](../resources/educationuser.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationRoot",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationRoot"
}
```

