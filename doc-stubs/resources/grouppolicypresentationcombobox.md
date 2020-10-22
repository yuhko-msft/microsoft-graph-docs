---
title: "groupPolicyPresentationComboBox resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationComboBox resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationComboBoxes](../api/grouppolicypresentationcombobox-list.md)|[groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) collection|Get a list of the [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) objects and their properties.|
|[Create groupPolicyPresentationComboBox](../api/grouppolicypresentationcombobox-create.md)|[groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md)|Create a new [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object.|
|[Get groupPolicyPresentationComboBox](../api/grouppolicypresentationcombobox-get.md)|[groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md)|Read the properties and relationships of a [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object.|
|[Update groupPolicyPresentationComboBox](../api/grouppolicypresentationcombobox-update.md)|[groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md)|Update the properties of a [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object.|
|[Delete groupPolicyPresentationComboBox](../api/grouppolicypresentationcombobox-delete.md)|None|Deletes a [groupPolicyPresentationComboBox](../resources/grouppolicypresentationcombobox.md) object.|
|[List definition](../api/grouppolicypresentationcombobox-list-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add definition](../api/grouppolicypresentationcombobox-post-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|Add definition by posting to the definition collection.|
|[Remove definition](../api/grouppolicypresentationcombobox-delete-definition.md)|None|Remove a [groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|maxLength|Int64|**TODO: Add Description**|
|required|Boolean|**TODO: Add Description**|
|suggestions|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

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
  "suggestions": [
    "String"
  ],
  "required": "Boolean",
  "maxLength": "Integer"
}
```

