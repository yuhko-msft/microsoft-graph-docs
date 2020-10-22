---
title: "groupPolicyPresentationValueDecimal resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValueDecimal resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValueDecimals](../api/intune-grouppolicypresentationvaluedecimal-list.md)|[groupPolicyPresentationValueDecimal](../resources/intune-grouppolicypresentationvaluedecimal.md) collection|Get a list of the [groupPolicyPresentationValueDecimal](../resources/grouppolicypresentationvaluedecimal.md) objects and their properties.|
|[Create groupPolicyPresentationValueDecimal](../api/intune-grouppolicypresentationvaluedecimal-create.md)|[groupPolicyPresentationValueDecimal](../resources/intune-grouppolicypresentationvaluedecimal.md)|Create a new [groupPolicyPresentationValueDecimal](../resources/intune-grouppolicypresentationvaluedecimal.md) object.|
|[Get groupPolicyPresentationValueDecimal](../api/intune-grouppolicypresentationvaluedecimal-get.md)|[groupPolicyPresentationValueDecimal](../resources/intune-grouppolicypresentationvaluedecimal.md)|Read the properties and relationships of a [groupPolicyPresentationValueDecimal](../resources/intune-grouppolicypresentationvaluedecimal.md) object.|
|[Update groupPolicyPresentationValueDecimal](../api/intune-grouppolicypresentationvaluedecimal-update.md)|[groupPolicyPresentationValueDecimal](../resources/intune-grouppolicypresentationvaluedecimal.md)|Update the properties of a [groupPolicyPresentationValueDecimal](../resources/intune-grouppolicypresentationvaluedecimal.md) object.|
|[Delete groupPolicyPresentationValueDecimal](../api/intune-grouppolicypresentationvaluedecimal-delete.md)|None|Deletes a [groupPolicyPresentationValueDecimal](../resources/intune-grouppolicypresentationvaluedecimal.md) object.|
|[List definitionValue](../api/intune-grouppolicypresentationvaluedecimal-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add definitionValue](../api/intune-grouppolicypresentationvaluedecimal-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[Remove definitionValue](../api/intune-grouppolicypresentationvaluedecimal-delete-definitionvalue.md)|None|Remove a [groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md) object.|
|[List presentation](../api/intune-grouppolicypresentationvaluedecimal-list-presentation.md)|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add presentation](../api/intune-grouppolicypresentationvaluedecimal-post-presentation.md)|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|
|[Remove presentation](../api/intune-grouppolicypresentationvaluedecimal-delete-presentation.md)|None|Remove a [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/intune-grouppolicypresentationvalue.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/intune-grouppolicypresentationvalue.md)|
|value|Int64|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definitionValue|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md)|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|presentation|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyPresentationValueDecimal",
  "baseType": "microsoft.graph.groupPolicyPresentationValue",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueDecimal",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "value": "Integer"
}
```

