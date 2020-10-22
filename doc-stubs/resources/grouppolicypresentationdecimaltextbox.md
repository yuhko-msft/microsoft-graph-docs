---
title: "groupPolicyPresentationDecimalTextBox resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationDecimalTextBox resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationDecimalTextBoxes](../api/grouppolicypresentationdecimaltextbox-list.md)|[groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) collection|Get a list of the [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) objects and their properties.|
|[Create groupPolicyPresentationDecimalTextBox](../api/grouppolicypresentationdecimaltextbox-create.md)|[groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md)|Create a new [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object.|
|[Get groupPolicyPresentationDecimalTextBox](../api/grouppolicypresentationdecimaltextbox-get.md)|[groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md)|Read the properties and relationships of a [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object.|
|[Update groupPolicyPresentationDecimalTextBox](../api/grouppolicypresentationdecimaltextbox-update.md)|[groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md)|Update the properties of a [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object.|
|[Delete groupPolicyPresentationDecimalTextBox](../api/grouppolicypresentationdecimaltextbox-delete.md)|None|Deletes a [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object.|
|[List definition](../api/grouppolicypresentationdecimaltextbox-list-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add definition](../api/grouppolicypresentationdecimaltextbox-post-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|Add definition by posting to the definition collection.|
|[Remove definition](../api/grouppolicypresentationdecimaltextbox-delete-definition.md)|None|Remove a [groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultValue|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|maxValue|Int64|**TODO: Add Description**|
|minValue|Int64|**TODO: Add Description**|
|required|Boolean|**TODO: Add Description**|
|spin|Boolean|**TODO: Add Description**|
|spinStep|Int64|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|definition|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|

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
  "spin": "Boolean",
  "spinStep": "Integer",
  "required": "Boolean",
  "minValue": "Integer",
  "maxValue": "Integer"
}
```

