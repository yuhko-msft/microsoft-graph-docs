---
title: "educationClass resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationClass resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List educationClasses](../api/educationclass-list.md)|[educationClass](../resources/educationclass.md) collection|Get a list of the [educationClass](../resources/educationclass.md) objects and their properties.|
|[Create educationClass](../api/educationclass-create.md)|[educationClass](../resources/educationclass.md)|Create a new [educationClass](../resources/educationclass.md) object.|
|[Get educationClass](../api/educationclass-get.md)|[educationClass](../resources/educationclass.md)|Read the properties and relationships of an [educationClass](../resources/educationclass.md) object.|
|[Update educationClass](../api/educationclass-update.md)|[educationClass](../resources/educationclass.md)|Update the properties of an [educationClass](../resources/educationclass.md) object.|
|[Delete educationClass](../api/educationclass-delete.md)|None|Deletes an [educationClass](../resources/educationclass.md) object.|
|[delta](../api/educationclass-delta.md)|[educationClass](../resources/educationclass.md) collection|**TODO: Add Description**|
|[List group](../api/educationclass-list-group.md)|[group](../resources/group.md) collection|Get the group resources from the group navigation property.|
|[Add group](../api/educationclass-post-group.md)|[group](../resources/group.md)|Add group by posting to the group collection.|
|[List members](../api/educationclass-list-members.md)|[educationUser](../resources/educationuser.md) collection|Get the educationUser resources from the members navigation property.|
|[Add educationUser](../api/educationclass-post-members.md)|[educationUser](../resources/educationuser.md)|Add members by posting to the members collection.|
|[List schools](../api/educationclass-list-schools.md)|[educationSchool](../resources/educationschool.md) collection|Get the educationSchool resources from the schools navigation property.|
|[Add educationSchool](../api/educationclass-post-schools.md)|[educationSchool](../resources/educationschool.md)|Add schools by posting to the schools collection.|
|[List teachers](../api/educationclass-list-teachers.md)|[educationUser](../resources/educationuser.md) collection|Get the educationUser resources from the teachers navigation property.|
|[Add educationUser](../api/educationclass-post-teachers.md)|[educationUser](../resources/educationuser.md)|Add teachers by posting to the teachers collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|classCode|String|**TODO: Add Description**|
|course|[educationCourse](../resources/educationcourse.md)|**TODO: Add Description**|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|externalName|String|**TODO: Add Description**|
|externalSource|educationExternalSource|**TODO: Add Description**. Possible values are: `sis`, `manual`, `unknownFutureValue`, `lms`.|
|externalSourceDetail|String|**TODO: Add Description**|
|grade|String|**TODO: Add Description**|
|mailNickname|String|**TODO: Add Description**|
|term|[educationTerm](../resources/educationterm.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|group|[group](../resources/group.md)|**TODO: Add Description**|
|members|[educationUser](../resources/educationuser.md) collection|**TODO: Add Description**|
|schools|[educationSchool](../resources/educationschool.md) collection|**TODO: Add Description**|
|teachers|[educationUser](../resources/educationuser.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationClass",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationClass",
  "displayName": "String",
  "mailNickname": "String",
  "description": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "classCode": "String",
  "externalName": "String",
  "externalId": "String",
  "externalSource": "String",
  "externalSourceDetail": "String",
  "grade": "String",
  "term": {
    "@odata.type": "microsoft.graph.educationTerm"
  },
  "course": {
    "@odata.type": "microsoft.graph.educationCourse"
  }
}
```

