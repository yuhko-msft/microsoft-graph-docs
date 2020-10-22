---
title: "groupPolicyPresentationValueLongDecimal resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValueLongDecimal resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValueLongDecimals](../api/intune-grouppolicypresentationvaluelongdecimal-list.md)|[groupPolicyPresentationValueLongDecimal](../resources/intune-grouppolicypresentationvaluelongdecimal.md) collection|Get a list of the [groupPolicyPresentationValueLongDecimal](../resources/grouppolicypresentationvaluelongdecimal.md) objects and their properties.|
|[Create groupPolicyPresentationValueLongDecimal](../api/intune-grouppolicypresentationvaluelongdecimal-create.md)|[groupPolicyPresentationValueLongDecimal](../resources/intune-grouppolicypresentationvaluelongdecimal.md)|Create a new [groupPolicyPresentationValueLongDecimal](../resources/intune-grouppolicypresentationvaluelongdecimal.md) object.|
|[Get groupPolicyPresentationValueLongDecimal](../api/intune-grouppolicypresentationvaluelongdecimal-get.md)|[groupPolicyPresentationValueLongDecimal](../resources/intune-grouppolicypresentationvaluelongdecimal.md)|Read the properties and relationships of a [groupPolicyPresentationValueLongDecimal](../resources/intune-grouppolicypresentationvaluelongdecimal.md) object.|
|[Update groupPolicyPresentationValueLongDecimal](../api/intune-grouppolicypresentationvaluelongdecimal-update.md)|[groupPolicyPresentationValueLongDecimal](../resources/intune-grouppolicypresentationvaluelongdecimal.md)|Update the properties of a [groupPolicyPresentationValueLongDecimal](../resources/intune-grouppolicypresentationvaluelongdecimal.md) object.|
|[Delete groupPolicyPresentationValueLongDecimal](../api/intune-grouppolicypresentationvaluelongdecimal-delete.md)|None|Deletes a [groupPolicyPresentationValueLongDecimal](../resources/intune-grouppolicypresentationvaluelongdecimal.md) object.|
|[List definitionValue](../api/intune-grouppolicypresentationvaluelongdecimal-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add definitionValue](../api/intune-grouppolicypresentationvaluelongdecimal-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[Remove definitionValue](../api/intune-grouppolicypresentationvaluelongdecimal-delete-definitionvalue.md)|None|Remove a [groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md) object.|
|[List presentation](../api/intune-grouppolicypresentationvaluelongdecimal-list-presentation.md)|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add presentation](../api/intune-grouppolicypresentationvaluelongdecimal-post-presentation.md)|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|
|[Remove presentation](../api/intune-grouppolicypresentationvaluelongdecimal-delete-presentation.md)|None|Remove a [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md) object.|

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
  "@odata.type": "microsoft.graph.groupPolicyPresentationValueLongDecimal",
  "baseType": "microsoft.graph.groupPolicyPresentationValue",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueLongDecimal",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "value": "Integer"
}
```

