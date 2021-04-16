---
title: "outlookTaskFolder resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# outlookTaskFolder resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List outlookTaskFolders](../api/outlooktaskfolder-list.md)|[outlookTaskFolder](../resources/outlooktaskfolder.md) collection|Get a list of the [outlookTaskFolder](../resources/outlooktaskfolder.md) objects and their properties.|
|[Create outlookTaskFolder](../api/outlooktaskfolder-create.md)|[outlookTaskFolder](../resources/outlooktaskfolder.md)|Create a new [outlookTaskFolder](../resources/outlooktaskfolder.md) object.|
|[Get outlookTaskFolder](../api/outlooktaskfolder-get.md)|[outlookTaskFolder](../resources/outlooktaskfolder.md)|Read the properties and relationships of an [outlookTaskFolder](../resources/outlooktaskfolder.md) object.|
|[Update outlookTaskFolder](../api/outlooktaskfolder-update.md)|[outlookTaskFolder](../resources/outlooktaskfolder.md)|Update the properties of an [outlookTaskFolder](../resources/outlooktaskfolder.md) object.|
|[Delete outlookTaskFolder](../api/outlooktaskfolder-delete.md)|None|Deletes an [outlookTaskFolder](../resources/outlooktaskfolder.md) object.|
|[List multiValueExtendedProperties](../api/outlooktaskfolder-list-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|Get the multiValueLegacyExtendedProperty resources from the multiValueExtendedProperties navigation property.|
|[Create multiValueLegacyExtendedProperty](../api/outlooktaskfolder-post-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md)|Create a new multiValueLegacyExtendedProperty object.|
|[List singleValueExtendedProperties](../api/outlooktaskfolder-list-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|Get the singleValueLegacyExtendedProperty resources from the singleValueExtendedProperties navigation property.|
|[Create singleValueLegacyExtendedProperty](../api/outlooktaskfolder-post-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md)|Create a new singleValueLegacyExtendedProperty object.|
|[List tasks](../api/outlooktaskfolder-list-tasks.md)|[outlookTask](../resources/outlooktask.md) collection|Get the outlookTask resources from the tasks navigation property.|
|[Create outlookTask](../api/outlooktaskfolder-post-tasks.md)|[outlookTask](../resources/outlooktask.md)|Create a new outlookTask object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|changeKey|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDefaultFolder|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|parentGroupKey|Guid|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description**|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description**|
|tasks|[outlookTask](../resources/outlooktask.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookTaskFolder",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.outlookTaskFolder",
  "id": "String (identifier)",
  "changeKey": "String",
  "isDefaultFolder": "Boolean",
  "name": "String",
  "parentGroupKey": "Guid"
}
```

