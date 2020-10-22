---
title: "groupPolicyPresentationValueList resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationValueList resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentationValue](../resources/grouppolicypresentationvalue.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationValueLists](../api/intune-grouppolicypresentationvaluelist-list.md)|[groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md) collection|Get a list of the [groupPolicyPresentationValueList](../resources/grouppolicypresentationvaluelist.md) objects and their properties.|
|[Create groupPolicyPresentationValueList](../api/intune-grouppolicypresentationvaluelist-create.md)|[groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md)|Create a new [groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md) object.|
|[Get groupPolicyPresentationValueList](../api/intune-grouppolicypresentationvaluelist-get.md)|[groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md)|Read the properties and relationships of a [groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md) object.|
|[Update groupPolicyPresentationValueList](../api/intune-grouppolicypresentationvaluelist-update.md)|[groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md)|Update the properties of a [groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md) object.|
|[Delete groupPolicyPresentationValueList](../api/intune-grouppolicypresentationvaluelist-delete.md)|None|Deletes a [groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md) object.|
|[List definitionValue](../api/intune-grouppolicypresentationvaluelist-list-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md) collection|Get the groupPolicyDefinitionValue resources from the definitionValue navigation property.|
|[Add definitionValue](../api/intune-grouppolicypresentationvaluelist-post-definitionvalue.md)|[groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md)|Add definitionValue by posting to the definitionValue collection.|
|[Remove definitionValue](../api/intune-grouppolicypresentationvaluelist-delete-definitionvalue.md)|None|Remove a [groupPolicyDefinitionValue](../resources/intune-grouppolicydefinitionvalue.md) object.|
|[List presentation](../api/intune-grouppolicypresentationvaluelist-list-presentation.md)|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md) collection|Get the groupPolicyPresentation resources from the presentation navigation property.|
|[Add presentation](../api/intune-grouppolicypresentationvaluelist-post-presentation.md)|[groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|Add presentation by posting to the presentation collection.|
|[Remove presentation](../api/intune-grouppolicypresentationvaluelist-delete-presentation.md)|None|Remove a [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/intune-grouppolicypresentationvalue.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/intune-grouppolicypresentationvalue.md)|
|values|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|

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
  "@odata.type": "microsoft.graph.groupPolicyPresentationValueList",
  "baseType": "microsoft.graph.groupPolicyPresentationValue",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueList",
  "id": "String (identifier)",
  "lastModifiedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "values": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
}
```

