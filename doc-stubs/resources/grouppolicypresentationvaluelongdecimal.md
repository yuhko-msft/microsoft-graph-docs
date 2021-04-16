---
title: "groupPolicyPresentationValueLongDecimal resource type"
description: "The entity represents an unsigned long value of a long decimal text box presentation on a policy definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValueLongDecimal resource type

Namespace: microsoft.graph



The entity represents an unsigned long value of a long decimal text box presentation on a policy definition.


Inherits from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValueLongDecimals](../api/grouppolicypresentationvaluelongdecimal-list.md)|[groupPolicyPresentationValueLongDecimal](../resources/grouppolicypresentationvaluelongdecimal.md) collection|Get a list of the [groupPolicyPresentationValueLongDecimal](../resources/grouppolicypresentationvaluelongdecimal.md) objects and their properties.|
|[Create groupPolicyPresentationValueLongDecimal](../api/grouppolicypresentationvaluelongdecimal-create.md)|[groupPolicyPresentationValueLongDecimal](../resources/grouppolicypresentationvaluelongdecimal.md)|Create a new [groupPolicyPresentationValueLongDecimal](../resources/grouppolicypresentationvaluelongdecimal.md) object.|
|[Get groupPolicyPresentationValueLongDecimal](../api/grouppolicypresentationvaluelongdecimal-get.md)|[groupPolicyPresentationValueLongDecimal](../resources/grouppolicypresentationvaluelongdecimal.md)|Read the properties and relationships of a [groupPolicyPresentationValueLongDecimal](../resources/grouppolicypresentationvaluelongdecimal.md) object.|
|[Update groupPolicyPresentationValueLongDecimal](../api/grouppolicypresentationvaluelongdecimal-update.md)|[groupPolicyPresentationValueLongDecimal](../resources/grouppolicypresentationvaluelongdecimal.md)|Update the properties of a [groupPolicyPresentationValueLongDecimal](../resources/grouppolicypresentationvaluelongdecimal.md) object.|
|[Delete groupPolicyPresentationValueLongDecimal](../api/grouppolicypresentationvaluelongdecimal-delete.md)|None|Deletes a [groupPolicyPresentationValueLongDecimal](../resources/grouppolicypresentationvaluelongdecimal.md) object.|
|[List groupPolicyDefinitionValue](../api/grouppolicypresentationvaluelongdecimal-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add groupPolicyDefinitionValue](../api/grouppolicypresentationvaluelongdecimal-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[List groupPolicyPresentation](../api/grouppolicypresentationvaluelongdecimal-list-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add groupPolicyPresentation](../api/grouppolicypresentationvaluelongdecimal-post-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the object was created. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the object was last modified. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|value|Int64|An unsigned long value for the associated presentation.|

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
  "@odata.type": "microsoft.graph.groupPolicyPresentationValueLongDecimal",
  "baseType": "microsoft.graph.groupPolicyPresentationValue",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueLongDecimal",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "value": "Integer"
}
```

