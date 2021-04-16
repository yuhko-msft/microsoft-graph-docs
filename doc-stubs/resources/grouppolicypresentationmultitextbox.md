---
title: "groupPolicyPresentationMultiTextBox resource type"
description: "Represents an ADMX multiTextBox element and an ADMX multiText element."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationMultiTextBox resource type

Namespace: microsoft.graph



Represents an ADMX multiTextBox element and an ADMX multiText element.


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationMultiTextBoxes](../api/grouppolicypresentationmultitextbox-list.md)|[groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) collection|Get a list of the [groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) objects and their properties.|
|[Create groupPolicyPresentationMultiTextBox](../api/grouppolicypresentationmultitextbox-create.md)|[groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md)|Create a new [groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) object.|
|[Get groupPolicyPresentationMultiTextBox](../api/grouppolicypresentationmultitextbox-get.md)|[groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md)|Read the properties and relationships of a [groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) object.|
|[Update groupPolicyPresentationMultiTextBox](../api/grouppolicypresentationmultitextbox-update.md)|[groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md)|Update the properties of a [groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) object.|
|[Delete groupPolicyPresentationMultiTextBox](../api/grouppolicypresentationmultitextbox-delete.md)|None|Deletes a [groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) object.|
|[List groupPolicyDefinition](../api/grouppolicypresentationmultitextbox-list-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add groupPolicyDefinition](../api/grouppolicypresentationmultitextbox-post-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Add definition by posting to the definition collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|maxLength|Int64|An unsigned integer that specifies the maximum number of text characters. Default value is 1023.|
|maxStrings|Int64|An unsigned integer that specifies the maximum number of strings. Default value is 0.|
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
  "@odata.type": "microsoft.graph.groupPolicyPresentationMultiTextBox",
  "baseType": "microsoft.graph.groupPolicyPresentation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationMultiTextBox",
  "id": "String (identifier)",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "maxLength": "Integer",
  "maxStrings": "Integer",
  "required": "Boolean"
}
```

