---
title: "groupPolicyPresentationMultiTextBox resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationMultiTextBox resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationMultiTextBoxes](../api/grouppolicypresentationmultitextbox-list.md)|[groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) collection|Get a list of the [groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) objects and their properties.|
|[Create groupPolicyPresentationMultiTextBox](../api/grouppolicypresentationmultitextbox-create.md)|[groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md)|Create a new [groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) object.|
|[Get groupPolicyPresentationMultiTextBox](../api/grouppolicypresentationmultitextbox-get.md)|[groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md)|Read the properties and relationships of a [groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) object.|
|[Update groupPolicyPresentationMultiTextBox](../api/grouppolicypresentationmultitextbox-update.md)|[groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md)|Update the properties of a [groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) object.|
|[Delete groupPolicyPresentationMultiTextBox](../api/grouppolicypresentationmultitextbox-delete.md)|None|Deletes a [groupPolicyPresentationMultiTextBox](../resources/grouppolicypresentationmultitextbox.md) object.|
|[List definition](../api/grouppolicypresentationmultitextbox-list-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add definition](../api/grouppolicypresentationmultitextbox-post-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|Add definition by posting to the definition collection.|
|[Remove definition](../api/grouppolicypresentationmultitextbox-delete-definition.md)|None|Remove a [groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|maxLength|Int64|**TODO: Add Description**|
|maxStrings|Int64|**TODO: Add Description**|
|required|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

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
  "required": "Boolean",
  "maxLength": "Integer",
  "maxStrings": "Integer"
}
```

