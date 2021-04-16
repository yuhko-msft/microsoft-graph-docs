---
title: "groupPolicyPresentationValue resource type"
description: "The base presentation value entity that stores the value for a single group policy presentation."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValue resource type

Namespace: microsoft.graph



The base presentation value entity that stores the value for a single group policy presentation.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValues](../api/grouppolicypresentationvalue-list.md)|[groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md) collection|Get a list of the [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md) objects and their properties.|
|[Create groupPolicyPresentationValue](../api/grouppolicypresentationvalue-create.md)|[groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|Create a new [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md) object.|
|[Get groupPolicyPresentationValue](../api/grouppolicypresentationvalue-get.md)|[groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|Read the properties and relationships of a [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md) object.|
|[Update groupPolicyPresentationValue](../api/grouppolicypresentationvalue-update.md)|[groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md)|Update the properties of a [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md) object.|
|[Delete groupPolicyPresentationValue](../api/grouppolicypresentationvalue-delete.md)|None|Deletes a [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md) object.|
|[List groupPolicyDefinitionValue](../api/grouppolicypresentationvalue-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add groupPolicyDefinitionValue](../api/grouppolicypresentationvalue-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[List groupPolicyPresentation](../api/grouppolicypresentationvalue-list-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add groupPolicyPresentation](../api/grouppolicypresentationvalue-post-presentation.md)|[groupPolicyPresentation](../resources/grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the object was created.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the object was last modified.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definitionValue|[groupPolicyDefinitionValue](../resources/grouppolicydefinitionvalue.md)|The group policy definition value associated with the presentation value.|
|presentation|[groupPolicyPresentation](../resources/grouppolicypresentation.md)|The group policy presentation associated with the presentation value.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyPresentationValue",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValue",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)"
}
```

