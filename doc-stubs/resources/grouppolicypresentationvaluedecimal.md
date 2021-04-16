---
title: "groupPolicyPresentationValueDecimal resource type"
description: "The entity represents an unsigned integer value of a decimal text box presentation on a policy definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValueDecimal resource type

Namespace: microsoft.graph



The entity represents an unsigned integer value of a decimal text box presentation on a policy definition.


Inherits from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValueDecimals](../api/grouppolicypresentationvaluedecimal-list.md)|[groupPolicyPresentationValueDecimal](../resources/grouppolicypresentationvaluedecimal.md) collection|Get a list of the [groupPolicyPresentationValueDecimal](../resources/grouppolicypresentationvaluedecimal.md) objects and their properties.|
|[Create groupPolicyPresentationValueDecimal](../api/grouppolicypresentationvaluedecimal-create.md)|[groupPolicyPresentationValueDecimal](../resources/grouppolicypresentationvaluedecimal.md)|Create a new [groupPolicyPresentationValueDecimal](../resources/grouppolicypresentationvaluedecimal.md) object.|
|[Get groupPolicyPresentationValueDecimal](../api/grouppolicypresentationvaluedecimal-get.md)|[groupPolicyPresentationValueDecimal](../resources/grouppolicypresentationvaluedecimal.md)|Read the properties and relationships of a [groupPolicyPresentationValueDecimal](../resources/grouppolicypresentationvaluedecimal.md) object.|
|[Update groupPolicyPresentationValueDecimal](../api/grouppolicypresentationvaluedecimal-update.md)|[groupPolicyPresentationValueDecimal](../resources/grouppolicypresentationvaluedecimal.md)|Update the properties of a [groupPolicyPresentationValueDecimal](../resources/grouppolicypresentationvaluedecimal.md) object.|
|[Delete groupPolicyPresentationValueDecimal](../api/grouppolicypresentationvaluedecimal-delete.md)|None|Deletes a [groupPolicyPresentationValueDecimal](../resources/grouppolicypresentationvaluedecimal.md) object.|
|[List groupPolicyDefinitionValue](../api/grouppolicypresentationvaluedecimal-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add groupPolicyDefinitionValue](../api/grouppolicypresentationvaluedecimal-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[List groupPolicyPresentation](../api/grouppolicypresentationvaluedecimal-list-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add groupPolicyPresentation](../api/grouppolicypresentationvaluedecimal-post-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the object was created. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the object was last modified. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|value|Int64|An unsigned integer value for the associated presentation.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definitionValue|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md)|The group policy definition value associated with the presentation value. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|presentation|[groupPolicyPresentation](../resources/grouppolicypresentation.md)|The group policy presentation associated with the presentation value. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|

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
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "value": "Integer"
}
```

