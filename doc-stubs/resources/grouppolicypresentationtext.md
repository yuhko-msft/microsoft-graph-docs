---
title: "groupPolicyPresentationText resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationText resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationTexts](../api/grouppolicypresentationtext-list.md)|[groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) collection|Get a list of the [groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) objects and their properties.|
|[Create groupPolicyPresentationText](../api/grouppolicypresentationtext-create.md)|[groupPolicyPresentationText](../resources/grouppolicypresentationtext.md)|Create a new [groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) object.|
|[Get groupPolicyPresentationText](../api/grouppolicypresentationtext-get.md)|[groupPolicyPresentationText](../resources/grouppolicypresentationtext.md)|Read the properties and relationships of a [groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) object.|
|[Update groupPolicyPresentationText](../api/grouppolicypresentationtext-update.md)|[groupPolicyPresentationText](../resources/grouppolicypresentationtext.md)|Update the properties of a [groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) object.|
|[Delete groupPolicyPresentationText](../api/grouppolicypresentationtext-delete.md)|None|Deletes a [groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) object.|
|[List definition](../api/grouppolicypresentationtext-list-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add definition](../api/grouppolicypresentationtext-post-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|Add definition by posting to the definition collection.|
|[Remove definition](../api/grouppolicypresentationtext-delete-definition.md)|None|Remove a [groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyPresentationText",
  "baseType": "microsoft.graph.groupPolicyPresentation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationText",
  "id": "String (identifier)",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

