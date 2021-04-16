---
title: "groupPolicyPresentationValueList resource type"
description: "The entity represents a collection of name/value pairs of a list box presentation on a policy definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValueList resource type

Namespace: microsoft.graph



The entity represents a collection of name/value pairs of a list box presentation on a policy definition.


Inherits from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValueLists](../api/grouppolicypresentationvaluelist-list.md)|[groupPolicyPresentationValueList](../resources/grouppolicypresentationvaluelist.md) collection|Get a list of the [groupPolicyPresentationValueList](../resources/grouppolicypresentationvaluelist.md) objects and their properties.|
|[Create groupPolicyPresentationValueList](../api/grouppolicypresentationvaluelist-create.md)|[groupPolicyPresentationValueList](../resources/grouppolicypresentationvaluelist.md)|Create a new [groupPolicyPresentationValueList](../resources/grouppolicypresentationvaluelist.md) object.|
|[Get groupPolicyPresentationValueList](../api/grouppolicypresentationvaluelist-get.md)|[groupPolicyPresentationValueList](../resources/grouppolicypresentationvaluelist.md)|Read the properties and relationships of a [groupPolicyPresentationValueList](../resources/grouppolicypresentationvaluelist.md) object.|
|[Update groupPolicyPresentationValueList](../api/grouppolicypresentationvaluelist-update.md)|[groupPolicyPresentationValueList](../resources/grouppolicypresentationvaluelist.md)|Update the properties of a [groupPolicyPresentationValueList](../resources/grouppolicypresentationvaluelist.md) object.|
|[Delete groupPolicyPresentationValueList](../api/grouppolicypresentationvaluelist-delete.md)|None|Deletes a [groupPolicyPresentationValueList](../resources/grouppolicypresentationvaluelist.md) object.|
|[List groupPolicyDefinitionValue](../api/grouppolicypresentationvaluelist-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add groupPolicyDefinitionValue](../api/grouppolicypresentationvaluelist-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[List groupPolicyPresentation](../api/grouppolicypresentationvaluelist-list-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add groupPolicyPresentation](../api/grouppolicypresentationvaluelist-post-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the object was created. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the object was last modified. Inherited from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|
|values|[keyValuePair](../resources/keyvaluepair.md) collection|A list of pairs for the associated presentation.|

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
  "@odata.type": "microsoft.graph.groupPolicyPresentationValueList",
  "baseType": "microsoft.graph.groupPolicyPresentationValue",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueList",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "values": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
}
```

