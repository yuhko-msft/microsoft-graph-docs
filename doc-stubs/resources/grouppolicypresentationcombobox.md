---
title: "groupPolicyPresentationComboBox resource type"
description: "Represents an ADMX comboBox element and an ADMX text element."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationComboBox resource type

Namespace: microsoft.graph



Represents an ADMX comboBox element and an ADMX text element.


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationComboBoxes](../api/grouppolicypresentationcombobox-list.md)|[groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) collection|Get a list of the [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) objects and their properties.|
|[Create groupPolicyPresentationComboBox](../api/grouppolicypresentationcombobox-create.md)|[groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md)|Create a new [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object.|
|[Get groupPolicyPresentationComboBox](../api/grouppolicypresentationcombobox-get.md)|[groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md)|Read the properties and relationships of a [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object.|
|[Update groupPolicyPresentationComboBox](../api/grouppolicypresentationcombobox-update.md)|[groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md)|Update the properties of a [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object.|
|[Delete groupPolicyPresentationComboBox](../api/grouppolicypresentationcombobox-delete.md)|None|Deletes a [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object.|
|[List groupPolicyDefinition](../api/grouppolicypresentationcombobox-list-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add groupPolicyDefinition](../api/grouppolicypresentationcombobox-post-definition.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Add definition by posting to the definition collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|String|Localized default string displayed in the combo box. The default value is empty.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|maxLength|Int64|An unsigned integer that specifies the maximum number of text characters for the parameter. The default value is 1023.|
|required|Boolean|Specifies whether a value must be specified for the parameter. The default value is false.|
|suggestions|String collection|Localized strings listed in the drop-down list of the combo box. The default value is empty.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|The group policy definition associated with the presentation. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyPresentationComboBox",
  "baseType": "microsoft.graph.groupPolicyPresentation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationComboBox",
  "id": "String (identifier)",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultValue": "String",
  "maxLength": "Integer",
  "required": "Boolean",
  "suggestions": [
    "String"
  ]
}
```

