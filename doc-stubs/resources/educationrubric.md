---
title: "educationRubric resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationRubric resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List educationRubrics](../api/educationrubric-list.md)|[educationRubric](../resources/educationrubric.md) collection|Get a list of the [educationRubric](../resources/educationrubric.md) objects and their properties.|
|[Create educationRubric](../api/educationrubric-create.md)|[educationRubric](../resources/educationrubric.md)|Create a new [educationRubric](../resources/educationrubric.md) object.|
|[Get educationRubric](../api/educationrubric-get.md)|[educationRubric](../resources/educationrubric.md)|Read the properties and relationships of an [educationRubric](../resources/educationrubric.md) object.|
|[Update educationRubric](../api/educationrubric-update.md)|[educationRubric](../resources/educationrubric.md)|Update the properties of an [educationRubric](../resources/educationrubric.md) object.|
|[Delete educationRubric](../api/educationrubric-delete.md)|None|Deletes an [educationRubric](../resources/educationrubric.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|[educationItemBody](../resources/educationitembody.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|grading|[educationAssignmentGradeType](../resources/educationassignmentgradetype.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|levels|[rubricLevel](../resources/rubriclevel.md) collection|**TODO: Add Description**|
|qualities|[rubricQuality](../resources/rubricquality.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationRubric",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationRubric",
  "id": "String (identifier)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "description": {
    "@odata.type": "microsoft.graph.educationItemBody"
  },
  "displayName": "String",
  "grading": {
    "@odata.type": "microsoft.graph.educationAssignmentGradeType"
  },
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "levels": [
    {
      "@odata.type": "microsoft.graph.rubricLevel"
    }
  ],
  "qualities": [
    {
      "@odata.type": "microsoft.graph.rubricQuality"
    }
  ]
}
```

