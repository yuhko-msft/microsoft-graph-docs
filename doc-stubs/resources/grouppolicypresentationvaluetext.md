---
title: "groupPolicyPresentationValueText resource type"
description: "The entity represents a string value for a drop-down list, combo box, or text box presentation on a policy definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValueText resource type

Namespace: microsoft.graph



The entity represents a string value for a drop-down list, combo box, or text box presentation on a policy definition.


Inherits from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValueTexts](../api/grouppolicypresentationvaluetext-list.md)|[groupPolicyPresentationValueText](../resources/grouppolicypresentationvaluetext.md) collection|Get a list of the [groupPolicyPresentationValueText](../resources/grouppolicypresentationvaluetext.md) objects and their properties.|
|[Create groupPolicyPresentationValueText](../api/grouppolicypresentationvaluetext-create.md)|[groupPolicyPresentationValueText](../resources/grouppolicypresentationvaluetext.md)|Create a new [groupPolicyPresentationValueText](../resources/grouppolicypresentationvaluetext.md) object.|
|[Get groupPolicyPresentationValueText](../api/grouppolicypresentationvaluetext-get.md)|[groupPolicyPresentationValueText](../resources/grouppolicypresentationvaluetext.md)|Read the properties and relationships of a [groupPolicyPresentationValueText](../resources/grouppolicypresentationvaluetext.md) object.|
|[Update groupPolicyPresentationValueText](../api/grouppolicypresentationvaluetext-update.md)|[groupPolicyPresentationValueText](../resources/grouppolicypresentationvaluetext.md)|Update the properties of a [groupPolicyPresentationValueText](../resources/grouppolicypresentationvaluetext.md) object.|
|[Delete groupPolicyPresentationValueText](../api/grouppolicypresentationvaluetext-delete.md)|None|Deletes a [groupPolicyPresentationValueText](../resources/grouppolicypresentationvaluetext.md) object.|
|[List groupPolicyDefinitionValue](../api/grouppolicypresentationvaluetext-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add groupPolicyDefinitionValue](../api/grouppolicypresentationvaluetext-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[List groupPolicyPresentation](../api/grouppolicypresentationvaluetext-list-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add groupPolicyPresentation](../api/grouppolicypresentationvaluetext-post-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the object was created. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the object was last modified. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|value|String|A string value for the associated presentation.|

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
  "@odata.type": "microsoft.graph.groupPolicyPresentationValueText",
  "baseType": "microsoft.graph.groupPolicyPresentationValue",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueText",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "value": "String"
}
```

