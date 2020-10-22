---
title: "groupPolicyPresentationLongDecimalTextBox resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyPresentationLongDecimalTextBox resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [groupPolicyPresentation](../resources/grouppolicypresentation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyPresentationLongDecimalTextBoxes](../api/grouppolicypresentationlongdecimaltextbox-list.md)|[groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md) collection|Get a list of the [groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md) objects and their properties.|
|[Create groupPolicyPresentationLongDecimalTextBox](../api/grouppolicypresentationlongdecimaltextbox-create.md)|[groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md)|Create a new [groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md) object.|
|[Get groupPolicyPresentationLongDecimalTextBox](../api/grouppolicypresentationlongdecimaltextbox-get.md)|[groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md)|Read the properties and relationships of a [groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md) object.|
|[Update groupPolicyPresentationLongDecimalTextBox](../api/grouppolicypresentationlongdecimaltextbox-update.md)|[groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md)|Update the properties of a [groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md) object.|
|[Delete groupPolicyPresentationLongDecimalTextBox](../api/grouppolicypresentationlongdecimaltextbox-delete.md)|None|Deletes a [groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md) object.|
|[List definition](../api/grouppolicypresentationlongdecimaltextbox-list-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the definition navigation property.|
|[Add definition](../api/grouppolicypresentationlongdecimaltextbox-post-definition.md)|[groupPolicyDefinition](../resources/intune-grouppolicydefinition.md)|Add definition by posting to the definition collection.|
|[Remove definition](../api/grouppolicypresentationlongdecimaltextbox-delete-definition.md)|None|Remove a [groupPolicyDefinition](../resources/intune-grouppolicydefinition.md) object.|

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
  "@odata.type": "microsoft.graph.groupPolicyPresentationLongDecimalTextBox",
  "baseType": "microsoft.graph.groupPolicyPresentation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationLongDecimalTextBox",
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

