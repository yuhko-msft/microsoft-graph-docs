---
title: "groupPolicyPresentationTextBox resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationTextBox resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationTextBoxes](../api/grouppolicypresentationtextbox-list.md)|[groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) collection|Get a list of the [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) objects and their properties.|
|[Create groupPolicyPresentationTextBox](../api/grouppolicypresentationtextbox-create.md)|[groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md)|Create a new [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object.|
|[Get groupPolicyPresentationTextBox](../api/grouppolicypresentationtextbox-get.md)|[groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md)|Read the properties and relationships of a [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object.|
|[Update groupPolicyPresentationTextBox](../api/grouppolicypresentationtextbox-update.md)|[groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md)|Update the properties of a [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object.|
|[Delete groupPolicyPresentationTextBox](../api/grouppolicypresentationtextbox-delete.md)|None|Deletes a [groupPolicyPresentationTextBox](../resources/grouppolicypresentationtextbox.md) object.|
|[List definition](../api/grouppolicypresentationtextbox-list-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add definition](../api/grouppolicypresentationtextbox-post-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|Add definition by posting to the definition collection.|
|[Remove definition](../api/grouppolicypresentationtextbox-delete-definition.md)|None|Remove a [groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|maxLength|Int64|**TODO: Add Description**|
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
  "required": "Boolean",
  "maxLength": "Integer"
}
```

