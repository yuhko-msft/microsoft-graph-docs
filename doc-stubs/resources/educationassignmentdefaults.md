---
title: "educationAssignmentDefaults resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationAssignmentDefaults resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List educationAssignmentDefaults](../api/educationassignmentdefaults-list.md)|[educationAssignmentDefaults](../resources/educationassignmentdefaults.md) collection|Get a list of the [educationAssignmentDefaults](../resources/educationassignmentdefaults.md) objects and their properties.|
|[Create educationAssignmentDefaults](../api/educationassignmentdefaults-create.md)|[educationAssignmentDefaults](../resources/educationassignmentdefaults.md)|Create a new [educationAssignmentDefaults](../resources/educationassignmentdefaults.md) object.|
|[Get educationAssignmentDefaults](../api/educationassignmentdefaults-get.md)|[educationAssignmentDefaults](../resources/educationassignmentdefaults.md)|Read the properties and relationships of an [educationAssignmentDefaults](../resources/educationassignmentdefaults.md) object.|
|[Update educationAssignmentDefaults](../api/educationassignmentdefaults-update.md)|[educationAssignmentDefaults](../resources/educationassignmentdefaults.md)|Update the properties of an [educationAssignmentDefaults](../resources/educationassignmentdefaults.md) object.|
|[Delete educationAssignmentDefaults](../api/educationassignmentdefaults-delete.md)|None|Deletes an [educationAssignmentDefaults](../resources/educationassignmentdefaults.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|addedStudentAction|educationAddedStudentAction|**TODO: Add Description**. Possible values are: `none`, `assignIfOpen`, `unknownFutureValue`.|
|dueTime|TimeOfDay|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|notificationChannelUrl|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationAssignmentDefaults",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationAssignmentDefaults",
  "id": "String (identifier)",
  "addedStudentAction": "String",
  "dueTime": "String (time of day)",
  "notificationChannelUrl": "String"
}
```

