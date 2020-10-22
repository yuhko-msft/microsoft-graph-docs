---
title: "groupPolicyPresentationValueText resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValueText resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValueTexts](../api/intune-grouppolicypresentationvaluetext-list.md)|[groupPolicyPresentationValueText](../resources/intune-grouppolicypresentationvaluetext.md) collection|Get a list of the [groupPolicyPresentationValueText](../resources/grouppolicypresentationvaluetext.md) objects and their properties.|
|[Create groupPolicyPresentationValueText](../api/intune-grouppolicypresentationvaluetext-create.md)|[groupPolicyPresentationValueText](../resources/intune-grouppolicypresentationvaluetext.md)|Create a new [groupPolicyPresentationValueText](../resources/intune-grouppolicypresentationvaluetext.md) object.|
|[Get groupPolicyPresentationValueText](../api/intune-grouppolicypresentationvaluetext-get.md)|[groupPolicyPresentationValueText](../resources/intune-grouppolicypresentationvaluetext.md)|Read the properties and relationships of a [groupPolicyPresentationValueText](../resources/intune-grouppolicypresentationvaluetext.md) object.|
|[Update groupPolicyPresentationValueText](../api/intune-grouppolicypresentationvaluetext-update.md)|[groupPolicyPresentationValueText](../resources/intune-grouppolicypresentationvaluetext.md)|Update the properties of a [groupPolicyPresentationValueText](../resources/intune-grouppolicypresentationvaluetext.md) object.|
|[Delete groupPolicyPresentationValueText](../api/intune-grouppolicypresentationvaluetext-delete.md)|None|Deletes a [groupPolicyPresentationValueText](../resources/intune-grouppolicypresentationvaluetext.md) object.|
|[List definitionValue](../api/intune-grouppolicypresentationvaluetext-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add definitionValue](../api/intune-grouppolicypresentationvaluetext-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[Remove definitionValue](../api/intune-grouppolicypresentationvaluetext-delete-definitionvalue.md)|None|Remove a [groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md) object.|
|[List presentation](../api/intune-grouppolicypresentationvaluetext-list-presentation.md)|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add presentation](../api/intune-grouppolicypresentationvaluetext-post-presentation.md)|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|
|[Remove presentation](../api/intune-grouppolicypresentationvaluetext-delete-presentation.md)|None|Remove a [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/intune-grouppolicypresentationvalue.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/intune-grouppolicypresentationvalue.md)|
|value|String|**TODO: Add Description**|

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
  "@odata.type": "microsoft.graph.groupPolicyPresentationValueText",
  "baseType": "microsoft.graph.groupPolicyPresentationValue",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueText",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "value": "String"
}
```

