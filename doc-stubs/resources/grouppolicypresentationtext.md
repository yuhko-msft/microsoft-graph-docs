---
title: "groupPolicyPresentationText resource type"
description: "Represents an ADMX text element."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationText resource type

Namespace: microsoft.graph



Represents an ADMX text element.


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationTexts](../api/grouppolicypresentationtext-list.md)|[groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) collection|Get a list of the [groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) objects and their properties.|
|[Create groupPolicyPresentationText](../api/grouppolicypresentationtext-create.md)|[groupPolicyPresentationText](../resources/grouppolicypresentationtext.md)|Create a new [groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) object.|
|[Get groupPolicyPresentationText](../api/grouppolicypresentationtext-get.md)|[groupPolicyPresentationText](../resources/grouppolicypresentationtext.md)|Read the properties and relationships of a [groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) object.|
|[Update groupPolicyPresentationText](../api/grouppolicypresentationtext-update.md)|[groupPolicyPresentationText](../resources/grouppolicypresentationtext.md)|Update the properties of a [groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) object.|
|[Delete groupPolicyPresentationText](../api/grouppolicypresentationtext-delete.md)|None|Deletes a [groupPolicyPresentationText](../resources/grouppolicypresentationtext.md) object.|
|[List groupPolicyDefinition](../api/grouppolicypresentationtext-list-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add groupPolicyDefinition](../api/grouppolicypresentationtext-post-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Add definition by posting to the definition collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|The group policy definition associated with the presentation. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

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

