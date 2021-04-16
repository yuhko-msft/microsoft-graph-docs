---
title: "groupPolicyPresentationValueMultiText resource type"
description: "The entity represents a string value of a multi-line text box presentation on a policy definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValueMultiText resource type

Namespace: microsoft.graph



The entity represents a string value of a multi-line text box presentation on a policy definition.


Inherits from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValueMultiTexts](../api/grouppolicypresentationvaluemultitext-list.md)|[groupPolicyPresentationValueMultiText](../resources/grouppolicypresentationvaluemultitext.md) collection|Get a list of the [groupPolicyPresentationValueMultiText](../resources/grouppolicypresentationvaluemultitext.md) objects and their properties.|
|[Create groupPolicyPresentationValueMultiText](../api/grouppolicypresentationvaluemultitext-create.md)|[groupPolicyPresentationValueMultiText](../resources/grouppolicypresentationvaluemultitext.md)|Create a new [groupPolicyPresentationValueMultiText](../resources/grouppolicypresentationvaluemultitext.md) object.|
|[Get groupPolicyPresentationValueMultiText](../api/grouppolicypresentationvaluemultitext-get.md)|[groupPolicyPresentationValueMultiText](../resources/grouppolicypresentationvaluemultitext.md)|Read the properties and relationships of a [groupPolicyPresentationValueMultiText](../resources/grouppolicypresentationvaluemultitext.md) object.|
|[Update groupPolicyPresentationValueMultiText](../api/grouppolicypresentationvaluemultitext-update.md)|[groupPolicyPresentationValueMultiText](../resources/grouppolicypresentationvaluemultitext.md)|Update the properties of a [groupPolicyPresentationValueMultiText](../resources/grouppolicypresentationvaluemultitext.md) object.|
|[Delete groupPolicyPresentationValueMultiText](../api/grouppolicypresentationvaluemultitext-delete.md)|None|Deletes a [groupPolicyPresentationValueMultiText](../resources/grouppolicypresentationvaluemultitext.md) object.|
|[List groupPolicyDefinitionValue](../api/grouppolicypresentationvaluemultitext-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add groupPolicyDefinitionValue](../api/grouppolicypresentationvaluemultitext-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[List groupPolicyPresentation](../api/grouppolicypresentationvaluemultitext-list-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add groupPolicyPresentation](../api/grouppolicypresentationvaluemultitext-post-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the object was created. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the object was last modified. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|values|String collection|A collection of non-empty strings for the associated presentation.|

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
  "@odata.type": "microsoft.graph.groupPolicyPresentationValueMultiText",
  "baseType": "microsoft.graph.groupPolicyPresentationValue",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueMultiText",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "values": [
    "String"
  ]
}
```

