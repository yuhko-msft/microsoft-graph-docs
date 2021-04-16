---
title: "groupPolicyPresentationTextBox resource type"
description: "Represents an ADMX textBox element and an ADMX text element."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationTextBox resource type

Namespace: microsoft.graph



Represents an ADMX textBox element and an ADMX text element.


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationTextBoxes](../api/grouppolicypresentationtextbox-list.md)|[groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) collection|Get a list of the [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) objects and their properties.|
|[Create groupPolicyPresentationTextBox](../api/grouppolicypresentationtextbox-create.md)|[groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md)|Create a new [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object.|
|[Get groupPolicyPresentationTextBox](../api/grouppolicypresentationtextbox-get.md)|[groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md)|Read the properties and relationships of a [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object.|
|[Update groupPolicyPresentationTextBox](../api/grouppolicypresentationtextbox-update.md)|[groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md)|Update the properties of a [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object.|
|[Delete groupPolicyPresentationTextBox](../api/grouppolicypresentationtextbox-delete.md)|None|Deletes a [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object.|
|[List groupPolicyDefinition](../api/grouppolicypresentationtextbox-list-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add groupPolicyDefinition](../api/grouppolicypresentationtextbox-post-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Add definition by posting to the definition collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|String|Localized default string displayed in the text box. The default value is empty.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|maxLength|Int64|An unsigned integer that specifies the maximum number of text characters. Default value is 1023.|
|required|Boolean|Requirement to enter a value in the text box. Default value is false.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|The group policy definition associated with the presentation. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyPresentationTextBox",
  "baseType": "microsoft.graph.groupPolicyPresentation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationTextBox",
  "id": "String (identifier)",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultValue": "String",
  "maxLength": "Integer",
  "required": "Boolean"
}
```

