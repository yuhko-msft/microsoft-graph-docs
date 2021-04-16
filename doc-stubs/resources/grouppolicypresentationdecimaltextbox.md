---
title: "groupPolicyPresentationDecimalTextBox resource type"
description: "Represents an ADMX decimalTextBox element and an ADMX decimal element."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationDecimalTextBox resource type

Namespace: microsoft.graph



Represents an ADMX decimalTextBox element and an ADMX decimal element.


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationDecimalTextBoxes](../api/grouppolicypresentationdecimaltextbox-list.md)|[groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) collection|Get a list of the [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) objects and their properties.|
|[Create groupPolicyPresentationDecimalTextBox](../api/grouppolicypresentationdecimaltextbox-create.md)|[groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md)|Create a new [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object.|
|[Get groupPolicyPresentationDecimalTextBox](../api/grouppolicypresentationdecimaltextbox-get.md)|[groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md)|Read the properties and relationships of a [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object.|
|[Update groupPolicyPresentationDecimalTextBox](../api/grouppolicypresentationdecimaltextbox-update.md)|[groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md)|Update the properties of a [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object.|
|[Delete groupPolicyPresentationDecimalTextBox](../api/grouppolicypresentationdecimaltextbox-delete.md)|None|Deletes a [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object.|
|[List groupPolicyDefinition](../api/grouppolicypresentationdecimaltextbox-list-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add groupPolicyDefinition](../api/grouppolicypresentationdecimaltextbox-post-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Add definition by posting to the definition collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|Int64|An unsigned integer that specifies the initial value for the decimal text box. The default value is 1.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|maxValue|Int64|An unsigned integer that specifies the maximum allowed value. The default value is 9999.|
|minValue|Int64|An unsigned integer that specifies the minimum allowed value. The default value is 0.|
|required|Boolean|Requirement to enter a value in the parameter box. The default value is false.|
|spin|Boolean|If true, create a spin control; otherwise, create a text box for numeric entry. The default value is true.|
|spinStep|Int64|An unsigned integer that specifies the increment of change for the spin control. The default value is 1.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|The group policy definition associated with the presentation. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyPresentationDecimalTextBox",
  "baseType": "microsoft.graph.groupPolicyPresentation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationDecimalTextBox",
  "id": "String (identifier)",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultValue": "Integer",
  "maxValue": "Integer",
  "minValue": "Integer",
  "required": "Boolean",
  "spin": "Boolean",
  "spinStep": "Integer"
}
```

