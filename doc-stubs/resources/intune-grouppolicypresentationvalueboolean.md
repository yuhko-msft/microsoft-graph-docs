---
title: "groupPolicyPresentationValueBoolean resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValueBoolean resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValueBooleans](../api/intune-grouppolicypresentationvalueboolean-list.md)|[groupPolicyPresentationValueBoolean](../resources/intune-grouppolicypresentationvalueboolean.md) collection|Get a list of the [groupPolicyPresentationValueBoolean](../resources/grouppolicypresentationvalueboolean.md) objects and their properties.|
|[Create groupPolicyPresentationValueBoolean](../api/intune-grouppolicypresentationvalueboolean-create.md)|[groupPolicyPresentationValueBoolean](../resources/intune-grouppolicypresentationvalueboolean.md)|Create a new [groupPolicyPresentationValueBoolean](../resources/intune-grouppolicypresentationvalueboolean.md) object.|
|[Get groupPolicyPresentationValueBoolean](../api/intune-grouppolicypresentationvalueboolean-get.md)|[groupPolicyPresentationValueBoolean](../resources/intune-grouppolicypresentationvalueboolean.md)|Read the properties and relationships of a [groupPolicyPresentationValueBoolean](../resources/intune-grouppolicypresentationvalueboolean.md) object.|
|[Update groupPolicyPresentationValueBoolean](../api/intune-grouppolicypresentationvalueboolean-update.md)|[groupPolicyPresentationValueBoolean](../resources/intune-grouppolicypresentationvalueboolean.md)|Update the properties of a [groupPolicyPresentationValueBoolean](../resources/intune-grouppolicypresentationvalueboolean.md) object.|
|[Delete groupPolicyPresentationValueBoolean](../api/intune-grouppolicypresentationvalueboolean-delete.md)|None|Deletes a [groupPolicyPresentationValueBoolean](../resources/intune-grouppolicypresentationvalueboolean.md) object.|
|[List definitionValue](../api/intune-grouppolicypresentationvalueboolean-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add definitionValue](../api/intune-grouppolicypresentationvalueboolean-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[Remove definitionValue](../api/intune-grouppolicypresentationvalueboolean-delete-definitionvalue.md)|None|Remove a [groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md) object.|
|[List presentation](../api/intune-grouppolicypresentationvalueboolean-list-presentation.md)|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add presentation](../api/intune-grouppolicypresentationvalueboolean-post-presentation.md)|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|
|[Remove presentation](../api/intune-grouppolicypresentationvalueboolean-delete-presentation.md)|None|Remove a [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/intune-grouppolicypresentationvalue.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/intune-grouppolicypresentationvalue.md)|
|value|Boolean|**TODO: Add Description**|

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
  "@odata.type": "microsoft.graph.groupPolicyPresentationValueBoolean",
  "baseType": "microsoft.graph.groupPolicyPresentationValue",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueBoolean",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "value": "Boolean"
}
```

